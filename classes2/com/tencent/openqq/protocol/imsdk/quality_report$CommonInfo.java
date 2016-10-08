package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class quality_report$CommonInfo
  extends MessageMicro<CommonInfo>
{
  public static final int MSG_DEVICE_INFO_FIELD_NUMBER = 1;
  public static final int MSG_NETWORK_INFO_FIELD_NUMBER = 3;
  public static final int MSG_SYSTEM_INFO_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26 }, new String[] { "msg_device_info", "msg_system_info", "msg_network_info" }, new Object[] { null, null, null }, CommonInfo.class);
  public quality_report.DeviceInfo msg_device_info = new quality_report.DeviceInfo();
  public quality_report.NetworkInfo msg_network_info = new quality_report.NetworkInfo();
  public quality_report.SystemInfo msg_system_info = new quality_report.SystemInfo();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\quality_report$CommonInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */