package com.payeco.android.plugin;

import android.os.Looper;

final class h
  extends Thread
{
  private h(PayecoOrderDetailActivity paramPayecoOrderDetailActivity) {}
  
  public final void run()
  {
    Looper.prepare();
    PayecoOrderDetailActivity.a(this.J, Looper.myLooper());
    PayecoOrderDetailActivity.e(this.J);
    Looper.loop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */