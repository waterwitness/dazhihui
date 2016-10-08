package qalsdk;

import com.tencent.qalsdk.util.QLog;

class l
  extends Thread
{
  l(aj paramaj) {}
  
  public void run()
  {
    try
    {
      synchronized (this.a.m)
      {
        this.a.m.wait();
        this.a.c(aj.a(this.a));
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.w("MSF.C.PushManager", 2, localInterruptedException.toString(), localInterruptedException);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */