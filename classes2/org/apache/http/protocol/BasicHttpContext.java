package org.apache.http.protocol;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.util.Args;

@ThreadSafe
public class BasicHttpContext
  implements HttpContext
{
  private final Map<String, Object> map = new ConcurrentHashMap();
  private final HttpContext parentContext;
  
  public BasicHttpContext()
  {
    this(null);
  }
  
  public BasicHttpContext(HttpContext paramHttpContext)
  {
    this.parentContext = paramHttpContext;
  }
  
  public void clear()
  {
    this.map.clear();
  }
  
  public Object getAttribute(String paramString)
  {
    Args.notNull(paramString, "Id");
    Object localObject2 = this.map.get(paramString);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = localObject2;
      if (this.parentContext != null) {
        localObject1 = this.parentContext.getAttribute(paramString);
      }
    }
    return localObject1;
  }
  
  public Object removeAttribute(String paramString)
  {
    Args.notNull(paramString, "Id");
    return this.map.remove(paramString);
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    Args.notNull(paramString, "Id");
    if (paramObject != null)
    {
      this.map.put(paramString, paramObject);
      return;
    }
    this.map.remove(paramString);
  }
  
  public String toString()
  {
    return this.map.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\protocol\BasicHttpContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */