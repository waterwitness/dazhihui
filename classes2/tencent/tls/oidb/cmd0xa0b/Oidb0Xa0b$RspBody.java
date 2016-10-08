package tencent.tls.oidb.cmd0xa0b;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class Oidb0Xa0b$RspBody
  extends MessageMicro<RspBody>
{
  public static final int BYTES_A2_FIELD_NUMBER = 2;
  public static final int BYTES_D2KEY_FIELD_NUMBER = 4;
  public static final int BYTES_D2_FIELD_NUMBER = 3;
  public static final int STR_ERRHINT_FIELD_NUMBER = 5;
  public static final int STR_IDENTIFIER_FIELD_NUMBER = 7;
  public static final int STR_TLSSIG_FIELD_NUMBER = 8;
  public static final int UINT32_ADMINFLAG_FIELD_NUMBER = 6;
  public static final int UINT64_TINYID_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_a2 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_d2 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_d2key = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_errhint = PBField.initString("");
  public final PBStringField str_identifier = PBField.initString("");
  public final PBStringField str_tlssig = PBField.initString("");
  public final PBUInt32Field uint32_adminflag = PBField.initUInt32(0);
  public final PBUInt64Field uint64_tinyid = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34, 42, 48, 58, 66 }, new String[] { "uint64_tinyid", "bytes_a2", "bytes_d2", "bytes_d2key", "str_errhint", "uint32_adminflag", "str_identifier", "str_tlssig" }, new Object[] { Long.valueOf(0L), localByteStringMicro1, localByteStringMicro2, localByteStringMicro3, "", Integer.valueOf(0), "", "" }, RspBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0xa0b\Oidb0Xa0b$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */