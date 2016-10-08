package com.android.dazhihui.ui.delegate.b.a;

import java.io.PrintStream;

public final class l
{
  public byte[] a;
  public int b;
  public int c;
  public long d;
  public byte[] e;
  public int f;
  public int g;
  public long h;
  public String i;
  b j;
  g k;
  public long l;
  a m = new a();
  
  public int a(int paramInt)
  {
    if (this.k == null) {
      return -2;
    }
    return this.k.b(this, paramInt);
  }
  
  public int a(int paramInt, boolean paramBoolean)
  {
    this.k = new g();
    g localg = this.k;
    int n = paramInt;
    if (paramBoolean) {
      n = -paramInt;
    }
    return localg.a(this, n);
  }
  
  public int a(boolean paramBoolean)
  {
    return a(15, paramBoolean);
  }
  
  int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = this.c;
    int n = i1;
    if (i1 > paramInt2) {
      n = paramInt2;
    }
    if (n == 0) {
      return 0;
    }
    this.c -= n;
    if (this.j.g == 0) {
      this.l = this.m.a(this.l, this.a, this.b, n);
    }
    System.arraycopy(this.a, this.b, paramArrayOfByte, paramInt1, n);
    this.b += n;
    this.d += n;
    return n;
  }
  
  void a()
  {
    int i1 = this.j.f;
    int n = i1;
    if (i1 > this.g) {
      n = this.g;
    }
    if (n == 0) {}
    do
    {
      return;
      if ((this.j.c.length <= this.j.e) || (this.e.length <= this.f) || (this.j.c.length < this.j.e + n) || (this.e.length < this.f + n))
      {
        System.out.println(this.j.c.length + ", " + this.j.e + ", " + this.e.length + ", " + this.f + ", " + n);
        System.out.println("avail_out=" + this.g);
      }
      System.arraycopy(this.j.c, this.j.e, this.e, this.f, n);
      this.f += n;
      b localb = this.j;
      localb.e += n;
      this.h += n;
      this.g -= n;
      localb = this.j;
      localb.f -= n;
    } while (this.j.f != 0);
    this.j.e = 0;
  }
  
  public int b(int paramInt)
  {
    if (this.j == null) {
      return -2;
    }
    return this.j.a(this, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */