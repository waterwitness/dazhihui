package com.android.thinkive.framework.network.http;

import java.io.FilterOutputStream;
import java.io.OutputStream;

class ProgressEntity$1ProxyOutputStream
  extends FilterOutputStream
{
  public ProgressEntity$1ProxyOutputStream(ProgressEntity paramProgressEntity, OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  public void close()
  {
    this.out.close();
  }
  
  public void flush()
  {
    this.out.flush();
  }
  
  public void write(int paramInt)
  {
    this.out.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    this.out.write(paramArrayOfByte);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\ProgressEntity$1ProxyOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */