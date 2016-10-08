package tencent.tls.oidb.cmd0x601;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Oidb0X601$UserAccountInfo
  extends MessageMicro<UserAccountInfo>
{
  public static final int STR_USERACCOUNT_FIELD_NUMBER = 2;
  public static final int STR_USERSIG_FIELD_NUMBER = 3;
  public static final int UINT32_USERACCTYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint32_useracctype", "str_useraccount", "str_usersig" }, new Object[] { Integer.valueOf(0), "", "" }, UserAccountInfo.class);
  public final PBStringField str_useraccount = PBField.initString("");
  public final PBStringField str_usersig = PBField.initString("");
  public final PBUInt32Field uint32_useracctype = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x601\Oidb0X601$UserAccountInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */