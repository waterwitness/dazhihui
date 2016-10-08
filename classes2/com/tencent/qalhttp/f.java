package com.tencent.qalhttp;

import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.qalsdk.im_open.http.ResponsePrivate;
import com.tencent.qalsdk.util.QLog;
import java.io.UnsupportedEncodingException;

class f
  implements QALHttpValueCallBack
{
  f(QALStringRequest paramQALStringRequest, QALHttpValueCallBack paramQALHttpValueCallBack) {}
  
  public void onFailed(int paramInt, String paramString)
  {
    QLog.e(QALStringRequest.access$000(), QALStringRequest.access$100(this.b) + "failed:" + paramInt + ":" + paramString);
    this.a.onFailed(paramInt, paramString);
  }
  
  public void onFinished(QALHttpResponse paramQALHttpResponse)
  {
    String str2 = paramQALHttpResponse.responsePrivate.content_charset.get();
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = "utf-8";
    }
    try
    {
      str2 = new String(paramQALHttpResponse.getBody(), str1);
      QLog.d(QALStringRequest.access$000(), "charset:" + str1 + ":" + paramQALHttpResponse.getBody().length);
      paramQALHttpResponse.setStringResp(str2);
      this.a.onFinished(paramQALHttpResponse);
      return;
    }
    catch (UnsupportedEncodingException paramQALHttpResponse)
    {
      QLog.e(QALStringRequest.access$000(), QALStringRequest.access$100(this.b) + " unsupport encodeing:" + str1);
      this.a.onFailed(44515, "QAL_SDK_STRING_DECODE_ERR");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalhttp\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */