package com.tencent;

public class TIMFaceElem
  extends TIMElem
{
  private byte[] data;
  private int index;
  
  public TIMFaceElem()
  {
    this.type = TIMElemType.Face;
  }
  
  public byte[] getData()
  {
    return this.data;
  }
  
  public int getIndex()
  {
    return this.index;
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
  }
  
  public void setIndex(int paramInt)
  {
    this.index = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFaceElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */