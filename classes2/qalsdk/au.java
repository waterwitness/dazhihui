package qalsdk;

import android.os.SystemClock;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.util.MsfSocketInputBuffer;
import com.tencent.qalsdk.util.QLog;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

class au
  extends Thread
{
  AtomicBoolean a = new AtomicBoolean(true);
  long b = SystemClock.elapsedRealtime();
  
  au(at paramat) {}
  
  public void run()
  {
    while (this.a.get()) {
      try
      {
        while (!this.c.g.isDataAvailable(30000)) {
          if (!this.a.get()) {
            return;
          }
        }
        if (!this.a.get()) {
          break;
        }
        this.c.e.a(this.c.g);
        this.c.k.addAndGet(this.c.g.getBufferlen());
        this.c.g.reset();
      }
      catch (Throwable localThrowable)
      {
        this.a.set(false);
        QLog.d("MSF.C.NetConnTag", 1, "read DataError " + localThrowable);
        this.c.a(CloseConnReason.readError);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */