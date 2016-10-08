package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ax;
import android.support.v4.view.df;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import com.android.dazhihui.d.n;

public class IlvbTabPageIndicator
  extends HorizontalScrollView
  implements jl
{
  private static final CharSequence c = "";
  int a;
  float b;
  private Runnable d;
  private boolean e = true;
  private final View.OnClickListener f = new ei(this);
  private final eh g;
  private ViewPager h;
  private df i;
  private int j;
  private ek k;
  private boolean l = false;
  private int m = 5;
  
  public IlvbTabPageIndicator(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public IlvbTabPageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setHorizontalScrollBarEnabled(false);
    setOverScrollMode(2);
    setHorizontalFadingEdgeEnabled(false);
    this.g = new eh(paramContext, 2130772129);
    int n = getResources().getDimensionPixelSize(2131230829);
    setPadding(n, n, n, n);
    setVisibility(4);
    this.g.setGravity(17);
    addView(this.g, new ViewGroup.LayoutParams(-2, -2));
    setBackgroundColor(getResources().getColor(2131493677));
  }
  
  private void a(int paramInt)
  {
    View localView = this.g.getChildAt(paramInt);
    if (this.d != null) {
      removeCallbacks(this.d);
    }
    this.d = new ej(this, localView);
    post(this.d);
  }
  
  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2)
  {
    setVisibility(0);
    TabTextView localTabTextView = new TabTextView(getContext());
    localTabTextView.a = paramInt1;
    localTabTextView.setFocusable(true);
    localTabTextView.setOnClickListener(this.f);
    localTabTextView.setText(paramCharSequence);
    paramInt1 = getResources().getDimensionPixelSize(2131230813);
    localTabTextView.setTextColor(getResources().getColorStateList(2131493702));
    localTabTextView.setGravity(17);
    this.h.getAdapter().getCount();
    paramCharSequence = new LinearLayout.LayoutParams(-2, -2);
    paramCharSequence.gravity = 16;
    localTabTextView.setPadding(paramInt1 * 5, paramInt1, paramInt1 * 5, paramInt1);
    this.g.addView(localTabTextView, paramCharSequence);
  }
  
  private void b()
  {
    if (this.g != null)
    {
      int i2 = this.g.getChildCount();
      int n = 0;
      while (n < i2)
      {
        Object localObject1 = (TabTextView)this.g.getChildAt(n);
        if (localObject1 != null)
        {
          ((TabTextView)localObject1).setOnClickListener(null);
          localObject1 = ((TabTextView)localObject1).getCompoundDrawables();
          if ((localObject1 != null) && (localObject1.length > 0))
          {
            int i3 = localObject1.length;
            int i1 = 0;
            while (i1 < i3)
            {
              Object localObject2 = localObject1[i1];
              if (localObject2 != null) {
                ((Drawable)localObject2).setCallback(null);
              }
              i1 += 1;
            }
          }
        }
        n += 1;
      }
    }
  }
  
  public void a()
  {
    this.g.removeAllViews();
    ax localax = this.h.getAdapter();
    eg localeg = null;
    if ((localax instanceof eg)) {
      localeg = (eg)localax;
    }
    int i2 = localax.getCount();
    int n = 0;
    CharSequence localCharSequence;
    if (n < i2)
    {
      localCharSequence = localax.getPageTitle(n);
      if (localCharSequence != null) {
        break label128;
      }
      localCharSequence = c;
    }
    label128:
    for (;;)
    {
      if (localeg != null) {}
      for (int i1 = localeg.a(n);; i1 = 0)
      {
        a(n, localCharSequence, i1);
        n += 1;
        break;
        if (this.j > i2) {
          this.j = (i2 - 1);
        }
        setCurrentItem(this.j);
        requestLayout();
        return;
      }
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.d != null) {
      post(this.d);
    }
  }
  
  public void onDetachedFromWindow()
  {
    n.c(">>> TabPagetIndicator#onDetachedFromWindow()");
    super.onDetachedFromWindow();
    b();
    if (this.i != null) {
      this.i = null;
    }
    if (this.d != null) {
      removeCallbacks(this.d);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.h == null) {}
    int n;
    do
    {
      return;
      n = this.h.getAdapter().getCount();
    } while ((n == 0) || (this.a < n));
    setCurrentItem(n - 1);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {}
    for (boolean bool = true;; bool = false)
    {
      setFillViewport(bool);
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
  }
  
  public void onPageScrollStateChanged(int paramInt)
  {
    if (this.i != null) {
      this.i.onPageScrollStateChanged(paramInt);
    }
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramFloat;
    invalidate();
    if (this.i != null) {
      this.i.onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    setCurrentItem(paramInt);
    if (this.i != null) {
      this.i.onPageSelected(paramInt);
    }
  }
  
  public void setChangeSelectedTextSize(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public void setCurrentItem(int paramInt)
  {
    if (this.h == null) {
      throw new IllegalStateException("ViewPager has not been bound.");
    }
    this.j = paramInt;
    this.h.setCurrentItem(paramInt);
    int i1 = this.g.getChildCount();
    int n = 0;
    if (n < i1)
    {
      TabTextView localTabTextView = (TabTextView)this.g.getChildAt(n);
      boolean bool;
      if (n == paramInt)
      {
        bool = true;
        label68:
        localTabTextView.setSelected(bool);
        if (!bool) {
          break label119;
        }
        a(paramInt);
        localTabTextView.setBackgroundResource(2130838225);
        if (this.l) {
          localTabTextView.setTextSize(2, 18.0F);
        }
      }
      for (;;)
      {
        n += 1;
        break;
        bool = false;
        break label68;
        label119:
        localTabTextView.setBackgroundColor(getResources().getColor(2131493660));
        if (this.l) {
          localTabTextView.setTextSize(2, 16.0F);
        }
      }
    }
  }
  
  public void setOnPageChangeListener(df paramdf)
  {
    this.i = paramdf;
  }
  
  public void setOnTabReselectedListener(ek paramek)
  {
    this.k = paramek;
  }
  
  public void setTabDisplayNumber(int paramInt)
  {
    this.m = paramInt;
  }
  
  public void setViewPager(ViewPager paramViewPager)
  {
    if (this.h == paramViewPager) {
      return;
    }
    if (this.h != null) {
      this.h.setOnPageChangeListener(null);
    }
    if (paramViewPager.getAdapter() == null) {
      throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    this.h = paramViewPager;
    paramViewPager.setOnPageChangeListener(this);
    a();
  }
  
  public void setViewPagerScrollSmooth(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\IlvbTabPageIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */