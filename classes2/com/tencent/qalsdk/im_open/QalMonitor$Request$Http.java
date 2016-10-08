package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBoolField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class QalMonitor$Request$Http
  extends MessageMicro<Http>
{
  public static final int APN_FIELD_NUMBER = 7;
  public static final int CACHE_COST_FIELD_NUMBER = 3;
  public static final int CODE_FIELD_NUMBER = 5;
  public static final int ERRMSG_FIELD_NUMBER = 11;
  public static final int GATEWAY_IP_FIELD_NUMBER = 10;
  public static final int HIT_CACHE_FIELD_NUMBER = 6;
  public static final int RADIO_ACCESS_FIELD_NUMBER = 8;
  public static final int SERVER_IP_FIELD_NUMBER = 9;
  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  public static final int TOTAL_COST_FIELD_NUMBER = 4;
  public static final int URI_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 32, 40, 48, 58, 64, 74, 82, 90 }, new String[] { "timestamp", "uri", "cache_cost", "total_cost", "code", "hit_cache", "apn", "radio_access", "server_ip", "gateway_ip", "errmsg" }, new Object[] { Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Boolean.valueOf(false), "", Integer.valueOf(0), "", "", "" }, Http.class);
  public final PBStringField apn = PBField.initString("");
  public final PBInt32Field cache_cost = PBField.initInt32(0);
  public final PBInt32Field code = PBField.initInt32(0);
  public final PBStringField errmsg = PBField.initString("");
  public final PBStringField gateway_ip = PBField.initString("");
  public final PBBoolField hit_cache = PBField.initBool(false);
  public final PBInt32Field radio_access = PBField.initInt32(0);
  public final PBStringField server_ip = PBField.initString("");
  public final PBUInt32Field timestamp = PBField.initUInt32(0);
  public final PBInt32Field total_cost = PBField.initInt32(0);
  public final PBStringField uri = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\QalMonitor$Request$Http.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */