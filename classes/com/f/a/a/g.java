package com.f.a.a;

import android.content.Intent;
import android.os.Bundle;
import com.unionpay.upomp.lthj.plugin.ui.SplashActivity;

public class g
  implements Runnable
{
  public g(SplashActivity paramSplashActivity) {}
  
  public void run()
  {
    Object localObject = "/data/data/" + this.a.getPackageName() + "/lib/" + "liblthj_unipaybusiness20130328.so";
    try
    {
      System.load((String)localObject);
      SplashActivity.a(this.a, new m(this.a));
      localObject = this.a.getIntent().getExtras();
      boolean bool = ((Bundle)localObject).getBoolean("test", false);
      u.a().a(bool);
      if (localObject != null)
      {
        localObject = ((Bundle)localObject).getByteArray("xml");
        if (!SplashActivity.a(this.a, (byte[])localObject)) {
          return;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        SplashActivity.a(this.a, "没有找到liblthj_unipaybusiness20130328.so");
      }
      SplashActivity.b(this.a, "/data/data/" + this.a.getPackageName() + "/" + u.a().N);
      new be(this.a).start();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */