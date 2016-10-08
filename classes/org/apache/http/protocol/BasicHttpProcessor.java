package org.apache.http.protocol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@Deprecated
@NotThreadSafe
public final class BasicHttpProcessor
  implements Cloneable, HttpProcessor, HttpRequestInterceptorList, HttpResponseInterceptorList
{
  protected final List<HttpRequestInterceptor> requestInterceptors = new ArrayList();
  protected final List<HttpResponseInterceptor> responseInterceptors = new ArrayList();
  
  public final void addInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    addRequestInterceptor(paramHttpRequestInterceptor);
  }
  
  public final void addInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor, int paramInt)
  {
    addRequestInterceptor(paramHttpRequestInterceptor, paramInt);
  }
  
  public final void addInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    addResponseInterceptor(paramHttpResponseInterceptor);
  }
  
  public final void addInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor, int paramInt)
  {
    addResponseInterceptor(paramHttpResponseInterceptor, paramInt);
  }
  
  public void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    if (paramHttpRequestInterceptor == null) {
      return;
    }
    this.requestInterceptors.add(paramHttpRequestInterceptor);
  }
  
  public void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor, int paramInt)
  {
    if (paramHttpRequestInterceptor == null) {
      return;
    }
    this.requestInterceptors.add(paramInt, paramHttpRequestInterceptor);
  }
  
  public void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    if (paramHttpResponseInterceptor == null) {
      return;
    }
    this.responseInterceptors.add(paramHttpResponseInterceptor);
  }
  
  public void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor, int paramInt)
  {
    if (paramHttpResponseInterceptor == null) {
      return;
    }
    this.responseInterceptors.add(paramInt, paramHttpResponseInterceptor);
  }
  
  public void clearInterceptors()
  {
    clearRequestInterceptors();
    clearResponseInterceptors();
  }
  
  public void clearRequestInterceptors()
  {
    this.requestInterceptors.clear();
  }
  
  public void clearResponseInterceptors()
  {
    this.responseInterceptors.clear();
  }
  
  public Object clone()
  {
    BasicHttpProcessor localBasicHttpProcessor = (BasicHttpProcessor)super.clone();
    copyInterceptors(localBasicHttpProcessor);
    return localBasicHttpProcessor;
  }
  
  public BasicHttpProcessor copy()
  {
    BasicHttpProcessor localBasicHttpProcessor = new BasicHttpProcessor();
    copyInterceptors(localBasicHttpProcessor);
    return localBasicHttpProcessor;
  }
  
  protected void copyInterceptors(BasicHttpProcessor paramBasicHttpProcessor)
  {
    paramBasicHttpProcessor.requestInterceptors.clear();
    paramBasicHttpProcessor.requestInterceptors.addAll(this.requestInterceptors);
    paramBasicHttpProcessor.responseInterceptors.clear();
    paramBasicHttpProcessor.responseInterceptors.addAll(this.responseInterceptors);
  }
  
  public HttpRequestInterceptor getRequestInterceptor(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.requestInterceptors.size())) {
      return null;
    }
    return (HttpRequestInterceptor)this.requestInterceptors.get(paramInt);
  }
  
  public int getRequestInterceptorCount()
  {
    return this.requestInterceptors.size();
  }
  
  public HttpResponseInterceptor getResponseInterceptor(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.responseInterceptors.size())) {
      return null;
    }
    return (HttpResponseInterceptor)this.responseInterceptors.get(paramInt);
  }
  
  public int getResponseInterceptorCount()
  {
    return this.responseInterceptors.size();
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Iterator localIterator = this.requestInterceptors.iterator();
    while (localIterator.hasNext()) {
      ((HttpRequestInterceptor)localIterator.next()).process(paramHttpRequest, paramHttpContext);
    }
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Iterator localIterator = this.responseInterceptors.iterator();
    while (localIterator.hasNext()) {
      ((HttpResponseInterceptor)localIterator.next()).process(paramHttpResponse, paramHttpContext);
    }
  }
  
  public void removeRequestInterceptorByClass(Class<? extends HttpRequestInterceptor> paramClass)
  {
    Iterator localIterator = this.requestInterceptors.iterator();
    while (localIterator.hasNext()) {
      if (localIterator.next().getClass().equals(paramClass)) {
        localIterator.remove();
      }
    }
  }
  
  public void removeResponseInterceptorByClass(Class<? extends HttpResponseInterceptor> paramClass)
  {
    Iterator localIterator = this.responseInterceptors.iterator();
    while (localIterator.hasNext()) {
      if (localIterator.next().getClass().equals(paramClass)) {
        localIterator.remove();
      }
    }
  }
  
  public void setInterceptors(List<?> paramList)
  {
    Args.notNull(paramList, "Inteceptor list");
    this.requestInterceptors.clear();
    this.responseInterceptors.clear();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = paramList.next();
      if ((localObject instanceof HttpRequestInterceptor)) {
        addInterceptor((HttpRequestInterceptor)localObject);
      }
      if ((localObject instanceof HttpResponseInterceptor)) {
        addInterceptor((HttpResponseInterceptor)localObject);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\protocol\BasicHttpProcessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */