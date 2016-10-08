package com.d.a.c.d;

import com.d.a.a.e;
import com.d.a.ai;
import com.d.a.al;
import com.d.a.an;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

class u
  implements e
{
  u(t paramt) {}
  
  public void a(al paramal, ai paramai)
  {
    paramai.a(ByteOrder.BIG_ENDIAN);
    this.a.b = paramai.f();
    this.a.c = paramai.f();
    this.a.f = ((short)((this.a.b & 0x3FFF0000) >> 16));
    this.a.e = ((byte)((this.a.b & 0xFF00) >> 8));
    this.a.d = ((byte)(this.a.b & 0xFF));
    this.a.g = (this.a.c & 0x7FFFFFFF);
    if (r.a().isLoggable(Level.FINE)) {
      r.a().fine(s.a(true, this.a.g, this.a.f, this.a.e, this.a.d));
    }
    t.a(this.a).a(this.a.f, t.b(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */