package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class relay$RspBody
  extends MessageMicro<RspBody>
{
  public static final int ENUM_CMD_ERROR_CODE_FIELD_NUMBER = 1;
  public static final int RSPBODY_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public common.CmdErrorCode enum_cmd_error_code = new common.CmdErrorCode();
  public final PBBytesField rspbody = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "enum_cmd_error_code", "rspbody" }, new Object[] { null, localByteStringMicro }, RspBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\relay$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */