package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class msg$MsgBody
  extends MessageMicro<MsgBody>
{
  public static final int MSG_CONTENT_FIELD_NUMBER = 2;
  public static final int RICH_TEXT_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField msg_content = PBField.initBytes(ByteStringMicro.EMPTY);
  public msg.RichText rich_text = new msg.RichText();
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "rich_text", "msg_content" }, new Object[] { null, localByteStringMicro }, MsgBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$MsgBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */