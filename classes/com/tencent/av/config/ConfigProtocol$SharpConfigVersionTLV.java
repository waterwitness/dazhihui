package com.tencent.av.config;

public class ConfigProtocol$SharpConfigVersionTLV
  extends ConfigProtocol.TLVBase
{
  private int m_sharpConfigVersion;
  
  public ConfigProtocol$SharpConfigVersionTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)10, (short)4);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteUInt32(this.m_sharpConfigVersion);
    return localByteBuffer.Data();
  }
  
  public void SetSharpConfigVersion(int paramInt)
  {
    this.m_sharpConfigVersion = paramInt;
    setLength((short)4);
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$SharpConfigVersionTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */