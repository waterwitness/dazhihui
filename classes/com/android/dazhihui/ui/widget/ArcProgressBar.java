package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.d.a;
import com.android.dazhihui.g;

public class ArcProgressBar
  extends View
{
  private int a = 180;
  private int b = 4;
  private int c;
  private int d;
  private int e = -5090304;
  private int f = 60353;
  private int g = 60353;
  private int h = -51712;
  private int i = 0;
  private float j = 0.0F;
  private int k = 120;
  private int l = 300;
  private Paint m = null;
  private Paint n = null;
  private Paint o = null;
  private Paint p = new Paint(1);
  private RectF q = null;
  private int r = 200;
  private int s;
  private int t;
  private int u;
  private int v;
  private Handler w = new h(this);
  
  public ArcProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.getResources();
    this.u = paramContext.getDimensionPixelSize(2131230883);
    this.v = paramContext.getDimensionPixelSize(2131231039);
    this.c = paramContext.getDimensionPixelSize(2131230774);
    this.d = this.c;
    this.o = new Paint();
    this.o.setAntiAlias(true);
    this.o.setColor(this.e);
    this.n = new Paint();
    this.n.setAntiAlias(true);
    this.n.setStyle(Paint.Style.STROKE);
    this.n.setStrokeWidth(this.c);
    this.n.setColor(this.e);
    this.m = new Paint();
    this.m.setAntiAlias(true);
    this.m.setStyle(Paint.Style.STROKE);
    this.m.setStrokeWidth(this.d);
    this.m.setColor(this.f);
    int i1 = (int)(g.a().m() * 0.35D);
    if (i1 > this.a) {}
    for (;;)
    {
      this.a = i1;
      return;
      i1 = this.a;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = this.c / 2;
    this.q = new RectF(this.b + i1, this.b + i1, this.r + i1 + this.b, i1 + this.r + this.b);
    float f1 = this.s / 2.0F;
    float f2 = this.t / 2.0F;
    float f3 = this.r / 2.0F;
    this.o.setColor(this.e);
    paramCanvas.drawCircle((float)(f1 + f3 * Math.cos(this.k * 3.141592653589793D / 180.0D)), (float)(f2 + f3 * Math.sin(this.k * 3.141592653589793D / 180.0D)), this.c / 2.0F, this.o);
    paramCanvas.drawCircle((float)(f1 + f3 * Math.cos((180 - this.k) * 3.141592653589793D / 180.0D)), (float)(f2 + f3 * Math.sin((180 - this.k) * 3.141592653589793D / 180.0D)), this.c / 2.0F, this.o);
    paramCanvas.drawArc(this.q, this.k, this.l, false, this.n);
    if (this.j > 0.0F)
    {
      this.o.setColor(this.f);
      paramCanvas.drawCircle((float)(f1 + f3 * Math.cos(this.k * 3.141592653589793D / 180.0D)), (float)(f2 + f3 * Math.sin(this.k * 3.141592653589793D / 180.0D)), this.d / 2.0F, this.o);
      paramCanvas.drawCircle((float)(f1 + f3 * Math.cos((this.k + this.j * 3.0F) * 3.141592653589793D / 180.0D)), (float)(f2 + f3 * Math.sin((this.k + this.j * 3.0F) * 3.141592653589793D / 180.0D)), this.c / 2.0F, this.o);
    }
    this.m.setColor(this.f);
    paramCanvas.drawArc(this.q, this.k, 3.0F * this.j, false, this.m);
    this.p.setColor(-6797311);
    this.p.setTextSize(this.u);
    a.a((int)this.j + "%", this.s / 2, this.t / 2 - this.u / 2, Paint.Align.CENTER, paramCanvas, this.p);
    this.p.setColor(-9818112);
    this.p.setTextSize(this.v);
    a.a("仓位", this.s / 2, this.t - this.v - 6, Paint.Align.CENTER, paramCanvas, this.p);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i2 == 1073741824)
    {
      if (i1 != 1073741824) {
        break label60;
      }
      label34:
      if (paramInt1 >= paramInt2) {
        break label72;
      }
      paramInt2 = paramInt1;
    }
    for (;;)
    {
      setMeasuredDimension(paramInt2, paramInt1);
      return;
      paramInt1 = Math.min(this.a, paramInt1);
      break;
      label60:
      paramInt2 = Math.min(this.a, paramInt2);
      break label34;
      label72:
      paramInt1 = paramInt2;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.s = paramInt1;
    this.t = paramInt2;
    this.r = (paramInt1 - this.c - this.b * 2);
  }
  
  public void setBarColor(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void setBarStrokeWidth(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void setBgColor(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void setBgStrokeWidth(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void setProgress(int paramInt)
  {
    this.j = 0.0F;
    int i1;
    if (paramInt < 0)
    {
      i1 = 0;
      this.i = i1;
      if (this.i < 80) {
        break label68;
      }
    }
    label68:
    for (paramInt = this.h;; paramInt = this.g)
    {
      this.f = paramInt;
      this.w.sendMessage(this.w.obtainMessage(1000));
      return;
      i1 = paramInt;
      if (paramInt <= 100) {
        break;
      }
      i1 = 100;
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ArcProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */