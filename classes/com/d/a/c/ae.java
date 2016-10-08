package com.d.a.c;

import android.net.Uri;
import com.d.a.a.c;
import com.d.a.bo;

class ae
  implements c
{
  ae(ac paramac, c paramc, boolean paramBoolean, l paraml, Uri paramUri, int paramInt) {}
  
  public void a(Exception paramException, com.d.a.af paramaf)
  {
    if (paramException != null)
    {
      this.b.a(paramException, paramaf);
      return;
    }
    if (!this.c)
    {
      this.a.a(paramaf, this.d, this.e, this.f, this.b);
      return;
    }
    paramException = String.format("CONNECT %s:%s HTTP/1.1\r\nHost: %s\r\n\r\n", new Object[] { this.e.getHost(), Integer.valueOf(this.f), this.e.getHost() });
    this.d.j.b("Proxying: " + paramException);
    bo.a(paramaf, paramException.getBytes(), new af(this, this.b, paramaf, this.d, this.e, this.f));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */