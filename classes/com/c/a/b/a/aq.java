package com.c.a.b.a;

import com.c.a.al;
import com.c.a.d.a;
import com.c.a.d.c;
import com.c.a.d.d;
import java.util.Locale;
import java.util.StringTokenizer;

final class aq
  extends al<Locale>
{
  public Locale a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    Object localObject = new StringTokenizer(parama.h(), "_");
    if (((StringTokenizer)localObject).hasMoreElements()) {}
    for (parama = ((StringTokenizer)localObject).nextToken();; parama = null)
    {
      if (((StringTokenizer)localObject).hasMoreElements()) {}
      for (String str = ((StringTokenizer)localObject).nextToken();; str = null)
      {
        if (((StringTokenizer)localObject).hasMoreElements()) {}
        for (localObject = ((StringTokenizer)localObject).nextToken();; localObject = null)
        {
          if ((str == null) && (localObject == null)) {
            return new Locale(parama);
          }
          if (localObject == null) {
            return new Locale(parama, str);
          }
          return new Locale(parama, str, (String)localObject);
        }
      }
    }
  }
  
  public void a(d paramd, Locale paramLocale)
  {
    if (paramLocale == null) {}
    for (paramLocale = null;; paramLocale = paramLocale.toString())
    {
      paramd.b(paramLocale);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */