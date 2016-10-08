package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msgcomm$UserInfo
  extends MessageMicro<UserInfo>
{
  public static final int HEADURL_FIELD_NUMBER = 3;
  public static final int NICKNAME_FIELD_NUMBER = 4;
  public static final int OPENID_FIELD_NUMBER = 1;
  public static final int REMARK_FIELD_NUMBER = 5;
  public static final int TINYID_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26, 34, 42 }, new String[] { "Openid", "Tinyid", "HeadURL", "NickName", "Remark" }, new Object[] { "", Long.valueOf(0L), "", "", "" }, UserInfo.class);
  public final PBStringField HeadURL = PBField.initString("");
  public final PBStringField NickName = PBField.initString("");
  public final PBStringField Openid = PBField.initString("");
  public final PBStringField Remark = PBField.initString("");
  public final PBUInt64Field Tinyid = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msgcomm$UserInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */