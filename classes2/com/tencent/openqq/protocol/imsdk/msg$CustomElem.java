package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;

public final class msg$CustomElem
  extends MessageMicro<CustomElem>
{
  public static final int BYTES_DATA_FIELD_NUMBER = 2;
  public static final int BYTES_DESC_FIELD_NUMBER = 1;
  public static final int BYTES_EXT_FIELD_NUMBER = 4;
  public static final int DataType_Bin = 2;
  public static final int DataType_Text = 1;
  public static final int ENUM_TYPE_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_data = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_desc = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_ext = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBEnumField enum_type = PBField.initEnum(1);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 24, 34 }, new String[] { "bytes_desc", "bytes_data", "enum_type", "bytes_ext" }, new Object[] { localByteStringMicro1, localByteStringMicro2, Integer.valueOf(1), localByteStringMicro3 }, CustomElem.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$CustomElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */