package com.tencent.av.config;

public class ConfigProtocol$ConnForbidTypeTLV
  extends ConfigProtocol.TLVBase
{
  private short m_ConnType = 0;
  
  public ConfigProtocol$ConnForbidTypeTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)5, (short)2);
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
    this.m_ConnType = paramByteBuffer.ReadUInt16();
    return true;
  }
  
  public short getConnForbidType()
  {
    return this.m_ConnType;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$ConnForbidTypeTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */