package tencent.tls.request;

import android.os.Handler;
import android.os.Looper;

class WorkThread$1
  implements Runnable
{
  WorkThread$1(WorkThread paramWorkThread) {}
  
  public void run()
  {
    Looper.prepare();
    WorkThread.access$002(Looper.myLooper());
    WorkThread.access$102(this.this$0, new Handler());
    Looper.loop();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\WorkThread$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */