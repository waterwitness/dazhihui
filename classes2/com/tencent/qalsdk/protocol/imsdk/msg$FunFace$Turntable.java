package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg$FunFace$Turntable
  extends MessageMicro<Turntable>
{
  public static final int RPT_UINT64_UIN_LIST_FIELD_NUMBER = 1;
  public static final int STR_HIT_UIN_NICK_FIELD_NUMBER = 3;
  public static final int UINT64_HIT_UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "rpt_uint64_uin_list", "uint64_hit_uin", "str_hit_uin_nick" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), "" }, Turntable.class);
  public final PBRepeatField<Long> rpt_uint64_uin_list = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
  public final PBStringField str_hit_uin_nick = PBField.initString("");
  public final PBUInt64Field uint64_hit_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$FunFace$Turntable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */