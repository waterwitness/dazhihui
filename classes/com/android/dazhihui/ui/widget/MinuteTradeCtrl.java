package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import com.android.dazhihui.ui.screen.y;

public class MinuteTradeCtrl
  extends View
{
  private int a;
  private int b;
  private int c = 0;
  private int d = 0;
  private DisplayMetrics e = null;
  private String[] f;
  private String[] g;
  private String[] h;
  private String[] i;
  private int j;
  private int k = 4;
  private int l;
  private int m;
  private int n = -10000537;
  private int o;
  private int p;
  private Bitmap q;
  private Bitmap r;
  
  public MinuteTradeCtrl(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinuteTradeCtrl(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinuteTradeCtrl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = (WindowManager)paramContext.getSystemService("window");
    this.e = new DisplayMetrics();
    paramAttributeSet.getDefaultDisplay().getMetrics(this.e);
    paramAttributeSet = paramContext.getResources();
    this.c = paramAttributeSet.getDimensionPixelSize(2131230904);
    this.d = paramAttributeSet.getDimensionPixelSize(2131231088);
    this.j = paramAttributeSet.getDimensionPixelSize(2131230829);
    this.l = getResources().getColor(2131493296);
    this.q = BitmapFactory.decodeResource(paramContext.getResources(), 2130838392);
    this.r = BitmapFactory.decodeResource(paramContext.getResources(), 2130838393);
    a(g.a().b());
  }
  
  public void a()
  {
    this.g = null;
    this.i = null;
    postInvalidate();
  }
  
  public void a(Canvas paramCanvas)
  {
    a.a.setColor(this.n);
    a.a(2, 1, this.a - 2, this.b - 2, paramCanvas);
    a.d.setColor(-10000537);
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a)
    {
      this.m = getResources().getColor(2131493677);
      this.n = -10000537;
      this.p = -1369560;
    }
    for (this.o = -11753174;; this.o = -11753174)
    {
      postInvalidate();
      return;
      this.m = -14540254;
      this.n = -2697514;
      this.p = -1099463;
    }
  }
  
  public void a(String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String[] paramArrayOfString4)
  {
    this.f = paramArrayOfString1;
    this.g = paramArrayOfString2;
    this.h = paramArrayOfString3;
    this.i = paramArrayOfString4;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    a.c(0, 0, this.a, this.b, paramCanvas);
    a(paramCanvas);
    a.a.setColor(-14277082);
    Paint localPaint = new Paint(1);
    localPaint.setTextSize(this.c);
    localPaint.setColor(-14079703);
    localPaint.setFakeBoldText(true);
    localPaint.setTextSize(this.d);
    localPaint.setFakeBoldText(false);
    int i1 = (this.b - this.d * 4) / 5;
    a.b.setTextSize(this.d);
    a.b.setColor(this.m);
    a.a("买", this.a / 2, i1, Paint.Align.CENTER, paramCanvas, a.b);
    a.a("卖", this.a / 2, i1 * 2 + this.d, Paint.Align.CENTER, paramCanvas, a.b);
    a.a("队", this.a / 2, i1 * 3 + this.d * 2, Paint.Align.CENTER, paramCanvas, a.b);
    a.a("列", this.a / 2, i1 * 4 + this.d * 3, Paint.Align.CENTER, paramCanvas, a.b);
    if ((this.g == null) && (this.i == null)) {}
    label367:
    label641:
    label757:
    for (;;)
    {
      return;
      int i5 = a.a("买", a.b);
      int i3 = (this.a / 2 - i5 / 2 - this.j * 2) / 4;
      int i4 = (this.b - this.j * 2) / this.k;
      int i6;
      int i2;
      if ((this.f != null) && (this.g != null))
      {
        i6 = this.j;
        i1 = this.j;
        i2 = 0;
        if (i2 < this.k * 4) {
          if (i2 - 1 < this.g.length) {}
        }
      }
      for (;;)
      {
        if (this.h == null) {
          break label757;
        }
        i5 = this.a / 2 + i5 / 2 + this.j;
        if (this.i == null) {
          break;
        }
        i2 = 0;
        if ((i2 < this.k * 4) && (i2 - 1 < this.i.length))
        {
          a.b.setColor(this.p);
          if (i2 != 0) {
            break label641;
          }
          b.b(paramCanvas, "买一", i5 + i2 % 4 * i3, i2 / 4 % this.k * i4 + (i1 + 0), 4, this.d);
        }
        for (;;)
        {
          i2 += 1;
          break label367;
          break;
          a.b.setColor(this.o);
          if (i2 == 0) {
            b.b(paramCanvas, "卖一", i2 % 4 * i3 + i6 + i3, i2 / 4 % this.k * i4 + (i1 + 0), 8, this.d);
          }
          for (;;)
          {
            i2 += 1;
            break;
            if ((this.k == 4) && (i2 == this.k * 4 - 1)) {
              paramCanvas.drawBitmap(this.r, i2 % 4 * i3 + i6 + i3 - this.r.getWidth(), i1 + 0 + i2 / 4 % this.k * i4, a.b);
            } else {
              b.b(paramCanvas, this.g[(i2 - 1)], i2 % 4 * i3 + i6 + i3, i2 / 4 % this.k * i4 + (i1 + 0), 8, this.d);
            }
          }
          if ((this.k == 4) && (i2 == this.k * 4 - 1)) {
            paramCanvas.drawBitmap(this.q, i2 % 4 * i3 + i5, i1 + 0 + i2 / 4 % this.k * i4, a.b);
          } else {
            b.b(paramCanvas, this.i[(i2 - 1)], i5 + i2 % 4 * i3, i2 / 4 % this.k * i4 + (i1 + 0), 4, this.d);
          }
        }
        continue;
        i1 = 0;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i2 == 1073741824) {
      if (i1 != 1073741824) {
        break label62;
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      return;
      paramInt1 = Math.min((int)(this.e.widthPixels * 0.65D), paramInt1);
      break;
      label62:
      paramInt2 = Math.min((int)(this.e.widthPixels * 0.6D), paramInt2);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void setLine(int paramInt)
  {
    this.k = paramInt;
    postInvalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MinuteTradeCtrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */