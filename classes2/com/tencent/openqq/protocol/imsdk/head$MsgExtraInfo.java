package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$MsgExtraInfo
  extends MessageMicro<MsgExtraInfo>
{
  public static final int BYTES_FROM_UIN_NICK_FIELD_NUMBER = 12;
  public static final int BYTES_IDENTIFIER_FIELD_NUMBER = 11;
  public static final int MSG_DESTROY_TIME_CONFIG_FIELD_NUMBER = 3;
  public static final int MSG_ENCRYPT_INFO_FIELD_NUMBER = 8;
  public static final int MSG_UIN_EXTRA_INFO_FIELD_NUMBER = 4;
  public static final int UINT32_MSG_COMPATIBILITY_TYPE_FIELD_NUMBER = 6;
  public static final int UINT32_MSG_LIFETIME_FIELD_NUMBER = 2;
  public static final int UINT32_MSG_PRIORITY_FIELD_NUMBER = 10;
  public static final int UINT32_MUTLI_INST_SYNC_FIELD_NUMBER = 9;
  public static final int UINT32_NOTIFY_FLAG_FIELD_NUMBER = 1;
  public static final int UINT32_PLACE_MSG_FIELD_NUMBER = 5;
  public static final int UINT32_SYNC_FROM_OLD_SYSTEM_FIELD_NUMBER = 7;
  public static final int UINT64_STAT_FLAG_FIELD_NUMBER = 13;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_from_uin_nick = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_identifier = PBField.initBytes(ByteStringMicro.EMPTY);
  public head.MsgDestroyTimeConfigInfo msg_destroy_time_config = new head.MsgDestroyTimeConfigInfo();
  public head.MsgEncryptInfo msg_encrypt_info = new head.MsgEncryptInfo();
  public head.UinExtaInfo msg_uin_extra_info = new head.UinExtaInfo();
  public final PBUInt32Field uint32_msg_compatibility_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_msg_lifetime = PBField.initUInt32(0);
  public final PBUInt32Field uint32_msg_priority = PBField.initUInt32(0);
  public final PBUInt32Field uint32_mutli_inst_sync = PBField.initUInt32(0);
  public final PBUInt32Field uint32_notify_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_place_msg = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sync_from_old_system = PBField.initUInt32(0);
  public final PBUInt64Field uint64_stat_flag = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34, 40, 48, 56, 66, 72, 80, 90, 98, 104 }, new String[] { "uint32_notify_flag", "uint32_msg_lifetime", "msg_destroy_time_config", "msg_uin_extra_info", "uint32_place_msg", "uint32_msg_compatibility_type", "uint32_sync_from_old_system", "msg_encrypt_info", "uint32_mutli_inst_sync", "uint32_msg_priority", "bytes_identifier", "bytes_from_uin_nick", "uint64_stat_flag" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), null, null, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, Long.valueOf(0L) }, MsgExtraInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$MsgExtraInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */