package com.kwlopen.sdk.activity;

import android.os.Handler;
import android.os.Message;
import java.util.TimerTask;

class CaptureVideo$4
  extends TimerTask
{
  CaptureVideo$4(CaptureVideo paramCaptureVideo) {}
  
  public void run()
  {
    Object localObject = this.this$0;
    CaptureVideo.access$7((CaptureVideo)localObject, CaptureVideo.access$0((CaptureVideo)localObject) + 1);
    localObject = new Message();
    ((Message)localObject).what = 1;
    this.this$0.handler.sendMessage((Message)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\CaptureVideo$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */