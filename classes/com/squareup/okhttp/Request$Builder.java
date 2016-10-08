package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.RawHeaders;
import java.net.MalformedURLException;
import java.net.URL;

public class Request$Builder
{
  private Request.Body body;
  private RawHeaders headers = new RawHeaders();
  private String method = "GET";
  private Object tag;
  private URL url;
  
  public Request$Builder(String paramString)
  {
    url(paramString);
  }
  
  public Request$Builder(URL paramURL)
  {
    url(paramURL);
  }
  
  public Builder addHeader(String paramString1, String paramString2)
  {
    this.headers.add(paramString1, paramString2);
    return this;
  }
  
  public Request build()
  {
    return new Request(this, null);
  }
  
  public Builder get()
  {
    return method("GET", null);
  }
  
  public Builder head()
  {
    return method("HEAD", null);
  }
  
  public Builder header(String paramString1, String paramString2)
  {
    this.headers.set(paramString1, paramString2);
    return this;
  }
  
  public Builder method(String paramString, Request.Body paramBody)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new IllegalArgumentException("method == null || method.length() == 0");
    }
    this.method = paramString;
    this.body = paramBody;
    return this;
  }
  
  public Builder post(Request.Body paramBody)
  {
    return method("POST", paramBody);
  }
  
  public Builder put(Request.Body paramBody)
  {
    return method("PUT", paramBody);
  }
  
  Builder rawHeaders(RawHeaders paramRawHeaders)
  {
    this.headers = new RawHeaders(paramRawHeaders);
    return this;
  }
  
  public Builder tag(Object paramObject)
  {
    this.tag = paramObject;
    return this;
  }
  
  public Builder url(String paramString)
  {
    try
    {
      this.url = new URL(paramString);
      return this;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new IllegalArgumentException("Malformed URL: " + paramString);
    }
  }
  
  public Builder url(URL paramURL)
  {
    if (paramURL == null) {
      throw new IllegalStateException("url == null");
    }
    this.url = paramURL;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Request$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */