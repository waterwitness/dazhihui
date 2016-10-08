package com.d.a.c;

import java.util.Hashtable;
import javax.net.ssl.SSLEngine;

public class br
  implements ab
{
  Hashtable<String, bs> a = new Hashtable();
  
  public void a(SSLEngine paramSSLEngine, l paraml, String paramString, int paramInt)
  {
    String str = paramSSLEngine.getClass().getCanonicalName();
    bs localbs2 = (bs)this.a.get(str);
    bs localbs1 = localbs2;
    if (localbs2 == null)
    {
      localbs1 = new bs(paramSSLEngine.getClass());
      this.a.put(str, localbs1);
    }
    localbs1.a(paramSSLEngine, paraml, paramString, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */