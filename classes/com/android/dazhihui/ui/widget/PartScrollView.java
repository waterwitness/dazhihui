package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.android.dazhihui.ui.screen.BaseActivity;

public class PartScrollView
  extends ScrollView
{
  private float a;
  private float b;
  private float c;
  private float d;
  private float e;
  private jo f;
  private boolean g = true;
  private BaseActivity h;
  private GestureDetector i;
  
  public PartScrollView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PartScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.h = ((BaseActivity)paramContext);
    a();
  }
  
  private void a()
  {
    this.i = new GestureDetector(getContext(), new jp(this, null));
    setFadingEdgeLength(0);
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 > this.a) && (paramFloat1 < this.a + this.d))
    {
      this.e = getScrollY();
      if ((this.e + paramFloat2 > this.b) && (this.e + paramFloat2 < this.b + this.c)) {
        return true;
      }
    }
    return false;
  }
  
  protected int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect)
  {
    int k = super.computeScrollDeltaToGetChildRectOnScreen(paramRect);
    int j = k;
    if (k > 0) {
      j = 0;
    }
    return j;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.g) {
      return false;
    }
    int j = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (j)
    {
    }
    do
    {
      do
      {
        return super.onInterceptTouchEvent(paramMotionEvent);
      } while (!a(f1, f2));
      return false;
    } while (!a(f1, f2));
    return false;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.f != null) {
      this.f.a();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setHorCal(boolean paramBoolean) {}
  
  public void setListener(jo paramjo)
  {
    this.f = paramjo;
  }
  
  public void setScroolEnable(Boolean paramBoolean)
  {
    this.g = paramBoolean.booleanValue();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\PartScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */