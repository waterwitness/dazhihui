package com.d.a.c.d;

import com.d.a.ai;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class p
{
  k[] a = new k[8];
  int b = this.a.length - 1;
  int c = 0;
  c d = new d();
  c e = new d();
  int f = 0;
  private final List<k> g = new ArrayList();
  private final ai h = new ai();
  private int i;
  private int j;
  
  p(int paramInt)
  {
    this.i = paramInt;
    this.j = paramInt;
  }
  
  private void a(int paramInt, k paramk)
  {
    int k = paramk.j;
    if (paramInt != -1) {
      k -= this.a[d(paramInt)].j;
    }
    for (;;)
    {
      if (k > this.j)
      {
        f();
        this.g.add(paramk);
        return;
      }
      int m = b(this.f + k - this.j);
      if (paramInt == -1)
      {
        if (this.c + 1 > this.a.length)
        {
          k[] arrayOfk = new k[this.a.length * 2];
          System.arraycopy(this.a, 0, arrayOfk, this.a.length, this.a.length);
          if (arrayOfk.length == 64)
          {
            this.d = ((d)this.d).b();
            this.e = ((d)this.e).b();
          }
          this.d.d(this.a.length);
          this.e.d(this.a.length);
          this.b = (this.a.length - 1);
          this.a = arrayOfk;
        }
        paramInt = this.b;
        this.b = (paramInt - 1);
        this.d.a(paramInt);
        this.a[paramInt] = paramk;
        this.c += 1;
      }
      for (;;)
      {
        this.f += k;
        return;
        paramInt = m + d(paramInt) + paramInt;
        this.d.a(paramInt);
        this.a[paramInt] = paramk;
      }
    }
  }
  
  private int b(int paramInt)
  {
    int k = 0;
    int n = 0;
    int m;
    if (paramInt > 0)
    {
      k = this.a.length - 1;
      m = paramInt;
      paramInt = n;
    }
    for (;;)
    {
      if ((k < this.b) || (m <= 0))
      {
        this.d.d(paramInt);
        this.e.d(paramInt);
        System.arraycopy(this.a, this.b + 1, this.a, this.b + 1 + paramInt, this.c);
        this.b += paramInt;
        k = paramInt;
        return k;
      }
      m -= this.a[k].j;
      this.f -= this.a[k].j;
      this.c -= 1;
      paramInt += 1;
      k -= 1;
    }
  }
  
  private void c(int paramInt)
  {
    if (h(paramInt))
    {
      paramInt -= this.c;
      if (paramInt > o.a().length - 1) {
        throw new IOException("Header index too large " + (paramInt + 1));
      }
      k localk = o.a()[paramInt];
      if (this.j == 0)
      {
        this.g.add(localk);
        return;
      }
      a(-1, localk);
      return;
    }
    paramInt = d(paramInt);
    if (!this.d.c(paramInt))
    {
      this.g.add(this.a[paramInt]);
      this.e.a(paramInt);
    }
    this.d.b(paramInt);
  }
  
  private int d(int paramInt)
  {
    return this.b + 1 + paramInt;
  }
  
  private void e()
  {
    if (this.j < this.f)
    {
      if (this.j == 0) {
        f();
      }
    }
    else {
      return;
    }
    b(this.f - this.j);
  }
  
  private void e(int paramInt)
  {
    f localf1 = g(paramInt);
    f localf2 = d();
    this.g.add(new k(localf1, localf2));
  }
  
  private void f()
  {
    g();
    Arrays.fill(this.a, null);
    this.b = (this.a.length - 1);
    this.c = 0;
    this.f = 0;
  }
  
  private void f(int paramInt)
  {
    a(-1, new k(g(paramInt), d()));
  }
  
  private f g(int paramInt)
  {
    if (h(paramInt)) {
      return o.a()[(paramInt - this.c)].h;
    }
    return this.a[d(paramInt)].h;
  }
  
  private void g()
  {
    this.d.a();
    this.e.a();
  }
  
  private void h()
  {
    f localf1 = o.a(d());
    f localf2 = d();
    this.g.add(new k(localf1, localf2));
  }
  
  private boolean h(int paramInt)
  {
    return paramInt >= this.c;
  }
  
  private void i()
  {
    a(-1, new k(o.a(d()), d()));
  }
  
  private int j()
  {
    return this.h.i() & 0xFF;
  }
  
  int a(int paramInt1, int paramInt2)
  {
    paramInt1 &= paramInt2;
    if (paramInt1 < paramInt2) {
      return paramInt1;
    }
    paramInt1 = 0;
    int k;
    for (;;)
    {
      k = j();
      if ((k & 0x80) == 0) {
        break;
      }
      paramInt2 += ((k & 0x7F) << paramInt1);
      paramInt1 += 7;
    }
    return (k << paramInt1) + paramInt2;
  }
  
  void a()
  {
    for (;;)
    {
      if (!this.h.e()) {
        return;
      }
      int k = this.h.i() & 0xFF;
      if (k == 128) {
        throw new IOException("index == 0");
      }
      if ((k & 0x80) == 128) {
        c(a(k, 127) - 1);
      } else if (k == 64) {
        i();
      } else if ((k & 0x40) == 64) {
        f(a(k, 63) - 1);
      } else if ((k & 0x20) == 32)
      {
        if ((k & 0x10) == 16)
        {
          if ((k & 0xF) != 0) {
            throw new IOException("Invalid header table state change " + k);
          }
          g();
        }
        else
        {
          this.j = a(k, 15);
          if ((this.j < 0) || (this.j > this.i)) {
            throw new IOException("Invalid header table byte count " + this.j);
          }
          e();
        }
      }
      else if ((k == 16) || (k == 0)) {
        h();
      } else {
        e(a(k, 15) - 1);
      }
    }
  }
  
  void a(int paramInt)
  {
    this.i = paramInt;
    this.j = this.i;
    e();
  }
  
  public void a(ai paramai)
  {
    paramai.a(this.h);
  }
  
  void b()
  {
    int k = this.a.length - 1;
    for (;;)
    {
      if (k == this.b) {
        return;
      }
      if ((this.d.c(k)) && (!this.e.c(k))) {
        this.g.add(this.a[k]);
      }
      k -= 1;
    }
  }
  
  List<k> c()
  {
    ArrayList localArrayList = new ArrayList(this.g);
    this.g.clear();
    this.e.a();
    return localArrayList;
  }
  
  f d()
  {
    int m = j();
    if ((m & 0x80) == 128) {}
    for (int k = 1;; k = 0)
    {
      m = a(m, 127);
      if (k == 0) {
        break;
      }
      return f.a(x.a().a(this.h.a(m)));
    }
    return f.a(this.h.a(m));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */