package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class im_open_common$IMUserId
  extends MessageMicro<IMUserId>
{
  public static final int TINYID_FIELD_NUMBER = 4;
  public static final int UIDTYPE_FIELD_NUMBER = 1;
  public static final int UIN_FIELD_NUMBER = 5;
  public static final int USERAPPID_FIELD_NUMBER = 2;
  public static final int USERID_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBUInt64Field tinyid = PBField.initUInt64(0L);
  public final PBBytesField uidtype = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt64Field uin = PBField.initUInt64(0L);
  public final PBUInt32Field userappid = PBField.initUInt32(0);
  public final PBBytesField userid = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26, 32, 40 }, new String[] { "uidtype", "userappid", "userid", "tinyid", "uin" }, new Object[] { localByteStringMicro1, Integer.valueOf(0), localByteStringMicro2, Long.valueOf(0L), Long.valueOf(0L) }, IMUserId.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\im_open_common$IMUserId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */