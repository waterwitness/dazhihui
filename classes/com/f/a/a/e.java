package com.f.a.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.SplashActivity;
import com.unionpay.upomp.lthj.util.PluginHelper;

public class e
  implements DialogInterface.OnClickListener
{
  public e(SplashActivity paramSplashActivity) {}
  
  public void onClick(DialogInterface arg1, int paramInt)
  {
    synchronized (PluginHelper.a)
    {
      PluginHelper.a.notify();
      this.a.finish();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */