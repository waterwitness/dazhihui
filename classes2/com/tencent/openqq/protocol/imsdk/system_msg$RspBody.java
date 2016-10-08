package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class system_msg$RspBody
  extends MessageMicro<RspBody>
{
  public static final int MSG_CMD_ERROR_CODE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "msg_cmd_error_code" }, new Object[] { null }, RspBody.class);
  public common.CmdErrorCode msg_cmd_error_code = new common.CmdErrorCode();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\system_msg$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */