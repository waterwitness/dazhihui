package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class gv_comm_operate$GVCommOprHead
  extends MessageMicro<GVCommOprHead>
{
  public static final int BYTES_COOKIE_BUFF_FIELD_NUMBER = 22;
  public static final int RPT_RELAY_INFO_FIELD_NUMBER = 7;
  public static final int RPT_TO_ACCOUNT_FIELD_NUMBER = 25;
  public static final int RPT_TO_OPENID_FIELD_NUMBER = 21;
  public static final int RPT_TO_UIN_FIELD_NUMBER = 12;
  public static final int STR_AV_TOKEN_FIELD_NUMBER = 11;
  public static final int STR_CLIENT_VERSION_FIELD_NUMBER = 24;
  public static final int STR_ERROR_MSG_FIELD_NUMBER = 9;
  public static final int STR_OPENID_FIELD_NUMBER = 20;
  public static final int UINT32_AUTH_KEY_FIELD_NUMBER = 5;
  public static final int UINT32_AUTH_TYPE_FIELD_NUMBER = 4;
  public static final int UINT32_BUSS_TYPE_FIELD_NUMBER = 3;
  public static final int UINT32_RESULT_FIELD_NUMBER = 8;
  public static final int UINT32_SDK_APPID_FIELD_NUMBER = 10;
  public static final int UINT32_SEQ_FIELD_NUMBER = 2;
  public static final int UINT32_SUB_CMD_FIELD_NUMBER = 1;
  public static final int UINT32_TERMINAL_TYPE_FIELD_NUMBER = 23;
  public static final int UINT64_UIN_FIELD_NUMBER = 6;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_cookie_buff = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBRepeatMessageField<gv_comm_operate.RelayInfo> rpt_relay_info = PBField.initRepeatMessage(gv_comm_operate.RelayInfo.class);
  public final PBRepeatField<Long> rpt_to_Account = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
  public final PBRepeatField<String> rpt_to_openid = PBField.initRepeat(PBStringField.__repeatHelper__);
  public final PBRepeatField<Long> rpt_to_uin = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
  public final PBStringField str_av_token = PBField.initString("");
  public final PBStringField str_client_version = PBField.initString("");
  public final PBStringField str_error_msg = PBField.initString("");
  public final PBStringField str_openid = PBField.initString("");
  public final PBUInt32Field uint32_auth_key = PBField.initUInt32(0);
  public final PBUInt32Field uint32_auth_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_buss_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_result = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sdk_appid = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sub_cmd = PBField.initUInt32(0);
  public final PBUInt32Field uint32_terminal_type = PBField.initUInt32(0);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40, 48, 58, 64, 74, 80, 90, 96, 162, 170, 178, 184, 194, 200 }, new String[] { "uint32_sub_cmd", "uint32_seq", "uint32_buss_type", "uint32_auth_type", "uint32_auth_key", "uint64_uin", "rpt_relay_info", "uint32_result", "str_error_msg", "uint32_sdk_appid", "str_av_token", "rpt_to_uin", "str_openid", "rpt_to_openid", "bytes_cookie_buff", "uint32_terminal_type", "str_client_version", "rpt_to_Account" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), null, Integer.valueOf(0), "", Integer.valueOf(0), "", Long.valueOf(0L), "", "", localByteStringMicro, Integer.valueOf(0), "", Long.valueOf(0L) }, GVCommOprHead.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$GVCommOprHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */