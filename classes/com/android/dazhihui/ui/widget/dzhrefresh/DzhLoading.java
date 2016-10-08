package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class DzhLoading
  extends View
{
  Rect a = new Rect();
  Rect b = new Rect();
  Runnable c = new e(this);
  private int d = 0;
  private int e = 100;
  private Bitmap f;
  private Bitmap g;
  private Paint h;
  
  public DzhLoading(Context paramContext)
  {
    super(paramContext);
    c();
  }
  
  public DzhLoading(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
  }
  
  public DzhLoading(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c();
  }
  
  private void c()
  {
    this.g = BitmapFactory.decodeResource(getResources(), 2130837702);
    this.f = BitmapFactory.decodeResource(getResources(), 2130837703);
    this.h = new Paint(2);
  }
  
  public void a()
  {
    a(0);
    postDelayed(this.c, this.e);
  }
  
  public void a(int paramInt)
  {
    int i = 100;
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (;;)
    {
      if (paramInt > 100) {
        paramInt = i;
      }
      for (;;)
      {
        this.d = paramInt;
        invalidate();
        return;
      }
    }
  }
  
  public void b()
  {
    removeCallbacks(this.c);
    a(0);
  }
  
  public int getNum()
  {
    return this.d;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    this.a.right = getWidth();
    this.a.bottom = getHeight();
    this.b.right = this.f.getWidth();
    this.b.bottom = this.f.getHeight();
    paramCanvas.drawBitmap(this.f, this.b, this.a, this.h);
    this.a.right = (getWidth() * this.d / 100);
    this.b.right = (this.f.getWidth() * this.d / 100);
    paramCanvas.drawBitmap(this.g, this.b, this.a, this.h);
    super.onDraw(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\DzhLoading.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */