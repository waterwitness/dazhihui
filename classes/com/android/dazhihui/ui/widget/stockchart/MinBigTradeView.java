package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.LargeTradeInfo;
import com.android.dazhihui.ui.screen.y;
import java.util.Arrays;

public class MinBigTradeView
  extends View
{
  private static final String[] k = { "特大买单", "大买单", "中买单", "小买单" };
  private static final String[] l = { "特大卖单", "大卖单", "中卖单", "小卖单" };
  protected DisplayMetrics a = null;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private MinListTabView j;
  private int[] m = { -11753174, -1099463 };
  private int n = -12961221;
  private int o = -12961221;
  private Paint p = new Paint(1);
  private int[] q = new int[2];
  private float[] r = new float[4];
  private int[] s = new int[2];
  private float[] t = new float[4];
  private int u;
  private int v;
  private int w;
  
  public MinBigTradeView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinBigTradeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinBigTradeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = (WindowManager)paramContext.getSystemService("window");
    this.a = new DisplayMetrics();
    paramAttributeSet.getDefaultDisplay().getMetrics(this.a);
    paramContext = paramContext.getResources();
    this.b = paramContext.getDimensionPixelSize(2131230986);
    this.c = 12;
    this.d = (this.b + this.c);
    this.i = paramContext.getDimensionPixelSize(2131230973);
    a(g.a().b());
  }
  
  public void a()
  {
    this.q = new int[2];
    this.r = new float[4];
    this.s = new int[2];
    this.t = new float[4];
    this.u = 0;
    this.v = 0;
    this.w = 0;
    postInvalidate();
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a)
    {
      this.m[1] = getResources().getColor(2131493305);
      this.m[0] = getResources().getColor(2131493302);
      this.n = -12961221;
    }
    for (this.o = -12961221;; this.o = -2697514)
    {
      postInvalidate();
      return;
      this.m[1] = getResources().getColor(2131493333);
      this.m[0] = getResources().getColor(2131493330);
      this.n = -3618616;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    if ((this.g == 0) || (this.h == 0))
    {
      paramCanvas.restore();
      return;
    }
    int i6 = this.g / 2;
    a.c(this.e, this.f, this.g, this.h, paramCanvas);
    a.a.setColor(this.n);
    a.a(this.e, this.f, this.g, this.h, paramCanvas);
    this.p.setColor(-2628628);
    this.p.setTextSize(this.b + 2);
    int i1 = this.f;
    a.a.setColor(this.n);
    this.p.setTextSize(this.b);
    if ((this.j != null) && (this.j.getTradeInfo() != null))
    {
      this.q = this.j.getTradeInfo().getBigBuy();
      this.s = this.j.getTradeInfo().getBigSell();
      this.r = this.j.getTradeInfo().getBuyRatio();
      this.t = this.j.getTradeInfo().getSellRatio();
      this.u = this.j.getTradeInfo().getAllNumber();
      if (this.j.getBigTradeData() != null)
      {
        this.v = (this.j.getBigTradeData()[6] + this.j.getBigTradeData()[8] + this.j.getBigTradeData()[10] + this.j.getBigTradeData()[12]);
        this.w = (this.j.getBigTradeData()[7] + this.j.getBigTradeData()[9] + this.j.getBigTradeData()[11] + this.j.getBigTradeData()[13]);
      }
    }
    int i7 = i1 + this.c;
    String str2 = "共" + b.g(this.w) + "单";
    Object localObject;
    String str3;
    if (this.w == 0)
    {
      localObject = "--";
      str3 = "共" + b.g(this.v) + "单";
      if (this.v != 0) {
        break label717;
      }
    }
    int i4;
    int i5;
    label717:
    for (String str1 = "--";; str1 = b.a(this.u / this.v, 1) + "手/单")
    {
      i1 = a.b(str2, this.b);
      i2 = a.b(str3, this.b);
      b.a(paramCanvas, str3, this.e + 27, i7, this.m[0], this.b, 20);
      b.a(paramCanvas, str1, this.e + 37 + i2, i7, this.m[0], this.b, 20);
      b.a(paramCanvas, str2, i6 + 27, i7, this.m[1], this.b, 20);
      b.a(paramCanvas, (String)localObject, i6 + 37 + i1, i7, this.m[1], this.b, 20);
      a.a(this.e, this.d + i7, this.g, this.d + i7, this.n, paramCanvas);
      i1 = 0;
      i4 = 0;
      i5 = this.b;
      i2 = 0;
      while (i2 < this.q.length)
      {
        i3 = i1;
        if (i1 < String.valueOf((int)(this.r[i2] * this.u)).length()) {
          i3 = String.valueOf((int)(this.r[i2] * this.u)).length();
        }
        i2 += 1;
        i1 = i3;
      }
      localObject = b.a(this.u / this.w, 1) + "手/单";
      break;
    }
    int i3 = 0;
    for (int i2 = i4; i3 < this.s.length; i2 = i4)
    {
      i4 = i2;
      if (i2 < String.valueOf((int)(this.t[i3] * this.u)).length()) {
        i4 = String.valueOf((int)(this.t[i3] * this.u)).length();
      }
      i3 += 1;
    }
    if (i1 > i2) {}
    for (;;)
    {
      localObject = new char[i1];
      Arrays.fill((char[])localObject, '0');
      localObject = new String((char[])localObject);
      i1 = i5;
      do
      {
        i3 = a.b("特大买单", i1);
        i4 = a.b("00.00%", i1);
        i5 = a.b((String)localObject, i1);
        i2 = i1 - 2;
        i1 = i2;
      } while (i3 + i4 + i5 > i6 - 20);
      this.p.setTextSize(i2 + 2);
      i2 = i7 + (this.d + this.c);
      i1 = 0;
      while (i1 < k.length)
      {
        this.p.setColor(this.m[0]);
        a.a(l[i1], this.e + 8 + 13 + 6, i2, Paint.Align.LEFT, paramCanvas, this.p);
        a.a((int)(this.t[i1] * this.u / 100.0F) + "", i6 - 25, i2, Paint.Align.RIGHT, paramCanvas, this.p);
        this.p.setColor(this.m[1]);
        a.a(k[i1], i6 + 2 + this.i / 2 + 8 + 13 + 6, i2, Paint.Align.LEFT, paramCanvas, this.p);
        a.a((int)(this.r[i1] * this.u / 100.0F) + "", i6 * 2 - 25, i2, Paint.Align.RIGHT, paramCanvas, this.p);
        i2 += this.d;
        if (i1 != k.length - 1) {
          a.a(this.e, i2, this.g, i2, this.o, paramCanvas);
        }
        i2 += this.c;
        i1 += 1;
      }
      i1 = i2;
    }
    paramCanvas.restore();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (i2 != 1073741824) {
      paramInt1 = (this.d + this.c) * 5;
    }
    setMeasuredDimension(i1, paramInt1);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = paramInt1;
    this.h = paramInt2;
    this.e = 0;
    this.f = 0;
  }
  
  public void setHolder(MinListTabView paramMinListTabView)
  {
    this.j = paramMinListTabView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinBigTradeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */