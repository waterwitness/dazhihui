package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;

public final class QalMonitor$Request$Environment
  extends MessageMicro<Environment>
{
  public static final int APN_FIELD_NUMBER = 1;
  public static final int RAT_FIELD_NUMBER = 6;
  public static final int RAT_SS_FIELD_NUMBER = 7;
  public static final int WIFI_BSSID_FIELD_NUMBER = 4;
  public static final int WIFI_RSSI_FIELD_NUMBER = 5;
  public static final int WIFI_SSID_FIELD_NUMBER = 3;
  public static final int WIFI_SUPPLICANT_STATE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 40, 48, 56 }, new String[] { "apn", "wifi_supplicant_state", "wifi_ssid", "wifi_bssid", "wifi_rssi", "rat", "rat_ss" }, new Object[] { "", "", "", "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, Environment.class);
  public final PBStringField apn = PBField.initString("");
  public final PBInt32Field rat = PBField.initInt32(0);
  public final PBInt32Field rat_ss = PBField.initInt32(0);
  public final PBStringField wifi_bssid = PBField.initString("");
  public final PBInt32Field wifi_rssi = PBField.initInt32(0);
  public final PBStringField wifi_ssid = PBField.initString("");
  public final PBStringField wifi_supplicant_state = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\QalMonitor$Request$Environment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */