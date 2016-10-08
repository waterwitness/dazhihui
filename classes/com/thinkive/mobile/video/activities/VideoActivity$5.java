package com.thinkive.mobile.video.activities;

import android.os.Handler;
import java.util.TimerTask;

final class VideoActivity$5
  extends TimerTask
{
  VideoActivity$5(VideoActivity paramVideoActivity) {}
  
  public final void run()
  {
    if (VideoActivity.f(this.a) == null) {
      return;
    }
    VideoActivity.f(this.a).sendEmptyMessage(2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\VideoActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */