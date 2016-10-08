package tencent.tls.oidb.cmd0x601;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Oidb0X601$OpenSigInfo
  extends MessageMicro<OpenSigInfo>
{
  public static final int BYTES_OPENSIG_FIELD_NUMBER = 3;
  public static final int STR_OPENAPPID_FIELD_NUMBER = 2;
  public static final int UINT32_OPENSIGTYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_opensig = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_openappid = PBField.initString("");
  public final PBUInt32Field uint32_opensigtype = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint32_opensigtype", "str_openappid", "bytes_opensig" }, new Object[] { Integer.valueOf(0), "", localByteStringMicro }, OpenSigInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x601\Oidb0X601$OpenSigInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */