package com.tencent.timint;

import com.tencent.TIMCallBack;
import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.QLog;
import com.tencent.openqq.protocol.imsdk.quality_report.ReqBody;

final class ʼ
  implements TIMValueCallBack<byte[]>
{
  ʼ(TIMIntManager paramTIMIntManager, quality_report.ReqBody paramReqBody, TIMCallBack paramTIMCallBack) {}
  
  public final void onError(int paramInt, String paramString)
  {
    QLog.d("MSF.C.TIMIntManager", 1, "request faild! code: " + paramInt + " desc: " + paramString);
    this.c.storeQualityReportToLocal(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\timint\ʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */