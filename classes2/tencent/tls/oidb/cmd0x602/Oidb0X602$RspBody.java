package tencent.tls.oidb.cmd0x602;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class Oidb0X602$RspBody
  extends MessageMicro<RspBody>
{
  public static final int RPT_OPEN2USERINFOS_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "rpt_open2userinfos" }, new Object[] { null }, RspBody.class);
  public final PBRepeatMessageField<Oidb0X602.Open2UserInfo> rpt_open2userinfos = PBField.initRepeatMessage(Oidb0X602.Open2UserInfo.class);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\cmd0x602\Oidb0X602$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */