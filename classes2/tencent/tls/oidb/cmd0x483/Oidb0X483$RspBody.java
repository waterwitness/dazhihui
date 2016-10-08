package tencent.tls.oidb.cmd0x483;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class Oidb0X483$RspBody
  extends MessageMicro<RspBody>
{
  public static final int STR_ERRHINT_FIELD_NUMBER = 1;
  public static final int ST_TOKEN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "str_errhint", "st_token" }, new Object[] { "", null }, RspBody.class);
  public Oidb0X483.TokenInfo st_token = new Oidb0X483.TokenInfo();
  public final PBStringField str_errhint = PBField.initString("");
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x483\Oidb0X483$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */