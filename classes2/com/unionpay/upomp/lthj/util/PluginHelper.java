package com.unionpay.upomp.lthj.util;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.f.a.a.dr;
import com.f.a.a.u;

public class PluginHelper
{
  public static Integer a = Integer.valueOf(0);
  
  public static void LaunchPlugin(Context paramContext, Handler paramHandler, Bundle paramBundle)
  {
    if ((paramHandler == null) || (paramBundle == null)) {}
    while (u.a().g) {
      return;
    }
    u.a().g = true;
    new Thread(new dr(paramContext, paramBundle, paramHandler)).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\util\PluginHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */