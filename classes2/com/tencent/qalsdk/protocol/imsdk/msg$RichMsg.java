package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$RichMsg
  extends MessageMicro<RichMsg>
{
  public static final int BYTES_MSG_RESID_FIELD_NUMBER = 3;
  public static final int BYTES_TEMPLATE_1_FIELD_NUMBER = 1;
  public static final int UINT32_FLAGS_FIELD_NUMBER = 6;
  public static final int UINT32_RAND_FIELD_NUMBER = 4;
  public static final int UINT32_SEQ_FIELD_NUMBER = 5;
  public static final int UINT32_SERVICE_ID_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_msg_resid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_template_1 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_flags = PBField.initUInt32(0);
  public final PBUInt32Field uint32_rand = PBField.initUInt32(0);
  public final PBUInt32Field uint32_seq = PBField.initUInt32(0);
  public final PBUInt32Field uint32_service_id = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26, 32, 40, 48 }, new String[] { "bytes_template_1", "uint32_service_id", "bytes_msg_resid", "uint32_rand", "uint32_seq", "uint32_flags" }, new Object[] { localByteStringMicro1, Integer.valueOf(0), localByteStringMicro2, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, RichMsg.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$RichMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */