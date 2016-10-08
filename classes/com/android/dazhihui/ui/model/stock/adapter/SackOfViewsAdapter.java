package com.android.dazhihui.ui.model.stock.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

public class SackOfViewsAdapter
  extends BaseAdapter
{
  private List<View> views = null;
  
  public SackOfViewsAdapter(int paramInt)
  {
    this.views = new ArrayList(paramInt);
    int i = 0;
    while (i < paramInt)
    {
      this.views.add(null);
      i += 1;
    }
  }
  
  public SackOfViewsAdapter(List<View> paramList)
  {
    this.views = paramList;
  }
  
  public boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public int getCount()
  {
    return this.views.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.views.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = (View)this.views.get(paramInt);
    paramView = localView;
    if (localView == null)
    {
      paramView = newView(paramInt, paramViewGroup);
      this.views.set(paramInt, paramView);
    }
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    return getCount();
  }
  
  public boolean hasView(View paramView)
  {
    return this.views.contains(paramView);
  }
  
  public boolean isEnabled(int paramInt)
  {
    return false;
  }
  
  protected View newView(int paramInt, ViewGroup paramViewGroup)
  {
    throw new RuntimeException("You must override newView()!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\SackOfViewsAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */