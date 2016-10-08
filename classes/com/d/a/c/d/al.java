package com.d.a.c.d;

import android.net.Uri;
import com.d.a.a.c;
import com.d.a.af;
import com.d.a.b.j;
import com.d.a.c.bn;
import com.d.a.c.l;
import com.d.a.c.u;
import java.io.IOException;
import java.util.Hashtable;

class al
  extends a
{
  boolean n;
  
  al(ak paramak, af paramaf, bn parambn, String paramString, l paraml, c paramc)
  {
    super(paramaf, parambn);
  }
  
  public void a(boolean paramBoolean, aa paramaa)
  {
    super.a(paramBoolean, paramaa);
    if (!this.n) {}
    try
    {
      a();
      this.n = true;
      paramaa = (ar)ak.a(this.o).x.get(this.p);
      if (paramaa.c.e())
      {
        this.q.j.b("using new spdy connection for host: " + this.q.j.d().getHost());
        ai.a(ak.a(this.o), this.q, this, this.r);
      }
      paramaa.b(this);
      return;
    }
    catch (IOException paramaa)
    {
      for (;;)
      {
        paramaa.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */