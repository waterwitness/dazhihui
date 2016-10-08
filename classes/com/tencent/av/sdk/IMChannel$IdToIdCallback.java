package com.tencent.av.sdk;

import com.tencent.TIMUser;
import com.tencent.TIMValueCallBack;
import java.util.List;

public class IMChannel$IdToIdCallback
  implements TIMValueCallBack<List<TIMUser>>
{
  private int mNativeCallback;
  
  public IMChannel$IdToIdCallback(IMChannel paramIMChannel, int paramInt)
  {
    this.mNativeCallback = paramInt;
  }
  
  public void onError(int paramInt, String paramString)
  {
    IMChannel.IdToIdResult localIdToIdResult = new IMChannel.IdToIdResult(this.this$0);
    localIdToIdResult.result = paramInt;
    localIdToIdResult.errorInfo = paramString;
    this.this$0.nativeIdToIdCallback(this.mNativeCallback, localIdToIdResult);
    this.mNativeCallback = 0;
  }
  
  public void onSuccess(List<TIMUser> paramList)
  {
    IMChannel.IdToIdResult localIdToIdResult = new IMChannel.IdToIdResult(this.this$0);
    localIdToIdResult.result = 0;
    int j = paramList.size();
    localIdToIdResult.identifierList = new String[j];
    localIdToIdResult.tinyIdList = new long[j];
    int i = 0;
    while (i < j)
    {
      TIMUser localTIMUser = (TIMUser)paramList.get(i);
      localIdToIdResult.identifierList[i] = localTIMUser.getIdentifier();
      localIdToIdResult.tinyIdList[i] = localTIMUser.getTinyId();
      i += 1;
    }
    this.this$0.nativeIdToIdCallback(this.mNativeCallback, localIdToIdResult);
    this.mNativeCallback = 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\IMChannel$IdToIdCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */