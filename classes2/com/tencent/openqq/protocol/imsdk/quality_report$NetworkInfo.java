package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;

public final class quality_report$NetworkInfo
  extends MessageMicro<NetworkInfo>
{
  public static final int ENUM_NETWORK_TYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "enum_network_type" }, new Object[] { Integer.valueOf(0) }, NetworkInfo.class);
  public final PBEnumField enum_network_type = PBField.initEnum(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\quality_report$NetworkInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */