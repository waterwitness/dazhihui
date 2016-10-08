package com.android.dazhihui.ui.delegate.screen.hk;

import android.os.Handler;
import android.util.Log;

class ba
  extends Thread
{
  public int a = 0;
  public boolean b = false;
  public int c = 0;
  public boolean d = false;
  public boolean e = false;
  
  ba(HKEntrust paramHKEntrust) {}
  
  public void run()
  {
    Thread.currentThread().setName("PriceheartThread");
    for (;;)
    {
      if (!HKEntrust.D(this.f))
      {
        if ((this.b) && (this.a == 15))
        {
          HKEntrust.E(this.f).removeMessages(0);
          HKEntrust.E(this.f).sendEmptyMessage(0);
        }
        if ((this.d) && (this.c == 50)) {
          this.f.a(false, false);
        }
        try
        {
          Thread.sleep(100L);
          this.a += 1;
          this.c += 1;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            Log.e("EntrustNew", localInterruptedException.toString());
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */