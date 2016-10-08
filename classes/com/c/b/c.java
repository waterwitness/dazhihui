package com.c.b;

import com.c.b.a.a;

public final class c
{
  private final b a;
  private a b;
  
  public c(b paramb)
  {
    if (paramb == null) {
      throw new IllegalArgumentException("Binarizer must be non-null.");
    }
    this.a = paramb;
  }
  
  public a a()
  {
    if (this.b == null) {
      this.b = this.a.b();
    }
    return this.b;
  }
  
  public String toString()
  {
    try
    {
      String str = a().toString();
      return str;
    }
    catch (i locali) {}
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */