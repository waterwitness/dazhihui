package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import java.util.List;

class MinDealDetailsView
  extends View
{
  private MinChartContainer a;
  private int b;
  private int c;
  private String[] d = getResources().getStringArray(2131361853);
  private String[] e = getResources().getStringArray(2131361863);
  private int f = getResources().getDimensionPixelOffset(2131230827);
  private int g = getResources().getDimensionPixelOffset(2131230829);
  private int h = getResources().getDimensionPixelSize(2131230780);
  private int i = getResources().getDimensionPixelSize(2131230788);
  private int j = getResources().getDimensionPixelSize(2131230820);
  private Paint k = new Paint(1);
  private Rect l = new Rect();
  private Paint.FontMetricsInt m;
  private int n = -7829368;
  private int o;
  private int p;
  private y q;
  private List<int[]> r;
  private String[] s = getResources().getStringArray(2131361854);
  private int t = 2;
  
  public MinDealDetailsView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinDealDetailsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinDealDetailsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(g.a().b());
  }
  
  public int a(Canvas paramCanvas)
  {
    int i3 = this.c;
    this.k.setStrokeWidth(1.0F);
    this.k.setTextSize(this.i);
    this.k.setColor(this.n);
    paramCanvas.drawLine(0.0F, 0, i3, 0, this.k);
    this.k.setTextAlign(Paint.Align.LEFT);
    this.m = this.k.getFontMetricsInt();
    this.k.setColor(this.o);
    this.k.getTextBounds(this.d[0], 0, this.d[0].length(), this.l);
    paramCanvas.drawText(this.d[0], this.g + 0, (this.f - this.l.height()) / 2 + 0 - this.m.ascent, this.k);
    this.k.setTextAlign(Paint.Align.CENTER);
    paramCanvas.drawText(this.d[2], i3 / 2, (this.f - this.l.height()) / 2 + 0 - this.m.ascent, this.k);
    paramCanvas.drawText(this.d[1], i3 / 2 - this.j * 2, (this.f - this.l.height()) / 2 + 0 - this.m.ascent, this.k);
    paramCanvas.drawText(this.d[3], i3 / 2 + this.j * 2, (this.f - this.l.height()) / 2 + 0 - this.m.ascent, this.k);
    this.k.setTextAlign(Paint.Align.RIGHT);
    paramCanvas.drawText(this.d[4], i3 - this.g, (this.f - this.l.height()) / 2 + 0 - this.m.ascent, this.k);
    int i2 = 0 + this.f;
    this.k.setColor(this.n);
    paramCanvas.drawLine(0.0F, i2, i3, i2, this.k);
    this.k.setTextSize(this.h);
    int i1 = 0;
    while (i1 < this.r.size())
    {
      this.k.setTextAlign(Paint.Align.LEFT);
      this.m = this.k.getFontMetricsInt();
      this.k.setColor(this.o);
      paramCanvas.drawText(az.d(((int[])this.r.get(i1))[0]), this.g + 0, (this.f - this.h) / 2 + i2 + this.h, this.k);
      this.k.setTextAlign(Paint.Align.CENTER);
      paramCanvas.drawText(((int[])this.r.get(i1))[2] + "", i3 / 2, (this.f - this.h) / 2 + i2 + this.h, this.k);
      paramCanvas.drawText(az.a(((int[])this.r.get(i1))[1], this.t) + "", i3 / 2 - this.j * 2, (this.f - this.h) / 2 + i2 + this.h, this.k);
      paramCanvas.drawText(((int[])this.r.get(i1))[5] + "", i3 / 2 + this.j * 2, (this.f - this.h) / 2 + i2 + this.h, this.k);
      this.k.setTextAlign(Paint.Align.RIGHT);
      if (this.q == y.b) {
        this.k.setColor(this.p);
      }
      paramCanvas.drawText(this.s[(((int[])this.r.get(i1))[6] - 1)], i3 - this.g, (this.f - this.h) / 2 + i2 + this.h, this.k);
      i2 += this.f;
      this.k.setColor(this.n);
      paramCanvas.drawLine(0.0F, i2, i3, i2, this.k);
      i1 += 1;
    }
    return i2;
  }
  
  public void a(y paramy)
  {
    this.q = paramy;
    if (paramy == y.a)
    {
      this.n = -12961221;
      this.o = getResources().getColor(2131493099);
    }
    for (;;)
    {
      postInvalidate();
      return;
      this.o = -14540254;
      this.n = -2697514;
      this.p = -10066330;
    }
  }
  
  public void a(MinChartContainer paramMinChartContainer)
  {
    this.a = paramMinChartContainer;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    StockVo localStockVo = this.a.getHolder().getDataModel();
    if (localStockVo != null)
    {
      this.r = localStockVo.getOptionMinDealData();
      this.t = localStockVo.getmDecimalLen();
    }
    if ((this.r == null) || (this.r.size() == 0)) {}
    int i1;
    do
    {
      return;
      i1 = a(paramCanvas);
    } while (i1 == this.b);
    this.b = i1;
    ((LinearLayout.LayoutParams)getLayoutParams()).height = this.b;
    requestLayout();
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.c = paramInt1;
    this.b = paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinDealDetailsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */