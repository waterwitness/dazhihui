package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class gv_comm_operate$RspBody
  extends MessageMicro<RspBody>
{
  public static final int RSP_0X101_FIELD_NUMBER = 101;
  public static final int RSP_0X1_FIELD_NUMBER = 1;
  public static final int RSP_0X2_FIELD_NUMBER = 2;
  public static final int RSP_0X3_FIELD_NUMBER = 3;
  public static final int RSP_0X4_FIELD_NUMBER = 4;
  public static final int RSP_0X5_FIELD_NUMBER = 5;
  public static final int RSP_0X6_FIELD_NUMBER = 6;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 42, 50, 810 }, new String[] { "rsp_0x1", "rsp_0x2", "rsp_0x3", "rsp_0x4", "rsp_0x5", "rsp_0x6", "rsp_0x101" }, new Object[] { null, null, null, null, null, null, null }, RspBody.class);
  public gv_comm_operate.SubRsp_0x1 rsp_0x1 = new gv_comm_operate.SubRsp_0x1();
  public gv_comm_operate.SubRsp_0x101 rsp_0x101 = new gv_comm_operate.SubRsp_0x101();
  public gv_comm_operate.SubRsp_0x2 rsp_0x2 = new gv_comm_operate.SubRsp_0x2();
  public gv_comm_operate.SubRsp_0x3 rsp_0x3 = new gv_comm_operate.SubRsp_0x3();
  public gv_comm_operate.SubRsp_0x4 rsp_0x4 = new gv_comm_operate.SubRsp_0x4();
  public gv_comm_operate.SubRsp_0x5 rsp_0x5 = new gv_comm_operate.SubRsp_0x5();
  public gv_comm_operate.SubRsp_0x6 rsp_0x6 = new gv_comm_operate.SubRsp_0x6();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */