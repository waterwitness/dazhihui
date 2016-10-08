package com.tencent;

public class TIMCustomElem
  extends TIMElem
{
  byte[] data;
  private String desc;
  byte[] ext;
  byte[] sound;
  
  public TIMCustomElem()
  {
    this.type = TIMElemType.Custom;
  }
  
  public byte[] getData()
  {
    if (this.data == null) {
      return "".getBytes();
    }
    return this.data;
  }
  
  public String getDesc()
  {
    if (this.desc == null) {
      return "";
    }
    return this.desc;
  }
  
  public byte[] getExt()
  {
    if (this.ext == null) {
      return "".getBytes();
    }
    return this.ext;
  }
  
  public byte[] getSound()
  {
    if (this.sound == null) {
      return "".getBytes();
    }
    return this.sound;
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
  }
  
  public void setDesc(String paramString)
  {
    this.desc = paramString;
  }
  
  public void setExt(byte[] paramArrayOfByte)
  {
    this.ext = paramArrayOfByte;
  }
  
  public void setSound(byte[] paramArrayOfByte)
  {
    this.sound = paramArrayOfByte;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMCustomElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */