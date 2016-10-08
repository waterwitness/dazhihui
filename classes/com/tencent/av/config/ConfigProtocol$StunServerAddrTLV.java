package com.tencent.av.config;

import java.util.ArrayList;

public class ConfigProtocol$StunServerAddrTLV
  extends ConfigProtocol.TLVBase
{
  private ArrayList<ConfigProtocol.stNetAddress> addrList = new ArrayList();
  
  public ConfigProtocol$StunServerAddrTLV(ConfigProtocol paramConfigProtocol, short paramShort)
  {
    super(paramConfigProtocol, (short)4, paramShort);
  }
  
  public ConfigProtocol.stNetAddress GetStunSvrAddrByIndex(int paramInt)
  {
    if ((paramInt >= this.addrList.size()) || (paramInt < 0)) {
      return null;
    }
    return (ConfigProtocol.stNetAddress)this.addrList.get(paramInt);
  }
  
  public int GetStunSvrAddrCount()
  {
    return this.addrList.size();
  }
  
  public byte[] Pack()
  {
    return null;
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    int i = 0;
    if (paramByteBuffer == null) {}
    int j;
    do
    {
      do
      {
        return false;
      } while (getLength() < 2);
      j = paramByteBuffer.ReadUInt16();
    } while (j != (getLength() - 2) / 6);
    while (i < j)
    {
      int k = paramByteBuffer.ReadUInt32();
      short s = paramByteBuffer.ReadUInt16();
      ConfigProtocol.stNetAddress localstNetAddress = new ConfigProtocol.stNetAddress(this.this$0);
      localstNetAddress.m_ip = k;
      localstNetAddress.m_port = s;
      this.addrList.add(localstNetAddress);
      i += 1;
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$StunServerAddrTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */