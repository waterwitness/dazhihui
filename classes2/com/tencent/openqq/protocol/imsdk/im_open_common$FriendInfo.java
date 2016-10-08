package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class im_open_common$FriendInfo
  extends MessageMicro<FriendInfo>
{
  public static final int AVATARURL_FIELD_NUMBER = 4;
  public static final int CITY_FIELD_NUMBER = 8;
  public static final int COUNTRY_FIELD_NUMBER = 6;
  public static final int GENDER_FIELD_NUMBER = 5;
  public static final int NICK_FIELD_NUMBER = 3;
  public static final int OPENID_FIELD_NUMBER = 2;
  public static final int PROVINCE_FIELD_NUMBER = 7;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField avatarurl = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField city = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField country = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field gender = PBField.initUInt32(0);
  public final PBBytesField nick = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField openid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField province = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro5 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro6 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 18, 26, 34, 40, 50, 58, 66 }, new String[] { "openid", "nick", "avatarurl", "gender", "country", "province", "city" }, new Object[] { localByteStringMicro1, localByteStringMicro2, localByteStringMicro3, Integer.valueOf(0), localByteStringMicro4, localByteStringMicro5, localByteStringMicro6 }, FriendInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\im_open_common$FriendInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */