package com.android.dazhihui.a;

import android.os.Message;
import android.os.Process;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.jni.DzhNative;

class b
  implements Runnable
{
  b(a parama) {}
  
  public void run()
  {
    Process.setThreadPriority(10);
    int i = DzhNative.getInstance().createConnection(a.a(this.a), a.b(this.a), a.c(this.a), a.d(this.a), a.e(this.a));
    if ((a.f(this.a) != null) && (Thread.currentThread().equals(a.f(this.a))))
    {
      if (i >= 0)
      {
        a.a(this.a, i);
        DzhNative.getInstance().registDispatchReceive(this.a, a.g(this.a));
        a.h(this.a).c(false);
        g.a().d(a.h(this.a));
        Object localObject = a.h(this.a).n();
        DzhNative.getInstance().send((byte[])localObject, a.g(this.a));
        localObject = Message.obtain();
        ((Message)localObject).what = 0;
        a.h(this.a).a((Message)localObject, a.h(this.a).c());
        return;
      }
      this.a.exception(-1);
      return;
    }
    DzhNative.getInstance().closeConnection(i);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */