package com.tencent.imsdk;

import com.tencent.TIMManager;
import com.tencent.TIMUserStatusListener;
import com.tencent.imcore.IMCoreUser;
import com.tencent.qalsdk.QALUserStatusListener;

final class ʿ
  implements QALUserStatusListener
{
  ʿ(IMMsfCoreProxy paramIMMsfCoreProxy) {}
  
  public final void onForceOffline(String paramString)
  {
    QLog.i("imsdk.IMMsfCoreProxy", 1, "ForceOffline|1-Recv|Succ|recv forceoffline id: " + paramString);
    this.a.logout(paramString);
    QLog.i("imsdk.IMMsfCoreProxy", 1, "ForceOffline|2-Logout|Succ");
    paramString = TIMManager.getInstanceById(paramString).getUserStatusListener();
    if (paramString != null)
    {
      paramString.onForceOffline();
      QLog.e("imsdk.IMMsfCoreProxy", 1, "ForceOffline|3-Callback|Succ");
      return;
    }
    QLog.e("imsdk.IMMsfCoreProxy", 1, "ForceOffline|3-Callback|Fail|no listener found");
  }
  
  public final void onRegisterFail(String paramString1, int paramInt, String paramString2)
  {
    QLog.e("imsdk.IMMsfCoreProxy", 1, "reconnected...onRegisterFail error" + paramInt + "|" + paramString2 + "/" + paramString1);
  }
  
  public final void onRegisterSucc(String paramString)
  {
    QLog.e("imsdk.IMMsfCoreProxy", 1, "reconnected...register success id:" + paramString);
    if (IMMsfCoreProxy.access$100(this.a) != 1) {
      return;
    }
    paramString = TIMManager.getInstanceById(paramString).getCoreUser();
    paramString.loginSyncMsg();
    paramString.loginSyncCache();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ʿ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */