package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class gv_comm_operate$SubReq_0x3
  extends MessageMicro<SubReq_0x3>
{
  public static final int UINT32_OP_TYPE_FIELD_NUMBER = 2;
  public static final int UINT32_RECV_IP_FIELD_NUMBER = 3;
  public static final int UINT32_RECV_PORT_FIELD_NUMBER = 4;
  public static final int UINT32_ROOM_NUM_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32 }, new String[] { "uint32_room_num", "uint32_op_type", "uint32_recv_ip", "uint32_recv_port" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, SubReq_0x3.class);
  public final PBUInt32Field uint32_op_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_recv_ip = PBField.initUInt32(0);
  public final PBUInt32Field uint32_recv_port = PBField.initUInt32(0);
  public final PBUInt32Field uint32_room_num = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$SubReq_0x3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */