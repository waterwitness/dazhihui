package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.widget.TextView;

public class RedTextView
  extends TextView
{
  private final Paint a = new Paint();
  
  public RedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.a.setStyle(Paint.Style.FILL);
    this.a.setColor(getResources().getColor(2131493412));
    paramCanvas.drawCircle(getWidth() / 2.0F, getHeight() / 2, getWidth() / 2, this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\RedTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */