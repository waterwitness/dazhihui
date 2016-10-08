package tencent.tls.oidb.cmd0x601;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class Oidb0X601$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int OPENACCOUNT_FIELD_NUMBER = 1;
  public static final int OPENSIG_FIELD_NUMBER = 3;
  public static final int UINT32_SDKAPPID_FIELD_NUMBER = 4;
  public static final int UINT64_TINYID_FIELD_NUMBER = 5;
  public static final int USERACCOUNT_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 32, 40 }, new String[] { "openaccount", "useraccount", "opensig", "uint32_sdkappid", "uint64_tinyid" }, new Object[] { null, null, null, Integer.valueOf(0), Long.valueOf(0L) }, ReqBody.class);
  public Oidb0X601.OpenAccountInfo openaccount = new Oidb0X601.OpenAccountInfo();
  public Oidb0X601.OpenSigInfo opensig = new Oidb0X601.OpenSigInfo();
  public final PBUInt32Field uint32_sdkappid = PBField.initUInt32(0);
  public final PBUInt64Field uint64_tinyid = PBField.initUInt64(0L);
  public Oidb0X601.UserAccountInfo useraccount = new Oidb0X601.UserAccountInfo();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x601\Oidb0X601$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */