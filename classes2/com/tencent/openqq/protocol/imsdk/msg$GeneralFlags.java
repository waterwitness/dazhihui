package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$GeneralFlags
  extends MessageMicro<GeneralFlags>
{
  public static final int UINT32_BUBBLE_DIY_TEXT_ID_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "uint32_bubble_diy_text_id" }, new Object[] { Integer.valueOf(0) }, GeneralFlags.class);
  public final PBUInt32Field uint32_bubble_diy_text_id = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$GeneralFlags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */