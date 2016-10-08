package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import com.android.dazhihui.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import java.lang.reflect.Array;

public class MinChartTreadPrice
  extends MinStockChartBaseView
{
  private Paint A = new Paint(1);
  private Path B = new Path();
  private Paint C = new Paint(1);
  private y D;
  private Bitmap E;
  private Bitmap F;
  private int G;
  private int[] f;
  private int[] g;
  private int[] h;
  private int i;
  private int n;
  private Path o = new Path();
  private Path p = new Path();
  private int q;
  private Rect r = new Rect();
  private boolean s = true;
  private int t;
  private int u;
  private float v;
  private int w;
  private int x;
  private int y;
  private int z = 842951365;
  
  public MinChartTreadPrice(Context paramContext)
  {
    super(paramContext);
  }
  
  public MinChartTreadPrice(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MinChartTreadPrice(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private float b(int paramInt1, int paramInt2)
  {
    float f1 = 0.0F;
    int k = getHeight();
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
  
  private int b(int paramInt)
  {
    int j = getHeight();
    return (j - 1 >> 1) + 1 - ((j >> 2) - 2) * paramInt / 120;
  }
  
  protected void a()
  {
    super.a();
    a(g.a().b());
    this.q = getResources().getDimensionPixelSize(2131231088);
    this.v = getResources().getDimension(2131230860);
    this.E = BitmapFactory.decodeResource(getResources(), 2130838411);
    this.F = BitmapFactory.decodeResource(getResources(), 2130838424);
    this.G = getResources().getDimensionPixelOffset(2131230774);
    if (g.a().m() >= 1080)
    {
      this.v = 4.0F;
      if (g.a().b() != y.b) {
        this.v = 3.2F;
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          if (g.a().m() < 720) {
            break;
          }
          this.v = 2.6F;
        } while (g.a().b() == y.b);
        this.v = 2.2F;
        return;
      } while (g.a().m() == 0);
      this.v = 1.7F;
    } while (g.a().b() == y.b);
    this.v = 1.55F;
  }
  
  protected void a(Canvas paramCanvas)
  {
    int k = getPaddingLeft();
    getWidth();
    int j;
    int i1;
    int m;
    int i2;
    int i3;
    int i4;
    int i5;
    float f1;
    int i6;
    int i7;
    if (this.l != 1)
    {
      j = getWidth();
      i1 = this.m;
      k = getPaddingLeft();
      m = this.m;
      this.s = false;
      j -= i1;
      k += m;
      i2 = getHeight();
      i3 = getPaddingTop();
      i4 = getPaddingRight();
      i5 = getPaddingBottom();
      paramCanvas.save();
      this.j.setColor(this.k);
      this.j.setStyle(Paint.Style.STROKE);
      f1 = this.j.getStrokeWidth();
      this.j.setStrokeWidth(getResources().getDimensionPixelSize(2131230773));
      if (this.l != 1) {
        paramCanvas.drawRect(k, i3, j - i4, i2 - i5, this.j);
      }
      i6 = (j - k - i4) / 4;
      i7 = (i2 - i3 - i5) / 4;
      this.j.setStyle(Paint.Style.FILL);
      m = 0;
    }
    for (;;)
    {
      if (m >= 3) {
        break label431;
      }
      this.j.setStrokeWidth(f1);
      if (m == 1)
      {
        this.j.setStrokeWidth(2.0F * f1 / 3.0F);
        paramCanvas.drawLine(k, i7 * 2 + i3, j - i4, i7 * 2 + i3, this.j);
      }
      for (;;)
      {
        int i8 = k + (m + 1) * i6;
        i1 = i3 + 6;
        while (i1 < i2 - i5)
        {
          paramCanvas.drawLine(i8, i1, i8, i1 + 1, this.j);
          i1 += 9;
        }
        j = getWidth();
        this.u = getPaddingLeft();
        if (this.u == 0) {
          this.u = 1;
        }
        this.s = true;
        break;
        i8 = i3 + (m + 1) * i7;
        i1 = k + 6;
        while (i1 < j - i4)
        {
          paramCanvas.drawLine(i1, i8, i1 + 1, i8, this.j);
          i1 += 6;
        }
      }
      m += 1;
    }
    label431:
    this.j.setStrokeWidth(f1);
    paramCanvas.restore();
  }
  
  public void a(y paramy)
  {
    this.D = paramy;
    if (paramy == y.a)
    {
      this.k = getResources().getColor(2131493296);
      this.y = getResources().getColor(2131493677);
      this.w = getResources().getColor(2131493304);
      this.x = getResources().getColor(2131493318);
      if (g.a().m() < 1080) {
        break label172;
      }
      this.v = 4.0F;
      if (g.a().b() != y.b) {
        this.v = 3.6F;
      }
    }
    for (;;)
    {
      a(getWidth(), getHeight());
      postInvalidate();
      return;
      this.y = getResources().getColor(2131493342);
      this.w = getResources().getColor(2131493332);
      this.x = getResources().getColor(2131493346);
      this.k = getResources().getColor(2131493297);
      break;
      label172:
      if (g.a().m() >= 720)
      {
        this.v = 2.6F;
        if (g.a().b() != y.b) {
          this.v = 2.2F;
        }
      }
      else if (g.a().m() != 0)
      {
        this.v = 1.7F;
        if (g.a().b() != y.b) {
          this.v = 1.55F;
        }
      }
    }
  }
  
  public int[][] a(int paramInt)
  {
    int[][] arrayOfInt2 = (int[][])null;
    this.b = this.a.getDataModel();
    int[][] arrayOfInt1 = arrayOfInt2;
    if (this.b != null)
    {
      arrayOfInt1 = arrayOfInt2;
      if (this.b.getMinData() != null)
      {
        arrayOfInt1 = this.b.getMinData();
        this.h = this.b.getTradeVolum();
        int j = this.b.getCp();
        arrayOfInt2 = (int[][])Array.newInstance(Integer.TYPE, new int[] { 5, 2 });
        arrayOfInt2[0][0] = arrayOfInt1[paramInt][0];
        arrayOfInt2[0][1] = '＀';
        arrayOfInt2[1][0] = this.g[paramInt];
        arrayOfInt2[1][1] = az.e(this.g[paramInt], j);
        arrayOfInt2[2][0] = this.g[paramInt];
        arrayOfInt2[2][1] = az.e(this.g[paramInt], j);
        arrayOfInt2[3][0] = this.f[paramInt];
        arrayOfInt2[3][1] = az.e(this.f[paramInt], j);
        arrayOfInt2[4][0] = this.h[paramInt];
        arrayOfInt2[4][1] = '＀';
        arrayOfInt1 = arrayOfInt2;
        if (this.D == y.b)
        {
          arrayOfInt2[0][1] = -14540254;
          arrayOfInt2[4][1] = -14540254;
          arrayOfInt1 = arrayOfInt2;
        }
      }
    }
    return arrayOfInt1;
  }
  
  public int[] getCurrentPrices()
  {
    return this.g;
  }
  
  public int getMaxPrice()
  {
    return this.i;
  }
  
  public int getMinPrice()
  {
    return this.n;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a == null) {}
    do
    {
      return;
      this.b = this.a.getDataModel();
    } while ((this.b == null) || (this.b.getMinData() == null) || (this.b.getCp() == 0));
    this.g = this.b.getCurrentData();
    this.f = this.b.getmAveragePrice();
    this.i = this.b.getMinChartMaxShowPrice();
    this.n = this.b.getMinChartMinShowPrice();
    this.h = this.b.getTradeVolum();
    paramCanvas.save();
    label150:
    int i1;
    int i2;
    label331:
    float f2;
    float f3;
    if (this.l != 1)
    {
      this.t = (getWidth() - this.m);
      this.u = (getPaddingLeft() + this.m);
      this.s = false;
      if ((this.b == null) || (this.g == null)) {
        break label597;
      }
      this.o.reset();
      this.p.reset();
      this.B.reset();
      i1 = getHeight();
      this.A.setShader(new LinearGradient(this.u, i1 - 1, this.u, 1.0F, this.z, this.z, Shader.TileMode.MIRROR));
      this.B.moveTo(this.u, i1 - 1);
      i2 = this.i - this.n;
      b(this.g[0] - this.n, i2);
      f1 = b(this.g[0] - this.n, i2);
      this.B.lineTo(this.u, f1);
      m = this.b.getMinLength();
      i3 = this.b.getType();
      j = 0;
      if (j >= m) {
        break label636;
      }
      f1 = this.u;
      f1 = (this.t - 2 - this.u) * 1.0F * j / this.b.getMinTotalPoint() + f1;
      f2 = b(this.g[j] - this.n, i2);
      f3 = b(this.f[j] - this.n, i2);
      if (j != 0) {
        break label599;
      }
      this.o.moveTo(f1, f2);
      this.p.moveTo(f1, f3);
    }
    int i4;
    for (;;)
    {
      localObject1 = this.b.getHsZdNum();
      if ((i3 == 0) && (localObject1 != null) && (localObject1.length > 0) && (j < localObject1.length))
      {
        i4 = b(localObject1[j]);
        k = -65279;
        if (localObject1[j] < 0) {
          k = -11753177;
        }
        this.j.setColor(k);
        paramCanvas.drawLine(f1, i4, f1, (getHeight() - 1) / 2 + 1, this.j);
      }
      if (j == m - 1) {
        this.B.lineTo(f1, i1 - 1);
      }
      j += 1;
      break label331;
      this.t = getWidth();
      this.u = getPaddingLeft();
      if (this.u == 0) {
        this.u = 1;
      }
      this.s = true;
      break label150;
      label597:
      break;
      label599:
      this.o.lineTo(f1, 2.0F + f2);
      this.p.lineTo(f1, f3 + 2.0F);
      this.B.lineTo(f1, f2 + 2.0F);
    }
    label636:
    float f1 = this.j.getStrokeWidth();
    this.j.setAntiAlias(true);
    this.j.setStyle(Paint.Style.STROKE);
    this.j.setStrokeWidth(this.v);
    this.j.setColor(this.w);
    paramCanvas.drawPath(this.p, this.j);
    this.j.setColor(this.x);
    paramCanvas.drawPath(this.o, this.j);
    this.j.setStrokeWidth(f1);
    this.j.setStyle(Paint.Style.FILL);
    this.j.setStrokeWidth(2.0F);
    if ((d.a().e()) && (n.i(i3, this.b.getMarketType())))
    {
      if (this.b.getFirstTpPosition() != 0)
      {
        f1 = this.u + (this.t - 2 - this.u) * 1.0F * this.b.getFirstTpPosition() / this.b.getMinTotalPoint();
        f2 = b(this.g[this.b.getFirstTpPosition()] - this.n, i2);
        this.C.setColor(getResources().getColor(2131493454));
        this.C.setStyle(Paint.Style.FILL);
        paramCanvas.drawCircle(f1, f2, 6.0F, this.C);
        j = (int)(f1 - this.E.getWidth() / 2);
        k = (int)(f2 + this.G / 2);
        m = (int)(f1 + this.E.getWidth() / 2);
        this.E.getHeight();
        paramCanvas.drawBitmap(this.E, j, k, this.C);
      }
      if (this.b.getSecondTpPositiom() != 0)
      {
        f1 = this.u + (this.t - 2 - this.u) * 1.0F * this.b.getSecondTpPositiom() / this.b.getMinTotalPoint();
        f2 = b(this.g[this.b.getSecondTpPositiom()] - this.n, i2);
        this.C.setColor(getResources().getColor(2131493455));
        this.C.setStyle(Paint.Style.FILL);
        paramCanvas.drawCircle(f1, f2, 6.0F, this.C);
        j = (int)(f1 - this.F.getWidth() / 2);
        k = (int)(f2 + this.G / 2);
        m = (int)(f1 + this.F.getWidth() / 2);
        this.F.getHeight();
        paramCanvas.drawBitmap(this.F, j, k, this.C);
      }
    }
    int j = this.n;
    int i3 = this.b.getCp();
    Object localObject2 = az.b(j, this.b.getmDecimalLen());
    f1 = Math.abs(j - i3) * 100.0F / i3;
    Object localObject1 = (int)(f1 * 10.0F) / 10.0D + "%";
    Object localObject3 = "-" + (String)localObject1;
    localObject1 = localObject2;
    if (this.b.getType() == 0) {
      localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - this.b.getmDecimalLen() - 1);
    }
    j = this.q;
    this.j.setTextSize(j);
    this.j.getTextBounds((String)localObject3, 0, ((String)localObject3).length(), this.r);
    int k = this.r.width();
    this.j.getTextBounds((String)localObject1, 0, ((String)localObject1).length(), this.r);
    int m = Math.max(k, this.r.width());
    k = j;
    if (!this.s)
    {
      k = j;
      if (this.u > 1) {
        for (;;)
        {
          k = j;
          if (this.u >= m) {
            break;
          }
          j -= 1;
          this.j.setTextSize(j);
          this.j.getTextBounds((String)localObject3, 0, ((String)localObject3).length(), this.r);
          k = this.r.width();
          this.j.getTextBounds((String)localObject1, 0, ((String)localObject1).length(), this.r);
          m = Math.max(k, this.r.width());
        }
      }
    }
    m = 0;
    if (m < 3)
    {
      j = this.i - i2 * m / 2;
      if (j < 0) {}
      for (;;)
      {
        m += 1;
        break;
        i4 = (i1 - k - 5) * m / 2 + 2;
        localObject3 = az.b(j, this.b.getmDecimalLen());
        f1 = Math.abs(j - i3) * 100.0F / i3;
        localObject2 = String.format("%.1f", new Object[] { Float.valueOf(f1) }) + "%";
        localObject1 = localObject2;
        if (m == 2) {
          localObject1 = "-" + (String)localObject2;
        }
        localObject2 = localObject3;
        if (this.b.getType() == 0) {
          localObject2 = ((String)localObject3).substring(0, ((String)localObject3).length() - this.b.getmDecimalLen() - 1);
        }
        localObject3 = this.j;
        if (m < 1) {
          j = -1099463;
        }
        for (;;)
        {
          ((Paint)localObject3).setColor(j);
          if (this.s) {
            break label1801;
          }
          this.j.setTextAlign(Paint.Align.RIGHT);
          paramCanvas.drawText((String)localObject2, this.u - 2, i4 - this.j.getFontMetrics().ascent, this.j);
          if (m == 1) {
            break;
          }
          this.j.setTextAlign(Paint.Align.LEFT);
          paramCanvas.drawText((String)localObject1, this.t - 2, i4 - this.j.getFontMetrics().ascent, this.j);
          break;
          if (m == 1) {
            j = this.y;
          } else {
            j = -11753177;
          }
        }
        label1801:
        this.j.setTextAlign(Paint.Align.LEFT);
        paramCanvas.drawText((String)localObject2, 2.0F, i4 - this.j.getFontMetrics().ascent, this.j);
        if (m != 1)
        {
          this.j.setTextAlign(Paint.Align.RIGHT);
          paramCanvas.drawText((String)localObject1, this.t - 2, i4 - this.j.getFontMetrics().ascent, this.j);
        }
      }
    }
    paramCanvas.restore();
  }
  
  public void setPortrait(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartTreadPrice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */