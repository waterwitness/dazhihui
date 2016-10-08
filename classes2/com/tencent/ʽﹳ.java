package com.tencent;

import com.tencent.statistics.BeaconEvents;
import com.tencent.statistics.BeaconUtil;
import java.util.HashMap;
import java.util.Map;

final class ʽﹳ
  extends TIMGroupManager.CreateGroupCallBack
{
  ʽﹳ(TIMGroupManager paramTIMGroupManager, TIMValueCallBack paramTIMValueCallBack)
  {
    super(paramTIMGroupManager, paramTIMValueCallBack);
  }
  
  public final void onDone(String paramString)
  {
    this.cb.onSuccess(paramString);
    BeaconUtil.onEvent(BeaconEvents.createGroup, true, -1L, -1L, null, false);
  }
  
  public final void onFail(int paramInt, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", "bindID failed|code: " + paramInt + " desc: " + paramString);
    this.cb.onError(paramInt, paramString);
    BeaconUtil.onEvent(BeaconEvents.createGroup, false, -1L, -1L, localHashMap, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʽﹳ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */