package tencent.tls.oidb.cmd0x601;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Oidb0X601$OpenAccountInfo
  extends MessageMicro<OpenAccountInfo>
{
  public static final int STR_OPENAPPID_FIELD_NUMBER = 2;
  public static final int STR_OPENID_FIELD_NUMBER = 3;
  public static final int UINT32_OPENACCTYPE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint32_openacctype", "str_openappid", "str_openid" }, new Object[] { Integer.valueOf(0), "", "" }, OpenAccountInfo.class);
  public final PBStringField str_openappid = PBField.initString("");
  public final PBStringField str_openid = PBField.initString("");
  public final PBUInt32Field uint32_openacctype = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x601\Oidb0X601$OpenAccountInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */