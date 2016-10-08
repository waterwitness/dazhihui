package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.handmark.pulltorefresh.library.i;
import com.handmark.pulltorefresh.library.j;

public class DzhRefreshScrollView
  extends PullToRefreshScrollView
{
  public DzhRefreshScrollView(Context paramContext)
  {
    super(paramContext);
  }
  
  public DzhRefreshScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public DzhRefreshScrollView(Context paramContext, j paramj)
  {
    super(paramContext, paramj);
  }
  
  public DzhRefreshScrollView(Context paramContext, j paramj, i parami)
  {
    super(paramContext, paramj, parami);
  }
  
  protected com.handmark.pulltorefresh.library.a.f a(Context paramContext, j paramj, TypedArray paramTypedArray)
  {
    switch (i.a[paramj.ordinal()])
    {
    default: 
      return new f(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
    }
    return super.a(paramContext, paramj, paramTypedArray);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\DzhRefreshScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */