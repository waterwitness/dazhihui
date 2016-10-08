package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class QalMonitor$Request$Conn
  extends MessageMicro<Conn>
{
  public static final int APN_FIELD_NUMBER = 8;
  public static final int COST_TIME_FIELD_NUMBER = 2;
  public static final int ENV_FIELD_NUMBER = 15;
  public static final int ERRCODE_FIELD_NUMBER = 13;
  public static final int ERRMSG_FIELD_NUMBER = 14;
  public static final int GATEWAY_IP_FIELD_NUMBER = 11;
  public static final int OS_FIELD_NUMBER = 4;
  public static final int OS_VERSION_FIELD_NUMBER = 5;
  public static final int PROCESS_STATUS_FIELD_NUMBER = 7;
  public static final int RADIO_ACCESS_FIELD_NUMBER = 12;
  public static final int RESULT_FIELD_NUMBER = 3;
  public static final int SDK_VERSION_FIELD_NUMBER = 6;
  public static final int SERVER_IP_PORT_FIELD_NUMBER = 10;
  public static final int SSID_FIELD_NUMBER = 9;
  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 42, 50, 56, 66, 74, 82, 90, 96, 104, 114, 122 }, new String[] { "timestamp", "cost_time", "result", "os", "os_version", "sdk_version", "process_status", "apn", "ssid", "server_ip_port", "gateway_ip", "radio_access", "errcode", "errmsg", "env" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1), "", "", Integer.valueOf(1), "", "", "", "", Integer.valueOf(0), Integer.valueOf(0), "", null }, Conn.class);
  public final PBStringField apn = PBField.initString("");
  public final PBInt32Field cost_time = PBField.initInt32(0);
  public final PBRepeatMessageField<QalMonitor.Request.Environment> env = PBField.initRepeatMessage(QalMonitor.Request.Environment.class);
  public final PBInt32Field errcode = PBField.initInt32(0);
  public final PBStringField errmsg = PBField.initString("");
  public final PBStringField gateway_ip = PBField.initString("");
  public final PBEnumField os = PBField.initEnum(1);
  public final PBStringField os_version = PBField.initString("");
  public final PBEnumField process_status = PBField.initEnum(1);
  public final PBInt32Field radio_access = PBField.initInt32(0);
  public final PBEnumField result = PBField.initEnum(1);
  public final PBStringField sdk_version = PBField.initString("");
  public final PBStringField server_ip_port = PBField.initString("");
  public final PBStringField ssid = PBField.initString("");
  public final PBUInt32Field timestamp = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\QalMonitor$Request$Conn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */