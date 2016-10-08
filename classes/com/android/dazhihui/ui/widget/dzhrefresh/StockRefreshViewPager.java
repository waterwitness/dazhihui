package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import com.android.dazhihui.ui.widget.stockchart.StockChartPager;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.j;
import com.handmark.pulltorefresh.library.p;

public class StockRefreshViewPager
  extends PullToRefreshBase<StockChartPager>
{
  private StockChartPager d;
  private int e;
  private int f;
  private u g;
  private int h;
  private VelocityTracker i = null;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private boolean o = false;
  private boolean p = false;
  private boolean q = false;
  
  public StockRefreshViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private boolean c(int paramInt)
  {
    StockChartPager localStockChartPager = (StockChartPager)getRefreshableView();
    if ((getScrollY() < 0) && (paramInt < 0))
    {
      this.j = 1;
      return true;
    }
    if ((localStockChartPager.isScrollTop()) && (paramInt > 0) && (localStockChartPager.getHeaderHidden() < 0))
    {
      this.j = 5;
      return true;
    }
    if ((paramInt > 0) && (localStockChartPager.isScrollTop()))
    {
      this.j = 1;
      return true;
    }
    if ((localStockChartPager.isScrollTop()) && (paramInt < 0) && (localStockChartPager.getHeaderHidden() > -localStockChartPager.getHeaderHeight()))
    {
      this.j = 5;
      return true;
    }
    this.j = 5;
    return true;
  }
  
  private void d(int paramInt)
  {
    boolean bool = false;
    paramInt = (int)(paramInt * 0.8F);
    int i1 = getScrollY() - paramInt;
    paramInt = i1;
    if (i1 < 0) {
      paramInt = 0;
    }
    this.b.setVisibility(4);
    this.c.setVisibility(0);
    scrollBy(0, paramInt - getScrollY());
    if (this.l == 4) {
      return;
    }
    paramInt = (int)Math.round(getHeaderSize() * 1.1D);
    paramInt = Math.max(0, Math.min(100, Math.abs(getScrollY() * 100 / paramInt)));
    if (paramInt == 100) {
      bool = true;
    }
    this.q = bool;
    if ((paramInt == 100) && (this.l != 3)) {}
    for (this.l = 3;; this.l = 2) {
      do
      {
        this.c.b(paramInt / 100.0F);
        return;
      } while ((paramInt >= 100) || (this.l == 2));
    }
  }
  
  private void m()
  {
    this.l = 4;
    this.c.h();
    a(true);
  }
  
  protected StockChartPager a(Context paramContext, AttributeSet paramAttributeSet)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.h = localViewConfiguration.getScaledTouchSlop();
    this.m = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.n = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.d = new StockChartPager(paramContext, paramAttributeSet);
    this.d.setId(2131558469);
    return this.d;
  }
  
  protected com.handmark.pulltorefresh.library.a.f a(Context paramContext, j paramj, TypedArray paramTypedArray)
  {
    switch (t.a[paramj.ordinal()])
    {
    default: 
      return new f(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
    }
    return super.a(paramContext, paramj, paramTypedArray);
  }
  
  protected void a(int paramInt)
  {
    boolean bool = false;
    paramInt = (int)(paramInt * 0.8F);
    int i1 = getScrollY() - paramInt;
    paramInt = i1;
    if (i1 > 0) {
      paramInt = 0;
    }
    this.b.setVisibility(0);
    this.c.setVisibility(4);
    scrollBy(0, paramInt - getScrollY());
    paramInt = (int)Math.round(getHeaderSize() * 1.1D);
    i1 = Math.abs(getScrollY() * 100 / paramInt);
    paramInt = i1;
    if (i1 < 0) {
      paramInt = 0;
    }
    i1 = paramInt;
    if (paramInt > 100) {
      i1 = 100;
    }
    if (i1 == 100) {
      bool = true;
    }
    this.p = bool;
    if ((i1 == 100) && (this.k != 3))
    {
      this.k = 3;
      this.b.i();
    }
    for (;;)
    {
      this.b.b(i1 / 100.0F);
      return;
      if ((i1 < 100) && (this.k != 2))
      {
        this.k = 2;
        this.b.g();
      }
    }
  }
  
  protected boolean a()
  {
    return true;
  }
  
  protected boolean b()
  {
    return true;
  }
  
  protected void c()
  {
    this.k = 4;
    this.b.h();
    a(true);
  }
  
  public void d()
  {
    f();
  }
  
  public p getPullToRefreshScrollDirection()
  {
    return p.a;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i2 = (int)paramMotionEvent.getRawY();
    int i1 = (int)paramMotionEvent.getRawX();
    switch (paramMotionEvent.getAction())
    {
    }
    int i3;
    do
    {
      for (;;)
      {
        return false;
        this.e = i2;
        this.f = i1;
      }
      i2 -= this.e;
      i3 = this.f;
    } while ((Math.abs(i2) <= this.h) || (Math.abs(i2) <= Math.abs(i1 - i3)) || (!c(i2)));
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 0;
    if (this.g != null) {
      this.g.a();
    }
    if (this.i == null) {
      this.i = VelocityTracker.obtain();
    }
    this.i.addMovement(paramMotionEvent);
    int i3 = (int)paramMotionEvent.getRawY();
    int i2 = (int)paramMotionEvent.getRawX();
    int i4;
    label164:
    label196:
    Object localObject;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
      for (;;)
      {
        return super.onTouchEvent(paramMotionEvent);
        this.e = i3;
      }
    case 2: 
      i4 = i3 - this.e;
      if (this.j == 1)
      {
        a(i4);
        if ((i4 < 0) && (getScrollY() == getHeaderSize())) {
          this.j = 5;
        }
        if ((i4 < 0) && (getScrollY() == 0)) {
          this.j = 5;
        }
      }
      for (;;)
      {
        this.e = i3;
        break;
        if ((this.o) || (this.j != 0)) {
          break label196;
        }
        d(i4);
      }
      localObject = (StockChartPager)getRefreshableView();
      if (((i4 > 0) && (((StockChartPager)localObject).isScrollTop()) && (((StockChartPager)localObject).getHeaderHidden() == -((StockChartPager)localObject).getHeaderHeight())) || (((StockChartPager)localObject).getHeaderHidden() != -((StockChartPager)localObject).getHeaderHeight()))
      {
        i2 = ((StockChartPager)localObject).getHeaderHidden() + i4;
        if (i2 <= 0) {
          break label606;
        }
      }
      break;
    }
    for (;;)
    {
      i2 = i1;
      if (i1 < -((StockChartPager)localObject).getHeaderHeight()) {
        i2 = -((StockChartPager)localObject).getHeaderHeight();
      }
      ((StockChartPager)localObject).moveHeader(i2 - ((StockChartPager)localObject).getHeaderHidden());
      for (;;)
      {
        if ((i4 <= 0) || (!((StockChartPager)localObject).isScrollTop()) || (((StockChartPager)localObject).getHeaderHidden() != 0)) {
          break label350;
        }
        this.j = 1;
        break;
        if (((StockChartPager)localObject).isScrollBottom())
        {
          if (((StockChartPager)localObject).upToLoad(i4, false) == 0) {
            ((StockChartPager)localObject).moveContent(-i4);
          }
        }
        else {
          ((StockChartPager)localObject).moveContent(-i4);
        }
      }
      label350:
      this.j = 5;
      break label164;
      localObject = this.i;
      ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.m);
      i1 = (int)((VelocityTracker)localObject).getYVelocity();
      if (this.j == 1) {
        if (this.p)
        {
          c();
          this.p = false;
        }
      }
      for (;;)
      {
        if (this.i == null) {
          break label604;
        }
        this.i.recycle();
        this.i = null;
        break;
        setHeaderScroll(0);
        this.j = 5;
        continue;
        if ((!this.o) && (this.j == 0))
        {
          if (this.q)
          {
            m();
            this.q = false;
          }
          else
          {
            setHeaderScroll(0);
            this.j = 5;
          }
        }
        else if ((this.o) && (this.j == 0))
        {
          Toast.makeText(getContext(), "没有数据可加载了", 0).show();
        }
        else
        {
          localObject = (StockChartPager)getRefreshableView();
          if (Math.abs(i1) > this.n)
          {
            if (this.g == null)
            {
              this.g = new u(getContext(), (StockChartPager)localObject);
              LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(1, 1);
              a(this.g, localLayoutParams);
            }
            this.g.a(i1);
          }
          if (((StockChartPager)localObject).isScrollBottom()) {
            ((StockChartPager)localObject).upToLoad(0, true);
          }
        }
      }
      label604:
      break;
      label606:
      i1 = i2;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\StockRefreshViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */