package com.tencent.avsdk.activity;

import android.view.View;
import com.android.dazhihui.ui.widget.adv.p;

class HotVideoListFragment$5
  implements p
{
  HotVideoListFragment$5(HotVideoListFragment paramHotVideoListFragment) {}
  
  public void onStateChanged(int paramInt)
  {
    if (paramInt == 1) {
      HotVideoListFragment.access$800(this.this$0).setVisibility(0);
    }
    while (paramInt != 2) {
      return;
    }
    HotVideoListFragment.access$800(this.this$0).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */