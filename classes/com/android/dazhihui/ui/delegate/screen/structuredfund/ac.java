package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.util.Log;

class ac
  extends Thread
{
  public int a = 0;
  public boolean b = false;
  public int c = 0;
  public boolean d = false;
  
  ac(i parami) {}
  
  public void run()
  {
    Thread.currentThread().setName("PriceheartThread");
    for (;;)
    {
      if (!i.G(this.e))
      {
        if ((this.b) && (this.a == 4)) {
          this.e.e();
        }
        if ((this.d) && (this.c == 10)) {
          this.e.a(false);
        }
        try
        {
          Thread.sleep(500L);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */