package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class stat_forceoffline$ReqBody
  extends MessageMicro<ReqBody>
{
  public static final int STR_INFO_FIELD_NUMBER = 3;
  public static final int STR_TITLE_FIELD_NUMBER = 4;
  public static final int UINT32_CLEAR_SIG_FIELD_NUMBER = 6;
  public static final int UINT32_KICK_TYPE_FIELD_NUMBER = 2;
  public static final int UINT32_SAME_DEVICE_FIELD_NUMBER = 5;
  public static final int UINT32_SEQNO_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34, 40, 48 }, new String[] { "uint32_seqno", "uint32_kick_type", "str_info", "str_title", "uint32_same_device", "uint32_clear_sig" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0) }, ReqBody.class);
  public final PBStringField str_info = PBField.initString("");
  public final PBStringField str_title = PBField.initString("");
  public final PBUInt32Field uint32_clear_sig = PBField.initUInt32(0);
  public final PBUInt32Field uint32_kick_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_same_device = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seqno = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\stat_forceoffline$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */