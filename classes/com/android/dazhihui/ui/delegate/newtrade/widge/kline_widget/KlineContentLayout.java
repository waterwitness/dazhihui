package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.LinearLayout;

public class KlineContentLayout
  extends LinearLayout
{
  private float a = 1.0F;
  private int b = 1;
  private KlineView c;
  private int d;
  private int e;
  
  public KlineContentLayout(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public KlineContentLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public KlineContentLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private float a(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() > 1)
    {
      float f1 = paramMotionEvent.getX(0) - paramMotionEvent.getX(1);
      float f2 = paramMotionEvent.getY(0) - paramMotionEvent.getY(1);
      return (float)Math.sqrt(f1 * f1 + f2 * f2);
    }
    return 0.0F;
  }
  
  private void a(Context paramContext)
  {
    this.e = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  public int getTouchModel()
  {
    return this.b;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    do
    {
      for (;;)
      {
        return super.onInterceptTouchEvent(paramMotionEvent);
        this.d = ((int)paramMotionEvent.getX());
        if ((this.b == 2) || (this.b == 3))
        {
          getParent().requestDisallowInterceptTouchEvent(false);
          this.b = 1;
          continue;
          this.a = a(paramMotionEvent);
          if ((this.a > 10.0F) && (this.c.getDisplayModel() == i.a))
          {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.b = 2;
          }
          if (this.b == 2)
          {
            float f1 = a(paramMotionEvent);
            float f2 = f1 - this.a;
            if ((f2 > 50.0F) && (f2 < 200.0F))
            {
              this.c.e();
              this.a = f1;
            }
            else if ((f2 < -50.0F) && (f2 > -200.0F))
            {
              this.c.f();
              this.a = f1;
            }
          }
          else if ((Math.abs(paramMotionEvent.getX() - this.d) > this.e) && (getResources().getConfiguration().orientation == 2))
          {
            this.b = 3;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.c.a(((int)paramMotionEvent.getX() - this.d) / this.c.getKLineWidth());
            this.d = ((int)paramMotionEvent.getX());
          }
        }
      }
    } while ((this.b != 2) && (this.b != 3));
    getParent().requestDisallowInterceptTouchEvent(false);
    this.b = 1;
    return true;
  }
  
  public void setHolder(KlineView paramKlineView)
  {
    this.c = paramKlineView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\KlineContentLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */