package com.tencent.av.config;

public class ConfigProtocol$ClientHardWareInfoTLV
  extends ConfigProtocol.TLVBase
{
  private short angleForCamera;
  private short cpuChipArch;
  private int cpuFreq;
  private short numOfCore;
  
  public ConfigProtocol$ClientHardWareInfoTLV(ConfigProtocol paramConfigProtocol)
  {
    super(paramConfigProtocol, (short)6, (short)10);
  }
  
  public byte[] Pack()
  {
    ByteBuffer localByteBuffer = new ByteBuffer();
    localByteBuffer.WriteUInt16(this.cpuChipArch);
    localByteBuffer.WriteUInt16(this.numOfCore);
    localByteBuffer.WriteUInt32(this.cpuFreq);
    localByteBuffer.WriteUInt16(this.angleForCamera);
    return localByteBuffer.Data();
  }
  
  public boolean Unpack(ByteBuffer paramByteBuffer)
  {
    return true;
  }
  
  public void setHardWareInfo(short paramShort1, short paramShort2, int paramInt, short paramShort3)
  {
    this.cpuChipArch = paramShort1;
    this.numOfCore = paramShort2;
    this.cpuFreq = paramInt;
    this.angleForCamera = paramShort3;
    setLength((short)10);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\config\ConfigProtocol$ClientHardWareInfoTLV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */