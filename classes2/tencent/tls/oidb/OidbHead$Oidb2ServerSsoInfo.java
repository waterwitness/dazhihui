package tencent.tls.oidb;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class OidbHead$Oidb2ServerSsoInfo
  extends MessageMicro<Oidb2ServerSsoInfo>
{
  public static final int BYTES_CLIENT_VERSION_FIELD_NUMBER = 4;
  public static final int BYTES_IMEI_FIELD_NUMBER = 3;
  public static final int BYTES_SSO_CLIENT_VERSION_FIELD_NUMBER = 5;
  public static final int UINT32_APP_ID_FIELD_NUMBER = 2;
  public static final int UINT32_SEQ_FIELD_NUMBER = 1;
  public static final int UINT32_SSO_BID_FIELD_NUMBER = 6;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_client_version = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_imei = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_sso_client_version = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_app_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sso_bid = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34, 42, 48 }, new String[] { "uint32_seq", "uint32_app_id", "bytes_imei", "bytes_client_version", "bytes_sso_client_version", "uint32_sso_bid" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, localByteStringMicro3, Integer.valueOf(0) }, Oidb2ServerSsoInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\OidbHead$Oidb2ServerSsoInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */