package com.tencent.mm.sdk.b;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;

public final class a
{
  private static int level = 6;
  public static d q;
  private static a.a r;
  private static a.a s;
  private static final String t;
  
  static
  {
    Object localObject = new b();
    r = (a.a)localObject;
    s = (a.a)localObject;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
    ((StringBuilder)localObject).append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
    ((StringBuilder)localObject).append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
    ((StringBuilder)localObject).append("] BOARD:[" + Build.BOARD);
    ((StringBuilder)localObject).append("] DEVICE:[" + Build.DEVICE);
    ((StringBuilder)localObject).append("] DISPLAY:[" + Build.DISPLAY);
    ((StringBuilder)localObject).append("] FINGERPRINT:[" + Build.FINGERPRINT);
    ((StringBuilder)localObject).append("] HOST:[" + Build.HOST);
    ((StringBuilder)localObject).append("] MANUFACTURER:[" + Build.MANUFACTURER);
    ((StringBuilder)localObject).append("] MODEL:[" + Build.MODEL);
    ((StringBuilder)localObject).append("] PRODUCT:[" + Build.PRODUCT);
    ((StringBuilder)localObject).append("] TAGS:[" + Build.TAGS);
    ((StringBuilder)localObject).append("] TYPE:[" + Build.TYPE);
    ((StringBuilder)localObject).append("] USER:[" + Build.USER + "]");
    t = ((StringBuilder)localObject).toString();
  }
  
  public static void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, null);
  }
  
  public static void a(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if ((s != null) && (s.h() <= 4)) {
      if (paramVarArgs != null) {
        break label70;
      }
    }
    for (;;)
    {
      paramVarArgs = paramString2;
      if (paramString2 == null) {
        paramVarArgs = "";
      }
      paramString1 = i(paramString1);
      paramString2 = s;
      Process.myPid();
      Thread.currentThread().getId();
      Looper.getMainLooper().getThread().getId();
      paramString2.h(paramString1, paramVarArgs);
      return;
      label70:
      paramString2 = String.format(paramString2, paramVarArgs);
    }
  }
  
  public static void b(String paramString1, String paramString2)
  {
    if ((s != null) && (s.h() <= 3))
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "";
      }
      paramString1 = i(paramString1);
      paramString2 = s;
      Process.myPid();
      Thread.currentThread().getId();
      Looper.getMainLooper().getThread().getId();
      paramString2.g(paramString1, str);
    }
  }
  
  public static void c(String paramString1, String paramString2)
  {
    if ((s != null) && (s.h() <= 2))
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "";
      }
      paramString1 = i(paramString1);
      paramString2 = s;
      Process.myPid();
      Thread.currentThread().getId();
      Looper.getMainLooper().getThread().getId();
      paramString2.e(paramString1, str);
    }
  }
  
  public static void d(String paramString1, String paramString2)
  {
    if ((s != null) && (s.h() <= 1))
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "";
      }
      paramString1 = i(paramString1);
      paramString2 = s;
      Process.myPid();
      Thread.currentThread().getId();
      Looper.getMainLooper().getThread().getId();
      paramString2.f(paramString1, str);
    }
  }
  
  private static String i(String paramString)
  {
    String str = paramString;
    if (q != null) {
      str = q.i(paramString);
    }
    return str;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */