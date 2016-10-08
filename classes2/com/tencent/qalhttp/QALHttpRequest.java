package com.tencent.qalhttp;

import com.tencent.qalsdk.QALSDKManager;
import java.util.List;
import java.util.Map;

public class QALHttpRequest
{
  protected static final String PROTOCOL_CHARSET = "utf-8";
  static a cacheHelper = new a();
  private static final String tag = "QALHttpRequest";
  private QALHttpHelper helper;
  
  public QALHttpRequest(String paramString)
  {
    this.helper = new QALHttpHelper(paramString);
  }
  
  public static void init()
  {
    a.a(QALSDKManager.getInstance().getContext());
  }
  
  public static void setCacheMaxSize(long paramLong)
  {
    a.a(paramLong);
  }
  
  public void request(QALHttpValueCallBack paramQALHttpValueCallBack)
  {
    this.helper.request(paramQALHttpValueCallBack);
  }
  
  public void setAccept(String paramString)
  {
    this.helper.setAccept(paramString);
  }
  
  public void setAcceptCharset(String paramString)
  {
    this.helper.setAcceptCharset(paramString);
  }
  
  public void setAcceptLanguage(String paramString)
  {
    this.helper.setAcceptLanguage(paramString);
  }
  
  public void setBody(byte[] paramArrayOfByte)
  {
    this.helper.setBody(paramArrayOfByte);
  }
  
  public void setCacheControl(List<String> paramList)
  {
    this.helper.setCacheControl(paramList);
  }
  
  public void setContentType(String paramString)
  {
    this.helper.setContentType(paramString);
  }
  
  public void setCookie(String paramString)
  {
    this.helper.setCookie(paramString);
  }
  
  public void setFormData(String paramString, Map<String, String> paramMap)
  {
    this.helper.setFormData(paramString, paramMap);
  }
  
  public void setIfMatch(String paramString)
  {
    this.helper.setIfMatch(paramString);
  }
  
  public void setIfModifiedSince(String paramString)
  {
    this.helper.setIfModifiedSince(paramString);
  }
  
  public void setIfNoneMatch(String paramString)
  {
    this.helper.setIfNoneMatch(paramString);
  }
  
  public void setIfUnmodifiedSince(String paramString)
  {
    this.helper.setIfUnmodifiedSince(paramString);
  }
  
  public void setOrigin(String paramString)
  {
    this.helper.setOrigin(paramString);
  }
  
  public void setPragma(String paramString)
  {
    this.helper.setPragma(paramString);
  }
  
  public void setReferer(String paramString)
  {
    this.helper.setReferer(paramString);
  }
  
  public void setRequestMethod(int paramInt)
  {
    this.helper.setRequestMethod(paramInt);
  }
  
  public void setRequestOtherHeader(String paramString1, String paramString2)
  {
    this.helper.setRequestOtherHeader(paramString1, paramString2);
  }
  
  public void setUserAgent(String paramString)
  {
    this.helper.setUserAgent(paramString);
  }
  
  public void setXRequestedWith(String paramString)
  {
    this.helper.setXRequestedWith(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalhttp\QALHttpRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */