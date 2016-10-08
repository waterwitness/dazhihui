package com.cairh.app.sjkh.ui;

import android.os.Handler;
import android.os.Message;
import java.util.TimerTask;

class VideoCallManager$2
  extends TimerTask
{
  VideoCallManager$2(VideoCallManager paramVideoCallManager) {}
  
  public void run()
  {
    if (VideoCallManager.access$1(this.this$0) == null) {
      return;
    }
    Message localMessage = new Message();
    VideoCallManager.access$1(this.this$0).sendMessage(localMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\VideoCallManager$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */