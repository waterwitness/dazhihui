package com.g.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.g.a.b.a.i;
import com.g.a.c.e;

public class g
{
  public static final String a = g.class.getSimpleName();
  private static volatile g e;
  private h b;
  private m c;
  private com.g.a.b.f.a d = new com.g.a.b.f.c();
  
  private static Handler a(d paramd)
  {
    Handler localHandler = paramd.r();
    if (paramd.s()) {
      paramd = null;
    }
    do
    {
      do
      {
        return paramd;
        paramd = localHandler;
      } while (localHandler != null);
      paramd = localHandler;
    } while (Looper.myLooper() != Looper.getMainLooper());
    return new Handler();
  }
  
  public static g a()
  {
    if (e == null) {}
    try
    {
      if (e == null) {
        e = new g();
      }
      return e;
    }
    finally {}
  }
  
  private void f()
  {
    if (this.b == null) {
      throw new IllegalStateException("ImageLoader must be init with configuration before using");
    }
  }
  
  public void a(h paramh)
  {
    if (paramh == null) {
      try
      {
        throw new IllegalArgumentException("ImageLoader configuration can not be initialized with null");
      }
      finally {}
    }
    if (this.b == null)
    {
      e.a("Initialize ImageLoader with configuration", new Object[0]);
      this.c = new m(paramh);
      this.b = paramh;
    }
    for (;;)
    {
      return;
      e.c("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
    }
  }
  
  public void a(String paramString, ImageView paramImageView, d paramd)
  {
    a(paramString, new com.g.a.b.e.b(paramImageView), paramd, null, null);
  }
  
  public void a(String paramString, com.g.a.b.a.f paramf, d paramd, com.g.a.b.f.a parama, com.g.a.b.f.b paramb)
  {
    f();
    com.g.a.b.a.f localf = paramf;
    if (paramf == null) {
      localf = this.b.a();
    }
    if (paramd == null) {}
    for (paramf = this.b.r;; paramf = paramd)
    {
      a(paramString, new com.g.a.b.e.c(paramString, localf, i.b), paramf, parama, paramb);
      return;
    }
  }
  
  public void a(String paramString, com.g.a.b.e.a parama, d paramd, com.g.a.b.a.f paramf, com.g.a.b.f.a parama1, com.g.a.b.f.b paramb)
  {
    f();
    if (parama == null) {
      throw new IllegalArgumentException("Wrong arguments were passed to displayImage() method (ImageView reference must not be null)");
    }
    if (parama1 == null) {
      parama1 = this.d;
    }
    for (;;)
    {
      if (paramd == null) {
        paramd = this.b.r;
      }
      for (;;)
      {
        if (parama.d() != null) {
          parama.d().setTag(com.g.a.b.imageloaderviewtag, paramString);
        }
        if (TextUtils.isEmpty(paramString))
        {
          this.c.b(parama);
          parama1.onLoadingStarted(paramString, parama.d());
          if (paramd.b()) {
            parama.a(paramd.b(this.b.a));
          }
          for (;;)
          {
            parama1.onLoadingComplete(paramString, parama.d(), null);
            return;
            parama.a(null);
          }
        }
        if (paramf == null) {
          paramf = com.g.a.c.a.a(parama, this.b.a());
        }
        for (;;)
        {
          String str = com.g.a.c.f.a(paramString, paramf);
          this.c.a(parama, str);
          parama1.onLoadingStarted(paramString, parama.d());
          Bitmap localBitmap = this.b.n.a(str);
          if ((localBitmap != null) && (!localBitmap.isRecycled()))
          {
            e.a("Load image from memory cache [%s]", new Object[] { str });
            if (paramd.e())
            {
              paramString = new o(paramString, parama, paramf, str, paramd, parama1, paramb, this.c.a(paramString));
              paramString = new u(this.c, localBitmap, paramString, a(paramd));
              if (paramd.s())
              {
                paramString.run();
                return;
              }
              this.c.a(paramString);
              return;
            }
            paramd.q().a(localBitmap, parama, com.g.a.b.a.g.c);
            parama1.onLoadingComplete(paramString, parama.d(), localBitmap);
            return;
          }
          if (paramd.a()) {
            parama.a(paramd.a(this.b.a));
          }
          for (;;)
          {
            paramString = new o(paramString, parama, paramf, str, paramd, parama1, paramb, this.c.a(paramString));
            paramString = new p(this.c, paramString, a(paramd));
            if (!paramd.s()) {
              break;
            }
            paramString.run();
            return;
            if (paramd.g()) {
              parama.a(null);
            }
          }
          this.c.a(paramString);
          return;
        }
      }
    }
  }
  
  public void a(String paramString, com.g.a.b.e.a parama, d paramd, com.g.a.b.f.a parama1, com.g.a.b.f.b paramb)
  {
    a(paramString, parama, paramd, null, parama1, paramb);
  }
  
  public void a(String paramString, com.g.a.b.f.a parama)
  {
    a(paramString, null, null, parama, null);
  }
  
  public boolean b()
  {
    return this.b != null;
  }
  
  public void c()
  {
    f();
    this.b.n.b();
  }
  
  @Deprecated
  public void d()
  {
    e();
  }
  
  public void e()
  {
    f();
    this.b.o.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */