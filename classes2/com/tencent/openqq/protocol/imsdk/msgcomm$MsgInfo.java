package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msgcomm$MsgInfo
  extends MessageMicro<MsgInfo>
{
  public static final int FROMOPENID_FIELD_NUMBER = 1;
  public static final int FROMTINYID_FIELD_NUMBER = 2;
  public static final int MSGREADED_FIELD_NUMBER = 8;
  public static final int MSGSEQID_FIELD_NUMBER = 6;
  public static final int MSGTIMESTAMP_FIELD_NUMBER = 5;
  public static final int MSG_FIELD_NUMBER = 7;
  public static final int TOOPENID_FIELD_NUMBER = 3;
  public static final int TOTINYID_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26, 32, 40, 48, 58, 64 }, new String[] { "FromOpenid", "FromTinyid", "ToOpenid", "ToTinyid", "MsgTimestamp", "MsgSeqId", "Msg", "MsgReaded" }, new Object[] { "", Long.valueOf(0L), "", Long.valueOf(0L), Integer.valueOf(0), Long.valueOf(0L), null, Integer.valueOf(0) }, MsgInfo.class);
  public final PBStringField FromOpenid = PBField.initString("");
  public final PBUInt64Field FromTinyid = PBField.initUInt64(0L);
  public final PBRepeatMessageField<msgcomm.MsgElement> Msg = PBField.initRepeatMessage(msgcomm.MsgElement.class);
  public final PBUInt32Field MsgReaded = PBField.initUInt32(0);
  public final PBUInt64Field MsgSeqId = PBField.initUInt64(0L);
  public final PBUInt32Field MsgTimestamp = PBField.initUInt32(0);
  public final PBStringField ToOpenid = PBField.initString("");
  public final PBUInt64Field ToTinyid = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msgcomm$MsgInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */