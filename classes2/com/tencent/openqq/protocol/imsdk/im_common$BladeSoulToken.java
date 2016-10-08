package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class im_common$BladeSoulToken
  extends MessageMicro<BladeSoulToken>
{
  public static final int APP_ID_FIELD_NUMBER = 3;
  public static final int KEY_TIME_FIELD_NUMBER = 4;
  public static final int KEY_VER_FIELD_NUMBER = 1;
  public static final int RANDOM_FIELD_NUMBER = 5;
  public static final int UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40 }, new String[] { "key_ver", "uin", "app_id", "key_time", "random" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, BladeSoulToken.class);
  public final PBUInt32Field app_id = PBField.initUInt32(0);
  public final PBUInt32Field key_time = PBField.initUInt32(0);
  public final PBUInt32Field key_ver = PBField.initUInt32(0);
  public final PBUInt32Field random = PBField.initUInt32(0);
  public final PBUInt64Field uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\im_common$BladeSoulToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */