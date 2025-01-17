/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.control.admin;

import org.akaza.openclinica.bean.managestudy.StudyBean;
import org.akaza.openclinica.control.AbstractTableFactory;
import org.akaza.openclinica.control.StatisticsView;
import org.akaza.openclinica.dao.managestudy.StudyDAO;
import org.akaza.openclinica.dao.managestudy.StudySubjectDAO;
import org.akaza.openclinica.i18n.util.ResourceBundleProvider;
import org.jmesa.core.filter.DateFilterMatcher;
import org.jmesa.core.filter.MatcherKey;
import org.jmesa.facade.TableFacade;
import org.jmesa.limit.Limit;
import org.jmesa.util.ItemUtils;
import org.jmesa.view.component.Row;
import org.jmesa.view.editor.CellEditor;
import org.jmesa.view.html.HtmlBuilder;
import org.jmesa.view.html.renderer.HtmlTableRenderer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletResponse;

public class SiteStatisticsTableFactory extends AbstractTableFactory {

    private StudyDAO studyDao;
    private StudySubjectDAO studySubjectDao;
    private StudyBean currentStudy;
    private ResourceBundle reswords = ResourceBundleProvider.getWordsBundle();
    
    @Override
    protected String getTableName() {
        return "studySiteStatistics";
    }

    @Override
    public void configureTableFacadeCustomView(TableFacade tableFacade) {
        tableFacade.setView(new StatisticsView(getLocale()));
    }

    @Override
    protected void configureColumns(TableFacade tableFacade, Locale locale) {
        tableFacade.setColumnProperties("name", "enrolled", "expectedTotalEnrollment", "percentage");
        ((HtmlTableRenderer) tableFacade.getTable().getTableRenderer()).setWidth("375px");
        Row row = tableFacade.getTable().getRow();
        configureColumn(row.getColumn("name"), reswords.getString("site"), null, null, false, true);
        configureColumn(row.getColumn("enrolled"), reswords.getString("enrolled"), null, null, false, true);
        configureColumn(row.getColumn("expectedTotalEnrollment"), reswords.getString("expected_enrollment"), null, null, false, true);
        configureColumn(row.getColumn("percentage"), reswords.getString("percentage"), new PercentageCellEditor(), null, false, true);

    }

    @Override
    public void configureTableFacade(HttpServletResponse response, TableFacade tableFacade) {
        super.configureTableFacade(response, tableFacade);
        tableFacade.addFilterMatcher(new MatcherKey(Date.class, "loginAttemptDate"), new DateFilterMatcher("yyyy-MM-dd hh:mm"));
    }

    @Override
    public void setDataAndLimitVariables(TableFacade tableFacade) {

        Limit limit = tableFacade.getLimit();
        List<StudyBean> studies = (List<StudyBean>) studyDao.findAll(currentStudy.getId());
        Collection<HashMap<Object, Object>> theItems = new ArrayList<HashMap<Object, Object>>();

        /*
         * Because we are using the State feature (via stateAttr) we can do a
         * check to see if we have a complete limit already. See the State
         * feature for more details Very important to set the totalRow before
         * trying to get the row start and row end variables. Very important to
         * set the totalRow before trying to get the row start and row end
         * variables.
         */
        if (!limit.isComplete()) {
            int totalRows = studies.size();
            tableFacade.setMaxRows(totalRows);
            tableFacade.setTotalRows(totalRows);
        }

        for (StudyBean studyBean : studies) {
            // Get number of subjects enrolled at a specific study or site
            Integer countofStudySubjectsAtStudyOrSite = studySubjectDao.getCountofStudySubjectsAtStudyOrSite(studyBean);
            Integer expectedTotalEnrollment = studyBean.getExpectedTotalEnrollment();
            Long percentage =
                expectedTotalEnrollment == 0 ? 0 : Math.round((countofStudySubjectsAtStudyOrSite.doubleValue() / expectedTotalEnrollment.doubleValue()) * 100);

            HashMap<Object, Object> theItem = new HashMap<Object, Object>();
            theItem.put("name", studyBean.getName());
            theItem.put("enrolled", countofStudySubjectsAtStudyOrSite);
            theItem.put("expectedTotalEnrollment", studyBean.getExpectedTotalEnrollment());
            theItem.put("percentage", String.valueOf(percentage) + "%");
            theItems.add(theItem);
        }

        tableFacade.setItems(theItems);
    }

    public StudyDAO getStudyDao() {
        return studyDao;
    }

    public void setStudyDao(StudyDAO studyDao) {
        this.studyDao = studyDao;
    }

    public StudySubjectDAO getStudySubjectDao() {
        return studySubjectDao;
    }

    public void setStudySubjectDao(StudySubjectDAO studySubjectDao) {
        this.studySubjectDao = studySubjectDao;
    }

    public StudyBean getCurrentStudy() {
        return currentStudy;
    }

    public void setCurrentStudy(StudyBean currentStudy) {
        this.currentStudy = currentStudy;
    }

    private class PercentageCellEditor implements CellEditor {
        public Object getValue(Object item, String property, int rowcount) {
            Object value = ItemUtils.getItemValue(item, property);
            HtmlBuilder html = new HtmlBuilder();
            html.div().styleClass("graph").close();
            html.div().styleClass("bar").style("width: " + value).close().append(value).divEnd();
            html.divEnd();
            return html.toString();
        }
    }

}
