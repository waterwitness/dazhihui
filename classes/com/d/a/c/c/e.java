package com.d.a.c.c;

import com.d.a.ai;
import com.d.a.al;
import com.d.a.as;

public class e
  extends as
{
  long d;
  long e;
  ai f = new ai();
  
  static
  {
    if (!e.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      g = bool;
      return;
    }
  }
  
  public e(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void a(al paramal, ai paramai)
  {
    if ((!g) && (this.e >= this.d)) {
      throw new AssertionError();
    }
    int i = paramai.d();
    long l = Math.min(this.d - this.e, i);
    paramai.a(this.f, (int)l);
    i = this.f.d();
    super.a(paramal, this.f);
    l = this.e;
    this.e = (i - this.f.d() + l);
    this.f.a(paramai);
    if (this.e == this.d) {
      a(null);
    }
  }
  
  protected void a(Exception paramException)
  {
    Object localObject = paramException;
    if (paramException == null)
    {
      localObject = paramException;
      if (this.e != this.d) {
        localObject = new n("End of data reached before content length was read: " + this.e + "/" + this.d + " Paused: " + k());
      }
    }
    super.a((Exception)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */