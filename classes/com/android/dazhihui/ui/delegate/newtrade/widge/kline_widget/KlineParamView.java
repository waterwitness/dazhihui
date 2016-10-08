package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.android.dazhihui.d;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.StockVo;
import java.lang.reflect.Array;

public class KlineParamView
  extends KlineStockChartBaseView
{
  private int e;
  private int f;
  private KlineView g;
  private StockVo h;
  private long i;
  private int j;
  private boolean k;
  private Rect l = new Rect();
  
  public KlineParamView(Context paramContext)
  {
    super(paramContext);
  }
  
  public KlineParamView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public KlineParamView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public KlineParamView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.k = paramBoolean;
  }
  
  private long a(long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    return paramInt2 - 1 - (paramInt2 - 1) * paramLong1 / paramLong2 + paramInt1;
  }
  
  private String a(long paramLong)
  {
    String str = String.valueOf(paramLong);
    if (paramLong < 10000L) {
      return b.a(paramLong, 0);
    }
    if ((paramLong >= 10000L) && (paramLong < 1000000L))
    {
      d = paramLong / 10000.0D;
      return b.a(d, 2) + "万";
    }
    if ((paramLong >= 1000000L) && (paramLong < 10000000L))
    {
      d = paramLong / 10000.0D;
      return b.a(d, 1) + "万";
    }
    if ((paramLong >= 10000000L) && (paramLong < 100000000L))
    {
      d = paramLong / 10000.0D;
      return b.a(d, 0) + "万";
    }
    if ((paramLong >= 100000000L) && (str.length() < 11))
    {
      d = paramLong / 1.0E8D;
      return b.a(d, 2) + "亿";
    }
    if ((str.length() >= 11) && (str.length() < 12))
    {
      d = paramLong / 1.0E8D;
      return b.a(d, 1) + "亿";
    }
    double d = paramLong / 1.0E8D;
    return b.a(d, 0) + "亿";
  }
  
  private void a(int paramInt1, int paramInt2, Canvas paramCanvas)
  {
    int m = 0;
    paramCanvas.save();
    this.a.setTextAlign(Paint.Align.RIGHT);
    this.a.setColor(this.g.getKlineRightPartColor());
    this.a.setTextSize(this.f);
    this.a.setStyle(Paint.Style.FILL);
    float f1 = this.a.getFontMetrics().ascent;
    this.a.getTextBounds("1234567890", 0, 10, this.l);
    int n = this.l.height();
    n = (int)(getHeight() - 2 - paramInt1 - paramInt2 - n * 1.5D) / 2;
    paramInt2 = paramInt1 + 1;
    paramInt1 = m;
    while (paramInt1 < 3)
    {
      paramCanvas.drawText(a(this.i - this.i * paramInt1 / 2L), getWidth() - 1, paramInt2 - f1, this.a);
      paramInt2 += n;
      paramInt1 += 1;
    }
    paramCanvas.restore();
  }
  
  private void b(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.h = this.g.getDataModel();
    Object localObject1;
    int m;
    int n;
    int i8;
    int i9;
    int i1;
    int i2;
    int i10;
    int i5;
    int i11;
    float f3;
    if (this.h != null)
    {
      localObject1 = this.h.getKData();
      if (localObject1 == null)
      {
        paramCanvas.restore();
        return;
      }
      a(this.j, this.j, paramCanvas);
      m = getWidth();
      n = getHeight();
      i8 = getPaddingLeft();
      i9 = getPaddingTop() + this.j;
      i1 = getPaddingRight() + this.e;
      i2 = getPaddingBottom() + this.j;
      paramCanvas.clipRect(i8, i9, m - i1, n - i2);
      i10 = n - (i9 + i2);
      m = this.g.getKLineSize();
      i5 = this.h.getKLineOffset();
      i11 = this.g.getKLineWidth();
      f3 = i11 - this.j;
      if (f3 >= this.j) {
        break label1195;
      }
      f3 = this.j;
    }
    label455:
    label498:
    label1183:
    label1186:
    label1192:
    label1195:
    for (;;)
    {
      if (m + i5 > localObject1.length)
      {
        i1 = localObject1.length;
        i2 = this.g.getIndexModel();
        if (!this.k) {
          break label1192;
        }
        i2 = 0;
      }
      for (;;)
      {
        int i4 = this.h.getCp();
        long[] arrayOfLong = this.h.getKVolData();
        this.a.setStrokeWidth(this.j);
        int i3 = i5;
        int i6;
        if (i3 < i1)
        {
          i6 = (i3 - i5) * i11 + i8;
          m = this.g.getUpColor();
          if ((i3 > 0) && (localObject1[i3][4] < localObject1[(i3 - 1)][4]))
          {
            m = this.g.getDownColor();
            n = 0;
          }
        }
        for (;;)
        {
          if (this.i == 0L)
          {
            paramCanvas.restore();
            return;
            i1 = m + i5;
            break;
            if ((i3 != 0) || (localObject1[i3][4] >= i4)) {
              break label1186;
            }
            m = this.g.getDownColor();
            n = 0;
            continue;
          }
          int i7 = (int)a(arrayOfLong[i3], this.i, i9, i10);
          float f1;
          float f2;
          if (n != 0) {
            if ((i2 == 0) || (i2 == 7))
            {
              this.a.setColor(m);
              f1 = 0.0F;
              f2 = 0.0F;
              if (f3 > this.j) {
                break label498;
              }
              f1 = 0.0F;
              f2 = 0.0F;
              this.a.setStyle(Paint.Style.FILL);
              paramCanvas.drawRect(f1 + i6, i7, i6 + f3 - f2, getHeight() - this.j, this.a);
            }
          }
          for (;;)
          {
            i3 += 1;
            break;
            if (f3 - 1.0F > 0.0F)
            {
              f1 = 1.0F;
              f2 = 1.0F;
            }
            this.a.setStyle(Paint.Style.STROKE);
            break label455;
            if ((i2 == 0) || (i2 == 7))
            {
              this.a.setStyle(Paint.Style.FILL);
              this.a.setColor(m);
              paramCanvas.drawRect(i6, i7, i6 + f3, getHeight() - this.j, this.a);
            }
          }
          Object localObject2 = this.g.getAvgVol();
          int[] arrayOfInt1 = this.g.getAvgsColors();
          int[] arrayOfInt2 = this.g.getAvgs();
          if (localObject2 == null)
          {
            paramCanvas.restore();
            return;
          }
          this.a.setStyle(Paint.Style.FILL);
          m = 0;
          if (m < arrayOfInt2.length)
          {
            if ((localObject1.length < arrayOfInt2[m]) || (localObject2.length <= i5)) {}
            for (;;)
            {
              m += 1;
              break;
              this.a.setColor(arrayOfInt1[m]);
              i3 = Math.max(i5, arrayOfInt2[m] - 1);
              i4 = i11 / 2;
              n = (int)a(localObject2[i3][m], this.i, i9, i10);
              i4 = (i3 - i5) * i11 + i8 + i4;
              while (i3 < i1)
              {
                i7 = (i3 - i5) * i11 + i8 + i11 / 2;
                i6 = (int)a(localObject2[i3][m], this.i, i9, i10);
                if (localObject2[i3][m] > 0L) {
                  paramCanvas.drawLine(i4, n, i7, i6, this.a);
                }
                i3 += 1;
                i4 = i7;
                n = i6;
              }
            }
          }
          if (i2 != 7)
          {
            m = localObject2.length - 1;
            if (this.g.getScreenIndex() != -1) {
              m = this.g.getScreenIndex() + i5;
            }
            if (m <= localObject2.length - 1) {
              break label1183;
            }
            m = localObject2.length - 1;
          }
          for (;;)
          {
            if (getResources().getConfiguration().orientation != 2)
            {
              localObject1 = new String[] { "VOL:", a(arrayOfLong[m]) };
              this.g.a(new String[][] { localObject1 }, arrayOfInt1);
            }
            for (;;)
            {
              paramCanvas.restore();
              return;
              localObject1 = (String[][])Array.newInstance(String.class, new int[] { arrayOfInt2.length + 1, 2 });
              localObject1[0][0] = "VOL:";
              localObject1[0][1] = a(arrayOfLong[m]);
              arrayOfLong = localObject2[m];
              localObject2 = d.a().i();
              arrayOfInt2 = new int[arrayOfInt1.length + 1];
              arrayOfInt2[0] = arrayOfInt1[0];
              m = 0;
              if (m < localObject2.length)
              {
                if (m == 0) {
                  localObject1[(m + 1)][0] = ("MA " + localObject2[m] + ":");
                }
                for (;;)
                {
                  localObject1[(m + 1)][1] = a(arrayOfLong[m]);
                  arrayOfInt2[(m + 1)] = arrayOfInt1[m];
                  m += 1;
                  break;
                  localObject1[(m + 1)][0] = (localObject2[m] + ":");
                }
              }
              this.g.a((String[][])localObject1, arrayOfInt2);
            }
          }
          n = 1;
        }
      }
    }
  }
  
  protected void a()
  {
    super.a();
    this.e = getResources().getDimensionPixelSize(2131230845);
    this.f = getResources().getDimensionPixelSize(2131231088);
    this.j = getResources().getDimensionPixelSize(2131230773);
    this.a.setStrokeWidth(this.j);
    this.a.setStyle(Paint.Style.FILL);
  }
  
  protected void a(Canvas paramCanvas)
  {
    int n = getWidth();
    int i2 = getHeight();
    int i3 = getPaddingTop();
    int m = getPaddingLeft();
    int i1 = getPaddingRight();
    int i4 = getPaddingBottom();
    paramCanvas.save();
    this.a.setColor(this.b);
    this.a.setStyle(Paint.Style.STROKE);
    float f1 = this.a.getStrokeWidth();
    this.a.setStrokeWidth(getResources().getDimensionPixelSize(2131230773));
    if (getResources().getConfiguration().orientation == 1)
    {
      paramCanvas.drawLine(m, i3, n - i1, i3, this.a);
      paramCanvas.drawLine(m, i2 - i4, n - i1, i2 - i4, this.a);
    }
    for (;;)
    {
      i2 = i3 + (i2 - i3 - i4) / 2;
      m += 6;
      while (m < n - i1 - this.e)
      {
        paramCanvas.drawLine(m, i2, m + 1, i2, this.a);
        m += 6;
      }
      paramCanvas.drawRect(m, i3, n - i1, i2 - i4, this.a);
    }
    this.a.setStrokeWidth(f1);
    paramCanvas.restore();
  }
  
  public void b()
  {
    this.h = this.g.getDataModel();
    if (this.h == null) {}
    long[] arrayOfLong;
    int[][] arrayOfInt;
    do
    {
      return;
      arrayOfLong = this.h.getKVolData();
      arrayOfInt = this.h.getKData();
    } while (arrayOfLong == null);
    this.i = 0L;
    int m = this.g.getKLineSize();
    int n = this.h.getKLineOffset();
    if (m + n > arrayOfInt.length) {
      m = arrayOfInt.length;
    }
    while (n < m)
    {
      if (arrayOfLong[n] > this.i) {
        this.i = arrayOfLong[n];
      }
      n += 1;
      continue;
      m += n;
    }
    if (this.i < 2L) {
      this.i = 2L;
    }
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    int m = this.g.getIndexModel();
    if (this.k) {
      m = 0;
    }
    if (m == 0) {
      b(paramCanvas);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      if (m == 7)
      {
        this.h = this.g.getDataModel();
        if ((this.h != null) && ((n.i(this.h.getType(), n.o(this.h.getCode()))) || (n.m(this.h.getCode())))) {
          b(paramCanvas);
        }
      }
    }
  }
  
  public void setHolder(KlineView paramKlineView)
  {
    this.g = paramKlineView;
  }
  
  public void setRightDistance(int paramInt)
  {
    this.e = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\KlineParamView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */