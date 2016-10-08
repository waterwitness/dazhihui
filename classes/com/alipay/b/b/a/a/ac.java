package com.alipay.b.b.a.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public final class ac
{
  private static Boolean a = null;
  
  public static final boolean a(Context paramContext)
  {
    if (a != null) {
      return a.booleanValue();
    }
    try
    {
      if ((paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 0).flags & 0x2) != 0) {}
      for (boolean bool = true;; bool = false)
      {
        paramContext = Boolean.valueOf(bool);
        a = paramContext;
        bool = paramContext.booleanValue();
        return bool;
      }
      return false;
    }
    catch (Exception paramContext) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */