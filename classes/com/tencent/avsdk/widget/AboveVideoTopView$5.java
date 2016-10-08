package com.tencent.avsdk.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.avsdk.IlvbDataBase;

class AboveVideoTopView$5
  implements View.OnClickListener
{
  AboveVideoTopView$5(AboveVideoTopView paramAboveVideoTopView) {}
  
  public void onClick(View paramView)
  {
    IlvbDataBase.getInstance().putBoolean("ilvb_notify_swipe_right_land", false);
    AboveVideoTopView.access$000(this.this$0).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoTopView$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */