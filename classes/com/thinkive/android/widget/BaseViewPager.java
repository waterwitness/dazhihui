package com.thinkive.android.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class BaseViewPager
  extends ViewPager
{
  private boolean a = true;
  
  public BaseViewPager(Context paramContext)
  {
    super(paramContext);
  }
  
  public BaseViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  @SuppressLint({"NewApi"})
  public boolean canScrollHorizontally(int paramInt)
  {
    if (!this.a) {
      return false;
    }
    return super.canScrollHorizontally(paramInt);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.a) {
      return false;
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.a) {
      return false;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCanScroll(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\android\widget\BaseViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */