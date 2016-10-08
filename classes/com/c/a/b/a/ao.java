package com.c.a.b.a;

import com.c.a.al;
import com.c.a.d.a;
import com.c.a.d.d;
import java.sql.Timestamp;
import java.util.Date;

class ao
  extends al<Timestamp>
{
  ao(an paraman, al paramal) {}
  
  public Timestamp a(a parama)
  {
    parama = (Date)this.a.b(parama);
    if (parama != null) {
      return new Timestamp(parama.getTime());
    }
    return null;
  }
  
  public void a(d paramd, Timestamp paramTimestamp)
  {
    this.a.a(paramd, paramTimestamp);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */