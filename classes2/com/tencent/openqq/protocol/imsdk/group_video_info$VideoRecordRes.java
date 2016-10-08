package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class group_video_info$VideoRecordRes
  extends MessageMicro<VideoRecordRes>
{
  public static final int STR_ERRORINFO_FIELD_NUMBER = 2;
  public static final int STR_FILEID_FIELD_NUMBER = 3;
  public static final int UINT32_RESULT_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint32_result", "str_errorinfo", "str_fileID" }, new Object[] { Integer.valueOf(0), "", "" }, VideoRecordRes.class);
  public final PBStringField str_errorinfo = PBField.initString("");
  public final PBRepeatField<String> str_fileID = PBField.initRepeat(PBStringField.__repeatHelper__);
  public final PBUInt32Field uint32_result = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\group_video_info$VideoRecordRes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */