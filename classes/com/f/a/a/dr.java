package com.f.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.unionpay.upomp.lthj.util.PluginHelper;

public final class dr
  implements Runnable
{
  public dr(Context paramContext, Bundle paramBundle, Handler paramHandler) {}
  
  public void run()
  {
    ??? = new Intent();
    Object localObject2 = new ComponentName(this.a.getPackageName(), "com.unionpay.upomp.lthj.plugin.ui.SplashActivity");
    ((Intent)???).putExtras(this.b);
    ((Intent)???).setComponent((ComponentName)localObject2);
    this.a.startActivity((Intent)???);
    synchronized (PluginHelper.a)
    {
      try
      {
        PluginHelper.a.wait();
        ??? = u.a().d();
        localObject2 = Message.obtain();
        ((Message)localObject2).obj = ???;
        this.c.sendMessage((Message)localObject2);
        ec.c();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          localInterruptedException.printStackTrace();
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */