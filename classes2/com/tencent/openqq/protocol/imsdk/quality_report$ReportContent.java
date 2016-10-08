package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class quality_report$ReportContent
  extends MessageMicro<ReportContent>
{
  public static final int BYTES_REPORT_DATA_FIELD_NUMBER = 2;
  public static final int UINT32_TYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_report_data = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_type = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "uint32_type", "bytes_report_data" }, new Object[] { Integer.valueOf(0), localByteStringMicro }, ReportContent.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\quality_report$ReportContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */