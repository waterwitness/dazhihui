package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.b;

final class l
  implements Runnable
{
  l(Context paramContext) {}
  
  public final void run()
  {
    if (this.e == null)
    {
      e.K().error("The Context of StatService.onResume() can not be null!");
      return;
    }
    e.a(this.e, com.tencent.wxop.stat.b.l.B(this.e), this.bN);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */