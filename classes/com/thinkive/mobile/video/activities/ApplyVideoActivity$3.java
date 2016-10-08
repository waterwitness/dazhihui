package com.thinkive.mobile.video.activities;

import android.os.Handler;
import java.util.TimerTask;

final class ApplyVideoActivity$3
  extends TimerTask
{
  ApplyVideoActivity$3(ApplyVideoActivity paramApplyVideoActivity) {}
  
  public final void run()
  {
    if (ApplyVideoActivity.j(this.a) == null) {
      return;
    }
    ApplyVideoActivity.j(this.a).sendEmptyMessage(2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyVideoActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */