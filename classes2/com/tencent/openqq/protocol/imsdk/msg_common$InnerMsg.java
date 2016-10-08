package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class msg_common$InnerMsg
  extends MessageMicro<InnerMsg>
{
  public static final int MSG_HEAD_FIELD_NUMBER = 1;
  public static final int MSG_MSG_BODY_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "msg_head", "msg_msg_body" }, new Object[] { null, null }, InnerMsg.class);
  public head.Head msg_head = new head.Head();
  public msg.MsgBody msg_msg_body = new msg.MsgBody();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg_common$InnerMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */