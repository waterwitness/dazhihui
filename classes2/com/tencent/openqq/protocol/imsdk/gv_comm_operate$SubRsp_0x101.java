package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class gv_comm_operate$SubRsp_0x101
  extends MessageMicro<SubRsp_0x101>
{
  public static final int INT32_RESULT_FIELD_NUMBER = 1;
  public static final int STR_ERR_MSG_FIELD_NUMBER = 2;
  public static final int UINT64_PRIVILEGE_MAP_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24 }, new String[] { "int32_result", "str_err_msg", "uint64_privilege_map" }, new Object[] { Integer.valueOf(0), "", Long.valueOf(0L) }, SubRsp_0x101.class);
  public final PBInt32Field int32_result = PBField.initInt32(0);
  public final PBStringField str_err_msg = PBField.initString("");
  public final PBUInt64Field uint64_privilege_map = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$SubRsp_0x101.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */