package com.f.a.a;

import android.os.Handler;
import android.os.Message;
import android.widget.SeekBar;
import com.unionpay.upomp.lthj.plugin.ui.SplashActivity;

public class j
  extends Handler
{
  public j(SplashActivity paramSplashActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (this.a.c >= 100)
    {
      this.a.c = 0;
      SplashActivity.b(this.a).setProgress(this.a.c);
      return;
    }
    this.a.c += 5;
    SplashActivity.b(this.a).incrementProgressBy(5);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */