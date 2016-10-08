package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.util.QLog;
import java.util.concurrent.ConcurrentHashMap;

public class aj$a
  implements Runnable
{
  private ToServiceMsg b;
  
  public aj$a(aj paramaj, ToServiceMsg paramToServiceMsg)
  {
    this.b = paramToServiceMsg;
  }
  
  public void run()
  {
    if (("LongConn.OffPicUp".equalsIgnoreCase(this.b.getServiceCmd())) || ("ImgStore.GroupPicUp".equalsIgnoreCase(this.b.getServiceCmd()))) {
      QLog.d("MSF.D.RemoteServiceProxy", 1, "enter MonitorTaskWrapper.run(), appseq is " + this.b.getAppSeq());
    }
    Object localObject = (ToServiceMsg)aj.g.get(Integer.valueOf(this.b.getAppSeq()));
    if ((localObject != null) && (((ToServiceMsg)localObject).getAttribute("appTimeoutReq", Integer.valueOf(-1)) == this.b.getAttribute("appTimeoutReq", Integer.valueOf(-2))) && ((ToServiceMsg)aj.g.remove(Integer.valueOf(this.b.getAppSeq())) != null))
    {
      QLog.d("MSF.D.RemoteServiceProxy", 1, "found timeout req, appseq is " + this.b.getAppSeq());
      localObject = this.a.a(this.b, this.b.getServiceName() + " timeout");
      this.a.a(this.b, (FromServiceMsg)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\aj$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */