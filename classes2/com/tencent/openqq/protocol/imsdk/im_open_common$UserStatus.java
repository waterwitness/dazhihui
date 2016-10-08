package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class im_open_common$UserStatus
  extends MessageMicro<UserStatus>
{
  public static final int NETWORK_TYPE_FIELD_NUMBER = 3;
  public static final int OPENID_FIELD_NUMBER = 1;
  public static final int STATUS_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBUInt32Field network_type = PBField.initUInt32(0);
  public final PBBytesField openid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field status = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 24 }, new String[] { "openid", "status", "network_type" }, new Object[] { localByteStringMicro, Integer.valueOf(0), Integer.valueOf(0) }, UserStatus.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\im_open_common$UserStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */