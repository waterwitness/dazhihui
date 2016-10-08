package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class system_msg$InviteQQToMultiSharp
  extends MessageMicro<InviteQQToMultiSharp>
{
  public static final int RPT_UINT64_UIN_LIST_FIELD_NUMBER = 2;
  public static final int UINT64_CONF_CODE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16 }, new String[] { "uint64_conf_code", "rpt_uint64_uin_list" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L) }, InviteQQToMultiSharp.class);
  public final PBRepeatField<Long> rpt_uint64_uin_list = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
  public final PBUInt64Field uint64_conf_code = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\system_msg$InviteQQToMultiSharp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */