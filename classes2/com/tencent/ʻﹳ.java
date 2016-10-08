package com.tencent;

import java.util.List;

final class ʻﹳ
  extends TIMFriendshipManager.ˉ<TIMFriendResult>
{
  ʻﹳ(TIMFriendshipManager paramTIMFriendshipManager, TIMValueCallBack paramTIMValueCallBack)
  {
    super(paramTIMFriendshipManager, paramTIMValueCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    this.a.onError(paramInt, paramString);
  }
  
  public final void a(List<TIMFriendResult> paramList)
  {
    this.a.onSuccess(paramList.get(0));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʻﹳ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */