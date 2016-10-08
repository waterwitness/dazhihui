package com.tencent.open.utils;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

class Util$TBufferedOutputStream
  extends BufferedOutputStream
{
  private int a = 0;
  
  public Util$TBufferedOutputStream(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  public int getLength()
  {
    return this.a;
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    super.write(paramArrayOfByte);
    this.a += paramArrayOfByte.length;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\Util$TBufferedOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */