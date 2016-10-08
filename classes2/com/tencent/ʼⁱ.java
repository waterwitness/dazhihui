package com.tencent;

import java.util.ArrayList;
import java.util.List;

final class ʼⁱ
  extends TIMFriendshipManager.ˉ<List<TIMFriendCheckResult>>
{
  ʼⁱ(TIMFriendshipManager paramTIMFriendshipManager, TIMValueCallBack paramTIMValueCallBack)
  {
    super(paramTIMFriendshipManager, paramTIMValueCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    this.a.onError(paramInt, paramString);
  }
  
  public final void a(List<TIMFriendResult> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramList.size())
    {
      localArrayList.add(new TIMFriendCheckResult((TIMFriendResult)paramList.get(i)));
      i += 1;
    }
    this.a.onSuccess(localArrayList);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʼⁱ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */