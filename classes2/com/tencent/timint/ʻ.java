package com.tencent.timint;

import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.QLog;

final class ʻ
  implements TIMValueCallBack<byte[]>
{
  ʻ(TIMIntManager paramTIMIntManager, int paramInt) {}
  
  public final void onError(int paramInt, String paramString)
  {
    QLog.d("MSF.C.TIMIntManager", 1, "resend quality_report faild! code: " + paramInt + " desc: " + paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\timint\ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */