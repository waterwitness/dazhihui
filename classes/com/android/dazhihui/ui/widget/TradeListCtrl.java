package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;

public class TradeListCtrl
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
  private String[] j;
  private String[] k;
  private int[] l;
  private int[] m;
  private int n = 1;
  
  public TradeListCtrl(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TradeListCtrl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = (WindowManager)paramContext.getSystemService("window");
    this.e = new DisplayMetrics();
    paramAttributeSet.getDefaultDisplay().getMetrics(this.e);
    paramContext = paramContext.getResources();
    this.c = paramContext.getDimensionPixelSize(2131230904);
    this.d = paramContext.getDimensionPixelSize(2131231088);
  }
  
  private String a(String paramString1, String paramString2)
  {
    if ((paramString1.equals("-")) || (paramString2.equals("-")) || (paramString2.equals("0"))) {
      return "-";
    }
    int i1 = Integer.parseInt(paramString1) * 10 / Integer.parseInt(paramString2);
    if (i1 > 999) {
      return String.valueOf(i1 / 10);
    }
    if (i1 > 9)
    {
      paramString1 = new StringBuffer();
      paramString1.append(i1 / 10).append(".").append(i1 % 10);
      return paramString1.toString();
    }
    paramString1 = new StringBuffer();
    paramString1.append("0.").append(i1);
    return paramString1.toString();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    a.c(0, 0, this.a, this.b, paramCanvas);
    a.a.setColor(-14277082);
    int i3 = this.b - 2;
    int i1 = this.a / 2;
    int i2 = i3 / 2;
    int i4 = this.c;
    Object localObject = new Paint(1);
    ((Paint)localObject).setTextSize(this.c);
    ((Paint)localObject).setColor(-14079703);
    ((Paint)localObject).setFakeBoldText(true);
    a.a("卖 一", 0 + i1, 0 + (i2 - i4 >> 1), Paint.Align.CENTER, paramCanvas, (Paint)localObject);
    i1 = this.a / 2;
    i2 = i3 / 2;
    a.a("买 一", 0 + i1, (i3 / 2 - this.d >> 1) + (i2 + 0), Paint.Align.CENTER, paramCanvas, (Paint)localObject);
    a.d.setColor(-10000537);
    a.b(0, i3 / 2 + 0, this.a + 0 - 2, i3 / 2 + 0, paramCanvas);
    ((Paint)localObject).setTextSize(this.d);
    ((Paint)localObject).setFakeBoldText(false);
    String str;
    int i7;
    int i8;
    int i9;
    int i5;
    int i6;
    if (this.f != null)
    {
      str = a(this.k[19], this.f[1]) + "手/笔";
      i7 = a.b("卖一" + this.f[0], this.d);
      i8 = a.b(this.k[19] + "", this.d);
      i9 = a.b(this.f[1] + "笔", this.d);
      i1 = a.b(str, this.d);
      this.n = 1;
      if (i3 / 2 - this.n * 7 - this.d * 7 >= 0) {
        break label1143;
      }
      this.n -= 1;
      i4 = this.n;
      i5 = this.n;
      i6 = this.d;
      i2 = (this.a - i7 - i8 - i9 - i1) / 5;
      i1 = i2;
      if (i2 <= 0)
      {
        ((Paint)localObject).setTextSize(this.d - 2);
        i1 = 2;
      }
      i2 = this.b / 2 - this.d - 5;
      ((Paint)localObject).setColor(-4144960);
      a.a("卖一", i1, i2, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      ((Paint)localObject).setColor(this.m[9]);
      a.a(this.f[0], i1 + this.d * 2, i2, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      ((Paint)localObject).setColor(65362);
      a.a(this.k[19], i1 * 2 + i7, i2, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      ((Paint)localObject).setColor(-4144960);
      a.a(this.f[1] + "笔", i1 * 3 + i7 + i8, i2, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      ((Paint)localObject).setColor(-4144960);
      a.a(str, i1 * 4 + i7 + i8 + i9, i2, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      if (this.g != null)
      {
        i1 = 0;
        label647:
        if ((i1 < 24) && (i1 < this.g.length)) {
          break label1156;
        }
      }
    }
    if (this.h != null)
    {
      str = a(this.j[1], this.h[1]) + "手/笔";
      i8 = a.b("买一" + this.h[0], this.d);
      i9 = a.b(this.j[1] + "", this.d);
      int i10 = a.b(this.h[1] + "笔", this.d);
      i1 = a.b(str, this.d);
      this.n = 1;
      label820:
      if (i3 / 2 - this.n * 7 - this.d * 7 >= 0) {
        break label1222;
      }
      this.n -= 1;
      i4 = this.n;
      i5 = this.d;
      i6 = this.n;
      i7 = this.d;
      i2 = (this.a - i8 - i9 - i10 - i1) / 5;
      i1 = i2;
      if (i2 <= 0)
      {
        ((Paint)localObject).setTextSize(this.d - 2);
        i1 = 2;
      }
      ((Paint)localObject).setColor(-4144960);
      a.a("买一", i1, this.b / 2 + 5, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      ((Paint)localObject).setColor(this.l[0]);
      a.a(this.h[0], i1 + this.d * 2, this.b / 2 + 5, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      ((Paint)localObject).setColor(65362);
      a.a(this.j[1], i1 * 2 + i8, this.b / 2 + 5, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      ((Paint)localObject).setColor(-4144960);
      a.a(this.h[1] + "笔", i1 * 3 + i8 + i9, this.b / 2 + 5, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      ((Paint)localObject).setColor(-4144960);
      a.a(str, i1 * 4 + i8 + i9 + i10, this.b / 2 + 5, Paint.Align.LEFT, paramCanvas, (Paint)localObject);
      if (this.i != null) {
        i1 = 0;
      }
    }
    for (;;)
    {
      if ((i1 >= 24) || (i1 >= this.i.length))
      {
        return;
        label1143:
        this.n += 1;
        break;
        label1156:
        a.b.setColor(-16711936);
        b.b(paramCanvas, this.g[i1], i1 % 4 * (this.a / 4) + 10, 0 + i4 + i1 / 4 % 7 * (i5 + i6), 20, this.d);
        i1 += 1;
        break label647;
        label1222:
        this.n += 1;
        break label820;
      }
      a.b.setColor(-44462);
      localObject = this.i[i1];
      i2 = this.a / 4;
      i8 = i3 / 2;
      b.b(paramCanvas, (String)localObject, i1 % 4 * i2 + 10, i1 / 4 % 7 * (i6 + i7) + (0 + (i4 + i5) + i8), 20, this.d);
      i1 += 1;
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
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\TradeListCtrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */