package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class QalMonitor$Request
  extends MessageMicro<Request>
{
  public static final int Android = 1;
  public static final int Background = 2;
  public static final int CONN_FIELD_NUMBER = 2;
  public static final int DROP_FIELD_NUMBER = 4;
  public static final int Foreground = 1;
  public static final int HTTP_FIELD_NUMBER = 3;
  public static final int HttpDecodeErr = 2;
  public static final int HttpTimeout = 1;
  public static final int MacOS = 4;
  public static final int NoHttpRequest = 3;
  public static final int SEQNO_FIELD_NUMBER = 1;
  public static final int Unknow = 3;
  public static final int WindowsPhone = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32 }, new String[] { "seqno", "conn", "http", "drop" }, new Object[] { Integer.valueOf(0), null, null, Integer.valueOf(0) }, Request.class);
  public static final int fail = 2;
  public static final int iOS = 2;
  public static final int logic_fail = 3;
  public static final int success = 1;
  public final PBRepeatMessageField<QalMonitor.Request.Conn> conn = PBField.initRepeatMessage(QalMonitor.Request.Conn.class);
  public final PBUInt32Field drop = PBField.initUInt32(0);
  public final PBRepeatMessageField<QalMonitor.Request.Http> http = PBField.initRepeatMessage(QalMonitor.Request.Http.class);
  public final PBUInt32Field seqno = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\QalMonitor$Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */