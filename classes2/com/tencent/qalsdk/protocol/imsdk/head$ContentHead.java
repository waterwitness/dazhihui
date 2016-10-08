package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class head$ContentHead
  extends MessageMicro<ContentHead>
{
  public static final int UINT32_CLIENT_TIME_FIELD_NUMBER = 6;
  public static final int UINT32_RAND_FIELD_NUMBER = 4;
  public static final int UINT32_SEQ_FIELD_NUMBER = 3;
  public static final int UINT32_SERVER_SEQ_FIELD_NUMBER = 8;
  public static final int UINT32_SERVER_TIME_FIELD_NUMBER = 5;
  public static final int UINT32_SUBTYPE_FIELD_NUMBER = 2;
  public static final int UINT32_TYPE_FIELD_NUMBER = 1;
  public static final int UINT32_USER_CMD_FIELD_NUMBER = 7;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40, 48, 56, 64 }, new String[] { "uint32_type", "uint32_subtype", "uint32_seq", "uint32_rand", "uint32_server_time", "uint32_client_time", "uint32_user_cmd", "uint32_server_seq" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, ContentHead.class);
  public final PBUInt32Field uint32_client_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_rand = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
  public final PBUInt32Field uint32_server_seq = PBField.initUInt32(0);
  public final PBUInt32Field uint32_server_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_subtype = PBField.initUInt32(0);
  public final PBUInt32Field uint32_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_user_cmd = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$ContentHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */