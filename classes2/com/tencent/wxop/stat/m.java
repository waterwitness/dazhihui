package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.b;

final class m
  implements Runnable
{
  m(Context paramContext) {}
  
  public final void run()
  {
    try
    {
      e.a(this.e, false, this.bN);
      return;
    }
    catch (Throwable localThrowable)
    {
      e.K().b(localThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */