package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.b;
import com.tencent.wxop.stat.b.l;

final class ao
  implements Runnable
{
  ao(Context paramContext) {}
  
  public final void run()
  {
    if (this.e == null)
    {
      e.K().error("The Context of StatService.onPause() can not be null!");
      return;
    }
    e.b(this.e, l.B(this.e), this.bN);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */