package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

public class PullToRefreshScrollView
  extends PullToRefreshBase<ScrollView>
{
  public PullToRefreshScrollView(Context paramContext)
  {
    super(paramContext);
  }
  
  public PullToRefreshScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PullToRefreshScrollView(Context paramContext, j paramj)
  {
    super(paramContext, paramj);
  }
  
  public PullToRefreshScrollView(Context paramContext, j paramj, i parami)
  {
    super(paramContext, paramj, parami);
  }
  
  protected ScrollView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 9) {}
    for (paramContext = new aa(this, paramContext, paramAttributeSet);; paramContext = new ScrollView(paramContext, paramAttributeSet))
    {
      paramContext.setId(ah.scrollview);
      return paramContext;
    }
  }
  
  protected boolean a()
  {
    return ((ScrollView)this.a).getScrollY() == 0;
  }
  
  protected boolean b()
  {
    View localView = ((ScrollView)this.a).getChildAt(0);
    if (localView != null) {
      return ((ScrollView)this.a).getScrollY() >= localView.getHeight() - getHeight();
    }
    return false;
  }
  
  public final p getPullToRefreshScrollDirection()
  {
    return p.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\PullToRefreshScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */