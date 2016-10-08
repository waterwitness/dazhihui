package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.util.Log;
import com.android.dazhihui.ui.delegate.b.o;

class bu
  extends Thread
{
  public int a = 0;
  public boolean b = false;
  public int c = 0;
  public boolean d = false;
  
  bu(ax paramax) {}
  
  public void run()
  {
    Thread.currentThread().setName("PriceheartThread");
    for (;;)
    {
      if (!ax.J(this.e))
      {
        if ((this.b) && (this.a == 4))
        {
          if (o.l()) {
            this.e.e();
          }
        }
        else {
          label46:
          if ((this.d) && (this.c == 10)) {
            this.e.a(false);
          }
        }
        try
        {
          Thread.sleep(500L);
          this.a += 1;
          this.c += 1;
          continue;
          if (o.m())
          {
            this.e.e(o.g);
            break label46;
          }
          this.e.d();
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */