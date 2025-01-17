/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.web.bean;

import org.akaza.openclinica.bean.extract.DatasetBean;
import org.akaza.openclinica.i18n.util.ResourceBundleProvider;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author thickerson
 *
 *
 */
public class DatasetRow extends EntityBeanRow<DatasetBean, DatasetRow> {

    public static final int COL_DATASETNAME = 0;
    public static final int COL_DATASETDESC = 1;
    public static final int COL_DATASETOWNER = 2;
    public static final int COL_DATASETCREATEDDATE = 3;
    public static final int COL_STATUS = 4;
    public SimpleDateFormat sdf = new SimpleDateFormat(ResourceBundleProvider.getFormatBundle().getString("date_format_string"));

    // TODO l10n dates, tbh
    @Override
    protected int compareColumn(DatasetRow row, int sortingColumn) {
        if (!row.getClass().equals(DatasetRow.class)) {
            return 0;
        }

        DatasetBean thisAccount = bean;
        DatasetBean argAccount = row.bean;

        int answer = 0;
        switch (sortingColumn) {
        case COL_DATASETNAME:
            answer = thisAccount.getName().toLowerCase().compareTo(argAccount.getName().toLowerCase());
            break;
        case COL_DATASETDESC:
            answer = thisAccount.getDescription().toLowerCase().compareTo(argAccount.getDescription().toLowerCase());
            break;
        case COL_DATASETOWNER:
            answer = thisAccount.getOwner().getName().toLowerCase().compareTo(argAccount.getOwner().getName().toLowerCase());
            break;
        case COL_STATUS:
            answer = thisAccount.getStatus().compareTo(argAccount.getStatus());
            break;
        case COL_DATASETCREATEDDATE:
            answer = thisAccount.getCreatedDate().compareTo(argAccount.getCreatedDate());
            break;
        }

        return answer;
    }

    @Override
    public String getSearchString() {
        DatasetBean thisAccount = (DatasetBean) bean;
        return thisAccount.getName() + " " + thisAccount.getDescription() + " " + thisAccount.getOwner().getName() + " "
            + sdf.format(thisAccount.getCreatedDate());
    }

    public static ArrayList<DatasetRow> generateRowsFromBeans(ArrayList<DatasetBean> beans) {
        ArrayList<DatasetRow> answer = new ArrayList<>();

        for (int i = 0; i < beans.size(); i++) {
            try {
                DatasetRow row = new DatasetRow();
                row.setBean(beans.get(i));
                answer.add(row);
            } catch (Exception e) {
            }
        }

        return answer;
    }

    public static ArrayList<DatasetRow> generateRowFromBean(DatasetBean db) {
        ArrayList<DatasetRow> answer = new ArrayList<>();
        DatasetRow row = new DatasetRow();
        row.setBean(db);
        answer.add(row);
        return answer;
    }

    @Override
    public ArrayList<DatasetRow> generatRowsFromBeans(ArrayList<DatasetBean> beans) {
        return DatasetRow.generateRowsFromBeans(beans);
    }
}
