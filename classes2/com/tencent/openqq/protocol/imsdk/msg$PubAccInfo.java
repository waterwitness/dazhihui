package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$PubAccInfo
  extends MessageMicro<PubAccInfo>
{
  public static final int STRING_LONG_MSG_URL_FIELD_NUMBER = 3;
  public static final int STRING_MSG_TEMPLATE_ID_FIELD_NUMBER = 2;
  public static final int UINT32_IS_INTER_NUM_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint32_is_inter_num", "string_msg_template_id", "string_long_msg_url" }, new Object[] { Integer.valueOf(0), "", "" }, PubAccInfo.class);
  public final PBStringField string_long_msg_url = PBField.initString("");
  public final PBStringField string_msg_template_id = PBField.initString("");
  public final PBUInt32Field uint32_is_inter_num = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$PubAccInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */