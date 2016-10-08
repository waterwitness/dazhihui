package com.tencent.imsdk;

import java.io.PrintStream;

final class ⁱ
  extends Thread
{
  public final void run()
  {
    try
    {
      for (;;)
      {
        String str = (String)QLogImpl.logDeque.take();
        if (str != null) {
          QLogImpl.access$800(str);
        }
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      System.out.println("write log file error." + localInterruptedException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ⁱ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */