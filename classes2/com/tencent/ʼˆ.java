package com.tencent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ʼˆ
  extends TIMFriendshipManager.ˉ<List<String>>
{
  ʼˆ(TIMFriendshipManager paramTIMFriendshipManager, TIMValueCallBack paramTIMValueCallBack)
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
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((TIMFriendResult)paramList.next()).getIdentifer());
    }
    this.a.onSuccess(localArrayList);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʼˆ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */