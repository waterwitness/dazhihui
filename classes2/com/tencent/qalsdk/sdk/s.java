package com.tencent.qalsdk.sdk;

import android.os.Handler;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class s
  extends Thread
{
  s(r paramr, String paramString)
  {
    super(paramString);
  }
  
  public void run()
  {
    int i = 0;
    if ((q.c) && (q.b(this.a.a).compareAndSet(false, true))) {}
    int j;
    try
    {
      q.a(this.a.a, MsfSdkUtils.getProcessName(q.a(this.a.a)));
      q.a(this.a.a, Process.myPid());
      Log.d("appMemory", "QLog init retry ");
      this.a.a.b(System.currentTimeMillis());
      this.a.a.m.setName("logWriteThread");
      this.a.a.m.start();
      q.c(this.a.a).removeCallbacks(this.a.a.j);
      this.a.a.n.start();
      return;
    }
    catch (Exception localException)
    {
      q.b(this.a.a).set(false);
      localException.printStackTrace();
      j = q.d(this.a.a).get();
      Log.d("appMemory", "QLog init post retry " + j + " times, interval " + q.e(this.a.a)[j]);
      q.c(this.a.a).removeCallbacks(this.a.a.j);
      q.c(this.a.a).postDelayed(this.a.a.j, q.e(this.a.a)[j] * 60000);
      j += 1;
      if (j < q.e(this.a.a).length) {}
    }
    for (;;)
    {
      q.d(this.a.a).set(i);
      return;
      i = j;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */