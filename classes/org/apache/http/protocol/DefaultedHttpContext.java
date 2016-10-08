package org.apache.http.protocol;

import org.apache.http.util.Args;

@Deprecated
public final class DefaultedHttpContext
  implements HttpContext
{
  private final HttpContext defaults;
  private final HttpContext local;
  
  public DefaultedHttpContext(HttpContext paramHttpContext1, HttpContext paramHttpContext2)
  {
    this.local = ((HttpContext)Args.notNull(paramHttpContext1, "HTTP context"));
    this.defaults = paramHttpContext2;
  }
  
  public Object getAttribute(String paramString)
  {
    Object localObject2 = this.local.getAttribute(paramString);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = this.defaults.getAttribute(paramString);
    }
    return localObject1;
  }
  
  public HttpContext getDefaults()
  {
    return this.defaults;
  }
  
  public Object removeAttribute(String paramString)
  {
    return this.local.removeAttribute(paramString);
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    this.local.setAttribute(paramString, paramObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[local: ").append(this.local);
    localStringBuilder.append("defaults: ").append(this.defaults);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\protocol\DefaultedHttpContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */