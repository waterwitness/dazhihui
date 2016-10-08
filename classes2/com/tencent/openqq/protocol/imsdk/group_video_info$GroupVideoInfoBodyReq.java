package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class group_video_info$GroupVideoInfoBodyReq
  extends MessageMicro<GroupVideoInfoBodyReq>
{
  public static final int MSG_PUSH_REQ_FIELD_NUMBER = 7;
  public static final int MSG_RECORD_REQ_FIELD_NUMBER = 6;
  public static final int UINT32_AUTH_KEY_FIELD_NUMBER = 3;
  public static final int UINT32_AUTH_TYPE_FIELD_NUMBER = 2;
  public static final int UINT32_BUSS_TYPE_FIELD_NUMBER = 1;
  public static final int UINT32_SDK_APPID_FIELD_NUMBER = 5;
  public static final int UINT64_UIN_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40, 50, 58 }, new String[] { "uint32_buss_type", "uint32_auth_type", "uint32_auth_key", "uint64_uin", "uint32_sdk_appid", "msg_record_req", "msg_push_req" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0), null, null }, GroupVideoInfoBodyReq.class);
  public group_video_info.VideoPushReq msg_push_req = new group_video_info.VideoPushReq();
  public group_video_info.VideoRecordReq msg_record_req = new group_video_info.VideoRecordReq();
  public final PBUInt32Field uint32_auth_key = PBField.initUInt32(0);
  public final PBUInt32Field uint32_auth_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_buss_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sdk_appid = PBField.initUInt32(0);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\group_video_info$GroupVideoInfoBodyReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */