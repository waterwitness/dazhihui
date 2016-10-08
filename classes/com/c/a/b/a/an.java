package com.c.a.b.a;

import com.c.a.al;
import com.c.a.am;
import com.c.a.c.a;
import com.c.a.k;
import java.sql.Timestamp;
import java.util.Date;

final class an
  implements am
{
  public <T> al<T> a(k paramk, a<T> parama)
  {
    if (parama.getRawType() != Timestamp.class) {
      return null;
    }
    return new ao(this, paramk.a(Date.class));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */