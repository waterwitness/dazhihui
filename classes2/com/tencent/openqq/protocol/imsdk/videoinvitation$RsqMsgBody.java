package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class videoinvitation$RsqMsgBody
  extends MessageMicro<RsqMsgBody>
{
  public static final int RPT_MSG_RESULT_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "rpt_msg_result" }, new Object[] { null }, RsqMsgBody.class);
  public final PBRepeatMessageField<videoinvitation.ProcResult> rpt_msg_result = PBField.initRepeatMessage(videoinvitation.ProcResult.class);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\videoinvitation$RsqMsgBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */