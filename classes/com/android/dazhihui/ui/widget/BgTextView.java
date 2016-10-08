package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.dazhihui.f;

public class BgTextView
  extends TextView
{
  private int a;
  private Paint b;
  private String c;
  private Point d;
  
  public BgTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, f.BorderedTextViewStyle);
    this.a = paramContext.getColor(0, 0);
    paramContext.recycle();
    this.b = new TextPaint(1);
    this.b.setTextSize(getTextSize());
    this.b.setColor(-16777216);
    this.b.setTextAlign(Paint.Align.CENTER);
    this.b.setStyle(Paint.Style.FILL_AND_STROKE);
    this.d = new Point();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    this.d.x = (paramInt1 / 2);
    if ("*".equals(this.c))
    {
      this.d.y = ((int)(paramInt2 + this.b.descent()));
      return;
    }
    this.d.y = ((int)(paramInt2 / 2 - (this.b.descent() + this.b.ascent()) / 2.0F) + 1);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (TextUtils.isEmpty(this.c)) {
      return;
    }
    if (this.a != 0) {
      paramCanvas.drawColor(this.a);
    }
    paramCanvas.drawText(this.c, this.d.x, this.d.y, this.b);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a(paramInt1, paramInt2);
  }
  
  public void setBorderColor(int paramInt)
  {
    this.a = paramInt;
    postInvalidate();
  }
  
  public void setDisplayText(String paramString)
  {
    this.c = paramString;
    if (!TextUtils.isEmpty(this.c)) {
      this.b.measureText(this.c);
    }
    a(getWidth(), getHeight());
  }
  
  public void setDisplayTextColor(int paramInt)
  {
    this.b.setColor(paramInt);
    postInvalidate();
  }
  
  public void setDisplayTextSize(float paramFloat)
  {
    this.b.setTextSize(paramFloat);
    a(getWidth(), getHeight());
    postInvalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\BgTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */