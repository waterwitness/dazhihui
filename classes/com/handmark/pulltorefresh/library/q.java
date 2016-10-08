package com.handmark.pulltorefresh.library;

import android.view.animation.Interpolator;
import com.handmark.pulltorefresh.library.a.j;

final class q
  implements Runnable
{
  private final Interpolator b;
  private final int c;
  private final int d;
  private final long e;
  private o f;
  private boolean g = true;
  private long h = -1L;
  private int i = -1;
  
  public q(PullToRefreshBase paramPullToRefreshBase, int paramInt1, int paramInt2, long paramLong, o paramo)
  {
    this.d = paramInt1;
    this.c = paramInt2;
    this.b = PullToRefreshBase.b(paramPullToRefreshBase);
    this.e = paramLong;
    this.f = paramo;
  }
  
  public void a()
  {
    this.g = false;
    this.a.removeCallbacks(this);
  }
  
  public void run()
  {
    if (this.h == -1L)
    {
      this.h = System.currentTimeMillis();
      if ((!this.g) || (this.c == this.i)) {
        break label128;
      }
      j.a(this.a, this);
    }
    label128:
    while (this.f == null)
    {
      return;
      long l = Math.max(Math.min((System.currentTimeMillis() - this.h) * 1000L / this.e, 1000L), 0L);
      float f1 = this.d - this.c;
      int j = Math.round(this.b.getInterpolation((float)l / 1000.0F) * f1);
      this.i = (this.d - j);
      this.a.setHeaderScroll(this.i);
      break;
    }
    this.f.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */