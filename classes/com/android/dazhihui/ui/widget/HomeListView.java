package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

public class HomeListView
  extends ExpandableListView
  implements AbsListView.OnScrollListener, ks
{
  private int a;
  private int b;
  private int c;
  private View d;
  private View e;
  private dy f;
  
  public HomeListView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public HomeListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public HomeListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    setOnScrollListener(this);
    setOnGroupClickListener(new dx(this));
    setGroupIndicator(null);
    setDivider(null);
    setCacheColorHint(0);
  }
  
  public void a()
  {
    ExpandableListAdapter localExpandableListAdapter = getExpandableListAdapter();
    int i = 0;
    while (i < localExpandableListAdapter.getGroupCount())
    {
      expandGroup(i);
      i += 1;
    }
  }
  
  public void a(dy paramdy)
  {
    this.f = paramdy;
  }
  
  public void addFooterView(View paramView)
  {
    this.e = paramView;
    super.addFooterView(paramView);
  }
  
  public void addHeaderView(View paramView)
  {
    this.d = paramView;
    super.addHeaderView(paramView);
  }
  
  public boolean c()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.a > 0)
    {
      bool1 = bool2;
      if (this.b + this.c == this.a)
      {
        bool1 = bool2;
        if (getChildAt(this.c - 1) != null)
        {
          bool1 = bool2;
          if (getChildAt(this.c - 1).getBottom() == getMeasuredHeight()) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public boolean d()
  {
    if ((this.a > 0) && (this.b == 0))
    {
      View localView2 = this.d;
      View localView1 = localView2;
      if (localView2 == null) {
        localView1 = getChildAt(0);
      }
      return localView1.getTop() == 0;
    }
    return false;
  }
  
  public int getFirstVisibleItem()
  {
    return this.b;
  }
  
  public int getTotalItemCount()
  {
    return this.a;
  }
  
  public int getVisibleItemCount()
  {
    return this.c;
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.a = paramInt3;
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 0) && (this.f != null)) {
      this.f.a();
    }
  }
  
  public void setAdapter(ExpandableListAdapter paramExpandableListAdapter)
  {
    super.setAdapter(paramExpandableListAdapter);
    a();
  }
  
  public void setAddSelfStockLayoutVisibility(int paramInt)
  {
    View localView = this.d.findViewById(2131560252);
    if (localView != null) {
      localView.setVisibility(paramInt);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\HomeListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */