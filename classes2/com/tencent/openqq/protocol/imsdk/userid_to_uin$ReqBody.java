package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class userid_to_uin$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int OPENAPPID_FIELD_NUMBER = 2;
  public static final int OPENID_FIELD_NUMBER = 3;
  public static final int UIDTYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBUInt32Field openappid = PBField.initUInt32(0);
  public final PBRepeatField<ByteStringMicro> openid = PBField.initRepeat(PBBytesField.__repeatHelper__);
  public final PBBytesField uidtype = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26 }, new String[] { "uidtype", "openappid", "openid" }, new Object[] { localByteStringMicro1, Integer.valueOf(0), localByteStringMicro2 }, ReqBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\userid_to_uin$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */