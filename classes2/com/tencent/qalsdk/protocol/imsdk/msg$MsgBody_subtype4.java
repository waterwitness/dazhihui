package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$MsgBody_subtype4
  extends MessageMicro<MsgBody_subtype4>
{
  public static final int MSG_NOT_ONLINE_FILE_FIELD_NUMBER = 1;
  public static final int UINT32_MSG_TIME_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "msg_not_online_file", "uint32_msg_time" }, new Object[] { null, Integer.valueOf(0) }, MsgBody_subtype4.class);
  public msg.NotOnlineFile msg_not_online_file = new msg.NotOnlineFile();
  public final PBUInt32Field uint32_msg_time = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$MsgBody_subtype4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */