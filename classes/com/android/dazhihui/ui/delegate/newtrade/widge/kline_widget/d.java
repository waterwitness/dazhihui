package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.view.View;

class d
  extends View
{
  private Paint b = new Paint(1);
  private int c = getResources().getDimensionPixelSize(2131231088);
  private Rect d = new Rect();
  
  public d(b paramb, Context paramContext)
  {
    super(paramContext);
    this.b.setTextSize(this.c);
    this.b.setTextAlign(Paint.Align.LEFT);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    if ((b.a(this.a) != null) && (b.a(this.a).length > 0))
    {
      int k = this.c;
      this.b.setTextSize(k);
      int m = getHeight();
      int n = getPaddingLeft();
      Object localObject = new StringBuffer();
      String[][] arrayOfString = b.a(this.a);
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String[] arrayOfString1 = arrayOfString[i];
        ((StringBuffer)localObject).append(arrayOfString1[0] + arrayOfString1[1]);
        i += 1;
      }
      this.b.getTextBounds(((StringBuffer)localObject).toString(), 0, ((StringBuffer)localObject).length(), this.d);
      j = this.d.width() + b.b(this.a) / 2 * (b.a(this.a).length - 1);
      i = k;
      while (j >= getWidth())
      {
        i -= 1;
        this.b.setTextSize(i);
        this.b.getTextBounds(((StringBuffer)localObject).toString(), 0, ((StringBuffer)localObject).length(), this.d);
        j = this.d.width() + b.b(this.a) / 2 * (b.a(this.a).length - 1);
      }
      i = 0;
      j = n + 3;
      while (i < b.a(this.a).length)
      {
        localObject = b.a(this.a)[i][0] + b.a(this.a)[i][1];
        this.b.setColor(b.c(this.a)[i]);
        paramCanvas.drawText((String)localObject, j, (m - 2 - k >> 1) - this.b.getFontMetrics().ascent, this.b);
        this.b.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.d);
        j += this.d.width() + b.b(this.a) / 2;
        i += 1;
      }
    }
    paramCanvas.restore();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */