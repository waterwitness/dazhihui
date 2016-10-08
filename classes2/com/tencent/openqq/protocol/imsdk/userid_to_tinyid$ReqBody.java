package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class userid_to_tinyid$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int SDKDATA_FIELD_NUMBER = 1;
  public static final int USERID_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "sdkdata", "userid" }, new Object[] { null, null }, ReqBody.class);
  public im_open_common.SdkData sdkdata = new im_open_common.SdkData();
  public final PBRepeatMessageField<im_open_common.IMUserId> userid = PBField.initRepeatMessage(im_open_common.IMUserId.class);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\userid_to_tinyid$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */