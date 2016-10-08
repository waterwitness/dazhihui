package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class sdk_init$RspBody
  extends MessageMicro<RspBody>
{
  public static final int A2_FIELD_NUMBER = 4;
  public static final int D2KEY_FIELD_NUMBER = 6;
  public static final int D2_FIELD_NUMBER = 5;
  public static final int ENUM_CMD_ERROR_CODE_FIELD_NUMBER = 1;
  public static final int TINYID_FIELD_NUMBER = 3;
  public static final int UIN_FIELD_NUMBER = 7;
  public static final int USERID_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField a2 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField d2 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField d2key = PBField.initBytes(ByteStringMicro.EMPTY);
  public common.CmdErrorCode enum_cmd_error_code = new common.CmdErrorCode();
  public final PBUInt64Field tinyid = PBField.initUInt64(0L);
  public final PBUInt64Field uin = PBField.initUInt64(0L);
  public final PBBytesField userid = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 24, 34, 42, 50, 56 }, new String[] { "enum_cmd_error_code", "userid", "tinyid", "a2", "d2", "d2key", "uin" }, new Object[] { null, localByteStringMicro1, Long.valueOf(0L), localByteStringMicro2, localByteStringMicro3, localByteStringMicro4, Long.valueOf(0L) }, RspBody.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\sdk_init$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */