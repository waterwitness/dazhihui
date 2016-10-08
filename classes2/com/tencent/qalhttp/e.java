package com.tencent.qalhttp;

import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.qalsdk.im_open.http.ResponsePrivate;
import com.tencent.qalsdk.util.QLog;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class e
  implements QALHttpValueCallBack
{
  e(QALJSONObjectRequest paramQALJSONObjectRequest, QALHttpValueCallBack paramQALHttpValueCallBack) {}
  
  public void onFailed(int paramInt, String paramString)
  {
    QLog.e(QALJSONObjectRequest.access$000(), QALJSONObjectRequest.access$100(this.b) + " failed:" + paramInt + ":" + paramString);
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
    QLog.d(QALJSONObjectRequest.access$000(), "strCharSet:" + str1);
    try
    {
      paramQALHttpResponse.setJSONObjectResp(new JSONObject(new String(paramQALHttpResponse.getBody(), str1)));
      this.a.onFinished(paramQALHttpResponse);
      return;
    }
    catch (UnsupportedEncodingException paramQALHttpResponse)
    {
      QLog.e(QALJSONObjectRequest.access$000(), QALJSONObjectRequest.access$100(this.b) + " unsupport encodeing:" + str1);
      this.a.onFailed(44515, "QAL_SDK_STRING_DECODE_ERR");
      return;
    }
    catch (JSONException paramQALHttpResponse)
    {
      QLog.e(QALJSONObjectRequest.access$000(), QALJSONObjectRequest.access$100(this.b) + " jason parse error:" + paramQALHttpResponse.getMessage());
      this.a.onFailed(44516, "jason parse error:" + paramQALHttpResponse.getMessage());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalhttp\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */