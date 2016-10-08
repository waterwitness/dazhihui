package com.tencent.avsdk;

import android.os.Handler;
import java.util.TimerTask;

class PickView$MyTimerTask
  extends TimerTask
{
  Handler handler;
  
  public PickView$MyTimerTask(PickView paramPickView, Handler paramHandler)
  {
    this.handler = paramHandler;
  }
  
  public void run()
  {
    this.handler.sendMessage(this.handler.obtainMessage());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\PickView$MyTimerTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */