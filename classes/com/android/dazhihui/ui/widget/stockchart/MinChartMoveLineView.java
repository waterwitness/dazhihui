package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;

public class MinChartMoveLineView
  extends View
{
  private Paint a = new Paint(1);
  private MinChartContainer b;
  private StockVo c;
  private int d;
  private int e;
  private int f;
  private float g;
  private int h;
  private int i;
  
  public MinChartMoveLineView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public MinChartMoveLineView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public MinChartMoveLineView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private float a(int paramInt1, int paramInt2)
  {
    float f1 = 0.0F;
    int k = this.b.getTreadPriceView().getHeight();
    int j = paramInt1;
    if (paramInt1 < 0) {
      j = 0;
    }
    float f2 = (k - 2) * j * 1.0F / paramInt2;
    if (k - f2 - 2.0F > 0.0F) {
      f1 = k - f2 - 2.0F;
    }
    return f1;
  }
  
  private void a()
  {
    a(g.a().b());
    this.d = getResources().getDimensionPixelSize(2131230829);
    this.e = getResources().getDimensionPixelSize(2131230820);
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a) {
      this.f = -2628628;
    }
    for (this.g = 1.8F;; this.g = 2.1F)
    {
      postInvalidate();
      return;
      this.f = -12686651;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.c = this.b.getDataModel();
    int j;
    int k;
    if (getResources().getConfiguration().orientation == 2)
    {
      j = this.e;
      k = this.d;
    }
    for (;;)
    {
      if (this.c != null)
      {
        k = this.c.getMinLength();
        int n = this.b.getScreenIndex();
        if ((n >= 0) && (n < k))
        {
          paramCanvas.save();
          int i1 = this.b.getTreadPriceViewWidth();
          getHeight();
          int m = getPaddingLeft();
          k = m;
          if (m == 0) {
            k = 1;
          }
          m = this.b.getMinChartTreadPriceMaxValue();
          int i2 = this.b.getMinChartTreadPriceMinValue();
          int[] arrayOfInt = this.b.getMinChartTreadCurrentPrice();
          float f1 = k + j;
          f1 = (i1 - 2 - j * 2) * 1.0F * n / this.c.getMinTotalPoint() + f1;
          float f2 = a(arrayOfInt[n] - i2, m - i2);
          this.a.setColor(this.f);
          this.a.setStrokeWidth(this.g);
          paramCanvas.drawLine(f1, 0, f1, this.i + 0, this.a);
          paramCanvas.drawLine(j, f2, i1 - j, f2, this.a);
          paramCanvas.restore();
        }
      }
      return;
      j = 0;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  public void setHolder(MinChartContainer paramMinChartContainer)
  {
    this.b = paramMinChartContainer;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartMoveLineView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */