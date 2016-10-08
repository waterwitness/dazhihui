package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg$LowVersionTips
  extends MessageMicro<LowVersionTips>
{
  public static final int CF_BuddyChatType = 0;
  public static final int CF_DiscussChatType = 3;
  public static final int CF_GroupChatType = 1;
  public static final int CF_TempChatType = 2;
  public static final int CF_UnknownChatType = -1;
  public static final int EBusinessID_ConfScheduleMsg = 1;
  public static final int EBusinessID_DingDongMsg = 2;
  public static final int STR_TEXT_FIELD_NUMBER = 5;
  public static final int UINT32_BUSINESS_ID_FIELD_NUMBER = 1;
  public static final int UINT32_SESSION_TYPE_FIELD_NUMBER = 2;
  public static final int UINT64_SENDER_UIN_FIELD_NUMBER = 4;
  public static final int UINT64_SESSION_UIN_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 42 }, new String[] { "uint32_business_id", "uint32_session_type", "uint64_session_uin", "uint64_sender_uin", "str_text" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), Long.valueOf(0L), "" }, LowVersionTips.class);
  public final PBStringField str_text = PBField.initString("");
  public final PBUInt32Field uint32_business_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_session_type = PBField.initUInt32(0);
  public final PBUInt64Field uint64_sender_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_session_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$LowVersionTips.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */