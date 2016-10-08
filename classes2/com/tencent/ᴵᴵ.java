package com.tencent;

import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;

final class ᴵᴵ
  extends ᵢ
{
  ᴵᴵ(IMCoreWrapper paramIMCoreWrapper, TIMCallBack paramTIMCallBack, String paramString)
  {
    super(paramTIMCallBack);
  }
  
  public final void a()
  {
    QLog.e("imsdk.IMCoreWrapper", 1, "Login|4-InitIMCore|Succ|imcore init succ");
    IMCoreWrapper.get().setReady(true);
    if (this.a == null) {
      return;
    }
    TIMCallBack localTIMCallBack = this.a;
    if (!IMMsfCoreProxy.get().getMsfUserInfo(this.b).isLoggedIn()) {
      IMMsfCoreProxy.errorOnMainThread(this.a, 6208, "kick off by other device");
    }
    ʻ.a().a(new ʻʻ(this, localTIMCallBack));
  }
  
  public final void a(int paramInt, String paramString)
  {
    QLog.e("imsdk.IMCoreWrapper", 1, "Login|4-InitIMCore|Fail|imcore init failed! code: " + paramInt + " desc: " + paramString);
    IMMsfCoreProxy.errorOnMainThread(this.a, paramInt, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ᴵᴵ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */