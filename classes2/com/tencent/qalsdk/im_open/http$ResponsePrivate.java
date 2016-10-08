package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt64Field;
import com.tencent.mobileqq.pb.PBStringField;

public final class http$ResponsePrivate
  extends MessageMicro<ResponsePrivate>
{
  public static final int BODY_ENCODING_FIELD_NUMBER = 3;
  public static final int CACHE_MAX_AGE_FIELD_NUMBER = 1;
  public static final int CACHE_MAX_STALE_AGE_FIELD_NUMBER = 2;
  public static final int CHUNK_START_FIELD_NUMBER = 9;
  public static final int CONTENT_CHARSET_FIELD_NUMBER = 5;
  public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
  public static final int RAW_TOTAL_LENGTH_FIELD_NUMBER = 8;
  public static final int REQUEST_CHUNK_FIELD_NUMBER = 6;
  public static final int TOTAL_LENGTH_FIELD_NUMBER = 7;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 34, 42, 48, 56, 64, 72 }, new String[] { "cache_max_age", "cache_max_stale_age", "body_encoding", "content_type", "content_charset", "request_chunk", "total_length", "raw_total_length", "chunk_start" }, new Object[] { Long.valueOf(-1L), Long.valueOf(-1L), Integer.valueOf(1), "", "utf-8", Integer.valueOf(2), Long.valueOf(-1L), Long.valueOf(-1L), Long.valueOf(-1L) }, ResponsePrivate.class);
  public final PBEnumField body_encoding = PBField.initEnum(1);
  public final PBInt64Field cache_max_age = PBField.initInt64(-1L);
  public final PBInt64Field cache_max_stale_age = PBField.initInt64(-1L);
  public final PBInt64Field chunk_start = PBField.initInt64(-1L);
  public final PBStringField content_charset = PBField.initString("utf-8");
  public final PBStringField content_type = PBField.initString("");
  public final PBInt64Field raw_total_length = PBField.initInt64(-1L);
  public final PBEnumField request_chunk = PBField.initEnum(2);
  public final PBInt64Field total_length = PBField.initInt64(-1L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\http$ResponsePrivate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */