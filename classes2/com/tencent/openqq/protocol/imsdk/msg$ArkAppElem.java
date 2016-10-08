package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class msg$ArkAppElem
  extends MessageMicro<ArkAppElem>
{
  public static final int APP_NAME_FIELD_NUMBER = 1;
  public static final int MIN_VERSION_FIELD_NUMBER = 2;
  public static final int XML_TEMPLATE_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26 }, new String[] { "app_name", "min_version", "xml_template" }, new Object[] { "", "", "" }, ArkAppElem.class);
  public final PBStringField app_name = PBField.initString("");
  public final PBStringField min_version = PBField.initString("");
  public final PBStringField xml_template = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$ArkAppElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */