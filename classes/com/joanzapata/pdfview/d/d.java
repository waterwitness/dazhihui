package com.joanzapata.pdfview.d;

import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class d
  implements View.OnTouchListener
{
  private final Handler a = new Handler();
  private View b;
  private final Runnable c = new e(this);
  private j d = j.a;
  private float e;
  private float f;
  private float g;
  private float h;
  private float i;
  private h j;
  private i k;
  private g l;
  private float m;
  private float n;
  private long o;
  
  private void a()
  {
    this.j.c(this.e, this.f);
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    this.i = e(paramMotionEvent);
  }
  
  private boolean a(MotionEvent paramMotionEvent, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (paramMotionEvent == null) {}
    long l1;
    long l2;
    do
    {
      return false;
      l1 = paramMotionEvent.getEventTime();
      l2 = paramMotionEvent.getDownTime();
      paramFloat1 = PointF.length(paramFloat1 - paramFloat3, paramFloat2 - paramFloat4);
    } while ((l1 - l2 >= 500L) || (paramFloat1 >= 5.0F));
    return true;
  }
  
  private void b(MotionEvent paramMotionEvent)
  {
    float f1 = e(paramMotionEvent);
    if (this.k != null) {
      this.k.a(f1 / this.i, new PointF(paramMotionEvent.getX(0), paramMotionEvent.getY(0)));
    }
    this.i = f1;
  }
  
  private void c(MotionEvent paramMotionEvent)
  {
    this.e = paramMotionEvent.getX(0);
    this.f = paramMotionEvent.getY(0);
    this.j.a(this.e, this.f);
  }
  
  private void d(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX(0);
    float f2 = paramMotionEvent.getY(0);
    if (this.j != null) {
      this.j.b(f1 - this.e, f2 - this.f);
    }
    this.e = f1;
    this.f = f2;
  }
  
  private float e(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() < 2) {
      return 0.0F;
    }
    return PointF.length(paramMotionEvent.getX(0) - paramMotionEvent.getX(1), paramMotionEvent.getY(0) - paramMotionEvent.getY(1));
  }
  
  public void a(g paramg)
  {
    this.l = paramg;
  }
  
  public void a(h paramh)
  {
    this.j = paramh;
  }
  
  public void a(i parami)
  {
    this.k = parami;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    this.b = paramView;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 261: 
    case 262: 
    case 1: 
      do
      {
        return true;
        c(paramMotionEvent);
        this.d = j.c;
        this.m = paramMotionEvent.getX();
        this.n = paramMotionEvent.getY();
        return true;
        c(paramMotionEvent);
        a(paramMotionEvent);
        this.d = j.b;
        return true;
        this.d = j.c;
        return true;
        this.d = j.a;
        a();
      } while (!a(paramMotionEvent, this.m, this.n, paramMotionEvent.getX(), paramMotionEvent.getY()));
      long l1 = System.currentTimeMillis();
      this.a.removeCallbacks(this.c);
      if (this.l != null)
      {
        if ((float)(l1 - this.o) < 280.0F)
        {
          this.l.d(paramMotionEvent.getX(), paramMotionEvent.getY());
          this.o = 0L;
          return true;
        }
        this.o = System.currentTimeMillis();
        this.a.postDelayed(this.c, 500L);
        return true;
      }
      this.a.postDelayed(this.c, 0L);
      return true;
    case 6: 
      this.e = this.g;
      this.f = this.h;
      this.d = j.c;
      return true;
    case 5: 
      this.g = paramMotionEvent.getX(0);
      this.h = paramMotionEvent.getY(0);
      c(paramMotionEvent);
      a(paramMotionEvent);
      this.d = j.b;
      return true;
    }
    switch (f.a[this.d.ordinal()])
    {
    default: 
      return true;
    case 1: 
      this.g = paramMotionEvent.getX(1);
      this.h = paramMotionEvent.getY(1);
      b(paramMotionEvent);
    }
    d(paramMotionEvent);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */