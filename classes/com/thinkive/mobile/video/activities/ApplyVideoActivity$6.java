package com.thinkive.mobile.video.activities;

import android.os.Handler;
import android.util.Log;
import java.util.TimerTask;

final class ApplyVideoActivity$6
  extends TimerTask
{
  ApplyVideoActivity$6(ApplyVideoActivity paramApplyVideoActivity) {}
  
  public final void run()
  {
    Log.i("", "查询坐席");
    if (ApplyVideoActivity.j(this.a) == null) {
      return;
    }
    ApplyVideoActivity.j(this.a).sendEmptyMessage(4);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyVideoActivity$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */