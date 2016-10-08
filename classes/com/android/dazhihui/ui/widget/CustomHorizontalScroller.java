package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class CustomHorizontalScroller
  extends HorizontalScrollView
{
  private be a = null;
  private int b = 0;
  
  public CustomHorizontalScroller(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CustomHorizontalScroller(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null)
    {
      paramInt1 = getScrollX();
      if (paramInt1 == 0) {
        this.a.b();
      }
    }
    else
    {
      return;
    }
    if ((this.b == paramInt1) && (this.b != 0))
    {
      this.a.c();
      return;
    }
    this.a.a();
  }
  
  public void setScrollListener(be parambe)
  {
    this.a = parambe;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CustomHorizontalScroller.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */