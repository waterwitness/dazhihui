package com.android.dazhihui.ui.delegate.screen;

import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;

class ck
  extends Thread
{
  ck(InitVerifedDongHai paramInitVerifedDongHai) {}
  
  public void run()
  {
    Thread.currentThread().setName("SendGetSMSThread");
    if (!InitVerifedDongHai.b(this.a))
    {
      if (g.a().H() != null)
      {
        ??? = Message.obtain();
        ((Message)???).what = 0;
        InitVerifedDongHai.c(this.a).sendMessage((Message)???);
      }
      try
      {
        synchronized (this.a)
        {
          this.a.wait(500L);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          n.c(">>> InitVerifedDongHai mSendGetSMSThd interrupted");
          localInterruptedException.printStackTrace();
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */