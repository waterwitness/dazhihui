package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class uin_to_userid$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int OPENAPPID_FIELD_NUMBER = 2;
  public static final int UIDTYPE_FIELD_NUMBER = 1;
  public static final int UIN_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBUInt32Field openappid = PBField.initUInt32(0);
  public final PBBytesField uidtype = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBRepeatField<Long> uin = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 24 }, new String[] { "uidtype", "openappid", "uin" }, new Object[] { localByteStringMicro, Integer.valueOf(0), Long.valueOf(0L) }, ReqBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\uin_to_userid$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */