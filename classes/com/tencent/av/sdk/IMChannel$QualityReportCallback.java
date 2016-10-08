package com.tencent.av.sdk;

import com.tencent.TIMCallBack;
import com.tencent.av.utils.QLog;

public class IMChannel$QualityReportCallback
  implements TIMCallBack
{
  private int mNativeCallback;
  
  public IMChannel$QualityReportCallback(IMChannel paramIMChannel, int paramInt)
  {
    this.mNativeCallback = paramInt;
  }
  
  public void onError(int paramInt, String paramString)
  {
    QLog.e("IMChannel", 0, "QualityReport failed: " + paramInt + " info: " + paramString);
    IMChannel.QualityReportResult localQualityReportResult = new IMChannel.QualityReportResult(this.this$0);
    localQualityReportResult.result = paramInt;
    localQualityReportResult.errorInfo = paramString;
    this.this$0.nativeQualityReportCallback(this.mNativeCallback, localQualityReportResult);
    this.mNativeCallback = 0;
  }
  
  public void onSuccess()
  {
    QLog.d("IMChannel", 0, "requestQualityReport succ");
    IMChannel.QualityReportResult localQualityReportResult = new IMChannel.QualityReportResult(this.this$0);
    localQualityReportResult.result = 0;
    this.this$0.nativeQualityReportCallback(this.mNativeCallback, localQualityReportResult);
    this.mNativeCallback = 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\IMChannel$QualityReportCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */