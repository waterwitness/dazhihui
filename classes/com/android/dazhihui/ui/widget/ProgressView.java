package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.d.a;

public class ProgressView
  extends View
{
  public boolean a = false;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  
  public ProgressView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ProgressView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (!this.a) {
      return;
    }
    paramCanvas.save();
    super.onDraw(paramCanvas);
    a.c(this.c, this.d, this.e, this.f, paramCanvas);
    a.b(this.c, this.d, this.e, this.f, -7829368, paramCanvas);
    a.b(this.c, this.d, this.e * (this.b * 100 / 100) / 100, this.f, 65280, paramCanvas);
    a.a(this.c, this.d, this.e * (this.b * 100 / 100) / 100, this.f, 6, 6, 65280, paramCanvas);
    paramCanvas.restore();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (View.MeasureSpec.getMode(paramInt2) != 1073741824) {
      paramInt1 = 6;
    }
    setMeasuredDimension(i, paramInt1);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.c = 0;
    this.d = 0;
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  public void setProgress(int paramInt)
  {
    this.b = paramInt;
    postInvalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ProgressView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */