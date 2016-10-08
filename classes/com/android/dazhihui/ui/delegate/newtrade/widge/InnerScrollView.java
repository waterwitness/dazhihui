package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class InnerScrollView
  extends ScrollView
{
  public ScrollView a;
  int b = 10;
  int c;
  private int d = 0;
  
  public InnerScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private int getScrollRange()
  {
    int i = 0;
    if (getChildCount() > 0) {
      i = Math.max(0, getChildAt(0).getHeight() - getHeight());
    }
    return i;
  }
  
  private void setParentScrollAble(boolean paramBoolean)
  {
    ScrollView localScrollView = this.a;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localScrollView.requestDisallowInterceptTouchEvent(paramBoolean);
      return;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a == null) {
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    if (paramMotionEvent.getAction() == 0)
    {
      this.c = ((int)paramMotionEvent.getY());
      setParentScrollAble(false);
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    if (paramMotionEvent.getAction() == 1) {
      setParentScrollAble(true);
    }
    for (;;)
    {
      return super.onInterceptTouchEvent(paramMotionEvent);
      if (paramMotionEvent.getAction() != 2) {}
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    View localView = getChildAt(0);
    int i;
    int j;
    int k;
    int m;
    if ((this.a != null) && (paramMotionEvent.getAction() == 2))
    {
      i = localView.getMeasuredHeight();
      j = getMeasuredHeight();
      k = getScrollY();
      m = (int)paramMotionEvent.getY();
      if (this.c >= m) {
        break label83;
      }
      if (k <= 0)
      {
        setParentScrollAble(true);
        return false;
      }
      setParentScrollAble(false);
    }
    for (;;)
    {
      this.c = m;
      return super.onTouchEvent(paramMotionEvent);
      label83:
      if (this.c > m)
      {
        if (k >= i - j)
        {
          setParentScrollAble(true);
          return false;
        }
        setParentScrollAble(false);
      }
    }
  }
  
  public void setParentScrollView(ScrollView paramScrollView)
  {
    this.a = paramScrollView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\InnerScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */