package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg$ConferenceTipsInfo
  extends MessageMicro<ConferenceTipsInfo>
{
  public static final int ECONFST_BUDDY_AV = 2;
  public static final int ECONFST_DISCUSS_AV = 1;
  public static final int ECONFST_NONE = 0;
  public static final int STR_TEXT_FIELD_NUMBER = 3;
  public static final int UINT32_SESSION_TYPE_FIELD_NUMBER = 1;
  public static final int UINT64_SESSION_UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "uint32_session_type", "uint64_session_uin", "str_text" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L), "" }, ConferenceTipsInfo.class);
  public final PBStringField str_text = PBField.initString("");
  public final PBUInt32Field uint32_session_type = PBField.initUInt32(0);
  public final PBUInt64Field uint64_session_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$ConferenceTipsInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */