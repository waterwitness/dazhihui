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

public class MinChartTRView
  extends View
{
  private MinChartContainer a;
  private Paint b = new Paint(1);
  private int c;
  private Rect d = new Rect();
  private int e;
  private int f;
  private int g;
  private int h;
  
  public MinChartTRView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public MinChartTRView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public MinChartTRView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    this.c = getResources().getDimensionPixelSize(2131231139);
    this.e = getResources().getDimensionPixelOffset(2131230774);
    a(g.a().b());
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a)
    {
      this.h = getResources().getColor(2131493099);
      this.f = getResources().getColor(2131493319);
    }
    for (this.g = getResources().getColor(2131493320);; this.g = getResources().getColor(2131493348))
    {
      postInvalidate();
      return;
      this.h = getResources().getColor(2131493342);
      this.f = getResources().getColor(2131493347);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    int i;
    int j;
    int k;
    String str1;
    if (this.a != null)
    {
      i = (getHeight() - this.c * 2) / 3;
      this.b.setTextSize(this.c);
      this.b.setColor(this.h);
      this.b.setTextAlign(Paint.Align.LEFT);
      j = (int)this.b.getFontMetrics().ascent;
      k = this.e;
      paramCanvas.drawText("涨停:", k, i - j, this.b);
      paramCanvas.drawText("跌停:", k, i * 2 + this.c - j, this.b);
      this.b.getTextBounds("涨停:", 0, "涨停:".length(), this.d);
      k += this.d.width() + this.e;
      String str2 = "--";
      str1 = "--";
      StockVo localStockVo = this.a.getDataModel();
      if (localStockVo != null)
      {
        str2 = localStockVo.getRiseLimit();
        str1 = localStockVo.getDownLimit();
      }
      if (!str2.equals("--")) {
        break label295;
      }
      this.b.setColor(getResources().getColor(2131493677));
      paramCanvas.drawText(str2, k, i - j, this.b);
      if (!str1.equals("--")) {
        break label309;
      }
      this.b.setColor(getResources().getColor(2131493677));
    }
    for (;;)
    {
      paramCanvas.drawText(str1, k, i * 2 + this.c - j, this.b);
      paramCanvas.restore();
      return;
      label295:
      this.b.setColor(this.f);
      break;
      label309:
      this.b.setColor(this.g);
    }
  }
  
  public void setHolder(MinChartContainer paramMinChartContainer)
  {
    this.a = paramMinChartContainer;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartTRView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */