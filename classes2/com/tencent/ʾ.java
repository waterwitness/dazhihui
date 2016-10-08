package com.tencent;

import com.tencent.imcore.ThreadEntry;
import com.tencent.imsdk.QLog;

final class ʾ
  implements Runnable
{
  ʾ(ʻ paramʻ, ThreadEntry paramThreadEntry) {}
  
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʾ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */