package com.tencent.qalsdk.sdk;

import java.io.PrintStream;

class t
  extends Thread
{
  t(q paramq) {}
  
  public void run()
  {
    try
    {
      for (;;)
      {
        String str = (String)this.a.h.k();
        if (str != null) {
          q.b(this.a, str);
        }
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      System.out.println("write log file error." + localInterruptedException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */