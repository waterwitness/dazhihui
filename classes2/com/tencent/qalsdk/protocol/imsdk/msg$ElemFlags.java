package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class msg$ElemFlags
  extends MessageMicro<ElemFlags>
{
  public static final int BYTES_BUSINESS_DATA_FIELD_NUMBER = 2;
  public static final int BYTES_FLAGS1_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_business_data = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_flags1 = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "bytes_flags1", "bytes_business_data" }, new Object[] { localByteStringMicro1, localByteStringMicro2 }, ElemFlags.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$ElemFlags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */