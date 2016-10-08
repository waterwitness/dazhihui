package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;

public class PullToRefreshHorizontalScrollView
  extends PullToRefreshBase<HorizontalScrollView>
{
  public PullToRefreshHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected HorizontalScrollView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 9) {}
    for (paramContext = new w(this, paramContext, paramAttributeSet);; paramContext = new HorizontalScrollView(paramContext, paramAttributeSet))
    {
      paramContext.setId(ah.scrollview);
      return paramContext;
    }
  }
  
  protected boolean a()
  {
    return ((HorizontalScrollView)this.a).getScrollX() == 0;
  }
  
  protected boolean b()
  {
    View localView = ((HorizontalScrollView)this.a).getChildAt(0);
    if (localView != null) {
      return ((HorizontalScrollView)this.a).getScrollX() >= localView.getWidth() - getWidth();
    }
    return false;
  }
  
  public final p getPullToRefreshScrollDirection()
  {
    return p.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\PullToRefreshHorizontalScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */