package com.d.a.c.d;

import com.d.a.a.c;
import com.d.a.c.bn;
import com.d.a.c.l;
import com.d.a.c.u;
import com.d.a.g;
import com.d.a.o;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ak
  implements o
{
  ak(ai paramai, l paraml, String paramString, c paramc) {}
  
  public void a(Exception paramException, g paramg)
  {
    this.b.j.b("checking spdy handshake");
    if ((paramException != null) || (this.a.w == null))
    {
      ai.a(this.a, this.c, this.d, paramException, paramg);
      ai.a(this.a, this.c);
      return;
    }
    try
    {
      long l = ((Long)this.a.t.get(paramg.b())).longValue();
      paramException = (byte[])this.a.w.invoke(null, new Object[] { Long.valueOf(l) });
      if (paramException == null)
      {
        ai.a(this.a, this.c, this.d, null, paramg);
        ai.a(this.a, this.c);
        return;
      }
    }
    catch (Exception paramException)
    {
      throw new AssertionError(paramException);
    }
    paramException = new String(paramException);
    bn localbn = bn.a(paramException);
    if ((localbn == null) || (!localbn.a()))
    {
      ai.a(this.a, this.c, this.d, null, paramg);
      ai.a(this.a, this.c);
      return;
    }
    new al(this, paramg, bn.a(paramException), this.c, this.b, this.d);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */