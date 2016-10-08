package com.android.dazhihui.ui.screen;

import com.android.dazhihui.ui.widget.MyWebView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.m;

class n
  implements m<MyWebView>
{
  n(i parami) {}
  
  public void a(PullToRefreshBase<MyWebView> paramPullToRefreshBase)
  {
    if (i.b(this.a) != null) {
      i.b(this.a).reload();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */