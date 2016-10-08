package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MinuteChartViewPage
  extends ViewPager
{
  private boolean a = false;
  
  public MinuteChartViewPage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a) {
      return false;
    }
    try
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (IllegalArgumentException paramMotionEvent)
    {
      return false;
    }
    catch (ArrayIndexOutOfBoundsException paramMotionEvent) {}
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a) {
      return false;
    }
    try
    {
      super.onTouchEvent(paramMotionEvent);
      return true;
    }
    catch (IllegalArgumentException paramMotionEvent)
    {
      for (;;) {}
    }
    catch (ArrayIndexOutOfBoundsException paramMotionEvent)
    {
      for (;;) {}
    }
  }
  
  public void setEnable(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MinuteChartViewPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */