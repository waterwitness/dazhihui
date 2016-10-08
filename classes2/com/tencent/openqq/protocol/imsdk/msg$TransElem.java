package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$TransElem
  extends MessageMicro<TransElem>
{
  public static final int ELEM_TYPE_FIELD_NUMBER = 1;
  public static final int ELEM_VALUE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBUInt32Field elem_type = PBField.initUInt32(0);
  public final PBBytesField elem_value = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "elem_type", "elem_value" }, new Object[] { Integer.valueOf(0), localByteStringMicro }, TransElem.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$TransElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */