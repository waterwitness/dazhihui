package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class head$RoutineHead
  extends MessageMicro<RoutineHead>
{
  public static final int MSG_C2C_INFO_FIELD_NUMBER = 2;
  public static final int MSG_C2C_TEMP_INFO_FIELD_NUMBER = 3;
  public static final int MSG_C2S_INFO_FIELD_NUMBER = 6;
  public static final int MSG_CONF_INFO_FIELD_NUMBER = 5;
  public static final int MSG_GROUP_INFO_FIELD_NUMBER = 4;
  public static final int MSG_INST_CTRL_FIELD_NUMBER = 1;
  public static final int MSG_MULTI_CAST_INFO_FIELD_NUMBER = 7;
  public static final int MSG_TEAM_INFO_FIELD_NUMBER = 8;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 42, 50, 58, 66 }, new String[] { "msg_inst_ctrl", "msg_c2c_info", "msg_c2c_temp_info", "msg_group_info", "msg_conf_info", "msg_c2s_info", "msg_multi_cast_info", "msg_team_info" }, new Object[] { null, null, null, null, null, null, null, null }, RoutineHead.class);
  public head.C2CInfo msg_c2c_info = new head.C2CInfo();
  public head.C2CTempInfo msg_c2c_temp_info = new head.C2CTempInfo();
  public head.C2SInfo msg_c2s_info = new head.C2SInfo();
  public head.ConfInfo msg_conf_info = new head.ConfInfo();
  public head.GroupInfo msg_group_info = new head.GroupInfo();
  public head.InstCtrl msg_inst_ctrl = new head.InstCtrl();
  public head.MultiCastInfo msg_multi_cast_info = new head.MultiCastInfo();
  public head.TeamInfo msg_team_info = new head.TeamInfo();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$RoutineHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */