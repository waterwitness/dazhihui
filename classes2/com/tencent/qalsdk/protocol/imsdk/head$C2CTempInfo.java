package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class head$C2CTempInfo
  extends MessageMicro<C2CTempInfo>
{
  public static final int BYTES_FROM_UIN_NICK_FIELD_NUMBER = 5;
  public static final int ENUM_FROM_UIN_TYPE_FIELD_NUMBER = 3;
  public static final int ENUM_TO_DOMAIN_FIELD_NUMBER = 12;
  public static final int ENUM_TO_UIN_BINDED_TYPE_FIELD_NUMBER = 13;
  public static final int ENUM_TO_UIN_TYPE_FIELD_NUMBER = 4;
  public static final int MSG_FROM_PHONEINFO_FIELD_NUMBER = 10;
  public static final int MSG_TMP_SIG_FIELD_NUMBER = 9;
  public static final int MSG_TO_PHONEINFO_FIELD_NUMBER = 11;
  public static final int UINT32_FROM_INDENTITY_FOR_CLIENT_FIELD_NUMBER = 8;
  public static final int UINT64_FROM_UIN_BINDED_FIELD_NUMBER = 6;
  public static final int UINT64_FROM_UIN_FIELD_NUMBER = 1;
  public static final int UINT64_TO_UIN_BINDED_FIELD_NUMBER = 7;
  public static final int UINT64_TO_UIN_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_from_uin_nick = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBEnumField enum_from_uin_type = PBField.initEnum(1);
  public final PBEnumField enum_to_domain = PBField.initEnum(1);
  public final PBEnumField enum_to_uin_binded_type = PBField.initEnum(1);
  public final PBEnumField enum_to_uin_type = PBField.initEnum(1);
  public head.PhoneInfo msg_from_phoneinfo = new head.PhoneInfo();
  public head.TmpMsgToken msg_tmp_sig = new head.TmpMsgToken();
  public head.PhoneInfo msg_to_phoneinfo = new head.PhoneInfo();
  public final PBUInt32Field uint32_from_indentity_for_client = PBField.initUInt32(0);
  public final PBUInt64Field uint64_from_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_from_uin_binded = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_to_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_to_uin_binded = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 42, 48, 56, 64, 74, 82, 90, 96, 104 }, new String[] { "uint64_from_uin", "uint64_to_uin", "enum_from_uin_type", "enum_to_uin_type", "bytes_from_uin_nick", "uint64_from_uin_binded", "uint64_to_uin_binded", "uint32_from_indentity_for_client", "msg_tmp_sig", "msg_from_phoneinfo", "msg_to_phoneinfo", "enum_to_domain", "enum_to_uin_binded_type" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), Integer.valueOf(1), Integer.valueOf(1), localByteStringMicro, Long.valueOf(0L), Long.valueOf(0L), Integer.valueOf(0), null, null, null, Integer.valueOf(1), Integer.valueOf(1) }, C2CTempInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\head$C2CTempInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */