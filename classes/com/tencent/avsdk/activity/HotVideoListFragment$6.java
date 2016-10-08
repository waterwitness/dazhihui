package com.tencent.avsdk.activity;

import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.widget.adv.p;

class HotVideoListFragment$6
  implements p
{
  HotVideoListFragment$6(HotVideoListFragment paramHotVideoListFragment, View paramView) {}
  
  public void onStateChanged(int paramInt)
  {
    if (paramInt == 1)
    {
      this.val$top_advert147.setVisibility(8);
      HotVideoListFragment.access$900(this.this$0).setMinimumHeight(g.a().n() - this.this$0.getResources().getDimensionPixelSize(2131230820) - this.this$0.getResources().getDimensionPixelSize(2131230828) - this.this$0.getResources().getDimensionPixelSize(2131230836));
      return;
    }
    this.val$top_advert147.setVisibility(0);
    HotVideoListFragment.access$900(this.this$0).setMinimumHeight(g.a().n() - this.this$0.getResources().getDimensionPixelSize(2131230820) - this.this$0.getResources().getDimensionPixelSize(2131230828) - this.this$0.getResources().getDimensionPixelSize(2131230836) - this.this$0.getResources().getDimensionPixelSize(2131230836));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */