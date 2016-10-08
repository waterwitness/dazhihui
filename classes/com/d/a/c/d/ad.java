package com.d.a.c.d;

import com.d.a.a.e;
import com.d.a.ai;
import com.d.a.al;
import com.d.a.an;
import java.nio.ByteOrder;

class ad
  implements e
{
  ad(ac paramac) {}
  
  public void a(al paramal, ai paramai)
  {
    boolean bool = true;
    paramai.a(ByteOrder.BIG_ENDIAN);
    this.a.a = paramai.f();
    this.a.b = paramai.f();
    int i;
    if ((this.a.a & 0x80000000) != 0)
    {
      i = 1;
      this.a.c = ((this.a.b & 0xFF000000) >>> 24);
      this.a.d = (this.a.b & 0xFFFFFF);
      if (i != 0) {
        break label184;
      }
      this.a.e = (this.a.a & 0x7FFFFFFF);
      paramai = this.a;
      if ((this.a.c & 0x1) == 0) {
        break label178;
      }
    }
    for (;;)
    {
      paramai.f = bool;
      paramal.a(ac.a(this.a));
      if (this.a.d == 0) {
        ac.a(this.a).a(paramal, ac.b(this.a));
      }
      return;
      i = 0;
      break;
      label178:
      bool = false;
    }
    label184:
    ac.c(this.a).a(this.a.d, ac.d(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */