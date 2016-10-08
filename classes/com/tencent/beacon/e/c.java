package com.tencent.beacon.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class c
{
  public static boolean a(Context paramContext)
  {
    paramContext = d(paramContext);
    return (paramContext != null) && (paramContext.getType() == 1);
  }
  
  public static boolean b(Context paramContext)
  {
    paramContext = d(paramContext);
    return (paramContext != null) && (paramContext.isConnected());
  }
  
  public static String c(Context paramContext)
  {
    paramContext = d(paramContext);
    if (paramContext == null) {
      return "unknown";
    }
    if (paramContext.getType() == 1) {
      return "wifi";
    }
    String str = paramContext.getExtraInfo();
    paramContext = str;
    if (str != null)
    {
      paramContext = str;
      if (str.length() > 64) {
        paramContext = str.substring(0, 64);
      }
    }
    return paramContext;
  }
  
  private static NetworkInfo d(Context paramContext)
  {
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null) {
        return null;
      }
      paramContext = paramContext.getActiveNetworkInfo();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */