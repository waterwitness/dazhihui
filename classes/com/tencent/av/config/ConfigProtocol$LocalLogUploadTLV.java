package com.tencent.av.config;

public class ConfigProtocol$LocalLogUploadTLV
  extends ConfigProtocol.TLVBase
{
  private String m_allStr;
  private String m_endTimeStr;
  private String m_startTimeStr;
  
  public ConfigProtocol$LocalLogUploadTLV(ConfigProtocol paramConfigProtocol, short paramShort)
  {
    super(paramConfigProtocol, (short)2, paramShort);
  }
  
  public byte[] Pack()
  {
    return null;
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    if ((paramByteBuffer == null) || (paramByteBuffer.length() < getLength())) {
      return false;
    }
    this.m_allStr = paramByteBuffer.ReadString(getLength());
    return true;
  }
  
  public boolean getLogUploadTimeScope()
  {
    if (this.m_allStr.length() < "2012/03/05/08,2012/03/05/20".length()) {
      return false;
    }
    this.m_startTimeStr = this.m_allStr.substring(0, 13);
    this.m_endTimeStr = this.m_allStr.substring(14, 13);
    return true;
  }
  
  public String getM_endTimeStr()
  {
    return this.m_endTimeStr;
  }
  
  public String getM_startTimeStr()
  {
    return this.m_startTimeStr;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$LocalLogUploadTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */