package com.tencent.beacon.event;

final class b$2
  implements Runnable
{
  b$2(b paramb) {}
  
  public final void run()
  {
    com.tencent.beacon.e.b.f(" db events to up", new Object[0]);
    try
    {
      p.c(false);
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\b$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */