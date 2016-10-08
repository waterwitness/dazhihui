package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class head$MultiCastInfo
  extends MessageMicro<MultiCastInfo>
{
  public static final int MSG_FROM_UIN_INFO_FIELD_NUMBER = 1;
  public static final int RPT_MSG_TO_UIN_INFO_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "msg_from_uin_info", "rpt_msg_to_uin_info" }, new Object[] { null, null }, MultiCastInfo.class);
  public head.UinInfo msg_from_uin_info = new head.UinInfo();
  public final PBRepeatMessageField<head.UinInfo> rpt_msg_to_uin_info = PBField.initRepeatMessage(head.UinInfo.class);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$MultiCastInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */