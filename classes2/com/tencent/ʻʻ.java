package com.tencent;

import com.tencent.imcore.IMCore;
import com.tencent.imcore.IMCoreUser;
import com.tencent.imsdk.QLog;

final class ʻʻ
  implements Runnable
{
  ʻʻ(ᴵᴵ paramᴵᴵ, TIMCallBack paramTIMCallBack) {}
  
  public final void run()
  {
    TIMManager.getInstanceById(this.b.b).getCoreUser().loginSyncMsg();
    this.a.onSuccess();
    QLog.i("imsdk.IMCoreWrapper", 1, "Login|5-Callback|Succ|Login succ");
    IMCore.get().clearLog(IMCoreWrapper.get().getLogPath(), System.currentTimeMillis() / 1000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʻʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */