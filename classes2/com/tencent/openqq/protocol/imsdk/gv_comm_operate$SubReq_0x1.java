package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class gv_comm_operate$SubReq_0x1
  extends MessageMicro<SubReq_0x1>
{
  public static final int RPT_UINS_FIELD_NUMBER = 3;
  public static final int UINT32_DELETE_TYPE_FIELD_NUMBER = 2;
  public static final int UINT32_ROOM_NUM_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint32_room_num", "uint32_delete_type", "rpt_uins" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L) }, SubReq_0x1.class);
  public final PBRepeatField<Long> rpt_uins = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
  public final PBUInt32Field uint32_delete_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_room_num = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$SubReq_0x1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */