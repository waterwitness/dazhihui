package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class stat_reg$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int BYTES_BIND_QQ_KEY_FIELD_NUMBER = 17;
  public static final int BYTES_GUID_FIELD_NUMBER = 7;
  public static final int BYTES_VENDOR_DATA_FIELD_NUMBER = 15;
  public static final int STR_BUILD_VER_FIELD_NUMBER = 13;
  public static final int STR_DEV_NAME_FIELD_NUMBER = 10;
  public static final int STR_DEV_TYPE_FIELD_NUMBER = 11;
  public static final int STR_FIRMWARE_VER_FIELD_NUMBER = 14;
  public static final int STR_OS_VER_FIELD_NUMBER = 12;
  public static final int UINT32_CONN_TYPE_FIELD_NUMBER = 2;
  public static final int UINT32_KICK_PC_FIELD_NUMBER = 4;
  public static final int UINT32_LOCALEID_FIELD_NUMBER = 8;
  public static final int UINT32_OPEN_PUSH_FIELD_NUMBER = 19;
  public static final int UINT32_REGTYPE_FIELD_NUMBER = 6;
  public static final int UINT32_SILENT_PUSH_FIELD_NUMBER = 9;
  public static final int UINT32_STATUS_FIELD_NUMBER = 3;
  public static final int UINT32_TIMESTAMP_FIELD_NUMBER = 5;
  public static final int UINT64_BID_FIELD_NUMBER = 1;
  public static final int UINT64_BIND_QQ_FIELD_NUMBER = 16;
  public static final int UINT64_TINYID_FIELD_NUMBER = 20;
  public static final int VENDER_APPID_FIELD_NUMBER = 18;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_bind_qq_key = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_guid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_vendor_data = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_build_ver = PBField.initString("");
  public final PBStringField str_dev_name = PBField.initString("");
  public final PBStringField str_dev_type = PBField.initString("");
  public final PBStringField str_firmware_ver = PBField.initString("");
  public final PBStringField str_os_ver = PBField.initString("");
  public final PBUInt32Field uint32_conn_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_kick_pc = PBField.initUInt32(0);
  public final PBUInt32Field uint32_localeid = PBField.initUInt32(2052);
  public final PBUInt32Field uint32_open_push = PBField.initUInt32(1);
  public final PBUInt32Field uint32_regtype = PBField.initUInt32(0);
  public final PBUInt32Field uint32_silent_push = PBField.initUInt32(0);
  public final PBUInt32Field uint32_status = PBField.initUInt32(11);
  public final PBUInt32Field uint32_timestamp = PBField.initUInt32(0);
  public final PBUInt64Field uint64_bid = PBField.initUInt64(1L);
  public final PBUInt64Field uint64_bind_qq = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_tinyid = PBField.initUInt64(0L);
  public final PBUInt32Field vender_appid = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40, 48, 58, 64, 72, 82, 90, 98, 106, 114, 122, 128, 138, 144, 152, 160 }, new String[] { "uint64_bid", "uint32_conn_type", "uint32_status", "uint32_kick_pc", "uint32_timestamp", "uint32_regtype", "bytes_guid", "uint32_localeid", "uint32_silent_push", "str_dev_name", "str_dev_type", "str_os_ver", "str_build_ver", "str_firmware_ver", "bytes_vendor_data", "uint64_bind_qq", "bytes_bind_qq_key", "vender_appid", "uint32_open_push", "uint64_tinyid" }, new Object[] { Long.valueOf(1L), Integer.valueOf(0), Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro1, Integer.valueOf(2052), Integer.valueOf(0), "", "", "", "", "", localByteStringMicro2, Long.valueOf(0L), localByteStringMicro3, Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(0L) }, ReqBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\stat_reg$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */