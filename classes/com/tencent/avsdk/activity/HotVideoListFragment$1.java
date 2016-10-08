package com.tencent.avsdk.activity;

import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;

class HotVideoListFragment$1
  implements Runnable
{
  HotVideoListFragment$1(HotVideoListFragment paramHotVideoListFragment) {}
  
  public void run()
  {
    if (!HotVideoListFragment.access$000(this.this$0))
    {
      if (HotVideoListFragment.access$100(this.this$0) != null)
      {
        HotVideoListFragment.access$100(this.this$0).a(false, 0);
        HotVideoListFragment.access$100(this.this$0).b();
      }
      HotVideoListFragment.access$002(this.this$0, true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */