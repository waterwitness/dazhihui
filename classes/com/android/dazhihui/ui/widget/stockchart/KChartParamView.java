package com.android.dazhihui.ui.widget.stockchart;

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
import com.android.dazhihui.ui.screen.y;
import java.lang.reflect.Array;

public class KChartParamView
  extends StockChartBaseView
{
  private int a;
  private int b;
  private KChartContainer c;
  private StockVo d;
  private long e;
  private int f;
  private boolean g;
  private Rect h = new Rect();
  
  public KChartParamView(Context paramContext)
  {
    super(paramContext);
  }
  
  public KChartParamView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public KChartParamView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public KChartParamView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.g = paramBoolean;
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
  
  private void a(int paramInt1, int paramInt2, Canvas paramCanvas)
  {
    int i = 0;
    paramCanvas.save();
    this.j.setTextAlign(Paint.Align.RIGHT);
    this.j.setColor(this.c.getKlineRightPartColor());
    this.j.setTextSize(this.b);
    this.j.setStyle(Paint.Style.FILL);
    float f1 = this.j.getFontMetrics().ascent;
    this.j.getTextBounds("1234567890", 0, 10, this.h);
    int j = this.h.height();
    j = (int)(getHeight() - 2 - paramInt1 - paramInt2 - j * 1.5D) / 2;
    paramInt2 = paramInt1 + 1;
    paramInt1 = i;
    while (paramInt1 < 3)
    {
      paramCanvas.drawText(a(this.e - this.e * paramInt1 / 2L), getWidth() - 1, paramInt2 - f1, this.j);
      paramInt2 += j;
      paramInt1 += 1;
    }
    paramCanvas.restore();
  }
  
  private void a(int paramInt1, int paramInt2, Canvas paramCanvas, String paramString1, String paramString2, String paramString3)
  {
    paramCanvas.save();
    this.j.setTextAlign(Paint.Align.RIGHT);
    this.j.setColor(this.c.getKlineRightPartColor());
    this.j.setTextSize(this.b);
    this.j.setStyle(Paint.Style.FILL);
    float f1 = this.j.getFontMetrics().ascent;
    this.j.getTextBounds("1234567890", 0, 10, this.h);
    int i = this.h.height();
    paramInt2 = (int)(getHeight() - 2 - paramInt1 - paramInt2 - i * 1.5D) / 2;
    paramInt1 += 1;
    paramCanvas.drawText(paramString1, getWidth() - 1, paramInt1 - f1, this.j);
    paramInt1 += paramInt2;
    paramCanvas.drawText(paramString2, getWidth() - 1, paramInt1 - f1, this.j);
    paramCanvas.drawText(paramString3, getWidth() - 1, paramInt2 + paramInt1 - f1, this.j);
    paramCanvas.restore();
  }
  
  private void b(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.d = this.c.getDataModel();
    Object localObject1;
    int i;
    int j;
    int i5;
    int i6;
    int k;
    int m;
    int i7;
    int i2;
    int i8;
    float f3;
    if (this.d != null)
    {
      localObject1 = this.d.getKData();
      if (localObject1 == null)
      {
        paramCanvas.restore();
        return;
      }
      a(this.f, this.f, paramCanvas);
      i = getWidth();
      j = getHeight();
      i5 = getPaddingLeft();
      i6 = getPaddingTop() + this.f;
      k = getPaddingRight() + this.a;
      m = getPaddingBottom() + this.f;
      paramCanvas.clipRect(i5, i6, i - k, j - m);
      i7 = j - (i6 + m);
      i = this.c.getKLineSize();
      i2 = this.d.getKLineOffset();
      i8 = this.c.getKLineWidth();
      f3 = i8 - this.f;
      if (f3 >= this.f) {
        break label1204;
      }
      f3 = this.f;
    }
    label455:
    label498:
    label1192:
    label1195:
    label1201:
    label1204:
    for (;;)
    {
      if (i + i2 > localObject1.length)
      {
        k = localObject1.length;
        m = this.c.getIndexModel();
        if (!this.g) {
          break label1201;
        }
        m = 0;
      }
      for (;;)
      {
        int i1 = this.d.getCp();
        long[] arrayOfLong = this.d.getKVolData();
        this.j.setStrokeWidth(this.f);
        int n = i2;
        int i3;
        if (n < k)
        {
          i3 = (n - i2) * i8 + i5;
          i = this.c.getUpColor();
          if ((n > 0) && (localObject1[n][4] < localObject1[(n - 1)][4]))
          {
            i = this.c.getDownColor();
            j = 0;
          }
        }
        for (;;)
        {
          if (this.e == 0L)
          {
            paramCanvas.restore();
            return;
            k = i + i2;
            break;
            if ((n != 0) || (localObject1[n][4] >= i1)) {
              break label1195;
            }
            i = this.c.getDownColor();
            j = 0;
            continue;
          }
          int i4 = (int)a(arrayOfLong[n], this.e, i6, i7);
          float f1;
          float f2;
          if (j != 0) {
            if ((m == 0) || (m == 7))
            {
              this.j.setColor(i);
              f1 = 0.0F;
              f2 = 0.0F;
              if (f3 > this.f) {
                break label498;
              }
              f1 = 0.0F;
              f2 = 0.0F;
              this.j.setStyle(Paint.Style.FILL);
              paramCanvas.drawRect(f1 + i3, i4, i3 + f3 - f2, getHeight() - this.f, this.j);
            }
          }
          for (;;)
          {
            n += 1;
            break;
            if (f3 - 1.0F > 0.0F)
            {
              f1 = 1.0F;
              f2 = 1.0F;
            }
            this.j.setStyle(Paint.Style.STROKE);
            break label455;
            if ((m == 0) || (m == 7))
            {
              this.j.setStyle(Paint.Style.FILL);
              this.j.setColor(i);
              paramCanvas.drawRect(i3, i4, i3 + f3, getHeight() - this.f, this.j);
            }
          }
          Object localObject2 = this.c.getAvgVol();
          int[] arrayOfInt1 = this.c.getAvgsColors();
          int[] arrayOfInt2 = this.c.getAvgs();
          if (localObject2 == null)
          {
            paramCanvas.restore();
            return;
          }
          this.j.setStyle(Paint.Style.FILL);
          i = 0;
          if (i < arrayOfInt2.length)
          {
            if ((localObject1.length < arrayOfInt2[i]) || (localObject2.length <= i2)) {}
            for (;;)
            {
              i += 1;
              break;
              this.j.setColor(arrayOfInt1[i]);
              n = Math.max(i2, arrayOfInt2[i] - 1);
              i1 = i8 / 2;
              j = (int)a(localObject2[n][i], this.e, i6, i7);
              i1 = (n - i2) * i8 + i5 + i1;
              while (n < k)
              {
                i4 = (n - i2) * i8 + i5 + i8 / 2;
                i3 = (int)a(localObject2[n][i], this.e, i6, i7);
                if (localObject2[n][i] > 0L) {
                  paramCanvas.drawLine(i1, j, i4, i3, this.j);
                }
                n += 1;
                i1 = i4;
                j = i3;
              }
            }
          }
          if ((m != 7) && (!d.a().f()))
          {
            i = localObject2.length - 1;
            if (this.c.getScreenIndex() != -1) {
              i = this.c.getScreenIndex() + i2;
            }
            if (i <= localObject2.length - 1) {
              break label1192;
            }
            i = localObject2.length - 1;
          }
          for (;;)
          {
            if (getResources().getConfiguration().orientation != 2)
            {
              localObject1 = a(arrayOfLong[i]);
              this.c.a(new String[][] { { "VOL:", localObject1 } }, arrayOfInt1);
            }
            for (;;)
            {
              paramCanvas.restore();
              return;
              localObject1 = (String[][])Array.newInstance(String.class, new int[] { arrayOfInt2.length + 1, 2 });
              localObject1[0][0] = "VOL:";
              localObject1[0][1] = a(arrayOfLong[i]);
              arrayOfLong = localObject2[i];
              localObject2 = d.a().i();
              arrayOfInt2 = new int[arrayOfInt1.length + 1];
              arrayOfInt2[0] = arrayOfInt1[0];
              i = 0;
              if (i < localObject2.length)
              {
                if (i == 0) {
                  localObject1[(i + 1)][0] = ("MA " + localObject2[i] + ":");
                }
                for (;;)
                {
                  localObject1[(i + 1)][1] = a(arrayOfLong[i]);
                  arrayOfInt2[(i + 1)] = arrayOfInt1[i];
                  i += 1;
                  break;
                  localObject1[(i + 1)][0] = (localObject2[i] + ":");
                }
              }
              this.c.a((String[][])localObject1, arrayOfInt2);
            }
          }
          j = 1;
        }
      }
    }
  }
  
  private void c(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.d = this.c.getDataModel();
    if (this.d != null)
    {
      int m = 0;
      int j = this.d.getKLineOffset();
      Object localObject1 = this.c.getMacd();
      if (localObject1 == null)
      {
        paramCanvas.restore();
        return;
      }
      int i = 0;
      int k = j;
      while (k < localObject1.length - 1)
      {
        m = Math.max(Math.max(Math.max(localObject1[k][2], localObject1[k][3]), localObject1[k][4]), m);
        i = Math.min(Math.min(Math.min(localObject1[k][2], localObject1[k][3]), localObject1[k][4]), i);
        k += 1;
      }
      int n = Math.abs(m) + Math.abs(i);
      if (n == 0)
      {
        paramCanvas.restore();
        return;
      }
      Object localObject2 = az.a((float)(m / Math.pow(10.0D, this.d.getmDecimalLen() + 1)), 2);
      String str = az.a((float)((m + i) / 2 / Math.pow(10.0D, this.d.getmDecimalLen() + 1)), 2);
      Object localObject3 = az.a((float)(i / Math.pow(10.0D, this.d.getmDecimalLen() + 1)), 2);
      a(this.f, this.f, paramCanvas, (String)localObject2, str, (String)localObject3);
      k = getWidth();
      m = getHeight();
      int i1 = getPaddingLeft();
      int i2 = getPaddingTop() + this.f;
      int i3 = getPaddingRight() + this.a;
      int i4 = getPaddingBottom() + this.f;
      paramCanvas.clipRect(i1, i2, k - i3, m - i4);
      m -= i2 + i4;
      label387:
      int i5;
      if (i < 0)
      {
        i = m - Math.abs(i) * m / n;
        i3 = this.c.getKLineWidth();
        localObject2 = this.c.getAvgsColors();
        k = j;
        if (k >= localObject1.length) {
          break label681;
        }
        i4 = (k - j) * i3 + i1 + i3 / 2;
        i5 = (k + 1 - j) * i3 + i1 + i3 / 2;
        if (k < localObject1.length - 1)
        {
          this.j.setColor(localObject2[0]);
          int i6 = localObject1[k][2] * m / n;
          int i7 = localObject1[(k + 1)][2] * m / n;
          paramCanvas.drawLine(i4, i2 + i - i6, i5, i2 + i - i7, this.j);
          this.j.setColor(localObject2[1]);
          i6 = localObject1[k][3] * m / n;
          i7 = localObject1[(k + 1)][3] * m / n;
          paramCanvas.drawLine(i4, i2 + i - i6, i5, i2 + i - i7, this.j);
        }
        i5 = i2 + i;
        if (localObject1[k][4] <= 0) {
          break label664;
        }
        this.j.setColor(this.c.getUpColor());
      }
      for (;;)
      {
        paramCanvas.drawLine(i4, i5, i4, i5 - localObject1[k][4] * m / n, this.j);
        k += 1;
        break label387;
        i = m;
        break;
        label664:
        this.j.setColor(this.c.getDownColor());
      }
      label681:
      k = this.c.getScreenIndex();
      i = localObject1.length - 1;
      if (k != -1) {
        i = k + j;
      }
      j = i;
      if (i > localObject1.length - 1) {
        j = localObject1.length - 1;
      }
      str = az.a((float)(localObject1[j][2] / Math.pow(10.0D, this.d.getmDecimalLen() + 1)), 2);
      localObject3 = new String[] { "DEA:", az.a((float)(localObject1[j][3] / Math.pow(10.0D, this.d.getmDecimalLen() + 1)), 2) };
      localObject1 = new String[] { "MACD:", az.a((float)(localObject1[j][4] / Math.pow(10.0D, this.d.getmDecimalLen() + 1)), 2) };
      this.c.a(new String[][] { { "DIFF:", str }, localObject3, localObject1 }, (int[])localObject2);
    }
    paramCanvas.restore();
  }
  
  private void d(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.d = this.c.getDataModel();
    Object localObject1;
    String str;
    Object localObject2;
    int i;
    int j;
    int i1;
    int k;
    int m;
    int i2;
    Object localObject3;
    int i4;
    int i5;
    if (this.d != null)
    {
      localObject1 = az.a(1000, 1);
      str = az.a(500, 1);
      localObject2 = az.b(0, 1);
      a(this.f, this.f, paramCanvas, (String)localObject1, str, (String)localObject2);
      i = getWidth();
      j = getHeight();
      int n = getPaddingLeft();
      i1 = getPaddingTop() + this.f;
      k = getPaddingRight() + this.a;
      m = getPaddingBottom() + this.f;
      paramCanvas.clipRect(n, i1, i - k, j - m);
      i2 = j - (i1 + m);
      m = this.d.getKLineOffset();
      localObject3 = this.c.getKdj();
      int i3 = this.c.getKLineWidth();
      localObject1 = this.c.getAvgsColors();
      if (localObject3 == null)
      {
        paramCanvas.restore();
        return;
      }
      k = m;
      if (k < localObject3.length - 1)
      {
        i4 = (k - m) * i3 + n + i3 / 2;
        i5 = (k + 1 - m) * i3 + n + i3 / 2;
        i = localObject3[k][0] * i2 / 10000;
        j = localObject3[(k + 1)][0] * i2 / 10000;
        this.j.setColor(localObject1[0]);
        paramCanvas.drawLine(i4, i1 + i2 - i, i5, i1 + i2 - j, this.j);
        i = localObject3[k][1] * i2 / 10000;
        j = localObject3[(k + 1)][1] * i2 / 10000;
        this.j.setColor(localObject1[1]);
        paramCanvas.drawLine(i4, i1 + i2 - i, i5, i1 + i2 - j, this.j);
        i = i1 + i2 - localObject3[k][2] * i2 / 10000;
        if (localObject3[k][2] > 10000)
        {
          i = i1 + 1;
          label433:
          j = localObject3[(k + 1)][2] * i2 / 10000;
          if (localObject3[(k + 1)][2] <= 10000) {
            break label533;
          }
          j = i1 + 1;
        }
      }
    }
    for (;;)
    {
      this.j.setColor(localObject1[2]);
      paramCanvas.drawLine(i4, i, i5, j, this.j);
      k += 1;
      break;
      if (localObject3[k][2] >= 0) {
        break label433;
      }
      i = i1 + i2 - 1;
      break label433;
      label533:
      if (localObject3[(k + 1)][2] < 0)
      {
        j = i1 + i2 - 1;
        continue;
        j = this.c.getScreenIndex();
        i = localObject3.length - 1;
        if (j != -1) {
          i = j + m;
        }
        j = i;
        if (i > localObject3.length - 1) {
          j = localObject3.length - 1;
        }
        localObject2 = new String[] { "K:", az.a(localObject3[j][0] / 100.0F, 1) };
        str = az.a(localObject3[j][1] / 100.0F, 1);
        localObject3 = new String[] { "J:", az.a(localObject3[j][2] / 100.0F, 1) };
        this.c.a(new String[][] { localObject2, { "D:", str }, localObject3 }, (int[])localObject1);
        paramCanvas.restore();
      }
      else
      {
        j = i1 + i2 - j;
      }
    }
  }
  
  private void e(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.d = this.c.getDataModel();
    Object localObject1;
    String str;
    Object localObject2;
    int i;
    int j;
    int i1;
    int k;
    int m;
    int i2;
    Object localObject3;
    int i4;
    int i5;
    if (this.d != null)
    {
      localObject1 = az.a(1000, 1);
      str = az.a(500, 1);
      localObject2 = az.b(0, 1);
      a(this.f, this.f, paramCanvas, (String)localObject1, str, (String)localObject2);
      i = getWidth();
      j = getHeight();
      int n = getPaddingLeft();
      i1 = getPaddingTop() + this.f;
      k = getPaddingRight() + this.a;
      m = getPaddingBottom() + this.f;
      paramCanvas.clipRect(n, i1, i - k, j - m);
      i2 = j - (i1 + m);
      m = this.d.getKLineOffset();
      localObject3 = this.c.getRsi();
      int i3 = this.c.getKLineWidth();
      localObject1 = this.c.getAvgsColors();
      if (localObject3 == null)
      {
        paramCanvas.restore();
        return;
      }
      k = m;
      if (k < localObject3.length - 1)
      {
        i4 = (k - m) * i3 + n + i3 / 2;
        i5 = (k + 1 - m) * i3 + n + i3 / 2;
        i = localObject3[k][0] * i2 / 1000;
        j = localObject3[(k + 1)][0] * i2 / 1000;
        this.j.setColor(localObject1[0]);
        paramCanvas.drawLine(i4, i1 + i2 - i, i5, i1 + i2 - j, this.j);
        i = localObject3[k][1] * i2 / 1000;
        j = localObject3[(k + 1)][1] * i2 / 1000;
        this.j.setColor(localObject1[1]);
        paramCanvas.drawLine(i4, i1 + i2 - i, i5, i1 + i2 - j, this.j);
        i = i1 + i2 - localObject3[k][2] * i2 / 1000;
        if (localObject3[k][2] > 1000)
        {
          i = i1 + 1;
          label433:
          j = localObject3[(k + 1)][2] * i2 / 1000;
          if (localObject3[(k + 1)][2] <= 1000) {
            break label533;
          }
          j = i1 + 1;
        }
      }
    }
    for (;;)
    {
      this.j.setColor(localObject1[2]);
      paramCanvas.drawLine(i4, i, i5, j, this.j);
      k += 1;
      break;
      if (localObject3[k][2] >= 0) {
        break label433;
      }
      i = i1 + i2 - 1;
      break label433;
      label533:
      if (localObject3[(k + 1)][2] < 0)
      {
        j = i1 + i2 - 1;
        continue;
        j = this.c.getScreenIndex();
        i = localObject3.length - 1;
        if (j != -1) {
          i = j + m;
        }
        j = i;
        if (i > localObject3.length - 1) {
          j = localObject3.length - 1;
        }
        str = az.a(localObject3[j][0], 1);
        localObject2 = new String[] { "RSI2:", az.a(localObject3[j][1], 1) };
        localObject3 = az.a(localObject3[j][2], 1);
        this.c.a(new String[][] { { "RSI1:", str }, localObject2, { "RSI3:", localObject3 } }, (int[])localObject1);
        paramCanvas.restore();
      }
      else
      {
        j = i1 + i2 - j;
      }
    }
  }
  
  private void f(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.d = this.c.getDataModel();
    if (this.d != null)
    {
      int m = 0;
      int j = this.d.getKLineOffset();
      Object localObject1 = this.c.getBias();
      if (localObject1 == null)
      {
        paramCanvas.restore();
        return;
      }
      int i = 0;
      int k = j;
      while (k < localObject1.length - 1)
      {
        m = Math.max(Math.max(Math.max(localObject1[k][0], localObject1[k][1]), localObject1[k][2]), m);
        i = Math.min(Math.min(Math.min(localObject1[k][0], localObject1[k][1]), localObject1[k][2]), i);
        k += 1;
      }
      int n = Math.abs(m) + Math.abs(i);
      if (n == 0)
      {
        paramCanvas.restore();
        return;
      }
      Object localObject2 = az.a(m, 1);
      String str1 = az.a((m + i) / 2, 1);
      String str2 = az.a(i, 1);
      a(this.f, this.f, paramCanvas, (String)localObject2, str1, str2);
      k = getWidth();
      int i2 = getHeight();
      m = getPaddingLeft();
      int i1 = getPaddingTop() + this.f;
      int i3 = getPaddingRight() + this.a;
      int i4 = getPaddingBottom() + this.f;
      paramCanvas.clipRect(m, i1, k - i3, i2 - i4);
      i2 -= i1 + i4;
      if (i < 0) {}
      for (i = i2 - Math.abs(i) * i2 / n;; i = 0)
      {
        i3 = this.c.getKLineWidth();
        localObject2 = this.c.getAvgsColors();
        k = j;
        while (k < localObject1.length - 1)
        {
          i4 = (k - j) * i3 + m + i3 / 2;
          int i5 = (k + 1 - j) * i3 + m + i3 / 2;
          int i6 = localObject1[k][0] * i2 / n;
          int i7 = localObject1[(k + 1)][0] * i2 / n;
          this.j.setColor(localObject2[0]);
          paramCanvas.drawLine(i4, i1 + i - i6, i5, i1 + i - i7, this.j);
          i6 = localObject1[k][1] * i2 / n;
          i7 = localObject1[(k + 1)][1] * i2 / n;
          this.j.setColor(localObject2[1]);
          paramCanvas.drawLine(i4, i1 + i - i6, i5, i1 + i - i7, this.j);
          i6 = localObject1[k][2] * i2 / n;
          i7 = localObject1[(k + 1)][2] * i2 / n;
          this.j.setColor(localObject2[2]);
          paramCanvas.drawLine(i4, i1 + i - i6, i5, i1 + i - i7, this.j);
          k += 1;
        }
      }
      k = this.c.getScreenIndex();
      i = localObject1.length - 1;
      if (k != -1) {
        i = k + j;
      }
      j = i;
      if (i > localObject1.length - 1) {
        j = localObject1.length - 1;
      }
      str1 = az.a(localObject1[j][0], 1);
      str2 = az.a(localObject1[j][1], 1);
      localObject1 = az.a(localObject1[j][2], 1);
      this.c.a(new String[][] { { "BIAS1:", str1 }, { "BIAS2:", str2 }, { "BIAS3:", localObject1 } }, (int[])localObject2);
    }
    paramCanvas.restore();
  }
  
  private void g(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.d = this.c.getDataModel();
    if (this.d != null)
    {
      int j = this.d.getKLineOffset();
      Object localObject1 = this.c.getCci();
      if (localObject1 == null)
      {
        paramCanvas.restore();
        return;
      }
      int m = 0;
      int i = 0;
      int k = j;
      while (k < localObject1.length - 1)
      {
        m = Math.max(localObject1[k], m);
        i = Math.min(localObject1[k], i);
        k += 1;
      }
      int n = Math.abs(m) + Math.abs(i);
      if (n == 0)
      {
        paramCanvas.restore();
        return;
      }
      Object localObject2 = az.a(m, 1);
      String str1 = az.a((m + i) / 2, 1);
      String str2 = az.a(i, 1);
      a(this.f, this.f, paramCanvas, (String)localObject2, str1, str2);
      k = getWidth();
      int i2 = getHeight();
      m = getPaddingLeft();
      int i1 = getPaddingTop() + this.f;
      int i3 = getPaddingRight() + this.a;
      int i4 = getPaddingBottom() + this.f;
      paramCanvas.clipRect(m, i1, k - i3, i2 - i4);
      i2 -= i1 + i4;
      if (i < 0) {}
      for (i = i2 - Math.abs(i) * i2 / n;; i = 0)
      {
        i3 = this.c.getKLineWidth();
        localObject2 = this.c.getAvgsColors();
        k = j;
        while (k < localObject1.length - 1)
        {
          i4 = i3 / 2;
          int i5 = i3 / 2;
          int i6 = localObject1[k] * i2 / n;
          int i7 = localObject1[(k + 1)] * i2 / n;
          this.j.setColor(localObject2[0]);
          paramCanvas.drawLine((k - j) * i3 + m + i4, i1 + i - i6, (k + 1 - j) * i3 + m + i5, i1 + i - i7, this.j);
          k += 1;
        }
      }
      k = this.c.getScreenIndex();
      i = localObject1.length - 1;
      if (k != -1) {
        i = k + j;
      }
      j = i;
      if (i > localObject1.length - 1) {
        j = localObject1.length - 1;
      }
      localObject1 = new String[] { "CCI:", az.a(localObject1[j], 1) };
      this.c.a(new String[][] { localObject1 }, (int[])localObject2);
    }
    paramCanvas.restore();
  }
  
  private void h(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.d = this.c.getDataModel();
    int m;
    Object localObject1;
    int i;
    int n;
    int k;
    if (this.d != null)
    {
      m = this.d.getKLineOffset();
      localObject1 = this.c.getWr();
      if (localObject1 == null)
      {
        paramCanvas.restore();
        return;
      }
      j = 0;
      i = Integer.MAX_VALUE;
      n = m;
      if (n < localObject1.length - 1)
      {
        k = j;
        if (j < localObject1[n][0]) {
          k = localObject1[n][0];
        }
        if (k >= localObject1[n][1]) {
          break label668;
        }
      }
    }
    label668:
    for (int j = localObject1[n][1];; j = k)
    {
      k = i;
      if (i > localObject1[n][0]) {
        k = localObject1[n][0];
      }
      if (k > localObject1[n][1]) {}
      for (i = localObject1[n][1];; i = k)
      {
        n += 1;
        break;
        k = j - i;
        if (k == 0)
        {
          paramCanvas.restore();
          return;
        }
        Object localObject2 = az.a(j, 2);
        String str1 = az.a((j + i) / 2, 2);
        String str2 = az.b(i, 2);
        a(this.f, this.f, paramCanvas, (String)localObject2, str1, str2);
        j = getWidth();
        int i2 = getHeight();
        n = getPaddingLeft();
        int i1 = getPaddingTop() + this.f;
        int i3 = getPaddingRight() + this.a;
        int i4 = getPaddingBottom() + this.f;
        paramCanvas.clipRect(n, i1, j - i3, i2 - i4);
        i2 -= i1 + i4;
        i3 = this.c.getKLineWidth();
        localObject2 = this.c.getAvgsColors();
        j = m;
        while (j < localObject1.length - 1)
        {
          i4 = (j - m) * i3 + n + i3 / 2;
          int i5 = (j + 1 - m) * i3 + n + i3 / 2;
          this.j.setColor(localObject2[0]);
          int i6 = (localObject1[j][0] - i) * i2 / k;
          int i7 = (localObject1[(j + 1)][0] - i) * i2 / k;
          paramCanvas.drawLine(i4, i1 + i2 - i6, i5, i1 + i2 - i7, this.j);
          this.j.setColor(localObject2[1]);
          i6 = (localObject1[j][1] - i) * i2 / k;
          i7 = (localObject1[(j + 1)][1] - i) * i2 / k;
          paramCanvas.drawLine(i4, i1 + i2 - i6, i5, i1 + i2 - i7, this.j);
          j += 1;
        }
        j = this.c.getScreenIndex();
        i = localObject1.length - 1;
        if (j != -1) {
          i = j + m;
        }
        j = i;
        if (i > localObject1.length - 1) {
          j = localObject1.length - 1;
        }
        str1 = az.a(localObject1[j][0], 2);
        localObject1 = az.a(localObject1[j][1], 2);
        this.c.a(new String[][] { { "WR1:", str1 }, { "WR2:", localObject1 } }, (int[])localObject2);
        paramCanvas.restore();
        return;
      }
    }
  }
  
  private void i(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.d = this.c.getDataModel();
    Object localObject1;
    int m;
    int i;
    int n;
    int k;
    if (this.d != null)
    {
      localObject1 = this.c.getDma();
      m = this.d.getKLineOffset();
      j = 0;
      if (localObject1 == null)
      {
        paramCanvas.restore();
        return;
      }
      i = Integer.MAX_VALUE;
      n = m;
      if (n < localObject1.length - 1)
      {
        k = j;
        if (j < localObject1[n][0]) {
          k = localObject1[n][0];
        }
        if (k >= localObject1[n][1]) {
          break label770;
        }
      }
    }
    label770:
    for (int j = localObject1[n][1];; j = k)
    {
      k = i;
      if (i > localObject1[n][0]) {
        k = localObject1[n][0];
      }
      if (k > localObject1[n][1]) {}
      for (i = localObject1[n][1];; i = k)
      {
        n += 1;
        break;
        k = j - i;
        if (k == 0)
        {
          paramCanvas.restore();
          return;
        }
        Object localObject2 = az.a((float)(j / Math.pow(10.0D, this.d.getmDecimalLen())), 2);
        Object localObject3 = az.a((float)((j + i) / 2 / Math.pow(10.0D, this.d.getmDecimalLen())), 2);
        String str = az.a((float)(i / Math.pow(10.0D, this.d.getmDecimalLen())), 2);
        a(this.f, this.f, paramCanvas, (String)localObject2, (String)localObject3, str);
        j = getWidth();
        int i2 = getHeight();
        n = getPaddingLeft();
        int i1 = getPaddingTop() + this.f;
        int i3 = getPaddingRight() + this.a;
        int i4 = getPaddingBottom() + this.f;
        paramCanvas.clipRect(n, i1, j - i3, i2 - i4);
        i2 -= i1 + i4;
        i3 = this.c.getKLineWidth();
        localObject2 = this.c.getAvgsColors();
        j = m;
        if (j < localObject1.length - 1)
        {
          i4 = (j - m) * i3 + n + i3 / 2;
          int i5 = (j + 1 - m) * i3 + n + i3 / 2;
          if (j < 50) {}
          for (;;)
          {
            j += 1;
            break;
            this.j.setColor(localObject2[0]);
            int i6 = (localObject1[j][0] - i) * i2 / k;
            int i7 = (localObject1[(j + 1)][0] - i) * i2 / k;
            paramCanvas.drawLine(i4, i1 + i2 - i6, i5, i1 + i2 - i7, this.j);
            if (j >= 60)
            {
              this.j.setColor(localObject2[1]);
              i6 = (localObject1[j][1] - i) * i2 / k;
              i7 = (localObject1[(j + 1)][1] - i) * i2 / k;
              paramCanvas.drawLine(i4, i1 + i2 - i6, i5, i1 + i2 - i7, this.j);
            }
          }
        }
        j = this.c.getScreenIndex();
        i = localObject1.length - 1;
        if (j != -1) {
          i = j + m;
        }
        j = i;
        if (i > localObject1.length - 1) {
          j = localObject1.length - 1;
        }
        localObject3 = new String[] { "DDD:", az.a((float)(localObject1[j][0] / Math.pow(10.0D, this.d.getmDecimalLen())), 2) };
        localObject1 = new String[] { "AMA:", az.a((float)(localObject1[j][1] / Math.pow(10.0D, this.d.getmDecimalLen())), 2) };
        this.c.a(new String[][] { localObject3, localObject1 }, (int[])localObject2);
        paramCanvas.restore();
        return;
      }
    }
  }
  
  protected void a()
  {
    super.a();
    this.a = getResources().getDimensionPixelSize(2131230845);
    this.b = getResources().getDimensionPixelSize(2131231088);
    this.f = getResources().getDimensionPixelSize(2131230773);
    this.j.setStrokeWidth(this.f);
    this.j.setStyle(Paint.Style.FILL);
  }
  
  protected void a(Canvas paramCanvas)
  {
    int j = getWidth();
    int m = getHeight();
    int n = getPaddingTop();
    int i = getPaddingLeft();
    int k = getPaddingRight();
    int i1 = getPaddingBottom();
    paramCanvas.save();
    this.j.setColor(this.k);
    this.j.setStyle(Paint.Style.STROKE);
    float f1 = this.j.getStrokeWidth();
    this.j.setStrokeWidth(getResources().getDimensionPixelSize(2131230773));
    if (getResources().getConfiguration().orientation == 1)
    {
      paramCanvas.drawLine(i, n, j - k, n, this.j);
      paramCanvas.drawLine(i, m - i1, j - k, m - i1, this.j);
    }
    for (;;)
    {
      m = n + (m - n - i1) / 2;
      i += 6;
      while (i < j - k - this.a)
      {
        paramCanvas.drawLine(i, m, i + 1, m, this.j);
        i += 6;
      }
      paramCanvas.drawRect(i, n, j - k, m - i1, this.j);
    }
    this.j.setStrokeWidth(f1);
    paramCanvas.restore();
  }
  
  public void a(y paramy)
  {
    a(getWidth(), getHeight());
    postInvalidate();
  }
  
  public void b()
  {
    this.d = this.c.getDataModel();
    if (this.d == null) {}
    long[] arrayOfLong;
    int[][] arrayOfInt;
    do
    {
      return;
      arrayOfLong = this.d.getKVolData();
      arrayOfInt = this.d.getKData();
    } while (arrayOfLong == null);
    this.e = 0L;
    int i = this.c.getKLineSize();
    int j = this.d.getKLineOffset();
    if (i + j > arrayOfInt.length) {
      i = arrayOfInt.length;
    }
    while (j < i)
    {
      if (arrayOfLong[j] > this.e) {
        this.e = arrayOfLong[j];
      }
      j += 1;
      continue;
      i += j;
    }
    if (this.e < 2L) {
      this.e = 2L;
    }
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    int i = this.c.getIndexModel();
    if (this.g) {
      i = 0;
    }
    if (i == 0) {
      b(paramCanvas);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      if (i == 1)
      {
        c(paramCanvas);
      }
      else if (i == 2)
      {
        d(paramCanvas);
      }
      else if (i == 3)
      {
        e(paramCanvas);
      }
      else if (i == 4)
      {
        f(paramCanvas);
      }
      else if (i == 5)
      {
        g(paramCanvas);
      }
      else if (i == 6)
      {
        h(paramCanvas);
      }
      else if (i == 8)
      {
        i(paramCanvas);
      }
      else if (i == 7)
      {
        this.d = this.c.getDataModel();
        if (this.d != null) {
          if ((n.i(this.d.getType(), n.o(this.d.getCode()))) || (n.m(this.d.getCode()))) {
            b(paramCanvas);
          } else {
            c(paramCanvas);
          }
        }
      }
    }
  }
  
  public void setHolder(KChartContainer paramKChartContainer)
  {
    this.c = paramKChartContainer;
  }
  
  public void setRightDistance(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\KChartParamView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */