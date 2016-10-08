package com.android.dazhihui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;

class h
  extends Handler
{
  h(g paramg, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
    case 0: 
      do
      {
        return;
        Log.d("Protocol", "dispatch 1000 failed");
      } while (!com.android.dazhihui.a.g.a().o());
      com.android.dazhihui.a.g.a().d();
      return;
    }
    Process.killProcess(Process.myPid());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */