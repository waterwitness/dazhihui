package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class log_upload_pb$MsgBody
  extends MessageMicro<MsgBody>
{
  public static final int RPT_STRING_LOGTIME_FIELD_NUMBER = 2;
  public static final int RPT_STRING_TAG_FIELD_NUMBER = 3;
  public static final int RPT_UINT64_LOGTIME_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "rpt_uint64_logtime", "rpt_string_logtime", "rpt_string_tag" }, new Object[] { Long.valueOf(0L), "", "" }, MsgBody.class);
  public final PBRepeatField<String> rpt_string_logtime = PBField.initRepeat(PBStringField.__repeatHelper__);
  public final PBStringField rpt_string_tag = PBField.initString("");
  public final PBRepeatField<Long> rpt_uint64_logtime = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\log_upload_pb$MsgBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */