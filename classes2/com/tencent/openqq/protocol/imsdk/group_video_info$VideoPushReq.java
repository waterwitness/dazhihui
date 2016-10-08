package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class group_video_info$VideoPushReq
  extends MessageMicro<VideoPushReq>
{
  public static final int STR_CHANNEL_DESCRIBE_FIELD_NUMBER = 5;
  public static final int STR_CHANNEL_NAME_FIELD_NUMBER = 4;
  public static final int STR_PLAYER_PWD_FIELD_NUMBER = 6;
  public static final int UINT32_LIVE_CODE_FIELD_NUMBER = 2;
  public static final int UINT32_OPER_FIELD_NUMBER = 1;
  public static final int UINT32_SDK_TYPE_FIELD_NUMBER = 3;
  public static final int UINT64_CHANNEL_ID_FIELD_NUMBER = 7;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 34, 42, 50, 56 }, new String[] { "uint32_oper", "uint32_live_code", "uint32_sdk_type", "str_channel_name", "str_channel_describe", "str_player_pwd", "uint64_channel_id" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", "", "", Long.valueOf(0L) }, VideoPushReq.class);
  public final PBStringField str_channel_describe = PBField.initString("");
  public final PBStringField str_channel_name = PBField.initString("");
  public final PBStringField str_player_pwd = PBField.initString("");
  public final PBUInt32Field uint32_live_code = PBField.initUInt32(0);
  public final PBUInt32Field uint32_oper = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sdk_type = PBField.initUInt32(0);
  public final PBRepeatField<Long> uint64_channel_id = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\group_video_info$VideoPushReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */