package com.payeco.android.plugin.util;

import android.os.Looper;

final class a
  extends Thread
{
  private a(LBSTool paramLBSTool) {}
  
  public final void run()
  {
    Looper.prepare();
    LBSTool.a(this.cn, Looper.myLooper());
    LBSTool.a(this.cn);
    Looper.loop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */