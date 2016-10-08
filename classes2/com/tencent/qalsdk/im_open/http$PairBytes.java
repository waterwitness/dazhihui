package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class http$PairBytes
  extends MessageMicro<PairBytes>
{
  public static final int KEY_FIELD_NUMBER = 1;
  public static final int VALUE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField key = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField value = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "key", "value" }, new Object[] { localByteStringMicro1, localByteStringMicro2 }, PairBytes.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\http$PairBytes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */