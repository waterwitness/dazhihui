package com.android.dazhihui.ui.widget.flip;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.f;

public class CircleFlowIndicator
  extends View
{
  private float a = 4.0F;
  private float b = 4.0F;
  private float c = 4.0F;
  private float d = 4.0F;
  private int e = 0;
  private final Paint f = new Paint(1);
  private final Paint g = new Paint(1);
  private float h = 0.0F;
  private int i = 0;
  private boolean j = false;
  private ViewFlow k;
  
  public CircleFlowIndicator(Context paramContext)
  {
    super(paramContext);
    a(-1, -1, 1, 0);
  }
  
  public CircleFlowIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, f.CircleFlowIndicator);
    int m = paramContext.getInt(8, 1);
    int n = paramContext.getColor(1, -1);
    int i1 = paramContext.getInt(7, 0);
    int i2 = paramContext.getColor(2, 1157627903);
    this.a = paramContext.getDimension(3, 4.0F);
    this.c = this.a;
    this.b = this.a;
    this.d = paramContext.getDimension(6, 12.0F);
    this.d += 2.0F * this.c;
    this.e = paramContext.getInt(5, 0);
    this.j = paramContext.getBoolean(4, false);
    a(n, i2, m, i1);
  }
  
  private int a(int paramInt)
  {
    int m = View.MeasureSpec.getMode(paramInt);
    int n = View.MeasureSpec.getSize(paramInt);
    if (m == 1073741824) {
      return n;
    }
    paramInt = 0;
    if (this.k != null) {
      paramInt = this.k.getViewsCount();
    }
    if (paramInt == 0) {
      paramInt = getPaddingLeft() + getPaddingRight();
    }
    while (m == Integer.MIN_VALUE)
    {
      return Math.min(paramInt, n);
      if (paramInt == 1)
      {
        paramInt = (int)(getPaddingLeft() + getPaddingRight() + this.a);
      }
      else
      {
        float f1 = getPaddingLeft() + getPaddingRight();
        float f2 = this.a;
        paramInt = (int)((paramInt - 1) * this.d + (f1 + 2.0F * f2));
      }
    }
    return paramInt;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f2;
    float f1;
    switch (paramInt4)
    {
    default: 
      this.f.setStyle(Paint.Style.STROKE);
      f2 = this.f.getStrokeWidth();
      f1 = f2;
      if (f2 == 0.0F) {
        f1 = 1.0F / getResources().getDisplayMetrics().density;
      }
      this.b -= f1 / 2.0F;
      this.f.setColor(paramInt2);
      switch (paramInt3)
      {
      default: 
        this.g.setStyle(Paint.Style.FILL);
      }
      break;
    }
    for (;;)
    {
      this.g.setColor(paramInt1);
      return;
      this.f.setStyle(Paint.Style.FILL);
      break;
      this.g.setStyle(Paint.Style.STROKE);
      f2 = this.f.getStrokeWidth();
      f1 = f2;
      if (f2 == 0.0F) {
        f1 = 1.0F / getResources().getDisplayMetrics().density;
      }
      this.c -= f1 / 2.0F;
    }
  }
  
  private int b(int paramInt)
  {
    int m = View.MeasureSpec.getMode(paramInt);
    paramInt = View.MeasureSpec.getSize(paramInt);
    if (m == 1073741824) {
      return paramInt;
    }
    int n = (int)(2.0F * this.a + getPaddingTop() + getPaddingBottom() + 1.0F);
    if (m == Integer.MIN_VALUE) {
      return Math.min(n, paramInt);
    }
    return n;
  }
  
  public void a(int paramInt, float paramFloat)
  {
    this.i = paramInt;
    this.h = paramFloat;
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int n = 0;
    super.onDraw(paramCanvas);
    if (this.k != null) {}
    for (int m = this.k.getViewsCount();; m = 0)
    {
      if (m < 2) {
        return;
      }
      int i1 = getPaddingLeft();
      while (n < m)
      {
        paramCanvas.drawCircle(i1 + this.a + n * this.d, getPaddingTop() + this.a, this.b, this.f);
        n += 1;
      }
      float f2 = this.i * this.d;
      float f1;
      if (this.i == 0)
      {
        f1 = f2;
        if (this.h < 0.0F) {}
      }
      else if (this.i == this.k.getViewsCount() - 1)
      {
        f1 = f2;
        if (this.h > 0.0F) {}
      }
      else
      {
        f1 = f2 + this.h * this.d;
      }
      paramCanvas.drawCircle(f1 + (i1 + this.a), getPaddingTop() + this.a, this.c, this.g);
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(a(paramInt1), b(paramInt2));
  }
  
  public void setFillColor(int paramInt)
  {
    this.g.setColor(paramInt);
    invalidate();
  }
  
  public void setStrokeColor(int paramInt)
  {
    this.f.setColor(paramInt);
    invalidate();
  }
  
  public void setViewFlow(ViewFlow paramViewFlow)
  {
    this.k = paramViewFlow;
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\CircleFlowIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */