package com.iflytek.sunflower.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

public class h
{
  public static String a(NetworkInfo paramNetworkInfo)
  {
    if (paramNetworkInfo == null) {
      paramNetworkInfo = "";
    }
    for (;;)
    {
      return paramNetworkInfo;
      try
      {
        if (paramNetworkInfo.getType() == 1) {
          return "wifi";
        }
        String str = paramNetworkInfo.getExtraInfo().toLowerCase();
        if (TextUtils.isEmpty(str)) {
          return "";
        }
        if ((!str.startsWith("3gwap")) && (!str.startsWith("uniwap")))
        {
          if (str.startsWith("cmwap")) {
            return "cmwap";
          }
          if (str.startsWith("ctwap")) {
            return "ctwap";
          }
          paramNetworkInfo = str;
          if (!str.startsWith("ctnet")) {
            continue;
          }
          return "ctnet";
        }
      }
      catch (Exception paramNetworkInfo)
      {
        return "";
      }
    }
    return "uniwap";
  }
  
  public static boolean a(Context paramContext)
  {
    if (a(paramContext, "android.permission.INTERNET"))
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      return (paramContext != null) && (paramContext.isAvailable());
    }
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    return paramContext.getPackageManager().checkPermission(paramString, paramContext.getPackageName()) == 0;
  }
  
  public static String b(NetworkInfo paramNetworkInfo)
  {
    if (paramNetworkInfo == null) {
      return "";
    }
    try
    {
      if (paramNetworkInfo.getType() == 1) {
        return "";
      }
      String str = "" + paramNetworkInfo.getSubtypeName();
      paramNetworkInfo = str + ";" + paramNetworkInfo.getSubtype();
      return paramNetworkInfo;
    }
    catch (Exception paramNetworkInfo) {}
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */