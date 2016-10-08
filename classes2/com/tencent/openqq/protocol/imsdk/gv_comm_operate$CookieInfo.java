package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class gv_comm_operate$CookieInfo
  extends MessageMicro<CookieInfo>
{
  public static final int UINT32_REQ_IP_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "uint32_req_ip" }, new Object[] { Integer.valueOf(0) }, CookieInfo.class);
  public final PBUInt32Field uint32_req_ip = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$CookieInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */