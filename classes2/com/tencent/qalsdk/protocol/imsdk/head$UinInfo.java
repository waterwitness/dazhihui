package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$UinInfo
  extends MessageMicro<UinInfo>
{
  public static final int ENUM_UIN_TYPE_FIELD_NUMBER = 2;
  public static final int MSG_UIN_EXTRA_INFO_FIELD_NUMBER = 3;
  public static final int UINT64_UIN_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "uint64_uin", "enum_uin_type", "msg_uin_extra_info" }, new Object[] { Long.valueOf(0L), Integer.valueOf(1), null }, UinInfo.class);
  public final PBEnumField enum_uin_type = PBField.initEnum(1);
  public head.UinExtaInfo msg_uin_extra_info = new head.UinExtaInfo();
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$UinInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */