/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.control.admin;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.util.Map;

/**
 * Created by IntelliJ IDEA. User: bruceperry Date: Jun 15, 2007
 *
 */
public interface Preview {
	@SuppressWarnings("rawtypes")
	Map<String, Map> createCrfMetaObject(HSSFWorkbook workbook);

    Map<Integer, Map<String, String>> createItemsOrSectionMap(HSSFWorkbook workbook, String itemsOrSection);

    Map<Integer, Map<String, String>> createGroupsMap(HSSFWorkbook workbook);

    Map<String, String> createCrfMap(HSSFWorkbook workbook);
}
