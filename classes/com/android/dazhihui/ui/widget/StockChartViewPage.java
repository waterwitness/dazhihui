package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ax;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public class StockChartViewPage
  extends ViewPager
{
  private float a;
  private boolean b;
  private boolean c;
  private float d;
  private int e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  private boolean f = false;
  private boolean g = true;
  private Handler h = new kz(this);
  
  public StockChartViewPage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.f) {
      return false;
    }
    if (!this.g) {
      return true;
    }
    try
    {
      switch (paramMotionEvent.getAction())
      {
      case 0: 
      case 2: 
      case 1: 
      case 3: 
        for (;;)
        {
          return super.onInterceptTouchEvent(paramMotionEvent);
          onTouchEvent(paramMotionEvent);
          getParent().requestDisallowInterceptTouchEvent(true);
          this.d = paramMotionEvent.getY();
          this.a = paramMotionEvent.getX();
          continue;
          onTouchEvent(paramMotionEvent);
          float f1 = paramMotionEvent.getX();
          float f2 = paramMotionEvent.getY();
          int i = (int)Math.abs(f1 - this.a);
          int j = (int)Math.abs(f2 - this.d);
          if ((i > this.e) && (i > j))
          {
            return true;
            this.b = false;
            this.c = false;
            this.a = paramMotionEvent.getX();
            getParent().requestDisallowInterceptTouchEvent(false);
            this.h.sendMessageDelayed(Message.obtain(), 600L);
            this.g = false;
          }
        }
      }
    }
    catch (ArrayIndexOutOfBoundsException paramMotionEvent)
    {
      for (;;)
      {
        return false;
      }
    }
    catch (IllegalArgumentException paramMotionEvent) {}
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      try
      {
        super.onTouchEvent(paramMotionEvent);
        return true;
      }
      catch (IllegalArgumentException paramMotionEvent)
      {
        return true;
      }
      catch (ArrayIndexOutOfBoundsException paramMotionEvent) {}
      getParent().requestDisallowInterceptTouchEvent(true);
      this.a = paramMotionEvent.getX();
      continue;
      getParent().requestDisallowInterceptTouchEvent(false);
      this.h.sendMessageDelayed(Message.obtain(), 600L);
      this.g = false;
      this.a = paramMotionEvent.getX();
      this.b = false;
      this.c = false;
      continue;
      if (getCurrentItem() == 0)
      {
        if ((this.a <= paramMotionEvent.getX()) && (!this.c))
        {
          getParent().requestDisallowInterceptTouchEvent(false);
        }
        else
        {
          this.c = true;
          this.a = paramMotionEvent.getX();
          getParent().requestDisallowInterceptTouchEvent(true);
        }
      }
      else if (getCurrentItem() == getAdapter().getCount() - 1) {
        if ((this.a >= paramMotionEvent.getX()) && (!this.b))
        {
          getParent().requestDisallowInterceptTouchEvent(false);
        }
        else
        {
          this.b = true;
          this.a = paramMotionEvent.getX();
          getParent().requestDisallowInterceptTouchEvent(true);
          continue;
          this.h.sendMessageDelayed(Message.obtain(), 600L);
          this.g = false;
        }
      }
    }
    return true;
  }
  
  public void setEnable(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\StockChartViewPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */