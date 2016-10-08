package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$PcSupportDef
  extends MessageMicro<PcSupportDef>
{
  public static final int RPT_PTLS_NOT_SUPPORT_FIELD_NUMBER = 6;
  public static final int RPT_PTLS_SUPPORT_FIELD_NUMBER = 5;
  public static final int UINT32_MAC_PTL_BEGIN_FIELD_NUMBER = 3;
  public static final int UINT32_MAC_PTL_END_FIELD_NUMBER = 4;
  public static final int UINT32_PC_PTL_BEGIN_FIELD_NUMBER = 1;
  public static final int UINT32_PC_PTL_END_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40, 48 }, new String[] { "uint32_pc_ptl_begin", "uint32_pc_ptl_end", "uint32_mac_ptl_begin", "uint32_mac_ptl_end", "rpt_ptls_support", "rpt_ptls_not_support" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, PcSupportDef.class);
  public final PBRepeatField<Integer> rpt_ptls_not_support = PBField.initRepeat(PBUInt32Field.__repeatHelper__);
  public final PBRepeatField<Integer> rpt_ptls_support = PBField.initRepeat(PBUInt32Field.__repeatHelper__);
  public final PBUInt32Field uint32_mac_ptl_begin = PBField.initUInt32(0);
  public final PBUInt32Field uint32_mac_ptl_end = PBField.initUInt32(0);
  public final PBUInt32Field uint32_pc_ptl_begin = PBField.initUInt32(0);
  public final PBUInt32Field uint32_pc_ptl_end = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$PcSupportDef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */