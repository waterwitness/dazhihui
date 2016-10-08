package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ExpandableListView;

public class PullToRefreshExpandableListView
  extends PullToRefreshAdapterViewBase<ExpandableListView>
{
  public PullToRefreshExpandableListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected ExpandableListView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 9) {}
    for (paramContext = new t(this, paramContext, paramAttributeSet);; paramContext = new s(this, paramContext, paramAttributeSet))
    {
      paramContext.setId(16908298);
      return paramContext;
    }
  }
  
  public final p getPullToRefreshScrollDirection()
  {
    return p.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\PullToRefreshExpandableListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */