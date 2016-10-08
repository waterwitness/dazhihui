package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import java.util.concurrent.ConcurrentLinkedQueue;

class al
  extends Thread
{
  al(aj paramaj) {}
  
  public void run()
  {
    while (!aj.f.isEmpty())
    {
      ToServiceMsg localToServiceMsg = (ToServiceMsg)aj.f.poll();
      if (localToServiceMsg != null) {
        try
        {
          this.a.a(localToServiceMsg);
        }
        catch (Exception localException)
        {
          FromServiceMsg localFromServiceMsg = this.a.a(localToServiceMsg, localToServiceMsg.getServiceName() + "sendMsgToServiceFailed，" + localException.toString());
          this.a.c(localToServiceMsg, localFromServiceMsg);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */