package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class msgcomm$MsgElement
  extends MessageMicro<MsgElement>
{
  public static final int MSGCONTENT_FIELD_NUMBER = 2;
  public static final int MSGTYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "MsgType", "MsgContent" }, new Object[] { "", "" }, MsgElement.class);
  public final PBStringField MsgContent = PBField.initString("");
  public final PBStringField MsgType = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msgcomm$MsgElement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */