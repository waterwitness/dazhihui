package com.tencent.av;

import com.tencent.TIMCallBack;
import com.tencent.TIMValueCallBack;

final class ʽ
  implements TIMValueCallBack<byte[]>
{
  ʽ(TIMAvManager paramTIMAvManager, TIMCallBack paramTIMCallBack) {}
  
  public final void onError(int paramInt, String paramString)
  {
    if (this.a == null) {
      return;
    }
    this.a.onError(paramInt, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\ʽ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */