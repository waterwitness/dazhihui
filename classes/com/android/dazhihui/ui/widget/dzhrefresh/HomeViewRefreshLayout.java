package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.HomeListView;
import com.android.dazhihui.ui.widget.IndexTopLayout;
import com.android.dazhihui.ui.widget.SelfStockSortMenuLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.i;
import com.handmark.pulltorefresh.library.j;
import com.handmark.pulltorefresh.library.p;

public class HomeViewRefreshLayout
  extends PullToRefreshBase<HomeView>
{
  private HomeView d;
  private HomeListView e;
  private IndexTopLayout f;
  
  public HomeViewRefreshLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public HomeViewRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public HomeViewRefreshLayout(Context paramContext, j paramj)
  {
    super(paramContext, paramj);
  }
  
  public HomeViewRefreshLayout(Context paramContext, j paramj, i parami)
  {
    super(paramContext, paramj, parami);
  }
  
  protected HomeView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.d = new HomeView(paramContext, paramAttributeSet);
    this.e = this.d.getHomeListView();
    this.e.setVerticalScrollBarEnabled(false);
    this.f = this.d.getTopLayout();
    return this.d;
  }
  
  protected com.handmark.pulltorefresh.library.a.f a(Context paramContext, j paramj, TypedArray paramTypedArray)
  {
    switch (o.a[paramj.ordinal()])
    {
    default: 
      return new f(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
    }
    return super.a(paramContext, paramj, paramTypedArray);
  }
  
  public void a(y paramy)
  {
    this.d.getTopLayout().a(paramy);
    this.d.getSortLayout().a(paramy);
  }
  
  protected boolean a()
  {
    if (this.e != null) {
      return this.e.d();
    }
    return false;
  }
  
  protected boolean b()
  {
    if (this.e != null) {
      return this.e.c();
    }
    return false;
  }
  
  public HomeView getHomeView()
  {
    return this.d;
  }
  
  public p getPullToRefreshScrollDirection()
  {
    return p.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\HomeViewRefreshLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */