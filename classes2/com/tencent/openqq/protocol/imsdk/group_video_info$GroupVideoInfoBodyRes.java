package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class group_video_info$GroupVideoInfoBodyRes
  extends MessageMicro<GroupVideoInfoBodyRes>
{
  public static final int MSG_PUSH_RES_FIELD_NUMBER = 2;
  public static final int MSG_RECORD_RES_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "msg_record_res", "msg_push_res" }, new Object[] { null, null }, GroupVideoInfoBodyRes.class);
  public group_video_info.VideoPushRes msg_push_res = new group_video_info.VideoPushRes();
  public group_video_info.VideoRecordRes msg_record_res = new group_video_info.VideoRecordRes();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\group_video_info$GroupVideoInfoBodyRes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */