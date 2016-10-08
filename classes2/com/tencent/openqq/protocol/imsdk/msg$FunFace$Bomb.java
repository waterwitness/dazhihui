package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBoolField;
import com.tencent.mobileqq.pb.PBField;

public final class msg$FunFace$Bomb
  extends MessageMicro<Bomb>
{
  public static final int BOOL_BURST_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "bool_burst" }, new Object[] { Boolean.valueOf(false) }, Bomb.class);
  public final PBBoolField bool_burst = PBField.initBool(false);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$FunFace$Bomb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */