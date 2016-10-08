package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class msg$TipsInfo
  extends MessageMicro<TipsInfo>
{
  public static final int TEXT_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "text" }, new Object[] { "" }, TipsInfo.class);
  public final PBStringField text = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$TipsInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */