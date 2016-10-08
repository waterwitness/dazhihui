package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$ServiceHead
  extends MessageMicro<ServiceHead>
{
  public static final int ENUM_SOURCE_SVR_TYPE_FIELD_NUMBER = 1;
  public static final int MSG_FROM_INST_FIELD_NUMBER = 4;
  public static final int MSG_SIG_FIELD_NUMBER = 6;
  public static final int STRING_SERVICE_CMD_FIELD_NUMBER = 5;
  public static final int UINT32_CLIENT_IP_FIELD_NUMBER = 7;
  public static final int UINT32_CLIENT_PORT_FIELD_NUMBER = 8;
  public static final int UINT32_SEQ_FIELD_NUMBER = 2;
  public static final int UINT64_UIN_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 34, 42, 50, 56, 64 }, new String[] { "enum_source_svr_type", "uint32_seq", "uint64_uin", "msg_from_inst", "string_service_cmd", "msg_sig", "uint32_client_ip", "uint32_client_port" }, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Long.valueOf(0L), null, "", null, Integer.valueOf(0), Integer.valueOf(0) }, ServiceHead.class);
  public final PBEnumField enum_source_svr_type = PBField.initEnum(1);
  public head.InstInfo msg_from_inst = new head.InstInfo();
  public head.Signature msg_sig = new head.Signature();
  public final PBStringField string_service_cmd = PBField.initString("");
  public final PBUInt32Field uint32_client_ip = PBField.initUInt32(0);
  public final PBUInt32Field uint32_client_port = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$ServiceHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */