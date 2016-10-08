package com.tencent.av.config;

import java.io.UnsupportedEncodingException;

public class ConfigProtocol$ClientDevNameTLV
  extends ConfigProtocol.TLVBase
{
  private String devNameInfo;
  
  public ConfigProtocol$ClientDevNameTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)5, (short)0);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteString(this.devNameInfo);
    return localByteBuffer.Data();
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return true;
  }
  
  public void setDevNameInfo(String paramString)
  {
    this.devNameInfo = paramString;
    short s = (short)paramString.length();
    try
    {
      int i = this.devNameInfo.getBytes("GBK").length;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$ClientDevNameTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */