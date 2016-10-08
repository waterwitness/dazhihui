package com.android.dazhihui.ui.widget.a;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class h
  implements Executor
{
  final ArrayDeque<Runnable> a = new ArrayDeque();
  Runnable b;
  
  protected void a()
  {
    try
    {
      Runnable localRunnable = (Runnable)this.a.poll();
      this.b = localRunnable;
      if (localRunnable != null) {
        a.b.execute(this.b);
      }
      return;
    }
    finally {}
  }
  
  public void execute(Runnable paramRunnable)
  {
    try
    {
      this.a.offer(new i(this, paramRunnable));
      if (this.b == null) {
        a();
      }
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */