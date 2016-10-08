package tencent.tls.oidb;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBFixed32Field;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class OidbHead$OIDBHead
  extends MessageMicro<OIDBHead>
{
  public static final int BYTES_CLIENT_ADDR_FIELD_NUMBER = 15;
  public static final int BYTES_SERVER_ADDR_FIELD_NUMBER = 16;
  public static final int MSG_LOGIN_SIG_FIELD_NUMBER = 9;
  public static final int MSG_SSO_INFO_FIELD_NUMBER = 20;
  public static final int RESERVED_FIELD_NUMBER = 18;
  public static final int STR_ERROR_MSG_FIELD_NUMBER = 8;
  public static final int STR_SERVICE_NAME_FIELD_NUMBER = 11;
  public static final int STR_USER_NAME_FIELD_NUMBER = 10;
  public static final int UINT32_CLIENT_ADDR_FIELD_NUMBER = 5;
  public static final int UINT32_COMMAND_FIELD_NUMBER = 2;
  public static final int UINT32_FLAG_FIELD_NUMBER = 12;
  public static final int UINT32_FROM_ADDR_FIELD_NUMBER = 13;
  public static final int UINT32_LOCALE_ID_FIELD_NUMBER = 19;
  public static final int UINT32_LOCAL_ADDR_FIELD_NUMBER = 14;
  public static final int UINT32_MODULEID_FIELD_NUMBER = 17;
  public static final int UINT32_RESULT_FIELD_NUMBER = 7;
  public static final int UINT32_SEQ_FIELD_NUMBER = 4;
  public static final int UINT32_SERVER_ADDR_FIELD_NUMBER = 6;
  public static final int UINT32_SERVICE_TYPE_FIELD_NUMBER = 3;
  public static final int UINT64_UIN_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_client_addr = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_server_addr = PBField.initBytes(ByteStringMicro.EMPTY);
  public OidbHead.LoginSig msg_login_sig = new OidbHead.LoginSig();
  public OidbHead.Oidb2ServerSsoInfo msg_sso_info = new OidbHead.Oidb2ServerSsoInfo();
  public final PBBytesField reserved = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_error_msg = PBField.initString("");
  public final PBStringField str_service_name = PBField.initString("");
  public final PBStringField str_user_name = PBField.initString("");
  public final PBFixed32Field uint32_client_addr = PBField.initFixed32(0);
  public final PBUInt32Field uint32_command = PBField.initUInt32(0);
  public final PBUInt32Field uint32_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_from_addr = PBField.initUInt32(0);
  public final PBUInt32Field uint32_local_addr = PBField.initUInt32(0);
  public final PBUInt32Field uint32_locale_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_moduleid = PBField.initUInt32(0);
  public final PBUInt32Field uint32_result = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
  public final PBFixed32Field uint32_server_addr = PBField.initFixed32(0);
  public final PBUInt32Field uint32_service_type = PBField.initUInt32(0);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 45, 53, 56, 66, 74, 82, 90, 96, 104, 112, 122, 130, 136, 146, 152, 162 }, new String[] { "uint64_uin", "uint32_command", "uint32_service_type", "uint32_seq", "uint32_client_addr", "uint32_server_addr", "uint32_result", "str_error_msg", "msg_login_sig", "str_user_name", "str_service_name", "uint32_flag", "uint32_from_addr", "uint32_local_addr", "bytes_client_addr", "bytes_server_addr", "uint32_moduleid", "reserved", "uint32_locale_id", "msg_sso_info" }, new Object[] { Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", null, "", "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, Integer.valueOf(0), localByteStringMicro3, Integer.valueOf(0), null }, OIDBHead.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\OidbHead$OIDBHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */