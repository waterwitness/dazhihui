package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class head$LoginSig
  extends MessageMicro<LoginSig>
{
  public static final int BYTES_SIG_FIELD_NUMBER = 2;
  public static final int UINT32_APP_ID_FIELD_NUMBER = 3;
  public static final int UINT32_TYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_sig = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_app_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_type = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24 }, new String[] { "uint32_type", "bytes_sig", "uint32_app_id" }, new Object[] { Integer.valueOf(0), localByteStringMicro, Integer.valueOf(0) }, LoginSig.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$LoginSig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */