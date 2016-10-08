package com.d.a.c.c;

import com.d.a.a.e;
import com.d.a.ai;
import com.d.a.al;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;

class k
  implements e
{
  k(h paramh) {}
  
  public void a(al paramal, ai paramai)
  {
    if (this.a.b) {}
    for (;;)
    {
      if (paramai.o() <= 0)
      {
        paramai.m();
        h.b(this.a);
        return;
      }
      paramal = paramai.n();
      h.c(this.a).e.update(paramal.array(), paramal.arrayOffset() + paramal.position(), paramal.remaining());
      ai.c(paramal);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */