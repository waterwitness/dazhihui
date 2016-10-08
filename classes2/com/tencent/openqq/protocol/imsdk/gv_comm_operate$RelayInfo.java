package com.tencent.openqq.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class gv_comm_operate$RelayInfo
  extends MessageMicro<RelayInfo>
{
  public static final int BYTES_CONTEXT_FIELD_NUMBER = 3;
  public static final int UINT32_CLIENT_IP_FIELD_NUMBER = 1;
  public static final int UINT32_CLIENT_PORT_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_context = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_client_ip = PBField.initUInt32(0);
  public final PBUInt32Field uint32_client_port = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "uint32_client_ip", "uint32_client_port", "bytes_context" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro }, RelayInfo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\protocol\imsdk\gv_comm_operate$RelayInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */