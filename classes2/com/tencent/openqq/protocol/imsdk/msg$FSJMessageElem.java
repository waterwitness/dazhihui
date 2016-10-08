package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$FSJMessageElem
  extends MessageMicro<FSJMessageElem>
{
  public static final int ETypeHotChatFlashPic = 1;
  public static final int ETypeNormal = 0;
  public static final int UINT32_MSG_TYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "uint32_msg_type" }, new Object[] { Integer.valueOf(0) }, FSJMessageElem.class);
  public final PBUInt32Field uint32_msg_type = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$FSJMessageElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */