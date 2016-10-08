package com.android.thinkive.framework.network.http;

import com.android.thinkive.framework.network.RequestBean;

public class HttpRequestBean
  extends RequestBean
{
  private int reTryCount;
  private RequestMethod requestMethod;
  private int timeOut;
  private String urlAddress;
  
  public HttpRequestBean()
  {
    this.timeOut = 30000;
    this.reTryCount = 0;
    this.requestMethod = RequestMethod.POST;
  }
  
  public HttpRequestBean(RequestBean paramRequestBean)
  {
    setCacheTimeout(paramRequestBean.getCacheTimeout());
    setParam(paramRequestBean.getParam());
    setCacheType(paramRequestBean.getCacheType());
    setSequence(paramRequestBean.getSequence());
    setProtocolType(paramRequestBean.getProtocolType());
    setUrlName(paramRequestBean.getUrlName());
    setShouldCache(paramRequestBean.shouldCache());
    setShouldSign(paramRequestBean.isShouldSign());
  }
  
  public int getReTryCount()
  {
    return this.reTryCount;
  }
  
  public RequestMethod getRequestMethod()
  {
    return this.requestMethod;
  }
  
  public int getTimeOut()
  {
    return this.timeOut;
  }
  
  public String getUrlAddress()
  {
    return this.urlAddress;
  }
  
  public void setReTryCount(int paramInt)
  {
    this.reTryCount = paramInt;
  }
  
  public void setRequestMethod(RequestMethod paramRequestMethod)
  {
    this.requestMethod = paramRequestMethod;
  }
  
  public void setTimeOut(int paramInt)
  {
    this.timeOut = paramInt;
  }
  
  public void setUrlAddress(String paramString)
  {
    this.urlAddress = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\HttpRequestBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */