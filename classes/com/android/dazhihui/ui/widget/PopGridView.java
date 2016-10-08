package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import com.android.dazhihui.f;

public class PopGridView
  extends GridView
{
  private int a;
  private int b;
  private int c;
  private int d;
  private Paint e = new Paint(1);
  private int f = -7829368;
  
  public PopGridView(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext.getResources().getDimensionPixelOffset(2131230773);
    this.b = paramContext.getResources().getDimensionPixelOffset(2131230837);
  }
  
  public PopGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext.getResources().getDimensionPixelOffset(2131230773);
    this.b = paramContext.getResources().getDimensionPixelOffset(2131230837);
    this.f = paramContext.obtainStyledAttributes(paramAttributeSet, f.PopGridView).getColor(0, -7829368);
  }
  
  public PopGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext.getResources().getDimensionPixelOffset(2131230773);
    this.b = paramContext.getResources().getDimensionPixelOffset(2131230837);
    this.f = paramContext.obtainStyledAttributes(paramAttributeSet, f.PopGridView).getColor(0, -7829368);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    int j = getChildCount();
    int k = getNumColumns();
    this.e.setColor(this.f);
    this.e.setStrokeWidth(this.a / 2);
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      if ((k != 1) && (i / k == 0) && (i % k != k - 1))
      {
        int m = localView.getRight();
        paramCanvas.drawLine(m, 0.0F, m, this.c, this.e);
      }
      if ((i % k == 0) && (i != 0)) {
        paramCanvas.drawLine(0.0F, localView.getTop(), this.d, localView.getTop(), this.e);
      }
      i += 1;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 != 0)
    {
      this.c = paramInt2;
      this.d = paramInt1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\PopGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */