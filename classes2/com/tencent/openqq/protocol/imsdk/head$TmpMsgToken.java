package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class head$TmpMsgToken
  extends MessageMicro<TmpMsgToken>
{
  public static final int BYTES_BUF_FIELD_NUMBER = 1;
  public static final int UINT32_C2C_TYPE_FIELD_NUMBER = 2;
  public static final int UINT32_SERVICE_TYPE_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_buf = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_c2c_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_service_type = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 24 }, new String[] { "bytes_buf", "uint32_c2c_type", "uint32_service_type" }, new Object[] { localByteStringMicro, Integer.valueOf(0), Integer.valueOf(0) }, TmpMsgToken.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$TmpMsgToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */