package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$Face
  extends MessageMicro<Face>
{
  public static final int BUF_FIELD_NUMBER = 11;
  public static final int INDEX_FIELD_NUMBER = 1;
  public static final int OLD_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField buf = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field index = PBField.initUInt32(0);
  public final PBBytesField old = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 90 }, new String[] { "index", "old", "buf" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2 }, Face.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$Face.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */