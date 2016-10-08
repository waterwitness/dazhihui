package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class head$Head
  extends MessageMicro<Head>
{
  public static final int MSG_C2C_HEAD_FIELD_NUMBER = 8;
  public static final int MSG_CS_HEAD_FIELD_NUMBER = 2;
  public static final int MSG_DELTA_HEAD_FIELD_NUMBER = 7;
  public static final int MSG_HTTPCONN_HEAD_FIELD_NUMBER = 4;
  public static final int MSG_INST_CTRL_FIELD_NUMBER = 10;
  public static final int MSG_LOGIN_SIG_FIELD_NUMBER = 6;
  public static final int MSG_MSG_HEAD_FIELD_NUMBER = 12;
  public static final int MSG_S2C_HEAD_FIELD_NUMBER = 3;
  public static final int MSG_SCONN_HEAD_FIELD_NUMBER = 9;
  public static final int MSG_SERVICE_HEAD_FIELD_NUMBER = 11;
  public static final int UINT32_HEAD_TYPE_FIELD_NUMBER = 1;
  public static final int UINT32_PAINT_FLAG_FIELD_NUMBER = 5;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34, 40, 50, 58, 66, 74, 82, 90, 98 }, new String[] { "uint32_head_type", "msg_cs_head", "msg_s2c_head", "msg_httpconn_head", "uint32_paint_flag", "msg_login_sig", "msg_delta_head", "msg_c2c_head", "msg_sconn_head", "msg_inst_ctrl", "msg_service_head", "msg_msg_head" }, new Object[] { Integer.valueOf(0), null, null, null, Integer.valueOf(0), null, null, null, null, null, null, null }, Head.class);
  public head.C2CHead msg_c2c_head = new head.C2CHead();
  public head.CSHead msg_cs_head = new head.CSHead();
  public head.DeltaHead msg_delta_head = new head.DeltaHead();
  public head.HttpConnHead msg_httpconn_head = new head.HttpConnHead();
  public head.InstCtrl msg_inst_ctrl = new head.InstCtrl();
  public head.LoginSig msg_login_sig = new head.LoginSig();
  public head.MsgHead msg_msg_head = new head.MsgHead();
  public head.S2CHead msg_s2c_head = new head.S2CHead();
  public head.SConnHead msg_sconn_head = new head.SConnHead();
  public head.ServiceHead msg_service_head = new head.ServiceHead();
  public final PBUInt32Field uint32_head_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_paint_flag = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$Head.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */