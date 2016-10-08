package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.ui.widget.StickyScrollView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.i;
import com.handmark.pulltorefresh.library.j;
import com.handmark.pulltorefresh.library.p;

public class StickyRefreshScrollView
  extends PullToRefreshBase<StickyScrollView>
{
  private StickyScrollView d;
  
  public StickyRefreshScrollView(Context paramContext)
  {
    super(paramContext);
  }
  
  public StickyRefreshScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public StickyRefreshScrollView(Context paramContext, j paramj)
  {
    super(paramContext, paramj);
  }
  
  public StickyRefreshScrollView(Context paramContext, j paramj, i parami)
  {
    super(paramContext, paramj, parami);
  }
  
  protected StickyScrollView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.d = new StickyScrollView(paramContext, paramAttributeSet);
    this.d.setId(2131558468);
    return this.d;
  }
  
  protected com.handmark.pulltorefresh.library.a.f a(Context paramContext, j paramj, TypedArray paramTypedArray)
  {
    switch (s.a[paramj.ordinal()])
    {
    default: 
      return new f(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
    }
    paramContext = new n(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
    paramContext.setTextFooterColor(getContext().getResources().getColor(2131493684));
    return paramContext;
  }
  
  protected boolean a()
  {
    return this.d.getScrollY() == 0;
  }
  
  protected boolean b()
  {
    boolean bool2 = false;
    View localView = this.d.getChildAt(0);
    boolean bool1 = bool2;
    if (localView != null)
    {
      bool1 = bool2;
      if (this.d.getScrollY() >= localView.getHeight() - getHeight()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public p getPullToRefreshScrollDirection()
  {
    return p.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\StickyRefreshScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */