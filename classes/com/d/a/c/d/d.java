package com.d.a.c.d;

public final class d
  implements c
{
  long a = 0L;
  
  private static int e(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 63)) {
      throw new IllegalArgumentException(String.format("input must be between 0 and 63: %s", new Object[] { Integer.valueOf(paramInt) }));
    }
    return paramInt;
  }
  
  public void a()
  {
    this.a = 0L;
  }
  
  public void a(int paramInt)
  {
    this.a |= 1L << e(paramInt);
  }
  
  public c b()
  {
    return new e(this, null);
  }
  
  public void b(int paramInt)
  {
    this.a ^= 1L << e(paramInt);
  }
  
  public boolean c(int paramInt)
  {
    return (this.a >> e(paramInt) & 1L) == 1L;
  }
  
  public void d(int paramInt)
  {
    this.a <<= e(paramInt);
  }
  
  public String toString()
  {
    return Long.toBinaryString(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */