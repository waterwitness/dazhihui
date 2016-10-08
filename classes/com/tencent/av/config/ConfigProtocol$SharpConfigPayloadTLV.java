package com.tencent.av.config;

public class ConfigProtocol$SharpConfigPayloadTLV
  extends ConfigProtocol.TLVBase
{
  private String m_sharpConfigPayload;
  
  public ConfigProtocol$SharpConfigPayloadTLV(ConfigProtocol paramConfigProtocol, short paramShort)
  {
    super(paramConfigProtocol, (short)14, paramShort);
  }
  
  public byte[] Pack()
  {
    return null;
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    if ((paramByteBuffer == null) || (paramByteBuffer.length() < getLength())) {
      return false;
    }
    this.m_sharpConfigPayload = paramByteBuffer.ReadString(getLength());
    return true;
  }
  
  public String getSharpConfigPayload()
  {
    return this.m_sharpConfigPayload;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$SharpConfigPayloadTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */