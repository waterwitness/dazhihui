package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.dazhihui.d.a;

public class k
  extends View
{
  private int A;
  private float B;
  private int C;
  private float D;
  private String E;
  private String F;
  private Paint a = new Paint(1);
  private Drawable b;
  private Drawable c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public k(Context paramContext, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, String paramString1, String paramString2)
  {
    super(paramContext);
    this.d = paramInt1;
    this.e = paramInt2;
    this.B = paramFloat1;
    this.D = paramFloat2;
    this.C = paramInt3;
    this.E = paramString1;
    this.F = paramString2;
    a();
  }
  
  private void a()
  {
    if (this.C == 1)
    {
      this.b = getResources().getDrawable(2130838537);
      this.c = getResources().getDrawable(2130838117);
      if (this.D < 0.0F) {
        break label405;
      }
      this.A = getResources().getColor(2131492969);
    }
    for (this.s = getResources().getColor(2131492967);; this.s = getResources().getColor(2131492968))
    {
      this.h = getResources().getDimensionPixelOffset(2131230799);
      this.i = getResources().getDimensionPixelOffset(2131230799);
      this.f = getResources().getDimensionPixelOffset(2131230774);
      this.g = getResources().getDimensionPixelOffset(2131230774);
      this.u = this.b.getMinimumWidth();
      this.v = this.b.getMinimumHeight();
      this.w = this.c.getMinimumWidth();
      this.x = this.c.getMinimumHeight();
      this.j = getResources().getDimensionPixelOffset(2131230798);
      this.k = getResources().getDimensionPixelOffset(2131230774);
      this.l = getResources().getDimensionPixelOffset(2131230774);
      this.m = getResources().getDimensionPixelOffset(2131230844);
      this.t = getResources().getDimensionPixelOffset(2131230844);
      this.p = getResources().getColor(2131492974);
      this.q = getResources().getColor(2131492973);
      this.n = getResources().getDimensionPixelSize(2131230879);
      this.o = getResources().getDimensionPixelSize(2131230875);
      this.r = getResources().getDimensionPixelSize(2131230877);
      this.y = a.b("大大大大", this.n);
      this.z = (this.d - this.h - this.u - this.k - this.y - this.l - this.m - this.w - this.i);
      return;
      if (this.C == 2)
      {
        this.b = getResources().getDrawable(2130838538);
        break;
      }
      if (this.C != 3) {
        break;
      }
      this.b = getResources().getDrawable(2130838539);
      break;
      label405:
      this.A = getResources().getColor(2131492966);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.a.setStyle(Paint.Style.FILL);
    if (this.b != null)
    {
      this.b.setBounds(this.h, this.f, this.h + this.u, this.f + this.v);
      this.b.draw(paramCanvas);
    }
    int i1;
    if (this.c != null)
    {
      i1 = (this.e - this.f - this.g - this.x) / 2 + this.f;
      this.c.setBounds(this.d - this.w - this.i, i1, this.d - this.i, this.x + i1);
      this.c.draw(paramCanvas);
    }
    if ((this.E != null) && (this.F != null))
    {
      this.a.setColor(this.p);
      this.a.setTextSize(this.n);
      i1 = a.a(this.E, this.n);
      a.a(this.E, this.h + this.u + this.k, this.f, Paint.Align.LEFT, paramCanvas, this.a);
      this.a.setColor(this.q);
      this.a.setTextSize(this.o);
      a.a(this.F, this.o);
      a.a(this.F, this.h + this.u + this.k, this.f + i1 + this.j, Paint.Align.LEFT, paramCanvas, this.a);
    }
    float f1;
    if (this.B != 0.0F)
    {
      this.a.setColor(this.A);
      this.a.setStyle(Paint.Style.FILL);
      i2 = this.h + this.u + this.k + this.y + this.l;
      f1 = this.z / this.B * Math.abs(this.D);
      paramCanvas.drawRect(i2, this.f, i2 + f1, this.e - this.g, this.a);
      this.a.setColor(this.s);
      this.a.setTextSize(this.r);
      if (this.D < 0.0F) {
        break label559;
      }
    }
    label559:
    for (String str = "+" + this.D;; str = this.D + "")
    {
      i3 = a.b(str, this.r);
      int i4 = this.t;
      i1 = a.c(str, this.r);
      if (i3 + i4 <= f1) {
        break;
      }
      i2 = (int)(i2 + f1 + this.t);
      i3 = this.f;
      a.a(str, i2, (this.e - this.f - this.g - i1) / 2 + i3, Paint.Align.LEFT, paramCanvas, this.a);
      return;
    }
    int i2 = (int)(i2 + f1 - this.t);
    int i3 = this.f;
    a.a(str, i2, (this.e - this.f - this.g - i1) / 2 + i3, Paint.Align.RIGHT, paramCanvas, this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */