package com.android.dazhihui.ui.widget.a;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

class c
  extends k<Params, Result>
{
  c(a parama)
  {
    super(null);
  }
  
  public Result call()
  {
    a.a(this.a).set(true);
    Process.setThreadPriority(10);
    return (Result)a.a(this.a, this.a.a(this.b));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */