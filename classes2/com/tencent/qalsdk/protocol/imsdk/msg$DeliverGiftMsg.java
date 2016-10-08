package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg$DeliverGiftMsg
  extends MessageMicro<DeliverGiftMsg>
{
  public static final int STRING_ANIMATION_CONTENT_FIELD_NUMBER = 2;
  public static final int STRING_GRAY_TIP_CONTENT_FIELD_NUMBER = 1;
  public static final int STRING_REMIND_BRIEF_FIELD_NUMBER = 3;
  public static final int UINT64_RECEIVER_UIN_FIELD_NUMBER = 5;
  public static final int UINT64_SENDER_UIN_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 32, 40 }, new String[] { "string_gray_tip_content", "string_animation_content", "string_remind_brief", "uint64_sender_uin", "uint64_receiver_uin" }, new Object[] { "", "", "", Long.valueOf(0L), Long.valueOf(0L) }, DeliverGiftMsg.class);
  public final PBStringField string_animation_content = PBField.initString("");
  public final PBStringField string_gray_tip_content = PBField.initString("");
  public final PBStringField string_remind_brief = PBField.initString("");
  public final PBUInt64Field uint64_receiver_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_sender_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$DeliverGiftMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */