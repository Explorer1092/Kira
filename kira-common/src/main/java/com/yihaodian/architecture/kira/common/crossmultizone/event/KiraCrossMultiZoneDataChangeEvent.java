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
package com.yihaodian.architecture.kira.common.crossmultizone.event;

import com.yihaodian.architecture.kira.common.KiraCommonUtils;
import com.yihaodian.architecture.kira.common.crossmultizone.dto.KiraCrossMultiZoneDataTrackContext;
import java.util.Date;

public class KiraCrossMultiZoneDataChangeEvent extends KiraCrossMultiZoneEvent {

  private KiraCrossMultiZoneDataTrackContext kiraCrossMultiZoneDataTrackContext;

  public KiraCrossMultiZoneDataChangeEvent(
      KiraCrossMultiZoneDataTrackContext kiraCrossMultiZoneDataTrackContext,
      KiraCrossMultiZoneEventType eventType) {
    super(eventType);
    this.kiraCrossMultiZoneDataTrackContext = kiraCrossMultiZoneDataTrackContext;
  }

  public KiraCrossMultiZoneDataChangeEvent(
      KiraCrossMultiZoneDataTrackContext kiraCrossMultiZoneDataTrackContext,
      KiraCrossMultiZoneEventType eventType,
      Date eventTime) {
    super(eventType, eventTime);
    this.kiraCrossMultiZoneDataTrackContext = kiraCrossMultiZoneDataTrackContext;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public KiraCrossMultiZoneDataTrackContext getKiraCrossMultiZoneDataTrackContext() {
    return kiraCrossMultiZoneDataTrackContext;
  }

  @Override
  public String toString() {
    return "KiraCrossMultiZoneDataChangeEvent [kiraCrossMultiZoneDataTrackContext="
        + kiraCrossMultiZoneDataTrackContext + ", eventType=" + eventType
        + ", eventTime=" + KiraCommonUtils.getDateAsString(eventTime) + "]";
  }

}
