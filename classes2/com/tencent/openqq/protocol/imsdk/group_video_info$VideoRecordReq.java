package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class group_video_info$VideoRecordReq
  extends MessageMicro<VideoRecordReq>
{
  public static final int STRING_FILE_NAME_FIELD_NUMBER = 3;
  public static final int STRING_TAGS_FIELD_NUMBER = 4;
  public static final int UINT32_CLASSID_FIELD_NUMBER = 5;
  public static final int UINT32_ISSCREENSHOT_FIELD_NUMBER = 7;
  public static final int UINT32_ISTRANSCODE_FIELD_NUMBER = 6;
  public static final int UINT32_ISWATERMARK_FIELD_NUMBER = 8;
  public static final int UINT32_OPER_FIELD_NUMBER = 1;
  public static final int UINT32_SDK_TYPE_FIELD_NUMBER = 9;
  public static final int UINT32_SEQ_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34, 40, 48, 56, 64, 72 }, new String[] { "uint32_oper", "uint32_seq", "string_file_name", "string_tags", "uint32_classid", "uint32_IsTransCode", "uint32_IsScreenShot", "uint32_IsWaterMark", "uint32_sdk_type" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, VideoRecordReq.class);
  public final PBStringField string_file_name = PBField.initString("");
  public final PBRepeatField<String> string_tags = PBField.initRepeat(PBStringField.__repeatHelper__);
  public final PBUInt32Field uint32_IsScreenShot = PBField.initUInt32(0);
  public final PBUInt32Field uint32_IsTransCode = PBField.initUInt32(0);
  public final PBUInt32Field uint32_IsWaterMark = PBField.initUInt32(0);
  public final PBUInt32Field uint32_classid = PBField.initUInt32(0);
  public final PBUInt32Field uint32_oper = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sdk_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\group_video_info$VideoRecordReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */