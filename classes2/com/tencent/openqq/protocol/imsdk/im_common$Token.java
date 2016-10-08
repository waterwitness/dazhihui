package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class im_common$Token
  extends MessageMicro<Token>
{
  public static final int BUF_FIELD_NUMBER = 1;
  public static final int BYTES_SIGT_FIELD_NUMBER = 4;
  public static final int C2C_TYPE_FIELD_NUMBER = 2;
  public static final int SERVICE_TYPE_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField buf = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_sigt = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field c2c_type = PBField.initUInt32(0);
  public final PBUInt32Field service_type = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 24, 34 }, new String[] { "buf", "c2c_type", "service_type", "bytes_sigt" }, new Object[] { localByteStringMicro1, Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro2 }, Token.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\im_common$Token.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */