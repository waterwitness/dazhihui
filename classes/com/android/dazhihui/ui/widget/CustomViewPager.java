package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

public class CustomViewPager
  extends ViewPager
{
  private boolean a = true;
  
  public CustomViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected boolean a(View paramView)
  {
    return ((paramView instanceof HorizontalScrollView)) && (((HorizontalScrollView)paramView).getChildAt(0).getWidth() > paramView.getWidth());
  }
  
  protected boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    if ((super.canScroll(paramView, paramBoolean, paramInt1, paramInt2, paramInt3)) || ((paramBoolean) && (a(paramView))))
    {
      paramInt1 = 1;
      if (this.a) {
        break label52;
      }
    }
    label52:
    for (paramInt2 = i;; paramInt2 = 0)
    {
      return paramInt1 | paramInt2;
      paramInt1 = 0;
      break;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a) {}
    try
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (IllegalArgumentException paramMotionEvent)
    {
      return false;
    }
    catch (ArrayIndexOutOfBoundsException paramMotionEvent)
    {
      for (;;) {}
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a) {}
    try
    {
      super.onTouchEvent(paramMotionEvent);
      return true;
      return false;
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
  
  public void setScrollable(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CustomViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */