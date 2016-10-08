package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.b;

final class h
  implements Runnable
{
  h(Context paramContext) {}
  
  public final void run()
  {
    try
    {
      e.p(this.e);
      t.s(this.e).b(this.g);
      return;
    }
    catch (Throwable localThrowable)
    {
      e.K().b(localThrowable);
      e.a(this.e, localThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */