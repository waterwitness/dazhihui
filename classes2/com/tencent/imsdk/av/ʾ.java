package com.tencent.imsdk.av;

import com.tencent.TIMCallBack;
import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.QLog;

final class ʾ
  implements TIMValueCallBack<byte[]>
{
  ʾ(SharpTinyId paramSharpTinyId, TIMCallBack paramTIMCallBack) {}
  
  public final void onError(int paramInt, String paramString)
  {
    QLog.e("MSF.C.SharpTinyId", 1, "sharp|req failed: " + paramInt + " desc: " + paramString);
    this.a.onError(paramInt, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\av\ʾ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */