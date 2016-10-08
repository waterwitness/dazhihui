package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.AbsListView.OnScrollListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Scroller;
import com.android.dazhihui.ui.screen.y;

public class VHDragListView
  extends ListView
{
  private WindowManager a;
  private Display b;
  private VelocityTracker c;
  private Scroller d;
  private View e;
  private ng f;
  private LinearLayout g;
  private DisplayMetrics h;
  private AbsListView.OnScrollListener i;
  private float j;
  private float k;
  private float l;
  private float m;
  private int n = 100;
  private int o;
  private int p = -1;
  private int q;
  private int r;
  private int s;
  
  public VHDragListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = ((WindowManager)paramContext.getSystemService("window"));
    this.b = this.a.getDefaultDisplay();
    this.h = new DisplayMetrics();
    this.b.getMetrics(this.h);
    this.d = new Scroller(paramContext);
    paramContext = ViewConfiguration.get(paramContext);
    this.l = paramContext.getScaledMinimumFlingVelocity();
    this.m = paramContext.getScaledMaximumFlingVelocity();
    this.n = ((int)(this.n * this.h.density));
  }
  
  private void a()
  {
    if (this.o <= 0)
    {
      this.o = 0;
      this.f.setArrowLeftEnable(false);
      return;
    }
    if (this.o >= this.p)
    {
      this.o = this.p;
      this.f.setArrowRightEnable(false);
      return;
    }
    this.f.setArrowLeftEnable(true);
    this.f.setArrowRightEnable(true);
  }
  
  private void a(int paramInt)
  {
    if (this.g != null) {
      this.g.scrollTo(paramInt, 0);
    }
    int i1 = 0;
    while (i1 <= getChildCount())
    {
      View localView = getChildAt(i1);
      if (localView != null) {
        localView.findViewById(2131561252).scrollTo(paramInt, 0);
      }
      i1 += 1;
    }
    ((nf)getAdapter()).a(paramInt);
  }
  
  private void b(int paramInt)
  {
    if (((paramInt != this.q) || (this.r != this.s)) && (this.i != null))
    {
      this.i.onScrollStateChanged(this, paramInt);
      this.q = paramInt;
      this.r = this.s;
    }
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    if ((getChildCount() > 0) && (this.s == 1))
    {
      this.d.fling(this.o, 0, paramInt1, 0, 0, this.p, 0, 0);
      invalidate();
      return 2;
    }
    return 3;
  }
  
  public void a(y paramy) {}
  
  public void computeScroll()
  {
    if (this.d.computeScrollOffset()) {
      if (this.e.getScrollX() <= 0)
      {
        this.d.abortAnimation();
        a(0);
        this.f.setArrowLeftEnable(false);
        postInvalidate();
      }
    }
    do
    {
      return;
      if (this.e.getScrollX() >= this.p)
      {
        this.d.abortAnimation();
        a(this.p);
        this.f.setArrowRightEnable(false);
        break;
      }
      a(this.d.getCurrX());
      b(2);
      this.f.setArrowLeftEnable(true);
      this.f.setArrowRightEnable(true);
      break;
      if (this.s == 2) {
        b(0);
      }
      if ((this.e != null) && (this.e.getScrollX() <= 0))
      {
        this.f.setArrowLeftEnable(false);
        return;
      }
    } while ((this.e == null) || (this.e.getScrollX() < this.p));
    this.f.setArrowRightEnable(false);
  }
  
  public int getmTouchMode()
  {
    return this.s;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    boolean bool1;
    if (getChildCount() <= 0)
    {
      bool1 = super.onTouchEvent(paramMotionEvent);
      return bool1;
    }
    if (this.c == null) {
      this.c = VelocityTracker.obtain();
    }
    this.c.addMovement(paramMotionEvent);
    if (paramMotionEvent.getAction() != 0)
    {
      i1 = 1;
      if (paramMotionEvent.getAction() == 1) {
        break label113;
      }
      i2 = 1;
      label63:
      if ((i1 & i2) == 0) {
        break label131;
      }
      if (this.s != 4) {
        break label119;
      }
      i1 = 1;
      label82:
      if (this.s != 3) {
        break label125;
      }
    }
    label113:
    label119:
    label125:
    for (int i2 = 1;; i2 = 0)
    {
      if ((i1 | i2) == 0) {
        break label131;
      }
      return super.onTouchEvent(paramMotionEvent);
      i1 = 0;
      break;
      i2 = 0;
      break label63;
      i1 = 0;
      break label82;
    }
    label131:
    switch (paramMotionEvent.getAction())
    {
    default: 
      return super.onTouchEvent(paramMotionEvent);
    case 0: 
      this.s = 0;
      if (!this.d.isFinished()) {
        this.d.abortAnimation();
      }
      this.j = paramMotionEvent.getX();
      this.k = paramMotionEvent.getY();
      b(1);
      return super.onTouchEvent(paramMotionEvent);
    case 2: 
      float f1 = paramMotionEvent.getX(0);
      float f2 = paramMotionEvent.getY(0);
      i1 = (int)(this.j - f1);
      i2 = (int)(this.k - f2);
      this.j = f1;
      this.k = f2;
      if (this.s == 0)
      {
        if (Math.abs(i2) >= Math.abs(i1)) {
          break label367;
        }
        this.s = 1;
        b(1);
        localObject = MotionEvent.obtain(paramMotionEvent);
        ((MotionEvent)localObject).setAction(paramMotionEvent.getActionIndex() << 8 | 0x3);
        onTouchEvent((MotionEvent)localObject);
        ((MotionEvent)localObject).recycle();
      }
      for (;;)
      {
        this.e = getChildAt(0).findViewById(2131561252);
        this.o = this.e.getScrollX();
        this.o += i1;
        a();
        a(this.o);
        return true;
        label367:
        if (Math.abs(i2) > Math.abs(i1))
        {
          this.s = 4;
          b(1);
          return super.onTouchEvent(paramMotionEvent);
        }
        this.s = 0;
      }
    }
    Object localObject = this.c;
    ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.m);
    int i1 = (int)((VelocityTracker)localObject).getXVelocity();
    i2 = (int)((VelocityTracker)localObject).getYVelocity();
    if ((Math.abs(i1) > this.l) || (Math.abs(i2) > this.l)) {
      this.s = a(-i1, -i2);
    }
    for (;;)
    {
      if (this.s == 3) {
        b(0);
      }
      if (this.c != null)
      {
        this.c.recycle();
        this.c = null;
      }
      bool1 = bool2;
      if (this.s == 1) {
        break;
      }
      bool1 = bool2;
      if (this.s == 2) {
        break;
      }
      return super.onTouchEvent(paramMotionEvent);
      b(0);
    }
  }
  
  public void setMaxScrollX(int paramInt)
  {
    this.p = paramInt;
  }
  
  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.i = paramOnScrollListener;
    super.setOnScrollListener(paramOnScrollListener);
  }
  
  public void setTitleContent(ng paramng)
  {
    this.f = paramng;
    this.g = ((LinearLayout)paramng.findViewById(2131561219));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\VHDragListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */