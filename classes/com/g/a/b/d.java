package com.g.a.b;

import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.g.a.b.a.e;

public final class d
{
  private final int a;
  private final int b;
  private final int c;
  private final Drawable d;
  private final Drawable e;
  private final Drawable f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final e j;
  private final BitmapFactory.Options k;
  private final int l;
  private final boolean m;
  private final Object n;
  private final com.g.a.b.g.a o;
  private final com.g.a.b.g.a p;
  private final com.g.a.b.c.a q;
  private final Handler r;
  private final boolean s;
  
  private d(f paramf)
  {
    this.a = f.a(paramf);
    this.b = f.b(paramf);
    this.c = f.c(paramf);
    this.d = f.d(paramf);
    this.e = f.e(paramf);
    this.f = f.f(paramf);
    this.g = f.g(paramf);
    this.h = f.h(paramf);
    this.i = f.i(paramf);
    this.j = f.j(paramf);
    this.k = f.k(paramf);
    this.l = f.l(paramf);
    this.m = f.m(paramf);
    this.n = f.n(paramf);
    this.o = f.o(paramf);
    this.p = f.p(paramf);
    this.q = f.q(paramf);
    this.r = f.r(paramf);
    this.s = f.s(paramf);
  }
  
  public static d t()
  {
    return new f().a();
  }
  
  public Drawable a(Resources paramResources)
  {
    if (this.a != 0) {
      return paramResources.getDrawable(this.a);
    }
    return this.d;
  }
  
  public boolean a()
  {
    return (this.d != null) || (this.a != 0);
  }
  
  public Drawable b(Resources paramResources)
  {
    if (this.b != 0) {
      return paramResources.getDrawable(this.b);
    }
    return this.e;
  }
  
  public boolean b()
  {
    return (this.e != null) || (this.b != 0);
  }
  
  public Drawable c(Resources paramResources)
  {
    if (this.c != 0) {
      return paramResources.getDrawable(this.c);
    }
    return this.f;
  }
  
  public boolean c()
  {
    return (this.f != null) || (this.c != 0);
  }
  
  public boolean d()
  {
    return this.o != null;
  }
  
  public boolean e()
  {
    return this.p != null;
  }
  
  public boolean f()
  {
    return this.l > 0;
  }
  
  public boolean g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public boolean i()
  {
    return this.i;
  }
  
  public e j()
  {
    return this.j;
  }
  
  public BitmapFactory.Options k()
  {
    return this.k;
  }
  
  public int l()
  {
    return this.l;
  }
  
  public boolean m()
  {
    return this.m;
  }
  
  public Object n()
  {
    return this.n;
  }
  
  public com.g.a.b.g.a o()
  {
    return this.o;
  }
  
  public com.g.a.b.g.a p()
  {
    return this.p;
  }
  
  public com.g.a.b.c.a q()
  {
    return this.q;
  }
  
  public Handler r()
  {
    return this.r;
  }
  
  boolean s()
  {
    return this.s;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */