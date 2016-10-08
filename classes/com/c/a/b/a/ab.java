package com.c.a.b.a;

import com.c.a.ae;
import com.c.a.al;
import com.c.a.b.v;
import com.c.a.d.a;
import com.c.a.d.c;
import com.c.a.d.d;

final class ab
  extends al<Number>
{
  public Number a(a parama)
  {
    c localc = parama.f();
    switch (ay.a[localc.ordinal()])
    {
    case 2: 
    case 3: 
    default: 
      throw new ae("Expecting number, got: " + localc);
    case 4: 
      parama.j();
      return null;
    }
    return new v(parama.h());
  }
  
  public void a(d paramd, Number paramNumber)
  {
    paramd.a(paramNumber);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */