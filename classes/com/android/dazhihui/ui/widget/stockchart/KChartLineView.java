package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.android.dazhihui.d;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import java.lang.reflect.Array;

public class KChartLineView
  extends StockChartBaseView
{
  private int A;
  private int[] B = { -409087, -829460 };
  private int C;
  private Bitmap D;
  private Bitmap E;
  private Path F = new Path();
  private Path G = new Path();
  private Runnable H = new o(this);
  private int a;
  private int b;
  private int c;
  private long d = -2147483648L;
  private long e = 2147483647L;
  private KChartContainer f;
  private StockVo g;
  private int h;
  private float i;
  private float n;
  private float o;
  private float p;
  private float q;
  private float r;
  private Rect s = new Rect();
  private Path t = new Path();
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public KChartLineView(Context paramContext)
  {
    super(paramContext);
  }
  
  public KChartLineView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public KChartLineView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int a(long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    return (int)(paramInt2 - 1 - (paramInt2 - 1) * paramLong1 / paramLong2) + paramInt1;
  }
  
  private void a(int paramInt)
  {
    this.f.setScreenIndex((paramInt - getPaddingLeft()) / this.f.getKLineWidth());
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    this.g = this.f.getDataModel();
    Object localObject1 = this.f.getBoll();
    if (localObject1 == null) {
      return;
    }
    paramCanvas.save();
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = this.f.getAvgsColors()[0];
    arrayOfInt[1] = this.f.getAvgsColors()[1];
    arrayOfInt[2] = this.f.getAvgsColors()[2];
    paramCanvas.clipRect(paramInt1, paramInt2, getWidth() - paramInt3, getHeight() - paramInt4);
    Object localObject2 = this.g.getKData();
    int m = this.g.getKLineOffset();
    int i1 = this.f.getKLineWidth();
    int i2 = getHeight() - paramInt2 - paramInt4;
    paramInt3 = 0;
    if (paramInt3 < arrayOfInt.length)
    {
      if (localObject2.length < 26) {}
      for (;;)
      {
        paramInt3 += 1;
        break;
        this.j.setColor(arrayOfInt[paramInt3]);
        int j = Math.max(m, 25);
        if ((j <= localObject1.length) && (j >= 0))
        {
          float f1 = (j - m) * i1 + paramInt1 + i1 / 2;
          int k;
          for (paramInt4 = a(localObject1[j][paramInt3] - this.e * 10L, (this.d - this.e) * 10L, paramInt2, i2); j < localObject1.length; paramInt4 = k)
          {
            float f2 = (j - m) * i1 + paramInt1 + i1 / 2;
            k = a(localObject1[j][paramInt3] - this.e * 10L, (this.d - this.e) * 10L, paramInt2, i2);
            if (localObject1[j][paramInt3] > 0) {
              paramCanvas.drawLine(f1, paramInt4, f2, k, this.j);
            }
            j += 1;
            f1 = f2;
          }
        }
      }
    }
    paramCanvas.restore();
    paramInt2 = this.f.getScreenIndex();
    paramInt1 = localObject1.length - 1;
    if (paramInt2 != -1) {
      paramInt1 = paramInt2 + m;
    }
    paramInt2 = paramInt1;
    if (paramInt1 > localObject1.length - 1) {
      paramInt2 = localObject1.length - 1;
    }
    paramCanvas = az.a(localObject1[paramInt2][0], 3);
    localObject2 = az.a(localObject1[paramInt2][1], 3);
    localObject1 = new String[] { "LOW:", az.a(localObject1[paramInt2][2], 3) };
    this.f.a(new String[][] { { "MID:", paramCanvas }, { "UPP:", localObject2 }, localObject1 }, arrayOfInt);
  }
  
  private void a(int paramInt1, int paramInt2, Canvas paramCanvas)
  {
    int j = 0;
    paramCanvas.save();
    this.j.setTextAlign(Paint.Align.RIGHT);
    this.j.setColor(this.f.getKlineRightPartColor());
    this.j.setTextSize(this.h);
    this.j.setStyle(Paint.Style.FILL);
    float f1 = this.j.getFontMetrics().ascent;
    this.j.getTextBounds("1234567890", 0, 10, this.s);
    int k = this.s.height();
    k = (getHeight() - 2 - paramInt1 - paramInt2 - k * 2) / 4;
    paramInt2 = paramInt1 + 1;
    paramInt1 = j;
    while (paramInt1 < 5)
    {
      j = (int)(this.d - (this.d - this.e) * paramInt1 / 4L);
      if (j < 0) {
        return;
      }
      paramCanvas.drawText(az.b(j, this.g.getmDecimalLen()), getWidth() - 1, paramInt2 - f1, this.j);
      paramInt2 += k;
      paramInt1 += 1;
    }
    paramCanvas.restore();
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    this.g = this.f.getDataModel();
    Object localObject2 = this.f.getDSignal();
    if (this.f.getKLinePeriodValue() != 7)
    {
      paramCanvas = getResources().getString(2131166020);
      localObject1 = this.f;
      paramInt1 = this.f.getAvgsColors()[0];
      ((KChartContainer)localObject1).a(new String[][] { { "", paramCanvas } }, new int[] { paramInt1 });
    }
    while ((localObject2 == null) || (this.g.getKDDX() == null)) {
      return;
    }
    Object localObject1 = localObject2;
    if (localObject2.length < this.g.getKData().length) {
      localObject1 = com.android.dazhihui.d.n.a((int[][])localObject2, this.g.getKData().length);
    }
    paramCanvas.save();
    paramCanvas.clipRect(paramInt1, paramInt2, getWidth() - paramInt3, getHeight() - paramInt4);
    int k = this.g.getKLineOffset();
    int m = this.f.getKLineWidth();
    int i1 = getHeight() - paramInt2 - paramInt4;
    paramInt4 = Math.max(k, 19);
    if ((paramInt4 <= localObject1.length) && (paramInt4 >= 0))
    {
      this.F.reset();
      this.G.reset();
      if (paramInt4 < localObject1.length)
      {
        if ((localObject1[paramInt4][0] == 0) && (localObject1[paramInt4][1] == 0)) {}
        for (;;)
        {
          paramInt4 += 1;
          break;
          int j = this.f.getDefaultKLineWidth();
          paramInt3 = (int)this.i;
          if (m <= j - 3) {}
          int i2;
          for (;;)
          {
            this.j.setTextSize(paramInt3);
            this.j.setTextAlign(Paint.Align.CENTER);
            this.j.setStrokeWidth(this.o * 2.0F);
            this.j.setStyle(Paint.Style.FILL);
            i2 = (paramInt4 - k) * m + paramInt1 + (m - 1) / 2;
            if ((localObject1[paramInt4][0] != 1) || (localObject1[(paramInt4 - 1)][0] != 0)) {
              break label701;
            }
            f1 = (paramInt4 - k) * m + paramInt1 + m / 2;
            j = a(localObject1[paramInt4][2] - this.e, this.d - this.e, paramInt2, i1);
            this.F.moveTo(f1, j);
            localObject3 = this.g.getKData();
            localObject2 = new int[4];
            j = 0;
            while (j < 4)
            {
              localObject2[j] = a(localObject3[paramInt4][(j + 1)] - this.e, this.d - this.e, paramInt2, i1);
              j += 1;
            }
            if (m == j) {
              paramInt3 += 4;
            } else if (m <= j + 4) {
              paramInt3 += 8;
            } else if (m <= j + 12) {
              paramInt3 += 14;
            } else {
              paramInt3 += 18;
            }
          }
          localObject3 = new Rect(i2 - paramInt3 / 2, localObject2[2] + (int)this.o, paramInt3 / 2 + i2, localObject2[2] + (int)this.o + paramInt3);
          paramCanvas.drawBitmap(this.D, null, (Rect)localObject3, this.j);
          this.j.setTypeface(Typeface.DEFAULT_BOLD);
          this.j.setColor(this.C);
          paramCanvas.drawText("D", i2, localObject2[2] - this.j.getFontMetrics().ascent + paramInt3 + this.o, this.j);
          this.j.setTypeface(Typeface.DEFAULT);
          continue;
          label701:
          if ((localObject1[paramInt4][0] == 1) && (paramInt4 + 1 < localObject1.length) && (localObject1[(paramInt4 + 1)][0] == 0))
          {
            localObject2 = this.g.getKData();
            localObject3 = new int[4];
            j = 0;
            while (j < 4)
            {
              localObject3[j] = a(localObject2[paramInt4][(j + 1)] - this.e, this.d - this.e, paramInt2, i1);
              j += 1;
            }
            localObject2 = new Rect(i2 - paramInt3 / 2, localObject3[1] - paramInt3 - (int)this.o, paramInt3 / 2 + i2, localObject3[1] - (int)this.o);
            paramCanvas.drawBitmap(this.E, null, (Rect)localObject2, this.j);
          }
          float f1 = (paramInt4 - k) * m + paramInt1 + m / 2;
          paramInt3 = a(localObject1[paramInt4][2] - this.e, this.d - this.e, paramInt2, i1);
          j = a(localObject1[paramInt4][3] - this.e, this.d - this.e, paramInt2, i1);
          if (localObject1[paramInt4][2] > 0) {
            this.F.lineTo(f1, paramInt3);
          }
          if (localObject1[paramInt4][3] > 0) {
            if ((localObject1[(paramInt4 - 2)][0] == 0) && (localObject1[(paramInt4 - 1)][0] == 1)) {
              this.G.moveTo(f1, j);
            } else if (localObject1[(paramInt4 - 2)][0] == 1) {
              this.G.lineTo(f1, j);
            }
          }
        }
      }
      this.j.setAntiAlias(true);
      this.j.setStyle(Paint.Style.STROKE);
      this.j.setColor(this.B[0]);
      paramCanvas.drawPath(this.F, this.j);
      this.j.setColor(this.B[1]);
      paramCanvas.drawPath(this.G, this.j);
    }
    paramCanvas.restore();
    paramInt2 = this.f.getScreenIndex();
    paramInt1 = localObject1.length - 1;
    if (paramInt2 != -1) {
      paramInt1 = paramInt2 + k;
    }
    paramInt2 = paramInt1;
    if (paramInt1 > localObject1.length - 1) {
      paramInt2 = localObject1.length - 1;
    }
    if (localObject1[paramInt2][0] == 1)
    {
      paramCanvas = new String[] { "突破价:", az.b(localObject1[paramInt2][2], this.g.getmDecimalLen()) };
      localObject3 = new String[] { "止损价:", az.b(localObject1[paramInt2][3], this.g.getmDecimalLen()) };
      localObject1 = this.f;
      localObject2 = this.B;
      ((KChartContainer)localObject1).a(new String[][] { paramCanvas, localObject3 }, (int[])localObject2);
      return;
    }
    localObject2 = new String[] { "突破价:", "--" };
    Object localObject3 = { "止损价:", "--" };
    paramCanvas = this.f;
    localObject1 = this.B;
    paramCanvas.a(new String[][] { localObject2, localObject3 }, (int[])localObject1);
  }
  
  private void b(y paramy)
  {
    if (this.B == null) {
      this.B = new int[2];
    }
    if (paramy == y.b)
    {
      this.w = 34816;
      this.x = -13070532;
      this.y = 34816;
      this.z = -6642515;
      this.A = -6642515;
      this.B[0] = -3129345;
      this.B[1] = -12686651;
      this.C = -65536;
      this.D = BitmapFactory.decodeResource(getResources(), 2130838260);
      this.E = BitmapFactory.decodeResource(getResources(), 2130838262);
      this.v = -986891;
      return;
    }
    this.w = -409087;
    this.x = -16711936;
    this.y = -409087;
    this.z = -65281;
    this.A = -8947849;
    this.B[0] = -409087;
    this.B[1] = -829460;
    this.C = 64841;
    this.D = BitmapFactory.decodeResource(getResources(), 2130838259);
    this.E = BitmapFactory.decodeResource(getResources(), 2130838261);
    this.v = -14143429;
  }
  
  private void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    if (!d.a().b()) {}
    int j;
    int i1;
    int i2;
    int i3;
    int[][] arrayOfInt;
    int[] arrayOfInt1;
    long[][] arrayOfLong;
    int[] arrayOfInt2;
    int i4;
    do
    {
      return;
      j = this.f.getIndexModel();
      this.g = this.f.getDataModel();
      i1 = this.f.getKLineSize();
      i2 = this.g.getKLineOffset();
      i3 = this.f.getKLineWidth();
      arrayOfInt = this.g.getKData();
      arrayOfInt1 = this.f.getMAs();
      arrayOfLong = this.f.getAvgPrice();
      arrayOfInt2 = this.f.getAvgsColors();
      i4 = getHeight() - paramInt2 - paramInt4;
    } while ((j == 7) || (d.a().f()) || (arrayOfLong == null));
    paramCanvas.save();
    paramCanvas.clipRect(paramInt1, paramInt2, getWidth() - paramInt3, getHeight() - paramInt4);
    paramInt3 = 0;
    if (paramInt3 < arrayOfInt1.length) {
      if (arrayOfInt.length >= arrayOfInt1[paramInt3]) {}
    }
    for (;;)
    {
      paramInt3 += 1;
      break;
      this.j.setColor(arrayOfInt2[paramInt3]);
      int k = Math.max(i2, arrayOfInt1[paramInt3] - 1);
      if (k >= arrayOfLong.length)
      {
        paramCanvas.restore();
        return;
      }
      float f1 = (k - i2) * i3 + i3 / 2 + paramInt1;
      j = a(arrayOfLong[k][paramInt3] - this.e * 10L, 10L * (this.d - this.e), paramInt2, i4);
      if (i1 + i2 > arrayOfInt.length) {
        paramInt4 = arrayOfInt.length;
      }
      while (k < paramInt4)
      {
        float f2 = (k - i2) * i3 + i3 / 2 + paramInt1;
        int m = a(arrayOfLong[k][paramInt3] - this.e * 10L, (this.d - this.e) * 10L, paramInt2, i4);
        if (arrayOfLong[k][paramInt3] > 0L) {
          paramCanvas.drawLine(f1, j, f2, m, this.j);
        }
        k += 1;
        f1 = f2;
        j = m;
        continue;
        paramInt4 = i1 + i2;
      }
    }
  }
  
  private void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    this.g = this.f.getDataModel();
    Object localObject;
    if (d.a().c())
    {
      localObject = this.g;
      if (StockVo.getExRights() != 2) {
        break label34;
      }
    }
    label34:
    int k;
    int m;
    do
    {
      return;
      k = this.g.getKLineOffset();
      m = this.f.getKLineWidth();
      localObject = this.g.getQK();
    } while (localObject == null);
    int i1 = getHeight() - paramInt2 - paramInt4;
    paramCanvas.save();
    paramCanvas.clipRect(paramInt1, paramInt2, getWidth() - paramInt3, getHeight() - paramInt4);
    paramInt4 = 0;
    if (paramInt4 < localObject.length) {
      if (paramInt4 - k <= 0) {
        break label268;
      }
    }
    label268:
    for (int j = (paramInt4 - k) * m + paramInt1;; j = paramInt1)
    {
      if (localObject[paramInt4][0] != 0)
      {
        this.j.setColor(this.v);
        this.j.setStyle(Paint.Style.FILL);
        paramCanvas.drawRect(j, a(localObject[paramInt4][1] + localObject[paramInt4][2] - this.e, this.d - this.e, paramInt2, i1), getWidth() - paramInt3, a(localObject[paramInt4][1] - this.e, this.d - this.e, paramInt2, i1), this.j);
      }
      paramInt4 += 1;
      break;
      paramCanvas.restore();
      return;
    }
  }
  
  private void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    paramCanvas.save();
    int i2 = getWidth() - paramInt1 - paramInt3;
    int i3 = getHeight() - paramInt2 - paramInt4;
    int j = this.f.getKLineSize();
    int i1 = this.g.getKLineOffset();
    Object localObject = this.f.getDDEModel();
    int[][] arrayOfInt2 = this.g.getBsTag();
    int[][] arrayOfInt3 = this.g.getKData();
    int i4 = this.f.getKLineWidth();
    int[] arrayOfInt4 = this.g.getExRightsId();
    int i5 = StockVo.getExRights();
    float f3 = i4 - this.o;
    if (f3 < this.o) {
      f3 = this.o;
    }
    for (;;)
    {
      float f4 = f3 / 2.0F;
      int i6 = this.f.getDefaultKLineWidth();
      paramCanvas.clipRect(paramInt1, paramInt2, getWidth() - paramInt3, getHeight() - paramInt4);
      int[][] arrayOfInt1;
      label219:
      int i7;
      if (j + i1 > arrayOfInt3.length)
      {
        paramInt4 = arrayOfInt3.length;
        arrayOfInt1 = (int[][])Array.newInstance(Integer.TYPE, new int[] { 2, 3 });
        paramInt3 = (int)this.i;
        if (i4 > i6 - 3) {
          break label408;
        }
        this.j.setTextSize(paramInt3);
        this.j.setTextAlign(Paint.Align.CENTER);
        j = i1;
        if (j >= paramInt4) {
          break label1848;
        }
        i7 = (j - i1) * i4 + paramInt1;
        if (arrayOfInt3[j][1] >= arrayOfInt3[j][4]) {
          break label493;
        }
        paramInt3 = 1;
        label271:
        if ((j <= 0) || (arrayOfInt3[j][1] != arrayOfInt3[j][4])) {
          break label2400;
        }
        if (arrayOfInt3[j][4] < arrayOfInt3[(j - 1)][4]) {
          break label498;
        }
        paramInt3 = 1;
      }
      label314:
      label408:
      label493:
      label498:
      label768:
      label896:
      label1001:
      label1027:
      label1089:
      label1100:
      label1262:
      label1335:
      label1455:
      label1533:
      label1538:
      label1613:
      label1848:
      label2304:
      label2400:
      for (int k = paramInt3;; k = paramInt3)
      {
        if (k != 0) {}
        int[] arrayOfInt5;
        for (paramInt3 = this.f.getUpColor();; paramInt3 = this.f.getDownColor())
        {
          this.j.setColor(paramInt3);
          arrayOfInt5 = new int[4];
          m = 0;
          while (m < 4)
          {
            arrayOfInt5[m] = a(arrayOfInt3[j][(m + 1)] - this.e, this.d - this.e, paramInt2, i3);
            m += 1;
          }
          paramInt4 = j + i1;
          break;
          if (i4 == i6)
          {
            this.j.setTextSize(paramInt3 + 4);
            break label219;
          }
          if (i4 <= i6 + 4)
          {
            this.j.setTextSize(paramInt3 + 8);
            break label219;
          }
          if (i4 <= i6 + 12)
          {
            this.j.setTextSize(paramInt3 + 14);
            break label219;
          }
          this.j.setTextSize(paramInt3 + 18);
          break label219;
          paramInt3 = 0;
          break label271;
          paramInt3 = 0;
          break label314;
        }
        if (arrayOfInt3[j][1] != 0)
        {
          if (i4 > i6 - 3) {
            break label768;
          }
          f1 = this.n;
        }
        for (;;)
        {
          this.j.setStrokeWidth(f1);
          paramCanvas.drawLine(i7 + f4, arrayOfInt5[0], i7 + f4, arrayOfInt5[2], this.j);
          paramCanvas.drawLine(i7 + f4, arrayOfInt5[1], i7 + f4, arrayOfInt5[3], this.j);
          f1 = this.o;
          this.j.setStrokeWidth(f1);
          if ((arrayOfInt1[0][0] == 0) || (arrayOfInt1[0][0] >= arrayOfInt3[j][3]))
          {
            arrayOfInt1[0][0] = arrayOfInt3[j][3];
            arrayOfInt1[0][1] = ((int)(i7 + f4));
            arrayOfInt1[0][2] = arrayOfInt5[2];
          }
          if ((arrayOfInt1[1][0] == 0) || (arrayOfInt1[1][0] <= arrayOfInt3[j][2]))
          {
            arrayOfInt1[1][0] = arrayOfInt3[j][2];
            arrayOfInt1[1][1] = ((int)(i7 + f4));
            arrayOfInt1[1][2] = arrayOfInt5[1];
          }
          if (k == 0) {
            break label1335;
          }
          if (arrayOfInt3[j][1] != 0) {
            break;
          }
          paramCanvas.restore();
          return;
          if (i4 <= i6 + 4) {
            f1 = this.o;
          } else if (i4 <= i6 + 8) {
            f1 = this.p;
          } else if (i4 == i6 + 10) {
            f1 = this.q;
          } else {
            f1 = this.r;
          }
        }
        int m = arrayOfInt5[0] - arrayOfInt5[3];
        k = m;
        if (m == 0) {
          k = 1;
        }
        this.j.setColor(paramInt3);
        float f1 = 0.0F;
        float f2 = 0.0F;
        if (f3 <= this.o)
        {
          f1 = 0.0F;
          this.j.setStyle(Paint.Style.FILL);
          f2 = 0.0F;
          paramCanvas.drawRect(i7 + f1, arrayOfInt5[3], i7 + f3 - f2, k + arrayOfInt5[3], this.j);
          this.j.setStyle(Paint.Style.FILL);
          if (localObject != n.e) {
            break label1100;
          }
          if ((arrayOfInt2 != null) && (j < arrayOfInt2.length)) {
            break label1001;
          }
        }
        for (;;)
        {
          j += 1;
          break;
          if (f3 - 1.0F > 0.0F)
          {
            f1 = 1.0F;
            f2 = 1.0F;
          }
          this.j.setStyle(Paint.Style.STROKE);
          break label896;
          this.j.setTypeface(Typeface.DEFAULT_BOLD);
          if (j > 0)
          {
            paramInt3 = arrayOfInt2[(j - 1)][0];
            if ((arrayOfInt2[j][0] != 1) || (paramInt3 != 0)) {
              break label1262;
            }
            this.j.setColor(this.w);
            paramCanvas.drawText("B", i7 + f3 / 2.0F, arrayOfInt5[2] - this.j.getFontMetrics().ascent, this.j);
            this.j.setTypeface(Typeface.DEFAULT);
          }
          for (;;)
          {
            if ((arrayOfInt4 != null) && (j < arrayOfInt4.length) && (arrayOfInt4[j] == 1))
            {
              paramInt3 = i6 + 5;
              k = (paramInt3 >> 1) + i7;
              m = i3 + 1 + paramInt2;
              this.t.reset();
              if (i5 != 2) {
                break label1613;
              }
              this.j.setColor(this.A);
              this.j.setStyle(Paint.Style.FILL);
              this.t.moveTo(k, m - paramInt3);
              this.t.lineTo(k - (paramInt3 >> 1), m);
              this.t.lineTo((paramInt3 >> 1) + k, m);
              this.t.lineTo(k, m - paramInt3);
              paramCanvas.drawPath(this.t, this.j);
              break;
              paramInt3 = -1;
              break label1027;
              if ((arrayOfInt2[j][0] != 0) || (paramInt3 != 1)) {
                break label1089;
              }
              this.j.setColor(this.x);
              paramCanvas.drawText("S", i7 + f3 / 2.0F, arrayOfInt5[1] - this.j.getTextSize() - this.j.getFontMetrics().ascent, this.j);
              break label1089;
              if (arrayOfInt3[j][1] == 0)
              {
                paramCanvas.restore();
                return;
              }
              this.j.setColor(paramInt3);
              this.j.setStyle(Paint.Style.FILL);
              paramCanvas.drawRect(i7, arrayOfInt5[0], i7 + f3, arrayOfInt5[3] + 1, this.j);
              if ((localObject == n.e) && (!d.a().f()))
              {
                if ((arrayOfInt2 == null) || (j >= arrayOfInt2.length)) {
                  break;
                }
                this.j.setTypeface(Typeface.DEFAULT_BOLD);
                if (j <= 0) {
                  break label1533;
                }
                paramInt3 = arrayOfInt2[(j - 1)][0];
                if ((arrayOfInt2[j][0] != 1) || (paramInt3 != 0)) {
                  break label1538;
                }
                this.j.setColor(this.w);
                paramCanvas.drawText("B", (i4 - 1 >> 1) + i7, arrayOfInt5[2] - this.j.getFontMetrics().ascent, this.j);
              }
            }
          }
          for (;;)
          {
            this.j.setTypeface(Typeface.DEFAULT);
            break label1100;
            break;
            paramInt3 = -1;
            break label1455;
            if ((arrayOfInt2[j][0] == 0) && (paramInt3 == 1))
            {
              this.j.setColor(this.x);
              paramCanvas.drawText("S", (i4 - 1 >> 1) + i7, arrayOfInt5[1] - this.j.getTextSize() - this.j.getFontMetrics().ascent, this.j);
            }
          }
          if (i5 == 0)
          {
            this.j.setColor(this.z);
            this.j.setStyle(Paint.Style.FILL);
            this.t.moveTo(k - (paramInt3 >> 1), m - (paramInt3 >> 1));
            this.t.lineTo((paramInt3 >> 1) + k, m - paramInt3);
            this.t.lineTo((paramInt3 >> 1) + k, m);
            this.t.lineTo(k - (paramInt3 >> 1), m - (paramInt3 >> 1));
            paramCanvas.drawPath(this.t, this.j);
          }
          else
          {
            this.j.setColor(this.z);
            this.j.setStyle(Paint.Style.FILL);
            this.t.moveTo((paramInt3 >> 1) + k, m - (paramInt3 >> 1));
            this.t.lineTo(k - (paramInt3 >> 1), m - paramInt3);
            this.t.lineTo(k - (paramInt3 >> 1), m);
            this.t.lineTo(k + (paramInt3 >> 1), m - (paramInt3 >> 1));
            paramCanvas.drawPath(this.t, this.j);
          }
        }
        this.j.setStyle(Paint.Style.FILL);
        paramInt1 = (int)getResources().getDimension(2131230788);
        localObject = az.b(arrayOfInt1[0][0], this.g.getmDecimalLen());
        this.j.setTextSize(this.h);
        this.j.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.s);
        paramInt2 = this.s.width();
        this.j.setColor(this.y);
        paramInt3 = this.h;
        if (paramInt2 + paramInt1 + arrayOfInt1[0][1] < i2)
        {
          paramCanvas.drawLine(arrayOfInt1[0][1], arrayOfInt1[0][2], arrayOfInt1[0][1] + paramInt1, arrayOfInt1[0][2] - paramInt3 / 2, this.j);
          this.j.setTextAlign(Paint.Align.LEFT);
          paramCanvas.drawText((String)localObject, arrayOfInt1[0][1] + paramInt1, arrayOfInt1[0][2] - paramInt3 - this.j.getFontMetrics().ascent, this.j);
          localObject = az.b(arrayOfInt1[1][0], this.g.getmDecimalLen());
          this.j.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.s);
          if (this.s.width() + paramInt1 + arrayOfInt1[1][1] >= i2) {
            break label2304;
          }
          paramCanvas.drawLine(arrayOfInt1[1][1], arrayOfInt1[1][2], arrayOfInt1[1][1] + paramInt1, arrayOfInt1[1][2] + paramInt3 / 2, this.j);
          this.j.setTextAlign(Paint.Align.LEFT);
          paramCanvas.drawText((String)localObject, arrayOfInt1[1][1] + paramInt1, arrayOfInt1[1][2] + 1 - this.j.getFontMetrics().ascent, this.j);
        }
        for (;;)
        {
          paramCanvas.restore();
          return;
          paramCanvas.drawLine(arrayOfInt1[0][1], arrayOfInt1[0][2], arrayOfInt1[0][1] - paramInt1, arrayOfInt1[0][2] - paramInt3 / 2, this.j);
          this.j.setTextAlign(Paint.Align.RIGHT);
          paramCanvas.drawText((String)localObject, arrayOfInt1[0][1] - paramInt1, arrayOfInt1[0][2] - paramInt3 - this.j.getFontMetrics().ascent, this.j);
          break;
          paramCanvas.drawLine(arrayOfInt1[1][1], arrayOfInt1[1][2], arrayOfInt1[1][1] - paramInt1, arrayOfInt1[1][2] + paramInt3 / 2, this.j);
          this.j.setTextAlign(Paint.Align.RIGHT);
          paramCanvas.drawText((String)localObject, arrayOfInt1[1][1] - paramInt1, arrayOfInt1[1][2] + 1 - this.j.getFontMetrics().ascent, this.j);
        }
      }
    }
  }
  
  protected void a()
  {
    super.a();
    b(g.a().b());
    this.a = getResources().getDimensionPixelSize(2131230799);
    this.b = getResources().getDimensionPixelSize(2131230829);
    this.c = getResources().getDimensionPixelSize(2131230845);
    this.h = getResources().getDimensionPixelSize(2131231088);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.i = TypedValue.applyDimension(1, 6.0F, localDisplayMetrics);
    this.n = TypedValue.applyDimension(1, 1.0F, localDisplayMetrics);
    this.o = TypedValue.applyDimension(1, 1.0F, localDisplayMetrics);
    this.p = TypedValue.applyDimension(1, 1.2F, localDisplayMetrics);
    this.q = TypedValue.applyDimension(1, 1.4F, localDisplayMetrics);
    this.r = TypedValue.applyDimension(1, 1.6F, localDisplayMetrics);
  }
  
  protected void a(Canvas paramCanvas)
  {
    int m = getWidth();
    int j = getHeight();
    int i1 = getPaddingTop();
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    int k = getPaddingBottom();
    paramCanvas.save();
    this.j.setColor(this.k);
    this.j.setStyle(Paint.Style.STROKE);
    float f1 = this.j.getStrokeWidth();
    this.j.setStrokeWidth(getResources().getDimensionPixelSize(2131230773));
    int i4;
    if (getResources().getConfiguration().orientation == 1)
    {
      paramCanvas.drawLine(i2, j - k, m - i3, j - k, this.j);
      i4 = (j - this.a - this.b - i1 - k) / 4;
      j = 1;
    }
    for (;;)
    {
      if (j > 3) {
        break label259;
      }
      int i5 = this.a + i1 + i4 * j;
      k = i2 + 6;
      for (;;)
      {
        if (k < m - i3 - this.c)
        {
          paramCanvas.drawLine(k, i5, k + 1, i5, this.j);
          k += 6;
          continue;
          paramCanvas.drawRect(i2, i1, m - i3, j - k, this.j);
          break;
        }
      }
      j += 1;
    }
    label259:
    this.j.setStrokeWidth(f1);
    paramCanvas.restore();
  }
  
  public void a(y paramy)
  {
    b(paramy);
    a(getWidth(), getHeight());
    postInvalidate();
  }
  
  public void b()
  {
    a(this.u);
  }
  
  public void c()
  {
    this.d = -2147483648L;
    this.e = 2147483647L;
    this.g = this.f.getDataModel();
    if (this.g == null) {}
    int j;
    int k;
    int[][] arrayOfInt1;
    do
    {
      return;
      j = this.f.getKLineSize();
      k = this.g.getKLineOffset();
      arrayOfInt1 = this.g.getKData();
    } while (arrayOfInt1 == null);
    int i1 = this.f.getIndexModel();
    int[][] arrayOfInt2;
    if (j + k > arrayOfInt1.length)
    {
      j = arrayOfInt1.length;
      arrayOfInt2 = this.f.getBoll();
    }
    for (;;)
    {
      if (k >= j) {
        break label301;
      }
      if (arrayOfInt1[k][2] > this.d) {
        this.d = arrayOfInt1[k][2];
      }
      if (arrayOfInt1[k][3] < this.e) {
        this.e = arrayOfInt1[k][3];
      }
      if (arrayOfInt1[k][2] == 0) {
        arrayOfInt1[k][2] = arrayOfInt1[k][4];
      }
      if ((i1 == 7) && (arrayOfInt2 != null) && (k < arrayOfInt2.length))
      {
        int m = 0;
        for (;;)
        {
          if (m < 3)
          {
            if (this.d < arrayOfInt2[k][m] / 10) {
              this.d = (arrayOfInt2[k][m] / 10);
            }
            if ((this.e > arrayOfInt2[k][m] / 10) && (arrayOfInt2[k][m] != 0)) {
              this.e = (arrayOfInt2[k][m] / 10);
            }
            m += 1;
            continue;
            j += k;
            break;
          }
        }
      }
      k += 1;
    }
    label301:
    if (this.d - this.e < 4L) {
      this.e = (this.d - 4L);
    }
    this.g.setKChartStockDrawMaxMin((int)this.d, (int)this.e);
    invalidate();
  }
  
  public long getMaxValue()
  {
    return this.d;
  }
  
  public long getMinValue()
  {
    return this.e;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    this.g = this.f.getDataModel();
    int k;
    int m;
    int i1;
    int j;
    if (this.g != null)
    {
      int[][] arrayOfInt = this.g.getKData();
      if ((arrayOfInt != null) && (arrayOfInt.length > 0))
      {
        k = getWidth();
        m = getHeight();
        i1 = getPaddingTop();
        j = getPaddingLeft();
        paramCanvas.clipRect(j, i1, k - getPaddingRight(), m - getPaddingBottom());
        k = getPaddingTop();
        k = this.a + k;
        m = getPaddingRight();
        m = this.c + m;
        i1 = getPaddingBottom();
        i1 = this.b + i1;
        a(k, i1, paramCanvas);
        e(j, k, m, i1, paramCanvas);
        d(j, k, m, i1, paramCanvas);
        if (this.f.getIndexModel() != 7) {
          break label197;
        }
        a(j, k, m, i1, paramCanvas);
      }
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      label197:
      if ((d.a().f()) && (this.f.getDDEModel() != n.e)) {
        b(j, k, m, i1, paramCanvas);
      } else {
        c(j, k, m, i1, paramCanvas);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.u = ((int)paramMotionEvent.getX());
    if (this.f.getDisplayModel() == m.a) {
      return super.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      a(this.u);
      return true;
      getParent().requestDisallowInterceptTouchEvent(true);
      removeCallbacks(this.H);
      continue;
      postDelayed(this.H, 1500L);
    }
  }
  
  public void setAverageViewHeight(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void setHolder(KChartContainer paramKChartContainer)
  {
    this.f = paramKChartContainer;
  }
  
  public void setRightDistance(int paramInt)
  {
    this.c = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\KChartLineView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */