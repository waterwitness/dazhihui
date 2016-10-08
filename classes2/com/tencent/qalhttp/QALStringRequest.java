package com.tencent.qalhttp;

import com.tencent.qalsdk.util.QLog;

public class QALStringRequest
  extends QALHttpRequest
{
  private static final String TAG = QALStringRequest.class.getSimpleName();
  private String uri = null;
  
  public QALStringRequest(String paramString)
  {
    super(paramString);
    this.uri = paramString;
  }
  
  public void request(QALHttpValueCallBack paramQALHttpValueCallBack)
  {
    paramQALHttpValueCallBack = new f(this, paramQALHttpValueCallBack);
    QLog.d(TAG, "request");
    super.request(paramQALHttpValueCallBack);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalhttp\QALStringRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */