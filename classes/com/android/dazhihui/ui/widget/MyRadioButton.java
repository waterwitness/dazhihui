package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

public class MyRadioButton
  extends RadioButton
{
  public int a;
  private int b = 0;
  private Bitmap c;
  private Bitmap d;
  private Bitmap e;
  private Object f;
  private ig g;
  
  public MyRadioButton(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public MyRadioButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MyRadioButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public int getIndex()
  {
    return this.a;
  }
  
  public int getRedHotType()
  {
    return this.b;
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
    super.setOnClickListener(new if(this, paramOnClickListener));
  }
  
  public void setOnRedDotCloseClickListener(ig paramig)
  {
    this.g = paramig;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MyRadioButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */