package com.tencent.qalsdk.service;

import android.os.Binder;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IBaseService.Stub;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.util.QLog;

class i
  extends IBaseService.Stub
{
  i(QalService paramQalService) {}
  
  public FromServiceMsg sendSyncToServiceMsg(ToServiceMsg paramToServiceMsg)
  {
    return null;
  }
  
  public int sendToServiceMsg(ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg == null)
    {
      if (QLog.isColorLevel()) {
        QLog.w("QalService", 2, "sendToServiceMsg toServiceMsg null!");
      }
      return -1;
    }
    QLog.d("QalService", "service rcvmsg. ssoCmd:" + paramToServiceMsg.getServiceCmd() + " msfCmd:" + paramToServiceMsg.getMsfCommand() + " appSeq:" + paramToServiceMsg.getAppSeq());
    int i = j.f();
    if (paramToServiceMsg.getRequestSsoSeq() == -1) {
      paramToServiceMsg.setRequestSsoSeq(i);
    }
    if (paramToServiceMsg.getTimeout() == -1L) {
      paramToServiceMsg.setTimeout(15000L);
    }
    try
    {
      int j = Binder.getCallingUid();
      paramToServiceMsg.addAttribute("__base_tag_isAppMsg", Boolean.valueOf(true));
      if (paramToServiceMsg.getServiceCmd().startsWith("cmd_sync_syncuser")) {
        return i;
      }
      if (QalService.isSamePackage(this.a, j, paramToServiceMsg.getServiceCmd())) {
        QalService.msfServiceReqHandler.a(this.a, paramToServiceMsg, j);
      }
    }
    catch (Exception paramToServiceMsg)
    {
      QLog.w("QalService", 1, "service handle msg error " + paramToServiceMsg, paramToServiceMsg);
    }
    return -2;
    return i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\service\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */