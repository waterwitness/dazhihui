package com.tencent;

import com.tencent.imcore.EnvRequestClosure;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;

final class ʽ
  implements TIMValueCallBack<byte[]>
{
  ʽ(ʻ paramʻ, EnvRequestClosure paramEnvRequestClosure, String paramString) {}
  
  public final void onError(int paramInt, String paramString)
  {
    int i = paramInt;
    if (ʻ.c() == paramInt)
    {
      Object localObject2 = IMMsfCoreProxy.get().getMsfUserInfo(this.b);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        QLog.e(ʻ.b(), 1, "sSORequest no user found: " + this.b);
        localObject1 = new IMMsfUserInfo();
      }
      if (!((IMMsfUserInfo)localObject1).isSigExpire())
      {
        localObject2 = TIMManager.getInstanceById(this.b).getUserStatusListener();
        if (localObject2 != null) {
          ((TIMUserStatusListener)localObject2).onUserSigExpired();
        }
        ((IMMsfUserInfo)localObject1).setIsSigExpire(true);
      }
      i = 6206;
    }
    Object localObject1 = paramString;
    if (paramString == null) {
      localObject1 = "";
    }
    try
    {
      this.a.fail(i, (String)localObject1);
      return;
    }
    catch (Throwable paramString)
    {
      do
      {
        paramString = IMFunc.getExceptionInfo(paramString);
        QLog.e(ʻ.b(), 1, paramString);
        localObject1 = TIMManager.getInstance().getExceptionListener();
      } while (localObject1 == null);
      ((TIMExceptionListener)localObject1).onException(paramString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʽ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */