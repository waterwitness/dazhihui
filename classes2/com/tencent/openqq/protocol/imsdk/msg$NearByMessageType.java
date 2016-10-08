package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$NearByMessageType
  extends MessageMicro<NearByMessageType>
{
  public static final int ETypeClearingImg = 2;
  public static final int ETypeClearingText = 1;
  public static final int ETypeNormal = 0;
  public static final int UINT32_TYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "uint32_type" }, new Object[] { Integer.valueOf(0) }, NearByMessageType.class);
  public final PBUInt32Field uint32_type = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$NearByMessageType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */