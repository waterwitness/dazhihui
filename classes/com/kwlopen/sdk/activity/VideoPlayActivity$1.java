package com.kwlopen.sdk.activity;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

class VideoPlayActivity$1
  extends Handler
{
  VideoPlayActivity$1(VideoPlayActivity paramVideoPlayActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    if ((VideoPlayActivity.access$0(this.this$0) != null) && (VideoPlayActivity.access$0(this.this$0).isPlaying()))
    {
      long l = VideoPlayActivity.access$0(this.this$0).getCurrentPosition();
      paramMessage = this.this$0.getShowTime(l);
      this.this$0.timerTextView.setText(paramMessage);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoPlayActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */