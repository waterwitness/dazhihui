package com.tencent.av.config;

public class ConfigProtocol$ClientOSTypeTLV
  extends ConfigProtocol.TLVBase
{
  private short clientOSType;
  
  public ConfigProtocol$ClientOSTypeTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)2, (short)2);
    setClientOSType((short)0);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteUInt16(this.clientOSType);
    return localByteBuffer.Data();
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return true;
  }
  
  public void setClientOSType(short paramShort)
  {
    this.clientOSType = paramShort;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$ClientOSTypeTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */