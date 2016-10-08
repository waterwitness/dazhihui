package tencent.tls.oidb.cmd0xa0b;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Oidb0Xa0b$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int BYTES_USERSIG_FIELD_NUMBER = 4;
  public static final int STR_APPIDAT3RD_FIELD_NUMBER = 2;
  public static final int STR_IDENTIFIER_FIELD_NUMBER = 3;
  public static final int UINT32_ACCOUNTTYPE_FIELD_NUMBER = 5;
  public static final int UINT32_SDKAPPID_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_usersig = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_appidat3rd = PBField.initString("");
  public final PBStringField str_identifier = PBField.initString("");
  public final PBUInt32Field uint32_accounttype = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sdkappid = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34, 40 }, new String[] { "uint32_sdkappid", "str_appidat3rd", "str_identifier", "bytes_usersig", "uint32_accounttype" }, new Object[] { Integer.valueOf(0), "", "", localByteStringMicro, Integer.valueOf(0) }, ReqBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0xa0b\Oidb0Xa0b$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */