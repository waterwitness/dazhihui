package com.tencent.av.config;

import java.io.UnsupportedEncodingException;

public class ConfigProtocol$ClientAppIDTLV
  extends ConfigProtocol.TLVBase
{
  private String appID;
  
  public ConfigProtocol$ClientAppIDTLV(ConfigProtocol paramConfigProtocol, short paramShort)
  {
    super(paramConfigProtocol, (short)3, paramShort);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteString(this.appID);
    return localByteBuffer.Data();
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return true;
  }
  
  public void setAppID(String paramString)
  {
    this.appID = paramString;
    short s = (short)paramString.length();
    try
    {
      int i = paramString.getBytes("GBK").length;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$ClientAppIDTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */