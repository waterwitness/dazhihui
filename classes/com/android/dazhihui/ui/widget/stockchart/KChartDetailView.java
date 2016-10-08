package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;

public class KChartDetailView
  extends View
{
  private Paint a;
  private int b;
  private Rect c = new Rect();
  private String[] d;
  private String[] e;
  private String[] f;
  private String[] g;
  private int[] h;
  private StockChartContainer i;
  private int j = -1;
  
  public KChartDetailView(Context paramContext)
  {
    super(paramContext);
    b();
  }
  
  public KChartDetailView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  public KChartDetailView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b();
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    int[][] arrayOfInt = this.i.getDataModel().getKData();
    if (paramInt1 == 0) {
      return b.h(arrayOfInt[paramInt1][paramInt2], arrayOfInt[paramInt1][1]);
    }
    return b.h(arrayOfInt[paramInt1][paramInt2], arrayOfInt[(paramInt1 - 1)][4]);
  }
  
  private String a(long paramLong)
  {
    String str = String.valueOf(paramLong);
    if (paramLong < 10000L) {
      return b.a(paramLong, 0);
    }
    if ((paramLong >= 10000L) && (paramLong < 1000000L))
    {
      d1 = paramLong / 10000.0D;
      return b.a(d1, 2) + "万";
    }
    if ((paramLong >= 1000000L) && (paramLong < 10000000L))
    {
      d1 = paramLong / 10000.0D;
      return b.a(d1, 1) + "万";
    }
    if ((paramLong >= 10000000L) && (paramLong < 100000000L))
    {
      d1 = paramLong / 10000.0D;
      return b.a(d1, 0) + "万";
    }
    if ((paramLong >= 100000000L) && (str.length() < 11))
    {
      d1 = paramLong / 1.0E8D;
      return b.a(d1, 2) + "亿";
    }
    if ((str.length() >= 11) && (str.length() < 12))
    {
      d1 = paramLong / 1.0E8D;
      return b.a(d1, 1) + "亿";
    }
    double d1 = paramLong / 1.0E8D;
    return b.a(d1, 0) + "亿";
  }
  
  private String a(String paramString)
  {
    paramString = paramString.trim();
    int k = paramString.length();
    if (k < 10)
    {
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append(paramString.substring(0, k - 4)).append(".").append(paramString.substring(k - 4, k));
      localObject = ((StringBuffer)localObject).toString();
      paramString = new StringBuffer();
      paramString.append(((String)localObject).substring(0, 5));
      localObject = paramString.toString();
      if (((String)localObject).charAt(4) == '.')
      {
        paramString = new StringBuffer();
        paramString.append(((String)localObject).substring(0, 4));
      }
      return paramString.toString();
    }
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(paramString.substring(0, k - 8)).append(".").append(paramString.substring(k - 8, k));
    localObject = ((StringBuffer)localObject).toString();
    paramString = new StringBuffer();
    paramString.append(((String)localObject).substring(0, 5));
    localObject = paramString.toString();
    if (((String)localObject).charAt(4) == '.')
    {
      paramString = new StringBuffer();
      paramString.append(((String)localObject).substring(0, 4));
    }
    return paramString.toString();
  }
  
  private void b()
  {
    b(g.a().b());
    this.b = getResources().getDimensionPixelSize(2131231040);
    this.d = getResources().getStringArray(2131361833);
    this.e = getResources().getStringArray(2131361834);
    this.a = new Paint(1);
    this.a.setTextSize(this.b);
  }
  
  private void b(y paramy)
  {
    if (paramy == y.b)
    {
      this.j = -10066330;
      return;
    }
    this.j = -1;
  }
  
  public void a()
  {
    StockVo localStockVo = this.i.getDataModel();
    int m;
    int[][] arrayOfInt;
    long[] arrayOfLong;
    int n;
    int k;
    if (localStockVo != null)
    {
      m = localStockVo.getCCTag();
      int i1 = localStockVo.getKLineOffset();
      arrayOfInt = localStockVo.getKData();
      arrayOfLong = localStockVo.getKVolData();
      n = localStockVo.getmDecimalLen();
      k = this.d.length;
      this.f = this.d;
      if (m == 1)
      {
        k = this.e.length;
        this.f = this.e;
      }
      long[][] arrayOfLong1 = this.i.getKChartContainer().getAvgPrice();
      int i2 = this.i.getKChartContainer().getScreenIndex();
      if ((i2 == -1) || (arrayOfLong1 == null) || (arrayOfInt == null)) {
        break label553;
      }
      this.g = new String[k];
      this.h = new int[k];
      k = i2 + i1;
      if (k <= arrayOfLong1.length - 1) {
        break label863;
      }
      k = arrayOfLong1.length - 1;
    }
    label506:
    label516:
    label553:
    label596:
    label616:
    label631:
    label709:
    label745:
    label825:
    label847:
    label863:
    for (;;)
    {
      if ((k < 0) || (k >= arrayOfInt.length)) {}
      do
      {
        do
        {
          return;
          this.g[0] = String.valueOf(arrayOfInt[k][0]);
        } while (this.g[0].length() <= 2);
        this.g[0] = this.g[0].substring(2, this.g[0].length());
        if (this.i.getKChartContainer().getKLinePeriodValue() > 5) {
          break;
        }
        this.g[0] = n.a(arrayOfInt[k][0]);
      } while (this.g[0].length() <= 5);
      this.g[1] = az.a(arrayOfInt[k][1], n);
      this.g[2] = az.a(arrayOfInt[k][2], n);
      this.g[3] = az.a(arrayOfInt[k][3], n);
      this.g[4] = az.a(arrayOfInt[k][4], n);
      this.g[5] = a(arrayOfLong[k]);
      this.h[0] = this.j;
      this.h[1] = a(k, 1);
      this.h[2] = a(k, 2);
      this.h[3] = a(k, 3);
      this.h[4] = a(k, 4);
      this.h[5] = this.j;
      if (m == 0)
      {
        if (arrayOfInt[k][6] == 0)
        {
          this.g[6] = "-";
          this.h[6] = this.j;
          if (k <= 0) {
            break label596;
          }
          this.g[7] = b.b(arrayOfInt[k][4], arrayOfInt[(k - 1)][4]);
          this.h[7] = b.h(arrayOfInt[k][4], arrayOfInt[(k - 1)][4]);
          if (localStockVo.getmData2939() != null) {
            break label616;
          }
          l = 0L;
          if (l == 0L) {
            break label631;
          }
          this.g[8] = b.a(arrayOfLong[k] + l, l);
          this.h[8] = this.j;
        }
        for (;;)
        {
          invalidate();
          return;
          this.g[6] = (String.valueOf(arrayOfInt[k][6]) + "000000");
          break;
          this.g[7] = "";
          this.h[7] = 0;
          break label506;
          l = az.a(localStockVo.getmData2939()[6]);
          break label516;
          this.g[8] = "-";
          this.h[8] = this.j;
        }
      }
      if (k > 0)
      {
        this.g[6] = b.b(arrayOfInt[k][4], arrayOfInt[(k - 1)][4], n);
        this.h[6] = b.h(arrayOfInt[k][4], arrayOfInt[(k - 1)][4]);
        this.g[7] = String.valueOf(arrayOfInt[k][7]);
        this.h[7] = this.j;
        if (k != 0) {
          break label825;
        }
        m = 0;
        this.g[8] = String.valueOf(m);
        this.h[8] = b.g(m);
        if (k != 0) {
          break label847;
        }
      }
      for (long l = 0L;; l = arrayOfLong[k] - arrayOfLong[(k - 1)])
      {
        this.g[9] = String.valueOf(l);
        this.h[9] = b.g((int)l);
        break;
        this.g[6] = "";
        this.h[6] = 0;
        break label709;
        m = arrayOfInt[k][7] - arrayOfInt[(k - 1)][7];
        break label745;
      }
    }
  }
  
  protected void a(y paramy)
  {
    b(paramy);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int k = this.i.getKChartContainer().getScreenIndex();
    if ((this.g == null) || (this.h == null) || (this.f == null) || (k == -1)) {
      return;
    }
    b(g.a().b());
    paramCanvas.save();
    int i3 = this.i.getDataModel().getCCTag();
    int i4 = getWidth();
    k = getHeight();
    int i5 = this.g.length / 2;
    int n = i4 / ((i5 + 1) * 2 + 0);
    int i2 = (k - this.b * 2) / 3;
    k = 0;
    int m = 0;
    if ((m >= this.g.length) || (this.g.length < m + 1) || (this.f.length < m + 1) || (this.h.length < m + 1))
    {
      paramCanvas.restore();
      return;
    }
    if (this.g[m] == null) {
      this.g[m] = "";
    }
    int i1 = i2;
    if (m == i5 + 1)
    {
      i1 = i2 + (this.b + i2);
      n = i4 / ((this.g.length - i5 - 1) * 2);
      k = 0;
    }
    String str;
    if ((m == 5) || ((m == 6) && (i3 == 0)))
    {
      this.a.setColor(this.j);
      str = this.f[m] + ":";
      paramCanvas.drawText(str, k, i1 - this.a.getFontMetrics().ascent, this.a);
      this.a.getTextBounds(str, 0, str.length(), this.c);
      this.a.setColor(this.h[m]);
      if ((this.g[m].length() < 7) || (m == 5))
      {
        paramCanvas.drawText(this.g[m], this.c.width() + k + 2, i1 - this.a.getFontMetrics().ascent, this.a);
        label408:
        k += n * 2;
      }
    }
    for (;;)
    {
      m += 1;
      i2 = i1;
      break;
      if (this.g[m].length() < 10)
      {
        paramCanvas.drawText(a(this.g[m]) + "万", this.c.width() + k + 2, i1 - this.a.getFontMetrics().ascent, this.a);
        break label408;
      }
      paramCanvas.drawText(a(this.g[m]) + "亿", this.c.width() + k + 2, i1 - this.a.getFontMetrics().ascent, this.a);
      break label408;
      this.a.setColor(this.j);
      str = this.f[m] + ":";
      paramCanvas.drawText(this.f[m] + ":", k, i1 - this.a.getFontMetrics().ascent, this.a);
      this.a.getTextBounds(str, 0, str.length(), this.c);
      this.a.setColor(this.h[m]);
      paramCanvas.drawText(this.g[m], this.c.width() + k + 2, i1 - this.a.getFontMetrics().ascent, this.a);
      if (m == 0) {
        k += n * 6 / 5 + n;
      } else {
        k += n * 2;
      }
    }
  }
  
  public void setHolder(StockChartContainer paramStockChartContainer)
  {
    this.i = paramStockChartContainer;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\KChartDetailView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */