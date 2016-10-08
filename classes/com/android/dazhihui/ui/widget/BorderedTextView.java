package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.dazhihui.f;

public class BorderedTextView
  extends TextView
{
  private int a;
  
  public BorderedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext.obtainStyledAttributes(paramAttributeSet, f.BorderedTextViewStyle).getColor(0, -16777216);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Paint localPaint = new Paint();
    localPaint.setColor(this.a);
    paramCanvas.drawLine(0.0F, 0.0F, getWidth(), 0.0F, localPaint);
    paramCanvas.drawLine(0.0F, 0.0F, 0.0F, getHeight() - 1, localPaint);
    paramCanvas.drawLine(getWidth() - 1, 0.0F, getWidth() - 1, getHeight() - 1, localPaint);
    paramCanvas.drawLine(0.0F, getHeight() - 1, getWidth(), getHeight() - 1, localPaint);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\BorderedTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */