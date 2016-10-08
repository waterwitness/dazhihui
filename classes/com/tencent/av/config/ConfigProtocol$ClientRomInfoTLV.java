package com.tencent.av.config;

import java.io.UnsupportedEncodingException;

public class ConfigProtocol$ClientRomInfoTLV
  extends ConfigProtocol.TLVBase
{
  private String m_RomInfo;
  
  public ConfigProtocol$ClientRomInfoTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)8, (short)0);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteString(this.m_RomInfo);
    return localByteBuffer.Data();
  }
  
  public void SetRomInfo(String paramString)
  {
    this.m_RomInfo = paramString;
    short s = (short)paramString.length();
    try
    {
      int i = this.m_RomInfo.getBytes("GBK").length;
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
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$ClientRomInfoTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */