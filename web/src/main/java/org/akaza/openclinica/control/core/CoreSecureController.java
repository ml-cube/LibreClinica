/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.control.core;

import static org.akaza.openclinica.core.util.ClassCastHelper.getAttributeAsList;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.akaza.openclinica.bean.core.AuditableEntityBean;
import org.akaza.openclinica.bean.core.Role;
import org.akaza.openclinica.bean.core.Status;
import org.akaza.openclinica.bean.login.StudyUserRoleBean;
import org.akaza.openclinica.bean.login.UserAccountBean;
import org.akaza.openclinica.bean.managestudy.StudyBean;
import org.akaza.openclinica.bean.managestudy.StudyEventDefinitionBean;
import org.akaza.openclinica.bean.managestudy.StudyGroupBean;
import org.akaza.openclinica.bean.managestudy.StudyGroupClassBean;
import org.akaza.openclinica.bean.service.StudyParamsConfig;
import org.akaza.openclinica.bean.submit.EventCRFBean;
import org.akaza.openclinica.control.SpringServletAccess;
import org.akaza.openclinica.core.CRFLocker;
import org.akaza.openclinica.core.EmailEngine;
import org.akaza.openclinica.core.SessionManager;
import org.akaza.openclinica.dao.core.AuditableEntityDAO;
import org.akaza.openclinica.dao.managestudy.StudyDAO;
import org.akaza.openclinica.dao.managestudy.StudyEventDefinitionDAO;
import org.akaza.openclinica.dao.managestudy.StudyGroupClassDAO;
import org.akaza.openclinica.dao.managestudy.StudyGroupDAO;
import org.akaza.openclinica.dao.service.StudyConfigService;
import org.akaza.openclinica.dao.service.StudyParameterValueDAO;
import org.akaza.openclinica.exception.OpenClinicaException;
import org.akaza.openclinica.i18n.core.LocaleResolver;
import org.akaza.openclinica.i18n.util.ResourceBundleProvider;
import org.akaza.openclinica.view.Page;
import org.akaza.openclinica.view.StudyInfoPanel;
import org.akaza.openclinica.view.StudyInfoPanelLine;
import org.akaza.openclinica.web.InconsistentStateException;
import org.akaza.openclinica.web.InsufficientPermissionException;
import org.akaza.openclinica.web.SQLInitServlet;
import org.akaza.openclinica.web.bean.EntityBeanTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
/**
 * Abstract class for creating a controller servlet and extending capabilities of SecureController. However, not using the SingleThreadModel.
 * @author jnyayapathi
 *
 */
public abstract class CoreSecureController extends HttpServlet {


    /**
	 * 
	 */
	private static final long serialVersionUID = -4705456347136667876L;

	private static final Logger LOGGER = LoggerFactory.getLogger(CoreSecureController.class);

    protected HashMap<String, ArrayList<String>> errors = new HashMap<>();

    public static ResourceBundle resadmin, resaudit, resexception, resformat, respage, resterm, restext, resword, resworkflow;

    protected StudyInfoPanel panel = new StudyInfoPanel();

    public static final String PAGE_MESSAGE = "pageMessages";// for showing
    // page
    // wide message

    public static final String INPUT_MESSAGES = "formMessages"; // for showing
    // input-specific
    // messages

    public static final String PRESET_VALUES = "presetValues"; // for setting
    // preset values

    public static final String ADMIN_SERVLET_CODE = "admin";

    public static final String BEAN_TABLE = "table";

    public static final String STUDY_INFO_PANEL = "panel"; // for setting the
    // side panel

    public static final String BREADCRUMB_TRAIL = "breadcrumbs";

    public static final String POP_UP_URL = "popUpURL";

    // public static String DATASET_HOME_DIR = "OpenClinica";

    // Use this variable as the key for the support url
    public static final String SUPPORT_URL = "supportURL";

    public static final String MODULE = "module";// to determine which module

    private CRFLocker crfLocker;

    private DataSource dataSource = null;

    // user is in

    // for setting the breadcrumb trail
    // protected HashMap errors = new HashMap();//error messages on the page

    protected void addPageMessage(String message, HttpServletRequest request) {
        ArrayList<String> pageMessages = getAttributeAsList(request, PAGE_MESSAGE, String.class);

        if (pageMessages == null) {
            pageMessages = new ArrayList<>();
        }

        pageMessages.add(message);
        LOGGER.debug(message);
        request.setAttribute(PAGE_MESSAGE, pageMessages);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        ServletContext context = getServletContext();
        ApplicationContext appCtx = SpringServletAccess.getApplicationContext(context);
        SessionManager sm = new SessionManager(appCtx);
        dataSource = sm.getDataSource();
        this.crfLocker = appCtx.getBean(CRFLocker.class);
    }

    // @pgawade: 02Jan2012: Changed the scope for getter to protected so it will
    // be available in child classes
    protected DataSource getDataSource() {
        return dataSource;
    }

    protected void resetPanel() {
        panel.reset();
    }

    protected void setToPanel(String title, String info, HttpServletRequest request) {
        if (panel.isOrderedData()) {
            ArrayList<StudyInfoPanelLine> data = panel.getUserOrderedData();
            data.add(new StudyInfoPanelLine(title, info));
            panel.setUserOrderedData(data);
        } else {
            panel.setData(title, info);
        }
        request.setAttribute(STUDY_INFO_PANEL, panel);
    }

    protected void setInputMessages(HashMap<String, ArrayList<String>> messages, HttpServletRequest request) {
        request.setAttribute(INPUT_MESSAGES, messages);
    }

    protected void setPresetValues(HashMap<String, Object> presetValues, HttpServletRequest request) {
        request.setAttribute(PRESET_VALUES, presetValues);
    }

    protected void setTable(EntityBeanTable table, HttpServletRequest request) {
        request.setAttribute(BEAN_TABLE, table);
    }

    @Override
    public void init() throws ServletException {
    	// TODO empty method
    }

    /**
     * Process request
     *
     * @param request
     *            TODO
     * @param response
     *            TODO
     *
     * @throws Exception
     */
    protected abstract void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception;

    protected abstract void mayProceed(HttpServletRequest request, HttpServletResponse response) throws InsufficientPermissionException;

    public static final String USER_BEAN_NAME = "userBean";

    public void passwdTimeOut(HttpServletRequest request, HttpServletResponse response, UserAccountBean ub) {
        Date lastChangeDate = ub.getPasswdTimestamp();
        if (!ub.isLdapUser() && lastChangeDate == null) {
            addPageMessage(respage.getString("welcome") + " " + ub.getFirstName() + " " + ub.getLastName() + ". " + respage.getString("password_set"), request);
            // + "<a href=\"UpdateProfile\">" +
            // respage.getString("user_profile") + " </a>");
            int pwdChangeRequired = new Integer(SQLInitServlet.getField("change_passwd_required")).intValue();
            if (pwdChangeRequired == 1) {
                request.setAttribute("mustChangePass", "yes");
                forwardPage(Page.RESET_PASSWORD, request, response);
            }
        }
    }

    private void unlockCRFOnError(HttpServletRequest req) {
        if (req != null) {
            EventCRFBean eventCrf = (EventCRFBean) req.getAttribute("event");
            UserAccountBean ub = (UserAccountBean) req.getSession().getAttribute(USER_BEAN_NAME);

            if (eventCrf != null && crfLocker.isLocked(eventCrf.getId())) {
                if (ub != null && ub.getId() == crfLocker.getLockOwner(eventCrf.getId())) crfLocker.unlock(eventCrf.getId());
                else if (ub == null) crfLocker.unlock(eventCrf.getId());
            }
        }
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws OpenClinicaException, UnsupportedEncodingException {

        request.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Encoding", "gzip");

        HttpSession session = request.getSession();
        // BWP >> 1/8/2008
        try {
            // YW 10-03-2007 <<
            session.setMaxInactiveInterval(Integer.parseInt(SQLInitServlet.getField("max_inactive_interval")));
            // YW >>
        } catch (NumberFormatException nfe) {
            // BWP>>3600 is the datainfo.properties maxInactiveInterval on
            // 1/8/2008
            session.setMaxInactiveInterval(3600);
        }

        // If the session already has a value with key SUPPORT_URL don't reset
        if (session.getAttribute(SUPPORT_URL) == null) {
            session.setAttribute(SUPPORT_URL, SQLInitServlet.getSupportURL());
        }

        UserAccountBean ub = (UserAccountBean) session.getAttribute(USER_BEAN_NAME);
        StudyBean currentStudy = (StudyBean) session.getAttribute("study");
        StudyUserRoleBean currentRole = (StudyUserRoleBean) session.getAttribute("userRole");

        // Set current language preferences
        Locale locale = LocaleResolver.getLocale(request);
        ResourceBundleProvider.updateLocale(locale);
        resadmin = ResourceBundleProvider.getAdminBundle(locale);
        resaudit = ResourceBundleProvider.getAuditEventsBundle(locale);
        resexception = ResourceBundleProvider.getExceptionsBundle(locale);
        resformat = ResourceBundleProvider.getFormatBundle(locale);
        restext = ResourceBundleProvider.getTextsBundle(locale);
        resterm = ResourceBundleProvider.getTermsBundle(locale);
        resword = ResourceBundleProvider.getWordsBundle(locale);
        respage = ResourceBundleProvider.getPageMessagesBundle(locale);
        resworkflow = ResourceBundleProvider.getWorkflowBundle(locale);

        try {
            String userName = request.getRemoteUser();
            ServletContext context = getServletContext();
            // BWP 1/8/08<< the sm variable may already be set with a mock
            // object,
            // from the perspective of
            // JUnit servlets tests
            /*
             * if(sm==null && (!StringUtil.isBlank(userName))) {//check if user
             * logged in, then create a new sessionmanger to get ub //create a
             * new sm in order to get a new ub object sm = new
             * SessionManager(ub, userName); }
             */
            // BWP 01/08 >>
            // sm = new SessionManager(ub, userName);
            SessionManager sm = new SessionManager(ub, userName, SpringServletAccess.getApplicationContext(context));
            ub = sm.getUserBean();

            request.getSession().setAttribute("sm", sm);
            session.setAttribute("userBean", ub);

            StudyDAO sdao = new StudyDAO(getDataSource());
            if (currentStudy == null || currentStudy.getId() <= 0) {
                if (ub.getId() > 0 && ub.getActiveStudyId() > 0) {
                    StudyParameterValueDAO spvdao = new StudyParameterValueDAO(getDataSource());
                    currentStudy = (StudyBean) sdao.findByPK(ub.getActiveStudyId());

                    ArrayList<StudyParamsConfig> studyParameters = spvdao.findParamConfigByStudy(currentStudy);

                    currentStudy.setStudyParameters(studyParameters);

                    StudyConfigService scs = new StudyConfigService(getDataSource());
                    if (currentStudy.getParentStudyId() <= 0) {// top study
                        scs.setParametersForStudy(currentStudy);

                    } else {
                        // YW <<
                        currentStudy.setParentStudyName(((StudyBean) sdao.findByPK(currentStudy.getParentStudyId())).getName());
                        // YW >>
                        scs.setParametersForSite(currentStudy);
                    }

                    // set up the panel here, tbh
                    panel.reset();
                    /*
                     * panel.setData("Study", currentStudy.getName());
                     * panel.setData("Summary", currentStudy.getSummary());
                     * panel.setData("Start Date",
                     * sdf.format(currentStudy.getDatePlannedStart()));
                     * panel.setData("End Date",
                     * sdf.format(currentStudy.getDatePlannedEnd()));
                     * panel.setData("Principal Investigator",
                     * currentStudy.getPrincipalInvestigator());
                     */
                    session.setAttribute(STUDY_INFO_PANEL, panel);
                } else {
                    currentStudy = new StudyBean();
                }
                session.setAttribute("study", currentStudy);// The above line is moved here since currentstudy's value is set in else block and could change
            } else if (currentStudy.getId() > 0) {
                // YW 06-20-2007<< set site's parentstudy name when site is
                // restored
                if (currentStudy.getParentStudyId() > 0) {
                    currentStudy.setParentStudyName(((StudyBean) sdao.findByPK(currentStudy.getParentStudyId())).getName());
                }
                // YW >>
            }


            if (currentStudy.getParentStudyId() > 0) {
                /*
                 * The Role decription will be set depending on whether the user
                 * logged in at study lever or site level. issue-2422
                 */
                ArrayList<Role> roles = Role.toArrayList();
                for (Role role : roles) {
                    switch (role.getId()) {
                        case 2:
                            role.setDescription("site_Study_Coordinator");
                            break;
                        case 3:
                            role.setDescription("site_Study_Director");
                            break;
                        case 4:
                            role.setDescription("site_investigator");
                            break;
                        case 5:
                            role.setDescription("site_Data_Entry_Person");
                            break;
                        case 6:
                            role.setDescription("site_monitor");
                            break;
                        case 7:
                            role.setDescription("site_Data_Entry_Person2");
                            break;
                        default:
                            // logger.info("No role matched when setting role description");
                    }
                }
            } else {
                /*
                 * If the current study is a site, we will change the role
                 * description. issue-2422
                 */
                ArrayList<Role> roles = Role.toArrayList();
                for (Role role : roles) {
                    switch (role.getId()) {
                        case 2:
                            role.setDescription("Study_Coordinator");
                            break;
                        case 3:
                            role.setDescription("Study_Director");
                            break;
                        case 4:
                            role.setDescription("Investigator");
                            break;
                        case 5:
                            role.setDescription("Data_Entry_Person");
                            break;
                        case 6:
                            role.setDescription("Monitor");
                            break;
                        default:
                            // logger.info("No role matched when setting role description");
                    }
                }
            }

            if (currentRole == null || currentRole.getId() <= 0) {
                // if (ub.getId() > 0 && currentStudy.getId() > 0) {
                // if current study has been "removed", current role will be
                // kept as "invalid" -- YW 06-21-2007
                if (ub.getId() > 0 && currentStudy.getId() > 0 && !currentStudy.getStatus().getName().equals("removed")) {
                    currentRole = ub.getRoleByStudy(currentStudy.getId());
                    if (currentStudy.getParentStudyId() > 0) {
                        // Checking if currentStudy has been removed or not will
                        // ge good enough -- YW 10-17-2007
                        StudyUserRoleBean roleInParent = ub.getRoleByStudy(currentStudy.getParentStudyId());
                        // inherited role from parent study, pick the higher
                        // role
                        currentRole.setRole(Role.max(currentRole.getRole(), roleInParent.getRole()));
                    }
                    // logger.info("currentRole:" + currentRole.getRoleName());
                } else {
                    currentRole = new StudyUserRoleBean();
                }
                session.setAttribute("userRole", currentRole);
            }
            // YW << For the case that current role is not "invalid" but current
            // active study has been removed.
            else if (currentRole.getId() > 0 && (currentStudy.getStatus().equals(Status.DELETED) || currentStudy.getStatus().equals(Status.AUTO_DELETED))) {
                currentRole.setRole(Role.INVALID);
                currentRole.setStatus(Status.DELETED);
                session.setAttribute("userRole", currentRole);
            }
            // YW 06-19-2007 >>

            request.setAttribute("isAdminServlet", getAdminServlet());
            // JN:Commented out
            // this.request = request;
            // this.response = response;

            // java.util.Enumeration en_session = session.getAttributeNames();
            // java.util.Enumeration en_request = request.getAttributeNames();
            //
            // // logging added to find problems with adding subjects, tbh
            // 102007
            // String ss_names = "session names: ";
            // while (en_session.hasMoreElements()) {
            // ss_names += " - " + en_session.nextElement();
            // }
            // logger.info(ss_names);
            //
            // // also added tbh, 102007
            // String rq_names = "request names: ";
            // while (en_request.hasMoreElements()) {
            // rq_names += " - " + en_request.nextElement();
            // }
            // logger.info(rq_names);
            if (!request.getRequestURI().endsWith("ResetPassword")) {
                passwdTimeOut(request, response, ub);
            }
            mayProceed(request, response);
            //   pingJobServer(request);
            processRequest(request, response);
        } catch (InconsistentStateException ise) {
            LOGGER.warn("InconsistentStateException: org.akaza.openclinica.control.CoreSecureController: ", ise);
            unlockCRFOnError(request);
            addPageMessage(ise.getOpenClinicaMessage(), request);
            forwardPage(ise.getGoTo(), request, response);
        } catch (InsufficientPermissionException ipe) {
            LOGGER.warn("InsufficientPermissionException: org.akaza.openclinica.control.CoreSecureController: ", ipe);
            unlockCRFOnError(request);
            // addPageMessage(ipe.getOpenClinicaMessage());
            forwardPage(ipe.getGoTo(), request, response);
        } catch (Exception e) {
            LOGGER.error("Error processing request", e);
            unlockCRFOnError(request);
            forwardPage(Page.ERROR, request, response);
        }

    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws java.io.IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        try {
            LOGGER.debug("GET Request");
            process(request, response);
        } catch (Exception e) {
            LOGGER.error("Error processing request", e);
            unlockCRFOnError(request);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request
     *            servlet request
     * @param response
     *            servlet response
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        try {
            LOGGER.debug("POST Request");
            process(request, response);
        } catch (Exception e) {
            LOGGER.error("Error processing request", e);
            unlockCRFOnError(request);
        }
    }

    /**
     * <P>
     * Forwards to a jsp page. Additions to the forwardPage() method involve
     * checking the session for the bread crumb trail and setting it, if
     * necessary. Setting it here allows the developer to only have to update
     * the <code>BreadcrumbTrail</code> class.
     *
     * @param jspPage
     *            The page to go to.
     * @param checkTrail
     *            The command to check for, and set a trail in the session.
     * @param request
     *            TODO
     * @param response
     *            TODO
     */
    protected void forwardPage(Page jspPage, boolean checkTrail, HttpServletRequest request, HttpServletResponse response) {
        Page page1 = Page.valueOf(jspPage.name());
        String temp;

        // YW 10-03-2007 <<
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", -1);
        response.setHeader("Cache-Control", "no-store");
        // YW >>

        if (request.getAttribute(POP_UP_URL) == null) {
            request.setAttribute(POP_UP_URL, "");
        }

        try {
            // Added 01/19/2005 for breadcrumbs, tbh
        /*    if (checkTrail) {
                BreadcrumbTrail bt = new BreadcrumbTrail();
                if (session != null) {// added bu jxu, fixed bug for log out
                    ArrayList trail = (ArrayList) session.getAttribute("trail");
                    if (trail == null) {
                        trail = bt.generateTrail(jspPage, request);
                    } else {
                        bt.setTrail(trail);
                        trail = bt.generateTrail(jspPage, request);
                    }
                    session.setAttribute("trail", trail);
                    panel = (StudyInfoPanel) session.getAttribute(STUDY_INFO_PANEL);
                    if (panel == null) {
                        panel = new StudyInfoPanel();
                        panel.setData(jspPage, session, request);
                    } else {
                        panel.setData(jspPage, session, request);
                    }

                    session.setAttribute(STUDY_INFO_PANEL, panel);
                }
                // we are also using checkTrail to update the panel, tbh
                // 01/31/2005
            }*/
            // above added 01/19/2005, tbh
            temp = page1.getFileName();
            getServletContext().getRequestDispatcher(temp).forward(request, response);

            // response.sendRedirect(request.getContextPath()+jspPage.getFileName());
        } catch (Exception se) {
            /*if ("View Notes".equals(jspPage.getTitle())) {
                String viewNotesURL = jspPage.getFileName();
                if (viewNotesURL != null && viewNotesURL.contains("listNotes_p_=")) {
                    String[] ps = viewNotesURL.split("listNotes_p_=");
                    String t = ps[1].split("&")[0];
                    int p = t.length() > 0 ? Integer.valueOf(t).intValue() : -1;
                    if (p > 1) {
                        viewNotesURL = viewNotesURL.replace("listNotes_p_=" + p, "listNotes_p_=" + (p - 1));
                        //forwardPage(Page.setNewPage(viewNotesURL, "View Notes"), request, response);
                        try {
							getServletContext().getRequestDispatcher(viewNotesURL).forward(request, response);
						} catch (ServletException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                    } else if (p <= 0) {
                        try {
							forwardPage(Page.VIEW_DISCREPANCY_NOTES_IN_STUDY, request, response);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                    }
                }
            }
         */
            LOGGER.error(se.getMessage(),se);
        }
        finally {
            page1 = null;
            jspPage = null;
            temp = null;
        }

    }

    protected void forwardPage(Page jspPage, HttpServletRequest request, HttpServletResponse response) {
        this.forwardPage(jspPage, true, request, response);
    }

    /**
     * @return A blank String if this servlet is not an Administer System
     *         servlet. CoreSecureController.ADMIN_SERVLET_CODE otherwise.
     */
    protected String getAdminServlet() {
        return "";
    }

    protected void setPopUpURL(String url, HttpServletRequest request) {
        if (url != null && request != null) {
            request.setAttribute(POP_UP_URL, url);
            LOGGER.info("just set pop up url: " + url);
        }
    }

    /**
     * <p>
     * Check if an entity with passed entity id is included in studies of
     * current user.
     * </p>
     *
     * <p>
     * Note: This method called AuditableEntityDAO.findByPKAndStudy which
     * required "The subclass must define findByPKAndStudyName before calling
     * this method. Otherwise an inactive AuditableEntityBean will be returned."
     * </p>
     *
     * @author ywang 10-18-2007
     * @param entityId
     *            int
     * @param userName
     *            String
     * @param adao
     *            AuditableEntityDAO
     * @param ds
     *            javax.sql.DataSource
     */
    protected boolean entityIncluded(int entityId, String userName, AuditableEntityDAO<? extends AuditableEntityBean> adao, DataSource ds) {
        StudyDAO sdao = new StudyDAO(ds);
        ArrayList<StudyBean> studies = sdao.findAllByUserNotRemoved(userName);
        for (int i = 0; i < studies.size(); ++i) {
        	AuditableEntityBean bean = adao.findByPKAndStudy(entityId, studies.get(i)); 
            if (bean != null && bean.getId() > 0) {
                return true;
            }
            // Here follow the current logic - study subjects at sites level are
            // visible to parent studies.
            if (studies.get(i).getParentStudyId() <= 0) {
                ArrayList<StudyBean> sites = (ArrayList<StudyBean>) sdao.findAllByParent(studies.get(i).getId());
                if (sites.size() > 0) {
                    for (int j = 0; j < sites.size(); ++j) {
                        if (adao.findByPKAndStudy(entityId, sites.get(j)).getId() > 0) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public String getRequestURLMinusServletPath(HttpServletRequest request) {
        String requestURLMinusServletPath = request.getRequestURL().toString().replaceAll(request.getServletPath(), "");
        return requestURLMinusServletPath;
    }

    public String getHostPath(HttpServletRequest request) {
        String requestURLMinusServletPath = getRequestURLMinusServletPath(request);
        return requestURLMinusServletPath.substring(0, requestURLMinusServletPath.lastIndexOf("/"));
    }

    public String getContextPath(HttpServletRequest request) {
        String contextPath = request.getContextPath().replaceAll("/", "");
        return contextPath;
    }

    /*
     * To check if the current study is LOCKED
     */
    public void checkStudyLocked(Page page, String message, HttpServletRequest request, HttpServletResponse response) {
        StudyBean currentStudy = (StudyBean) request.getSession().getAttribute("study");
        if (currentStudy.getStatus().equals(Status.LOCKED)) {
            addPageMessage(message, request);
            forwardPage(page, request, response);
        }
    }

    public void checkStudyLocked(String url, String message, HttpServletRequest request, HttpServletResponse response) {

        StudyBean currentStudy = (StudyBean) request.getSession().getAttribute("study");
        try {
            if (currentStudy.getStatus().equals(Status.LOCKED)) {
                addPageMessage(message, request);
                response.sendRedirect(url);
            }
        } catch (Exception ex) {
            LOGGER.error("Study is not present: ", ex);
        }
    }

    /*
     * To check if the current study is FROZEN
     */

    public void checkStudyFrozen(Page page, String message, HttpServletRequest request, HttpServletResponse response) {
        StudyBean currentStudy = (StudyBean) request.getSession().getAttribute("study");
        if (currentStudy.getStatus().equals(Status.FROZEN)) {
            addPageMessage(message, request);
            forwardPage(page, request, response);
        }
    }

    public void checkStudyFrozen(String url, String message, HttpServletRequest request, HttpServletResponse response) {
        StudyBean currentStudy = (StudyBean) request.getSession().getAttribute("study");
        try {
            if (currentStudy.getStatus().equals(Status.FROZEN)) {
                addPageMessage(message, request);
                response.sendRedirect(url);
            }
        } catch (Exception ex) {
            LOGGER.error("Study is not present: ", ex);
        }

    }

    public ArrayList<StudyEventDefinitionBean> getEventDefinitionsByCurrentStudy(HttpServletRequest request) {
        StudyDAO studyDAO = new StudyDAO(getDataSource());
        StudyEventDefinitionDAO studyEventDefinitionDAO = new StudyEventDefinitionDAO(getDataSource());
        StudyBean currentStudy = (StudyBean) request.getSession().getAttribute("study");
        int parentStudyId = currentStudy.getParentStudyId();
        ArrayList<StudyEventDefinitionBean> allDefs = new ArrayList<>();
        if (parentStudyId > 0) {
            StudyBean parentStudy = (StudyBean) studyDAO.findByPK(parentStudyId);
            allDefs = studyEventDefinitionDAO.findAllActiveByStudy(parentStudy);
        } else {
            parentStudyId = currentStudy.getId();
            allDefs = studyEventDefinitionDAO.findAllActiveByStudy(currentStudy);
        }
        return allDefs;
    }

    public ArrayList<StudyGroupClassBean> getStudyGroupClassesByCurrentStudy(HttpServletRequest request) {
        StudyDAO studyDAO = new StudyDAO(getDataSource());
        StudyGroupClassDAO studyGroupClassDAO = new StudyGroupClassDAO(getDataSource());
        StudyGroupDAO studyGroupDAO = new StudyGroupDAO(getDataSource());
        StudyBean currentStudy = (StudyBean) request.getSession().getAttribute("study");
        int parentStudyId = currentStudy.getParentStudyId();
        ArrayList<StudyGroupClassBean> studyGroupClasses = new ArrayList<>();
        if (parentStudyId > 0) {
            StudyBean parentStudy = (StudyBean) studyDAO.findByPK(parentStudyId);
            studyGroupClasses = studyGroupClassDAO.findAllActiveByStudy(parentStudy);
        } else {
            parentStudyId = currentStudy.getId();
            studyGroupClasses = studyGroupClassDAO.findAllActiveByStudy(currentStudy);
        }

        for (int i = 0; i < studyGroupClasses.size(); i++) {
            StudyGroupClassBean sgc = (StudyGroupClassBean) studyGroupClasses.get(i);
            ArrayList<StudyGroupBean> groups = studyGroupDAO.findAllByGroupClass(sgc);
            sgc.setStudyGroups(groups);
        }

        return studyGroupClasses;

    }

    protected UserDetails getUserDetails() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            return (UserDetails) principal;
        } else {
            return null;
        }
    }

    public Boolean sendEmail(String to, String subject, String body, Boolean htmlEmail, Boolean sendMessage, HttpServletRequest request) throws Exception {
        return sendEmail(to, EmailEngine.getAdminEmail(), subject, body, htmlEmail, respage.getString("your_message_sent_succesfully"),
                respage.getString("mail_cannot_be_sent_to_admin"), sendMessage, request);
    }

    public Boolean sendEmail(String to, String subject, String body, Boolean htmlEmail, HttpServletRequest request) throws Exception {
        return sendEmail(to, EmailEngine.getAdminEmail(), subject, body, htmlEmail, respage.getString("your_message_sent_succesfully"),
                respage.getString("mail_cannot_be_sent_to_admin"), true, request);
    }

    public Boolean sendEmail(String to, String from, String subject, String body, Boolean htmlEmail, HttpServletRequest request) throws Exception {
        return sendEmail(to, from, subject, body, htmlEmail, respage.getString("your_message_sent_succesfully"),
                respage.getString("mail_cannot_be_sent_to_admin"), true, request);
    }

    public Boolean sendEmail(String to, String from, String subject, String body, Boolean htmlEmail, String successMessage, String failMessage,
                             Boolean sendMessage, HttpServletRequest request) throws Exception {
        Boolean messageSent = true;
        try {
            JavaMailSenderImpl mailSender = (JavaMailSenderImpl) SpringServletAccess.getApplicationContext(getServletContext()).getBean("mailSender");

            //@pgawade 09-Feb-2012 #issue 13201 - setting the "mail.smtp.localhost" property to localhost when java API is not able to
            //retrieve the host name
            Properties javaMailProperties = mailSender.getJavaMailProperties();
            if(null != javaMailProperties){
                if (javaMailProperties.get("mail.smtp.localhost") == null || ((String)javaMailProperties.get("mail.smtp.localhost")).equalsIgnoreCase("") ){
                    javaMailProperties.put("mail.smtp.localhost", "localhost");
                }
            }

            MimeMessage mimeMessage = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, htmlEmail);
            helper.setFrom(from);
            helper.setTo(processMultipleImailAddresses(to.trim()));
            helper.setSubject(subject);
            helper.setText(body, true);

            mailSender.send(mimeMessage);
            if (successMessage != null && sendMessage) {
                addPageMessage(successMessage, request);
            }
            LOGGER.debug("Email sent successfully on {}", new Date());
        } catch (MailException me) {
            if (failMessage != null && sendMessage) {
                addPageMessage(failMessage, request);
            }
            LOGGER.debug("Email could not be sent on {} due to: {}", new Date(), me.toString());
            messageSent = false;
        }
        return messageSent;
    }

    private InternetAddress[] processMultipleImailAddresses(String to) throws MessagingException {
        ArrayList<String> recipientsArray = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(to, ",");
        while (st.hasMoreTokens()) {
            recipientsArray.add(st.nextToken());
        }

        int sizeTo = recipientsArray.size();
        InternetAddress[] addressTo = new InternetAddress[sizeTo];
        for (int i = 0; i < sizeTo; i++) {
            addressTo[i] = new InternetAddress(recipientsArray.get(i).toString());
        }
        return addressTo;

    }

    public void unlockCRFsForUser(int userId) {
        crfLocker.unlockAllForUser(userId);
        
    }


    // JN:Doesnt look like the following method is used anywhere, commenting out
    /*
     * public void dowloadFile(File f, String contentType) throws Exception {
     *
     * response.setHeader("Content-disposition", "attachment; filename=\"" +
     * f.getName() + "\";"); response.setContentType("text/xml");
     * response.setHeader("Pragma", "public");
     *
     * ServletOutputStream op = response.getOutputStream();
     *
     * DataInputStream in = null; try { response.setContentType("text/xml");
     * response.setHeader("Pragma", "public"); response.setContentLength((int)
     * f.length());
     *
     * byte[] bbuf = new byte[(int) f.length()]; in = new DataInputStream(new
     * FileInputStream(f)); int length; while (in != null && (length =
     * in.read(bbuf)) != -1) { op.write(bbuf, 0, length); }
     *
     * in.close(); op.flush(); op.close(); } catch (Exception ee) {
     * ee.printStackTrace(); } finally { if (in != null) { in.close(); } if (op
     * != null) { op.close(); } } }
     */

    /*
     * public String getPageServletFileName() { String fileName =
     * request.getServletPath(); String temp = request.getPathInfo(); if (temp
     * != null) { fileName += temp; } temp = request.getQueryString(); if (temp
     * != null && temp.length() > 0) { fileName += "?" + temp; } return
     * fileName; }
     *
     * public String getPageURL() { String url =
     * request.getRequestURL().toString(); String query =
     * request.getQueryString(); if (url != null && url.length() > 0 && query !=
     * null) { url += "?" + query; } return url; }
     */

    /**
     * A inner class designed to allow the implementation of a JUnit test case
     * for abstract CoreSecureController. The inner class allows the test case
     * to call the outer class' private process() method.
     *
     * @author Bruce W. Perry 01/2008
     * @see org.akaza.openclinica.servlettests.SecureControllerServletTest
     * @see org.akaza.openclinica.servlettests.SecureControllerWrapper
     */
    public class SecureControllerTestDelegate {

        public SecureControllerTestDelegate() {
            super();
        }

        public void process(HttpServletRequest request, HttpServletResponse response) throws OpenClinicaException, UnsupportedEncodingException {
            CoreSecureController.this.process(request, response);
        }
    }


    public CRFLocker getCrfLocker() {
        return crfLocker;
    }
    
    protected void addErrorMessage(String key, String errorMsg) {
    	if(errors == null) {
    		errors = new HashMap<>();
    	}
    	ArrayList<String> messages = errors.get(key);
    	if(messages == null) {
    		messages = new ArrayList<>();
    		errors.put(key, messages);
    	}
    	messages.add(errorMsg);
    }
}
