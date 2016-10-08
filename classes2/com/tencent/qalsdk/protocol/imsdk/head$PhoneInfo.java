package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class head$PhoneInfo
  extends MessageMicro<PhoneInfo>
{
  public static final int BYTES_NATION_FIELD_NUMBER = 1;
  public static final int BYTES_PREFIX_FIELD_NUMBER = 2;
  public static final int BYTES_UIN_MOBILE_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_nation = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_prefix = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_uin_mobile = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26 }, new String[] { "bytes_nation", "bytes_prefix", "bytes_uin_mobile" }, new Object[] { localByteStringMicro1, localByteStringMicro2, localByteStringMicro3 }, PhoneInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$PhoneInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */