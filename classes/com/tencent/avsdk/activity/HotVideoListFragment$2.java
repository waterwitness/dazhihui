package com.tencent.avsdk.activity;

import android.support.v4.view.df;
import android.widget.ImageView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.topConfig;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.tencent.avsdk.widget.MyGallery;
import java.util.List;

class HotVideoListFragment$2
  implements df
{
  HotVideoListFragment$2(HotVideoListFragment paramHotVideoListFragment) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt)
  {
    if (HotVideoListFragment.access$200(this.this$0) != null)
    {
      n.a("", ((LivebarConfigVo.topConfig)HotVideoListFragment.access$300(this.this$0).get(paramInt)).getCountid());
      if (((LivebarConfigVo.topConfig)HotVideoListFragment.access$300(this.this$0).get(paramInt)).getType() == 6) {
        ((MainScreen)this.this$0.getActivity()).a(Integer.MIN_VALUE, null, 0, 0);
      }
    }
    else
    {
      return;
    }
    if (this.this$0.getMyHongBaoShow())
    {
      if (paramInt != 0)
      {
        HotVideoListFragment.access$400(this.this$0).setSelected(false);
        HotVideoListFragment.access$500(this.this$0).animateToTab(paramInt - 1);
        HotVideoListFragment.access$600(this.this$0).setmSelect(paramInt - 1);
        HotVideoListFragment.access$600(this.this$0).notifyDataSetChanged();
        return;
      }
      HotVideoListFragment.access$400(this.this$0).setSelected(true);
      HotVideoListFragment.access$600(this.this$0).setmSelect(-1);
      HotVideoListFragment.access$600(this.this$0).notifyDataSetChanged();
      return;
    }
    HotVideoListFragment.access$500(this.this$0).animateToTab(paramInt);
    HotVideoListFragment.access$600(this.this$0).setmSelect(paramInt);
    HotVideoListFragment.access$600(this.this$0).notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */