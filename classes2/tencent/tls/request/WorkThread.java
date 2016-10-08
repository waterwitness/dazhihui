package tencent.tls.request;

import android.os.Handler;
import android.os.Looper;
import tencent.tls.report.QLog;

public class WorkThread
  extends Thread
{
  private static Thread loopThread;
  private static Looper selfLooper;
  private Handler handler;
  private int ret;
  private WorkThread.When when;
  private WorkThread.Worker worker;
  
  public WorkThread(Looper paramLooper, WorkThread.Worker paramWorker, WorkThread.When paramWhen)
  {
    this.worker = paramWorker;
    this.when = paramWhen;
    if (paramLooper == null)
    {
      if ((loopThread != null) && (loopThread.isAlive()))
      {
        this.handler = new Handler(selfLooper);
        return;
      }
      loopThread = new Thread(new WorkThread.1(this));
      loopThread.setName("TLSLoopThread-" + loopThread.getId());
      loopThread.setDaemon(true);
      loopThread.start();
      return;
    }
    this.handler = new Handler(paramLooper);
  }
  
  public void run()
  {
    try
    {
      QLog.i("run at " + Thread.currentThread().getName());
      this.ret = this.worker.work();
      this.handler.post(new WorkThread.2(this));
      return;
    }
    catch (Exception localException)
    {
      QLog.e(localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\WorkThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */