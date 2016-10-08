package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class head$GroupOpenAppDefinedData
  extends MessageMicro<GroupOpenAppDefinedData>
{
  public static final int BYTES_KEY_FIELD_NUMBER = 1;
  public static final int BYTES_VALUE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_key = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_value = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "bytes_key", "bytes_value" }, new Object[] { localByteStringMicro1, localByteStringMicro2 }, GroupOpenAppDefinedData.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$GroupOpenAppDefinedData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */