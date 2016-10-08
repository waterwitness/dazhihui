package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class general$RspBody
  extends MessageMicro<RspBody>
{
  public static final int BYTES_RSP_DATA_FIELD_NUMBER = 2;
  public static final int MSG_CMD_ERROR_CODE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_rsp_data = PBField.initBytes(ByteStringMicro.EMPTY);
  public common.CmdErrorCode msg_cmd_error_code = new common.CmdErrorCode();
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "msg_cmd_error_code", "bytes_rsp_data" }, new Object[] { null, localByteStringMicro }, RspBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\general$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */