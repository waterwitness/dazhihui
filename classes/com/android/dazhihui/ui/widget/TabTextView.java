package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class TabTextView
  extends TextView
{
  public int a;
  private int b = 0;
  private Bitmap c;
  private Bitmap d;
  private Bitmap e;
  private Object f;
  private lo g;
  
  public TabTextView(Context paramContext)
  {
    super(paramContext, null, 2130772129);
  }
  
  public TabTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public int getIndex()
  {
    return this.a;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.b == 1)
    {
      if (this.c == null) {
        this.c = BitmapFactory.decodeResource(getResources(), 2130838547);
      }
      paramCanvas.drawBitmap(this.c, getWidth() - this.c.getWidth() - 5, getPaddingTop() + getHeight() / 3 - this.c.getHeight(), null);
    }
    do
    {
      return;
      if (this.b == 2)
      {
        if (this.e == null) {
          this.e = BitmapFactory.decodeResource(getResources(), 2130838078);
        }
        paramCanvas.drawBitmap(this.e, getWidth() - this.e.getWidth() - 5, getPaddingTop() + getHeight() / 3 - this.e.getHeight(), null);
        return;
      }
    } while (this.b != 3);
    if (this.d == null) {
      this.d = BitmapFactory.decodeResource(getResources(), 2130838459);
    }
    paramCanvas.drawBitmap(this.d, getWidth() - this.d.getWidth() - 5, getPaddingTop() + getHeight() / 3 - this.d.getHeight(), null);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    super.setOnClickListener(new ln(this, paramOnClickListener));
  }
  
  public void setOnRedDotCloseClickListener(lo paramlo)
  {
    this.g = paramlo;
  }
  
  public void setRedHot(int paramInt)
  {
    if (this.b != paramInt)
    {
      this.b = paramInt;
      requestLayout();
      invalidate();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\TabTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */