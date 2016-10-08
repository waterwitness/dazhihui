package com.tencent.imsdk;

import com.tencent.TIMCallBack;
import com.tencent.qalsdk.QALCallBack;
import com.tencent.statistics.BeaconEvents;
import com.tencent.statistics.BeaconUtil;
import java.util.HashMap;
import java.util.Map;

final class ʼ
  implements QALCallBack
{
  ʼ(IMMsfCoreProxy paramIMMsfCoreProxy, TIMCallBack paramTIMCallBack) {}
  
  public final void onError(int paramInt, String paramString)
  {
    QLog.e("imsdk.IMMsfCoreProxy", 1, "unBindId failed. code: " + paramInt + "|desc: " + paramString);
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", "bindID failed|code: " + paramInt + " desc: " + paramString);
    BeaconUtil.onEvent(BeaconEvents.logoutEvent, false, -1L, -1L, localHashMap, false);
    QLog.e("imsdk.IMMsfCoreProxy", 1, "unbindid failed, callback " + this.a);
    if (this.a != null)
    {
      this.a.onError(paramInt, paramString);
      QLog.i("imsdk.IMMsfCoreProxy", 1, "Logout|2-Callback|Succ|logout failed! code: " + paramInt + ", desc: " + paramString);
    }
  }
  
  public final void onSuccess()
  {
    QLog.d("imsdk.IMMsfCoreProxy", 1, "unBindId succ");
    BeaconUtil.onEvent(BeaconEvents.logoutEvent, true, -1L, -1L, null, false);
    QLog.d("imsdk.IMMsfCoreProxy", 1, "unbindid succ, callback " + this.a);
    if (this.a != null)
    {
      this.a.onSuccess();
      QLog.i("imsdk.IMMsfCoreProxy", 1, "Logout|2-Callback|Succ|logout succ");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */