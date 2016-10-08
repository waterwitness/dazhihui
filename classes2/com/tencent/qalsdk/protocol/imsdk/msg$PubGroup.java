package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$PubGroup
  extends MessageMicro<PubGroup>
{
  public static final int BYTES_NICKNAME_FIELD_NUMBER = 1;
  public static final int UINT32_AGE_FIELD_NUMBER = 3;
  public static final int UINT32_DISTANCE_FIELD_NUMBER = 4;
  public static final int UINT32_GENDER_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_nickname = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_age = PBField.initUInt32(0);
  public final PBUInt32Field uint32_distance = PBField.initUInt32(0);
  public final PBUInt32Field uint32_gender = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 24, 32 }, new String[] { "bytes_nickname", "uint32_gender", "uint32_age", "uint32_distance" }, new Object[] { localByteStringMicro, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, PubGroup.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$PubGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */