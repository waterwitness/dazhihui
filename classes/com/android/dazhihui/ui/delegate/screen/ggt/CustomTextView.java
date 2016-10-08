package com.android.dazhihui.ui.delegate.screen.ggt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.TextView;
import java.io.PrintStream;

public class CustomTextView
  extends TextView
{
  private static float a = 3.0F;
  private static float b = 18.0F;
  private float c = getResources().getDisplayMetrics().density;
  private Paint d;
  private float e;
  private float f;
  
  public CustomTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  private void a()
  {
    this.d = new Paint();
    this.d.set(getPaint());
    this.f = (getTextSize() / this.c);
    this.e = (a / this.c);
  }
  
  private void a(String paramString, float paramFloat)
  {
    float f2;
    if (paramFloat > 0.0F)
    {
      f2 = paramFloat / this.c - getPaddingLeft() - getPaddingRight();
      System.out.println("availableWidth:" + f2);
      System.out.println("testPaint.measureText(text):" + this.d.measureText(paramString));
      paramFloat = this.f;
      this.d.setTextSize(paramFloat);
    }
    for (;;)
    {
      float f1 = paramFloat;
      if (paramFloat >= this.e)
      {
        f1 = paramFloat;
        if (this.d.measureText(paramString) > f2 - 5.0F)
        {
          paramFloat -= 1.0F;
          if (paramFloat > this.e) {
            break label151;
          }
          f1 = this.e;
        }
      }
      setTextSize(f1);
      return;
      label151:
      this.d.setTextSize(paramFloat);
      System.out.println("testPaint.measureText(text):" + this.d.measureText(paramString));
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 != paramInt3) {
      a(getText().toString(), paramInt1);
    }
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    a(paramCharSequence.toString(), getWidth());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\CustomTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */