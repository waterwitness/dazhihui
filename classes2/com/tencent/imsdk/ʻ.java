package com.tencent.imsdk;

import com.tencent.TIMCallBack;

final class ʻ
  implements Runnable
{
  ʻ(TIMCallBack paramTIMCallBack, int paramInt, String paramString) {}
  
  public final void run()
  {
    this.a.onError(this.b, this.c);
    QLog.e("imsdk.IMMsfCoreProxy", 1, "Login|5-Callback|Succ|Login failed! code:" + this.b + ", desc:" + this.c);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */