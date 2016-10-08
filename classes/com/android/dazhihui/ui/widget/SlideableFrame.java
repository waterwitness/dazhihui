package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.support.v4.view.ak;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.stock.MainScreen;

public class SlideableFrame
  extends FrameLayout
{
  Fragment a;
  private CustomViewPager b;
  private FrameLayout c;
  private kv d;
  private MainScreen e;
  private kw f;
  private ad g;
  private int h;
  private int i;
  private int j;
  private float k;
  private MotionEvent l;
  private boolean m = true;
  
  public SlideableFrame(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if ((paramContext instanceof FragmentActivity))
    {
      this.e = ((MainScreen)paramContext);
      this.g = this.e.getSupportFragmentManager();
      LayoutInflater.from(paramContext).inflate(2130903125, this);
      return;
    }
    throw new RuntimeException("the Activity of SlideableFrame must be a FragmentActivity");
  }
  
  private int a(float paramFloat1, float paramFloat2)
  {
    int n = 1;
    int i1 = this.b.getCurrentItem();
    if (i1 == 1) {
      n = 0;
    }
    while ((i1 == 0) && (paramFloat1 > this.h - this.i)) {
      return n;
    }
    if (i1 == 0) {
      return 2;
    }
    return -1;
  }
  
  private void b()
  {
    this.b = ((CustomViewPager)findViewById(2131558402));
    this.c = ((FrameLayout)findViewById(2131558461));
    this.d = new kv(this, this.g);
    this.b.setAdapter(this.d);
    this.b.setCurrentItem(1);
    this.b.setOnPageChangeListener(new ku(this));
  }
  
  public void a()
  {
    at localat = this.g.a();
    if (this.a != null) {
      localat.b(this.a);
    }
    Object localObject = this.f.b().getClass().getSimpleName();
    localObject = this.g.a((String)localObject);
    if (localObject != null) {
      localat.c((Fragment)localObject);
    }
    for (;;)
    {
      this.a = ((Fragment)localObject);
      localat.b();
      return;
      localObject = this.f.b();
      localat.a(2131558461, (Fragment)localObject, localObject.getClass().getSimpleName());
    }
  }
  
  public int getCurrentItem()
  {
    return this.b.getCurrentItem();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    b();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.h = (paramInt3 - paramInt1);
    this.i = ((int)(this.h * 0.2F));
    ((FrameLayout.LayoutParams)this.c.getLayoutParams()).rightMargin = this.i;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      this.j = a(paramMotionEvent.getX(), paramMotionEvent.getY());
    }
    switch (this.j)
    {
    default: 
    case 0: 
    case 1: 
      do
      {
        do
        {
          return true;
          try
          {
            this.b.dispatchTouchEvent(paramMotionEvent);
            return true;
          }
          catch (Exception paramMotionEvent)
          {
            paramMotionEvent.printStackTrace();
            return true;
          }
          switch (paramMotionEvent.getAction())
          {
          default: 
            return true;
          }
        } while (!this.b.beginFakeDrag());
        this.k = paramMotionEvent.getX();
        this.m = true;
        this.l = MotionEvent.obtain(paramMotionEvent);
        return true;
        this.b.endFakeDrag();
        if (this.m) {
          this.b.setCurrentItem(1);
        }
        this.l.recycle();
        return true;
        float f1 = ak.c(paramMotionEvent, ak.b(paramMotionEvent));
        float f2 = this.k;
        this.k = f1;
        this.b.fakeDragBy(f1 - f2);
      } while (!this.m);
      if ((Math.abs(paramMotionEvent.getX() - this.l.getX()) <= 5.0F) && (Math.abs(paramMotionEvent.getX() - this.l.getX()) <= 5.0F)) {}
      for (boolean bool = true;; bool = false)
      {
        this.m = bool;
        return true;
      }
    }
    this.c.dispatchTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setCurrentItem(int paramInt)
  {
    if (paramInt > this.d.getCount()) {
      return;
    }
    this.b.setCurrentItem(paramInt);
    n.a("", 20220);
  }
  
  public void setObserver(kw paramkw)
  {
    this.f = paramkw;
    if (this.f.b() == null) {
      return;
    }
    a();
  }
  
  public void setScrollable(boolean paramBoolean)
  {
    if (this.b != null) {
      this.b.setScrollable(paramBoolean);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\SlideableFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */