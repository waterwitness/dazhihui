package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBFixed32Field;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$S2CHead
  extends MessageMicro<S2CHead>
{
  public static final int UINT32_MSG_ID_FIELD_NUMBER = 4;
  public static final int UINT32_MSG_TYPE_FIELD_NUMBER = 2;
  public static final int UINT32_RAND_FIELD_NUMBER = 9;
  public static final int UINT32_RELAY_IP_FIELD_NUMBER = 5;
  public static final int UINT32_RELAY_PORT_FIELD_NUMBER = 6;
  public static final int UINT32_SERVER_TIME_FIELD_NUMBER = 8;
  public static final int UINT32_SUB_MSGTYPE_FIELD_NUMBER = 1;
  public static final int UINT32_USER_DEF_SUB_CMD_FIELD_NUMBER = 10;
  public static final int UINT64_FROM_UIN_FIELD_NUMBER = 3;
  public static final int UINT64_TO_UIN_FIELD_NUMBER = 7;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 45, 48, 56, 64, 72, 80 }, new String[] { "uint32_sub_msgtype", "uint32_msg_type", "uint64_from_uin", "uint32_msg_id", "uint32_relay_ip", "uint32_relay_port", "uint64_to_uin", "uint32_server_time", "uint32_rand", "uint32_user_def_sub_cmd" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, S2CHead.class);
  public final PBUInt32Field uint32_msg_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_msg_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_rand = PBField.initUInt32(0);
  public final PBFixed32Field uint32_relay_ip = PBField.initFixed32(0);
  public final PBUInt32Field uint32_relay_port = PBField.initUInt32(0);
  public final PBUInt32Field uint32_server_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sub_msgtype = PBField.initUInt32(0);
  public final PBUInt32Field uint32_user_def_sub_cmd = PBField.initUInt32(0);
  public final PBUInt64Field uint64_from_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_to_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$S2CHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */