package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class MarqueeView
  extends TextView
{
  private float a = 0.0F;
  private float b = 0.0F;
  private float c;
  private boolean d = false;
  private boolean e = false;
  private Paint f = null;
  private String g = "";
  private final Handler h = new hf(this);
  
  public MarqueeView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public MarqueeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public MarqueeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void b()
  {
    c();
  }
  
  private void c()
  {
    if (!this.d)
    {
      this.d = true;
      this.b = getWidth();
    }
  }
  
  private void d()
  {
    this.g = getText().toString();
    this.a = this.f.measureText(this.g);
  }
  
  private void e()
  {
    if (!this.d) {
      return;
    }
    this.b -= 3.0F;
    if (this.b <= -this.a + getLeft())
    {
      this.b = getWidth();
      if (this.e) {
        d();
      }
    }
    if (this.b > getWidth()) {
      this.b = getWidth();
    }
    postInvalidate();
  }
  
  public void a()
  {
    this.e = true;
    this.f = getPaint();
    this.f.setAntiAlias(true);
    this.f.setColor(getTextColors().getDefaultColor());
    this.g = getText().toString();
    this.a = this.f.measureText(this.g);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (this.d)
    {
      paramCanvas.save();
      paramCanvas.translate(this.b, 0.0F);
      paramCanvas.drawText(this.g, 0.0F, this.c, this.f);
      paramCanvas.restore();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (m == 1073741824)
    {
      paramInt1 = i;
      if (k != 1073741824) {
        break label75;
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      return;
      int j = Math.max(0, getSuggestedMinimumWidth());
      paramInt1 = j;
      if (m != Integer.MIN_VALUE) {
        break;
      }
      paramInt1 = Math.min(i, j);
      break;
      label75:
      i = Math.max(0, getSuggestedMinimumHeight());
      if (k == Integer.MIN_VALUE) {
        paramInt2 = Math.min(paramInt2, Math.max(i, getLineHeight())) + (getPaddingTop() + getPaddingBottom());
      } else {
        paramInt2 = i;
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b();
    this.c = ((getHeight() - getTextSize()) / 2.0F - this.f.getFontMetrics().ascent);
    this.h.removeMessages(0);
    this.h.sendEmptyMessage(0);
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt == 0)
    {
      this.b = getWidth();
      this.h.removeMessages(0);
      this.h.sendEmptyMessage(0);
      return;
    }
    this.h.removeMessages(0);
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    super.setText(paramCharSequence, paramBufferType);
    this.g = paramCharSequence.toString();
  }
  
  public void setTextColor(int paramInt)
  {
    this.f.setColor(paramInt);
    super.setTextColor(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MarqueeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */