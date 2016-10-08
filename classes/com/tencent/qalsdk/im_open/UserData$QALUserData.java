package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class UserData$QALUserData
  extends MessageMicro<QALUserData>
{
  public static final int APN_FIELD_NUMBER = 4;
  public static final int APP_CHANNEL_FIELD_NUMBER = 3;
  public static final int APP_VERSION_FIELD_NUMBER = 2;
  public static final int BRAND_FIELD_NUMBER = 9;
  public static final int DEVICE_FIELD_NUMBER = 8;
  public static final int IMEI_FIELD_NUMBER = 12;
  public static final int IMSI_FIELD_NUMBER = 13;
  public static final int OS_FIELD_NUMBER = 6;
  public static final int OS_VERSION_FIELD_NUMBER = 7;
  public static final int RADIO_ACCESS_FIELD_NUMBER = 5;
  public static final int SCREEN_HEIGHT_FIELD_NUMBER = 11;
  public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
  public static final int SDK_VERSION_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 40, 48, 58, 66, 74, 80, 88, 98, 104 }, new String[] { "sdk_version", "app_version", "app_channel", "apn", "radio_access", "os", "os_version", "device", "brand", "screen_width", "screen_height", "imei", "imsi" }, new Object[] { "", "", "", "", Integer.valueOf(0), Integer.valueOf(0), "", "", "", Integer.valueOf(0), Integer.valueOf(0), "", Long.valueOf(0L) }, QALUserData.class);
  public final PBStringField apn = PBField.initString("");
  public final PBStringField app_channel = PBField.initString("");
  public final PBStringField app_version = PBField.initString("");
  public final PBStringField brand = PBField.initString("");
  public final PBStringField device = PBField.initString("");
  public final PBStringField imei = PBField.initString("");
  public final PBUInt64Field imsi = PBField.initUInt64(0L);
  public final PBEnumField os = PBField.initEnum(0);
  public final PBStringField os_version = PBField.initString("");
  public final PBInt32Field radio_access = PBField.initInt32(0);
  public final PBUInt32Field screen_height = PBField.initUInt32(0);
  public final PBUInt32Field screen_width = PBField.initUInt32(0);
  public final PBStringField sdk_version = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\im_open\UserData$QALUserData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */