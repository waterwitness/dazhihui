package tencent.tls.oidb.cmd0x602;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Oidb0X602$OpenAccountInfo
  extends MessageMicro<OpenAccountInfo>
{
  public static final int STR_ACCESS_TOKEN_FIELD_NUMBER = 5;
  public static final int STR_OPENAPPID_FIELD_NUMBER = 2;
  public static final int STR_OPENID_FIELD_NUMBER = 3;
  public static final int UINT32_OPENACCTYPE_FIELD_NUMBER = 1;
  public static final int UINT32_SDKAPPID_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 42 }, new String[] { "uint32_openacctype", "str_openappid", "str_openid", "uint32_sdkappid", "str_access_token" }, new Object[] { Integer.valueOf(0), "", "", Integer.valueOf(0), "" }, OpenAccountInfo.class);
  public final PBStringField str_access_token = PBField.initString("");
  public final PBStringField str_openappid = PBField.initString("");
  public final PBStringField str_openid = PBField.initString("");
  public final PBUInt32Field uint32_openacctype = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sdkappid = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x602\Oidb0X602$OpenAccountInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */