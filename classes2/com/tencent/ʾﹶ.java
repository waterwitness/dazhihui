package com.tencent;

import java.util.List;

final class ʾﹶ
  extends TIMGroupManager.ʾ
{
  ʾﹶ(TIMGroupManager paramTIMGroupManager, TIMValueCallBack paramTIMValueCallBack)
  {
    super(paramTIMGroupManager, paramTIMValueCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    this.a.onError(paramInt, paramString);
  }
  
  public final void a(List<TIMGroupMemberInfo> paramList)
  {
    this.a.onSuccess(paramList);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʾﹶ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */