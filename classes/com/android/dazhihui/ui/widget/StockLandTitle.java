package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.StockVo.Api2206;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;
import com.android.dazhihui.ui.widget.stockchart.az;

public class StockLandTitle
  extends View
{
  private String A;
  private String B;
  private int C = 10;
  private int D = 15;
  private int E;
  private String F = "最高";
  private String G = "成交量";
  private String[] H = new String[8];
  private String I = "00.0000";
  private boolean J;
  private String[] K;
  private String L;
  private String M;
  private String N;
  private int O = -65536;
  private StockVo P;
  private int Q = -4737097;
  private StockChartContainer R;
  private int S;
  private int T;
  private int U;
  private y V;
  Paint a = new Paint(1);
  private String b = "";
  private String c = "";
  private int d = 0;
  private int e = 0;
  private int f = 0;
  private int g = 0;
  private int h = 2;
  private int[] i = new int[2];
  private String j = "";
  private String k = "";
  private Bitmap l = null;
  private Bitmap m = null;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private lg w = null;
  private boolean x;
  private String y;
  private String z;
  
  public StockLandTitle(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public StockLandTitle(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StockLandTitle(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.getResources();
    this.o = paramContext.getDimensionPixelSize(2131231142);
    this.p = paramContext.getDimensionPixelSize(2131231138);
    this.q = paramContext.getDimensionPixelSize(2131231139);
    this.r = paramContext.getDimensionPixelSize(2131230883);
    this.u = paramContext.getDimensionPixelSize(2131231140);
    this.v = paramContext.getDimensionPixelSize(2131231141);
    this.l = Bitmap.createBitmap(BitmapFactory.decodeResource(paramContext, 2130838316));
    this.m = a.a(this.l, 180);
    this.j = paramContext.getString(2131166485);
    this.k = paramContext.getString(2131166484);
    this.D = paramContext.getDimensionPixelSize(2131230791);
    this.C = paramContext.getDimensionPixelSize(2131230837);
    a(g.a().b());
  }
  
  private String b(String paramString)
  {
    int i1 = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    localStringBuffer.delete(i1 - 4, i1);
    i1 = localStringBuffer.length();
    localStringBuffer.append(".");
    localStringBuffer.append(paramString.substring(i1, i1 + 2));
    return localStringBuffer.toString();
  }
  
  private String c(String paramString)
  {
    int i1 = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    localStringBuffer.delete(i1 - 8, i1);
    i1 = localStringBuffer.length();
    localStringBuffer.append(".");
    localStringBuffer.append(paramString.substring(i1, i1 + 2));
    return localStringBuffer.toString();
  }
  
  public void a(Canvas paramCanvas)
  {
    b.i(this.f, this.g);
    String str1 = b.a(this.f, this.h);
    String str2 = b.m(this.f, this.g);
    String str3 = b.e(this.f, this.g, this.h);
    int i1 = a.b(this.c, this.o);
    int i2 = a.b(this.b, this.p);
    this.a.setTextSize(this.o);
    this.a.setColor(this.Q);
    this.a.setFakeBoldText(false);
    this.I = "00.0000";
    int i4 = a.b(str3, this.p);
    int i5 = a.b(str2, this.p);
    int i3 = a.b(str1, this.o);
    if (i1 > i2)
    {
      a.a(this.c, i1 / 2 + 10, 10, Paint.Align.CENTER, paramCanvas, this.a);
      this.a.setTextSize(this.p - 2);
      this.a.setColor(this.T);
      a.a(this.b, i1 / 2 + 10, this.t - this.p - 10, Paint.Align.CENTER, paramCanvas, this.a);
      i2 = i3;
      if (i4 + i5 + 20 > i3) {
        i2 = 20 + (i4 + i5);
      }
      this.a.setColor(this.O);
      this.a.setTextSize(this.o);
      a.a(str1, i2 / 2 + (10 + i1 + 40), 10, Paint.Align.CENTER, paramCanvas, this.a);
      this.a.setTextSize(this.p);
      a.a(str3, 10 + i1 + 40, this.t - this.p - 10, Paint.Align.LEFT, paramCanvas, this.a);
      a.a(str2, 10 + i1 + 40 + i2, this.t - this.p - 10, Paint.Align.RIGHT, paramCanvas, this.a);
      this.E = (this.s - (i1 + 80 + i2));
      this.a.setColor(this.S);
      i3 = this.E;
      i4 = this.C;
      i5 = this.D;
      if (this.d != 0) {
        break label2251;
      }
      i1 = 15;
      this.I += "万";
    }
    for (;;)
    {
      a.b(b.j(this.P.getmUp()), i1);
      a.b(this.I, i1);
      a.b(b.j(this.P.getmTotalAmount()), i1);
      label520:
      int i6 = a.b(b.j(this.P.getmUp()), i1);
      int i7 = a.b(this.I, i1);
      int i8 = a.b(b.j(this.P.getmTotalAmount()), i1);
      i2 = i1 + 1;
      if (i2 > this.p)
      {
        label580:
        i5 = i2 - 1;
        a.b(b.j(this.P.getmUp()), i5);
        a.b(this.I, i5);
        a.b(b.j(this.P.getmTotalAmount()), i5);
        this.a.setTextSize(i5);
        i1 = this.s - this.E + this.D + 10;
        i4 = this.t - i5 - 17;
        i2 = a.b("最高", i5);
        a.a("最高", i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
        a.a("最低", i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
        i1 += a.b("最高", i5) + this.C;
        this.a.setColor(az.e(this.P.getmUp(), this.g));
        a.a(az.a(this.P.getmUp(), this.P.getmDecimalLen()), i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
        this.a.setColor(az.e(this.P.getmDp(), this.g));
        a.a(az.a(this.P.getmDp(), this.P.getmDecimalLen()), i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
        this.a.setColor(this.S);
        i6 = Math.max(a.b(az.a(this.P.getmDp(), this.P.getmDecimalLen()), i5), a.b(az.a(this.P.getmUp(), this.P.getmDecimalLen()), i5));
        i3 = i1 + (this.D + i6);
        i1 = i3;
        if (this.P.getmUp() == 0)
        {
          i1 = i3;
          if (this.P.getmDp() == 0) {
            i1 = i3 + (i6 + i2);
          }
        }
        a.a("今开", i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
        a.a("换手", i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
        i3 = i1 + (a.b("今开", i5) + this.C);
        this.a.setColor(az.e(this.P.getmOp(), this.g));
        str2 = az.a(this.P.getmOp(), this.P.getmDecimalLen());
        a.a(str2, i3, 17, Paint.Align.LEFT, paramCanvas, this.a);
        this.a.setColor(this.U);
        str1 = "--";
        if (this.P.getmData2939() != null) {
          str1 = b.a(this.P.getmVol() + b.b(this.P.getmData2939()[6]), b.b(this.P.getmData2939()[6]));
        }
        a.a(str1, i3, i4, Paint.Align.LEFT, paramCanvas, this.a);
        i1 = Math.max(a.b(str1, i5), a.b(str2, i5));
        if ((!str1.equals("--")) || (!str2.equals("--"))) {
          break label2248;
        }
        i1 = i2;
      }
      label1301:
      label1348:
      label1688:
      label1696:
      label1774:
      label2015:
      label2248:
      for (;;)
      {
        i1 = i3 + (i1 + this.D);
        this.a.setColor(this.Q);
        a.a("成交量", i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
        a.a("成交额", i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
        i1 += a.b("成交量", i5) + this.C;
        str1 = az.a(az.a(this.P.getmTotalAmount()));
        if (str1.length() >= 5)
        {
          this.A = (b(str1) + "亿");
          str1 = az.c(this.P.getmVol());
          if (str1.length() < 5) {
            break label1688;
          }
          this.B = (b(str1) + "万");
          this.a.setColor(this.U);
          a.a(this.B, i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
          this.a.setColor(this.U);
          a.a(this.A, i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
          if ((!a(b.j(this.P.getmTotalAmount()))) || (!a(b.j(this.P.getmVol())))) {
            break label1696;
          }
          i1 += this.D + i2;
          this.a.setColor(this.Q);
          a.a("总值", i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
          a.a("流值", i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
          i1 += a.b("总值", i5) + this.C;
          this.a.setColor(this.U);
          if (this.y != null) {
            break label1774;
          }
          this.a.setColor(this.Q);
          a.a("--", i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
        }
        for (;;)
        {
          this.a.setColor(this.U);
          if (this.z != null) {
            break label2015;
          }
          this.a.setColor(this.Q);
          a.a("--", i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
          return;
          i1 = i2;
          break;
          i1 = i2;
          if (i3 - i4 * 4 - i5 * 5 - 10 > i6 * 4 + i7 * 4 + i8 + 15) {
            break label520;
          }
          break label580;
          this.A = (str1 + "万");
          break label1301;
          this.B = str1;
          break label1348;
          if (this.A == null) {
            this.A = "";
          }
          if (this.B == null) {
            this.B = "";
          }
          if (this.A.length() > this.B.length()) {}
          for (str1 = this.A;; str1 = this.B)
          {
            i1 += a.b(str1, i5) + this.D + 10;
            break;
          }
          if (this.y.length() >= 9)
          {
            a.a(c(this.y) + "万亿", i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
          }
          else
          {
            if (this.y.length() >= 5)
            {
              if (this.d != 0) {}
              for (str1 = b(this.y) + "亿";; str1 = b(this.y) + "万亿")
              {
                a.a(str1, i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
                break;
              }
            }
            if ((this.y.equals("0")) || (this.y.equals("--"))) {
              a.a("--", i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
            } else {
              a.a(this.y + "万", i1, 17, Paint.Align.LEFT, paramCanvas, this.a);
            }
          }
        }
        if (this.z.length() >= 9)
        {
          a.a(c(this.z) + "万亿", i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
          return;
        }
        if (this.z.length() >= 5)
        {
          if (this.d != 0) {}
          for (str1 = b(this.z) + "亿";; str1 = b(this.z) + "万亿")
          {
            a.a(str1, i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
            return;
          }
        }
        if ((this.z.equals("0")) || (this.z.equals("--")))
        {
          a.a("--", i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
          return;
        }
        a.a(this.z + "万", i1, i4, Paint.Align.LEFT, paramCanvas, this.a);
        return;
      }
      label2251:
      i1 = 5;
    }
  }
  
  public void a(y paramy)
  {
    this.V = paramy;
    if (paramy == y.a)
    {
      this.Q = -4737097;
      this.S = -4737097;
      this.T = -4737097;
    }
    for (this.U = -2699741;; this.U = -14540254)
    {
      postInvalidate();
      return;
      this.Q = -14540254;
      this.S = -10066330;
      this.T = -6642515;
    }
  }
  
  public boolean a(String paramString)
  {
    return (paramString == null) || (paramString.contains("-"));
  }
  
  public String getDataMaxLen()
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    while (i1 < this.H.length)
    {
      int i4 = i2;
      if (this.H[i1].length() > i2)
      {
        i4 = this.H[i1].length();
        i3 = i1;
      }
      i1 += 1;
      i2 = i4;
    }
    return this.H[i3];
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i1 = 1;
    this.P = this.R.getDataModel();
    if (this.P == null) {
      return;
    }
    this.d = this.P.getType();
    this.b = this.P.getCode();
    this.c = this.P.getName();
    this.f = this.P.getZxj();
    this.g = this.P.getCp();
    this.h = this.P.getmDecimalLen();
    label306:
    int i2;
    if ((this.J) && (this.K != null))
    {
      this.L = this.K[0];
      this.M = this.K[1];
      this.N = this.K[2];
      this.O = b.i(this.f, this.g);
      if ((this.J) && (!"--".equals(this.N)))
      {
        if (!this.N.contains("-")) {
          break label430;
        }
        this.O = -15878144;
        if (!this.M.contains("-")) {
          this.M = ("-" + this.M);
        }
        if (!this.N.contains("-")) {
          this.N = ("-" + this.M);
        }
        if (!this.N.contains("%")) {
          this.N += "%";
        }
      }
      i2 = (int)Math.pow(10.0D, this.P.getmDecimalLen());
      if (i2 > 0) {
        break label682;
      }
    }
    for (;;)
    {
      if (this.P.getType() == 0)
      {
        this.y = b.j(this.P.getApi2206Data().sumValue);
        this.z = b.j(this.P.getApi2206Data().sumCirculationValue);
      }
      for (;;)
      {
        a(paramCanvas);
        return;
        this.L = b.a(this.f, this.h);
        this.N = b.m(this.f, this.g);
        this.M = b.e(this.f, this.g, this.h);
        break;
        label430:
        this.O = -2293760;
        if (!this.M.contains("+")) {
          this.M = ("+" + this.M);
        }
        if (!this.N.contains("+")) {
          this.N = ("+" + this.N);
        }
        if (this.N.contains("%")) {
          break label306;
        }
        this.N += "%";
        break label306;
        if ((this.P.getmData2939() != null) && (this.P.getMarketType() != 7))
        {
          this.y = Long.toString((this.P.getmData2939()[7] * 1.0F / 100.0F * (this.P.getZxj() * 1.0F / i1)));
          float f1 = this.P.getmData2939()[6] * 1.0F / 100.0F;
          this.z = Long.toString((this.P.getZxj() * 1.0F / i1 * f1));
        }
        else
        {
          this.y = "--";
          this.z = "--";
        }
      }
      label682:
      i1 = i2;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = paramInt2;
    if (i2 != 1073741824) {
      paramInt1 = Math.min(this.u, paramInt2);
    }
    paramInt2 = i1;
    if (i2 != 1073741824) {
      paramInt2 = Math.min(this.v, i1);
    }
    setMeasuredDimension(paramInt2, paramInt1);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.s = paramInt1;
    this.t = paramInt2;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    int i1 = paramMotionEvent.getAction();
    int i2 = (int)paramMotionEvent.getX();
    paramMotionEvent.getY();
    boolean bool1;
    if (this.x)
    {
      bool1 = super.onTouchEvent(paramMotionEvent);
      return bool1;
    }
    switch (i1)
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      if ((i2 >= 0) && (i2 <= this.n + 4 + 15 + this.n / 2))
      {
        bool1 = bool2;
        if (this.w == null) {
          break;
        }
        this.J = false;
        this.w.a(1);
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
      }
      bool1 = bool2;
      if (i2 < this.s / 2 - 10 - 15 - this.n / 2) {
        break;
      }
      bool1 = bool2;
      if (i2 > this.s / 2 + this.n + 10 + 25 + this.n / 2) {
        break;
      }
      bool1 = bool2;
      if (this.w == null) {
        break;
      }
      this.J = false;
      this.w.a(0);
      getParent().requestDisallowInterceptTouchEvent(true);
      return true;
      getParent().requestDisallowInterceptTouchEvent(false);
    }
  }
  
  public void setCallback(lg paramlg)
  {
    this.w = paramlg;
  }
  
  public void setChangeValue(String paramString)
  {
    this.z = paramString;
    this.H[7] = this.z;
  }
  
  public void setCurPrice(int paramInt)
  {
    this.J = false;
    this.f = paramInt;
  }
  
  public void setExtraData(String[] paramArrayOfString)
  {
    this.J = true;
    this.K = paramArrayOfString;
  }
  
  public void setHolder(StockChartContainer paramStockChartContainer)
  {
    this.R = paramStockChartContainer;
  }
  
  public void setIsKline(boolean paramBoolean) {}
  
  public void setOrentation(int paramInt)
  {
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.x = bool;
      postInvalidate();
      return;
    }
  }
  
  public void setPicVis(boolean paramBoolean) {}
  
  public void setTotalValue(String paramString)
  {
    this.y = paramString;
    this.H[6] = this.y;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\StockLandTitle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */