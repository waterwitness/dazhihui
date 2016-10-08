package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class stat_hello$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int BYTES_GUID_FIELD_NUMBER = 2;
  public static final int STR_DEV_NAME_FIELD_NUMBER = 3;
  public static final int STR_DEV_TYPE_FIELD_NUMBER = 4;
  public static final int STR_FIRMWARE_VER_FIELD_NUMBER = 6;
  public static final int STR_OS_VER_FIELD_NUMBER = 5;
  public static final int UINT32_STATUS_FIELD_NUMBER = 1;
  public static final int VENDER_APPID_FIELD_NUMBER = 7;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_guid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_dev_name = PBField.initString("");
  public final PBStringField str_dev_type = PBField.initString("");
  public final PBStringField str_firmware_ver = PBField.initString("");
  public final PBStringField str_os_ver = PBField.initString("");
  public final PBUInt32Field uint32_status = PBField.initUInt32(11);
  public final PBUInt32Field vender_appid = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34, 42, 50, 56 }, new String[] { "uint32_status", "bytes_guid", "str_dev_name", "str_dev_type", "str_os_ver", "str_firmware_ver", "vender_appid" }, new Object[] { Integer.valueOf(11), localByteStringMicro, "", "", "", "", Integer.valueOf(0) }, ReqBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\stat_hello$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */