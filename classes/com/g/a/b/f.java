package com.g.a.b;

import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.g.a.b.a.e;

public class f
{
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private Drawable d = null;
  private Drawable e = null;
  private Drawable f = null;
  private boolean g = false;
  private boolean h = false;
  private boolean i = false;
  private e j = e.c;
  private BitmapFactory.Options k = new BitmapFactory.Options();
  private int l = 0;
  private boolean m = false;
  private Object n = null;
  private com.g.a.b.g.a o = null;
  private com.g.a.b.g.a p = null;
  private com.g.a.b.c.a q = a.c();
  private Handler r = null;
  private boolean s = false;
  
  public d a()
  {
    return new d(this, null);
  }
  
  public f a(int paramInt)
  {
    this.a = paramInt;
    return this;
  }
  
  public f a(Bitmap.Config paramConfig)
  {
    if (paramConfig == null) {
      throw new IllegalArgumentException("bitmapConfig can't be null");
    }
    this.k.inPreferredConfig = paramConfig;
    return this;
  }
  
  public f a(e parame)
  {
    this.j = parame;
    return this;
  }
  
  public f a(d paramd)
  {
    this.a = d.a(paramd);
    this.b = d.b(paramd);
    this.c = d.c(paramd);
    this.d = d.d(paramd);
    this.e = d.e(paramd);
    this.f = d.f(paramd);
    this.g = d.g(paramd);
    this.h = d.h(paramd);
    this.i = d.i(paramd);
    this.j = d.j(paramd);
    this.k = d.k(paramd);
    this.l = d.l(paramd);
    this.m = d.m(paramd);
    this.n = d.n(paramd);
    this.o = d.o(paramd);
    this.p = d.p(paramd);
    this.q = d.q(paramd);
    this.r = d.r(paramd);
    this.s = d.s(paramd);
    return this;
  }
  
  public f a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    return this;
  }
  
  public f b(int paramInt)
  {
    this.b = paramInt;
    return this;
  }
  
  @Deprecated
  public f b(boolean paramBoolean)
  {
    return c(paramBoolean);
  }
  
  public f c(int paramInt)
  {
    this.c = paramInt;
    return this;
  }
  
  public f c(boolean paramBoolean)
  {
    this.i = paramBoolean;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */