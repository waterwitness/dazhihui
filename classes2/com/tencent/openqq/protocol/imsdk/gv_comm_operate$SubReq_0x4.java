package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class gv_comm_operate$SubReq_0x4
  extends MessageMicro<SubReq_0x4>
{
  public static final int UINT32_ROOM_NUM_FIELD_NUMBER = 1;
  public static final int UINT64_USER_UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16 }, new String[] { "uint32_room_num", "uint64_user_uin" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L) }, SubReq_0x4.class);
  public final PBUInt32Field uint32_room_num = PBField.initUInt32(0);
  public final PBUInt64Field uint64_user_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$SubReq_0x4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */