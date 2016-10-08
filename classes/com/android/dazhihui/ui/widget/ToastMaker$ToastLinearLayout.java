package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.widget.LinearLayout;

class ToastMaker$ToastLinearLayout
  extends LinearLayout
{
  private Paint a = new Paint();
  
  public ToastMaker$ToastLinearLayout(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public ToastMaker$ToastLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public ToastMaker$ToastLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    this.a.setColor(-1439005729);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    this.a.setStyle(Paint.Style.STROKE);
    this.a.setAntiAlias(true);
    this.a.setStrokeWidth(2.0F);
    paramCanvas.drawRect(0.0F, 0.0F, getWidth() - this.a.getStrokeWidth(), getHeight() - this.a.getStrokeWidth(), this.a);
    paramCanvas.restore();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ToastMaker$ToastLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */