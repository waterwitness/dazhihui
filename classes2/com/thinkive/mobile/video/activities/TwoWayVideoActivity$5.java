package com.thinkive.mobile.video.activities;

import android.os.Handler;
import java.util.TimerTask;

final class TwoWayVideoActivity$5
  extends TimerTask
{
  TwoWayVideoActivity$5(TwoWayVideoActivity paramTwoWayVideoActivity) {}
  
  public final void run()
  {
    TwoWayVideoActivity.f(this.a).sendEmptyMessage(2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\video\activities\TwoWayVideoActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */