package org.a.a;

import java.io.EOFException;
import java.io.InputStream;
import org.a.e.b.a;

class bv
  extends ca
{
  private static final byte[] b = new byte[0];
  private final int c;
  private int d;
  
  bv(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream, paramInt);
    if (paramInt < 0) {
      throw new IllegalArgumentException("negative lengths not allowed");
    }
    this.c = paramInt;
    this.d = paramInt;
    if (paramInt == 0) {
      b(true);
    }
  }
  
  int a()
  {
    return this.d;
  }
  
  byte[] b()
  {
    if (this.d == 0) {
      return b;
    }
    byte[] arrayOfByte = new byte[this.d];
    int i = this.d - a.a(this.a, arrayOfByte);
    this.d = i;
    if (i != 0) {
      throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
    }
    b(true);
    return arrayOfByte;
  }
  
  public int read()
  {
    int i;
    if (this.d == 0) {
      i = -1;
    }
    int j;
    int k;
    do
    {
      return i;
      j = this.a.read();
      if (j < 0) {
        throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
      }
      k = this.d - 1;
      this.d = k;
      i = j;
    } while (k != 0);
    b(true);
    return j;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.d == 0) {
      paramInt1 = -1;
    }
    int i;
    do
    {
      return paramInt1;
      paramInt2 = Math.min(paramInt2, this.d);
      paramInt2 = this.a.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt2 < 0) {
        throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
      }
      i = this.d - paramInt2;
      this.d = i;
      paramInt1 = paramInt2;
    } while (i != 0);
    b(true);
    return paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */