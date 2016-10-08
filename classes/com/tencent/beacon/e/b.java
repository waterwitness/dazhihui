package com.tencent.beacon.e;

import android.util.Log;
import java.util.Locale;

public final class b
{
  public static boolean a = false;
  public static boolean b = false;
  
  private static void a(String paramString1, String paramString2, Object... paramVarArgs)
  {
    int i;
    String str;
    if (a)
    {
      i = 1;
      if (i != 0)
      {
        if (paramString2 != null) {
          break label34;
        }
        str = "null";
      }
    }
    for (;;)
    {
      Log.d(paramString1, str);
      return;
      i = 0;
      break;
      label34:
      str = paramString2;
      if (paramVarArgs != null)
      {
        str = paramString2;
        if (paramVarArgs.length != 0) {
          str = String.format(Locale.US, paramString2, paramVarArgs);
        }
      }
    }
  }
  
  public static void a(String paramString, Object... paramVarArgs)
  {
    int i;
    String str;
    if (a)
    {
      i = 1;
      if (i != 0)
      {
        if (paramString != null) {
          break label32;
        }
        str = "null";
      }
    }
    for (;;)
    {
      Log.i("beacon", str);
      return;
      i = 0;
      break;
      label32:
      str = paramString;
      if (paramVarArgs != null)
      {
        str = paramString;
        if (paramVarArgs.length != 0) {
          str = String.format(Locale.US, paramString, paramVarArgs);
        }
      }
    }
  }
  
  public static void b(String paramString, Object... paramVarArgs)
  {
    int i;
    String str;
    if (a)
    {
      i = 1;
      if (i != 0)
      {
        if (paramString != null) {
          break label32;
        }
        str = "null";
      }
    }
    for (;;)
    {
      Log.d("beacon", str);
      return;
      i = 0;
      break;
      label32:
      str = paramString;
      if (paramVarArgs != null)
      {
        str = paramString;
        if (paramVarArgs.length != 0) {
          str = String.format(Locale.US, paramString, paramVarArgs);
        }
      }
    }
  }
  
  public static void c(String paramString, Object... paramVarArgs)
  {
    String str;
    if (paramString == null) {
      str = "null";
    }
    for (;;)
    {
      Log.w("beacon", str);
      return;
      str = paramString;
      if (paramVarArgs != null)
      {
        str = paramString;
        if (paramVarArgs.length != 0) {
          str = String.format(Locale.US, paramString, paramVarArgs);
        }
      }
    }
  }
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    String str;
    if (paramString == null) {
      str = "null";
    }
    for (;;)
    {
      Log.e("beacon", str);
      return;
      str = paramString;
      if (paramVarArgs != null)
      {
        str = paramString;
        if (paramVarArgs.length != 0) {
          str = String.format(Locale.US, paramString, paramVarArgs);
        }
      }
    }
  }
  
  public static void e(String paramString, Object... paramVarArgs)
  {
    a("beacon_step_api", paramString, paramVarArgs);
  }
  
  public static void f(String paramString, Object... paramVarArgs)
  {
    a("beacon_step_buffer", paramString, paramVarArgs);
  }
  
  public static void g(String paramString, Object... paramVarArgs)
  {
    a("beacon_step_db", paramString, paramVarArgs);
  }
  
  public static void h(String paramString, Object... paramVarArgs)
  {
    a("beacon_step_upload", paramString, paramVarArgs);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */