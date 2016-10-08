package com.d.a.c.d;

import android.net.Uri;
import com.d.a.a.c;
import com.d.a.b.g;
import com.d.a.b.j;
import com.d.a.c.l;
import com.d.a.c.u;

class an
  implements g<a>
{
  an(ai paramai, l paraml, j paramj) {}
  
  public void a(Exception paramException, a parama)
  {
    if ((paramException instanceof aq))
    {
      this.b.j.b("spdy not available");
      this.c.b(ai.a(this.a, this.b));
    }
    do
    {
      do
      {
        return;
        if (paramException == null) {
          break;
        }
      } while (!this.c.e());
      this.b.a.a(paramException, null);
      return;
      this.b.j.b("using existing spdy connection for host: " + this.b.j.d().getHost());
    } while (!this.c.e());
    ai.a(this.a, this.b, parama, this.b.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */