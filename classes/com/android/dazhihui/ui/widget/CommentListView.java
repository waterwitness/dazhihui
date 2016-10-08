package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class CommentListView
  extends ListView
  implements ks
{
  public CommentListView(Context paramContext)
  {
    super(paramContext);
  }
  
  public CommentListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CommentListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean c()
  {
    int j = getLastVisiblePosition();
    int k = getCount() - 1;
    if ((j < 0) || (k < 0)) {
      return false;
    }
    View localView = getChildAt(j - getFirstVisiblePosition());
    int i;
    if (localView != null)
    {
      i = localView.getBottom();
      localView.getHeight();
    }
    for (;;)
    {
      int m = getHeight();
      if ((j != k) || (i != m - getPaddingBottom())) {
        break;
      }
      return true;
      i = 0;
    }
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CommentListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */