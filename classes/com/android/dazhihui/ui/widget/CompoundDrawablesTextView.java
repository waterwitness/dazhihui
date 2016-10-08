package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class CompoundDrawablesTextView
  extends TextView
  implements View.OnClickListener
{
  private boolean a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e = true;
  private boolean f = true;
  private int g = 0;
  private int h = 0;
  private av i;
  private View.OnClickListener j;
  
  public CompoundDrawablesTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CompoundDrawablesTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    super.setOnClickListener(this);
  }
  
  private boolean a(MotionEvent paramMotionEvent)
  {
    int m = 0;
    Drawable localDrawable1 = getCompoundDrawables()[0];
    Drawable localDrawable2 = getCompoundDrawables()[1];
    Drawable localDrawable3 = getCompoundDrawables()[3];
    if (localDrawable1 == null) {
      return false;
    }
    int n = localDrawable1.getIntrinsicHeight();
    int i1 = localDrawable1.getIntrinsicWidth();
    int k;
    if (localDrawable2 == null)
    {
      k = 0;
      if (localDrawable3 != null) {
        break label161;
      }
    }
    for (;;)
    {
      double d1 = (k - m + getHeight()) * 0.5D;
      return new Rect(getCompoundDrawablePadding() - this.g, (int)(d1 - n * 0.5D - this.h), i1 + getCompoundDrawablePadding() + this.g, (int)(d1 + n * 0.5D + this.h)).contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      k = localDrawable2.getIntrinsicHeight();
      break;
      label161:
      m = localDrawable3.getIntrinsicHeight();
    }
  }
  
  private void b()
  {
    this.a = false;
    this.b = false;
    this.c = false;
    this.d = false;
  }
  
  private boolean b(MotionEvent paramMotionEvent)
  {
    int m = 0;
    Drawable localDrawable1 = getCompoundDrawables()[0];
    Drawable localDrawable2 = getCompoundDrawables()[1];
    Drawable localDrawable3 = getCompoundDrawables()[2];
    if (localDrawable2 == null) {
      return false;
    }
    int n = localDrawable2.getIntrinsicHeight();
    int i1 = localDrawable2.getIntrinsicWidth();
    int k;
    if (localDrawable1 == null)
    {
      k = 0;
      if (localDrawable3 != null) {
        break label161;
      }
    }
    for (;;)
    {
      double d1 = (k - m + getWidth()) * 0.5D;
      return new Rect((int)(d1 - i1 * 0.5D - this.g), getCompoundDrawablePadding() - this.h, (int)(d1 + i1 * 0.5D + this.g), getCompoundDrawablePadding() + n + this.h).contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      k = localDrawable1.getIntrinsicWidth();
      break;
      label161:
      m = localDrawable3.getIntrinsicWidth();
    }
  }
  
  private boolean c(MotionEvent paramMotionEvent)
  {
    int m = 0;
    Drawable localDrawable1 = getCompoundDrawables()[2];
    Drawable localDrawable2 = getCompoundDrawables()[1];
    Drawable localDrawable3 = getCompoundDrawables()[3];
    if (localDrawable1 == null) {
      return false;
    }
    int n = localDrawable1.getIntrinsicHeight();
    int i1 = localDrawable1.getIntrinsicWidth();
    int k;
    if (localDrawable2 == null)
    {
      k = 0;
      if (localDrawable3 != null) {
        break label171;
      }
    }
    for (;;)
    {
      double d1 = (k - m + getHeight()) * 0.5D;
      return new Rect(getWidth() - getCompoundDrawablePadding() - i1 - this.g, (int)(d1 - n * 0.5D - this.h), getWidth() - getCompoundDrawablePadding() + this.g, (int)(d1 + n * 0.5D + this.h)).contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      k = localDrawable2.getIntrinsicHeight();
      break;
      label171:
      m = localDrawable3.getIntrinsicHeight();
    }
  }
  
  private boolean d(MotionEvent paramMotionEvent)
  {
    int m = 0;
    Drawable localDrawable1 = getCompoundDrawables()[2];
    Drawable localDrawable2 = getCompoundDrawables()[0];
    Drawable localDrawable3 = getCompoundDrawables()[3];
    if (localDrawable3 == null) {
      return false;
    }
    int n = localDrawable3.getIntrinsicHeight();
    int i1 = localDrawable3.getIntrinsicWidth();
    int k;
    if (localDrawable2 == null)
    {
      k = 0;
      if (localDrawable1 != null) {
        break label171;
      }
    }
    for (;;)
    {
      double d1 = (k - m + getWidth()) * 0.5D;
      return new Rect((int)(d1 - i1 * 0.5D - this.g), getHeight() - getCompoundDrawablePadding() - n - this.h, (int)(d1 + i1 * 0.5D + this.g), getHeight() - getCompoundDrawablePadding() + this.h).contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      k = localDrawable2.getIntrinsicWidth();
      break;
      label171:
      m = localDrawable1.getIntrinsicWidth();
    }
  }
  
  public int getLazyX()
  {
    return this.g;
  }
  
  public int getLazyY()
  {
    return this.h;
  }
  
  public void onClick(View paramView)
  {
    int n = 0;
    if (this.i != null)
    {
      if (this.a) {
        this.i.a(aw.a);
      }
      if ((!this.e) && (this.a)) {
        break label213;
      }
      k = 1;
      if ((k != 0) && (this.b)) {
        this.i.a(aw.b);
      }
      if ((!this.e) && ((k == 0) || (this.b))) {
        break label218;
      }
    }
    label213:
    label218:
    for (int k = 1;; k = 0)
    {
      if ((k != 0) && (this.c)) {
        this.i.a(aw.c);
      }
      int m;
      if (!this.e)
      {
        m = n;
        if (k != 0)
        {
          m = n;
          if (this.c) {}
        }
      }
      else
      {
        m = 1;
      }
      if ((m != 0) && (this.d)) {
        this.i.a(aw.d);
      }
      if ((this.j != null) && ((this.f) || ((!this.a) && (!this.b) && (!this.c) && (!this.d)))) {
        this.j.onClick(paramView);
      }
      return;
      k = 0;
      break;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      b();
      if (this.i != null)
      {
        this.a = a(paramMotionEvent);
        this.b = b(paramMotionEvent);
        this.c = c(paramMotionEvent);
        this.d = d(paramMotionEvent);
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAllDrawableTouchedResponse(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public void setAlwaysClick(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void setDrawableClickListener(av paramav)
  {
    this.i = paramav;
  }
  
  public void setLazyX(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void setLazyY(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.j = paramOnClickListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CompoundDrawablesTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */