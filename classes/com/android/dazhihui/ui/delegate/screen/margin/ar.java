package com.android.dazhihui.ui.delegate.screen.margin;

import android.util.Log;

class ar
  extends Thread
{
  public int a = 0;
  public boolean b = false;
  public int c = 0;
  public boolean d = false;
  
  ar(aa paramaa) {}
  
  public void run()
  {
    Thread.currentThread().setName("PriceheartThread");
    for (;;)
    {
      if (!aa.S(this.e))
      {
        if ((this.b) && (this.a == 4)) {
          this.e.d();
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */