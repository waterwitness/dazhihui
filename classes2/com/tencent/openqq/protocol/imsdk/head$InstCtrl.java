package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class head$InstCtrl
  extends MessageMicro<InstCtrl>
{
  public static final int MSG_FROM_INST_FIELD_NUMBER = 3;
  public static final int RPT_MSG_EXCLUDE_INST_FIELD_NUMBER = 2;
  public static final int RPT_MSG_SEND_TO_INST_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26 }, new String[] { "rpt_msg_send_to_inst", "rpt_msg_exclude_inst", "msg_from_inst" }, new Object[] { null, null, null }, InstCtrl.class);
  public head.InstInfo msg_from_inst = new head.InstInfo();
  public final PBRepeatMessageField<head.InstInfo> rpt_msg_exclude_inst = PBField.initRepeatMessage(head.InstInfo.class);
  public final PBRepeatMessageField<head.InstInfo> rpt_msg_send_to_inst = PBField.initRepeatMessage(head.InstInfo.class);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$InstCtrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */