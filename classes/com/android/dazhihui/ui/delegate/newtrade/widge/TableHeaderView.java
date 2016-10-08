package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.d.a;

public class TableHeaderView
  extends View
{
  private Paint a = new Paint();
  private int b;
  private String[] c;
  private int[] d;
  private int e;
  private int f;
  
  public TableHeaderView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public TableHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  private void a()
  {
    this.b = getResources().getDimensionPixelSize(2131230877);
    this.e = getResources().getColor(2131492955);
    this.f = getResources().getColor(2131492961);
  }
  
  public int getTextSize()
  {
    return this.b;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int k = 0;
    super.onDraw(paramCanvas);
    if ((this.c == null) || (this.c.length == 0) || (this.d == null) || (this.d.length == 0)) {
      return;
    }
    int j = 0;
    for (int i = 0; j < this.d.length; i = m + i)
    {
      m = this.d[j];
      j += 1;
    }
    this.a.setColor(this.e);
    this.a.setStrokeWidth(getResources().getDimensionPixelOffset(2131230773));
    paramCanvas.drawLine(0.0F, 0.0F, i, 0.0F, this.a);
    this.a.setTextAlign(Paint.Align.CENTER);
    this.a.setColor(this.f);
    this.a.setTextSize(this.b);
    int m = 0;
    j = k;
    k = m;
    while (j < this.c.length)
    {
      m = a.c(this.c[j], this.b);
      String str = this.c[j];
      float f1 = this.d[j] / 2 + k;
      int n = getHeight() / 2;
      paramCanvas.drawText(str, f1, m / 2 + n, this.a);
      k += this.d[j];
      j += 1;
    }
    this.a.setColor(this.e);
    this.a.setStrokeWidth(getResources().getDimensionPixelOffset(2131230773));
    j = getHeight();
    paramCanvas.drawLine(0.0F, j - 1, i, j - 1, this.a);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = 0;
    if (this.d != null)
    {
      paramInt1 = 0;
      for (;;)
      {
        i = paramInt1;
        if (paramInt2 >= this.d.length) {
          break;
        }
        paramInt1 += this.d[paramInt2];
        paramInt2 += 1;
      }
    }
    int i = 0;
    setMeasuredDimension(i, getResources().getDimensionPixelOffset(2131230824));
  }
  
  public void setHeaders(String[] paramArrayOfString)
  {
    this.c = paramArrayOfString;
  }
  
  public void setWidths(int[] paramArrayOfInt)
  {
    this.d = paramArrayOfInt;
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\TableHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */