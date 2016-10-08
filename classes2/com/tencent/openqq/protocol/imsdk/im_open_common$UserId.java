package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class im_open_common$UserId
  extends MessageMicro<UserId>
{
  public static final int OPENID_FIELD_NUMBER = 1;
  public static final int UIN_FIELD_NUMBER = 2;
  public static final int UIN_TYPE_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField openid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt64Field uin = PBField.initUInt64(0L);
  public final PBUInt32Field uin_type = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 24 }, new String[] { "openid", "uin", "uin_type" }, new Object[] { localByteStringMicro, Long.valueOf(0L), Integer.valueOf(0) }, UserId.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\im_open_common$UserId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */