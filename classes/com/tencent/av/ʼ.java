package com.tencent.av;

import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.QLog;

final class ʼ
  implements TIMValueCallBack<byte[]>
{
  ʼ(PingUtil paramPingUtil) {}
  
  public final void onError(int paramInt, String paramString)
  {
    QLog.e("av.PingUtil", 1, "reportError: code " + paramInt + " desc " + paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\ʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */