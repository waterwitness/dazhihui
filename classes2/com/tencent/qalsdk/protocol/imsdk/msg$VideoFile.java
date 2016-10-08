package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$VideoFile
  extends MessageMicro<VideoFile>
{
  public static final int BYTES_FILE_MD5_FIELD_NUMBER = 2;
  public static final int BYTES_FILE_NAME_FIELD_NUMBER = 3;
  public static final int BYTES_FILE_UUID_FIELD_NUMBER = 1;
  public static final int BYTES_SOURCE_FIELD_NUMBER = 10;
  public static final int BYTES_THUMB_FILE_MD5_FIELD_NUMBER = 9;
  public static final int UINT32_BUSI_TYPE_FIELD_NUMBER = 12;
  public static final int UINT32_FILE_FORMAT_FIELD_NUMBER = 4;
  public static final int UINT32_FILE_SIZE_FIELD_NUMBER = 6;
  public static final int UINT32_FILE_TIME_FIELD_NUMBER = 5;
  public static final int UINT32_FROM_CHAT_TYPE_FIELD_NUMBER = 13;
  public static final int UINT32_THUMB_FILE_SIZE_FIELD_NUMBER = 11;
  public static final int UINT32_THUMB_HEIGHT_FIELD_NUMBER = 8;
  public static final int UINT32_THUMB_WIDTH_FIELD_NUMBER = 7;
  public static final int UINT32_TO_CHAT_TYPE_FIELD_NUMBER = 14;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_file_md5 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_file_name = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_file_uuid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_source = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_thumb_file_md5 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_busi_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_file_format = PBField.initUInt32(0);
  public final PBUInt32Field uint32_file_size = PBField.initUInt32(0);
  public final PBUInt32Field uint32_file_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_from_chat_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_thumb_file_size = PBField.initUInt32(0);
  public final PBUInt32Field uint32_thumb_height = PBField.initUInt32(0);
  public final PBUInt32Field uint32_thumb_width = PBField.initUInt32(0);
  public final PBUInt32Field uint32_to_chat_type = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro5 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 32, 40, 48, 56, 64, 74, 82, 88, 96, 104, 112 }, new String[] { "bytes_file_uuid", "bytes_file_md5", "bytes_file_name", "uint32_file_format", "uint32_file_time", "uint32_file_size", "uint32_thumb_width", "uint32_thumb_height", "bytes_thumb_file_md5", "bytes_source", "uint32_thumb_file_size", "uint32_busi_type", "uint32_from_chat_type", "uint32_to_chat_type" }, new Object[] { localByteStringMicro1, localByteStringMicro2, localByteStringMicro3, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro4, localByteStringMicro5, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, VideoFile.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$VideoFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */