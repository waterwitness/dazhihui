package com.thinkive.mobile.video.activities;

import android.os.Handler;
import java.util.TimerTask;

final class VideoActivity$4
  extends TimerTask
{
  VideoActivity$4(VideoActivity paramVideoActivity) {}
  
  public final void run()
  {
    if (VideoActivity.f(this.a) == null) {
      return;
    }
    VideoActivity.f(this.a).sendEmptyMessage(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\VideoActivity$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */