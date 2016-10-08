package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;

public class MinChartDetailView
  extends View
{
  private StockChartContainer a;
  private Paint b;
  private int c;
  private Rect d = new Rect();
  private int e;
  private String[] f;
  private int g = -1;
  private y h;
  
  public MinChartDetailView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public MinChartDetailView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public MinChartDetailView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    this.c = getResources().getDimensionPixelSize(2131231040);
    this.b = new Paint(1);
    this.b.setTextSize(this.c);
    this.f = getResources().getStringArray(2131361876);
    this.e = getResources().getDimensionPixelSize(2131230773);
    a(g.a().b());
  }
  
  public void a(y paramy)
  {
    this.h = paramy;
    if (paramy == y.a) {}
    for (this.g = getResources().getColor(2131493677);; this.g = getResources().getColor(2131492903))
    {
      postInvalidate();
      return;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a.getMinChartContainer().getScreenIndex() < 0) {}
    StockVo localStockVo;
    int i;
    int[][] arrayOfInt;
    do
    {
      do
      {
        return;
        localStockVo = this.a.getDataModel();
      } while (localStockVo == null);
      j = getWidth();
      i = getHeight();
      arrayOfInt = this.a.getMinChartContainer().getTreadPriceView().a(this.a.getMinChartContainer().getScreenIndex());
    } while (arrayOfInt == null);
    int j = (j - this.e * 2) / arrayOfInt.length;
    int k = this.e;
    k = (i - this.c) / 2;
    this.b.setTextSize(this.c);
    this.b.setTextAlign(Paint.Align.LEFT);
    int m = (int)this.b.getFontMetrics().ascent;
    this.h = g.a().b();
    label173:
    label176:
    int n;
    String str;
    if (this.h == y.a)
    {
      this.g = getResources().getColor(2131493677);
      i = 0;
      if (i < arrayOfInt.length)
      {
        n = i * j + this.e;
        this.b.setColor(this.g);
        str = "";
        if (i != 0) {
          break label385;
        }
        str = az.d(arrayOfInt[0][0]);
      }
    }
    for (;;)
    {
      if (this.h == y.b)
      {
        arrayOfInt[0][1] = -14540254;
        arrayOfInt[4][1] = -14540254;
      }
      paramCanvas.drawText(this.f[i], n, k - m, this.b);
      this.b.getTextBounds(this.f[i], 0, this.f[i].length(), this.d);
      int i1 = this.d.width();
      int i2 = this.e;
      this.b.setColor(arrayOfInt[i][1]);
      paramCanvas.drawText(str, n + (i1 + i2 * 10), k - m, this.b);
      i += 1;
      break label176;
      break;
      this.g = getResources().getColor(2131492903);
      break label173;
      label385:
      if (i == 1) {
        str = az.a(arrayOfInt[1][0], localStockVo.getmDecimalLen());
      } else if (i == 2) {
        str = az.a(arrayOfInt[2][0], localStockVo.getCp());
      } else if (i == 3) {
        str = az.a(arrayOfInt[3][0], localStockVo.getmDecimalLen());
      } else if (i == 4) {
        str = String.valueOf(arrayOfInt[4][0]);
      }
    }
  }
  
  public void setHolder(StockChartContainer paramStockChartContainer)
  {
    this.a = paramStockChartContainer;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartDetailView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */