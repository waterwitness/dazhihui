package com.d.a.b;

import java.util.LinkedList;

public class b
  extends j
  implements com.d.a.a.d, a, Runnable
{
  com.d.a.a.a a;
  Runnable b;
  LinkedList<com.d.a.a.d> c = new LinkedList();
  boolean d;
  private boolean j;
  private boolean k;
  
  static
  {
    if (!b.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      e = bool;
      return;
    }
  }
  
  public b()
  {
    this(null);
  }
  
  public b(com.d.a.a.a parama)
  {
    this(parama, null);
  }
  
  public b(com.d.a.a.a parama, Runnable paramRunnable)
  {
    this.b = paramRunnable;
    this.a = parama;
  }
  
  private com.d.a.a.d b(com.d.a.a.d paramd)
  {
    if ((paramd instanceof d)) {
      ((d)paramd).a(this);
    }
    return paramd;
  }
  
  private com.d.a.a.a f()
  {
    return new c(this);
  }
  
  private void g()
  {
    if (this.j) {}
    do
    {
      return;
      do
      {
        com.d.a.a.d locald = (com.d.a.a.d)this.c.remove();
        try
        {
          this.j = true;
          this.k = true;
          locald.a(this, f());
        }
        catch (Exception localException)
        {
          for (;;)
          {
            a(localException);
            this.j = false;
          }
        }
        finally
        {
          this.j = false;
        }
      } while ((this.c.size() > 0) && (!this.k) && (!isDone()) && (!isCancelled()));
    } while ((this.k) || (isDone()) || (isCancelled()));
    a(null);
  }
  
  public b a(com.d.a.a.d paramd)
  {
    this.c.add(b(paramd));
    return this;
  }
  
  public void a(com.d.a.a.a parama)
  {
    this.a = parama;
  }
  
  public void a(b paramb, com.d.a.a.a parama)
  {
    a(parama);
    b();
  }
  
  void a(Exception paramException)
  {
    if (!e()) {}
    while (this.a == null) {
      return;
    }
    this.a.a(paramException);
  }
  
  public b b()
  {
    if (this.d) {
      throw new IllegalStateException("already started");
    }
    this.d = true;
    g();
    return this;
  }
  
  public boolean cancel()
  {
    if (!super.cancel()) {
      return false;
    }
    if (this.b != null) {
      this.b.run();
    }
    return true;
  }
  
  public void run()
  {
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */