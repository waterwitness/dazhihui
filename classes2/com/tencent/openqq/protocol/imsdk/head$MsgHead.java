package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class head$MsgHead
  extends MessageMicro<MsgHead>
{
  public static final int MSG_CONTENT_HEAD_FIELD_NUMBER = 1;
  public static final int MSG_EXTRA_INFO_FIELD_NUMBER = 4;
  public static final int MSG_QQLOGIN_SIG_FIELD_NUMBER = 3;
  public static final int MSG_ROUTINE_HEAD_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34 }, new String[] { "msg_content_head", "msg_routine_head", "msg_qqlogin_sig", "msg_extra_info" }, new Object[] { null, null, null, null }, MsgHead.class);
  public head.ContentHead msg_content_head = new head.ContentHead();
  public head.MsgExtraInfo msg_extra_info = new head.MsgExtraInfo();
  public head.QQLoginSig msg_qqlogin_sig = new head.QQLoginSig();
  public head.RoutineHead msg_routine_head = new head.RoutineHead();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$MsgHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */