package com.d.a.c;

import com.d.a.al;
import com.d.a.c.c.b;
import com.d.a.c.c.e;
import com.d.a.c.c.g;
import com.d.a.c.c.m;

public class az
{
  public static int a(av paramav)
  {
    paramav = paramav.a("Content-Length");
    if (paramav == null) {
      return -1;
    }
    try
    {
      int i = Integer.parseInt(paramav);
      return i;
    }
    catch (NumberFormatException paramav) {}
    return -1;
  }
  
  public static al a(al paramal, bn parambn, av paramav, boolean paramBoolean)
  {
    try
    {
      l = Long.parseLong(paramav.a("Content-Length"));
      if (-1L != l) {
        if (l < 0L)
        {
          parambn = ba.a(paramal.l(), new as("not using chunked encoding, and no content-length found."));
          parambn.a(paramal);
          paramal = parambn;
          return paramal;
        }
      }
    }
    catch (Exception localException)
    {
      Object localObject;
      do
      {
        long l;
        for (;;)
        {
          l = -1L;
        }
        if (l == 0L)
        {
          parambn = ba.a(paramal.l(), null);
          parambn.a(paramal);
          return parambn;
        }
        localObject = new e(l);
        ((e)localObject).a(paramal);
        while ("gzip".equals(paramav.a("Content-Encoding")))
        {
          paramal = new g();
          paramal.a((al)localObject);
          return paramal;
          if ("chunked".equalsIgnoreCase(paramav.a("Transfer-Encoding")))
          {
            localObject = new b();
            ((b)localObject).a(paramal);
          }
          else if (!paramBoolean)
          {
            localObject = paramal;
            if (parambn != bn.b) {
              break;
            }
          }
          else
          {
            localObject = paramal;
            if (!"close".equalsIgnoreCase(paramav.a("Connection")))
            {
              parambn = ba.a(paramal.l(), null);
              parambn.a(paramal);
              return parambn;
            }
          }
        }
        paramal = (al)localObject;
      } while (!"deflate".equals(paramav.a("Content-Encoding")));
      paramal = new m();
      paramal.a((al)localObject);
    }
    return paramal;
  }
  
  public static boolean a(bn parambn, av paramav)
  {
    paramav = paramav.a("Connection");
    if (paramav == null) {
      return parambn == bn.b;
    }
    return "keep-alive".equalsIgnoreCase(paramav);
  }
  
  public static boolean a(String paramString, av paramav)
  {
    paramav = paramav.a("Connection");
    if (paramav == null) {
      return bn.a(paramString) == bn.b;
    }
    return "keep-alive".equalsIgnoreCase(paramav);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */