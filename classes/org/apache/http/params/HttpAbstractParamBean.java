package org.apache.http.params;

import org.apache.http.util.Args;

@Deprecated
public abstract class HttpAbstractParamBean
{
  protected final HttpParams params;
  
  public HttpAbstractParamBean(HttpParams paramHttpParams)
  {
    this.params = ((HttpParams)Args.notNull(paramHttpParams, "HTTP parameters"));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\params\HttpAbstractParamBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */