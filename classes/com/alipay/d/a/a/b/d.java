package com.alipay.d.a.a.b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.alipay.d.a.a.a.a;
import java.io.File;
import java.lang.reflect.Method;

public final class d
{
  private static d a = new d();
  
  public static d a()
  {
    return a;
  }
  
  private static String a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class, String.class }).invoke(null, new Object[] { paramString1, paramString2 });
      return paramString1;
    }
    catch (Exception paramString1) {}
    return paramString2;
  }
  
  public static boolean a(Context paramContext)
  {
    try
    {
      if ((!Build.HARDWARE.contains("goldfish")) && (!Build.PRODUCT.contains("sdk")) && (!Build.FINGERPRINT.contains("generic")))
      {
        Object localObject = (TelephonyManager)paramContext.getSystemService("phone");
        if (localObject != null)
        {
          localObject = ((TelephonyManager)localObject).getDeviceId();
          if (localObject == null) {
            break label124;
          }
          int j = ((String)localObject).length();
          if (j != 0) {
            break label132;
          }
          break label124;
          if (i >= j) {
            break label144;
          }
          if ((Character.isWhitespace(((String)localObject).charAt(i))) || (((String)localObject).charAt(i) == '0')) {
            break label137;
          }
          i = 0;
          break label126;
        }
        label102:
        boolean bool = a.a(Settings.Secure.getString(paramContext.getContentResolver(), "android_id"));
        return bool;
      }
    }
    catch (Exception paramContext)
    {
      return false;
    }
    return true;
    label124:
    label126:
    label132:
    label137:
    label144:
    for (int i = 1;; i = 1)
    {
      if (i == 0) {
        break label102;
      }
      return true;
      i = 0;
      break;
      i += 1;
      break;
    }
  }
  
  public static String b()
  {
    return "android";
  }
  
  public static boolean c()
  {
    int i = 0;
    while (i < 5) {
      try
      {
        boolean bool = new File(new String[] { "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/" }[i] + "su").exists();
        if (bool) {
          return true;
        }
        i += 1;
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  public static String d()
  {
    return Build.BOARD;
  }
  
  public static String e()
  {
    return Build.BRAND;
  }
  
  public static String f()
  {
    return Build.DEVICE;
  }
  
  public static String g()
  {
    return Build.DISPLAY;
  }
  
  public static String h()
  {
    return Build.VERSION.INCREMENTAL;
  }
  
  public static String i()
  {
    return Build.MANUFACTURER;
  }
  
  public static String j()
  {
    return Build.MODEL;
  }
  
  public static String k()
  {
    return Build.PRODUCT;
  }
  
  public static String l()
  {
    return Build.VERSION.RELEASE;
  }
  
  public static String m()
  {
    return Build.VERSION.SDK;
  }
  
  public static String n()
  {
    return Build.TAGS;
  }
  
  public static String o()
  {
    return a("ro.kernel.qemu", "0");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */