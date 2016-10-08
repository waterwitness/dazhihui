package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class head$MsgDestroyTimeConfigInfo
  extends MessageMicro<MsgDestroyTimeConfigInfo>
{
  public static final int MSG_CLIENT_TIME_CONFIG_FIELD_NUMBER = 1;
  public static final int MSG_SERVER_TIME_CONFIG_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "msg_client_time_config", "msg_server_time_config" }, new Object[] { null, null }, MsgDestroyTimeConfigInfo.class);
  public head.MsgDestroyTimeInfo msg_client_time_config = new head.MsgDestroyTimeInfo();
  public head.MsgDestroyTimeInfo msg_server_time_config = new head.MsgDestroyTimeInfo();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$MsgDestroyTimeConfigInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */