package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.GridView;

public class CustomPopGridView
  extends GridView
{
  private int a;
  private int b;
  private int c;
  private int d;
  private Paint e = new Paint(1);
  
  public CustomPopGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext.getResources().getDimensionPixelOffset(2131230773);
    this.b = paramContext.getResources().getDimensionPixelOffset(2131230837);
  }
  
  public CustomPopGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext.getResources().getDimensionPixelOffset(2131230773);
    this.b = paramContext.getResources().getDimensionPixelOffset(2131230837);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    int k = getChildCount();
    this.e.setColor(-7829368);
    this.e.setStrokeWidth(this.a / 2);
    int i = 0;
    View localView;
    if (i < k)
    {
      localView = getChildAt(i);
      if (i == 0) {
        break label86;
      }
    }
    label86:
    for (int j = localView.getTop();; j = 0)
    {
      paramCanvas.drawLine(0.0F, j, this.d, j, this.e);
      i += 1;
      break;
      return;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CustomPopGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */