package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class quality_report$DeviceInfo
  extends MessageMicro<DeviceInfo>
{
  public static final int ENUM_DEVICE_TYPE_FIELD_NUMBER = 1;
  public static final int STR_DEVICE_BOARD_FIELD_NUMBER = 4;
  public static final int STR_DEVICE_BRAND_FIELD_NUMBER = 2;
  public static final int STR_DEVICE_CPU_ABI_FIELD_NUMBER = 5;
  public static final int STR_DEVICE_MODEL_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34, 42 }, new String[] { "enum_device_type", "str_device_brand", "str_device_model", "str_device_board", "str_device_cpu_abi" }, new Object[] { Integer.valueOf(1), "", "", "", "" }, DeviceInfo.class);
  public final PBEnumField enum_device_type = PBField.initEnum(1);
  public final PBStringField str_device_board = PBField.initString("");
  public final PBStringField str_device_brand = PBField.initString("");
  public final PBStringField str_device_cpu_abi = PBField.initString("");
  public final PBStringField str_device_model = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\quality_report$DeviceInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */