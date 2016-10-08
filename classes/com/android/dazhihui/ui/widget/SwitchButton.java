package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;

public class SwitchButton
  extends View
{
  Paint a = new Paint();
  public li b;
  private RectF c;
  private RectF d;
  private String e = "券商登录";
  private String f = "理财";
  private Paint g;
  private Paint h;
  private int i = -8682086;
  private int j = -1;
  private float k;
  private float l;
  private float m;
  private float n;
  private float o = 0.0F;
  private boolean p = false;
  private float q = 0.0F;
  private int r = 0;
  private int s;
  
  public SwitchButton(Context paramContext)
  {
    super(paramContext);
    c();
  }
  
  public SwitchButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.l = TypedValue.applyDimension(1, 19.0F, paramContext.getResources().getDisplayMetrics());
    this.k = TypedValue.applyDimension(1, 15.0F, paramContext.getResources().getDisplayMetrics());
    this.m = TypedValue.applyDimension(1, 17.0F, paramContext.getResources().getDisplayMetrics());
    this.n = TypedValue.applyDimension(1, 30.0F, paramContext.getResources().getDisplayMetrics());
    this.r = 0;
    c();
  }
  
  private void c()
  {
    this.c = new RectF();
    this.d = new RectF();
    this.h = new Paint();
    this.h.setStyle(Paint.Style.FILL_AND_STROKE);
    this.h.setAntiAlias(true);
    this.h.setColor(this.j);
    this.h.setTextSize(this.l);
    this.h.setTextAlign(Paint.Align.LEFT);
    this.g = new Paint();
    this.g.setColor(this.i);
    this.g.setAntiAlias(true);
    this.g.setStyle(Paint.Style.FILL_AND_STROKE);
    this.g.setTextSize(this.k);
    this.g.setTextAlign(Paint.Align.LEFT);
  }
  
  private void c(int paramInt)
  {
    this.s = paramInt;
    if (this.b != null) {
      this.b.a(paramInt);
    }
  }
  
  protected int a(int paramInt)
  {
    int i3 = View.MeasureSpec.getMode(paramInt);
    int i1 = View.MeasureSpec.getSize(paramInt);
    if (i3 == 1073741824)
    {
      paramInt = i1;
      return paramInt;
    }
    float f1;
    if (this.h.descent() > this.g.descent())
    {
      f1 = this.h.descent();
      label50:
      if (this.h.ascent() <= this.g.ascent()) {
        break label122;
      }
    }
    label122:
    for (float f2 = this.h.ascent();; f2 = this.g.ascent())
    {
      int i2 = (int)(f1 + (getPaddingTop() + getPaddingBottom()) - f2);
      paramInt = i2;
      if (i3 != Integer.MIN_VALUE) {
        break;
      }
      return Math.min(i2, i1);
      f1 = this.g.descent();
      break label50;
    }
  }
  
  public void a()
  {
    a(this.c.width(), this.c.height(), true);
    c(0);
    invalidate();
  }
  
  protected void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.d.set(paramFloat1 / 2.0F, 0.0F, paramFloat1, paramFloat2);
      return;
    }
    this.d.set(0.0F, 0.0F, paramFloat1 / 2.0F, paramFloat2);
  }
  
  protected int b(int paramInt)
  {
    getSuggestedMinimumWidth();
    int i3 = View.MeasureSpec.getMode(paramInt);
    int i1 = View.MeasureSpec.getSize(paramInt);
    if (i3 == 1073741824)
    {
      paramInt = i1;
      return paramInt;
    }
    float f1;
    if (this.h.measureText(this.e) > this.g.measureText(this.e))
    {
      f1 = this.h.measureText(this.e);
      label67:
      if (this.h.measureText(this.f) <= this.g.measureText(this.f)) {
        break label164;
      }
    }
    label164:
    for (float f2 = this.h.measureText(this.f);; f2 = this.g.measureText(this.f))
    {
      int i2 = (int)((f1 + f2) * 1.3F + this.n + getPaddingLeft() + getPaddingRight());
      paramInt = i2;
      if (i3 != Integer.MIN_VALUE) {
        break;
      }
      return Math.min(i2, i1);
      f1 = this.g.measureText(this.e);
      break label67;
    }
  }
  
  public void b()
  {
    a(this.c.width(), this.c.height(), false);
    c(1);
    invalidate();
  }
  
  public String getLeftText()
  {
    return this.e;
  }
  
  public String getRightText()
  {
    return this.f;
  }
  
  public int getSidePosition()
  {
    return this.s;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    String str1;
    String str2;
    label31:
    float f3;
    float f4;
    float f5;
    float f6;
    float f7;
    float f1;
    float f8;
    float f9;
    float f10;
    if (this.s == 0)
    {
      str1 = this.f;
      if (this.s != 0) {
        break label298;
      }
      str2 = this.e;
      f3 = (getHeight() - getPaddingBottom() - getPaddingTop()) / 2 - (this.h.descent() + this.h.ascent()) / 2.0F;
      f4 = (this.l - this.k) / 2.0F;
      f2 = this.d.left;
      f5 = this.d.width();
      f6 = this.h.measureText(str2);
      f7 = this.n / 2.0F;
      this.g.measureText(this.f);
      f1 = this.c.width() / 2.0F + this.n / 2.0F;
      f8 = this.g.measureText(this.e);
      f9 = this.c.width() / 2.0F;
      f10 = this.n / 2.0F;
      if (this.s != 0) {
        break label307;
      }
      label185:
      if (this.s == 0) {
        break label319;
      }
    }
    label298:
    label307:
    label319:
    for (float f2 = this.c.width() / 2.0F + this.n / 2.0F;; f2 = f2 + f5 - f6 - f7)
    {
      paramCanvas.drawText(str1, f1, f3 - f4, this.g);
      paramCanvas.drawText(str2, f2, f3, this.h);
      paramCanvas.drawLine(this.c.width() / 2.0F, (getHeight() - this.m) / 2.0F, this.c.width() / 2.0F, (getHeight() + this.m) / 2.0F, this.g);
      return;
      str1 = this.e;
      break;
      str2 = this.f;
      break label31;
      f1 = f9 - f8 - f10;
      break label185;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    setMeasuredDimension(b(paramInt1), a(paramInt2));
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.c.set(0.0F, 0.0F, paramInt1, paramInt2);
    this.o = Math.max(paramInt1 / 4, 2);
    float f1 = paramInt1;
    float f2 = paramInt2;
    if (this.r == 0) {}
    for (boolean bool = true;; bool = false)
    {
      a(f1, f2, bool);
      invalidate();
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    if (!isEnabled()) {
      return true;
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      return true;
    case 0: 
      if (!this.c.contains(f1, f2)) {
        return false;
      }
      this.q = f1;
      if (this.q < this.c.width() / 2.0F) {
        bool = true;
      }
      this.p = bool;
      return true;
    }
    if (Math.abs(f1 - this.q) >= this.o)
    {
      if (this.p)
      {
        b();
        return true;
      }
      a();
      return true;
    }
    if (this.p)
    {
      a();
      return true;
    }
    b();
    return true;
  }
  
  public void setBackFontSize(int paramInt)
  {
    this.k = paramInt;
    requestLayout();
  }
  
  public void setBackTextColor(int paramInt)
  {
    this.i = paramInt;
    if (this.g != null) {
      this.g.setColor(this.i);
    }
  }
  
  public void setFrontFontSize(int paramInt)
  {
    this.l = paramInt;
    requestLayout();
  }
  
  public void setFrontTextColor(int paramInt)
  {
    this.j = paramInt;
    if (this.h != null) {
      this.h.setColor(this.j);
    }
  }
  
  public void setInitialSelectedSide(int paramInt)
  {
    this.r = paramInt;
    invalidate();
  }
  
  public void setLeftText(String paramString)
  {
    this.e = paramString;
    requestLayout();
  }
  
  public void setRightText(String paramString)
  {
    this.f = paramString;
    requestLayout();
  }
  
  public void setTextButtonSwitchListener(li paramli)
  {
    this.b = paramli;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\SwitchButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */