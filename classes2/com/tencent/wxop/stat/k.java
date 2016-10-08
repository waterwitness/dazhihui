package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.a.d;
import com.tencent.wxop.stat.a.h;
import com.tencent.wxop.stat.b.b;
import java.util.Map;

final class k
  implements Runnable
{
  k(Context paramContext, String paramString, f paramf) {}
  
  public final void run()
  {
    try
    {
      e.p(this.e);
      synchronized (e.M())
      {
        Object localObject2 = (Long)e.M().remove(this.b);
        if (localObject2 != null)
        {
          localObject2 = Long.valueOf((System.currentTimeMillis() - ((Long)localObject2).longValue()) / 1000L);
          ??? = localObject2;
          if (((Long)localObject2).longValue() <= 0L) {
            ??? = Long.valueOf(1L);
          }
          String str = e.O();
          localObject2 = str;
          if (str != null)
          {
            localObject2 = str;
            if (str.equals(this.b) == true) {
              localObject2 = "-";
            }
          }
          ??? = new h(this.e, (String)localObject2, this.b, e.a(this.e, false, this.bM), (Long)???, this.bM);
          if (!this.b.equals(e.N())) {
            e.K().warn("Invalid invocation since previous onResume on diff page.");
          }
          new p((d)???).ah();
          e.r(this.b);
          return;
        }
      }
      e.K().d("Starttime for PageID:" + this.b + " not found, lost onResume()?");
    }
    catch (Throwable localThrowable)
    {
      e.K().b(localThrowable);
      e.a(this.e, localThrowable);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */