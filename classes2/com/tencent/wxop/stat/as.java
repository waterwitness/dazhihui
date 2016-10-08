package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.b;
import java.util.Map;

final class as
  implements Runnable
{
  as(String paramString, Context paramContext, f paramf) {}
  
  public final void run()
  {
    try
    {
      synchronized ()
      {
        if (e.M().size() >= c.v())
        {
          e.K().error("The number of page events exceeds the maximum value " + Integer.toString(c.v()));
          return;
        }
        e.q(this.a);
        if (e.M().containsKey(e.N()))
        {
          e.K().d("Duplicate PageID : " + e.N() + ", onResume() repeated?");
          return;
        }
      }
      e.M().put(e.N(), Long.valueOf(System.currentTimeMillis()));
    }
    catch (Throwable localThrowable)
    {
      e.K().b(localThrowable);
      e.a(this.co, localThrowable);
      return;
    }
    e.a(this.co, true, this.bM);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */