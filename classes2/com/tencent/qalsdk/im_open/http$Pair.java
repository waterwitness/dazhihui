package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class http$Pair
  extends MessageMicro<Pair>
{
  public static final int KEY_FIELD_NUMBER = 1;
  public static final int VALUE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "key", "value" }, new Object[] { "", "" }, Pair.class);
  public final PBStringField key = PBField.initString("");
  public final PBStringField value = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\http$Pair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */