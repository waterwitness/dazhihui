package tencent.tls.oidb.cmd0x602;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class Oidb0X602$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int RPT_OPENACCINFOS_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "rpt_openaccinfos" }, new Object[] { null }, ReqBody.class);
  public final PBRepeatMessageField<Oidb0X602.OpenAccountInfo> rpt_openaccinfos = PBField.initRepeatMessage(Oidb0X602.OpenAccountInfo.class);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x602\Oidb0X602$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */