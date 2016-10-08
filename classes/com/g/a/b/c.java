package com.g.a.b;

import android.graphics.Bitmap;
import android.view.View;
import com.g.a.b;
import com.g.a.b.a.g;
import com.g.a.c.e;

final class c
  implements Runnable
{
  private final Bitmap a;
  private final String b;
  private final com.g.a.b.e.a c;
  private final String d;
  private final com.g.a.b.c.a e;
  private final com.g.a.b.f.a f;
  private final m g;
  private final g h;
  
  public c(Bitmap paramBitmap, o paramo, m paramm, g paramg)
  {
    this.a = paramBitmap;
    this.b = paramo.a;
    this.c = paramo.c;
    this.d = paramo.b;
    this.e = paramo.e.q();
    this.f = paramo.f;
    this.g = paramm;
    this.h = paramg;
  }
  
  private boolean a()
  {
    String str = this.g.a(this.c);
    return !this.d.equals(str);
  }
  
  public void run()
  {
    if (this.c.e())
    {
      e.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] { this.d });
      this.f.onLoadingCancelled(this.b, this.c.d());
      return;
    }
    if (a())
    {
      e.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] { this.d });
      this.f.onLoadingCancelled(this.b, this.c.d());
      return;
    }
    e.a("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[] { this.h, this.d });
    if ((this.c.d() != null) && (this.c.d().getTag(b.imageloaderviewtag) != null) && (!this.c.d().getTag(b.imageloaderviewtag).equals(this.b))) {}
    for (;;)
    {
      this.g.b(this.c);
      this.f.onLoadingComplete(this.b, this.c.d(), this.a);
      return;
      this.e.a(this.a, this.c, this.h);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */