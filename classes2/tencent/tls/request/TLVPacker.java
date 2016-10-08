package tencent.tls.request;

import java.util.ArrayList;

public class TLVPacker
{
  private int bodyLen = 0;
  private int tlvCnt = 0;
  private ArrayList<byte[]> tlvList = new ArrayList();
  private int[] tlvs;
  
  public TLVPacker(int[] paramArrayOfInt)
  {
    this.tlvs = paramArrayOfInt;
  }
  
  public byte[] doit()
  {
    Object localObject = this.tlvs;
    int j = localObject.length;
    int i = 0;
    byte[] arrayOfByte;
    while (i < j)
    {
      arrayOfByte = loop(localObject[i]);
      if (arrayOfByte.length > 4)
      {
        this.tlvCnt += 1;
        this.bodyLen += arrayOfByte.length;
        this.tlvList.add(arrayOfByte);
      }
      i += 1;
    }
    localObject = new byte[this.bodyLen];
    i = 0;
    j = 0;
    while (i < this.tlvCnt)
    {
      arrayOfByte = (byte[])this.tlvList.get(i);
      System.arraycopy(arrayOfByte, 0, localObject, j, arrayOfByte.length);
      j += arrayOfByte.length;
      i += 1;
    }
    return (byte[])localObject;
  }
  
  public int getTlvCnt()
  {
    return this.tlvCnt;
  }
  
  protected byte[] loop(int paramInt)
  {
    return new byte[0];
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\TLVPacker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */