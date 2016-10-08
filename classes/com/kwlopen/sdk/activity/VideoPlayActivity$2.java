package com.kwlopen.sdk.activity;

import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

class VideoPlayActivity$2
  extends TimerTask
{
  VideoPlayActivity$2(VideoPlayActivity paramVideoPlayActivity) {}
  
  public void run()
  {
    try
    {
      VideoPlayActivity.access$2(this.this$0).sendEmptyMessage(0);
      return;
    }
    catch (Exception localException)
    {
      VideoPlayActivity.access$3(this.this$0).cancel();
      VideoPlayActivity.access$4(this.this$0, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoPlayActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */