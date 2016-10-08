package com.d.a.c.c;

import com.d.a.ai;
import com.d.a.al;
import com.d.a.as;
import com.d.a.bo;

public class b
  extends as
{
  ai d = new ai();
  private int f = 0;
  private int g = 0;
  private c h = c.a;
  
  static
  {
    if (!b.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      e = bool;
      return;
    }
  }
  
  private boolean a(char paramChar)
  {
    return a(paramChar, '\n');
  }
  
  private boolean a(char paramChar1, char paramChar2)
  {
    if (paramChar1 != paramChar2)
    {
      a(new a(paramChar2 + " was expected, got " + paramChar1));
      return false;
    }
    return true;
  }
  
  private boolean b(char paramChar)
  {
    return a(paramChar, '\r');
  }
  
  public void a(al paramal, ai paramai)
  {
    for (;;)
    {
      char c;
      try
      {
        if (paramai.d() <= 0) {
          return;
        }
        switch (a()[this.h.ordinal()])
        {
        case 1: 
          c = paramai.g();
          if (c == '\r')
          {
            this.h = c.b;
            this.g = this.f;
            continue;
          }
          this.f *= 16;
        }
      }
      catch (Exception paramal)
      {
        a(paramal);
        return;
      }
      if ((c >= 'a') && (c <= 'f'))
      {
        this.f = (c - 'a' + 10 + this.f);
      }
      else if ((c >= '0') && (c <= '9'))
      {
        this.f = (c - '0' + this.f);
      }
      else if ((c >= 'A') && (c <= 'F'))
      {
        this.f = (c - 'A' + 10 + this.f);
      }
      else
      {
        a(new a("invalid chunk length: " + c));
        return;
        if (a(paramai.g()))
        {
          this.h = c.d;
          continue;
          int j = paramai.d();
          j = Math.min(this.g, j);
          this.g -= j;
          if (this.g == 0) {
            this.h = c.e;
          }
          if (j == 0) {
            continue;
          }
          paramai.a(this.d, j);
          bo.a(this, this.d);
          continue;
          if (b(paramai.g()))
          {
            this.h = c.f;
            continue;
            if (a(paramai.g()))
            {
              if (this.f > 0) {
                this.h = c.a;
              }
              for (;;)
              {
                this.f = 0;
                break;
                this.h = c.g;
                a(null);
              }
              if (!e) {
                throw new AssertionError();
              }
            }
          }
        }
        return;
      }
    }
  }
  
  protected void a(Exception paramException)
  {
    Object localObject = paramException;
    if (paramException == null)
    {
      localObject = paramException;
      if (this.h != c.g) {
        localObject = new a("chunked input ended before final chunk");
      }
    }
    super.a((Exception)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */