package com.f.a.a;

import android.os.Handler;
import com.unionpay.upomp.lthj.plugin.ui.SplashActivity;

public class be
  extends Thread
{
  private byte[] b;
  
  public be(SplashActivity paramSplashActivity) {}
  
  public void a(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  public void run()
  {
    if (this.b != null) {
      this.a.initBottomData((byte[])this.b);
    }
    for (;;)
    {
      this.a.b.sendEmptyMessage(0);
      return;
      this.a.initBottomData(null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */