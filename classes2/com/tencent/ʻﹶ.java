package com.tencent;

import com.tencent.statistics.BeaconEvents;
import com.tencent.statistics.BeaconUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ʻﹶ
  extends TIMFriendshipManager.ˉ<List<TIMFriendResult>>
{
  ʻﹶ(TIMFriendshipManager paramTIMFriendshipManager, TIMValueCallBack paramTIMValueCallBack)
  {
    super(paramTIMFriendshipManager, paramTIMValueCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", "bindID failed|code: " + paramInt + " desc: " + paramString);
    this.a.onError(paramInt, paramString);
    BeaconUtil.onEvent(BeaconEvents.delFriend, false, -1L, -1L, localHashMap, false);
  }
  
  public final void a(List<TIMFriendResult> paramList)
  {
    this.a.onSuccess(paramList);
    BeaconUtil.onEvent(BeaconEvents.delFriend, true, -1L, -1L, null, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʻﹶ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */