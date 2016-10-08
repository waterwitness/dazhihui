package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class SlidingMenu
  extends HorizontalScrollView
{
  private int a;
  private int b;
  private int c;
  private int d;
  private boolean e = false;
  private boolean f;
  private boolean g = false;
  
  public SlidingMenu(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingMenu(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = new DisplayMetrics();
    ((Activity)paramContext).getWindowManager().getDefaultDisplay().getMetrics(paramAttributeSet);
    this.a = paramAttributeSet.widthPixels;
    this.b = (this.a * 3 / 4);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.g) {
      return false;
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      scrollTo(this.c, 0);
      this.f = true;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!this.f)
    {
      Object localObject = (LinearLayout)getChildAt(0);
      ViewGroup localViewGroup = (ViewGroup)((LinearLayout)localObject).getChildAt(0);
      localObject = (ViewGroup)((LinearLayout)localObject).getChildAt(1);
      this.c = (this.a - this.b);
      this.d = (this.c / 2);
      localViewGroup.getLayoutParams().width = this.c;
      ((ViewGroup)localObject).getLayoutParams().width = this.a;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default: 
      return super.onTouchEvent(paramMotionEvent);
    }
    if (getScrollX() > this.d)
    {
      smoothScrollTo(this.c, 0);
      this.e = false;
      return true;
    }
    smoothScrollTo(0, 0);
    this.e = true;
    return true;
  }
  
  public void setEnableFlib(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\SlidingMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */