package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class gv_comm_operate$SubRsp_0x4
  extends MessageMicro<SubRsp_0x4>
{
  public static final int RPT_USER_INFO_FIELD_NUMBER = 3;
  public static final int STR_ERR_MSG_FIELD_NUMBER = 2;
  public static final int UINT32_RESULT_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint32_result", "str_err_msg", "rpt_user_info" }, new Object[] { Integer.valueOf(0), "", null }, SubRsp_0x4.class);
  public final PBRepeatMessageField<gv_comm_operate.UserInfo> rpt_user_info = PBField.initRepeatMessage(gv_comm_operate.UserInfo.class);
  public final PBStringField str_err_msg = PBField.initString("");
  public final PBUInt32Field uint32_result = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$SubRsp_0x4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */