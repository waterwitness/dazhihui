package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;

public class MinChartTradeVolumnView
  extends MinStockChartBaseView
{
  private int[] f;
  private int[] g;
  private int h;
  private int i;
  private Rect n = new Rect();
  private boolean o = true;
  private int p;
  private int q;
  private int r;
  
  public MinChartTradeVolumnView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MinChartTradeVolumnView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MinChartTradeVolumnView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int a(int paramInt)
  {
    int j = getHeight();
    paramInt = (int)(paramInt * 1.0F / this.h * (j - 1));
    if (this.h == 0) {
      return j - 2;
    }
    return j + 1 - paramInt;
  }
  
  protected void a()
  {
    super.a();
    a(g.a().b());
    this.i = getResources().getDimensionPixelSize(2131231088);
  }
  
  protected void a(Canvas paramCanvas)
  {
    int k = getWidth();
    int i1 = getHeight();
    int i2 = getPaddingTop();
    int j = getPaddingLeft();
    int m = getPaddingRight();
    int i3 = getPaddingBottom();
    paramCanvas.save();
    this.j.setColor(this.k);
    this.j.setStyle(Paint.Style.STROKE);
    float f1 = this.j.getStrokeWidth();
    this.j.setStrokeWidth(getResources().getDimensionPixelSize(2131230773));
    if (!this.o) {
      paramCanvas.drawRect(j, i2, k - m, i1 - i3, this.j);
    }
    for (;;)
    {
      i1 = i2 + (i1 - i2 - i3) / 2;
      j += 6;
      while (j < k - m)
      {
        paramCanvas.drawLine(j, i1, j + 1, i1, this.j);
        j += 6;
      }
      paramCanvas.drawLine(j, i2, k - m, i2, this.j);
    }
    this.j.setStrokeWidth(f1);
    paramCanvas.restore();
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a)
    {
      this.k = getResources().getColor(2131493296);
      this.r = getResources().getColor(2131493316);
      this.q = getResources().getColor(2131493315);
    }
    for (this.p = getResources().getColor(2131493317);; this.p = getResources().getColor(2131493317))
    {
      a(getWidth(), getHeight());
      postInvalidate();
      return;
      this.k = getResources().getColor(2131493297);
      this.r = getResources().getColor(2131493342);
      this.q = getResources().getColor(2131493315);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a == null) {}
    do
    {
      do
      {
        do
        {
          return;
          this.b = this.a.getDataModel();
        } while ((this.b == null) || (this.b.getMinData() == null));
        paramCanvas.save();
        this.b = this.a.getDataModel();
        if (this.b == null) {
          break;
        }
        this.g = this.b.getTradeVolum();
      } while (this.g == null);
      this.f = this.b.getCurrentData();
    } while (this.f == null);
    this.h = this.b.getmMaxVol();
    int i1 = getWidth();
    int i2 = getHeight();
    int k = getPaddingLeft();
    if (k == 0) {
      k = 1;
    }
    for (;;)
    {
      int i3 = this.b.getMinLength();
      if (i3 == 0)
      {
        paramCanvas.restore();
        return;
      }
      int i4 = this.b.getCp();
      int m = 0;
      int j;
      if (m < i3)
      {
        int i5 = k + (i1 - 2) * m / this.b.getMinTotalPoint();
        int i6 = a(this.g[m]);
        if (m == 0) {
          if (this.f[0] - i4 >= 0) {
            j = this.p;
          }
        }
        for (;;)
        {
          float f1 = this.j.getStrokeWidth();
          this.j.setColor(j);
          this.j.setStrokeWidth(3.0F);
          paramCanvas.drawLine(i5, i6, i5, i2 - 2, this.j);
          this.j.setStrokeWidth(f1);
          m += 1;
          break;
          j = this.q;
          continue;
          if (this.f[m] - this.f[(m - 1)] >= 0) {
            j = this.p;
          } else {
            j = this.q;
          }
        }
      }
      if (this.o)
      {
        this.j.setTextSize(this.i);
        this.j.setStyle(Paint.Style.FILL);
        this.j.setColor(this.r);
        this.j.setTextAlign(Paint.Align.LEFT);
        String str = String.valueOf(this.h);
        j = k + 2;
        paramCanvas.drawText(str, j, 2.0F - this.j.getFontMetrics().ascent, this.j);
        if (this.b.getType() == 0) {
          break;
        }
        this.j.getTextBounds(str, 0, str.length(), this.n);
        j = this.n.width() + 15 + j;
        paramCanvas.drawText("量:", j, 2.0F - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds("量:", 0, "量:".length(), this.n);
        k = this.n.width();
        if (this.g[(i3 - 1)] < 0) {
          this.g[(i3 - 1)] = 0;
        }
        str = String.valueOf(this.g[(i3 - 1)]);
        j += k + 15;
        paramCanvas.drawText(str, j, 2.0F - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds(str, 0, str.length(), this.n);
        m = this.n.width() + 15 + j;
        k = 0;
        i1 = this.b.getMarketType();
        j = k;
        if (this.b.getType() != 0) {
          if ((i1 != 1) && (i1 != 0) && (i1 != 11) && (i1 != 12))
          {
            j = k;
            if (i1 != 13) {}
          }
          else
          {
            j = this.b.getmXsVol();
          }
        }
        if (j < 0) {
          break;
        }
        paramCanvas.drawText("现手:", m, 2.0F - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds("现手:", 0, "现手:".length(), this.n);
        paramCanvas.drawText(String.valueOf(j), m + (this.n.width() + 15), 2.0F - this.j.getFontMetrics().ascent, this.j);
      }
      paramCanvas.restore();
      return;
    }
  }
  
  public void setPortrait(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartTradeVolumnView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */