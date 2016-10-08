package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$AnyConnC2CInfo
  extends MessageMicro<AnyConnC2CInfo>
{
  public static final int ENUM_FROM_NODE_TYPE_FIELD_NUMBER = 3;
  public static final int ENUM_TO_NODE_TYPE_FIELD_NUMBER = 4;
  public static final int UINT64_FROM_UIN_FIELD_NUMBER = 1;
  public static final int UINT64_TO_UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32 }, new String[] { "uint64_from_uin", "uint64_to_uin", "enum_from_node_type", "enum_to_node_type" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), Integer.valueOf(1), Integer.valueOf(1) }, AnyConnC2CInfo.class);
  public final PBEnumField enum_from_node_type = PBField.initEnum(1);
  public final PBEnumField enum_to_node_type = PBField.initEnum(1);
  public final PBUInt64Field uint64_from_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_to_uin = PBField.initUInt64(0L);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$AnyConnC2CInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */