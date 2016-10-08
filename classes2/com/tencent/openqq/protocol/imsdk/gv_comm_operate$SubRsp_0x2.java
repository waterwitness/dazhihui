package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class gv_comm_operate$SubRsp_0x2
  extends MessageMicro<SubRsp_0x2>
{
  public static final int STR_ERR_MSG_FIELD_NUMBER = 2;
  public static final int UINT32_RESULT_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "uint32_result", "str_err_msg" }, new Object[] { Integer.valueOf(0), "" }, SubRsp_0x2.class);
  public final PBStringField str_err_msg = PBField.initString("");
  public final PBUInt32Field uint32_result = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$SubRsp_0x2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */