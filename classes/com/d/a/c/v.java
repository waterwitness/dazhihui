package com.d.a.c;

import android.net.Uri;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

class v
  implements RequestLine
{
  v(u paramu) {}
  
  public String getMethod()
  {
    return u.a(this.a);
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    return new ProtocolVersion("HTTP", 1, 1);
  }
  
  public String getUri()
  {
    return this.a.d().toString();
  }
  
  public String toString()
  {
    if (this.a.c != null) {
      return String.format("%s %s HTTP/1.1", new Object[] { u.a(this.a), this.a.d() });
    }
    Object localObject2 = this.a.d().getEncodedPath();
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      localObject1 = "/";
    }
    String str = this.a.d().getEncodedQuery();
    localObject2 = localObject1;
    if (str != null)
    {
      localObject2 = localObject1;
      if (str.length() != 0) {
        localObject2 = localObject1 + "?" + str;
      }
    }
    return String.format("%s %s HTTP/1.1", new Object[] { u.a(this.a), localObject2 });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */