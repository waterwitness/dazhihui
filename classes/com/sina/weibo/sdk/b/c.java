package com.sina.weibo.sdk.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;

public class c
{
  private static final char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
  private static final byte[] b = new byte['Ā'];
  
  public static String a(Context paramContext, String paramString)
  {
    for (;;)
    {
      int i;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
        i = 0;
        if (i >= paramContext.signatures.length) {
          return null;
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        return null;
      }
      paramString = paramContext.signatures[i].toByteArray();
      if (paramString != null) {
        return b.a(paramString);
      }
      i += 1;
    }
  }
  
  public static boolean a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getResources().getConfiguration().locale;
      boolean bool;
      if ((!Locale.CHINA.equals(paramContext)) && (!Locale.CHINESE.equals(paramContext)) && (!Locale.SIMPLIFIED_CHINESE.equals(paramContext))) {
        bool = Locale.TAIWAN.equals(paramContext);
      }
      return bool;
    }
    catch (Exception paramContext) {}
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */