package com.tencent.qalsdk.sdk;

import android.os.Handler;
import com.tencent.qalsdk.util.QLog;
import java.util.concurrent.LinkedBlockingQueue;

class g
  extends Thread
{
  g(e parame) {}
  
  public void run()
  {
    for (;;)
    {
      try
      {
        w localw = (w)e.e.j().take();
        if (localw == null) {
          continue;
        }
        try
        {
          if (localw.a != null) {
            break label59;
          }
          e.r().post(new h(this, localw));
        }
        catch (Exception localException1)
        {
          localException1.printStackTrace();
        }
        continue;
        continue;
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
      }
      label59:
      if (!e.a(this.a, localException2.a, localException2.b)) {
        QLog.e("CoreWrapper", 1, "unknown resp to" + localException2.a + " from:" + localException2.b);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */