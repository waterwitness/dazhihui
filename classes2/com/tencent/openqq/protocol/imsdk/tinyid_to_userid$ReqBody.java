package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class tinyid_to_userid$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int SDKDATA_FIELD_NUMBER = 1;
  public static final int TINYID_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "sdkdata", "tinyid" }, new Object[] { null, Long.valueOf(0L) }, ReqBody.class);
  public im_open_common.SdkData sdkdata = new im_open_common.SdkData();
  public final PBRepeatField<Long> tinyid = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\tinyid_to_userid$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */