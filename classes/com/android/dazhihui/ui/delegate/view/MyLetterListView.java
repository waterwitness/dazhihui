package com.android.dazhihui.ui.delegate.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class MyLetterListView
  extends View
{
  a a;
  String[] b = { "#", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
  int c = -1;
  Paint d = new Paint();
  boolean e = false;
  
  public MyLetterListView(Context paramContext)
  {
    super(paramContext);
    float f = getResources().getDimensionPixelSize(2131230897);
    this.d.setTextSize(f);
  }
  
  public MyLetterListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    float f = getResources().getDimensionPixelSize(2131230897);
    this.d.setTextSize(f);
  }
  
  public MyLetterListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f = getResources().getDimensionPixelSize(2131230897);
    this.d.setTextSize(f);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    float f = paramMotionEvent.getY();
    int j = this.c;
    paramMotionEvent = this.a;
    int k = (int)(f / getHeight() * this.b.length);
    switch (i)
    {
    default: 
    case 0: 
    case 2: 
      do
      {
        do
        {
          return true;
          this.e = true;
        } while ((j == k) || (paramMotionEvent == null) || (k <= 0) || (k >= this.b.length));
        paramMotionEvent.a(this.b[k]);
        this.c = k;
        invalidate();
        return true;
      } while ((j == k) || (paramMotionEvent == null) || (k <= 0) || (k >= this.b.length));
      paramMotionEvent.a(this.b[k]);
      this.c = k;
      invalidate();
      return true;
    }
    this.e = false;
    this.c = -1;
    invalidate();
    return true;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.e) {
      paramCanvas.drawColor(Color.parseColor("#40000000"));
    }
    int i = getHeight();
    int j = getWidth();
    int k = i / this.b.length;
    i = 0;
    while (i < this.b.length)
    {
      this.d.setColor(-1);
      this.d.setTypeface(Typeface.DEFAULT_BOLD);
      this.d.setAntiAlias(true);
      if (i == this.c)
      {
        this.d.setColor(Color.parseColor("#3399ff"));
        this.d.setFakeBoldText(true);
      }
      float f1 = j / 2;
      float f2 = this.d.measureText(this.b[i]) / 2.0F;
      float f3 = k * i + k;
      paramCanvas.drawText(this.b[i], f1 - f2, f3, this.d);
      i += 1;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setOnTouchingLetterChangedListener(a parama)
  {
    this.a = parama;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\MyLetterListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */