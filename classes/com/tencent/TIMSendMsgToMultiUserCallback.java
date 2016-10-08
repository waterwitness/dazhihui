package com.tencent;

public abstract interface TIMSendMsgToMultiUserCallback
{
  public abstract void onError(int paramInt, String paramString, TIMBatchOprDetailInfo paramTIMBatchOprDetailInfo);
  
  public abstract void onSuccess();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMSendMsgToMultiUserCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */