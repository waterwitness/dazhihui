package com.c.a.b;

import com.c.a.ae;
import com.c.a.al;
import com.c.a.d.a;
import com.c.a.d.d;
import com.c.a.d.e;
import com.c.a.w;
import com.c.a.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class ag
{
  public static w a(a parama)
  {
    int i = 1;
    try
    {
      parama.f();
      i = 0;
      parama = (w)com.c.a.b.a.y.P.b(parama);
      return parama;
    }
    catch (EOFException parama)
    {
      if (i != 0) {
        return com.c.a.y.a;
      }
      throw new ae(parama);
    }
    catch (e parama)
    {
      throw new ae(parama);
    }
    catch (IOException parama)
    {
      throw new x(parama);
    }
    catch (NumberFormatException parama)
    {
      throw new ae(parama);
    }
  }
  
  public static Writer a(Appendable paramAppendable)
  {
    if ((paramAppendable instanceof Writer)) {
      return (Writer)paramAppendable;
    }
    return new ai(paramAppendable, null);
  }
  
  public static void a(w paramw, d paramd)
  {
    com.c.a.b.a.y.P.a(paramd, paramw);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */