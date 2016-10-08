package com.tencent.av.config;

import com.tencent.av.utils.QLog;

public class ConfigProtocol$AVSwitchTypeTLV
  extends ConfigProtocol.TLVBase
{
  private byte m_bIsAuidoEnable = 1;
  private byte m_bIsOpenMaxEnable = 0;
  
  public ConfigProtocol$AVSwitchTypeTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)11, (short)1);
  }
  
  public byte[] Pack()
  {
    return null;
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramByteBuffer != null)
    {
      bool1 = bool2;
      if (paramByteBuffer.length() > 0)
      {
        int i = paramByteBuffer.ReadUInt8();
        bool1 = bool2;
        if (i >= 0)
        {
          this.m_bIsAuidoEnable = ((byte)(i & 0x1));
          this.m_bIsOpenMaxEnable = ((byte)(i >> 1 & 0x1));
          if (QLog.isColorLevel()) {
            QLog.d("simonchwang", 0, "m_bIsAuidoEnable:" + this.m_bIsAuidoEnable + "m_bIsOpenMaxEnable:" + this.m_bIsOpenMaxEnable);
          }
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public byte getM_bIsAuidoEnable()
  {
    return this.m_bIsAuidoEnable;
  }
  
  public byte getM_bIsOpenMaxEnable()
  {
    return this.m_bIsOpenMaxEnable;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$AVSwitchTypeTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */