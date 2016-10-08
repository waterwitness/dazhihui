package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class quality_report$SystemInfo
  extends MessageMicro<SystemInfo>
{
  public static final int ENUM_OS_TYPE_FIELD_NUMBER = 1;
  public static final int STR_OS_VERSION_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "enum_os_type", "str_os_version" }, new Object[] { Integer.valueOf(1), "" }, SystemInfo.class);
  public final PBEnumField enum_os_type = PBField.initEnum(1);
  public final PBStringField str_os_version = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\quality_report$SystemInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */