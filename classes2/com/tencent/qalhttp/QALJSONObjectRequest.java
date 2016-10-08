package com.tencent.qalhttp;

import org.json.JSONObject;

public class QALJSONObjectRequest
  extends QALHttpRequest
{
  private static final String TAG = QALJSONObjectRequest.class.getSimpleName();
  private JSONObject jsonRequest = null;
  private String uri;
  
  public QALJSONObjectRequest(String paramString, JSONObject paramJSONObject)
  {
    super(paramString);
    this.uri = paramString;
    this.jsonRequest = paramJSONObject;
  }
  
  public void request(QALHttpValueCallBack paramQALHttpValueCallBack)
  {
    e locale = new e(this, paramQALHttpValueCallBack);
    if (this.jsonRequest == null) {}
    for (paramQALHttpValueCallBack = null;; paramQALHttpValueCallBack = this.jsonRequest.toString().getBytes())
    {
      setBody(paramQALHttpValueCallBack);
      setContentType("application/json; charset=utf-8");
      super.request(locale);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalhttp\QALJSONObjectRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */