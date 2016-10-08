package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$AnonymousGroupMsg
  extends MessageMicro<AnonymousGroupMsg>
{
  public static final int STR_ANON_ID_FIELD_NUMBER = 2;
  public static final int STR_ANON_NICK_FIELD_NUMBER = 3;
  public static final int UINT32_BUBBLE_ID_FIELD_NUMBER = 6;
  public static final int UINT32_EXPIRE_TIME_FIELD_NUMBER = 5;
  public static final int UINT32_FLAGS_FIELD_NUMBER = 1;
  public static final int UINT32_HEAD_PORTRAIT_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField str_anon_id = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField str_anon_nick = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_bubble_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_expire_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_flags = PBField.initUInt32(0);
  public final PBUInt32Field uint32_head_portrait = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 40, 48 }, new String[] { "uint32_flags", "str_anon_id", "str_anon_nick", "uint32_head_portrait", "uint32_expire_time", "uint32_bubble_id" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, AnonymousGroupMsg.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$AnonymousGroupMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */