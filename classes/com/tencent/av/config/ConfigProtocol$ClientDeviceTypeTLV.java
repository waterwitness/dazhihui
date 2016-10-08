package com.tencent.av.config;

public class ConfigProtocol$ClientDeviceTypeTLV
  extends ConfigProtocol.TLVBase
{
  private short clientType = 0;
  
  public ConfigProtocol$ClientDeviceTypeTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)1, (short)2);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteUInt16(this.clientType);
    return localByteBuffer.Data();
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return true;
  }
  
  public void setClientType(short paramShort)
  {
    this.clientType = paramShort;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$ClientDeviceTypeTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */