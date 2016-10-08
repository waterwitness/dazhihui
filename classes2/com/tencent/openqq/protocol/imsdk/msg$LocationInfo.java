package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBDoubleField;
import com.tencent.mobileqq.pb.PBField;

public final class msg$LocationInfo
  extends MessageMicro<LocationInfo>
{
  public static final int BYTES_DESC_FIELD_NUMBER = 3;
  public static final int DOUBLE_LATITUDE_FIELD_NUMBER = 2;
  public static final int DOUBLE_LONGITUDE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_desc = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBDoubleField double_latitude = PBField.initDouble(0.0D);
  public final PBDoubleField double_longitude = PBField.initDouble(0.0D);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 9, 17, 26 }, new String[] { "double_longitude", "double_latitude", "bytes_desc" }, new Object[] { Double.valueOf(0.0D), Double.valueOf(0.0D), localByteStringMicro }, LocationInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$LocationInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */