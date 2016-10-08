package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
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
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;

public class TabPageIndicator
  extends HorizontalScrollView
  implements jl
{
  private static final CharSequence c = "";
  int a;
  float b;
  private Runnable d;
  private TabTextView e;
  private boolean f = true;
  private final View.OnClickListener g = new lk(this);
  private final eh h;
  private ViewPager i;
  private df j;
  private int k;
  private lm l;
  private boolean m = false;
  private int n = 5;
  private boolean o = false;
  private View p;
  private Bitmap q;
  private y r;
  
  public TabPageIndicator(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TabPageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setHorizontalScrollBarEnabled(false);
    setOverScrollMode(2);
    setHorizontalFadingEdgeEnabled(false);
    this.r = g.a().b();
    this.h = new eh(paramContext, 2130772129);
    setVisibility(4);
    addView(this.h, new ViewGroup.LayoutParams(-2, -1));
    if ((this.r == y.b) || (this.o)) {
      setBackgroundColor(-1);
    }
    while (this.r != y.a) {
      return;
    }
    setBackgroundColor(-14802908);
  }
  
  public static Bitmap a(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
    paramView.layout(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
    paramView.buildDrawingCache();
    return paramView.getDrawingCache();
  }
  
  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2)
  {
    setVisibility(0);
    TabTextView localTabTextView = new TabTextView(getContext());
    localTabTextView.a = paramInt1;
    localTabTextView.setFocusable(true);
    localTabTextView.setOnClickListener(this.g);
    localTabTextView.setText(paramCharSequence);
    if ((this.r == y.b) || (this.o)) {
      localTabTextView.setTextColor(getResources().getColorStateList(2131493705));
    }
    for (;;)
    {
      paramInt1 = getResources().getDimensionPixelSize(2131230813);
      localTabTextView.setGravity(17);
      paramInt2 = this.i.getAdapter().getCount();
      if ((this.n <= 0) || (paramInt2 <= this.n)) {
        break;
      }
      paramCharSequence = new LinearLayout.LayoutParams(-2, -1);
      paramCharSequence.gravity = 16;
      localTabTextView.setPadding(paramInt1 * 5, 0, paramInt1 * 5, 0);
      this.h.addView(localTabTextView, paramCharSequence);
      return;
      if (this.r == y.a) {
        localTabTextView.setTextColor(getResources().getColorStateList(2131493704));
      }
    }
    paramCharSequence = new LinearLayout.LayoutParams(-1, -1);
    paramCharSequence.gravity = 16;
    paramCharSequence.weight = 1.0F;
    this.h.addView(localTabTextView, paramCharSequence);
  }
  
  private void b(int paramInt)
  {
    View localView = this.h.getChildAt(paramInt);
    if (this.d != null) {
      removeCallbacks(this.d);
    }
    this.d = new ll(this, localView);
    post(this.d);
  }
  
  private void d()
  {
    if (this.h != null)
    {
      int i3 = this.h.getChildCount();
      int i1 = 0;
      while (i1 < i3)
      {
        Object localObject1 = (TabTextView)this.h.getChildAt(i1);
        if (localObject1 != null)
        {
          ((TabTextView)localObject1).setOnClickListener(null);
          localObject1 = ((TabTextView)localObject1).getCompoundDrawables();
          if ((localObject1 != null) && (localObject1.length > 0))
          {
            int i4 = localObject1.length;
            int i2 = 0;
            while (i2 < i4)
            {
              Object localObject2 = localObject1[i2];
              if (localObject2 != null) {
                ((Drawable)localObject2).setCallback(null);
              }
              i2 += 1;
            }
          }
        }
        i1 += 1;
      }
    }
  }
  
  public void a()
  {
    if (this.r != g.a().b())
    {
      this.r = g.a().b();
      b();
    }
  }
  
  public void a(int paramInt)
  {
    ((TabTextView)this.h.getChildAt(paramInt)).setRedHot(0);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    TabTextView localTabTextView = (TabTextView)this.h.getChildAt(paramInt1);
    if (paramInt2 == 1) {
      localTabTextView.setRedHot(paramInt2);
    }
    do
    {
      return;
      if (paramInt2 == 2)
      {
        localTabTextView.setRedHot(paramInt2);
        return;
      }
    } while (paramInt2 != 3);
    localTabTextView.setRedHot(paramInt2);
  }
  
  public void b()
  {
    int i1;
    if ((this.r == y.b) || (this.o))
    {
      setBackgroundColor(-1);
      if (this.h != null)
      {
        i1 = 0;
        while (i1 < this.h.getChildCount())
        {
          ((TabTextView)this.h.getChildAt(i1)).setTextColor(getResources().getColorStateList(2131493705));
          i1 += 1;
        }
      }
      this.q = null;
      invalidate();
    }
    while (this.r != y.a) {
      return;
    }
    setBackgroundColor(-14802908);
    if (this.h != null)
    {
      i1 = 0;
      while (i1 < this.h.getChildCount())
      {
        ((TabTextView)this.h.getChildAt(i1)).setTextColor(getResources().getColorStateList(2131493704));
        i1 += 1;
      }
    }
    this.q = null;
    invalidate();
  }
  
  public void c()
  {
    this.h.removeAllViews();
    ax localax = this.i.getAdapter();
    eg localeg = null;
    if ((localax instanceof eg)) {
      localeg = (eg)localax;
    }
    int i3 = localax.getCount();
    int i1 = 0;
    CharSequence localCharSequence;
    if (i1 < i3)
    {
      localCharSequence = localax.getPageTitle(i1);
      if (localCharSequence != null) {
        break label128;
      }
      localCharSequence = c;
    }
    label128:
    for (;;)
    {
      if (localeg != null) {}
      for (int i2 = localeg.a(i1);; i2 = 0)
      {
        a(i1, localCharSequence, i2);
        i1 += 1;
        break;
        if (this.k > i3) {
          this.k = (i3 - 1);
        }
        setCurrentItem(this.k);
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
    d();
    if (this.j != null) {
      this.j = null;
    }
    if (this.d != null) {
      removeCallbacks(this.d);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.i == null) {}
    label296:
    label327:
    for (;;)
    {
      return;
      int i1 = this.i.getAdapter().getCount();
      if (i1 != 0)
      {
        if (this.a >= i1)
        {
          setCurrentItem(i1 - 1);
          return;
        }
        int i2 = getPaddingLeft();
        int i3 = getPaddingTop();
        if (this.e == null)
        {
          this.e = new TabTextView(getContext());
          this.e.setSelected(true);
          this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        int i4;
        if ((this.r == y.b) || (this.o))
        {
          this.e.setBackgroundResource(2130838682);
          if ((this.q == null) || (this.p != this.h.getChildAt(this.a)))
          {
            this.p = this.h.getChildAt(this.a);
            this.q = a(this.e, this.p.getWidth(), this.p.getHeight());
          }
          i4 = this.p.getLeft();
          i1 = 0;
          if (this.b >= 0.0F) {
            break label296;
          }
          i1 = i4 - this.h.getChildAt(this.a - 1).getLeft();
        }
        for (;;)
        {
          if (this.q == null) {
            break label327;
          }
          Bitmap localBitmap = this.q;
          float f1 = i2 + i4;
          float f2 = this.b;
          paramCanvas.drawBitmap(localBitmap, i1 * f2 + f1, i3, null);
          return;
          this.e.setBackgroundResource(2130838683);
          break;
          if (this.b > 0.0F) {
            i1 = this.h.getChildAt(this.a + 1).getLeft() - i4;
          }
        }
      }
    }
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
    if (this.j != null) {
      this.j.onPageScrollStateChanged(paramInt);
    }
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramFloat;
    invalidate();
    if (this.j != null) {
      this.j.onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    setCurrentItem(paramInt);
    if (this.j != null) {
      this.j.onPageSelected(paramInt);
    }
  }
  
  public void setChangeSelectedTextSize(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public void setCurrentItem(int paramInt)
  {
    if (this.i == null) {
      throw new IllegalStateException("ViewPager has not been bound.");
    }
    this.k = paramInt;
    this.i.setCurrentItem(paramInt);
    int i2 = this.h.getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      TabTextView localTabTextView = (TabTextView)this.h.getChildAt(i1);
      boolean bool;
      if (i1 == paramInt)
      {
        bool = true;
        label68:
        localTabTextView.setSelected(bool);
        if (!bool) {
          break label112;
        }
        b(paramInt);
        if (this.m) {
          localTabTextView.setTextSize(2, 18.0F);
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
        bool = false;
        break label68;
        label112:
        if (this.m) {
          localTabTextView.setTextSize(2, 16.0F);
        }
      }
    }
  }
  
  public void setIsOnlyShowWhite(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public void setOnPageChangeListener(df paramdf)
  {
    this.j = paramdf;
  }
  
  public void setOnTabReselectedListener(lm paramlm)
  {
    this.l = paramlm;
  }
  
  public void setTabDisplayNumber(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void setViewPager(ViewPager paramViewPager)
  {
    if (this.i == paramViewPager) {
      return;
    }
    if (this.i != null) {
      this.i.setOnPageChangeListener(null);
    }
    if (paramViewPager.getAdapter() == null) {
      throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    this.i = paramViewPager;
    paramViewPager.setOnPageChangeListener(this);
    c();
  }
  
  public void setViewPagerScrollSmooth(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\TabPageIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */