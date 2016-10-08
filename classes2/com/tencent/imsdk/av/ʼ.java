package com.tencent.imsdk.av;

import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.QLog;

final class ʼ
  implements TIMValueCallBack<byte[]>
{
  ʼ(MultiVideoTinyId paramMultiVideoTinyId, TIMValueCallBack paramTIMValueCallBack, String paramString) {}
  
  public final void onError(int paramInt, String paramString)
  {
    QLog.e("IMSdk.MultiVideoTinyId", 1, "multivideo|failed: " + paramInt + " desc: " + paramString);
    this.a.onError(paramInt, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\av\ʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */