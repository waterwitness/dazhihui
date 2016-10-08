package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class videoinvitation$UserInfo
  extends MessageMicro<UserInfo>
{
  public static final int BYTES_ACOUNTTYPE_FIELD_NUMBER = 3;
  public static final int BYTES_APPID_FIELD_NUMBER = 1;
  public static final int BYTES_OPENID_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_acounttype = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_appid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_openid = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26 }, new String[] { "bytes_appid", "bytes_openid", "bytes_acounttype" }, new Object[] { localByteStringMicro1, localByteStringMicro2, localByteStringMicro3 }, UserInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\videoinvitation$UserInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */