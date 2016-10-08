package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$TmpPtt
  extends MessageMicro<TmpPtt>
{
  public static final int BYTES_FILE_MD5_FIELD_NUMBER = 3;
  public static final int BYTES_FILE_NAME_FIELD_NUMBER = 4;
  public static final int BYTES_FILE_UUID_FIELD_NUMBER = 2;
  public static final int BYTES_PB_RESERVE_FIELD_NUMBER = 30;
  public static final int UINT32_BUSI_TYPE_FIELD_NUMBER = 9;
  public static final int UINT32_FILE_SIZE_FIELD_NUMBER = 5;
  public static final int UINT32_FILE_TYPE_FIELD_NUMBER = 1;
  public static final int UINT32_PTTTRANS_FLAG_FIELD_NUMBER = 8;
  public static final int UINT32_USER_TYPE_FIELD_NUMBER = 7;
  public static final int UINT64_PTT_TIMES_FIELD_NUMBER = 6;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_file_md5 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_file_name = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_file_uuid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_pb_reserve = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_busi_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_file_size = PBField.initUInt32(0);
  public final PBUInt32Field uint32_file_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_ptttrans_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_user_type = PBField.initUInt32(0);
  public final PBUInt32Field uint64_ptt_times = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34, 40, 48, 56, 64, 72, 242 }, new String[] { "uint32_file_type", "bytes_file_uuid", "bytes_file_md5", "bytes_file_name", "uint32_file_size", "uint64_ptt_times", "uint32_user_type", "uint32_ptttrans_flag", "uint32_busi_type", "bytes_pb_reserve" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, localByteStringMicro3, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro4 }, TmpPtt.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$TmpPtt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */