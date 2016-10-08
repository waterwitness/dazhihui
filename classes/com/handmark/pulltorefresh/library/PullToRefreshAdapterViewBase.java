package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import com.handmark.pulltorefresh.library.a.a;
import com.handmark.pulltorefresh.library.a.d;

public abstract class PullToRefreshAdapterViewBase<T extends AbsListView>
  extends PullToRefreshBase<T>
  implements AbsListView.OnScrollListener
{
  private boolean d;
  private AbsListView.OnScrollListener e;
  private k f;
  private View g;
  private d h;
  private d i;
  private boolean j;
  private boolean k = true;
  
  public PullToRefreshAdapterViewBase(Context paramContext)
  {
    super(paramContext);
    ((AbsListView)this.a).setOnScrollListener(this);
  }
  
  public PullToRefreshAdapterViewBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    ((AbsListView)this.a).setOnScrollListener(this);
  }
  
  public PullToRefreshAdapterViewBase(Context paramContext, j paramj)
  {
    super(paramContext, paramj);
    ((AbsListView)this.a).setOnScrollListener(this);
  }
  
  public PullToRefreshAdapterViewBase(Context paramContext, j paramj, i parami)
  {
    super(paramContext, paramj, parami);
    ((AbsListView)this.a).setOnScrollListener(this);
  }
  
  private static FrameLayout.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    FrameLayout.LayoutParams localLayoutParams = null;
    if (paramLayoutParams != null)
    {
      localLayoutParams = new FrameLayout.LayoutParams(paramLayoutParams);
      if ((paramLayoutParams instanceof LinearLayout.LayoutParams)) {
        localLayoutParams.gravity = ((LinearLayout.LayoutParams)paramLayoutParams).gravity;
      }
    }
    else
    {
      return localLayoutParams;
    }
    localLayoutParams.gravity = 17;
    return localLayoutParams;
  }
  
  private boolean getShowIndicatorInternal()
  {
    return (this.j) && (h());
  }
  
  private void m()
  {
    Object localObject = getMode();
    FrameLayout localFrameLayout = getRefreshableViewWrapper();
    if ((((j)localObject).c()) && (this.h == null))
    {
      this.h = new d(getContext(), j.b);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.rightMargin = getResources().getDimensionPixelSize(af.indicator_right_padding);
      localLayoutParams.gravity = 53;
      localFrameLayout.addView(this.h, localLayoutParams);
    }
    do
    {
      while ((((j)localObject).d()) && (this.i == null))
      {
        this.i = new d(getContext(), j.c);
        localObject = new FrameLayout.LayoutParams(-2, -2);
        ((FrameLayout.LayoutParams)localObject).rightMargin = getResources().getDimensionPixelSize(af.indicator_right_padding);
        ((FrameLayout.LayoutParams)localObject).gravity = 85;
        localFrameLayout.addView(this.i, (ViewGroup.LayoutParams)localObject);
        return;
        if ((!((j)localObject).c()) && (this.h != null))
        {
          localFrameLayout.removeView(this.h);
          this.h = null;
        }
      }
    } while ((((j)localObject).d()) || (this.i == null));
    localFrameLayout.removeView(this.i);
    this.i = null;
  }
  
  private boolean n()
  {
    Object localObject = ((AbsListView)this.a).getAdapter();
    if ((localObject == null) || (((Adapter)localObject).isEmpty()))
    {
      Log.d("PullToRefresh", "isFirstItemVisible. Empty View.");
      return true;
    }
    if (((AbsListView)this.a).getFirstVisiblePosition() <= 1)
    {
      localObject = ((AbsListView)this.a).getChildAt(0);
      if (localObject != null) {
        return ((View)localObject).getTop() >= ((AbsListView)this.a).getTop();
      }
    }
    return false;
  }
  
  private boolean o()
  {
    Object localObject = ((AbsListView)this.a).getAdapter();
    if ((localObject == null) || (((Adapter)localObject).isEmpty()))
    {
      Log.d("PullToRefresh", "isLastItemVisible. Empty View.");
      return true;
    }
    int n = ((AbsListView)this.a).getCount() - 1;
    int m = ((AbsListView)this.a).getLastVisiblePosition();
    Log.d("PullToRefresh", "isLastItemVisible. Last Item Position: " + n + " Last Visible Pos: " + m);
    if (m >= n - 1)
    {
      n = ((AbsListView)this.a).getFirstVisiblePosition();
      localObject = ((AbsListView)this.a).getChildAt(m - n);
      if (localObject != null) {
        return ((View)localObject).getBottom() <= ((AbsListView)this.a).getBottom();
      }
    }
    return false;
  }
  
  private void p()
  {
    if (this.h != null)
    {
      getRefreshableViewWrapper().removeView(this.h);
      this.h = null;
    }
    if (this.i != null)
    {
      getRefreshableViewWrapper().removeView(this.i);
      this.i = null;
    }
  }
  
  private void q()
  {
    if (this.h != null)
    {
      if ((j()) || (!a())) {
        break label77;
      }
      if (!this.h.a()) {
        this.h.c();
      }
    }
    label77:
    do
    {
      for (;;)
      {
        if (this.i != null)
        {
          if ((j()) || (!b())) {
            break;
          }
          if (!this.i.a()) {
            this.i.c();
          }
        }
        return;
        if (this.h.a()) {
          this.h.b();
        }
      }
    } while (!this.i.a());
    this.i.b();
  }
  
  protected void a(TypedArray paramTypedArray)
  {
    int m = ak.PullToRefresh_ptrShowIndicator;
    if (!i()) {}
    for (boolean bool = true;; bool = false)
    {
      this.j = paramTypedArray.getBoolean(m, bool);
      return;
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if (getShowIndicatorInternal()) {
      q();
    }
  }
  
  protected boolean a()
  {
    return n();
  }
  
  protected boolean b()
  {
    return o();
  }
  
  protected void e()
  {
    super.e();
    if (getShowIndicatorInternal()) {}
    switch (e.a[getCurrentMode().ordinal()])
    {
    default: 
      return;
    case 1: 
      this.i.d();
      return;
    }
    this.h.d();
  }
  
  protected void e_()
  {
    super.e_();
    if (getShowIndicatorInternal()) {}
    switch (e.a[getCurrentMode().ordinal()])
    {
    default: 
      return;
    case 1: 
      this.i.e();
      return;
    }
    this.h.e();
  }
  
  protected void f()
  {
    super.f();
    if (getShowIndicatorInternal()) {
      q();
    }
  }
  
  protected void g()
  {
    super.g();
    if (getShowIndicatorInternal())
    {
      m();
      return;
    }
    p();
  }
  
  public boolean getShowIndicator()
  {
    return this.j;
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    Log.d("PullToRefresh", "First Visible: " + paramInt1 + ". Visible Count: " + paramInt2 + ". Total Items:" + paramInt3);
    if (this.f != null) {
      if ((paramInt3 <= 0) || (paramInt1 + paramInt2 < paramInt3 - 1)) {
        break label111;
      }
    }
    label111:
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      if (getShowIndicatorInternal()) {
        q();
      }
      if (this.e != null) {
        this.e.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
      }
      return;
    }
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.g != null) && (!this.k)) {
      this.g.scrollTo(-paramInt1, -paramInt2);
    }
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 0) && (this.f != null) && (this.d)) {
      this.f.a();
    }
    if (this.e != null) {
      this.e.onScrollStateChanged(paramAbsListView, paramInt);
    }
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    ((AbsListView)this.a).setAdapter(paramListAdapter);
  }
  
  public final void setEmptyView(View paramView)
  {
    FrameLayout localFrameLayout = getRefreshableViewWrapper();
    if (paramView != null)
    {
      paramView.setClickable(true);
      Object localObject = paramView.getParent();
      if ((localObject != null) && ((localObject instanceof ViewGroup))) {
        ((ViewGroup)localObject).removeView(paramView);
      }
      localObject = a(paramView.getLayoutParams());
      if (localObject != null) {
        localFrameLayout.addView(paramView, (ViewGroup.LayoutParams)localObject);
      }
    }
    else
    {
      if (!(this.a instanceof a)) {
        break label93;
      }
      ((a)this.a).setEmptyViewInternal(paramView);
    }
    for (;;)
    {
      this.g = paramView;
      return;
      localFrameLayout.addView(paramView);
      break;
      label93:
      ((AbsListView)this.a).setEmptyView(paramView);
    }
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    ((AbsListView)this.a).setOnItemClickListener(paramOnItemClickListener);
  }
  
  public final void setOnLastItemVisibleListener(k paramk)
  {
    this.f = paramk;
  }
  
  public final void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.e = paramOnScrollListener;
  }
  
  public final void setScrollEmptyView(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public void setShowIndicator(boolean paramBoolean)
  {
    this.j = paramBoolean;
    if (getShowIndicatorInternal())
    {
      m();
      return;
    }
    p();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\PullToRefreshAdapterViewBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */