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
package com.yihaodian.architecture.kira.manager.action;

import com.yihaodian.architecture.kira.manager.criteria.KiraClientCriteria;
import com.yihaodian.architecture.kira.manager.service.KiraClientService;
import com.yihaodian.architecture.kira.manager.util.Utils;
import java.util.Map;

public class KiraClientAction extends BaseAction {

  private static final long serialVersionUID = 1L;

  private KiraClientCriteria criteria = new KiraClientCriteria();

  private transient KiraClientService kiraClientService;

  public KiraClientAction() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public KiraClientCriteria getCriteria() {
    return criteria;
  }

  public void setCriteria(KiraClientCriteria criteria) {
    this.criteria = criteria;
  }

  public void setKiraClientService(KiraClientService kiraClientService) {
    this.kiraClientService = kiraClientService;
  }

  public String queryKiraClientInfoAsMap() throws Exception {
    criteria.getPaging().setMaxResults(Integer.MAX_VALUE);
    String centralScheduleServiceUrl = criteria.getCentralScheduleServiceUrl();
    Map<String, String> kiraClientInfo = kiraClientService
        .queryKiraClientInfoAsMap(centralScheduleServiceUrl);
    Utils.sendHttpResponseForStruts2(criteria, kiraClientInfo);
    return null;
  }

}
