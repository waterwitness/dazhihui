package com.tencent.qalsdk.core;

import com.tencent.qalsdk.config.NativeConfigStore;

class p
  extends Thread
{
  p(o paramo) {}
  
  public void run()
  {
    try
    {
      Thread.sleep(180000L);
      l.a().removeConfig("LOGLEVEL_");
      l.a().removeConfig("LOGLEVELTIME");
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localInterruptedException.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */