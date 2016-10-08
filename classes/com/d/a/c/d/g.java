package com.d.a.c.d;

 enum g
{
  public final int r;
  public final int s;
  public final int t;
  
  private g(int paramInt2, int paramInt3, int paramInt4)
  {
    this.r = paramInt2;
    this.s = paramInt3;
    this.t = paramInt4;
  }
  
  public static g a(int paramInt)
  {
    g[] arrayOfg = values();
    int i2 = arrayOfg.length;
    int i1 = 0;
    for (;;)
    {
      Object localObject;
      if (i1 >= i2) {
        localObject = null;
      }
      g localg;
      do
      {
        return (g)localObject;
        localg = arrayOfg[i1];
        localObject = localg;
      } while (localg.s == paramInt);
      i1 += 1;
    }
  }
  
  public static g b(int paramInt)
  {
    g[] arrayOfg = values();
    int i2 = arrayOfg.length;
    int i1 = 0;
    for (;;)
    {
      Object localObject;
      if (i1 >= i2) {
        localObject = null;
      }
      g localg;
      do
      {
        return (g)localObject;
        localg = arrayOfg[i1];
        localObject = localg;
      } while (localg.r == paramInt);
      i1 += 1;
    }
  }
  
  public static g c(int paramInt)
  {
    g[] arrayOfg = values();
    int i2 = arrayOfg.length;
    int i1 = 0;
    for (;;)
    {
      Object localObject;
      if (i1 >= i2) {
        localObject = null;
      }
      g localg;
      do
      {
        return (g)localObject;
        localg = arrayOfg[i1];
        localObject = localg;
      } while (localg.t == paramInt);
      i1 += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */