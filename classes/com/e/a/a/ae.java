package com.e.a.a;

import java.io.Serializable;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

public class ae
  implements Serializable
{
  private final transient Cookie a;
  private transient BasicClientCookie b;
  
  public ae(Cookie paramCookie)
  {
    this.a = paramCookie;
  }
  
  public Cookie a()
  {
    Object localObject = this.a;
    if (this.b != null) {
      localObject = this.b;
    }
    return (Cookie)localObject;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */