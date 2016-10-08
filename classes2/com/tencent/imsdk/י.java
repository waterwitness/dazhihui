package com.tencent.imsdk;

import com.tencent.IMCoreWrapper;
import com.tencent.TIMCallBack;
import com.tencent.TIMNetworkStatus;
import com.tencent.TIMUser;
import com.tencent.qalsdk.QALCallBack;
import com.tencent.statistics.BeaconEvents;
import com.tencent.statistics.BeaconUtil;
import java.util.HashMap;
import java.util.Map;

final class י
  implements QALCallBack
{
  י(IMMsfCoreProxy paramIMMsfCoreProxy, TIMUser paramTIMUser, TIMCallBack paramTIMCallBack, IMMsfUserInfo paramIMMsfUserInfo) {}
  
  public final void onError(int paramInt, String paramString)
  {
    if (paramInt == 1002) {
      this.d.logout(this.a.getIdentifier());
    }
    QLog.e("imsdk.IMMsfCoreProxy", 1, "Login|3-Online|Fail|bindID failed, code: " + paramInt + ", desc: " + paramString);
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", "bindID failed|code: " + paramInt + " desc: " + paramString);
    BeaconUtil.onEvent(BeaconEvents.loginEvent, false, -1L, -1L, localHashMap, false);
    if (paramInt == 1002)
    {
      IMMsfCoreProxy.errorOnMainThread(this.b, 6208, "kick off by other device");
      return;
    }
    IMMsfCoreProxy.errorOnMainThread(this.b, paramInt, paramString);
  }
  
  public final void onSuccess()
  {
    this.c.setIsLoggedIn(true);
    IMMsfCoreProxy.access$002(this.d, TIMNetworkStatus.TIM_NETWORK_STATUS_CONNECTED);
    QLog.e("imsdk.IMMsfCoreProxy", 1, "Login|3-Online|Succ|bindID succ");
    if (IMMsfCoreProxy.access$100(this.d) == 1) {
      IMCoreWrapper.get().init(IMMsfCoreProxy.access$300(this.d), this.a.getIdentifier(), this.b);
    }
    for (;;)
    {
      QLog.i("imsdk.IMMsfCoreProxy", 1, this.a + " login succ. tinyid: " + this.c.getTinyid() + " env: " + IMMsfCoreProxy.get().getEnv() + " mode: " + IMMsfCoreProxy.get().getMode());
      BeaconUtil.onEvent(BeaconEvents.loginEvent, true, -1L, -1L, null, false);
      return;
      this.b.onSuccess();
      QLog.e("imsdk.IMMsfCoreProxy", 1, "Login|5-Callback|Succ|login succ");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\י.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */