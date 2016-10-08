package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.handmark.pulltorefresh.library.a.f;

public class PullToRefreshListView
  extends PullToRefreshAdapterViewBase<ListView>
{
  private f d;
  private f e;
  private FrameLayout f;
  private boolean g;
  
  public PullToRefreshListView(Context paramContext)
  {
    super(paramContext);
  }
  
  public PullToRefreshListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PullToRefreshListView(Context paramContext, j paramj)
  {
    super(paramContext, paramj);
  }
  
  public PullToRefreshListView(Context paramContext, j paramj, i parami)
  {
    super(paramContext, paramj, parami);
  }
  
  protected ListView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 9) {
      return new z(this, paramContext, paramAttributeSet);
    }
    return new y(this, paramContext, paramAttributeSet);
  }
  
  protected void a(TypedArray paramTypedArray)
  {
    super.a(paramTypedArray);
    this.g = paramTypedArray.getBoolean(ak.PullToRefresh_ptrListViewExtrasEnabled, true);
    if (this.g)
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2, 1);
      FrameLayout localFrameLayout = new FrameLayout(getContext());
      this.d = a(getContext(), j.b, paramTypedArray);
      this.d.setVisibility(8);
      localFrameLayout.addView(this.d, localLayoutParams);
      ((ListView)this.a).addHeaderView(localFrameLayout, null, false);
      this.f = new FrameLayout(getContext());
      this.e = a(getContext(), j.c, paramTypedArray);
      this.e.setVisibility(8);
      this.f.addView(this.e, localLayoutParams);
      if (!paramTypedArray.hasValue(ak.PullToRefresh_ptrScrollingWhileRefreshingEnabled)) {
        setScrollingWhileRefreshingEnabled(true);
      }
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    Object localObject = ((ListView)this.a).getAdapter();
    if ((!this.g) || (!getShowViewWhileRefreshing()) || (localObject == null) || (((ListAdapter)localObject).isEmpty()))
    {
      super.a(paramBoolean);
      return;
    }
    super.a(false);
    f localf1;
    f localf2;
    int i;
    int j;
    switch (x.a[getCurrentMode().ordinal()])
    {
    default: 
      localObject = getHeaderLayout();
      localf1 = this.d;
      localf2 = this.e;
      i = getScrollY() + getHeaderSize();
      j = 0;
    }
    for (;;)
    {
      ((f)localObject).j();
      ((f)localObject).f();
      localf2.setVisibility(8);
      localf1.setVisibility(0);
      localf1.h();
      if (!paramBoolean) {
        break;
      }
      k();
      setHeaderScroll(i);
      ((ListView)this.a).setSelection(j);
      b(0);
      return;
      localObject = getFooterLayout();
      localf1 = this.e;
      localf2 = this.d;
      j = ((ListView)this.a).getCount() - 1;
      i = getScrollY() - getFooterSize();
    }
  }
  
  protected b b(boolean paramBoolean1, boolean paramBoolean2)
  {
    b localb = super.b(paramBoolean1, paramBoolean2);
    if (this.g)
    {
      j localj = getMode();
      if ((paramBoolean1) && (localj.c())) {
        localb.a(this.d);
      }
      if ((paramBoolean2) && (localj.d())) {
        localb.a(this.e);
      }
    }
    return localb;
  }
  
  protected ListView c(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = a(paramContext, paramAttributeSet);
    paramContext.setId(16908298);
    return paramContext;
  }
  
  protected void f()
  {
    int j = 0;
    int i = 1;
    if (!this.g)
    {
      super.f();
      return;
    }
    f localf2;
    f localf1;
    int k;
    switch (x.a[getCurrentMode().ordinal()])
    {
    default: 
      localf2 = getHeaderLayout();
      localf1 = this.d;
      k = -getHeaderSize();
      if (Math.abs(((ListView)this.a).getFirstVisiblePosition() - 0) > 1) {
        break;
      }
    }
    for (;;)
    {
      if (localf1.getVisibility() == 0)
      {
        localf2.e();
        localf1.setVisibility(8);
        if ((i != 0) && (getState() != r.e))
        {
          ((ListView)this.a).setSelection(j);
          setHeaderScroll(k);
        }
      }
      super.f();
      return;
      localf2 = getFooterLayout();
      localf1 = this.e;
      j = ((ListView)this.a).getCount() - 1;
      k = getFooterSize();
      if (Math.abs(((ListView)this.a).getLastVisiblePosition() - j) <= 1) {}
      for (i = 1;; i = 0) {
        break;
      }
      i = 0;
    }
  }
  
  public final p getPullToRefreshScrollDirection()
  {
    return p.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\PullToRefreshListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */