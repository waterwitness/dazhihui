package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class videoinvitation$MsgBody
  extends MessageMicro<MsgBody>
{
  public static final int BYTES_BUFF_FIELD_NUMBER = 5;
  public static final int INT32_AUTH_TYPE_FIELD_NUMBER = 2;
  public static final int INT32_BUSS_TYPE_FIELD_NUMBER = 1;
  public static final int INT32_REQUEST_TYPE_FIELD_NUMBER = 6;
  public static final int MSG_SENDER_FIELD_NUMBER = 7;
  public static final int RPT_MSG_RECEIVER_LIST_FIELD_NUMBER = 8;
  public static final int UINT32_AUTH_ID_FIELD_NUMBER = 3;
  public static final int UINT32_SDK_APPID_FIELD_NUMBER = 4;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_buff = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBInt32Field int32_auth_type = PBField.initInt32(0);
  public final PBInt32Field int32_buss_type = PBField.initInt32(0);
  public final PBInt32Field int32_request_type = PBField.initInt32(0);
  public videoinvitation.UserInfo msg_sender = new videoinvitation.UserInfo();
  public final PBRepeatMessageField<videoinvitation.UserInfo> rpt_msg_receiver_list = PBField.initRepeatMessage(videoinvitation.UserInfo.class);
  public final PBUInt32Field uint32_auth_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sdk_appid = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 42, 48, 58, 66 }, new String[] { "int32_buss_type", "int32_auth_type", "uint32_auth_id", "uint32_sdk_appid", "bytes_buff", "int32_request_type", "msg_sender", "rpt_msg_receiver_list" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro, Integer.valueOf(0), null, null }, MsgBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\videoinvitation$MsgBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */