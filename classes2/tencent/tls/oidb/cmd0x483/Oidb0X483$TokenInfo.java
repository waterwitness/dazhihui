package tencent.tls.oidb.cmd0x483;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Oidb0X483$TokenInfo
  extends MessageMicro<TokenInfo>
{
  public static final int STR_ACCESS_TOKEN_FIELD_NUMBER = 1;
  public static final int STR_OPENID_FIELD_NUMBER = 4;
  public static final int STR_REFRESH_TOKEN_FIELD_NUMBER = 3;
  public static final int STR_SCOPE_FIELD_NUMBER = 5;
  public static final int STR_UNIONID_FIELD_NUMBER = 6;
  public static final int UINT32_EXPIRES_IN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26, 34, 42, 50 }, new String[] { "str_access_token", "uint32_expires_in", "str_refresh_token", "str_openid", "str_scope", "str_unionid" }, new Object[] { "", Integer.valueOf(0), "", "", "", "" }, TokenInfo.class);
  public final PBStringField str_access_token = PBField.initString("");
  public final PBStringField str_openid = PBField.initString("");
  public final PBStringField str_refresh_token = PBField.initString("");
  public final PBStringField str_scope = PBField.initString("");
  public final PBStringField str_unionid = PBField.initString("");
  public final PBUInt32Field uint32_expires_in = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x483\Oidb0X483$TokenInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */