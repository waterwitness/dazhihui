package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class system_msg$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int MSG_INVITE_QQ_INFO_FIELD_NUMBER = 3;
  public static final int MSG_MSG_HEAD_FIELD_NUMBER = 1;
  public static final int UINT32_OP_TYPE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26 }, new String[] { "msg_msg_head", "uint32_op_type", "msg_invite_qq_info" }, new Object[] { null, Integer.valueOf(0), null }, ReqBody.class);
  public system_msg.InviteQQToMultiSharp msg_invite_qq_info = new system_msg.InviteQQToMultiSharp();
  public head.MsgHead msg_msg_head = new head.MsgHead();
  public final PBUInt32Field uint32_op_type = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\system_msg$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */