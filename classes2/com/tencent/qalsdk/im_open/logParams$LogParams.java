package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class logParams$LogParams
  extends MessageMicro<LogParams>
{
  public static final int APN_4G = 2;
  public static final int APN_ALL = 8;
  public static final int APN_FIELD_NUMBER = 3;
  public static final int APN_WIFI = 1;
  public static final int AUTHORIZATION_FIELD_NUMBER = 2;
  public static final int BEGTIME_FIELD_NUMBER = 4;
  public static final int ENDTIME_FIELD_NUMBER = 5;
  public static final int LOGTYPE_FIELD_NUMBER = 6;
  public static final int SEQ_FIELD_NUMBER = 7;
  public static final int TYPE_ALL = 3;
  public static final int TYPE_APP = 2;
  public static final int TYPE_SDK = 1;
  public static final int URL_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 24, 32, 40, 48, 56 }, new String[] { "url", "authorization", "apn", "begtime", "endtime", "logtype", "seq" }, new Object[] { "", "", Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3), Integer.valueOf(0) }, LogParams.class);
  public final PBEnumField apn = PBField.initEnum(1);
  public final PBStringField authorization = PBField.initString("");
  public final PBUInt32Field begtime = PBField.initUInt32(0);
  public final PBUInt32Field endtime = PBField.initUInt32(0);
  public final PBEnumField logtype = PBField.initEnum(3);
  public final PBUInt32Field seq = PBField.initUInt32(0);
  public final PBStringField url = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\logParams$LogParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */