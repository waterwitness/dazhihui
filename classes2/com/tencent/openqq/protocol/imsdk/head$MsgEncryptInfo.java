package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$MsgEncryptInfo
  extends MessageMicro<MsgEncryptInfo>
{
  public static final int BYTES_AUTH_KEY_FIELD_NUMBER = 4;
  public static final int BYTES_MSG_DIGEST_FIELD_NUMBER = 2;
  public static final int UINT32_ENCRYPT_FLAG_FIELD_NUMBER = 1;
  public static final int UINT64_AUTH_KEY_ID_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_auth_key = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_msg_digest = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_encrypt_flag = PBField.initUInt32(0);
  public final PBUInt64Field uint64_auth_key_id = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 34 }, new String[] { "uint32_encrypt_flag", "bytes_msg_digest", "uint64_auth_key_id", "bytes_auth_key" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, Long.valueOf(0L), localByteStringMicro2 }, MsgEncryptInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$MsgEncryptInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */