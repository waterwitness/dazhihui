package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.ui.model.stock.StockVo;

public class StockChartPriceView
  extends View
{
  private int a;
  private int b;
  private int c = getResources().getDimensionPixelOffset(2131230823);
  private int d = getResources().getDimensionPixelOffset(2131230829);
  private Paint e = new Paint();
  private StockVo f;
  private int g = getResources().getDimensionPixelSize(2131230885);
  private int h = getResources().getDimensionPixelSize(2131230881);
  private Rect i = new Rect();
  private int j = -65536;
  private String k;
  private String l;
  private String m;
  private StockChartContainer n;
  
  public StockChartPriceView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public StockChartPriceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StockChartPriceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a()
  {
    this.f = null;
    postInvalidate();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.n == null) {}
    do
    {
      return;
      this.h = getResources().getDimensionPixelSize(2131230881);
      this.f = this.n.getDataModel();
    } while (this.f == null);
    this.a = getWidth();
    this.b = getHeight();
    int i1 = this.b * 2 / 3;
    int i2 = this.c;
    int i3 = this.b * 1 / 3;
    i3 = this.c + i3;
    this.m = this.f.getCurrentValue();
    this.k = this.f.getZfValue();
    if (TextUtils.isEmpty(this.m)) {
      this.m = "--";
    }
    if ((TextUtils.isEmpty(this.k)) || (this.k.equals("-"))) {
      this.k = "--";
    }
    this.l = this.f.getZf();
    if ((TextUtils.isEmpty(this.l)) || (this.l.equals("-"))) {
      this.l = "--";
    }
    if ((this.k.equals("--")) || (Float.valueOf(this.k).floatValue() == 0.0F)) {
      this.j = -6776680;
    }
    for (;;)
    {
      this.e.setColor(this.j);
      this.e.setTextSize(this.g);
      this.e.getTextBounds(this.m, 0, this.m.length(), this.i);
      this.e.setTextAlign(Paint.Align.LEFT);
      while ((i1 - i2 - this.c * 2 < this.i.height()) || (this.i.width() >= this.a - this.c))
      {
        this.g -= 1;
        this.e.setTextSize(this.g);
        this.e.getTextBounds(this.m, 0, this.m.length(), this.i);
      }
      if (Float.valueOf(this.k).floatValue() > 0.0F) {
        this.j = -2293760;
      } else {
        this.j = -15878144;
      }
    }
    this.m = this.f.getCurrentValue();
    if (TextUtils.isEmpty(this.m)) {
      this.m = "--";
    }
    Paint.FontMetrics localFontMetrics = this.e.getFontMetrics();
    this.e.setTextAlign(Paint.Align.CENTER);
    paramCanvas.drawText(this.m, this.a / 2, this.c - localFontMetrics.ascent, this.e);
    this.e.setTextSize(this.h);
    this.e.getTextBounds(this.k, 0, this.k.length(), this.i);
    i2 = this.i.width();
    this.e.getTextBounds(this.l, 0, this.l.length(), this.i);
    for (i1 = this.i.width(); ((this.a / 4 - this.d - 5 > 0) && (this.a / 4 - this.d - 5 < i2 / 2)) || ((this.a / 4 + this.d - 5 > 0) && (this.a / 4 + this.d - 5 < i1 / 2)) || (i1 + i2 + this.d * 4 > this.a) || (i3 - this.d < this.i.height()); i1 = this.i.width())
    {
      this.h -= 1;
      this.e.setTextSize(this.h);
      this.e.getTextBounds(this.k, 0, this.k.length(), this.i);
      i2 = this.i.width();
      this.e.getTextBounds(this.l, 0, this.l.length(), this.i);
    }
    this.e.setTextSize(this.h);
    this.e.setTextAlign(Paint.Align.CENTER);
    localFontMetrics = this.e.getFontMetrics();
    paramCanvas.drawText(this.k, this.a / 4 - this.d, this.b - i3 - localFontMetrics.ascent, this.e);
    paramCanvas.drawText(this.l, this.a * 3 / 4 - this.d, this.b - i3 - localFontMetrics.ascent, this.e);
  }
  
  public void setDataModel(StockVo paramStockVo)
  {
    this.f = paramStockVo;
    postInvalidate();
  }
  
  public void setHolder(StockChartContainer paramStockChartContainer)
  {
    this.n = paramStockChartContainer;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartPriceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */