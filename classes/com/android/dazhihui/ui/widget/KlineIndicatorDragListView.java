package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.android.dazhihui.ui.screen.stock.klineindicator.o;

public class KlineIndicatorDragListView
  extends NoScrollListView
{
  private ImageView a;
  private String b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private WindowManager h;
  private WindowManager.LayoutParams i;
  private ViewGroup j;
  private o k;
  private Context l;
  private int m = 0;
  private String n = new String("");
  
  public KlineIndicatorDragListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.l = paramContext;
  }
  
  private void b(int paramInt)
  {
    String str = this.k.a(paramInt);
    this.k.a(str);
    this.k.a(this.b, paramInt);
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    String str = this.k.a(paramInt2);
    this.k.a(this.k.a(paramInt1));
    this.k.a(str);
    this.k.a(str, paramInt1);
    this.k.a(this.n, paramInt2);
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    String str = this.k.a(paramInt2);
    this.k.a(this.k.a(paramInt1));
    this.k.a(str);
    this.k.a(this.n, paramInt2);
    this.k.a(str, paramInt1);
  }
  
  public void a()
  {
    if (this.a != null)
    {
      this.h.removeView(this.a);
      this.a = null;
      this.j.setBackgroundColor(this.l.getResources().getColor(2131493654));
    }
  }
  
  public void a(int paramInt)
  {
    if (this.e > this.d)
    {
      b(this.d, this.e);
      this.d = this.e;
    }
    while (this.e >= this.d) {
      return;
    }
    c(this.d, this.e);
    this.d = this.e;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1;
    if (paramInt1 < 0) {
      i1 = 0;
    }
    for (;;)
    {
      postInvalidate();
      if (this.a != null)
      {
        this.i.alpha = 0.8F;
        this.i.y = (paramInt2 - this.f);
        this.h.updateViewLayout(this.a, this.i);
      }
      paramInt1 = pointToPosition(0, i1);
      if (paramInt1 != -1)
      {
        this.e = paramInt1;
        a(i1);
      }
      return;
      i1 = paramInt1;
      if (paramInt1 > getHeight()) {
        i1 = getHeight();
      }
    }
  }
  
  public void a(Bitmap paramBitmap, int paramInt)
  {
    a();
    this.i = new WindowManager.LayoutParams();
    this.i.gravity = 48;
    this.i.x = 0;
    this.i.y = (paramInt - this.f + this.g);
    this.i.width = -2;
    this.i.height = -2;
    this.i.flags = 408;
    this.i.format = -3;
    this.i.windowAnimations = 0;
    ImageView localImageView = new ImageView(getContext());
    localImageView.setImageBitmap(paramBitmap);
    this.h = ((WindowManager)getContext().getSystemService("window"));
    this.h.addView(localImageView, this.i);
    this.a = localImageView;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.m != 0)
    {
      if ((this.m == 0) || (this.m > 0)) {
        break label45;
      }
      setSelectionFromTop(getFirstVisiblePosition(), getChildAt(0).getTop() + 3);
    }
    label45:
    while (this.m < getHeight()) {
      return;
    }
    setSelectionFromTop(getFirstVisiblePosition(), getChildAt(0).getTop() - 3);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      int i1 = (int)paramMotionEvent.getX();
      int i2 = (int)paramMotionEvent.getY();
      this.c = pointToPosition(i1, i2);
      if (this.c == -1) {
        return super.onInterceptTouchEvent(paramMotionEvent);
      }
      this.d = this.c;
      this.e = this.c;
      this.b = this.k.a(this.c);
      this.j = ((ViewGroup)getChildAt(this.c - getFirstVisiblePosition()));
      this.f = (i2 - this.j.getTop());
      this.g = ((int)(paramMotionEvent.getRawY() - i2));
      paramMotionEvent = this.j.findViewById(2131559555);
      if ((paramMotionEvent != null) && (i1 > paramMotionEvent.getLeft()) && (i1 < paramMotionEvent.getRight()))
      {
        this.j.setDrawingCacheEnabled(true);
        paramMotionEvent = Bitmap.createBitmap(this.j.getDrawingCache());
        this.k.a(this.b);
        this.k.a(this.n, this.c);
        a(paramMotionEvent, i2);
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
      }
      return false;
    }
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if ((this.a != null) && (this.c != -1))
    {
      switch (i1)
      {
      }
      for (;;)
      {
        return true;
        a();
        b(this.e);
        this.m = 0;
        this.j.destroyDrawingCache();
        getParent().requestDisallowInterceptTouchEvent(false);
        continue;
        i1 = (int)paramMotionEvent.getY();
        this.m = i1;
        a(i1, (int)paramMotionEvent.getRawY());
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    super.setAdapter(paramListAdapter);
    this.k = ((o)getAdapter());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\KlineIndicatorDragListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */