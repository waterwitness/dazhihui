package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class mobroute$MobRouteSSOListInfo
  extends MessageMicro<MobRouteSSOListInfo>
{
  public static final int STRING_IP_FIELD_NUMBER = 1;
  public static final int UINT32_PORT_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "string_ip", "uint32_port" }, new Object[] { "", Integer.valueOf(0) }, MobRouteSSOListInfo.class);
  public final PBStringField string_ip = PBField.initString("");
  public final PBUInt32Field uint32_port = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\mobroute$MobRouteSSOListInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */