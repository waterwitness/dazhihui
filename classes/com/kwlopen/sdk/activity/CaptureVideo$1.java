package com.kwlopen.sdk.activity;

import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;

class CaptureVideo$1
  extends Handler
{
  CaptureVideo$1(CaptureVideo paramCaptureVideo) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      if (CaptureVideo.access$0(this.this$0) == 2) {
        CaptureVideo.access$1(this.this$0).setVisibility(0);
      }
      if (CaptureVideo.access$0(this.this$0) > CaptureVideo.access$2(this.this$0)) {
        CaptureVideo.access$3(this.this$0);
      }
      this.this$0.timerTextView.setText(this.this$0.paserTime(CaptureVideo.access$0(this.this$0)));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\CaptureVideo$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */