package com.g.a.b;

import android.content.Context;
import com.g.a.a.b.b;
import com.g.a.b.d.c;
import com.g.a.c.e;
import com.g.a.c.f;
import java.util.concurrent.Executor;

public class j
{
  public static final com.g.a.b.a.h a = com.g.a.b.a.h.a;
  private Context b;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private int f = 0;
  private com.g.a.b.g.a g = null;
  private Executor h = null;
  private Executor i = null;
  private boolean j = false;
  private boolean k = false;
  private int l = 3;
  private int m = 3;
  private boolean n = false;
  private com.g.a.b.a.h o = a;
  private int p = 0;
  private long q = 0L;
  private int r = 0;
  private b s = null;
  private com.g.a.a.a.a t = null;
  private com.g.a.a.a.b.a u = null;
  private c v = null;
  private com.g.a.b.b.d w;
  private d x = null;
  private boolean y = false;
  
  public j(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  private void c()
  {
    if (this.h == null)
    {
      this.h = a.a(this.l, this.m, this.o);
      if (this.i != null) {
        break label202;
      }
      this.i = a.a(this.l, this.m, this.o);
    }
    for (;;)
    {
      if (this.t == null)
      {
        if (this.u == null) {
          this.u = a.b();
        }
        this.t = a.a(this.b, this.u, this.q, this.r);
      }
      if (this.s == null) {
        this.s = a.a(this.b, this.p);
      }
      if (this.n) {
        this.s = new com.g.a.a.b.a.a(this.s, f.a());
      }
      if (this.v == null) {
        this.v = a.a(this.b);
      }
      if (this.w == null) {
        this.w = a.a(this.y);
      }
      if (this.x == null) {
        this.x = d.t();
      }
      return;
      this.j = true;
      break;
      label202:
      this.k = true;
    }
  }
  
  public j a()
  {
    this.n = true;
    return this;
  }
  
  public j a(int paramInt)
  {
    if ((this.h != null) || (this.i != null)) {
      e.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
    }
    if (paramInt < 1)
    {
      this.m = 1;
      return this;
    }
    if (paramInt > 10)
    {
      this.m = 10;
      return this;
    }
    this.m = paramInt;
    return this;
  }
  
  @Deprecated
  public j a(com.g.a.a.a.b.a parama)
  {
    return b(parama);
  }
  
  public j a(b paramb)
  {
    if (this.p != 0) {
      e.c("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
    }
    this.s = paramb;
    return this;
  }
  
  public j a(com.g.a.b.a.h paramh)
  {
    if ((this.h != null) || (this.i != null)) {
      e.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
    }
    this.o = paramh;
    return this;
  }
  
  public h b()
  {
    c();
    return new h(this, null);
  }
  
  public j b(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt >= 100)) {
      throw new IllegalArgumentException("availableMemoryPercent must be in range (0 < % < 100)");
    }
    if (this.s != null) {
      e.c("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
    }
    this.p = ((int)((float)Runtime.getRuntime().maxMemory() * (paramInt / 100.0F)));
    return this;
  }
  
  public j b(com.g.a.a.a.b.a parama)
  {
    if (this.t != null) {
      e.c("diskCache() and diskCacheFileNameGenerator() calls overlap each other", new Object[0]);
    }
    this.u = parama;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */