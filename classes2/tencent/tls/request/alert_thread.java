package tencent.tls.request;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import tencent.tls.platform.TLSErrInfo;

public class alert_thread
  extends Thread
{
  private Context context;
  private TLSErrInfo errInfo;
  Runnable myRunnable = new alert_thread.1(this);
  
  public alert_thread(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public alert_thread(Context paramContext, TLSErrInfo paramTLSErrInfo)
  {
    this.context = paramContext;
    setErrMsg(paramTLSErrInfo);
  }
  
  public TLSErrInfo getErrMsg()
  {
    return this.errInfo;
  }
  
  public void run()
  {
    new Handler(Looper.getMainLooper()).post(this.myRunnable);
  }
  
  public void setErrMsg(TLSErrInfo paramTLSErrInfo)
  {
    this.errInfo = paramTLSErrInfo;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\alert_thread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */