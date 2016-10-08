package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.y;

public class StockCostView
  extends LinearLayout
{
  private StockCostDetailsTable a;
  private StockCostDistributionView b;
  private Context c;
  private StockChartContainer d;
  
  public StockCostView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public StockCostView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public StockCostView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  public void a()
  {
    this.a.a();
    this.b.postInvalidate();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    ((LinearLayout.LayoutParams)this.b.getLayoutParams()).height = paramInt1;
    ((LinearLayout.LayoutParams)this.a.getLayoutParams()).height = paramInt2;
  }
  
  public void a(Context paramContext)
  {
    this.c = paramContext;
    setOrientation(1);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
    this.b = new StockCostDistributionView(paramContext);
    addView(this.b, localLayoutParams);
    localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
    this.a = new StockCostDetailsTable(paramContext);
    addView(this.a, localLayoutParams);
  }
  
  public void a(y paramy)
  {
    if (paramy == y.b) {
      setBackgroundColor(-1);
    }
    for (;;)
    {
      if (this.a != null) {
        this.a.a(paramy);
      }
      if (this.b != null) {
        this.b.a(paramy);
      }
      return;
      setBackgroundColor(-14276556);
    }
  }
  
  public void a(StockChartContainer paramStockChartContainer, av paramav)
  {
    this.d = paramStockChartContainer;
    this.a.a(paramStockChartContainer, paramav);
    this.b.a(paramStockChartContainer, paramav);
  }
  
  public void setParentFragment(uv paramuv) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockCostView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */