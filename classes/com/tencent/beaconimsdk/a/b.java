package com.tencent.beaconimsdk.a;

public abstract class b
{
  public static boolean a = true;
  private static b b;
  
  public static b a()
  {
    try
    {
      if (b == null) {
        b = new b.a();
      }
      b localb = b;
      return localb;
    }
    finally {}
  }
  
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt, Runnable paramRunnable, long paramLong1, long paramLong2);
  
  public abstract void a(Runnable paramRunnable);
  
  public abstract void a(Runnable paramRunnable, long paramLong);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */