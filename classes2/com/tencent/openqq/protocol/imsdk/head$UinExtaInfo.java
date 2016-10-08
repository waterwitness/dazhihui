package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class head$UinExtaInfo
  extends MessageMicro<UinExtaInfo>
{
  public static final int BYTES_NAME_CARD_FIELD_NUMBER = 3;
  public static final int BYTES_USER_ID_FIELD_NUMBER = 6;
  public static final int RPT_MSG_APP_DEFINED_DATA_ACCOUNT_FIELD_NUMBER = 4;
  public static final int RPT_MSG_APP_DEFINED_DATA_GROUP_MEMBER_FIELD_NUMBER = 5;
  public static final int UINT32_MSG_FLAG_FIELD_NUMBER = 1;
  public static final int UINT32_ROLE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_name_card = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_user_id = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBRepeatMessageField<head.GroupOpenAppDefinedData> rpt_msg_app_defined_data_account = PBField.initRepeatMessage(head.GroupOpenAppDefinedData.class);
  public final PBRepeatMessageField<head.GroupOpenAppDefinedData> rpt_msg_app_defined_data_group_member = PBField.initRepeatMessage(head.GroupOpenAppDefinedData.class);
  public final PBUInt32Field uint32_msg_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_role = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34, 42, 50 }, new String[] { "uint32_msg_flag", "uint32_role", "bytes_name_card", "rpt_msg_app_defined_data_account", "rpt_msg_app_defined_data_group_member", "bytes_user_id" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro1, null, null, localByteStringMicro2 }, UinExtaInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\head$UinExtaInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */