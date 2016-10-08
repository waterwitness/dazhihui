package com.baidu.location;

public final class k
{
  public String a = "gcj02";
  public String b = "detail";
  public boolean c = false;
  public int d = 0;
  public int e = 12000;
  public String f = "SDK6.0";
  public int g = 1;
  public boolean h = false;
  public boolean i = true;
  public boolean j = false;
  public String k = "com.baidu.location.service_v2.9";
  public boolean l = false;
  public boolean m = true;
  public boolean n = false;
  public boolean o = false;
  public boolean p = false;
  public boolean q = false;
  public boolean r = false;
  public boolean s = false;
  protected m t;
  
  public k() {}
  
  public k(k paramk)
  {
    this.a = paramk.a;
    this.b = paramk.b;
    this.c = paramk.c;
    this.d = paramk.d;
    this.e = paramk.e;
    this.f = paramk.f;
    this.g = paramk.g;
    this.h = paramk.h;
    this.k = paramk.k;
    this.i = paramk.i;
    this.l = paramk.l;
    this.m = paramk.m;
    this.j = paramk.j;
    this.t = paramk.t;
    this.o = paramk.o;
    this.p = paramk.p;
    this.q = paramk.q;
    this.r = paramk.r;
    this.n = paramk.n;
    this.s = paramk.s;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(m paramm)
  {
    switch (l.a[paramm.ordinal()])
    {
    default: 
      throw new IllegalArgumentException("Illegal this mode : " + paramm);
    case 1: 
      this.c = true;
      this.g = 1;
    }
    for (;;)
    {
      this.t = paramm;
      return;
      this.c = false;
      this.g = 2;
      continue;
      this.g = 3;
      this.c = true;
    }
  }
  
  public void a(String paramString)
  {
    paramString = paramString.toLowerCase();
    if ((paramString.equals("gcj02")) || (paramString.equals("bd09")) || (paramString.equals("bd09ll"))) {
      this.a = paramString;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b = "all";
      return;
    }
    this.b = "noaddr";
  }
  
  public boolean a(k paramk)
  {
    return (this.a.equals(paramk.a)) && (this.b.equals(paramk.b)) && (this.c == paramk.c) && (this.d == paramk.d) && (this.e == paramk.e) && (this.f.equals(paramk.f)) && (this.h == paramk.h) && (this.g == paramk.g) && (this.i == paramk.i) && (this.l == paramk.l) && (this.m == paramk.m) && (this.o == paramk.o) && (this.p == paramk.p) && (this.q == paramk.q) && (this.r == paramk.r) && (this.n == paramk.n) && (this.s == paramk.s) && (this.t == paramk.t);
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public void c(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public boolean c()
  {
    return this.i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */