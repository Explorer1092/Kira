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
package com.yihaodian.architecture.kira.common;

import com.yihaodian.architecture.kira.common.dto.JobItemRunRequest;
import com.yihaodian.architecture.kira.common.iface.IEnvironment;

public class JobItemRunContextData extends JobItemHandleContextData {

  private JobItemRunRequest jobItemRunRequest;

  public JobItemRunContextData() {
    // TODO Auto-generated constructor stub
  }

  public JobItemRunContextData(JobItemRunRequest jobItemRunRequest,
      IEnvironment environment) {
    super(environment);
    this.jobItemRunRequest = jobItemRunRequest;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public JobItemRunRequest getJobItemRunRequest() {
    return jobItemRunRequest;
  }

  public void setJobItemRunRequest(JobItemRunRequest jobItemRunRequest) {
    this.jobItemRunRequest = jobItemRunRequest;
  }

}
