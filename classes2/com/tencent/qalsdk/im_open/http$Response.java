package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class http$Response
  extends MessageMicro<Response>
{
  public static final int AGE_FIELD_NUMBER = 21;
  public static final int BODY_FIELD_NUMBER = 42;
  public static final int CACHE_CONTROL_FIELD_NUMBER = 24;
  public static final int CONTENT_TYPE_FIELD_NUMBER = 2;
  public static final int DATE_FIELD_NUMBER = 10;
  public static final int ETAG_FIELD_NUMBER = 23;
  public static final int EXPIRES_FIELD_NUMBER = 25;
  public static final int LAST_MODIFIED_FIELD_NUMBER = 22;
  public static final int LOCATION_FIELD_NUMBER = 3;
  public static final int OTHER_HEADERS_FIELD_NUMBER = 41;
  public static final int PRAGMA_FIELD_NUMBER = 26;
  public static final int PRIVATE_RESPONSE_FIELD_NUMBER = 43;
  public static final int SERVER_FIELD_NUMBER = 11;
  public static final int SET_COOKIE_FIELD_NUMBER = 31;
  public static final int STATUS_CODE_FIELD_NUMBER = 1;
  public static final int VIA_FIELD_NUMBER = 12;
  public static final int X_CACHE_FIELD_NUMBER = 13;
  public static final int X_CACHE_LOOKUP_FIELD_NUMBER = 14;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBUInt32Field age = PBField.initUInt32(0);
  public final PBBytesField body = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBRepeatField<String> cache_control = PBField.initRepeat(PBStringField.__repeatHelper__);
  public final PBStringField content_type = PBField.initString("");
  public final PBStringField date = PBField.initString("");
  public final PBStringField etag = PBField.initString("");
  public final PBStringField expires = PBField.initString("");
  public final PBStringField last_modified = PBField.initString("");
  public final PBStringField location = PBField.initString("");
  public final PBRepeatMessageField<http.Pair> other_headers = PBField.initRepeatMessage(http.Pair.class);
  public final PBStringField pragma = PBField.initString("");
  public http.ResponsePrivate private_response = new http.ResponsePrivate();
  public final PBStringField server = PBField.initString("");
  public final PBRepeatField<String> set_cookie = PBField.initRepeat(PBStringField.__repeatHelper__);
  public final PBInt32Field status_code = PBField.initInt32(200);
  public final PBStringField via = PBField.initString("");
  public final PBRepeatField<String> x_cache = PBField.initRepeat(PBStringField.__repeatHelper__);
  public final PBRepeatField<String> x_cache_lookup = PBField.initRepeat(PBStringField.__repeatHelper__);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 82, 90, 98, 106, 114, 168, 178, 186, 194, 202, 210, 250, 330, 338, 346 }, new String[] { "status_code", "content_type", "location", "date", "server", "via", "x_cache", "x_cache_lookup", "age", "last_modified", "etag", "cache_control", "expires", "pragma", "set_cookie", "other_headers", "body", "private_response" }, new Object[] { Integer.valueOf(200), "", "", "", "", "", "", "", Integer.valueOf(0), "", "", "", "", "", "", null, localByteStringMicro, null }, Response.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\http$Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */