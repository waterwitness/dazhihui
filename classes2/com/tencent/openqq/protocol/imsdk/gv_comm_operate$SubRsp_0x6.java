package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class gv_comm_operate$SubRsp_0x6
  extends MessageMicro<SubRsp_0x6>
{
  public static final int MSG_LIVE_URL_FIELD_NUMBER = 2;
  public static final int STR_ERRORINFO_FIELD_NUMBER = 3;
  public static final int UINT32_RESULT_FIELD_NUMBER = 1;
  public static final int UINT32_TAPE_TASK_ID_FIELD_NUMBER = 5;
  public static final int UINT64_CHANNEL_ID_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 40 }, new String[] { "uint32_result", "msg_live_url", "str_errorinfo", "uint64_channel_id", "uint32_tape_task_id" }, new Object[] { Integer.valueOf(0), null, "", Long.valueOf(0L), Integer.valueOf(0) }, SubRsp_0x6.class);
  public final PBRepeatMessageField<gv_comm_operate.LiveUrl> msg_live_url = PBField.initRepeatMessage(gv_comm_operate.LiveUrl.class);
  public final PBStringField str_errorinfo = PBField.initString("");
  public final PBUInt32Field uint32_result = PBField.initUInt32(0);
  public final PBUInt32Field uint32_tape_task_id = PBField.initUInt32(0);
  public final PBUInt64Field uint64_channel_id = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$SubRsp_0x6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */