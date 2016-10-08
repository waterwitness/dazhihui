package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBFixed32Field;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class head$RedirectMsg
  extends MessageMicro<RedirectMsg>
{
  public static final int UINT32_LAST_REDIRECT_IP_FIELD_NUMBER = 1;
  public static final int UINT32_LAST_REDIRECT_PORT_FIELD_NUMBER = 2;
  public static final int UINT32_REDIRECT_COUNT_FIELD_NUMBER = 5;
  public static final int UINT32_REDIRECT_IP_FIELD_NUMBER = 3;
  public static final int UINT32_REDIRECT_PORT_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 13, 16, 29, 32, 40 }, new String[] { "uint32_last_redirect_ip", "uint32_last_redirect_port", "uint32_redirect_ip", "uint32_redirect_port", "uint32_redirect_count" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, RedirectMsg.class);
  public final PBFixed32Field uint32_last_redirect_ip = PBField.initFixed32(0);
  public final PBUInt32Field uint32_last_redirect_port = PBField.initUInt32(0);
  public final PBUInt32Field uint32_redirect_count = PBField.initUInt32(0);
  public final PBFixed32Field uint32_redirect_ip = PBField.initFixed32(0);
  public final PBUInt32Field uint32_redirect_port = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$RedirectMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */