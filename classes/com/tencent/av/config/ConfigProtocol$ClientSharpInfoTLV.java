package com.tencent.av.config;

public class ConfigProtocol$ClientSharpInfoTLV
  extends ConfigProtocol.TLVBase
{
  private int m_opensl = 0;
  
  public ConfigProtocol$ClientSharpInfoTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)9, (short)4);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteUInt32(this.m_opensl);
    return localByteBuffer.Data();
  }
  
  void SetOpenslInfo(int paramInt)
  {
    this.m_opensl = paramInt;
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$ClientSharpInfoTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */