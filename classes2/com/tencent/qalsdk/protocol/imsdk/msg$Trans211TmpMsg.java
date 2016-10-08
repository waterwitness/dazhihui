package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$Trans211TmpMsg
  extends MessageMicro<Trans211TmpMsg>
{
  public static final int BYTES_MSG_BODY_FIELD_NUMBER = 1;
  public static final int UINT32_C2C_CMD_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_msg_body = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_c2c_cmd = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "bytes_msg_body", "uint32_c2c_cmd" }, new Object[] { localByteStringMicro, Integer.valueOf(0) }, Trans211TmpMsg.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$Trans211TmpMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */