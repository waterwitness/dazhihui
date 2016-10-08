package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg$ShakeWindow
  extends MessageMicro<ShakeWindow>
{
  public static final int UINT32_RESERVE_FIELD_NUMBER = 2;
  public static final int UINT32_TYPE_FIELD_NUMBER = 1;
  public static final int UINT64_UIN_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint32_type", "uint32_reserve", "uint64_uin" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L) }, ShakeWindow.class);
  public final PBUInt32Field uint32_reserve = PBField.initUInt32(0);
  public final PBUInt32Field uint32_type = PBField.initUInt32(0);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$ShakeWindow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */