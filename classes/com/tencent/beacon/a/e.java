package com.tencent.beacon.a;

public abstract class e
{
  public static boolean a = true;
  private static e b;
  
  public static e a()
  {
    try
    {
      if (b == null) {
        b = new e.a();
      }
      e locale = b;
      return locale;
    }
    finally {}
  }
  
  public abstract void a(int paramInt, Runnable paramRunnable, long paramLong1, long paramLong2);
  
  public abstract void a(int paramInt, boolean paramBoolean);
  
  public abstract void a(Runnable paramRunnable);
  
  public abstract void a(Runnable paramRunnable, long paramLong);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */