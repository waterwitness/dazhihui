package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg_common$MsgKey
  extends MessageMicro<MsgKey>
{
  public static final int UINT32_RAND_FIELD_NUMBER = 4;
  public static final int UINT32_SEQ_FIELD_NUMBER = 3;
  public static final int UINT64_FROM_UIN_FIELD_NUMBER = 1;
  public static final int UINT64_TO_UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32 }, new String[] { "uint64_from_uin", "uint64_to_uin", "uint32_seq", "uint32_rand" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0) }, MsgKey.class);
  public final PBUInt32Field uint32_rand = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
  public final PBUInt64Field uint64_from_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_to_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg_common$MsgKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */