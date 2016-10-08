package com.c.a.b.a;

import com.c.a.al;
import com.c.a.d.a;
import com.c.a.d.c;
import com.c.a.d.d;
import com.c.a.x;
import java.net.URI;
import java.net.URISyntaxException;

final class aj
  extends al<URI>
{
  public URI a(a parama)
  {
    if (parama.f() == c.i) {
      parama.j();
    }
    for (;;)
    {
      return null;
      try
      {
        parama = parama.h();
        if ("null".equals(parama)) {
          continue;
        }
        parama = new URI(parama);
        return parama;
      }
      catch (URISyntaxException parama)
      {
        throw new x(parama);
      }
    }
  }
  
  public void a(d paramd, URI paramURI)
  {
    if (paramURI == null) {}
    for (paramURI = null;; paramURI = paramURI.toASCIIString())
    {
      paramd.b(paramURI);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */