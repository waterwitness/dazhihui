package com.kwlopen.sdk.activity;

import android.os.Handler;
import android.os.Message;
import java.util.TimerTask;

class PlayVideoView$2
  extends TimerTask
{
  PlayVideoView$2(PlayVideoView paramPlayVideoView) {}
  
  public void run()
  {
    Object localObject = this.this$0;
    PlayVideoView.access$1((PlayVideoView)localObject, PlayVideoView.access$0((PlayVideoView)localObject) + 1);
    localObject = new Message();
    ((Message)localObject).what = 1;
    PlayVideoView.access$2(this.this$0).sendMessage((Message)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\PlayVideoView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */