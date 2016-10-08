package com.tencent;

import com.tencent.statistics.BeaconEvents;
import com.tencent.statistics.BeaconUtil;
import java.util.HashMap;
import java.util.Map;

final class ʽﹶ
  extends TIMGroupManager.ˉ
{
  ʽﹶ(TIMGroupManager paramTIMGroupManager, TIMCallBack paramTIMCallBack)
  {
    super(paramTIMGroupManager, paramTIMCallBack);
  }
  
  public final void a()
  {
    this.a.onSuccess();
    BeaconUtil.onEvent(BeaconEvents.quitGroup, true, -1L, -1L, null, false);
  }
  
  public final void a(int paramInt, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", "bindID failed|code: " + paramInt + " desc: " + paramString);
    this.a.onError(paramInt, paramString);
    BeaconUtil.onEvent(BeaconEvents.quitGroup, false, -1L, -1L, localHashMap, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʽﹶ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */