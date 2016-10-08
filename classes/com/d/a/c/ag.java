package com.d.a.c;

import android.net.Uri;
import android.text.TextUtils;
import com.d.a.a.c;
import com.d.a.ax;
import java.io.IOException;

class ag
  implements ax
{
  String a;
  
  ag(af paramaf, l paraml, com.d.a.af paramaf1, c paramc, Uri paramUri, int paramInt) {}
  
  public void a(String paramString)
  {
    this.c.j.b(paramString);
    if (this.a == null)
    {
      this.a = paramString.trim();
      if (!this.a.matches("HTTP/1.\\d 2\\d\\d .*"))
      {
        this.d.a(null);
        this.d.b(null);
        this.e.a(new IOException("non 2xx status line: " + this.a), this.d);
      }
    }
    while (!TextUtils.isEmpty(paramString.trim())) {
      return;
    }
    this.d.a(null);
    this.d.b(null);
    ae.a(af.a(this.b)).a(this.d, this.c, this.f, this.g, this.e);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */