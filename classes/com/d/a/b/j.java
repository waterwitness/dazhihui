package com.d.a.b;

public class j
  implements d
{
  public static final a h;
  private a a;
  boolean f;
  boolean g;
  
  static
  {
    if (!j.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      i = bool;
      h = new k();
      return;
    }
  }
  
  protected void a() {}
  
  public j b(a parama)
  {
    try
    {
      if (!isDone()) {
        this.a = parama;
      }
      return this;
    }
    finally {}
  }
  
  protected void c() {}
  
  public boolean cancel()
  {
    try
    {
      if (this.f) {
        return false;
      }
      if (this.g) {
        return true;
      }
    }
    finally {}
    this.g = true;
    a locala = this.a;
    this.a = null;
    if (locala != null) {
      locala.cancel();
    }
    a();
    c();
    return true;
  }
  
  protected void d() {}
  
  public boolean e()
  {
    try
    {
      if (this.g) {
        return false;
      }
      if (!this.f) {
        break label43;
      }
      if (!i) {
        throw new AssertionError();
      }
    }
    finally {}
    return true;
    label43:
    this.f = true;
    this.a = null;
    d();
    c();
    return true;
  }
  
  public boolean isCancelled()
  {
    for (;;)
    {
      try
      {
        if (this.g) {
          break label45;
        }
        if (this.a == null) {
          break label40;
        }
        if (this.a.isCancelled()) {
          break label45;
        }
      }
      finally {}
      return bool;
      label40:
      boolean bool = false;
      continue;
      label45:
      bool = true;
    }
  }
  
  public boolean isDone()
  {
    return this.f;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */