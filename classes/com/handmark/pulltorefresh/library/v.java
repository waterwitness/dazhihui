package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

@TargetApi(9)
final class v
  extends u
{
  public v(PullToRefreshGridView paramPullToRefreshGridView, Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramPullToRefreshGridView, paramContext, paramAttributeSet);
  }
  
  protected boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    boolean bool = super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    c.a(this.b, paramInt1, paramInt3, paramInt2, paramInt4, paramBoolean);
    return bool;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */