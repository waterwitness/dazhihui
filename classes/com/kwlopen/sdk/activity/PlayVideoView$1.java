package com.kwlopen.sdk.activity;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

class PlayVideoView$1
  extends Handler
{
  PlayVideoView$1(PlayVideoView paramPlayVideoView) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0) {
      this.this$0.mediaPlayer.pause();
    }
    while (paramMessage.what != 1) {
      return;
    }
    this.this$0.timerTextView.setText(this.this$0.paserTime(PlayVideoView.access$0(this.this$0)));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\PlayVideoView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */