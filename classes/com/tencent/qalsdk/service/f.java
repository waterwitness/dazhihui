package com.tencent.qalsdk.service;

import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.sdk.w;
import java.util.concurrent.LinkedBlockingQueue;

public class f
  extends Thread
{
  private static String c = "MSF.S.RespHandler";
  public volatile boolean a = true;
  j b;
  
  public f(j paramj)
  {
    this.b = paramj;
  }
  
  public void run()
  {
    while (this.a)
    {
      try
      {
        w localw = (w)this.b.e().take();
        if (localw == null) {
          continue;
        }
        if (localw.a == null) {
          break label61;
        }
        c.a(g.b(localw.a), localw.a, localw.b);
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
      continue;
      label61:
      if (localInterruptedException.b != null) {
        c.a(g.a(localInterruptedException.b), localInterruptedException.a, localInterruptedException.b);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\service\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */