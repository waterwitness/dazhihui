package com.baidu.location.f.a;

import android.content.Context;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

final class c
{
  public final String a;
  public final boolean b;
  
  private c(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }
  
  static c a(Context paramContext)
  {
    bool = true;
    localObject = "";
    try
    {
      String str2 = Settings.System.getString(paramContext.getContentResolver(), "bd_setting_i");
      String str1 = str2;
      localObject = str2;
      if (TextUtils.isEmpty(str2))
      {
        localObject = str2;
        str1 = a(paramContext, "");
      }
      localObject = str1;
      Settings.System.putString(paramContext.getContentResolver(), "bd_setting_i", str1);
      i = 0;
      localObject = str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i;
        Log.d("DeviceId", "Settings.System.getString or putString failed");
        if (TextUtils.isEmpty((CharSequence)localObject))
        {
          localObject = a(paramContext, "");
          i = 1;
          continue;
          bool = false;
        }
        else
        {
          i = 1;
        }
      }
    }
    if (i == 0) {
      return new c((String)localObject, bool);
    }
  }
  
  private static String a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null) {
        break label38;
      }
      paramContext = paramContext.getDeviceId();
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        Log.e("DeviceId", "Read IMEI failed", paramContext);
        label38:
        paramContext = null;
      }
    }
    if (TextUtils.isEmpty(paramContext)) {
      return paramString;
    }
    return paramContext;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\f\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */