package com.android.dazhihui.ui.widget.dzhrefresh;

import com.android.dazhihui.ui.widget.MyWebView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.m;

final class j
  implements m<MyWebView>
{
  public void a(PullToRefreshBase<MyWebView> paramPullToRefreshBase)
  {
    ((MyWebView)paramPullToRefreshBase.getRefreshableView()).reload();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */