package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

@TargetApi(9)
final class aa
  extends ScrollView
{
  public aa(PullToRefreshScrollView paramPullToRefreshScrollView, Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private int a()
  {
    int i = 0;
    if (getChildCount() > 0) {
      i = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
    }
    return i;
  }
  
  protected boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    boolean bool = super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    c.a(this.a, paramInt1, paramInt3, paramInt2, paramInt4, a(), paramBoolean);
    return bool;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */