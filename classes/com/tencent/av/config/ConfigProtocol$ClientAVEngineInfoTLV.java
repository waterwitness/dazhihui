package com.tencent.av.config;

public class ConfigProtocol$ClientAVEngineInfoTLV
  extends ConfigProtocol.TLVBase
{
  private short m_DispHeight;
  private short m_DispWidth;
  private byte m_maxDecFPS;
  private byte m_maxEncFPS;
  
  public ConfigProtocol$ClientAVEngineInfoTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)7, (short)6);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteUInt8(this.m_maxEncFPS);
    localByteBuffer.WriteUInt8(this.m_maxDecFPS);
    localByteBuffer.WriteUInt16(this.m_DispWidth);
    localByteBuffer.WriteUInt16(this.m_DispHeight);
    return localByteBuffer.Data();
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return true;
  }
  
  void setAVEngineInfo(byte paramByte1, byte paramByte2, short paramShort1, short paramShort2)
  {
    this.m_maxEncFPS = paramByte1;
    this.m_maxDecFPS = paramByte2;
    this.m_DispWidth = paramShort1;
    this.m_DispHeight = paramShort2;
    setLength((short)6);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$ClientAVEngineInfoTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */