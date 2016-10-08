package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class NormalScrollView
  extends ScrollView
{
  private j a;
  private CaptialTrendChart b;
  
  public NormalScrollView(Context paramContext)
  {
    super(paramContext);
  }
  
  public NormalScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NormalScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public NormalScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null) {
      this.a.a(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void setScrollViewListener(j paramj)
  {
    this.a = paramj;
  }
  
  public void setView(CaptialTrendChart paramCaptialTrendChart)
  {
    this.b = paramCaptialTrendChart;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\NormalScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */