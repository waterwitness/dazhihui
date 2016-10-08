package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class mobroute$MobRouteSSOListReq
  extends MessageMicro<MobRouteSSOListReq>
{
  public static final int STRING_IMEI_FIELD_NUMBER = 6;
  public static final int STRING_IMSI_FIELD_NUMBER = 3;
  public static final int STRING_UIN_FIELD_NUMBER = 2;
  public static final int UINT32_APPID_FIELD_NUMBER = 5;
  public static final int UINT32_NETTYPE_FIELD_NUMBER = 4;
  public static final int UINT32_UINTYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 40, 50 }, new String[] { "uint32_uintype", "string_uin", "string_imsi", "uint32_nettype", "uint32_appid", "string_imei" }, new Object[] { Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "" }, MobRouteSSOListReq.class);
  public final PBStringField string_imei = PBField.initString("");
  public final PBStringField string_imsi = PBField.initString("");
  public final PBStringField string_uin = PBField.initString("");
  public final PBUInt32Field uint32_appid = PBField.initUInt32(0);
  public final PBUInt32Field uint32_nettype = PBField.initUInt32(0);
  public final PBUInt32Field uint32_uintype = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\mobroute$MobRouteSSOListReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */