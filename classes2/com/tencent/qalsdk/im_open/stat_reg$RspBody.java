package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class stat_reg$RspBody
  extends MessageMicro<RspBody>
{
  public static final int ENUM_CMD_ERROR_CODE_FIELD_NUMBER = 1;
  public static final int STR_CLIENT_IP_FIELD_NUMBER = 6;
  public static final int STR_ERRMSG_FIELD_NUMBER = 2;
  public static final int UINT32_CLIENT_PORT_FIELD_NUMBER = 7;
  public static final int UINT32_HELLO_INTERVAL_FIELD_NUMBER = 8;
  public static final int UINT32_SERVER_TIME_FIELD_NUMBER = 3;
  public static final int UINT32_TIMESTAMP_FIELD_NUMBER = 5;
  public static final int UINT32_UPDATE_FLAG_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 24, 32, 40, 50, 56, 64 }, new String[] { "enum_cmd_error_code", "str_errmsg", "uint32_server_time", "uint32_update_flag", "uint32_timestamp", "str_client_ip", "uint32_client_port", "uint32_hello_interval" }, new Object[] { null, "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(300) }, RspBody.class);
  public common.CmdErrorCode enum_cmd_error_code = new common.CmdErrorCode();
  public final PBStringField str_client_ip = PBField.initString("");
  public final PBStringField str_errmsg = PBField.initString("");
  public final PBUInt32Field uint32_client_port = PBField.initUInt32(0);
  public final PBUInt32Field uint32_hello_interval = PBField.initUInt32(300);
  public final PBUInt32Field uint32_server_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_timestamp = PBField.initUInt32(0);
  public final PBUInt32Field uint32_update_flag = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\stat_reg$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */