package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt64Field;

public final class http$RequestPrivate
  extends MessageMicro<RequestPrivate>
{
  public static final int CHUNK_END_FIELD_NUMBER = 2;
  public static final int CHUNK_START_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16 }, new String[] { "chunk_start", "chunk_end" }, new Object[] { Long.valueOf(-1L), Long.valueOf(-1L) }, RequestPrivate.class);
  public final PBInt64Field chunk_end = PBField.initInt64(-1L);
  public final PBInt64Field chunk_start = PBField.initInt64(-1L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\http$RequestPrivate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */