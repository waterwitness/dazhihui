package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class gv_comm_operate$LiveUrl
  extends MessageMicro<LiveUrl>
{
  public static final int RATE_TYPE_FIELD_NUMBER = 3;
  public static final int STRING_PLAY_URL_FIELD_NUMBER = 2;
  public static final int UINT32_TYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24 }, new String[] { "uint32_type", "string_play_url", "rate_type" }, new Object[] { Integer.valueOf(0), "", Integer.valueOf(0) }, LiveUrl.class);
  public final PBEnumField rate_type = PBField.initEnum(0);
  public final PBStringField string_play_url = PBField.initString("");
  public final PBUInt32Field uint32_type = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$LiveUrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */