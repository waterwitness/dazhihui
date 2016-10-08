package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.handmark.pulltorefresh.library.i;
import com.handmark.pulltorefresh.library.j;

public class DzhRefreshListView
  extends PullToRefreshListView
{
  public DzhRefreshListView(Context paramContext)
  {
    super(paramContext);
  }
  
  public DzhRefreshListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public DzhRefreshListView(Context paramContext, j paramj)
  {
    super(paramContext, paramj);
  }
  
  public DzhRefreshListView(Context paramContext, j paramj, i parami)
  {
    super(paramContext, paramj, parami);
  }
  
  protected com.handmark.pulltorefresh.library.a.f a(Context paramContext, j paramj, TypedArray paramTypedArray)
  {
    switch (h.a[paramj.ordinal()])
    {
    default: 
      return new f(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
    }
    return new n(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\DzhRefreshListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */