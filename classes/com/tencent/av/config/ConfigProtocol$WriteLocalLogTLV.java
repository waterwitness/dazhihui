package com.tencent.av.config;

public class ConfigProtocol$WriteLocalLogTLV
  extends ConfigProtocol.TLVBase
{
  private short m_bIsWrite = 0;
  
  public ConfigProtocol$WriteLocalLogTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)1, (short)2);
  }
  
  public byte[] Pack()
  {
    return null;
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    if ((paramByteBuffer == null) || (paramByteBuffer.length() < 2)) {
      return false;
    }
    this.m_bIsWrite = paramByteBuffer.ReadUInt16();
    return true;
  }
  
  public short getIsWriteLog()
  {
    return this.m_bIsWrite;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$WriteLocalLogTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */