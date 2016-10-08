package com.tencent.avsdk.activity;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.avsdk.widget.MyGallery;

class HotVideoListFragment$9
  implements View.OnClickListener
{
  HotVideoListFragment$9(HotVideoListFragment paramHotVideoListFragment) {}
  
  public void onClick(View paramView)
  {
    HotVideoListFragment.access$400(this.this$0).setSelected(true);
    HotVideoListFragment.access$600(this.this$0).setmSelect(-1);
    HotVideoListFragment.access$500(this.this$0).animateToTab(0);
    HotVideoListFragment.access$900(this.this$0).setCurrentItem(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */