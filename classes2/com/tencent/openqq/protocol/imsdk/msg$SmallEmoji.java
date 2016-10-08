package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$SmallEmoji
  extends MessageMicro<SmallEmoji>
{
  public static final int PACKIDSUM_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "packIdSum" }, new Object[] { Integer.valueOf(0) }, SmallEmoji.class);
  public final PBUInt32Field packIdSum = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$SmallEmoji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */