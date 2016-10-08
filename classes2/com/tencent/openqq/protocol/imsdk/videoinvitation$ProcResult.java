package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;

public final class videoinvitation$ProcResult
  extends MessageMicro<ProcResult>
{
  public static final int INT32_RESULT_FIELD_NUMBER = 2;
  public static final int MSG_RECEIVER_INFO_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "msg_receiver_info", "int32_result" }, new Object[] { null, Integer.valueOf(0) }, ProcResult.class);
  public final PBInt32Field int32_result = PBField.initInt32(0);
  public videoinvitation.UserInfo msg_receiver_info = new videoinvitation.UserInfo();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\videoinvitation$ProcResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */