package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

public class HorizontalTextView
  extends TextView
{
  private Drawable a;
  private int b;
  private int c;
  private Paint d = new Paint(1);
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j = 0;
  
  public HorizontalTextView(Context paramContext)
  {
    super(paramContext);
  }
  
  public HorizontalTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = paramContext.getResources().getDimensionPixelOffset(2131230829);
    this.f = paramContext.getResources().getDimensionPixelOffset(2131230837);
    this.g = paramContext.getResources().getDimensionPixelOffset(2131230844);
    this.h = paramContext.getResources().getDimensionPixelOffset(2131230798);
  }
  
  public HorizontalTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    this.b = getWidth();
    this.c = getHeight();
    String str = getText().toString();
    char[] arrayOfChar = str.toCharArray();
    int i3 = str.length();
    if (this.a != null)
    {
      int k = this.a.getMinimumWidth() * 22 / 30;
      int i2 = (this.b - k) / 2;
      int i1 = (int)getTextSize();
      this.d.setTextSize(i1);
      Rect localRect = new Rect();
      this.d.getTextBounds(str.substring(0, 1), 0, 1, localRect);
      int m = localRect.height();
      localRect.width();
      int n;
      if (this.j == 0)
      {
        k = this.h;
        n = this.e;
      }
      while ((m + k) * i3 + this.a.getMinimumHeight() > this.c - n * 2)
      {
        i1 -= 1;
        this.d.setTextSize(i1);
        this.d.getTextBounds(str.substring(0, 1), 0, 1, localRect);
        m = localRect.height();
        localRect.width();
        continue;
        n = this.h;
        k = this.h;
      }
      if (this.j == 0)
      {
        m = i1 - 4;
        this.d.setTextSize(m);
        this.a.setBounds(i2, n * 2, this.a.getMinimumWidth() * 22 / 30 + i2, n * 2 + this.a.getMinimumHeight() * 22 / 30);
        this.a.draw(paramCanvas);
        i1 = (int)this.d.getFontMetrics().ascent;
        i2 = n * 2 + this.a.getMinimumHeight() * 5 / 6 - i1;
        this.d.setTextAlign(Paint.Align.CENTER);
        this.d.setColor(this.i);
        Log.d("viewflow", "tmpY:" + i2);
        n = k;
        if (this.j == 1) {
          n = k / 2;
        }
        i1 = 0;
        k = i2;
        label422:
        if (i1 >= i3) {
          return;
        }
        Log.d("viewflow", "tmpY:" + k);
        if (i1 != 0) {
          break label511;
        }
        k += n;
      }
      for (;;)
      {
        paramCanvas.drawText(String.valueOf(arrayOfChar[i1]), this.b / 2, k, this.d);
        i1 += 1;
        break label422;
        m = i1 - 6;
        break;
        label511:
        k += n + m;
      }
    }
  }
  
  public void setBottomDrawable(Drawable paramDrawable)
  {
    this.a = paramDrawable;
  }
  
  public void setTextColor(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void setTopDrawable(Drawable paramDrawable)
  {
    this.a = paramDrawable;
    postInvalidate();
  }
  
  public void setType(int paramInt)
  {
    this.j = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\HorizontalTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */