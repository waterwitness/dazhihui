package com.g.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.g.a.b.a.g;
import com.g.a.b.g.a;
import com.g.a.c.e;

final class u
  implements Runnable
{
  private final m a;
  private final Bitmap b;
  private final o c;
  private final Handler d;
  
  public u(m paramm, Bitmap paramBitmap, o paramo, Handler paramHandler)
  {
    this.a = paramm;
    this.b = paramBitmap;
    this.c = paramo;
    this.d = paramHandler;
  }
  
  public void run()
  {
    e.a("PostProcess image before displaying [%s]", new Object[] { this.c.b });
    p.a(new c(this.c.e.p().a(this.b), this.c, this.a, g.c), this.c.e.s(), this.d, this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */