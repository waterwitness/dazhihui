package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class quality_report$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int MSG_COMMON_INFO_FIELD_NUMBER = 5;
  public static final int MSG_REPORT_CONTENT_FIELD_NUMBER = 6;
  public static final int UINT32_SDKAPPID_FIELD_NUMBER = 1;
  public static final int UINT32_SEQ_FIELD_NUMBER = 4;
  public static final int UINT32_TIMESTAMP_FIELD_NUMBER = 3;
  public static final int UINT64_FROM_UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 42, 50 }, new String[] { "uint32_sdkappid", "uint64_from_uin", "uint32_timestamp", "uint32_seq", "msg_common_info", "msg_report_content" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), null, null }, ReqBody.class);
  public quality_report.CommonInfo msg_common_info = new quality_report.CommonInfo();
  public quality_report.ReportContent msg_report_content = new quality_report.ReportContent();
  public final PBUInt32Field uint32_sdkappid = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
  public final PBUInt32Field uint32_timestamp = PBField.initUInt32(0);
  public final PBUInt64Field uint64_from_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\quality_report$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */