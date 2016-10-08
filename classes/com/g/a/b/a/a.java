package com.g.a.b.a;

import java.io.InputStream;

public class a
  extends InputStream
{
  private final InputStream a;
  private final int b;
  
  public a(InputStream paramInputStream, int paramInt)
  {
    this.a = paramInputStream;
    this.b = paramInt;
  }
  
  public int available()
  {
    return this.b;
  }
  
  public void close()
  {
    this.a.close();
  }
  
  public void mark(int paramInt)
  {
    this.a.mark(paramInt);
  }
  
  public boolean markSupported()
  {
    return this.a.markSupported();
  }
  
  public int read()
  {
    return this.a.read();
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    return this.a.read(paramArrayOfByte);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.a.read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void reset()
  {
    this.a.reset();
  }
  
  public long skip(long paramLong)
  {
    return this.a.skip(paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */