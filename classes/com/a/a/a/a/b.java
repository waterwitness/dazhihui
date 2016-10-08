package com.a.a.a.a;

public abstract class b
{
  private final int a;
  protected final byte b = 61;
  protected final int c;
  protected byte[] d;
  protected int e;
  protected boolean f;
  protected int g;
  protected int h;
  private final int i;
  private final int j;
  private int k;
  
  protected b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.i = paramInt2;
    if ((paramInt3 > 0) && (paramInt4 > 0)) {}
    for (paramInt1 = paramInt3 / paramInt2 * paramInt2;; paramInt1 = 0)
    {
      this.c = paramInt1;
      this.j = paramInt4;
      return;
    }
  }
  
  private void c()
  {
    if (this.d == null)
    {
      this.d = new byte[b()];
      this.e = 0;
      this.k = 0;
      return;
    }
    byte[] arrayOfByte = new byte[this.d.length * 2];
    System.arraycopy(this.d, 0, arrayOfByte, 0, this.d.length);
    this.d = arrayOfByte;
  }
  
  private void d()
  {
    this.d = null;
    this.e = 0;
    this.k = 0;
    this.g = 0;
    this.h = 0;
    this.f = false;
  }
  
  int a()
  {
    if (this.d != null) {
      return this.e - this.k;
    }
    return 0;
  }
  
  protected void a(int paramInt)
  {
    if ((this.d == null) || (this.d.length < this.e + paramInt)) {
      c();
    }
  }
  
  abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  protected abstract boolean a(byte paramByte);
  
  protected int b()
  {
    return 8192;
  }
  
  abstract void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public byte[] b(String paramString)
  {
    return e(d.a(paramString));
  }
  
  int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.d != null)
    {
      paramInt2 = Math.min(a(), paramInt2);
      System.arraycopy(this.d, this.k, paramArrayOfByte, paramInt1, paramInt2);
      this.k += paramInt2;
      if (this.k >= this.e) {
        this.d = null;
      }
      return paramInt2;
    }
    if (this.f) {
      return -1;
    }
    return 0;
  }
  
  public byte[] e(byte[] paramArrayOfByte)
  {
    d();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return paramArrayOfByte;
    }
    b(paramArrayOfByte, 0, paramArrayOfByte.length);
    b(paramArrayOfByte, 0, -1);
    paramArrayOfByte = new byte[this.e];
    c(paramArrayOfByte, 0, paramArrayOfByte.length);
    return paramArrayOfByte;
  }
  
  public byte[] f(byte[] paramArrayOfByte)
  {
    d();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return paramArrayOfByte;
    }
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
    a(paramArrayOfByte, 0, -1);
    paramArrayOfByte = new byte[this.e - this.k];
    c(paramArrayOfByte, 0, paramArrayOfByte.length);
    return paramArrayOfByte;
  }
  
  protected boolean g(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return false;
      int n = paramArrayOfByte.length;
      int m = 0;
      while (m < n)
      {
        byte b1 = paramArrayOfByte[m];
        if ((61 == b1) || (a(b1))) {
          return true;
        }
        m += 1;
      }
    }
  }
  
  public long h(byte[] paramArrayOfByte)
  {
    long l2 = (paramArrayOfByte.length + this.a - 1) / this.a * this.i;
    long l1 = l2;
    if (this.c > 0) {
      l1 = l2 + (this.c + l2 - 1L) / this.c * this.j;
    }
    return l1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\a\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */