package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.GridView;

public class PullToRefreshGridView
  extends PullToRefreshAdapterViewBase<GridView>
{
  public PullToRefreshGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected final GridView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 9) {}
    for (paramContext = new v(this, paramContext, paramAttributeSet);; paramContext = new u(this, paramContext, paramAttributeSet))
    {
      paramContext.setId(ah.gridview);
      return paramContext;
    }
  }
  
  public final p getPullToRefreshScrollDirection()
  {
    return p.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\PullToRefreshGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */