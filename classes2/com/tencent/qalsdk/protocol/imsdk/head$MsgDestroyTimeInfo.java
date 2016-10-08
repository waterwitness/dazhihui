package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$MsgDestroyTimeInfo
  extends MessageMicro<MsgDestroyTimeInfo>
{
  public static final int UINT32_SET_TIME_FIELD_NUMBER = 2;
  public static final int UINT32_SET_TIME_US_FIELD_NUMBER = 4;
  public static final int UINT32_TIME_LENGTH_FIELD_NUMBER = 1;
  public static final int UINT64_SET_QCALLID_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32 }, new String[] { "uint32_time_length", "uint32_set_time", "uint64_set_qcallid", "uint32_set_time_us" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0) }, MsgDestroyTimeInfo.class);
  public final PBUInt32Field uint32_set_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_set_time_us = PBField.initUInt32(0);
  public final PBUInt32Field uint32_time_length = PBField.initUInt32(0);
  public final PBUInt64Field uint64_set_qcallid = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$MsgDestroyTimeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */