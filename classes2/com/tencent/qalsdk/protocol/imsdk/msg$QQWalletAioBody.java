package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBSInt32Field;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg$QQWalletAioBody
  extends MessageMicro<QQWalletAioBody>
{
  public static final int BYTES_AUTHKEY_FIELD_NUMBER = 10;
  public static final int BYTES_BILLNO_FIELD_NUMBER = 9;
  public static final int RECEIVER_FIELD_NUMBER = 3;
  public static final int SENDER_FIELD_NUMBER = 2;
  public static final int SINT32_CHANNELID_FIELD_NUMBER = 4;
  public static final int SINT32_REDTYPE_FIELD_NUMBER = 8;
  public static final int SINT32_SESSIONTYPE_FIELD_NUMBER = 11;
  public static final int SINT32_TEMPLATEID_FIELD_NUMBER = 5;
  public static final int UINT32_MSG_PRIORITY_FIELD_NUMBER = 7;
  public static final int UINT32_RESEND_FIELD_NUMBER = 6;
  public static final int UINT64_SENDUIN_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_authkey = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_billno = PBField.initBytes(ByteStringMicro.EMPTY);
  public msg.QQWalletAioElem receiver = new msg.QQWalletAioElem();
  public msg.QQWalletAioElem sender = new msg.QQWalletAioElem();
  public final PBSInt32Field sint32_channelid = PBField.initSInt32(0);
  public final PBSInt32Field sint32_redtype = PBField.initSInt32(0);
  public final PBSInt32Field sint32_sessiontype = PBField.initSInt32(0);
  public final PBSInt32Field sint32_templateid = PBField.initSInt32(0);
  public final PBUInt32Field uint32_msg_priority = PBField.initUInt32(0);
  public final PBUInt32Field uint32_resend = PBField.initUInt32(0);
  public final PBUInt64Field uint64_senduin = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 40, 48, 56, 64, 74, 82, 88 }, new String[] { "uint64_senduin", "sender", "receiver", "sint32_channelid", "sint32_templateid", "uint32_resend", "uint32_msg_priority", "sint32_redtype", "bytes_billno", "bytes_authkey", "sint32_sessiontype" }, new Object[] { Long.valueOf(0L), null, null, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, Integer.valueOf(0) }, QQWalletAioBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$QQWalletAioBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */