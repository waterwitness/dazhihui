package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import com.android.dazhihui.d.a;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.LargeTradeInfo;
import com.android.dazhihui.ui.screen.y;
import java.text.DecimalFormat;

public class GraphicView
  extends View
{
  private int a;
  private int b;
  private DecimalFormat c = new DecimalFormat("0.00");
  private DisplayMetrics d;
  private int e;
  private int[] f = { -4779737, -3008718, -1429686, -43924 };
  private int[] g = { -13740029, -13012722, -11298019, -10306529 };
  private String[] h = { "特", "大", "中", "小" };
  private int i = -3944731;
  private int j = -14670035;
  private int k = -7232844;
  private int l = -1379849;
  private int m = -15657703;
  private int n = -1;
  private Paint o;
  private Paint p;
  private String q = "资金流入";
  private int r;
  private int s;
  private MinListTabView t;
  private y u;
  private RectF v = new RectF();
  private Paint w = new Paint();
  
  public GraphicView(Context paramContext)
  {
    super(paramContext);
  }
  
  public GraphicView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = (WindowManager)paramContext.getSystemService("window");
    this.d = new DisplayMetrics();
    paramAttributeSet.getDefaultDisplay().getMetrics(this.d);
    paramAttributeSet = paramContext.getResources();
    this.b = paramAttributeSet.getDimensionPixelSize(2131230796);
    this.e = paramAttributeSet.getDimensionPixelSize(2131230911);
    this.r = paramAttributeSet.getDimensionPixelSize(2131230774);
    this.s = paramAttributeSet.getDimensionPixelSize(2131230844);
    this.a = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getWidth();
    a(g.a().b());
    a();
  }
  
  public GraphicView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int a(int paramInt)
  {
    int i1 = View.MeasureSpec.getMode(paramInt);
    paramInt = View.MeasureSpec.getSize(paramInt);
    if (i1 == 1073741824) {
      return paramInt;
    }
    int i2 = this.a;
    if (i1 == Integer.MIN_VALUE) {
      return Math.min(i2, paramInt);
    }
    return i2;
  }
  
  private void a()
  {
    this.o = new Paint();
    this.p = new Paint();
  }
  
  private int b(int paramInt)
  {
    int i1 = View.MeasureSpec.getMode(paramInt);
    paramInt = View.MeasureSpec.getSize(paramInt);
    if (i1 == 1073741824) {
      return paramInt;
    }
    int i2 = this.b;
    if (i1 == Integer.MIN_VALUE) {
      return Math.min(i2, paramInt);
    }
    return i2;
  }
  
  public void a(y paramy)
  {
    this.u = paramy;
    if (paramy == y.a)
    {
      this.f[0] = -4779737;
      this.f[1] = -3008718;
      this.f[2] = -1429686;
      this.f[3] = -43924;
      this.g[0] = -13740029;
      this.g[1] = -13012722;
      this.g[2] = -11298019;
      this.g[3] = -10306529;
      this.j = -14670035;
      this.m = -15657703;
      this.k = -7232844;
      this.l = -1379849;
    }
    for (this.n = -1;; this.n = -14540254)
    {
      postInvalidate();
      return;
      this.f[0] = -4903646;
      this.f[1] = -2013902;
      this.f[2] = -1081544;
      this.f[3] = -1007815;
      this.g[0] = -15235781;
      this.g[1] = -14182071;
      this.g[2] = -14438838;
      this.g[3] = -12799402;
      this.j = 2060967399;
      this.m = -986897;
      this.k = -11710898;
      this.l = -11710898;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.t == null) || (this.t.getTradeInfo() == null)) {
      return;
    }
    float f3 = this.a / 2;
    float f4 = this.b / 2;
    float f5 = (this.b - this.r * 2) / 2;
    float f1 = 21.0F * f5 / 24.0F;
    float f2 = 21.0F * f5 / 24.0F;
    float f6 = 21.0F * f5 / 24.0F;
    float f7 = 21.0F * f5 / 24.0F;
    this.v.left = (f3 - f1);
    this.v.top = (f4 - f2);
    this.v.right = (f6 + f3);
    this.v.bottom = (f7 + f4);
    this.p.setColor(this.n);
    f1 = -90.0F;
    this.o.setColor(this.j);
    paramCanvas.drawCircle(f3, f4, f5, this.o);
    if (this.u == y.b)
    {
      this.o.setStyle(Paint.Style.STROKE);
      this.o.setColor(this.i);
      paramCanvas.drawCircle(f3, f4, f5, this.o);
      this.o.setStyle(Paint.Style.FILL);
    }
    this.p.setTextSize(this.e);
    int i6 = a.b("00.00%", (int)this.p.getTextSize());
    int i2 = a.a("00.00%", (int)this.p.getTextSize());
    int i3 = a.a("特", (int)this.p.getTextSize());
    int i4 = i3 + 6;
    f6 = (2.0F * f5 - i2 * 4) / 3.0F;
    int i5 = this.t.getTradeInfo().getBuyRatio().length;
    this.p.setStyle(Paint.Style.FILL);
    this.p.setColor(this.n);
    this.p.setTextAlign(Paint.Align.LEFT);
    int i1 = 0;
    f2 = 90.0F;
    float f8;
    while (i1 < i5)
    {
      f7 = Math.round(180.0F * (this.t.getTradeInfo().getBuyRatio()[i1] / 100.0F) * 100.0F) / 100.0F;
      this.o.setColor(this.f[i1]);
      paramCanvas.drawArc(this.v, f1, f7, true, this.o);
      f8 = Math.round(180.0F * (this.t.getTradeInfo().getSellRatio()[(i5 - 1 - i1)] / 100.0F) * 100.0F) / 100.0F;
      this.p.setTextAlign(Paint.Align.LEFT);
      this.o.setColor(this.g[(i5 - 1 - i1)]);
      paramCanvas.drawArc(this.v, f2, f8, true, this.o);
      i1 += 1;
      f2 += f8;
      f1 += f7;
    }
    i1 = 0;
    String str;
    while (i1 < i5)
    {
      str = this.c.format(this.t.getTradeInfo().getBuyRatio()[i1]);
      f1 = this.r + (i2 + f6) * i1;
      int i7 = this.a - i6 - this.s;
      this.p.setTextSize(this.e - 2);
      paramCanvas.drawText(str + "%", i7, i2 + f1, this.p);
      this.p.setColor(this.f[i1]);
      f2 = i7 - 10 - i4;
      f7 = (i4 - i2) / 2;
      f8 = i7 - 10;
      float f9 = i4 / 2;
      paramCanvas.drawRect(f2, f1 - f7, f8, i2 / 2 + (f9 + f1), this.p);
      this.p.setColor(this.n);
      this.p.setTextAlign(Paint.Align.LEFT);
      this.p.setColor(getResources().getColor(2131493677));
      this.p.setTextSize(this.e);
      paramCanvas.drawText(this.h[i1], i7 - 10 - i4 + 2, i4 / 2 + f1 + i2 / 2 - 3 - 1.0F, this.p);
      this.p.setColor(this.n);
      i1 += 1;
    }
    i1 = 0;
    while (i1 < i5)
    {
      f1 = this.s;
      this.p.setTextSize(this.e - 2);
      f2 = this.r;
      f7 = i2;
      f8 = i5 - i1 - 1;
      f2 = (i2 - i4) / 2 + (f2 + (f7 + f6) * f8);
      this.p.setColor(this.g[(i5 - 1 - i1)]);
      paramCanvas.drawRect(f1, f2, f1 + i4, f2 + i4, this.p);
      this.p.setColor(getResources().getColor(2131493677));
      paramCanvas.drawText(this.h[(i5 - 1 - i1)], 2.0F + f1, i4 / 2 + f2 + i3 / 2 - 3, this.p);
      str = this.c.format(this.t.getTradeInfo().getSellRatio()[(i5 - 1 - i1)]) + "%";
      this.p.setColor(this.n);
      this.p.setTextSize(this.e);
      paramCanvas.drawText(str, f1 + 10.0F + i4, f2 + i4 / 2 + i3 / 2, this.p);
      i1 += 1;
    }
    this.o.setColor(this.m);
    paramCanvas.drawCircle(f3, f4, 7.0F * f5 / 12.0F, this.o);
    a.b(this.q, this.e - 5);
    a.b(this.t.getTradeInfo().getInFlow(), this.e - 5);
    this.w.setColor(this.k);
    this.w.setTextSize(this.e);
    this.w.setTextAlign(Paint.Align.CENTER);
    paramCanvas.drawText(this.q, f3, f4 - this.e / 2 + 15.0F, this.w);
    this.w.setColor(this.l);
    this.w.setTextSize(this.e + 3);
    paramCanvas.drawText(this.t.getTradeInfo().getInFlow(), f3, this.e / 2 + f4 + 25.0F, this.w);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(a(paramInt1), b(paramInt2));
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void setHolder(MinListTabView paramMinListTabView)
  {
    this.t = paramMinListTabView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\GraphicView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */