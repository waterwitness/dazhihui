package com.tencent.av.config;

import java.io.UnsupportedEncodingException;

public class ConfigProtocol$EngineVersionTLV
  extends ConfigProtocol.TLVBase
{
  private String engienVersion;
  
  public ConfigProtocol$EngineVersionTLV(ConfigProtocol paramConfigProtocol, short paramShort)
  {
    super(paramConfigProtocol, (short)4, paramShort);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteString(this.engienVersion);
    return localByteBuffer.Data();
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return true;
  }
  
  public void setEngienVersion(String paramString)
  {
    this.engienVersion = paramString;
    short s = (short)paramString.length();
    try
    {
      int i = this.engienVersion.getBytes("GBK").length;
      s = (short)i;
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
    setLength(s);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$EngineVersionTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */