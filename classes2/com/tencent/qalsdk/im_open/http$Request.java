package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;

public final class http$Request
  extends MessageMicro<Request>
{
  public static final int ACCEPT_CHARSET_FIELD_NUMBER = 13;
  public static final int ACCEPT_FIELD_NUMBER = 11;
  public static final int ACCEPT_LANGUAGE_FIELD_NUMBER = 12;
  public static final int BODY_FIELD_NUMBER = 47;
  public static final int CACHE_CONTROL_FIELD_NUMBER = 35;
  public static final int CONTENT_TYPE_FIELD_NUMBER = 3;
  public static final int COOKIE_FIELD_NUMBER = 21;
  public static final int IF_MATCH_FIELD_NUMBER = 34;
  public static final int IF_MODIFIED_SINCE_FIELD_NUMBER = 31;
  public static final int IF_NONE_MATCH_FIELD_NUMBER = 33;
  public static final int IF_RANGE_FIELD_NUMBER = 37;
  public static final int IF_UNMODIFIED_SINCE_FIELD_NUMBER = 32;
  public static final int METHOD_FIELD_NUMBER = 2;
  public static final int ORIGIN_FIELD_NUMBER = 23;
  public static final int OTHER_HEADERS_FIELD_NUMBER = 45;
  public static final int PRAGMA_FIELD_NUMBER = 36;
  public static final int PRIVATE_REQUST_FIELD_NUMBER = 48;
  public static final int REFERER_FIELD_NUMBER = 22;
  public static final int URI_FIELD_NUMBER = 1;
  public static final int USER_AGENT_FIELD_NUMBER = 20;
  public static final int X_REQUESTED_WITH_FIELD_NUMBER = 24;
  public static final int X_WWW_FORM_FIELD_NUMBER = 46;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBStringField accept = PBField.initString("*/*");
  public final PBStringField accept_charset = PBField.initString("");
  public final PBStringField accept_language = PBField.initString("");
  public final PBBytesField body = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBRepeatField<String> cache_control = PBField.initRepeat(PBStringField.__repeatHelper__);
  public final PBStringField content_type = PBField.initString("");
  public final PBStringField cookie = PBField.initString("");
  public final PBStringField if_match = PBField.initString("");
  public final PBStringField if_modified_since = PBField.initString("");
  public final PBStringField if_none_match = PBField.initString("");
  public final PBStringField if_range = PBField.initString("");
  public final PBStringField if_unmodified_since = PBField.initString("");
  public final PBEnumField method = PBField.initEnum(1);
  public final PBStringField origin = PBField.initString("");
  public final PBRepeatMessageField<http.Pair> other_headers = PBField.initRepeatMessage(http.Pair.class);
  public final PBStringField pragma = PBField.initString("");
  public http.RequestPrivate private_requst = new http.RequestPrivate();
  public final PBStringField referer = PBField.initString("");
  public final PBStringField uri = PBField.initString("");
  public final PBStringField user_agent = PBField.initString("");
  public final PBStringField x_requested_with = PBField.initString("");
  public final PBRepeatMessageField<http.PairBytes> x_www_form = PBField.initRepeatMessage(http.PairBytes.class);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26, 90, 98, 106, 162, 170, 178, 186, 194, 250, 258, 266, 274, 282, 290, 298, 362, 370, 378, 386 }, new String[] { "uri", "method", "content_type", "accept", "accept_language", "accept_charset", "user_agent", "cookie", "referer", "origin", "x_requested_with", "if_modified_since", "if_unmodified_since", "if_none_match", "if_match", "cache_control", "pragma", "if_range", "other_headers", "x_www_form", "body", "private_requst" }, new Object[] { "", Integer.valueOf(1), "", "*/*", "", "", "", "", "", "", "", "", "", "", "", "", "", "", null, null, localByteStringMicro, null }, Request.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\http$Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */