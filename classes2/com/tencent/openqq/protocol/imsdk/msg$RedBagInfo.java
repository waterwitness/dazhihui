package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$RedBagInfo
  extends MessageMicro<RedBagInfo>
{
  public static final int REDBAG_TYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "redbag_type" }, new Object[] { Integer.valueOf(0) }, RedBagInfo.class);
  public final PBUInt32Field redbag_type = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$RedBagInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */