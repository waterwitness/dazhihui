package com.tencent.avsdk.activity;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.c;

class HotVideoListFragment$7
  implements c
{
  HotVideoListFragment$7(HotVideoListFragment paramHotVideoListFragment) {}
  
  public void onHeaderRefresh(BaseRefreshView paramBaseRefreshView)
  {
    if (HotVideoListFragment.access$1000(this.this$0) == null) {
      this.this$0.initConfig();
    }
    if (HotVideoListFragment.access$200(this.this$0) != null)
    {
      paramBaseRefreshView = (IlvbRoomChildFragment)HotVideoListFragment.access$200(this.this$0).getCurrentFrament();
      if (paramBaseRefreshView != null) {
        paramBaseRefreshView.sendToPullRefresh();
      }
    }
    if (HotVideoListFragment.access$100(this.this$0) != null)
    {
      HotVideoListFragment.access$100(this.this$0).removeCallbacks(HotVideoListFragment.access$1100(this.this$0));
      HotVideoListFragment.access$002(this.this$0, false);
      HotVideoListFragment.access$100(this.this$0).postDelayed(HotVideoListFragment.access$1100(this.this$0), 5000L);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */