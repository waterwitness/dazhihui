package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class sdk_init$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int BYTES_USER_APPID_FIELD_NUMBER = 9;
  public static final int GUID_FIELD_NUMBER = 7;
  public static final int SDKAPPID_FIELD_NUMBER = 1;
  public static final int SDKAPPTOKEN_FIELD_NUMBER = 2;
  public static final int SDKDATA_FIELD_NUMBER = 8;
  public static final int UIDTYPE_FIELD_NUMBER = 3;
  public static final int USERAPPID_FIELD_NUMBER = 4;
  public static final int USERID_FIELD_NUMBER = 5;
  public static final int USERKEY_FIELD_NUMBER = 6;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_user_appid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField guid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field sdkappid = PBField.initUInt32(0);
  public final PBBytesField sdkapptoken = PBField.initBytes(ByteStringMicro.EMPTY);
  public im_open_common.SdkData sdkdata = new im_open_common.SdkData();
  public final PBBytesField uidtype = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field userappid = PBField.initUInt32(0);
  public final PBBytesField userid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField userkey = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro5 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro6 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 42, 50, 58, 66, 74 }, new String[] { "sdkappid", "sdkapptoken", "uidtype", "userappid", "userid", "userkey", "guid", "sdkdata", "bytes_user_appid" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, Integer.valueOf(0), localByteStringMicro3, localByteStringMicro4, localByteStringMicro5, null, localByteStringMicro6 }, ReqBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\sdk_init$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */