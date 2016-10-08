package org.a.a;

import java.io.EOFException;
import java.io.InputStream;

class bx
  extends ca
{
  private int b;
  private int c;
  private boolean d = false;
  private boolean e = true;
  
  bx(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream, paramInt);
    this.b = paramInputStream.read();
    this.c = paramInputStream.read();
    if (this.c < 0) {
      throw new EOFException();
    }
    b();
  }
  
  private boolean b()
  {
    if ((!this.d) && (this.e) && (this.b == 0) && (this.c == 0))
    {
      this.d = true;
      b(true);
    }
    return this.d;
  }
  
  void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    b();
  }
  
  public int read()
  {
    if (b()) {
      return -1;
    }
    int i = this.a.read();
    if (i < 0) {
      throw new EOFException();
    }
    int j = this.b;
    this.b = this.c;
    this.c = i;
    return j;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.e) || (paramInt2 < 3)) {
      return super.read(paramArrayOfByte, paramInt1, paramInt2);
    }
    if (this.d) {
      return -1;
    }
    paramInt2 = this.a.read(paramArrayOfByte, paramInt1 + 2, paramInt2 - 2);
    if (paramInt2 < 0) {
      throw new EOFException();
    }
    paramArrayOfByte[paramInt1] = ((byte)this.b);
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)this.c);
    this.b = this.a.read();
    this.c = this.a.read();
    if (this.c < 0) {
      throw new EOFException();
    }
    return paramInt2 + 2;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */