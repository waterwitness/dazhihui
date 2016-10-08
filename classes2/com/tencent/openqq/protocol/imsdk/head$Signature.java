package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class head$Signature
  extends MessageMicro<Signature>
{
  public static final int BYTES_SESSION_KEY_FIELD_NUMBER = 3;
  public static final int UINT32_KEY_TYPE_FIELD_NUMBER = 1;
  public static final int UINT32_SESSION_APP_ID_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_session_key = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_key_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_session_app_id = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "uint32_key_type", "uint32_session_app_id", "bytes_session_key" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro }, Signature.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$Signature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */