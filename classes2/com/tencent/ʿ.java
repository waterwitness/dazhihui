package com.tencent;

import com.tencent.imcore.RunClosure;
import com.tencent.imsdk.QLog;

final class ʿ
  implements Runnable
{
  ʿ(ʻ paramʻ, RunClosure paramRunClosure) {}
  
  public final void run()
  {
    try
    {
      this.a.run();
      return;
    }
    catch (Throwable localThrowable)
    {
      String str;
      TIMExceptionListener localTIMExceptionListener;
      do
      {
        str = IMFunc.getExceptionInfo(localThrowable);
        QLog.e(ʻ.b(), 1, str);
        localTIMExceptionListener = TIMManager.getInstance().getExceptionListener();
      } while (localTIMExceptionListener == null);
      localTIMExceptionListener.onException(str);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʿ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */