package com.android.dazhihui.ui.delegate.b.a;

import java.io.InputStream;

public class k
  extends InputStream
{
  protected l a = new l();
  protected int b = 512;
  protected int c = 0;
  protected byte[] d = new byte[this.b];
  protected byte[] e = new byte[1];
  protected boolean f;
  protected InputStream g = null;
  private boolean h = false;
  
  public k(InputStream paramInputStream)
  {
    this(paramInputStream, false);
  }
  
  public k(InputStream paramInputStream, boolean paramBoolean)
  {
    this.g = paramInputStream;
    this.a.a(paramBoolean);
    this.f = false;
    this.a.a = this.d;
    this.a.b = 0;
    this.a.c = 0;
  }
  
  public void close()
  {
    this.g.close();
  }
  
  public int read()
  {
    if (this.g.read(this.e, 0, 1) == -1) {
      return -1;
    }
    return this.e[0] & 0xFF;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    this.a.e = paramArrayOfByte;
    this.a.f = paramInt1;
    this.a.g = paramInt2;
    do
    {
      if ((this.a.c == 0) && (!this.h))
      {
        this.a.b = 0;
        this.a.c = this.g.read(this.d, 0, this.b);
        if (this.a.c == -1)
        {
          this.a.c = 0;
          this.h = true;
        }
      }
      if (this.f) {}
      for (paramInt1 = this.a.b(this.c); (this.h) && (paramInt1 == -5); paramInt1 = this.a.a(this.c)) {
        return -1;
      }
      if ((paramInt1 != 0) && (paramInt1 != 1))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        if (this.f) {}
        for (paramArrayOfByte = "de";; paramArrayOfByte = "in") {
          throw new m(paramArrayOfByte + "flating: " + this.a.i);
        }
      }
      if (((this.h) || (paramInt1 == 1)) && (this.a.g == paramInt2)) {
        return -1;
      }
    } while ((this.a.g == paramInt2) && (paramInt1 == 0));
    return paramInt2 - this.a.g;
  }
  
  public long skip(long paramLong)
  {
    int i = 512;
    if (paramLong < 'Ȁ') {
      i = (int)paramLong;
    }
    byte[] arrayOfByte = new byte[i];
    return this.g.read(arrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */