package com.thinkive.mobile.video.activities;

import android.os.Handler;
import java.util.TimerTask;

final class OfflineVideoActivity$a
  extends TimerTask
{
  private Handler a = new OfflineVideoActivity.a.1(this);
  
  OfflineVideoActivity$a(OfflineVideoActivity paramOfflineVideoActivity) {}
  
  public final void run()
  {
    this.a.sendEmptyMessage(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\OfflineVideoActivity$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */