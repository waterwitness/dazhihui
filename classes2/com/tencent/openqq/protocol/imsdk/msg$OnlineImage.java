package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class msg$OnlineImage
  extends MessageMicro<OnlineImage>
{
  public static final int FILE_PATH_FIELD_NUMBER = 2;
  public static final int GUID_FIELD_NUMBER = 1;
  public static final int OLD_VER_SEND_FILE_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField file_path = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField guid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField old_ver_send_file = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26 }, new String[] { "guid", "file_path", "old_ver_send_file" }, new Object[] { localByteStringMicro1, localByteStringMicro2, localByteStringMicro3 }, OnlineImage.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$OnlineImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */