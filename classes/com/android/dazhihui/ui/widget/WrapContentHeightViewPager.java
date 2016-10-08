package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class WrapContentHeightViewPager
  extends MyViewPager
{
  private Fragment b;
  private View c = null;
  
  public WrapContentHeightViewPager(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public WrapContentHeightViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 0;
    if (this.b != null) {
      this.c = this.b.getView();
    }
    if (this.c == null) {
      this.c = getChildAt(getCurrentItem());
    }
    if (this.c != null) {
      this.c.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
    }
    for (int i = this.c.getMeasuredHeight();; i = 0)
    {
      try
      {
        k = getSuggestedMinimumHeight();
        j = k;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          int k;
          localException.printStackTrace();
        }
      }
      k = i;
      if (i < j) {
        k = j;
      }
      if (k > 0) {
        paramInt2 = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
      }
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
  }
  
  public void setmCurrentChild(Fragment paramFragment)
  {
    this.b = paramFragment;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\WrapContentHeightViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */