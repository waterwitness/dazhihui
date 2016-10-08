package com.c.b.b.a;

public enum o
{
  private static final o[] e = { b, a, d, c };
  private final int f;
  
  private o(int paramInt)
  {
    this.f = paramInt;
  }
  
  public static o a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= e.length)) {
      throw new IllegalArgumentException();
    }
    return e[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */