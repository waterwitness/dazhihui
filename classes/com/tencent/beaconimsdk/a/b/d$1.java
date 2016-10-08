package com.tencent.beaconimsdk.a.b;

import android.content.Context;
import com.tencent.beaconimsdk.a.e;
import java.util.Date;

final class d$1
  implements Runnable
{
  d$1(d paramd, String paramString1, String paramString2, Context paramContext) {}
  
  public final void run()
  {
    String str = this.a;
    try
    {
      l1 = e.e(this.b).getTime() / 1000L;
      long l2 = l1;
      if (l1 == 0L) {
        l2 = new Date().getTime() / 1000L + 86400L;
      }
      Context localContext = this.c;
      this.d.getClass();
      e.a(localContext, "sid", new Object[] { str, Long.valueOf(l2) });
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        long l1 = 0L;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\b\d$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */