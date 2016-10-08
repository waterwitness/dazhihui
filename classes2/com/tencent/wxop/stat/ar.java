package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.a.a;

final class ar
  implements Runnable
{
  ar(Context paramContext, com.tencent.wxop.stat.a.b paramb) {}
  
  public final void run()
  {
    try
    {
      a locala = new a(this.e, e.a(this.e, false, this.bN), this.jdField_do.a, this.bN);
      locala.ab().bm = this.jdField_do.bm;
      new p(locala).ah();
      return;
    }
    catch (Throwable localThrowable)
    {
      e.K().b(localThrowable);
      e.a(this.e, localThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */