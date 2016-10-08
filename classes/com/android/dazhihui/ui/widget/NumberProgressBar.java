package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;

public class NumberProgressBar
  extends View
{
  private float A = this.n;
  private boolean B = true;
  private boolean C = true;
  private boolean D = true;
  private int E = 4098;
  private float F = 2.0F;
  private float G = 2.0F;
  private float H = 2.0F;
  private jj I;
  private int a = 100;
  private int b = 0;
  private int c = -14440461;
  private int d = -3223858;
  private int e = -1052689;
  private float f = this.o;
  private float g = this.p;
  private float h = this.q;
  private String i = "%";
  private String j = "";
  private final int k = Color.rgb(66, 145, 241);
  private final int l = Color.rgb(66, 145, 241);
  private final int m = Color.rgb(204, 204, 204);
  private final float n = a(3.0F);
  private final float o = b(10.0F);
  private final float p = 36.0F;
  private final float q = this.p + this.F * 2.0F;
  private float r;
  private float s;
  private float t;
  private String u;
  private Paint v;
  private Paint w;
  private Paint x;
  private RectF y = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
  private RectF z = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
  
  public NumberProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NumberProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setProgress(0);
    setMax(100);
    a();
  }
  
  private int a(int paramInt, boolean paramBoolean)
  {
    int i2 = View.MeasureSpec.getMode(paramInt);
    int i3 = View.MeasureSpec.getSize(paramInt);
    if (paramBoolean) {}
    for (paramInt = getPaddingLeft() + getPaddingRight(); i2 == 1073741824; paramInt = getPaddingTop() + getPaddingBottom()) {
      return i3;
    }
    if (paramBoolean) {}
    for (int i1 = getSuggestedMinimumWidth();; i1 = getSuggestedMinimumHeight())
    {
      paramInt = i1 + paramInt;
      if (i2 != Integer.MIN_VALUE) {
        return paramInt;
      }
      if (!paramBoolean) {
        break;
      }
      return Math.max(paramInt, i3);
    }
    return Math.min(paramInt, i3);
    return paramInt;
  }
  
  private void a()
  {
    this.v = new Paint(1);
    this.v.setColor(this.c);
    this.w = new Paint(1);
    this.w.setColor(this.d);
    this.x = new Paint(1);
    this.x.setColor(this.e);
    this.x.setTextSize(this.f);
  }
  
  private void b()
  {
    this.z.left = getPaddingLeft();
    this.z.top = (getHeight() / 2.0F - this.g / 2.0F);
    this.z.right = ((getWidth() - getPaddingLeft() - getPaddingRight()) / (getMax() * 1.0F) * getProgress() + getPaddingLeft());
    this.z.bottom = (getHeight() / 2.0F + this.g / 2.0F);
    this.y.left = this.z.right;
    this.y.right = (getWidth() - getPaddingRight());
    this.y.top = (getHeight() / 2.0F + -this.h / 2.0F);
    this.y.bottom = (getHeight() / 2.0F + this.h / 2.0F);
  }
  
  private void c()
  {
    this.u = String.format("%d", new Object[] { Integer.valueOf(getProgress() * 100 / getMax()) });
    this.u = (this.j + this.u + this.i);
    this.r = this.x.measureText(this.u);
    if (getProgress() == 0)
    {
      this.C = false;
      this.s = (getPaddingLeft() + this.F);
      this.t = ((int)(getHeight() / 2.0F - (this.x.descent() + this.x.ascent()) / 2.0F));
      if (this.s + this.r >= getWidth() - getPaddingRight())
      {
        this.s = (getWidth() - getPaddingRight() - this.r);
        this.z.right = (this.s - this.A);
      }
      if (this.E != 4098) {
        break label459;
      }
      f1 = getPaddingLeft();
      this.B = true;
      this.y.left = f1;
      this.y.right = (getWidth() - getPaddingRight());
      this.y.top = (getHeight() / 2.0F + -this.h / 2.0F);
      this.y.bottom = (getHeight() / 2.0F + this.h / 2.0F);
    }
    label459:
    while (this.E != 4097)
    {
      return;
      this.C = true;
      this.z.left = (getPaddingLeft() + this.F);
      this.z.top = (getHeight() / 2.0F - this.g / 2.0F);
      this.z.right = ((getWidth() - getPaddingLeft() - getPaddingRight()) / (getMax() * 1.0F) * getProgress() + getPaddingLeft() - this.F);
      this.z.bottom = (getHeight() / 2.0F + this.g / 2.0F);
      this.s = (this.z.right - this.A * 2.0F - this.r);
      if (this.s > getPaddingLeft() + this.F) {
        break;
      }
      this.s = (this.z.right + this.A * 2.0F);
      break;
    }
    float f1 = this.s + this.r + this.A;
    if (f1 >= getWidth() - getPaddingRight())
    {
      this.B = false;
      return;
    }
    this.B = true;
    this.y.left = f1;
    this.y.right = (getWidth() - getPaddingRight());
    this.y.top = (getHeight() / 2.0F + -this.h / 2.0F);
    this.y.bottom = (getHeight() / 2.0F + this.h / 2.0F);
  }
  
  public float a(float paramFloat)
  {
    return getResources().getDisplayMetrics().density * paramFloat + 0.5F;
  }
  
  public float b(float paramFloat)
  {
    return getResources().getDisplayMetrics().scaledDensity * paramFloat;
  }
  
  public int getMax()
  {
    return this.a;
  }
  
  public String getPrefix()
  {
    return this.j;
  }
  
  public int getProgress()
  {
    return this.b;
  }
  
  public float getProgressTextSize()
  {
    return this.f;
  }
  
  public boolean getProgressTextVisibility()
  {
    return this.D;
  }
  
  public int getReachedBarColor()
  {
    return this.c;
  }
  
  public float getReachedBarHeight()
  {
    return this.g;
  }
  
  public String getSuffix()
  {
    return this.i;
  }
  
  protected int getSuggestedMinimumHeight()
  {
    return Math.max((int)this.f, Math.max((int)this.g, (int)this.h));
  }
  
  protected int getSuggestedMinimumWidth()
  {
    return (int)this.f;
  }
  
  public int getTextColor()
  {
    return this.e;
  }
  
  public int getUnreachedBarColor()
  {
    return this.d;
  }
  
  public float getUnreachedBarHeight()
  {
    return this.h;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.D) {
      c();
    }
    for (;;)
    {
      if (this.B) {
        paramCanvas.drawRoundRect(this.y, this.G, this.G, this.w);
      }
      if (this.C) {
        paramCanvas.drawRoundRect(this.z, this.H, this.H, this.v);
      }
      if (this.D) {
        paramCanvas.drawText(this.u, this.s, this.t, this.x);
      }
      return;
      b();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(a(paramInt1, true), a(paramInt2, false));
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      Bundle localBundle = (Bundle)paramParcelable;
      this.e = localBundle.getInt("text_color");
      this.f = localBundle.getFloat("text_size");
      this.g = localBundle.getFloat("reached_bar_height");
      this.h = localBundle.getFloat("unreached_bar_height");
      this.c = localBundle.getInt("reached_bar_color");
      this.d = localBundle.getInt("unreached_bar_color");
      a();
      setMax(localBundle.getInt("max"));
      setProgress(localBundle.getInt("progress"));
      setPrefix(localBundle.getString("prefix"));
      setSuffix(localBundle.getString("suffix"));
      if (localBundle.getBoolean("text_visibility")) {}
      for (paramParcelable = jk.a;; paramParcelable = jk.b)
      {
        setProgressTextVisibility(paramParcelable);
        super.onRestoreInstanceState(localBundle.getParcelable("saved_instance"));
        return;
      }
    }
    super.onRestoreInstanceState(paramParcelable);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("saved_instance", super.onSaveInstanceState());
    localBundle.putInt("text_color", getTextColor());
    localBundle.putFloat("text_size", getProgressTextSize());
    localBundle.putFloat("reached_bar_height", getReachedBarHeight());
    localBundle.putFloat("unreached_bar_height", getUnreachedBarHeight());
    localBundle.putInt("reached_bar_color", getReachedBarColor());
    localBundle.putInt("unreached_bar_color", getUnreachedBarColor());
    localBundle.putInt("max", getMax());
    localBundle.putInt("progress", getProgress());
    localBundle.putString("suffix", getSuffix());
    localBundle.putString("prefix", getPrefix());
    localBundle.putBoolean("text_visibility", getProgressTextVisibility());
    return localBundle;
  }
  
  public void setMax(int paramInt)
  {
    if (paramInt > 0)
    {
      this.a = paramInt;
      invalidate();
    }
  }
  
  public void setOnProgressBarListener(jj paramjj)
  {
    this.I = paramjj;
  }
  
  public void setPrefix(String paramString)
  {
    if (paramString == null)
    {
      this.j = "";
      return;
    }
    this.j = paramString;
  }
  
  public void setProgress(int paramInt)
  {
    if ((paramInt <= getMax()) && (paramInt >= 0))
    {
      this.b = paramInt;
      invalidate();
    }
  }
  
  public void setProgressTextColor(int paramInt)
  {
    this.e = paramInt;
    this.x.setColor(this.e);
    invalidate();
  }
  
  public void setProgressTextSize(float paramFloat)
  {
    this.f = paramFloat;
    this.x.setTextSize(this.f);
    invalidate();
  }
  
  public void setProgressTextVisibility(jk paramjk)
  {
    if (paramjk == jk.a) {}
    for (boolean bool = true;; bool = false)
    {
      this.D = bool;
      invalidate();
      return;
    }
  }
  
  public void setReachedBarColor(int paramInt)
  {
    this.c = paramInt;
    this.v.setColor(this.c);
    invalidate();
  }
  
  public void setReachedBarHeight(float paramFloat)
  {
    this.g = paramFloat;
  }
  
  public void setSuffix(String paramString)
  {
    if (paramString == null)
    {
      this.i = "";
      return;
    }
    this.i = paramString;
  }
  
  public void setUnreachedBarColor(int paramInt)
  {
    this.d = paramInt;
    this.w.setColor(this.c);
    invalidate();
  }
  
  public void setUnreachedBarHeight(float paramFloat)
  {
    this.h = paramFloat;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\NumberProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */