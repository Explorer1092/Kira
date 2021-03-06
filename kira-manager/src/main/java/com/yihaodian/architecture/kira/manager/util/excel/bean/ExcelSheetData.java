/*
 *  Copyright 2018 jd.com
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.yihaodian.architecture.kira.manager.util.excel.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExcelSheetData implements Serializable {

  private String sheetNamePrefix;
  private List<ExcelExportDataHolder> excelExportDataHolderList = new ArrayList<ExcelExportDataHolder>();

  public ExcelSheetData(String sheetNamePrefix,
      List<ExcelExportDataHolder> excelExportDataHolderList) {
    this.sheetNamePrefix = sheetNamePrefix;
    this.excelExportDataHolderList = excelExportDataHolderList;
  }

  public List<ExcelExportDataHolder> getExcelExportDataHolderList() {
    return excelExportDataHolderList;
  }

  public void addExcelExportDataHolder(ExcelExportDataHolder excelExportDataHolder) {
    if (null == excelExportDataHolderList) {
      excelExportDataHolderList = new ArrayList<ExcelExportDataHolder>();
    }
    excelExportDataHolderList.add(excelExportDataHolder);
  }

  public String getSheetNamePrefix() {
    return sheetNamePrefix;
  }

}
