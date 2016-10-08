package com.tencent.qalsdk.core;

import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.util.QLog;
import java.util.concurrent.ConcurrentHashMap;

class i$b
  implements Runnable
{
  private ToServiceMsg b;
  
  public i$b(i parami, ToServiceMsg paramToServiceMsg)
  {
    this.b = paramToServiceMsg;
  }
  
  public void run()
  {
    if (this.b == null) {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "req null, return.");
      }
    }
    for (;;)
    {
      return;
      try
      {
        ToServiceMsg localToServiceMsg = (ToServiceMsg)this.a.a.c.e().get(Integer.valueOf(this.b.getRequestSsoSeq()));
        if ((localToServiceMsg != null) && (localToServiceMsg.isNeedCallback()))
        {
          localToServiceMsg = (ToServiceMsg)this.a.a.c.e().remove(Integer.valueOf(this.b.getRequestSsoSeq()));
          if (localToServiceMsg == null)
          {
            if (!QLog.isColorLevel()) {
              continue;
            }
            QLog.d("MSF.C.NetConnTag", 2, "timeout msg " + localToServiceMsg + " also received resp, return.");
          }
        }
      }
      catch (Exception localException1)
      {
        QLog.d("MSF.C.NetConnTag", 1, "got fail msg. " + localException1, localException1);
        return;
      }
    }
    if (QLog.isDevelopLevel()) {
      QLog.i("MSF.C.NetConnTag", 1, "[MsfAlarmer] netRecv ssoSeq:" + localException1.getRequestSsoSeq() + " uin:" + localException1.getUin() + " cmd:" + localException1.getServiceCmd() + " len:" + 0 + " costTime:" + localException1.getTimeout() + NetConnInfoCenter.getSignalStrengthsLog() + " code:" + 1002 + " failMsg:" + "wait serverResp timeout");
    }
    for (;;)
    {
      FromServiceMsg localFromServiceMsg = k.a(localException1);
      localFromServiceMsg.setBusinessFail(1002, "wait serverResp timeout");
      boolean bool = this.a.a.c.a(localException1, localFromServiceMsg);
      if (!bool) {
        break;
      }
      try
      {
        this.a.a.g().a(localException1, localFromServiceMsg);
        return;
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
        return;
      }
      QLog.i("MSF.C.NetConnTag", 1, "[MsfAlarmer] netRecv ssoSeq:" + localException2.getRequestSsoSeq() + " uin:" + MsfSdkUtils.getShortUin(localException2.getUin()) + " cmd:" + localException2.getServiceCmd() + " len:" + 0 + " costTime:" + localException2.getTimeout() + NetConnInfoCenter.getSignalStrengthsLog() + " code:" + 1002 + " failMsg:" + "wait serverResp timeout");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\i$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */