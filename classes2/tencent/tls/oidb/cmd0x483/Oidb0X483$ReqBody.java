package tencent.tls.oidb.cmd0x483;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Oidb0X483$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int STR_CODE_FIELD_NUMBER = 3;
  public static final int UINT32_ACCOUNT_TYPE_FIELD_NUMBER = 2;
  public static final int UINT32_APPID_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "uint32_appid", "uint32_account_type", "str_code" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "" }, ReqBody.class);
  public final PBStringField str_code = PBField.initString("");
  public final PBUInt32Field uint32_account_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_appid = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x483\Oidb0X483$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */