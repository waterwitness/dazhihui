package com.thinkive.mobile.video.activities;

import android.os.Handler;
import android.os.Message;
import java.util.Timer;
import java.util.TimerTask;

final class ApplyVideoActivity$1
  extends Handler
{
  ApplyVideoActivity$1(ApplyVideoActivity paramApplyVideoActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default: 
    case 4: 
    case 1: 
    case 2: 
      do
      {
        return;
        ApplyVideoActivity.a(this.a);
        return;
        try
        {
          ApplyVideoActivity.b(this.a).cancel();
          ApplyVideoActivity.c(this.a).cancel();
          ApplyVideoActivity.d(this.a).cancel();
          ApplyVideoActivity.e(this.a);
          return;
        }
        catch (Exception paramMessage)
        {
          for (;;)
          {
            paramMessage.printStackTrace();
          }
        }
      } while (ApplyVideoActivity.f(this.a));
      ApplyVideoActivity.g(this.a);
      return;
    }
    ApplyVideoActivity.h(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyVideoActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */