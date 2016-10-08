package com.tencent;

import android.os.Handler;
import com.tencent.imcore.ISendMsg;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.statistics.BeaconEvents;
import com.tencent.statistics.BeaconUtil;
import java.util.HashMap;
import java.util.Map;

abstract class TIMConversation$ʽ
  extends ISendMsg
{
  public TIMValueCallBack<TIMMessage> a = null;
  TIMMessage b = null;
  
  TIMConversation$ʽ(TIMMessage paramTIMMessage, TIMValueCallBack<TIMMessage> paramTIMValueCallBack)
  {
    this.b = paramTIMValueCallBack;
    int[] arrayOfInt;
    this.a = arrayOfInt;
    swigReleaseOwnership();
    long l = paramTIMValueCallBack.getElementCount();
    int i = 0;
    while (i < l)
    {
      paramTIMMessage = paramTIMValueCallBack.getElement(i).getType();
      arrayOfInt = ˉˉ.a;
      paramTIMMessage.ordinal();
      i += 1;
    }
  }
  
  public final void done()
  {
    IMMsfCoreProxy.mainHandler.post(new ﹶﹶ(this));
    swigTakeOwnership();
    long l = this.b.getElementCount();
    int i = 0;
    if (i < l)
    {
      TIMElemType localTIMElemType = this.b.getElement(i).getType();
      switch (ˉˉ.a[localTIMElemType.ordinal()])
      {
      }
      for (;;)
      {
        i += 1;
        break;
        BeaconUtil.onEvent(BeaconEvents.sendTextMsg, true, -1L, -1L, null, false);
        continue;
        BeaconUtil.onEvent(BeaconEvents.sendImgMsg, true, -1L, -1L, null, false);
        continue;
        BeaconUtil.onEvent(BeaconEvents.sendAudioMsg, true, -1L, -1L, null, false);
      }
    }
  }
  
  public final void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʻʼ(this, paramInt, paramString));
    swigTakeOwnership();
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", "bindID failed|code: " + paramInt + " desc: " + paramString);
    long l = this.b.getElementCount();
    paramInt = 0;
    if (paramInt < l)
    {
      paramString = this.b.getElement(paramInt).getType();
      switch (ˉˉ.a[paramString.ordinal()])
      {
      }
      for (;;)
      {
        paramInt += 1;
        break;
        BeaconUtil.onEvent(BeaconEvents.sendTextMsg, false, -1L, -1L, localHashMap, false);
        continue;
        BeaconUtil.onEvent(BeaconEvents.sendImgMsg, false, -1L, -1L, localHashMap, false);
        continue;
        BeaconUtil.onEvent(BeaconEvents.sendAudioMsg, false, -1L, -1L, localHashMap, false);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMConversation$ʽ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */