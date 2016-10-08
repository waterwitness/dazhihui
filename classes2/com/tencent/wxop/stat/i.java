package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.b;

final class i
  implements Runnable
{
  i(Context paramContext) {}
  
  public final void run()
  {
    try
    {
      new Thread(new o(this.e), "NetworkMonitorTask").start();
      return;
    }
    catch (Throwable localThrowable)
    {
      e.K().b(localThrowable);
      e.a(this.e, localThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */