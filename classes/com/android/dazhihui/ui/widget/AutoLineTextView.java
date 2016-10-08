package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class AutoLineTextView
  extends View
{
  public int a = 0;
  public int b = 10;
  public int c = 0;
  private String d = "";
  private String e = "";
  private TextPaint f = new TextPaint();
  private TextPaint g = new TextPaint();
  private boolean h = false;
  private int i = 0;
  private String[] j;
  private float k;
  private float l;
  
  public AutoLineTextView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  public AutoLineTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public AutoLineTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private int a(int paramInt)
  {
    Paint.FontMetrics localFontMetrics = this.f.getFontMetrics();
    float f2 = localFontMetrics.descent - localFontMetrics.ascent;
    float f1 = 0.0F;
    int m = 0;
    if (m < paramInt)
    {
      if (m == 0) {}
      for (f1 = f2;; f1 = f1 + this.b + f2)
      {
        m += 1;
        break;
      }
    }
    return (int)Math.ceil(f1);
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    switch (m)
    {
    case 0: 
    default: 
      return paramInt1;
    case -2147483648: 
      Math.min(paramInt1, paramInt2);
    }
    return paramInt2;
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.f.setAntiAlias(true);
    this.g.setAntiAlias(true);
    this.b = getResources().getDimensionPixelSize(2131230813);
  }
  
  private String[] a(float paramFloat)
  {
    int i1 = 1;
    int i2 = 0;
    int m;
    if (this.a > 0) {
      m = this.a;
    }
    String[] arrayOfString;
    int i4;
    int n;
    for (;;)
    {
      arrayOfString = new String[m];
      i4 = this.d.length();
      n = 0;
      if ((n < i4) && (i2 != m)) {
        break;
      }
      label51:
      return arrayOfString;
      n = (int)Math.ceil((this.l + this.k + this.i) / paramFloat);
      if (n == 1) {
        return new String[] { this.d };
      }
      if (this.c > 0)
      {
        m = n;
        if (n > this.c) {
          m = this.c;
        }
      }
      else
      {
        m = n;
      }
    }
    if (i2 == m - 1) {}
    for (float f1 = paramFloat - this.k - this.i - this.f.measureText("...");; f1 = paramFloat)
    {
      if (this.f.measureText(this.d, n, i1) > f1)
      {
        i1 -= 1;
        arrayOfString[i2] = ((String)this.d.subSequence(n, i1));
        if (i2 == m - 1) {
          arrayOfString[i2] = (arrayOfString[i2] + "...");
        }
        i2 += 1;
        int i3 = i1;
        n = i1;
        i1 = i3;
      }
      for (;;)
      {
        if (i1 == i4)
        {
          arrayOfString[i2] = ((String)this.d.subSequence(n, i1));
          break label51;
        }
        i1 += 1;
        break;
      }
    }
  }
  
  public void a(String paramString, float paramFloat, int paramInt)
  {
    this.f.setColor(paramInt);
    this.f.setTextSize(paramFloat);
    this.d = paramString;
    this.l = this.f.measureText(this.d);
    requestLayout();
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void b(String paramString, float paramFloat, int paramInt)
  {
    if (this.g == null) {
      this.g = new TextPaint();
    }
    this.g.setColor(paramInt);
    this.g.setTextSize(paramFloat);
    this.e = paramString;
    this.k = this.g.measureText(this.e);
    if (this.k == 0.0F) {}
    for (this.i = 0;; this.i = 30)
    {
      requestLayout();
      return;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Paint.FontMetrics localFontMetrics = this.f.getFontMetrics();
    float f3 = localFontMetrics.descent;
    float f4 = localFontMetrics.ascent;
    float f5 = getPaddingLeft();
    float f1 = -localFontMetrics.ascent;
    int m = 0;
    float f2;
    if (m < this.j.length)
    {
      f2 = f1;
      if (m == 0) {
        f2 = f1 + getPaddingTop();
      }
      if (m == 0) {
        break label275;
      }
    }
    label253:
    label275:
    for (f1 = f2 + this.b;; f1 = f2)
    {
      if (this.j[m] != null)
      {
        if (!this.h) {
          break label253;
        }
        localFontMetrics = this.f.getFontMetrics();
        this.f.setStyle(Paint.Style.STROKE);
        paramCanvas.drawRect(f5, localFontMetrics.ascent + f1, this.l + f5, f1 + localFontMetrics.descent, this.f);
        this.f.setStyle(Paint.Style.FILL);
        paramCanvas.drawText(this.j[m], f5, f1, this.f);
      }
      for (;;)
      {
        if (m == this.j.length - 1)
        {
          this.g.getFontMetrics();
          this.g.setStyle(Paint.Style.FILL);
          paramCanvas.drawText(this.e, getWidth() - getPaddingRight() - this.k, f1, this.g);
        }
        m += 1;
        f1 += f3 - f4;
        break;
        paramCanvas.drawText(this.j[m], f5, f1, this.f);
      }
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n = a((int)Math.max(this.l + this.k + this.i + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), paramInt1);
    this.j = a(n);
    int m = a(this.j.length) + getPaddingTop() + getPaddingBottom();
    paramInt1 = m;
    if (this.h) {
      paramInt1 = m + 2;
    }
    setMeasuredDimension(n, a(Math.max(paramInt1, getSuggestedMinimumHeight()), paramInt2));
  }
  
  public void setText(String paramString)
  {
    this.d = paramString;
    this.l = this.f.measureText(this.d);
    requestLayout();
  }
  
  public void setTextColor(int paramInt)
  {
    this.f.setColor(paramInt);
    invalidate();
  }
  
  public void setTextSize(float paramFloat)
  {
    this.f.setTextSize(paramFloat);
    this.l = this.f.measureText(this.d);
    requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\AutoLineTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */