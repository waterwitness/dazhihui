package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ak;
import android.support.v4.view.bi;
import android.support.v4.view.bn;
import android.support.v4.view.cj;
import android.support.v4.widget.q;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.stock.vr;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.StockChartViewflow;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.d;

public class StockChartPager
  extends ViewGroup
  implements d
{
  private static final int[] a = { 16842931 };
  private static StockChartContainer b;
  private static StockChartContainer c;
  private static StockChartContainer d;
  private static final Interpolator h = new aw();
  private int A;
  private q B;
  private q C;
  private ay D;
  private boolean E = false;
  private boolean F = false;
  private boolean G = false;
  private final Runnable H = new ax(this);
  private int I = 0;
  private uv J;
  private int e = 1;
  private int f = 0;
  private boolean g = true;
  private int i = 1;
  private Scroller j;
  private int k;
  private float l = -3.4028235E38F;
  private float m = Float.MAX_VALUE;
  private boolean n;
  private boolean o;
  private int p;
  private int q;
  private float r;
  private float s;
  private float t;
  private float u;
  private int v = -1;
  private VelocityTracker w;
  private int x;
  private int y;
  private int z;
  
  public StockChartPager(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public StockChartPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StockChartPager(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    e();
  }
  
  public StockChartPager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    e();
  }
  
  private int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    if ((Math.abs(paramInt3) > this.z) && (Math.abs(paramInt2) > this.x))
    {
      if (paramInt2 > 0) {
        paramInt1 -= 1;
      }
      for (;;)
      {
        return Math.max(0, Math.min(paramInt1, 2));
        paramInt1 += 1;
      }
    }
    if (paramInt1 >= this.i) {}
    for (float f1 = 0.4F;; f1 = 0.6F)
    {
      paramInt1 = (int)(f1 + (paramInt1 + paramFloat));
      break;
    }
  }
  
  public static void a()
  {
    if (b == null) {
      b = new StockChartContainer(DzhApplication.a());
    }
    if (c == null) {
      c = new StockChartContainer(DzhApplication.a());
    }
    if (d == null) {
      d = new StockChartContainer(DzhApplication.a());
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1;
    if (paramInt2 > 0)
    {
      int i1 = getPaddingLeft();
      int i2 = getPaddingRight();
      int i3 = getPaddingLeft();
      int i4 = getPaddingRight();
      f1 = getScrollX() / (paramInt2 - i3 - i4 + paramInt4);
      paramInt2 = (int)((paramInt1 - i1 - i2 + paramInt3) * f1);
      scrollTo(paramInt2, getScrollY());
      if (!this.j.isFinished())
      {
        paramInt3 = this.j.getDuration();
        paramInt4 = this.j.timePassed();
        this.j.startScroll(paramInt2, 0, paramInt1 * 1, 0, paramInt3 - paramInt4);
      }
    }
    do
    {
      return;
      f1 = 1.0F;
      if (this.i == 0) {
        f1 = 0.0F;
      }
      paramInt1 = (int)(f1 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
    } while (paramInt1 == getScrollX());
    b(false);
    scrollTo(paramInt1, getScrollY());
  }
  
  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    int i2 = getClientWidth();
    int i1;
    if (paramInt1 < this.i)
    {
      i1 = 0;
      if (!paramBoolean1) {
        break label69;
      }
      a(i1, 0, paramInt2);
    }
    for (;;)
    {
      if ((c != null) && (b != null) && (d != null)) {
        break label91;
      }
      return;
      i1 = i2;
      if (paramInt1 == this.i) {
        break;
      }
      i1 = i2 * 2;
      break;
      label69:
      b(false);
      scrollTo(i1, 0);
      a(i1);
    }
    label91:
    this.F = false;
    this.G = false;
    StockChartContainer localStockChartContainer;
    if (paramInt1 < this.i)
    {
      localStockChartContainer = c;
      c = b;
      b = d;
      d = localStockChartContainer;
      this.f -= 1;
      this.g = true;
      if (this.f < 0) {
        this.f = 0;
      }
      if (this.f == 0)
      {
        b.a(vr.d, false);
        c.setCurrentPageIndex(this.f);
        if (this.e > 1)
        {
          d.setCurrentPageIndex(this.f + 1);
          this.F = true;
        }
      }
    }
    for (;;)
    {
      if (paramBoolean2) {
        this.E = true;
      }
      d.g();
      b.g();
      return;
      d.a(vr.d, false);
      break;
      b.setCurrentPageIndex(this.f - 1);
      c.setCurrentPageIndex(this.f);
      break;
      if (paramInt1 > this.i)
      {
        localStockChartContainer = c;
        c = d;
        d = b;
        b = localStockChartContainer;
        this.f += 1;
        this.g = true;
        if (this.f > this.e - 1) {
          this.f = (this.e - 1);
        }
        if (this.f == this.e - 1) {
          if (this.e > 1)
          {
            b.setCurrentPageIndex(this.f - 1);
            label372:
            c.setCurrentPageIndex(this.f);
            d.a(vr.d, false);
          }
        }
        for (;;)
        {
          this.G = true;
          break;
          b.a(vr.d, false);
          break label372;
          c.setCurrentPageIndex(this.f);
          d.setCurrentPageIndex(this.f + 1);
        }
      }
      if (this.f == 0)
      {
        b.a(vr.d, false);
        c.setCurrentPageIndex(this.f);
        if (this.e > 1) {
          d.setCurrentPageIndex(this.f + 1);
        } else {
          d.a(vr.d, false);
        }
      }
      else
      {
        if (this.f == this.e - 1)
        {
          if (this.e > 1) {
            b.setCurrentPageIndex(this.f - 1);
          }
          for (;;)
          {
            c.setCurrentPageIndex(this.f);
            d.a(vr.d, false);
            break;
            b.a(vr.d, false);
          }
        }
        b.setCurrentPageIndex(this.f - 1);
        c.setCurrentPageIndex(this.f);
        d.setCurrentPageIndex(this.f + 1);
      }
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = ak.b(paramMotionEvent);
    if (ak.b(paramMotionEvent, i1) == this.v) {
      if (i1 != 0) {
        break label56;
      }
    }
    label56:
    for (i1 = 1;; i1 = 0)
    {
      this.r = ak.c(paramMotionEvent, i1);
      this.v = ak.b(paramMotionEvent, i1);
      if (this.w != null) {
        this.w.clear();
      }
      return;
    }
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    return ((paramFloat1 < this.p) && (paramFloat2 > 0.0F)) || ((paramFloat1 > getWidth() - this.p) && (paramFloat2 < 0.0F));
  }
  
  private boolean a(int paramInt)
  {
    return true;
  }
  
  public static void b()
  {
    b = null;
    c = null;
    d = null;
  }
  
  private void b(boolean paramBoolean)
  {
    if (this.I == 2) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        this.j.abortAnimation();
        int i2 = getScrollX();
        int i3 = getScrollY();
        int i4 = this.j.getCurrX();
        int i5 = this.j.getCurrY();
        if ((i2 != i4) || (i3 != i5)) {
          scrollTo(i4, i5);
        }
      }
      if (i1 != 0)
      {
        if (!paramBoolean) {
          break;
        }
        bn.a(this, this.H);
      }
      return;
    }
    this.H.run();
  }
  
  private boolean b(float paramFloat)
  {
    float f1 = this.r;
    this.r = paramFloat;
    paramFloat = getScrollX() + (f1 - paramFloat);
    int i1 = getClientWidth();
    f1 = i1 * this.l;
    float f2 = i1 * this.m;
    boolean bool;
    if (paramFloat < f1)
    {
      bool = this.B.a(Math.abs(f1 - paramFloat) / i1);
      paramFloat = f1;
    }
    for (;;)
    {
      this.r += paramFloat - (int)paramFloat;
      scrollTo((int)paramFloat, getScrollY());
      a((int)paramFloat);
      return bool;
      if (paramFloat > f2)
      {
        bool = this.C.a(Math.abs(paramFloat - f2) / i1);
        paramFloat = f2;
      }
      else
      {
        bool = false;
      }
    }
  }
  
  private void c(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  private int getClientWidth()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private void k()
  {
    this.n = false;
    this.o = false;
    if (this.w != null)
    {
      this.w.recycle();
      this.w = null;
    }
  }
  
  private void setScrollState(int paramInt)
  {
    if (this.I == paramInt) {}
    do
    {
      return;
      this.I = paramInt;
    } while (this.D == null);
    this.D.b(paramInt);
  }
  
  float a(float paramFloat)
  {
    return (float)Math.sin((float)((paramFloat - 0.5F) * 0.4712389167638204D));
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.e = paramInt2;
    this.f = paramInt1;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (getChildCount() == 0) {
      return;
    }
    int i1 = getScrollX();
    int i2 = getScrollY();
    int i3 = paramInt1 - i1;
    paramInt2 -= i2;
    if ((i3 == 0) && (paramInt2 == 0))
    {
      b(false);
      setScrollState(0);
      return;
    }
    setScrollState(2);
    paramInt1 = getClientWidth();
    int i4 = paramInt1 / 2;
    float f3 = Math.min(1.0F, Math.abs(i3) * 1.0F / paramInt1);
    float f1 = i4;
    float f2 = i4;
    f3 = a(f3);
    paramInt3 = Math.abs(paramInt3);
    if (paramInt3 > 0) {}
    for (paramInt1 = Math.round(1000.0F * Math.abs((f2 * f3 + f1) / paramInt3)) * 4;; paramInt1 = (int)((Math.abs(i3) / (f1 + this.k) + 1.0F) * 100.0F))
    {
      paramInt1 = Math.min(paramInt1, 600);
      this.j.startScroll(i1, i2, i3, paramInt2, paramInt1);
      bn.d(this);
      return;
      f1 = paramInt1;
    }
  }
  
  void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = false;
    if ((!paramBoolean2) && (this.i == paramInt1)) {
      return;
    }
    int i1 = paramInt1;
    if (paramInt1 < 0) {
      i1 = 0;
    }
    paramBoolean2 = bool;
    if (this.i != i1) {
      paramBoolean2 = true;
    }
    a(i1, paramBoolean1, paramInt2, paramBoolean2);
  }
  
  public void a(y paramy)
  {
    if (b != null) {
      b.a(paramy);
    }
    if (c != null) {
      c.a(paramy);
    }
    if (d != null) {
      d.a(paramy);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (b != null) {
        b.g.setVisibility(8);
      }
      if (c != null) {
        b.g.setVisibility(8);
      }
      if (d != null) {
        b.g.setVisibility(8);
      }
    }
  }
  
  protected boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i2 = paramView.getScrollX();
      int i3 = paramView.getScrollY();
      i1 = localViewGroup.getChildCount() - 1;
      if (i1 >= 0)
      {
        localView = localViewGroup.getChildAt(i1);
        if ((paramInt2 + i2 < localView.getLeft()) || (paramInt2 + i2 >= localView.getRight()) || (paramInt3 + i3 < localView.getTop()) || (paramInt3 + i3 >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + i2 - localView.getLeft(), paramInt3 + i3 - localView.getTop()))) {}
      }
    }
    while ((paramBoolean) && (bn.a(paramView, -paramInt1)))
    {
      View localView;
      return true;
      i1 -= 1;
      break;
    }
    return false;
  }
  
  public void c()
  {
    if (c == null) {
      return;
    }
    c.a.scrollTo(0, 0);
    c.a.invalidate();
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    int i1 = getClientWidth();
    int i2 = getScrollX();
    if (paramInt < 0) {
      if (i2 <= (int)(i1 * this.l)) {}
    }
    do
    {
      return true;
      return false;
      if (paramInt <= 0) {
        break;
      }
    } while (i2 < (int)(i1 * this.m));
    return false;
    return false;
  }
  
  public void computeScroll()
  {
    if ((!this.j.isFinished()) && (this.j.computeScrollOffset()))
    {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i3 = this.j.getCurrX();
      int i4 = this.j.getCurrY();
      if ((i1 != i3) || (i2 != i4))
      {
        scrollTo(i3, i4);
        if (!a(i3))
        {
          this.j.abortAnimation();
          scrollTo(0, i4);
        }
      }
      bn.d(this);
      return;
    }
    b(true);
  }
  
  public void d()
  {
    if (c == null) {}
    do
    {
      do
      {
        return;
        if (c.a.getScrollY() < getHeaderHeight()) {
          break;
        }
      } while (this.J == null);
      this.J.c().setShowPrice(true);
      return;
    } while (this.J == null);
    this.J.c().setShowPrice(false);
  }
  
  void e()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Object localObject = getContext();
    this.j = new Scroller((Context)localObject, h);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get((Context)localObject);
    float f1 = ((Context)localObject).getResources().getDisplayMetrics().density;
    this.q = cj.a(localViewConfiguration);
    this.x = ((int)(400.0F * f1));
    this.y = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.B = new q((Context)localObject);
    this.C = new q((Context)localObject);
    this.z = ((int)(25.0F * f1));
    this.A = ((int)(2.0F * f1));
    if (bn.e(this) == 0) {
      bn.c(this, 1);
    }
    if ((b == null) || (b.getParent() != null)) {
      b = new StockChartContainer(DzhApplication.a());
    }
    localObject = new StockChartPager.LayoutParams();
    ((StockChartPager.LayoutParams)localObject).a = true;
    removeView(b);
    addView(b, 0, (ViewGroup.LayoutParams)localObject);
    if ((c == null) || (c.getParent() != null)) {
      c = new StockChartContainer(DzhApplication.a());
    }
    localObject = new StockChartPager.LayoutParams();
    ((StockChartPager.LayoutParams)localObject).a = true;
    removeView(c);
    addView(c, 1, (ViewGroup.LayoutParams)localObject);
    if ((d == null) || (d.getParent() != null)) {
      d = new StockChartContainer(DzhApplication.a());
    }
    localObject = new StockChartPager.LayoutParams();
    ((StockChartPager.LayoutParams)localObject).a = true;
    removeView(d);
    addView(d, 2, (ViewGroup.LayoutParams)localObject);
    c();
    f();
  }
  
  public void f()
  {
    if (c.g != null) {
      c.g.setVisibility(8);
    }
    if (d.g != null) {
      d.g.setVisibility(8);
    }
    if (b.g != null) {
      b.g.setVisibility(8);
    }
  }
  
  public void g()
  {
    if (b != null) {
      removeView(b);
    }
    if (c != null) {
      removeView(c);
    }
    if (d != null) {
      removeView(d);
    }
  }
  
  public StockChartContainer getCurrentContainer()
  {
    return c;
  }
  
  public int getCurrentItem()
  {
    return this.f;
  }
  
  public int getHeaderHeight()
  {
    if ((c == null) || (c.f.getVisibility() == 8)) {
      return 0;
    }
    return c.f.getHeight() + getResources().getDimensionPixelSize(2131230829) + getResources().getDimensionPixelSize(2131230772) * 2;
  }
  
  public int getHeaderHidden()
  {
    if ((c != null) && (c.a != null)) {
      return -c.a.getScrollY();
    }
    return 0;
  }
  
  public StockChartContainer getNextContainer()
  {
    return d;
  }
  
  public StockChartContainer getPreviousContainer()
  {
    return b;
  }
  
  public boolean isScrollBottom()
  {
    if (c == null) {
      return false;
    }
    Object localObject = c.getScroolView();
    if (localObject == null) {
      return false;
    }
    if ((localObject instanceof ListView))
    {
      localObject = (ListView)localObject;
      View localView = ((ListView)localObject).getChildAt(((ListView)localObject).getChildCount() - 1);
      if (localView == null) {
        return false;
      }
      if ((localView.getBottom() <= ((ListView)localObject).getHeight()) && (((ListView)localObject).getLastVisiblePosition() == ((ListView)localObject).getCount() - 1)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean isScrollTop()
  {
    boolean bool2 = true;
    boolean bool1 = true;
    if (c == null) {}
    View localView1;
    do
    {
      View localView2;
      do
      {
        do
        {
          do
          {
            return false;
            localView1 = c.getScroolView();
          } while (localView1 == null);
          if ((localView1 instanceof ScrollView))
          {
            if (localView1.getScrollY() == 0) {}
            for (bool1 = true;; bool1 = false) {
              return bool1;
            }
          }
          if (!(localView1 instanceof ListView)) {
            break;
          }
        } while (((ListView)localView1).getChildCount() <= 0);
        localView2 = ((ListView)localView1).getChildAt(0);
      } while (localView2 == null);
      if ((((ListView)localView1).getFirstVisiblePosition() == 0) && (localView2.getTop() == 0)) {}
      for (;;)
      {
        return bool1;
        bool1 = false;
      }
    } while (!(localView1 instanceof WebView));
    if ((localView1.getScrollY() == 0) && (localView1.getTop() >= 0)) {}
    for (bool1 = bool2;; bool1 = false) {
      return bool1;
    }
  }
  
  public void moveContent(int paramInt)
  {
    if (c == null) {}
    do
    {
      do
      {
        return;
        localObject = c.getScroolView();
      } while (localObject == null);
      if ((localObject instanceof ScrollView))
      {
        localObject = (ScrollView)localObject;
        ((ScrollView)localObject).scrollBy(0, paramInt);
        ((ScrollView)localObject).invalidate();
        return;
      }
      if ((localObject instanceof ListView))
      {
        localObject = (ListView)localObject;
        ((ListView)localObject).smoothScrollBy(paramInt, 0);
        ((ListView)localObject).invalidate();
        return;
      }
    } while (!(localObject instanceof WebView));
    Object localObject = (WebView)localObject;
    int i1 = ((WebView)localObject).getScrollY() + paramInt;
    if (i1 < 0) {
      ((WebView)localObject).scrollTo(0, 0);
    }
    for (;;)
    {
      ((WebView)localObject).invalidate();
      return;
      if (i1 + ((WebView)localObject).getHeight() > ((WebView)localObject).getContentHeight() * ((WebView)localObject).getScale()) {
        ((WebView)localObject).scrollBy(0, (int)(((WebView)localObject).getContentHeight() * ((WebView)localObject).getScale() - ((WebView)localObject).getHeight() - ((WebView)localObject).getScrollY()));
      } else {
        ((WebView)localObject).scrollBy(0, paramInt);
      }
    }
  }
  
  public void moveHeader(int paramInt)
  {
    if (c == null) {
      return;
    }
    c.a.scrollBy(0, -paramInt);
    c.a.invalidate();
    if (c.a.getScrollY() >= getHeaderHeight())
    {
      this.J.c().setShowPrice(true);
      return;
    }
    this.J.c().setShowPrice(false);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.H);
    super.onDetachedFromWindow();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction() & 0xFF;
    if ((i1 == 3) || (i1 == 1))
    {
      this.n = false;
      this.o = false;
      this.v = -1;
      if (this.w != null)
      {
        this.w.recycle();
        this.w = null;
      }
    }
    do
    {
      return false;
      if (i1 == 0) {
        break;
      }
      if (this.n) {
        return true;
      }
    } while (this.o);
    switch (i1)
    {
    }
    for (;;)
    {
      if (this.w == null) {
        this.w = VelocityTracker.obtain();
      }
      this.w.addMovement(paramMotionEvent);
      return this.n;
      i1 = this.v;
      if (i1 != -1)
      {
        i1 = ak.a(paramMotionEvent, i1);
        if (i1 < 0) {
          break;
        }
        float f2 = ak.c(paramMotionEvent, i1);
        float f1 = f2 - this.r;
        float f4 = Math.abs(f1);
        float f3 = ak.d(paramMotionEvent, i1);
        float f5 = Math.abs(f3 - this.u);
        if ((f1 != 0.0F) && (!a(this.r, f1)) && (a(this, false, (int)f1, (int)f2, (int)f3)))
        {
          this.r = f2;
          this.s = f3;
          this.o = true;
          return false;
        }
        if ((f4 > this.q) && (0.5F * f4 > f5) && (getWidth() < getHeight()))
        {
          this.n = true;
          c(true);
          setScrollState(1);
          if (f1 > 0.0F)
          {
            f1 = this.t + this.q;
            label326:
            this.r = f1;
            this.s = f3;
          }
        }
        while ((this.n) && (b(f2)))
        {
          bn.d(this);
          break;
          f1 = this.t - this.q;
          break label326;
          if (f5 > this.q) {
            this.o = true;
          }
        }
        f1 = paramMotionEvent.getX();
        this.t = f1;
        this.r = f1;
        f1 = paramMotionEvent.getY();
        this.u = f1;
        this.s = f1;
        this.v = ak.b(paramMotionEvent, 0);
        this.o = false;
        this.j.computeScrollOffset();
        if ((this.I == 2) && (Math.abs(this.j.getFinalX() - this.j.getCurrX()) > this.A))
        {
          this.j.abortAnimation();
          this.n = true;
          c(true);
          setScrollState(1);
        }
        else
        {
          b(false);
          this.n = false;
          continue;
          a(paramMotionEvent);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramBoolean) {
      this.g = true;
    }
    int i2 = getChildCount();
    int i3 = getPaddingLeft();
    int i4 = getPaddingTop();
    int i1 = getPaddingRight();
    int i5 = getPaddingBottom();
    paramInt3 = paramInt3 - paramInt1 - i3 - i1;
    i1 = 0;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      StockChartPager.LayoutParams localLayoutParams = (StockChartPager.LayoutParams)localView.getLayoutParams();
      paramInt1 = 0;
      if (b == localView) {
        paramInt1 = 0;
      }
      for (;;)
      {
        paramInt1 += i3;
        if (localLayoutParams.a)
        {
          localLayoutParams.a = false;
          this.g = true;
          localView.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt4 - paramInt2 - i4 - i5, 1073741824));
        }
        localView.layout(paramInt1, i4, localView.getMeasuredWidth() + paramInt1, localView.getMeasuredHeight() + i4);
        i1 += 1;
        break;
        if (c == localView)
        {
          if (b == null) {
            paramInt1 = 0;
          } else {
            paramInt1 = paramInt3;
          }
        }
        else if (d == localView) {
          if (b == null) {
            paramInt1 = paramInt3;
          } else {
            paramInt1 = paramInt3 * 2;
          }
        }
      }
    }
    if (this.g)
    {
      a(this.i, false, 0, false);
      this.g = false;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    int i2 = getChildCount();
    while (i1 < i2)
    {
      if (getChildAt(i1).getVisibility() != 8) {
        getChildAt(i1).measure(paramInt1, paramInt2);
      }
      i1 += 1;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      a(paramInt1, paramInt3, this.k, this.k);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i5 = 0;
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    if (this.w == null) {
      this.w = VelocityTracker.obtain();
    }
    this.w.addMovement(paramMotionEvent);
    int i1 = i5;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      i1 = i5;
    }
    for (;;)
    {
      if (i1 != 0) {
        bn.d(this);
      }
      return true;
      this.j.abortAnimation();
      float f1 = paramMotionEvent.getX();
      this.t = f1;
      this.r = f1;
      f1 = paramMotionEvent.getY();
      this.u = f1;
      this.s = f1;
      this.v = ak.b(paramMotionEvent, 0);
      i1 = i5;
      continue;
      float f2;
      if (!this.n)
      {
        i1 = ak.a(paramMotionEvent, this.v);
        f1 = ak.c(paramMotionEvent, i1);
        float f3 = Math.abs(f1 - this.r);
        f2 = ak.d(paramMotionEvent, i1);
        float f4 = Math.abs(f2 - this.s);
        if ((f3 > this.q) && (f3 > f4))
        {
          this.n = true;
          c(true);
          if (f1 - this.t <= 0.0F) {
            break label336;
          }
        }
      }
      Object localObject;
      label336:
      for (f1 = this.t + this.q;; f1 = this.t - this.q)
      {
        this.r = f1;
        this.s = f2;
        setScrollState(1);
        localObject = getParent();
        if (localObject != null) {
          ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
        }
        i1 = i5;
        if (!this.n) {
          break;
        }
        bool1 = false | b(ak.c(paramMotionEvent, ak.a(paramMotionEvent, this.v)));
        break;
      }
      boolean bool1 = i5;
      if (this.n)
      {
        localObject = this.w;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.y);
        int i6 = (int)bi.a((VelocityTracker)localObject, this.v);
        int i7 = getClientWidth();
        int i8 = getScrollX();
        int i9 = (int)(ak.c(paramMotionEvent, ak.a(paramMotionEvent, this.v)) - this.t);
        if ((i9 > 0) && (this.f == 0)) {}
        boolean bool4;
        for (int i2 = this.i;; i3 = this.i)
        {
          a(i2, true, true, i6);
          this.v = -1;
          k();
          bool4 = this.B.c();
          boolean bool2 = this.C.c() | bool4;
          break;
          if ((i9 >= 0) || (this.f != this.e - 1)) {
            break label512;
          }
        }
        label512:
        i5 = this.i;
        if ((i9 > 0) && (this.i - 1 >= 0)) {
          i5 = this.i - 1;
        }
        for (int i3 = 0;; i3 = this.i)
        {
          i3 = a(i5, i8 / i7 - i3, i6, i9);
          break;
        }
        i3 = i5;
        if (this.n)
        {
          a(this.i, true, 0, false);
          this.v = -1;
          k();
          bool4 = this.B.c();
          boolean bool3 = this.C.c() | bool4;
          continue;
          int i4 = ak.b(paramMotionEvent);
          this.r = ak.c(paramMotionEvent, i4);
          this.v = ak.b(paramMotionEvent, i4);
          i4 = i5;
          continue;
          a(paramMotionEvent);
          this.r = ak.c(paramMotionEvent, ak.a(paramMotionEvent, this.v));
          i4 = i5;
        }
      }
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    a(paramInt, false, false);
  }
  
  public void setHolder(uv paramuv)
  {
    this.J = paramuv;
  }
  
  public void setOnPageChangeListener(ay paramay)
  {
    this.D = paramay;
  }
  
  public int upToLoad(int paramInt, boolean paramBoolean)
  {
    if (c == null) {
      return 0;
    }
    Object localObject = c.getScroolView();
    if (localObject == null) {
      return 0;
    }
    if (((localObject instanceof ListView)) && (((View)localObject).getParent() != null) && (((View)localObject).getParent().getParent() != null))
    {
      localObject = ((View)localObject).getParent().getParent();
      if ((localObject instanceof LoadAndRefreshView)) {
        return ((LoadAndRefreshView)localObject).a(paramInt, paramBoolean);
      }
    }
    return 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */