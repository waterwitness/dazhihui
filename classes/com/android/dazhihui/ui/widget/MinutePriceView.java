package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;

public class MinutePriceView
  extends View
{
  private static Paint w = new Paint(1);
  private int A;
  private int B;
  private Context a;
  private int b;
  private int c;
  private Path d;
  private Path e;
  private int[] f;
  private int[] g;
  private int[] h;
  private int[] i;
  private int j;
  private int k;
  private int l;
  private int[] m;
  private int n;
  private int o = 241;
  private int p;
  private int q;
  private int r;
  private Path s;
  private int t;
  private int u;
  private int v;
  private Paint.FontMetrics x;
  private int y;
  private Paint z = new Paint(1);
  
  public MinutePriceView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinutePriceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinutePriceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext;
    this.v = this.a.getResources().getDimensionPixelSize(2131231088);
    w.setTextSize(this.v);
    c();
  }
  
  private float b(int paramInt1, int paramInt2)
  {
    float f1 = 0.0F;
    int i1 = paramInt1;
    if (paramInt1 < 0) {
      i1 = 0;
    }
    float f2 = (this.t - 2) * i1 * 1.0F / paramInt2;
    if (this.t - 2 - f2 > 0.0F) {
      f1 = this.t - f2 - 2.0F;
    }
    return f1;
  }
  
  private void c()
  {
    if (g.a().b() == y.a)
    {
      this.A = getResources().getColor(2131493296);
      this.B = getResources().getColor(2131493677);
      this.b = getResources().getColor(2131493304);
      this.c = getResources().getColor(2131493318);
      return;
    }
    this.A = getResources().getColor(2131493297);
    this.B = getResources().getColor(2131492903);
    this.b = getResources().getColor(2131493332);
    this.c = getResources().getColor(2131493346);
  }
  
  private void c(Canvas paramCanvas)
  {
    if ((this.f == null) || (this.g == null) || (this.k == 0)) {}
    int i2;
    int i1;
    for (;;)
    {
      return;
      i2 = 0;
      while (i2 < 3)
      {
        i1 = this.p - (this.p - this.q) * i2 / 2;
        if (i1 >= 0) {
          break label66;
        }
        i2 += 1;
      }
    }
    label66:
    int i3 = (int)((this.t - w.getTextSize() - 5.0F) * i2 / 2.0F + 2.0F);
    Object localObject = b.d(i1, this.l);
    float f1 = Math.abs(i1 - this.k) * 100.0F / this.k;
    String str2 = String.format("%.1f", new Object[] { Float.valueOf(f1) }) + "%";
    String str1 = str2;
    if (i2 == 2) {
      str1 = "-" + str2;
    }
    str2 = ((String)localObject).substring(0, ((String)localObject).length() - this.l - 1);
    localObject = w;
    if (i2 < 1) {
      i1 = -1099463;
    }
    for (;;)
    {
      ((Paint)localObject).setColor(i1);
      w.setTextAlign(Paint.Align.LEFT);
      w.setStyle(Paint.Style.FILL);
      this.x = w.getFontMetrics();
      paramCanvas.drawText(str2, 2.0F, i3 - this.x.ascent, w);
      if (i2 == 1) {
        break;
      }
      w.setTextAlign(Paint.Align.RIGHT);
      this.x = w.getFontMetrics();
      paramCanvas.drawText(str1, this.u - 2, i3 - this.x.ascent, w);
      break;
      if (i2 == 1) {
        i1 = this.B;
      } else {
        i1 = -11753177;
      }
    }
  }
  
  public void a()
  {
    if (this.d == null)
    {
      this.d = new Path();
      if (this.e != null) {
        break label65;
      }
      this.e = new Path();
    }
    for (;;)
    {
      if (this.s != null) {
        break label75;
      }
      this.s = new Path();
      return;
      this.d.reset();
      break;
      label65:
      this.e.reset();
    }
    label75:
    this.s.reset();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.p = paramInt1;
    this.q = paramInt2;
  }
  
  public void a(Canvas paramCanvas)
  {
    w.setColor(this.A);
    w.setStrokeWidth(2.0F);
    w.setStyle(Paint.Style.STROKE);
    paramCanvas.drawRect(1.0F, 1.0F, this.u - 1, this.t - 1, w);
    paramCanvas.drawLine(1.0F, this.y * 2, this.u - 1, this.y * 2, w);
    int i1 = 1;
    while (i1 < this.u - 3)
    {
      paramCanvas.drawLine(i1, this.y, i1, this.y + 1, w);
      i1 += 6;
    }
    i1 = 1;
    while (i1 < this.u - 3)
    {
      paramCanvas.drawLine(i1, this.y * 3, i1, this.y * 3 + 1, w);
      i1 += 6;
    }
    i1 = 1;
    while (i1 <= 3)
    {
      int i3 = (this.u - 2) / 4 * i1 + 1;
      int i2 = 1;
      while (i2 < this.t + 0 - 1)
      {
        paramCanvas.drawLine(0 + i3, i2, 0 + i3, i2 + 1, w);
        i2 += 9;
      }
      i1 += 1;
    }
  }
  
  public void a(y paramy)
  {
    c();
    postInvalidate();
  }
  
  public void b()
  {
    this.p = 0;
    this.q = 0;
    this.n = 0;
    this.m = null;
    this.j = 0;
    this.f = null;
    this.g = null;
  }
  
  public void b(Canvas paramCanvas)
  {
    if ((this.f == null) || (this.g == null) || (this.p == 0)) {
      return;
    }
    a();
    float f1 = b(this.g[0] - this.q, this.p - this.q);
    this.z.setShader(new LinearGradient(1.0F, this.t - 1, 1.0F, 1.0F, getResources().getColor(2131493300), getResources().getColor(2131493300), Shader.TileMode.MIRROR));
    this.s.moveTo(1.0F, this.t - 1);
    this.s.lineTo(1.0F, f1);
    int i1 = 0;
    if (i1 < this.n)
    {
      f1 = (this.u - 2 - 1) * 1.0F * i1 / this.o + 1.0F;
      float f2 = b(this.g[i1] - this.q, this.p - this.q);
      float f3 = b(this.f[i1] - this.q, this.p - this.q);
      if (i1 == 0)
      {
        this.d.moveTo(f1, f2);
        this.e.moveTo(f1, f3);
      }
      for (;;)
      {
        i1 += 1;
        break;
        this.d.lineTo(f1, 0 + f2 + 2.0F);
        this.e.lineTo(f1, f3 + 0 + 2.0F);
        this.s.lineTo(f1, f2 + 0 + 2.0F);
      }
    }
    this.s.lineTo(1.0F + (this.u - 2 - 1) * 1.0F * this.n / this.o, this.t - 1);
    this.s.close();
    a(paramCanvas);
    a.d.setAntiAlias(true);
    a.d.setStyle(Paint.Style.STROKE);
    a.d.setColor(this.c);
    a.d.setStrokeWidth(2.0F);
    paramCanvas.drawPath(this.d, a.d);
    a.d.setColor(this.b);
    paramCanvas.drawPath(this.e, a.d);
  }
  
  public void getMaxAndMinValue()
  {
    if (this.f == null) {}
    for (;;)
    {
      return;
      this.p = Integer.MIN_VALUE;
      this.q = Integer.MAX_VALUE;
      this.r = Integer.MIN_VALUE;
      int i1 = 0;
      while (i1 < this.n)
      {
        if (this.f[i1] > this.p) {
          this.p = this.f[i1];
        }
        if (this.f[i1] < this.q) {
          this.q = this.f[i1];
        }
        if (this.f[i1] > this.p) {
          this.p = this.f[i1];
        }
        if (this.f[i1] < this.q) {
          this.q = this.f[i1];
        }
        i1 += 1;
      }
      int i2 = Math.max(Math.abs(this.p - this.k), Math.abs(this.q - this.k));
      i1 = i2;
      if (i2 == this.k) {
        i1 = 28;
      }
      i2 = this.k;
      if (i2 == 0) {
        this.p = 2;
      }
      for (this.q = 0; this.r < 2; this.q = (i2 - i1 * i2 / 100))
      {
        this.r = 2;
        return;
        i1 = i1 * 100 / i2 + 1;
        this.p = (i2 * i1 / 100 + i2);
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
    b(paramCanvas);
    c(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.u = paramInt1;
    this.t = paramInt2;
    this.y = ((paramInt2 - 1) / 4);
  }
  
  public void set2942TotalPoint(int paramInt)
  {
    this.o = paramInt;
  }
  
  public void setClosePrice(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void setData(int[] paramArrayOfInt)
  {
    this.g = paramArrayOfInt;
  }
  
  public void setDataAverage(int[] paramArrayOfInt)
  {
    this.f = paramArrayOfInt;
  }
  
  public void setDataCj(int[] paramArrayOfInt)
  {
    this.i = paramArrayOfInt;
  }
  
  public void setDataTimes(int[] paramArrayOfInt)
  {
    this.h = paramArrayOfInt;
  }
  
  public void setDetailstag(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void setLength(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void setTradeData(int[] paramArrayOfInt)
  {
    this.m = paramArrayOfInt;
  }
  
  public void setdecLen(int paramInt)
  {
    this.l = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MinutePriceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */