package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public class StockChartPager$LayoutParams
  extends ViewGroup.LayoutParams
{
  boolean a;
  
  public StockChartPager$LayoutParams()
  {
    super(-1, -1);
  }
  
  public StockChartPager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext.obtainStyledAttributes(paramAttributeSet, StockChartPager.j()).recycle();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartPager$LayoutParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */