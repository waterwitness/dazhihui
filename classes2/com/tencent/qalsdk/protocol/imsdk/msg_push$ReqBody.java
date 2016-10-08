package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg_push$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int BYTES_SESSION_DATA_FIELD_NUMBER = 2;
  public static final int MSG_MSG_FIELD_NUMBER = 1;
  public static final int UINT32_FLAG_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_session_data = PBField.initBytes(ByteStringMicro.EMPTY);
  public msg_common.Msg msg_msg = new msg_common.Msg();
  public final PBUInt32Field uint32_flag = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 24 }, new String[] { "msg_msg", "bytes_session_data", "uint32_flag" }, new Object[] { null, localByteStringMicro, Integer.valueOf(0) }, ReqBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg_push$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */