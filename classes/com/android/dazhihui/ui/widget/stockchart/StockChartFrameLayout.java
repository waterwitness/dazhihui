package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class StockChartFrameLayout
  extends FrameLayout
{
  public StockChartFrameLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public StockChartFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  private void a() {}
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getChildCount() == 2)
    {
      View localView1 = getChildAt(0);
      View localView2 = getChildAt(1);
      if (localView1.getVisibility() == 8)
      {
        super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      }
      localView1.layout(0, 0, localView1.getMeasuredWidth(), localView1.getMeasuredHeight());
      localView2.layout(0, localView1.getMeasuredHeight(), localView2.getMeasuredWidth(), localView1.getMeasuredHeight() + localView2.getMeasuredHeight());
      return;
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */