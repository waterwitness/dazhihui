package com.d.a.c;

import java.lang.reflect.Field;
import javax.net.ssl.SSLEngine;

class bs
  implements ab
{
  Field a;
  Field b;
  Field c;
  Field d;
  
  public bs(Class paramClass)
  {
    try
    {
      this.a = paramClass.getSuperclass().getDeclaredField("peerHost");
      this.a.setAccessible(true);
      this.b = paramClass.getSuperclass().getDeclaredField("peerPort");
      this.b.setAccessible(true);
      this.c = paramClass.getDeclaredField("sslParameters");
      this.c.setAccessible(true);
      this.d = this.c.getType().getDeclaredField("useSni");
      this.d.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException paramClass) {}
  }
  
  public void a(SSLEngine paramSSLEngine, l paraml, String paramString, int paramInt)
  {
    if (this.d == null) {
      return;
    }
    try
    {
      this.a.set(paramSSLEngine, paramString);
      this.b.set(paramSSLEngine, Integer.valueOf(paramInt));
      paramSSLEngine = this.c.get(paramSSLEngine);
      this.d.set(paramSSLEngine, Boolean.valueOf(true));
      return;
    }
    catch (IllegalAccessException paramSSLEngine) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */