package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class PullListView
  extends ListView
  implements ks
{
  public PullListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PullListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean c()
  {
    if (getLastVisiblePosition() == getCount() - 1) {}
    return false;
  }
  
  public boolean d()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (getFirstVisiblePosition() == 0)
    {
      bool1 = bool2;
      if (getChildAt(0) != null)
      {
        bool1 = bool2;
        if (getChildAt(0).getTop() == 0) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\PullListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */