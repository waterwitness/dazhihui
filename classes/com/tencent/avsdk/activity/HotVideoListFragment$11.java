package com.tencent.avsdk.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.header;

class HotVideoListFragment$11
  implements View.OnClickListener
{
  HotVideoListFragment$11(HotVideoListFragment paramHotVideoListFragment) {}
  
  public void onClick(View paramView)
  {
    String str = f.av;
    paramView = str;
    if (HotVideoListFragment.access$1000(this.this$0) != null)
    {
      paramView = str;
      if (HotVideoListFragment.access$1000(this.this$0).getHeader().getZhiboUrl() != null) {
        paramView = HotVideoListFragment.access$1000(this.this$0).getHeader().getZhiboUrl();
      }
    }
    r.a(paramView, this.this$0.getActivity(), "20299", null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */