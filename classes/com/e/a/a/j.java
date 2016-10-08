package com.e.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class j
  extends Handler
{
  private final i a;
  
  j(i parami, Looper paramLooper)
  {
    super(paramLooper);
    this.a = parami;
  }
  
  public void handleMessage(Message paramMessage)
  {
    this.a.handleMessage(paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */