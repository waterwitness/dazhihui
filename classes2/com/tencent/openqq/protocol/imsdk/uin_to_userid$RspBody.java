package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class uin_to_userid$RspBody
  extends MessageMicro<RspBody>
{
  public static final int ENUM_CMD_ERROR_CODE_FIELD_NUMBER = 1;
  public static final int USERID_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "enum_cmd_error_code", "userid" }, new Object[] { null, null }, RspBody.class);
  public common.CmdErrorCode enum_cmd_error_code = new common.CmdErrorCode();
  public final PBRepeatMessageField<im_open_common.UserId> userid = PBField.initRepeatMessage(im_open_common.UserId.class);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\uin_to_userid$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */