/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */

package org.akaza.openclinica.bean.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.akaza.openclinica.bean.submit.ItemBean;
import org.akaza.openclinica.dao.core.DAODigester;
import org.akaza.openclinica.dao.core.SQLFactory;
import org.akaza.openclinica.exception.OpenClinicaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <P>
 * The workhorse for instrument generation, the NewInstrumentBean holds some
 * information, but also updates and inserts rows in the database, using the
 * insertToDB method.
 * </p>
 * 
 * @author thickerson
 * @version 1.1 modified by jxu
 */
public class NewCRFBean extends Object implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -944286331687109855L;
	private DataSource ds;
    private DAODigester digester;

    private ArrayList<String> queries = new ArrayList<>();
    private ArrayList<String> errors = new ArrayList<>();
    private ArrayList<String> deleteQueries = new ArrayList<>();
    private ArrayList<String> deleteErrors = new ArrayList<>();
    private String htmlTable = null;
    private HashMap<String, String> itemNames = new HashMap<>();
    private HashMap<String, String> itemQueries = new HashMap<>();// queries to insert items
    private HashMap<String, String> crfVersions = new HashMap<>();
    private HashMap<String, ItemBean> items = new HashMap<>();// construct itemBeans and save them
    private HashMap<String, String> backupItemQueries = new HashMap<>();
    private int crfId = 0;
    private HashMap<String, String> itemGroupNames = new HashMap<>();
    // YW 08-22-2007, version name for this new CRF version
    private String versionName = "";

    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());

    public NewCRFBean(DataSource ds, int crfId) {
        this.ds = ds;
        String digesterName = SQLFactory.getInstance().DAO_CRF;
        digester = SQLFactory.getInstance().getDigester(digesterName);
        try {
            this.setItemNames(this.listItemNames(crfId));// crf id used here
            this.setItemGroupNames(this.listGroupNames(crfId));
            this.setCrfVersions(this.listVersionNames());
        } catch (Exception pe) {
            pe.printStackTrace();
            logger.debug("hit an exception in creating new crf bean;" + " empty item name list exists");
            this.setItemNames(new HashMap<>());
            this.setCrfVersions(new HashMap<>());
        }
    }

    public void setQueries(ArrayList<String> q) {
        this.queries = q;
    }

    public void setDeleteQueries(ArrayList<String> q) {
        this.deleteQueries = q;
    }

    public void setBackupItemQueries(HashMap<String, String> q) {
        this.backupItemQueries = q;
    }

    /*
     * public void resetConnection(Connection con) { this.con = con; }
     */
    public void setCrfId(int x) {
        this.crfId = x;
    }

    public int getCrfId() {
        return crfId;
    }

    /**
     * @return the itemGroupNames
     */
    public HashMap<String, String> getItemGroupNames() {
        return itemGroupNames;
    }

    /**
     * @param itemGroupNames
     *            the itemGroupNames to set
     */
    public void setItemGroupNames(HashMap<String, String> itemGroupNames) {
        this.itemGroupNames = itemGroupNames;
    }

    public void setErrors(ArrayList<String> e) {
        this.errors = e;
    }

    public void setDeleteErrors(ArrayList<String> e) {
        this.deleteErrors = e;
    }

    public void setHtmlTable(String h) {
        this.htmlTable = h;
    }

    public void setCrfVersions(HashMap<String, String> hm) {
        this.crfVersions = hm;
    }

    public ArrayList<String> getQueries() {
        return queries;
    }

    public ArrayList<String> getDeleteQueries() {
        return deleteQueries;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public ArrayList<String> getDeleteErrors() {
        return deleteErrors;
    }

    public String getHtmlTable() {
        return htmlTable;
    }

    public void setItemNames(HashMap<String, String> hm) {
        this.itemNames = hm;
    }

    public HashMap<String, String> getItemNames() {
        return itemNames;
    }

    public void setItems(HashMap<String, ItemBean> hm) {
        this.items = hm;
    }

    public HashMap<String, ItemBean> getItems() {
        return items;
    }

    public void setItemQueries(HashMap<String, String> hm) {
        this.itemQueries = hm;
    }

    public HashMap<String, String> getItemQueries() {
        return itemQueries;
    }

    public HashMap<String, String> getBackupItemQueries() {
        return backupItemQueries;
    }

    public HashMap<String, String> getCrfVersions() {
        return crfVersions;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(String vn) {
        this.versionName = vn;
    }

    public HashMap<String, String> listVersionNames() throws OpenClinicaException {
        /*
         * serves up a list of all crf names and versions, necessary for
         * checking for duplicates. Added by tbh, 7-25-03
         */
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        HashMap<String, String> returnMe = new HashMap<>();
        String sql = digester.getQuery("findVersionNamesForCRF");

        try {
            con = ds.getConnection();
            if (con.isClosed()) {
                throw new OpenClinicaException("Con is closed: NewCRFBean", "");
            }
            ps = con.prepareStatement(sql);
            ps.setInt(1, crfId);
            rs = ps.executeQuery();
            String key = null;
            String value = null;
            while (rs.next()) {
                key = rs.getString(1);
                value = rs.getString(2);
                returnMe.put(key, value);
            }
            return returnMe;
        } catch (SQLException se) {
            se.printStackTrace();
            throw new OpenClinicaException("SQLException: " + se.getMessage(), "");
        } catch (OpenClinicaException pe) {
            pe.printStackTrace();
            throw new OpenClinicaException("OpenClinicaException: " + pe.getMessage(), "");
        } finally {
            try {
                if (con != null)
                    con.close();
                if (ps != null)
                    ps.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new OpenClinicaException(e.getMessage(), "1");
            }

        }

    }

    public HashMap<String, String> listItemNames(int crfId) throws OpenClinicaException {
        /*
         * serves up a list of all item names in a CRF, necessary for checking
         * for duplicates and creating new items. Added by tbh, 7-25-03
         */
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        HashMap<String, String> returnMe = new HashMap<>();
        String sql = digester.getQuery("findItemNamesByCRF");
        logger.debug("crf id: *******" + crfId);
        try {
            con = ds.getConnection();
            if (con.isClosed()) {
                throw new OpenClinicaException("Con is closed: NewCRFBean", "");
            }
            ps = con.prepareStatement(sql);
            ps.setInt(1, crfId);
            rs = ps.executeQuery();
            String key = null;
            String value = null;
            while (rs.next()) {
                key = rs.getString(1);
                value = "1";
                returnMe.put(key, value);
            }
            return returnMe;
        } catch (SQLException se) {
            se.printStackTrace();
            throw new OpenClinicaException("SQLException: " + se.getMessage(), "");
        } catch (OpenClinicaException pe) {
            pe.printStackTrace();
            throw new OpenClinicaException("OpenClinicaException: " + pe.getMessage(), "");
        } finally {
            try {
                if (con != null)
                    con.close();
                if (ps != null)
                    ps.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new OpenClinicaException(e.getMessage(), "1");
            }

        }

    }

    public HashMap<String, String> listGroupNames(int crfId) throws OpenClinicaException {
        /*
         * serves up a list of all item group names in a CRF, necessary for
         * checking for duplicates and creating new items.
         */
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        HashMap<String, String> returnMe = new HashMap<>();
        String sql = digester.getQuery("findItemGroupNamesByCRF");
        try {
            con = ds.getConnection();
            if (con.isClosed()) {
                throw new OpenClinicaException("Con is closed: NewCRFBean", "");
            }
            ps = con.prepareStatement(sql);
            ps.setInt(1, crfId);
            rs = ps.executeQuery();
            String key = null;
            String value = null;
            while (rs.next()) {
                key = rs.getString(1);
                value = "1";
                returnMe.put(key, value);
            }
            return returnMe;
        } catch (SQLException se) {
            se.printStackTrace();
            throw new OpenClinicaException("SQLException: " + se.getMessage(), "");
        } catch (OpenClinicaException pe) {
            pe.printStackTrace();
            throw new OpenClinicaException("OpenClinicaException: " + pe.getMessage(), "");
        } finally {
            try {
                if (con != null)
                    con.close();
                if (ps != null)
                    ps.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new OpenClinicaException(e.getMessage(), "1");
            }

        }

    }

    public void insertToDB() throws OpenClinicaException {
        /*
         * insertToDB() will implement rollback functionality, throwing an error
         * will write the error to the setErrors and redirect to the error page,
         * rather than to the success page, tbh, 6-6-03
         */
        PreparedStatement s = null;
        PreparedStatement ps = null;
        PreparedStatement ps_update = null;
        Connection con = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ArrayList<String> error = new ArrayList<>();
        int count = 0;
        try {

            con = ds.getConnection();
            if (con.isClosed()) {
                String msg = "The connection to the database is not open.";
                error.add(msg);
                throw new OpenClinicaException("newCRFBean, insertToDB, connection not open", "1");
            }
            // commenting this out temporarily so that mistakes are not made,
            // tbh 8-13
            con.setAutoCommit(false);
            logger.debug("---start of item query generation here---");
            for(Map.Entry<String, String> ment : itemQueries.entrySet()) {
                String pQuery = (String) ment.getValue();
                s = con.prepareStatement(pQuery);
                logger.debug(pQuery);
                s.executeUpdate();
                s.close();
                // this might throw off the 'error' count, who can say?
                // of course, the queries are simple enough that maybe we'll
                // never throw
                // an error. Never say never though...
            }
            logger.debug("---pause in query generation, items---");
            // Iterator it = queries.iterator();
            // using iterator gets us out of order, and throws everything off.
            // try a for loop instead
            int last = queries.size();
            for (int th = 0; th < last; th++) {
                String query = (String) queries.get(th);// it.next();
                count = th;
                s = con.prepareStatement(query);
                s.executeUpdate();
                s.close();
                error.add(query);
            }
            // the below lines are temporarily commented out for instrument
            // upload, tbh 8-13
            con.commit();
            logger.debug("---end of query generation, all queries committed---");
            con.setAutoCommit(true);
            logger.debug("---end of query generation, autocommit set to true---");
            // at this point we check to see if there is a active version, if
            // not, set THIS
            // to be the active version, tbh, 8-29
            if (crfId != 0) {
                String sql = digester.getQuery("findDefaultVersion");
                logger.debug("findDefaultVersion [" + sql + "]");
                ps = con.prepareStatement(sql);
                ps.setInt(1, crfId);
                rs = ps.executeQuery();
                if (rs.next()) {
                    // do nothing on purpose? no, we check to see if it was null
                    // first
                    rs.getInt(1);
                    if (rs.wasNull()) {

                        String sql2 = digester.getQuery("updateDefaultVersion");
                        ps_update = con.prepareStatement(sql2);
                        ps_update.setInt(1, crfId);
                        ps_update.setInt(2, crfId);
                        if (ps_update.executeUpdate() != 1) {
                            throw new OpenClinicaException("error, updated more than one row, smart assigner part of insertToDB, NewCRFBean", "");
                        }
                        // }
                        // rs2.close();
                    }
                }
                rs.close();
                ps.close();
            } // hairy code--but it will serve as a 'smart assigner' to set a
              // version active if
              // it's the first version entered, tbh, 8-29
        } catch (SQLException se) {
            se.printStackTrace();
            try {
                con.rollback();
                logger.debug("Error detected, rollback " + se.getMessage());
                String msg2 = "The following error was returned from the database: " + se.getMessage() + " using the following query: " + queries.get(count);
                error.add(msg2);
                this.setErrors(error);
                con.setAutoCommit(true);
                throw new OpenClinicaException("", "");
            } catch (SQLException seq) {
                seq.printStackTrace();
                logger.debug("Error within rollback " + seq.getMessage());
                String msg2 = "The following error was returned from the database: " + seq.getMessage();
                error.add(msg2);
                this.setErrors(error);
                throw new OpenClinicaException("", "");
            }
        } catch (OpenClinicaException pe) {
            pe.printStackTrace();
            try {
                con.rollback();
                logger.debug("I3LUNG Error detected, rollback " + pe.getMessage());
                String msg2 = "The following error was returned from the application: " + pe.getMessage();
                error.add(msg2);
                this.setErrors(error);
                con.setAutoCommit(true);
                throw new OpenClinicaException("", "");
            } catch (SQLException seq) {
                seq.printStackTrace();
                logger.debug("I3LUNG Error within rollback " + seq.getMessage());
                String msg2 = "The following error was returned from the application: " + seq.getMessage();
                error.add(msg2);
                this.setErrors(error);
                throw new OpenClinicaException("", "");
            }

        } finally {
            try {
                if (con != null)
                    con.close();
                if (s != null)
                    s.close();
                if (ps != null)
                    ps.close();
                if (ps_update != null)
                	ps.close();
                if (rs != null)
                    rs.close();
                if (rs2 != null)
                    rs2.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new OpenClinicaException(e.getMessage(), "1");
            }

        }

    }

    public void deleteFromDB() throws OpenClinicaException {
        PreparedStatement s = null;
        Connection con = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ArrayList<String> error = new ArrayList<>();
        int count = 0;
        try {

            con = ds.getConnection();
            if (con.isClosed()) {
                String msg = "The connection to the database is not open.";
                error.add(msg);
                throw new OpenClinicaException("newCRFBean, deleteFromDB, connection not open", "1");
            }
            // commenting this out temporarily so that mistakes are not made
            con.setAutoCommit(false);

            // delete version and related info
            int last = deleteQueries.size();
            for (int th = 0; th < last; th++) {
                String query = deleteQueries.get(th);// it.next();
                count = th;
                s = con.prepareStatement(query);
                // logger.info(query);
                s.executeUpdate();
                s.close();
                error.add(query);
            }
            /*
             * //now need to insert all items again-no need to do this
             * 04/12/2005 any more Set mySet = backupItemQueries.entrySet();
             * logger.info("---start of item generation here---"); for (Iterator
             * itvl = mySet.iterator(); itvl.hasNext(); ) { Map.Entry ment =
             * (Map.Entry)itvl.next(); String pQuery = (String)ment.getValue();
             * s = con.createStatement(); //logger.info(pQuery);
             * s.executeUpdate(pQuery); s.close(); } logger.info("---pause in
             * query generation, items---");
             */

            con.commit();
            logger.debug("---end of delete query generation, all queries committed---");
            con.setAutoCommit(true);
            logger.debug("---end of delete query generation, autocommit set to true---");

        } catch (SQLException se) {
            se.printStackTrace();
            try {
                con.rollback();
                logger.debug("Error detected, rollback " + se.getMessage());
                String msg2 = "The following error was returned from the database: " + se.getMessage() + " using the following query: "
                        + deleteQueries.get(count);
                error.add(msg2);
                this.setDeleteErrors(error);
                con.setAutoCommit(true);
                throw new OpenClinicaException("", "");
            } catch (SQLException seq) {
                seq.printStackTrace();
                logger.debug("Error within rollback " + seq.getMessage());
                String msg2 = "The following error was returned from the database: " + seq.getMessage();
                error.add(msg2);
                this.setDeleteErrors(error);
                throw new OpenClinicaException("", "");
            }
        } catch (OpenClinicaException pe) {
            pe.printStackTrace();
            try {
                con.rollback();
                logger.debug("I3LUNG Error detected, rollback " + pe.getMessage());
                String msg2 = "The following error was returned from the application: " + pe.getMessage();
                error.add(msg2);
                this.setDeleteErrors(error);
                con.setAutoCommit(true);
                throw new OpenClinicaException("", "");
            } catch (SQLException seq) {
                seq.printStackTrace();
                logger.debug("I3LUNG Error within rollback " + seq.getMessage());
                String msg2 = "The following error was returned from the application: " + seq.getMessage();
                error.add(msg2);
                this.setDeleteErrors(error);
                throw new OpenClinicaException("", "");
            }

        } finally {
            try {
                if (con != null)
                    con.close();
                if (s != null)
                    s.close();
                if (rs != null)
                    rs.close();
                if (rs2 != null)
                    rs2.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new OpenClinicaException(e.getMessage(), "1");
            }

        }
    }

    /*
     * this function is used for replace CRF version only
     * it runs all delete and insert statements in one batch
     */

    public synchronized void deleteInsertToDB() throws OpenClinicaException {

        PreparedStatement statement = null;
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement prep_statement = null;
        PreparedStatement update_statement = null;
        ArrayList<String> error = new ArrayList<String>();
        String cur_query = null;
        try {
            con = ds.getConnection();
            if (con.isClosed()) {
                error.add("The connection to the database is not open.");
                throw new OpenClinicaException("newCRFBean, deleteInsertToDB, connection not open", "1");
            }
            con.setAutoCommit(false);

            // delete version and related info
            for (String dQuery : deleteQueries) {
                logger.debug(dQuery);
                cur_query = dQuery;
                if (cur_query == null || cur_query.trim().length() < 1) {
                    continue;
                }

                statement = con.prepareStatement(dQuery);
                statement.executeUpdate();
                statement.close();

            }
            logger.debug("deleteInsertToDB function ---end of delete query generation, all queries committed---");
            logger.debug("deleteInsertToDB function ---start of item query generation here---");

            for (String pQuery : (Collection<String>) itemQueries.values()) {
                logger.debug(pQuery);
                cur_query = pQuery;
                if (cur_query == null || cur_query.trim().length() < 1) {
                    continue;
                }
                statement = con.prepareStatement(pQuery);
                statement.executeUpdate();
                statement.close();
            }

            logger.debug("deleteInsertToDB function  ---pause in query generation, items---");
            for (String crQuery : (ArrayList<String>) queries) {
                logger.debug(crQuery);
                cur_query = crQuery;
                if (cur_query == null || cur_query.trim().length() < 1) {
                    continue;
                }

                statement = con.prepareStatement(crQuery);
                statement.executeUpdate();
                statement.close();
            }
            // the below lines are temporarily commented out for instrument
            // upload, tbh 8-13
            con.commit();
            logger.debug("---end of query generation, all queries committed---");
            con.setAutoCommit(true);
            // at this point we check to see if there is a active version, if
            // not, set THIS
            // to be the active version, tbh, 8-29
            if (crfId != 0) {
                String sql = digester.getQuery("findDefaultVersion");
                logger.debug("findDefaultVersion [" + sql + "]");
                prep_statement = con.prepareStatement(sql);
                prep_statement.setInt(1, crfId);
                rs = prep_statement.executeQuery();
                if (rs.next()) {
                    // do nothing on purpose? no, we check to see if it was null
                    // first
                    if (rs.wasNull()) {
                        String sql2 = digester.getQuery("updateDefaultVersion");
                        update_statement = con.prepareStatement(sql2);
                        update_statement.setInt(1, crfId);
                        update_statement.setInt(2, crfId);
                        if (update_statement.executeUpdate() != 1) {
                            throw new OpenClinicaException("error, updated more than one row, smart assigner part of insertToDB, NewCRFBean", "");
                        }
                    }
                }
                rs.close();
                prep_statement.close();
            }
        } catch (SQLException se) {
            logger.error(se.getMessage());
            try {
                con.rollback();
                logger.error("Error detected, rollback " + se.getMessage());
                String msg2 = "The following error was returned from the database: " + se.getMessage() + " using the following query: " + cur_query;
                error.add(msg2);
                throw new OpenClinicaException("", "");
            } catch (SQLException seq) {
                error.add("The following error was returned from the database: " + seq.getMessage());

                logger.error("Error within rollback " + seq.getMessage());
                throw new OpenClinicaException("", "");
            }
        } catch (OpenClinicaException pe) {
            pe.printStackTrace();
            try {
                error.add("The following error was returned from the application: " + pe.getMessage());
                con.rollback();
                logger.error("I3LUNG Error detected, rollback " + pe.getMessage());
                throw new OpenClinicaException("", "");
            } catch (SQLException seq) {
                error.add("The following error was returned from the application: " + seq.getMessage());

                logger.error("I3LUNG Error within rollback " + seq.getMessage());
                throw new OpenClinicaException("", "");
            }

        } finally {

            try {
                if (con != null) {
                    con.setAutoCommit(true);
                }
            } catch (SQLException sac) {
                ;
            }
            try {
                if (con != null)
                    con.close();
                if (statement != null)
                    statement.close();
                if (prep_statement != null)
                    prep_statement.close();
                if (update_statement != null)
                	update_statement.close();
                if (rs != null)
                    rs.close();

            } catch (SQLException e) {
                error.add("The following error was returned from the application: " + e.getMessage());

                logger.error(e.getMessage());
                throw new OpenClinicaException(e.getMessage(), "1");
            }
            this.setErrors(error);
        }
    }
}