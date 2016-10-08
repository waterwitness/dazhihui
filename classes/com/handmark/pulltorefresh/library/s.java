package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import com.handmark.pulltorefresh.library.a.a;

class s
  extends ExpandableListView
  implements a
{
  public s(PullToRefreshExpandableListView paramPullToRefreshExpandableListView, Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void setEmptyView(View paramView)
  {
    this.a.setEmptyView(paramView);
  }
  
  public void setEmptyViewInternal(View paramView)
  {
    super.setEmptyView(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */