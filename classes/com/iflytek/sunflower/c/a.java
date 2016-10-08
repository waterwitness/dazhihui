package com.iflytek.sunflower.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;

public class a
{
  public static long[] a = { -1L, -1L };
  public static String[][] b = { { "os.manufact", Build.MANUFACTURER }, { "os.model", Build.MODEL }, { "os.product", Build.PRODUCT }, { "os.display", Build.DISPLAY }, { "os.user", Build.USER } };
  private static String[][] c = { { "os.hardware", "HARDWARE" } };
  private static f d = new f();
  private static boolean e = false;
  
  /* Error */
  public static f a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 68	com/iflytek/sunflower/c/a:e	Z
    //   6: ifeq +23 -> 29
    //   9: aload_0
    //   10: getstatic 66	com/iflytek/sunflower/c/a:d	Lcom/iflytek/sunflower/c/f;
    //   13: iconst_1
    //   14: invokestatic 76	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   17: invokestatic 79	com/iflytek/sunflower/c/a:a	(Landroid/content/Context;Lcom/iflytek/sunflower/c/f;Ljava/lang/Boolean;)V
    //   20: getstatic 66	com/iflytek/sunflower/c/a:d	Lcom/iflytek/sunflower/c/f;
    //   23: astore_0
    //   24: ldc 2
    //   26: monitorexit
    //   27: aload_0
    //   28: areturn
    //   29: aload_0
    //   30: invokestatic 82	com/iflytek/sunflower/c/a:b	(Landroid/content/Context;)V
    //   33: getstatic 66	com/iflytek/sunflower/c/a:d	Lcom/iflytek/sunflower/c/f;
    //   36: astore_0
    //   37: goto -13 -> 24
    //   40: astore_0
    //   41: ldc 2
    //   43: monitorexit
    //   44: aload_0
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	24	40	finally
    //   29	37	40	finally
  }
  
  private static String a(String paramString)
  {
    try
    {
      paramString = Build.class.getField(paramString);
      if (paramString != null)
      {
        paramString = paramString.get(new Build()).toString();
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      return "";
    }
    return "";
  }
  
  public static void a(Context paramContext, f paramf, Boolean paramBoolean)
  {
    if (paramContext == null)
    {
      paramf.a("wap_proxy", "", paramBoolean.booleanValue());
      return;
    }
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (paramContext == null)
    {
      paramf.a("wap_proxy", "", paramBoolean.booleanValue());
      return;
    }
    paramf.a("wap_proxy", h.a(paramContext), paramBoolean.booleanValue());
    paramf.a("net_subtype", h.b(paramContext), paramBoolean.booleanValue());
  }
  
  public static void a(f paramf, Context paramContext)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 0);
      paramf.a("app.ver.name", localPackageInfo.versionName);
      paramf.a("app.ver.code", "" + localPackageInfo.versionCode);
      paramf.a("app.pkg", localApplicationInfo.packageName);
      paramf.a("app.path", localApplicationInfo.dataDir);
      paramf.a("app.name", localApplicationInfo.loadLabel(paramContext.getPackageManager()).toString());
      return;
    }
    catch (Exception paramf) {}
  }
  
  private static void b(Context paramContext)
  {
    for (;;)
    {
      try
      {
        d.a();
        d.a("os.system", "Android");
        a(d, paramContext);
        Object localObject = paramContext.getResources().getDisplayMetrics();
        d.a("os.resolution", ((DisplayMetrics)localObject).widthPixels + "*" + ((DisplayMetrics)localObject).heightPixels);
        d.a("os.density", "" + ((DisplayMetrics)localObject).density);
        localObject = (TelephonyManager)paramContext.getSystemService("phone");
        d.a("os.imei", ((TelephonyManager)localObject).getDeviceId());
        d.a("os.imsi", ((TelephonyManager)localObject).getSubscriberId());
        d.a("os.version", Build.VERSION.SDK);
        d.a("os.release", Build.VERSION.RELEASE);
        i = 0;
        if (i < b.length)
        {
          d.a(b[i][0], b[i][1]);
          i += 1;
          continue;
          if (i < c.length)
          {
            localObject = a(c[i][1]);
            d.a(c[i][0], (String)localObject);
            i += 1;
            continue;
          }
          a(paramContext, d, Boolean.valueOf(false));
          paramContext = e.a(paramContext);
          d.a("net.mac", paramContext);
          e = true;
          return;
        }
      }
      catch (Exception paramContext)
      {
        e = false;
        return;
      }
      int i = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */