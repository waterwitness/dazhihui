package com.tencent.avsdkhost.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.avsdk.IlvbDataBase;

class AboveVideoTopViewHost$1
  implements View.OnClickListener
{
  AboveVideoTopViewHost$1(AboveVideoTopViewHost paramAboveVideoTopViewHost) {}
  
  public void onClick(View paramView)
  {
    IlvbDataBase.getInstance().putBoolean("ilvb_notify_swipe_right", false);
    AboveVideoTopViewHost.access$000(this.this$0).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoTopViewHost$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */