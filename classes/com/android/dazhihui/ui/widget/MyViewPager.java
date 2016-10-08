package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.df;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

public class MyViewPager
  extends ViewPager
{
  public boolean a = false;
  private df b;
  private List<df> c;
  private df d = new ih(this);
  private float e;
  private float f = 0.0F;
  private int g = 0;
  
  public MyViewPager(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  private void a()
  {
    super.setOnPageChangeListener(this.d);
    this.g = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  }
  
  public void addOnPageChangeListener(df paramdf)
  {
    if (this.c == null) {
      this.c = new ArrayList();
    }
    this.c.add(paramdf);
  }
  
  public void clearOnPageChangeListeners()
  {
    if (this.c != null) {
      this.c.clear();
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if (paramMotionEvent.getAction() == 0)
    {
      this.e = f1;
      this.f = f2;
      this.a = false;
    }
    if (paramMotionEvent.getAction() == 2)
    {
      int i = (int)Math.abs(this.e - f1);
      int j = (int)Math.abs(this.f - f2);
      if ((i > this.g) && (i * 0.5F > j) && (this.a)) {
        return false;
      }
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public void removeOnPageChangeListener(df paramdf)
  {
    if (this.c != null) {
      this.c.remove(paramdf);
    }
  }
  
  public void setOnPageChangeListener(df paramdf)
  {
    this.b = paramdf;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MyViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */