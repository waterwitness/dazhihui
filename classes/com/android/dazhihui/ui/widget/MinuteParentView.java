package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.dazhihui.d.a;

public class MinuteParentView
  extends LinearLayout
{
  private boolean a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  
  public MinuteParentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MinuteParentView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(Canvas paramCanvas)
  {
    if (this.f < 0) {}
    while (this.e == -1) {
      return;
    }
    if (!this.a) {}
    for (int i = this.g * this.e / 241 + 1;; i = this.b + 1 + this.g * this.e / 241)
    {
      a.d.setColor(-65536);
      a.a(i, 2.0F, i, this.d, -65536, paramCanvas);
      if (this.a) {
        break;
      }
      a.a(1.0F, this.d / 2, this.c - 2, this.d / 2, -2628628, paramCanvas);
      return;
    }
    a.a(this.b + 1, this.d / 2, this.c - 4 + this.b, this.d / 2, -2628628, paramCanvas);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.c = paramInt1;
    this.d = paramInt2;
    this.g = this.c;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MinuteParentView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */