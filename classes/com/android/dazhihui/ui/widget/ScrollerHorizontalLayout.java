package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Scroller;

public class ScrollerHorizontalLayout
  extends LinearLayout
{
  float a;
  float b;
  private VelocityTracker c;
  private Scroller d;
  
  public ScrollerHorizontalLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.d = new Scroller(paramContext);
  }
  
  private void a()
  {
    if (getChildCount() != 2) {
      throw new RuntimeException("ScrollerHorizontalLayout must has two child");
    }
    View localView = getChildAt(1);
    ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
    if (localLayoutParams.height != getHeight())
    {
      localLayoutParams.height = getHeight();
      localView.setLayoutParams(localLayoutParams);
    }
  }
  
  private boolean b()
  {
    View localView1 = getChildAt(1);
    if ((localView1 instanceof ViewGroup))
    {
      localView1 = ((ViewGroup)localView1).getChildAt(1);
      if ((localView1 instanceof ViewPager))
      {
        int i = 0;
        while (i < ((ViewPager)localView1).getChildCount())
        {
          View localView2 = ((ViewPager)localView1).getChildAt(i);
          if (localView2.getLeft() / localView2.getWidth() == ((ViewPager)localView1).getCurrentItem()) {
            return (!(localView2 instanceof ViewGroup)) || (((ViewGroup)localView2).getChildAt(0).getScrollY() != 0);
          }
          i += 1;
        }
      }
    }
    return true;
  }
  
  public void computeScroll()
  {
    if (this.d.computeScrollOffset())
    {
      scrollTo(this.d.getCurrX(), this.d.getCurrY());
      postInvalidate();
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      do
      {
        return bool;
        this.a = paramMotionEvent.getX();
        this.b = paramMotionEvent.getY();
        break;
        if (Math.abs(this.b - paramMotionEvent.getY()) <= Math.abs(this.a - paramMotionEvent.getX())) {
          break;
        }
      } while (getScrollY() != getChildAt(0).getHeight());
    } while ((this.b - paramMotionEvent.getY() >= 0.0F) || (b()));
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.c == null) {
      this.c = VelocityTracker.obtain();
    }
    this.c.addMovement(paramMotionEvent);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      return false;
      if (!this.d.isFinished()) {
        this.d.abortAnimation();
      }
      this.a = f1;
      this.b = f2;
      return false;
      int j = (int)(this.b - f2);
      this.b = f2;
      int k = getChildAt(0).getHeight() + getChildAt(1).getHeight() - getHeight();
      if (j < -getScrollY()) {
        i = -getScrollY();
      }
      for (;;)
      {
        this.d.startScroll(0, getScrollY(), 0, i, 10);
        invalidate();
        return false;
        i = j;
        if (j > k - getScrollY()) {
          i = k - getScrollY();
        }
      }
      paramMotionEvent = this.c;
      paramMotionEvent.computeCurrentVelocity(1000);
      int i = (int)paramMotionEvent.getYVelocity();
      if (Math.abs(i) > 600) {
        this.d.fling(0, getScrollY(), 0, -i, 0, 0, 0, getChildAt(0).getHeight());
      }
    } while (this.c == null);
    this.c.recycle();
    this.c = null;
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ScrollerHorizontalLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */