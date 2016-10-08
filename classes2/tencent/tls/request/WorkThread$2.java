package tencent.tls.request;

import tencent.tls.report.QLog;

class WorkThread$2
  implements Runnable
{
  WorkThread$2(WorkThread paramWorkThread) {}
  
  public void run()
  {
    QLog.i("receive at " + Thread.currentThread().getName());
    try
    {
      WorkThread.access$300(this.this$0).done(WorkThread.access$200(this.this$0));
      return;
    }
    catch (Exception localException)
    {
      QLog.e(localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\WorkThread$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */