package qalsdk;

import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.sdk.x;
import com.tencent.qalsdk.util.QLog;

class n
  extends Thread
{
  n(aj paramaj) {}
  
  public void run()
  {
    try
    {
      Thread.sleep(6000L);
      QLog.i("MSF.C.PushManager", "onConnClosed send open conn,net is ok: " + m.b());
      if (m.b())
      {
        QLog.i("MSF.C.PushManager", "onConnClosed send open conn");
        if (this.a.a.s == null)
        {
          QLog.i("MSF.C.PushManager", "no conn,send open conn");
          ToServiceMsg localToServiceMsg = x.a("");
          MsfSdkUtils.addToMsgProcessName("", localToServiceMsg);
          this.a.a.a(localToServiceMsg);
        }
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localInterruptedException.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */