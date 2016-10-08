package com.tencent.avsdk.activity;

import android.os.Handler;
import android.util.Log;
import com.tencent.avsdk.UserilvbManager.OnAccountChangeListener;

class AvGuestActivity$1
  implements UserilvbManager.OnAccountChangeListener
{
  AvGuestActivity$1(AvGuestActivity paramAvGuestActivity) {}
  
  public void onAccountChange()
  {
    Log.d("ilvb", "AvGuestActivity OnAccountChangeListener onAccountChange账号切换导致重进房间");
    AvGuestActivity.access$002(this.this$0, false);
    AvGuestActivity.access$100(this.this$0).sendEmptyMessage(320);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\AvGuestActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */