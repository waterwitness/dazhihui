package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class common$CmdErrorCode
  extends MessageMicro<CmdErrorCode>
{
  public static final int BYTES_ERR_MSG_FIELD_NUMBER = 2;
  public static final int UINT32_CODE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_err_msg = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_code = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "uint32_code", "bytes_err_msg" }, new Object[] { Integer.valueOf(0), localByteStringMicro }, CmdErrorCode.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\common$CmdErrorCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */