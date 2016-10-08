package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.f;

public class RotateTextView
  extends View
{
  Rect a = new Rect();
  private TextPaint b;
  private String c = "";
  private int d;
  private int e;
  
  public RotateTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, f.verticaltextview);
    paramAttributeSet = paramContext.getString(0);
    if (paramAttributeSet != null) {
      this.c = paramAttributeSet.toString();
    }
    this.e = paramContext.getDimensionPixelOffset(2, 15);
    if (this.e > 0) {
      this.b.setTextSize(this.e);
    }
    this.b.setColor(paramContext.getColor(1, -16777216));
    this.d = paramContext.getInt(3, 0);
    paramContext.recycle();
    requestLayout();
    invalidate();
  }
  
  private int a(int paramInt)
  {
    int i = View.MeasureSpec.getMode(paramInt);
    paramInt = View.MeasureSpec.getSize(paramInt);
    if (i == 1073741824) {
      return paramInt;
    }
    int j = this.e;
    if (i == Integer.MIN_VALUE) {
      return Math.min(j, paramInt);
    }
    return j;
  }
  
  private final void a()
  {
    this.b = new TextPaint();
    this.b.setAntiAlias(true);
    this.b.setTextSize(15.0F);
    this.b.setColor(-16777216);
    this.b.setTextAlign(Paint.Align.CENTER);
  }
  
  private int b(int paramInt)
  {
    int i = View.MeasureSpec.getMode(paramInt);
    paramInt = View.MeasureSpec.getSize(paramInt);
    if (i == 1073741824) {
      return paramInt;
    }
    int j = this.a.width();
    if (i == Integer.MIN_VALUE) {
      return Math.min(j, paramInt);
    }
    return j;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int j = getWidth();
    int i = getHeight();
    Path localPath = new Path();
    if (this.d == 0)
    {
      getWidth();
      int k = this.e;
      localPath.moveTo(j, i);
      localPath.lineTo(j, 0);
    }
    for (;;)
    {
      paramCanvas.drawTextOnPath(this.c, localPath, 0.0F, -5.0F, this.b);
      return;
      j = (getWidth() >> 1) + (this.e >> 1);
      localPath.moveTo(j, 0);
      localPath.lineTo(j, i);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.c == null) || (this.c.equals(""))) {}
    for (String str = "000";; str = this.c)
    {
      this.b.getTextBounds(str, 0, str.length(), this.a);
      setMeasuredDimension(a(paramInt1), b(paramInt2));
      return;
    }
  }
  
  public void setText(String paramString)
  {
    this.c = paramString;
    requestLayout();
    invalidate();
  }
  
  public void setTextColor(int paramInt)
  {
    this.b.setColor(paramInt);
    invalidate();
  }
  
  public void setTextSize(int paramInt)
  {
    this.b.setTextSize(paramInt);
    requestLayout();
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\RotateTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */