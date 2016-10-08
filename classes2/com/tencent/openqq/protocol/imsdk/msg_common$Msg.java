package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class msg_common$Msg
  extends MessageMicro<Msg>
{
  public static final int MSG_MSG_BODY_FIELD_NUMBER = 2;
  public static final int MSG_MSG_HEAD_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "msg_msg_head", "msg_msg_body" }, new Object[] { null, null }, Msg.class);
  public msg.MsgBody msg_msg_body = new msg.MsgBody();
  public head.MsgHead msg_msg_head = new head.MsgHead();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg_common$Msg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */