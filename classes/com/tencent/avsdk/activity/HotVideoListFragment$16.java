package com.tencent.avsdk.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.header;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.zb;

class HotVideoListFragment$16
  implements View.OnClickListener
{
  HotVideoListFragment$16(HotVideoListFragment paramHotVideoListFragment) {}
  
  public void onClick(View paramView)
  {
    r.a(HotVideoListFragment.access$1000(this.this$0).getHeader().getZb().getUrl(), this.this$0.getActivity(), HotVideoListFragment.access$1000(this.this$0).getHeader().getZb().getCountid() + "", null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */