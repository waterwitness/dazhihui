package com.tencent.imsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

final class ᵢ
  extends Thread
{
  ᵢ(ᵔ paramᵔ, String paramString)
  {
    super(paramString);
  }
  
  public final void run()
  {
    int i = 0;
    if ((QLogImpl.isLogToFile) && (QLogImpl.access$100().compareAndSet(false, true))) {
      try
      {
        QLogImpl.access$202(MsfSdkUtils.getProcessName(QLogImpl.access$000()));
        try
        {
          QLogImpl.access$302(QLogImpl.access$000().getPackageName());
          QLogImpl.access$402(Process.myPid());
          Log.d("appMemory", "QLog init retry ");
          QLogImpl.initLogFile(System.currentTimeMillis());
          QLogImpl.t.setName("logWriteThread");
          QLogImpl.t.start();
          QLogImpl.access$500().removeCallbacks(QLogImpl.acutualInitRunnable);
          return;
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            QLogImpl.access$302("unknow");
          }
        }
        int j;
        return;
      }
      catch (Exception localException2)
      {
        QLogImpl.access$100().set(false);
        localException2.printStackTrace();
        j = QLogImpl.access$600().get();
        Log.d("appMemory", "QLog init post retry " + j + " times, interval " + QLogImpl.access$700()[j]);
        QLogImpl.access$500().removeCallbacks(QLogImpl.acutualInitRunnable);
        QLogImpl.access$500().postDelayed(QLogImpl.acutualInitRunnable, QLogImpl.access$700()[j] * 60000);
        j += 1;
        if (j >= QLogImpl.access$700().length) {}
        for (;;)
        {
          QLogImpl.access$600().set(i);
          return;
          i = j;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ᵢ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */