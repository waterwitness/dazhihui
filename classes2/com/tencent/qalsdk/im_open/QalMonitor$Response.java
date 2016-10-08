package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class QalMonitor$Response
  extends MessageMicro<Response>
{
  public static final int SEQNO_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "seqno" }, new Object[] { Integer.valueOf(0) }, Response.class);
  public final PBUInt32Field seqno = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\QalMonitor$Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */