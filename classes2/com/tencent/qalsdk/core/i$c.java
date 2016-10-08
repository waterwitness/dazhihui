package com.tencent.qalsdk.core;

import com.tencent.qalsdk.util.QLog;
import qalsdk.av;

class i$c
  implements Runnable
{
  private av b;
  
  public i$c(i parami, av paramav)
  {
    this.b = paramav;
  }
  
  public void run()
  {
    if (this.b != null) {}
    try
    {
      this.b.c();
      return;
    }
    catch (Exception localException)
    {
      QLog.d("MSF.C.NetConnTag", 1, "call loginConnectTimeOut error " + localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\i$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */