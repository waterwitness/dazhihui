package com.h.a.c;

import android.content.Context;
import com.h.a.a.a.g;
import com.h.a.a.a.h;
import java.util.zip.Adler32;

public class b
{
  static String a = "d6fc3a4a06adbde89223bvefedc24fecde188aaa9161";
  static final Object b = new Object();
  private static a c = null;
  
  static long a(a parama)
  {
    if (parama != null)
    {
      parama = String.format("%s%s%s%s%s", new Object[] { parama.e(), parama.d(), Long.valueOf(parama.a()), parama.c(), parama.b() });
      if (!h.a(parama))
      {
        Adler32 localAdler32 = new Adler32();
        localAdler32.reset();
        localAdler32.update(parama.getBytes());
        return localAdler32.getValue();
      }
    }
    return 0L;
  }
  
  public static a a(Context paramContext)
  {
    for (;;)
    {
      try
      {
        if (c != null)
        {
          paramContext = c;
          return paramContext;
        }
        if (paramContext != null)
        {
          paramContext = b(paramContext);
          c = paramContext;
        }
        else
        {
          paramContext = null;
        }
      }
      finally {}
    }
  }
  
  private static a b(Context paramContext)
  {
    if (paramContext != null)
    {
      new a();
      label128:
      for (;;)
      {
        synchronized (b)
        {
          String str1 = d.a(paramContext).a();
          if (!h.a(str1))
          {
            if (!str1.endsWith("\n")) {
              break label128;
            }
            str1 = str1.substring(0, str1.length() - 1);
            a locala = new a();
            long l = System.currentTimeMillis();
            String str2 = g.a(paramContext);
            paramContext = g.b(paramContext);
            locala.c(str2);
            locala.a(str2);
            locala.b(l);
            locala.b(paramContext);
            locala.d(str1);
            locala.a(a(locala));
            return locala;
          }
        }
      }
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */