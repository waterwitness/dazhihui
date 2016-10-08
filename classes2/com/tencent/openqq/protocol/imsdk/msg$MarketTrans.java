package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$MarketTrans
  extends MessageMicro<MarketTrans>
{
  public static final int BYTES_MSG_RESID_FIELD_NUMBER = 3;
  public static final int BYTES_XML_FIELD_NUMBER = 2;
  public static final int INT32_FLAG_FIELD_NUMBER = 1;
  public static final int UINT32_ABILITY_FIELD_NUMBER = 4;
  public static final int UINT32_MIN_ABILITY_FIELD_NUMBER = 5;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_msg_resid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_xml = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBInt32Field int32_flag = PBField.initInt32(0);
  public final PBUInt32Field uint32_ability = PBField.initUInt32(0);
  public final PBUInt32Field uint32_min_ability = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 40 }, new String[] { "int32_flag", "bytes_xml", "bytes_msg_resid", "uint32_ability", "uint32_min_ability" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, Integer.valueOf(0), Integer.valueOf(0) }, MarketTrans.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\msg$MarketTrans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */