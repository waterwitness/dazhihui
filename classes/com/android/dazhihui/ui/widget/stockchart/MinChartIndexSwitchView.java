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
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import java.lang.reflect.Array;

public class MinChartIndexSwitchView
  extends MinStockChartBaseView
  implements View.OnClickListener
{
  private String A;
  private Rect B = new Rect();
  private boolean C = true;
  private int[] D;
  private int E;
  private int F = 0;
  private int G;
  private int H;
  private int I;
  private int J;
  private int K;
  private int L;
  private int M;
  private int N;
  private int[][] f;
  private int g;
  private int h;
  private int[] i;
  private int n;
  private int o;
  private int[][] p;
  private int q;
  private int r;
  private int[] s;
  private ak t = ak.a;
  private int u;
  private int v = -1;
  private String w;
  private String x;
  private String y;
  private String z;
  
  public MinChartIndexSwitchView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MinChartIndexSwitchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MinChartIndexSwitchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int a(int paramInt)
  {
    int j = getHeight();
    paramInt = (int)(paramInt * 1.0F / this.E * (j - 1));
    if (this.E == 0) {
      return j - 2;
    }
    return j + 1 - paramInt;
  }
  
  private int b(int paramInt)
  {
    int k = this.q - this.r;
    int j = k;
    if (k == 0) {
      j = 1;
    }
    k = this.r;
    return getHeight() - (int)((paramInt - k) * 1.0F / j * (getHeight() - this.u));
  }
  
  private int c(int paramInt)
  {
    int j = this.n + Math.abs(this.o);
    if (j == 0)
    {
      j = 1;
      if (paramInt >= 0) {
        break label57;
      }
    }
    label57:
    for (paramInt = Math.abs(paramInt) + this.n;; paramInt = this.n - paramInt)
    {
      int k = this.u;
      return paramInt * (getHeight() - this.u) / j + k;
      break;
    }
  }
  
  private int d(int paramInt)
  {
    int j = this.g + Math.abs(this.h);
    if (j == 0)
    {
      j = 1;
      if (paramInt >= 0) {
        break label57;
      }
    }
    label57:
    for (paramInt = Math.abs(paramInt) + this.g;; paramInt = this.g - paramInt)
    {
      int k = this.u;
      return paramInt * (getHeight() - this.u) / j + k;
      break;
    }
  }
  
  private String e(int paramInt)
  {
    String str = String.valueOf(paramInt);
    int j = str.length();
    StringBuffer localStringBuffer = new StringBuffer(str);
    if ((paramInt >= 10000) && (paramInt <= 1000000))
    {
      localStringBuffer.delete(j - 4, j);
      paramInt = localStringBuffer.length();
      localStringBuffer.append(".");
      localStringBuffer.append(str.substring(paramInt, paramInt + 2));
      return localStringBuffer.toString() + "万";
    }
    if ((paramInt > 1000000) && (paramInt <= 10000000))
    {
      localStringBuffer.delete(j - 4, j);
      paramInt = localStringBuffer.length();
      localStringBuffer.append(".");
      localStringBuffer.append(str.substring(paramInt, paramInt + 1));
      return localStringBuffer.toString() + "万";
    }
    if ((paramInt > 10000000) && (paramInt < 100000000))
    {
      localStringBuffer.delete(j - 4, j);
      localStringBuffer.length();
      return localStringBuffer.toString() + "万";
    }
    if (paramInt >= 100000000)
    {
      localStringBuffer.delete(j - 8, j);
      paramInt = localStringBuffer.length();
      localStringBuffer.append(".");
      localStringBuffer.append(str.substring(paramInt, paramInt + 2));
      return localStringBuffer.toString() + "亿";
    }
    return paramInt + "";
  }
  
  protected void a()
  {
    super.a();
    this.w = getResources().getString(2131165398);
    this.x = getResources().getString(2131165245);
    this.y = getResources().getString(2131166473);
    this.z = getResources().getString(2131165328);
    this.A = getResources().getString(2131166237);
    this.u = getResources().getDimensionPixelSize(2131231088);
    this.j.setTextSize(this.u);
    a(g.a().b());
    b();
    setOnClickListener(this);
  }
  
  protected void a(Canvas paramCanvas)
  {
    getWidth();
    int i1 = getHeight();
    int i2 = getPaddingTop();
    getPaddingLeft();
    int m = getPaddingRight();
    int i3 = getPaddingBottom();
    int j;
    int k;
    if (this.l != 1)
    {
      j = getWidth();
      int i4 = this.m;
      k = getPaddingLeft() + this.m;
      j -= i4;
    }
    for (;;)
    {
      paramCanvas.save();
      this.j.setColor(this.k);
      this.j.setStyle(Paint.Style.STROKE);
      float f1 = this.j.getStrokeWidth();
      this.j.setStrokeWidth(getResources().getDimensionPixelSize(2131230773));
      if (this.l == 1)
      {
        paramCanvas.drawLine(k, i2, j - m, i2, this.j);
        paramCanvas.drawLine(k, i1 - i3, j - m, i1 - i3, this.j);
        return;
        j = getWidth();
        k = getPaddingLeft();
        if (k == 0) {
          k = 1;
        }
      }
      else
      {
        paramCanvas.drawRect(k, i2, j - m, i1 - i3, this.j);
        i1 = i2 + (i1 - i2 - i3) / 2;
        k += 6;
        while (k < j - m)
        {
          paramCanvas.drawLine(k, i1, k + 1, i1, this.j);
          k += 6;
        }
        this.j.setStrokeWidth(f1);
        paramCanvas.restore();
        return;
      }
    }
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a)
    {
      this.K = getResources().getColor(2131493099);
      this.L = 65280;
      this.G = getResources().getColor(2131493303);
      this.H = getResources().getColor(2131493306);
      this.I = -9955808;
      this.J = -14069728;
      this.M = -1099463;
      this.N = -11753177;
      this.k = getResources().getColor(2131493296);
    }
    for (;;)
    {
      a(getWidth(), getHeight());
      postInvalidate();
      return;
      this.k = getResources().getColor(2131493297);
      this.L = getResources().getColor(2131493342);
      this.K = getResources().getColor(2131493342);
      this.H = getResources().getColor(2131493331);
      this.G = getResources().getColor(2131493334);
      this.I = 1726884908;
      this.J = 1713152073;
      this.M = getResources().getColor(2131493342);
      this.N = getResources().getColor(2131493342);
    }
  }
  
  public void b()
  {
    d locald = d.a();
    int k = locald.b("MinuteIndex", 10);
    int j = k;
    if (k == 10)
    {
      j = k;
      if (this.a != null)
      {
        this.b = this.a.getDataModel();
        j = k;
        if (this.b != null)
        {
          if (!n.k(this.b.getCode())) {
            break label82;
          }
          j = 2;
        }
      }
    }
    if (j == 0) {
      this.t = ak.a;
    }
    for (;;)
    {
      locald.g();
      return;
      label82:
      j = 0;
      break;
      if (j == 1) {
        this.t = ak.b;
      } else if (j == 2) {
        this.t = ak.c;
      }
    }
  }
  
  public void c()
  {
    this.g = Integer.MIN_VALUE;
    this.h = Integer.MAX_VALUE;
    this.b = this.a.getDataModel();
    if (this.b != null)
    {
      int j;
      if (this.f == null)
      {
        j = this.b.getMinTotalPoint();
        this.f = ((int[][])Array.newInstance(Integer.TYPE, new int[] { j, 2 }));
      }
      int[] arrayOfInt = this.b.getMinDDX();
      if (this.b.getMinLength() > 1)
      {
        j = 0;
        if (j < this.b.getMinLength())
        {
          if (j == 0)
          {
            this.f[0][0] = arrayOfInt[0];
            this.f[0][1] = 0;
          }
          for (;;)
          {
            j += 1;
            break;
            this.f[j][0] = arrayOfInt[j];
            this.f[j][1] = (arrayOfInt[j] - arrayOfInt[(j - 1)]);
            if (this.f[j][1] > this.g) {
              this.g = this.f[j][1];
            }
            if (this.f[j][1] < this.h) {
              this.h = this.f[j][1];
            }
          }
        }
      }
    }
    if (this.t == ak.b) {
      invalidate();
    }
  }
  
  public void d()
  {
    this.n = Integer.MIN_VALUE;
    this.o = Integer.MAX_VALUE;
    this.b = this.a.getDataModel();
    if (this.b != null)
    {
      this.i = this.b.getMinDealChaLiang();
      int j = 0;
      while (j < this.b.getMinLength())
      {
        this.n = Math.max(this.n, this.i[j]);
        this.o = Math.min(this.o, this.i[j]);
        j += 1;
      }
    }
    if (this.t == ak.a) {
      invalidate();
    }
  }
  
  public void e()
  {
    this.q = Integer.MIN_VALUE;
    this.r = Integer.MAX_VALUE;
    this.b = this.a.getDataModel();
    if (this.b != null)
    {
      this.p = this.b.getMinBSVol();
      int j = 0;
      while (j < this.b.getMinLength())
      {
        this.q = Math.max(this.q, this.p[j][0]);
        this.q = Math.max(this.q, this.p[j][1]);
        this.r = Math.min(this.r, this.p[j][0]);
        this.r = Math.min(this.r, this.p[j][1]);
        j += 1;
      }
    }
    if (this.t == ak.c) {
      invalidate();
    }
  }
  
  public void f()
  {
    if (this.a != null)
    {
      this.b = this.a.getDataModel();
      if (this.b != null)
      {
        int[][] arrayOfInt = this.b.getMinData();
        if (arrayOfInt != null)
        {
          this.E = Integer.MIN_VALUE;
          int[] arrayOfInt1 = this.b.getMinTradeVolum();
          if ((this.s == null) || (this.s.length != arrayOfInt.length))
          {
            this.s = new int[arrayOfInt.length];
            this.D = new int[arrayOfInt.length];
          }
          int j = 0;
          if (j < this.b.getMinLength())
          {
            this.s[j] = arrayOfInt[j][1];
            if (j == 0) {
              this.D[j] = arrayOfInt[j][3];
            }
            for (;;)
            {
              if (this.D[j] > this.E) {
                this.E = this.D[j];
              }
              j += 1;
              break;
              this.D[j] = (arrayOfInt1[j] - arrayOfInt1[(j - 1)]);
            }
          }
        }
      }
      invalidate();
    }
  }
  
  public void g()
  {
    this.f = ((int[][])null);
    this.i = null;
    this.p = ((int[][])null);
    this.s = null;
  }
  
  public int getLastVol()
  {
    if ((this.D == null) || (this.b == null) || (this.b.getMinLength() == 0)) {
      return 0;
    }
    return this.D[(this.b.getMinLength() - 1)];
  }
  
  public ak getMode()
  {
    return this.t;
  }
  
  public void onClick(View paramView)
  {
    if (!this.C) {
      return;
    }
    paramView = d.a();
    paramView.b("MinuteIndex", 0);
    if (this.t == ak.a)
    {
      if (this.b != null) {
        n.a(this.b.getCode(), 1158);
      }
      this.t = ak.b;
      paramView.a("MinuteIndex", 1);
    }
    for (;;)
    {
      paramView.g();
      invalidate();
      return;
      if (this.t == ak.b)
      {
        this.t = ak.c;
        paramView.a("MinuteIndex", 2);
      }
      else if (this.t == ak.c)
      {
        if (this.b != null) {
          n.a(this.b.getCode(), 1157);
        }
        this.t = ak.a;
        paramView.a("MinuteIndex", 0);
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a == null) {}
    do
    {
      return;
      this.b = this.a.getDataModel();
    } while ((this.b == null) || (this.b.getMinData() == null));
    paramCanvas.save();
    int j = getPaddingLeft();
    int k = getWidth();
    int i2 = getHeight();
    int i1;
    if (this.l != 1)
    {
      k = getWidth();
      i1 = this.m;
      j = getPaddingLeft();
      m = this.m;
      this.C = false;
      k -= i1;
      j += m;
      if (this.b == null) {
        break label650;
      }
      if (j != 0) {
        break label1890;
      }
    }
    label650:
    label655:
    label1710:
    label1890:
    for (int m = 1;; m = j)
    {
      int i4 = this.b.getMinLength();
      if (i4 == 0)
      {
        paramCanvas.restore();
        return;
        this.C = true;
        break;
      }
      float f2 = this.j.getStrokeWidth();
      this.j.setTextSize(this.u);
      this.j.setStrokeWidth(2.0F);
      this.j.setStyle(Paint.Style.FILL);
      if (this.t == ak.b)
      {
        paramCanvas.clipRect(0, 0, k, i2);
        if (this.f != null)
        {
          j = 0;
          if (j < i4)
          {
            i1 = (k - 2 - m) * j / this.b.getMinTotalPoint() + m;
            if (this.f[j][1] >= 0) {
              this.j.setColor(-65536);
            }
            for (;;)
            {
              paramCanvas.drawLine(i1, d(0), i1, d(this.f[j][1]), this.j);
              j += 1;
              break;
              this.j.setColor(-11753177);
            }
          }
        }
        this.j.setColor(this.K);
        this.j.setTextSize(this.u);
        this.j.setTextAlign(Paint.Align.LEFT);
        paramCanvas.drawText(this.w, m, 1.0F - this.j.getFontMetrics().ascent, this.j);
        paramCanvas.drawText(this.x, k / 2 + m, 1.0F - this.j.getFontMetrics().ascent, this.j);
        if ((this.f != null) && (this.f.length > 0))
        {
          j = this.v;
          if (this.v == -1) {
            j = i4 - 1;
          }
          this.j.setColor(this.K);
          if ((this.c == -1) || (this.c > i4 - 1) || (this.c < 0)) {
            break label655;
          }
          paramCanvas.drawText(":" + az.g(this.f[this.c][1], 3), this.u * 2 + m, 1.0F - this.j.getFontMetrics().ascent, this.j);
          this.j.setColor(this.L);
          paramCanvas.drawText(":" + az.g(this.f[this.c][0], 3), k / 2 + m + this.u * 2, 1.0F - this.j.getFontMetrics().ascent, this.j);
        }
      }
      float f1;
      int i5;
      do
      {
        do
        {
          for (;;)
          {
            this.j.setStrokeWidth(f2);
            paramCanvas.restore();
            return;
            paramCanvas.drawText(":" + az.g(this.f[j][1], 3), this.u * 2 + m, 1.0F - this.j.getFontMetrics().ascent, this.j);
            this.j.setColor(this.L);
            paramCanvas.drawText(":" + az.g(this.f[j][0], 3), k / 2 + m + this.u * 2, 1.0F - this.j.getFontMetrics().ascent, this.j);
            continue;
            if (this.t == ak.a)
            {
              paramCanvas.clipRect(0, 0, k, i2);
              if (this.i != null)
              {
                j = 0;
                if ((j < i4) && (j < this.i.length))
                {
                  i1 = (k - 2 - m) * j / this.b.getMinTotalPoint() + m;
                  if (this.i[j] >= 0) {
                    this.j.setColor(this.I);
                  }
                  for (;;)
                  {
                    paramCanvas.drawLine(i1, c(this.i[j]), i1, c(0), this.j);
                    j += 1;
                    break;
                    this.j.setColor(this.J);
                  }
                }
              }
              this.j.setTextSize(this.u);
              this.j.setTextAlign(Paint.Align.LEFT);
              this.j.setColor(this.K);
              paramCanvas.drawText(this.y, m, 1.0F - this.j.getFontMetrics().ascent, this.j);
            }
            else
            {
              if (this.t != ak.c) {
                break;
              }
              paramCanvas.clipRect(0, 0, k, i2);
              if (this.p != null)
              {
                f1 = m;
                i2 = b(this.p[0][0]);
                i1 = b(this.p[0][1]);
                j = 0;
                while (j < i4)
                {
                  i5 = m + (k - 2 - m) * j / this.b.getMinTotalPoint();
                  i3 = b(this.p[j][0]);
                  this.j.setColor(this.G);
                  paramCanvas.drawLine(f1, i2, i5, i3, this.j);
                  i2 = b(this.p[j][1]);
                  this.j.setColor(this.H);
                  paramCanvas.drawLine(f1, i1, i5, i2, this.j);
                  f1 = i5;
                  j += 1;
                  i1 = i2;
                  i2 = i3;
                }
              }
              this.j.setColor(this.M);
              paramCanvas.drawText(this.z, k / 2 + m, 1.0F - this.j.getFontMetrics().ascent, this.j);
              this.j.setColor(this.N);
              paramCanvas.drawText(this.A, m, 1.0F - this.j.getFontMetrics().ascent, this.j);
              if ((this.p != null) && (this.p.length > 0))
              {
                this.j.getTextBounds(this.A, 0, this.A.length(), this.B);
                i1 = this.B.width() + 2;
                j = this.v;
                if (this.v == -1) {
                  j = i4 - 1;
                }
                this.j.setColor(this.M);
                if ((this.c != -1) && (this.c <= i4 - 1) && (this.c >= 0))
                {
                  paramCanvas.drawText(":" + e(this.p[this.c][0]), k / 2 + m + this.u * 2, 1.0F - this.j.getFontMetrics().ascent, this.j);
                  this.j.setColor(this.N);
                  paramCanvas.drawText(":" + e(this.p[this.c][1]), i1 + m, 1.0F - this.j.getFontMetrics().ascent, this.j);
                }
                else
                {
                  paramCanvas.drawText(":" + e(this.p[j][0]), k / 2 + m + this.u * 2, 1.0F - this.j.getFontMetrics().ascent, this.j);
                  this.j.setColor(this.N);
                  paramCanvas.drawText(":" + e(this.p[j][1]), i1 + m, 1.0F - this.j.getFontMetrics().ascent, this.j);
                }
              }
            }
          }
        } while (this.t != ak.d);
        int i3 = this.b.getMinLength();
        i4 = this.b.getCp();
        i1 = 0;
        if (i1 >= i3) {
          break;
        }
        i5 = m + (k - 2 - m) * i1 / this.b.getMinTotalPoint();
      } while (this.D == null);
      int i6 = a(this.D[i1]);
      if (i1 == 0) {
        if (this.s[0] - i4 >= 0) {
          j = -1099463;
        }
      }
      for (;;)
      {
        f1 = this.j.getStrokeWidth();
        this.j.setColor(j);
        this.j.setStrokeWidth(2.0F);
        paramCanvas.drawLine(i5, i6, i5, i2 - 2, this.j);
        this.j.setStrokeWidth(f1);
        i1 += 1;
        break label1710;
        break;
        j = -11753174;
        continue;
        if (this.s[i1] - this.s[(i1 - 1)] >= 0) {
          j = -1099463;
        } else {
          j = -11753174;
        }
      }
    }
  }
  
  public void setMode(ak paramak)
  {
    this.t = paramak;
    d locald = d.a();
    if (paramak == ak.a) {
      locald.a("MinuteIndex", 0);
    }
    for (;;)
    {
      locald.g();
      invalidate();
      return;
      if (paramak == ak.b) {
        locald.a("MinuteIndex", 1);
      } else if (paramak == ak.c) {
        locald.a("MinuteIndex", 2);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartIndexSwitchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */