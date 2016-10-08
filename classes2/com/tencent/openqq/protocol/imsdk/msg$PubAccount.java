package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class msg$PubAccount
  extends MessageMicro<PubAccount>
{
  public static final int BYTES_BUF_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_buf = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "bytes_buf" }, new Object[] { localByteStringMicro }, PubAccount.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$PubAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */