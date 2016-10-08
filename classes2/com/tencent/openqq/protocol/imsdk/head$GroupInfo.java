package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$GroupInfo
  extends MessageMicro<GroupInfo>
{
  public static final int BYTES_FROM_UIN_HEADURL_FIELD_NUMBER = 11;
  public static final int BYTES_FROM_UIN_NICK_FIELD_NUMBER = 5;
  public static final int BYTES_GROUP_ID_FIELD_NUMBER = 12;
  public static final int BYTES_GROUP_NAME_FIELD_NUMBER = 8;
  public static final int ENUM_FROM_UIN_TYPE_FIELD_NUMBER = 3;
  public static final int ENUM_TO_UIN_TYPE_FIELD_NUMBER = 4;
  public static final int MSG_FROM_UIN_EXTRA_INFO_FIELD_NUMBER = 14;
  public static final int UINT32_MSG_FLAG_FIELD_NUMBER = 13;
  public static final int UINT64_FROM_UIN_BINDED_FIELD_NUMBER = 9;
  public static final int UINT64_FROM_UIN_FIELD_NUMBER = 1;
  public static final int UINT64_GROUP_CODE_FIELD_NUMBER = 7;
  public static final int UINT64_GROUP_UIN_FIELD_NUMBER = 6;
  public static final int UINT64_TO_UIN_BINDED_FIELD_NUMBER = 10;
  public static final int UINT64_TO_UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_from_uin_headurl = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_from_uin_nick = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_group_id = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_group_name = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBEnumField enum_from_uin_type = PBField.initEnum(1);
  public final PBEnumField enum_to_uin_type = PBField.initEnum(1);
  public head.UinExtaInfo msg_from_uin_extra_info = new head.UinExtaInfo();
  public final PBUInt32Field uint32_msg_flag = PBField.initUInt32(0);
  public final PBUInt64Field uint64_from_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_from_uin_binded = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_group_code = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_group_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_to_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_to_uin_binded = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 42, 48, 56, 66, 72, 80, 90, 98, 104, 114 }, new String[] { "uint64_from_uin", "uint64_to_uin", "enum_from_uin_type", "enum_to_uin_type", "bytes_from_uin_nick", "uint64_group_uin", "uint64_group_code", "bytes_group_name", "uint64_from_uin_binded", "uint64_to_uin_binded", "bytes_from_uin_headurl", "bytes_group_id", "uint32_msg_flag", "msg_from_uin_extra_info" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), Integer.valueOf(1), Integer.valueOf(1), localByteStringMicro1, Long.valueOf(0L), Long.valueOf(0L), localByteStringMicro2, Long.valueOf(0L), Long.valueOf(0L), localByteStringMicro3, localByteStringMicro4, Integer.valueOf(0), null }, GroupInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$GroupInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */