package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$C2SInfo
  extends MessageMicro<C2SInfo>
{
  public static final int ENUM_DEST_SVR_TYPE_FIELD_NUMBER = 2;
  public static final int ENUM_FROM_UIN_TYPE_FIELD_NUMBER = 3;
  public static final int UINT64_FROM_UIN_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint64_from_uin", "enum_dest_svr_type", "enum_from_uin_type" }, new Object[] { Long.valueOf(0L), Integer.valueOf(1), Integer.valueOf(1) }, C2SInfo.class);
  public final PBEnumField enum_dest_svr_type = PBField.initEnum(1);
  public final PBEnumField enum_from_uin_type = PBField.initEnum(1);
  public final PBUInt64Field uint64_from_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$C2SInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */