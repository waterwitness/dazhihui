package com.d.a.c.d;

import com.d.a.a.e;
import com.d.a.ai;
import com.d.a.al;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteOrder;

class af
  implements e
{
  af(ac paramac) {}
  
  public void a(al paramal, ai paramai)
  {
    paramai.a(ByteOrder.BIG_ENDIAN);
    int i = (this.a.a & 0x7FFF0000) >>> 16;
    int j = this.a.a;
    if (i != 3) {
      try
      {
        throw new ProtocolException("version != 3: " + i);
      }
      catch (IOException paramal)
      {
        ac.e(this.a).a(paramal);
        return;
      }
    }
    switch (j & 0xFFFF)
    {
    case 5: 
    default: 
      paramai.m();
    }
    for (;;)
    {
      ac.f(this.a);
      return;
      ac.a(this.a, paramai, this.a.c, this.a.d);
      continue;
      ac.b(this.a, paramai, this.a.c, this.a.d);
      continue;
      ac.c(this.a, paramai, this.a.c, this.a.d);
      continue;
      ac.d(this.a, paramai, this.a.c, this.a.d);
      continue;
      ac.e(this.a, paramai, this.a.c, this.a.d);
      continue;
      ac.f(this.a, paramai, this.a.c, this.a.d);
      continue;
      ac.g(this.a, paramai, this.a.c, this.a.d);
      continue;
      ac.h(this.a, paramai, this.a.c, this.a.d);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */