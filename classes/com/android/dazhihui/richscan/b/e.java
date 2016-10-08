package com.android.dazhihui.richscan.b;

import android.os.Handler;
import android.os.Looper;
import com.android.dazhihui.richscan.RichScanActivity;
import com.c.b.a;
import com.c.b.o;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

final class e
  extends Thread
{
  private final RichScanActivity a;
  private final Hashtable<com.c.b.e, Object> b;
  private Handler c;
  private final CountDownLatch d;
  
  e(RichScanActivity paramRichScanActivity, Vector<a> paramVector, String paramString, o paramo)
  {
    this.a = paramRichScanActivity;
    this.d = new CountDownLatch(1);
    this.b = new Hashtable(3);
    if (paramVector != null)
    {
      paramRichScanActivity = paramVector;
      if (!paramVector.isEmpty()) {}
    }
    else
    {
      paramRichScanActivity = new Vector();
      paramRichScanActivity.addAll(c.b);
      paramRichScanActivity.addAll(c.c);
      paramRichScanActivity.addAll(c.d);
    }
    this.b.put(com.c.b.e.c, paramRichScanActivity);
    if (paramString != null) {
      this.b.put(com.c.b.e.e, paramString);
    }
    this.b.put(com.c.b.e.j, paramo);
  }
  
  Handler a()
  {
    try
    {
      this.d.await();
      return this.c;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public void run()
  {
    Looper.prepare();
    this.c = new d(this.a, this.b);
    this.d.countDown();
    Looper.loop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */