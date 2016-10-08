package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpResponseInterceptor;

@Deprecated
public abstract interface HttpResponseInterceptorList
{
  public abstract void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor);
  
  public abstract void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor, int paramInt);
  
  public abstract void clearResponseInterceptors();
  
  public abstract HttpResponseInterceptor getResponseInterceptor(int paramInt);
  
  public abstract int getResponseInterceptorCount();
  
  public abstract void removeResponseInterceptorByClass(Class<? extends HttpResponseInterceptor> paramClass);
  
  public abstract void setInterceptors(List<?> paramList);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\protocol\HttpResponseInterceptorList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */