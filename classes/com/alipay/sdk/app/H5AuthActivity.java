package com.alipay.sdk.app;

public class H5AuthActivity
  extends H5PayActivity
{
  public final void a()
  {
    try
    {
      synchronized (a.a)
      {
        ???.notify();
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\app\H5AuthActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */