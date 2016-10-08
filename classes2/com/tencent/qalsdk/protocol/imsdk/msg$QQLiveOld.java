package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$QQLiveOld
  extends MessageMicro<QQLiveOld>
{
  public static final int STR_INTRODUCE_FIELD_NUMBER = 4;
  public static final int STR_PARAM_FIELD_NUMBER = 3;
  public static final int STR_SHOW_TEXT_FIELD_NUMBER = 2;
  public static final int UINT32_SUB_CMD_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField str_introduce = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField str_param = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField str_show_text = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_sub_cmd = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34 }, new String[] { "uint32_sub_cmd", "str_show_text", "str_param", "str_introduce" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, localByteStringMicro3 }, QQLiveOld.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$QQLiveOld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */