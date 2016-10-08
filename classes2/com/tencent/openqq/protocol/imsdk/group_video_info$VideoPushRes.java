package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class group_video_info$VideoPushRes
  extends MessageMicro<VideoPushRes>
{
  public static final int MSG_LIVE_URL_FIELD_NUMBER = 2;
  public static final int STR_ERRORINFO_FIELD_NUMBER = 3;
  public static final int UINT32_RESULT_FIELD_NUMBER = 1;
  public static final int UINT64_CHANNEL_ID_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32 }, new String[] { "uint32_result", "msg_live_url", "str_errorinfo", "uint64_channel_id" }, new Object[] { Integer.valueOf(0), null, "", Long.valueOf(0L) }, VideoPushRes.class);
  public final PBRepeatMessageField<group_video_info.LiveUrl> msg_live_url = PBField.initRepeatMessage(group_video_info.LiveUrl.class);
  public final PBStringField str_errorinfo = PBField.initString("");
  public final PBUInt32Field uint32_result = PBField.initUInt32(0);
  public final PBUInt64Field uint64_channel_id = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\group_video_info$VideoPushRes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */