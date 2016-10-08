package com.tencent.av.config;

public abstract class ConfigProtocol$TLVBase
{
  private short length;
  private short type;
  
  public ConfigProtocol$TLVBase(ConfigProtocol paramConfigProtocol, short paramShort1, short paramShort2)
  {
    this.type = paramShort1;
    this.length = paramShort2;
  }
  
  public abstract byte[] Pack();
  
  public abstract boolean Unpack(ByteBuffer paramByteBuffer);
  
  public short getLength()
  {
    return this.length;
  }
  
  public short getType()
  {
    return this.type;
  }
  
  public void setLength(short paramShort)
  {
    this.length = paramShort;
  }
  
  public void setType(short paramShort)
  {
    this.type = paramShort;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$TLVBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */