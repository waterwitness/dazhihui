package com.android.volley;

import android.util.Log;
import java.util.Locale;

public class VolleyLog
{
  public static boolean DEBUG = Log.isLoggable(TAG, 2);
  public static String TAG = "Volley";
  
  private static String buildMessage(String paramString, Object... paramVarArgs)
  {
    int i;
    if (paramVarArgs == null)
    {
      paramVarArgs = new Throwable().fillInStackTrace().getStackTrace();
      i = 2;
    }
    for (;;)
    {
      if (i >= paramVarArgs.length) {}
      String str;
      for (paramVarArgs = "<unknown>";; paramVarArgs = str.substring(str.lastIndexOf('$') + 1) + "." + paramVarArgs[i].getMethodName())
      {
        return String.format(Locale.US, "[%d] %s: %s", new Object[] { Long.valueOf(Thread.currentThread().getId()), paramVarArgs, paramString });
        paramString = String.format(Locale.US, paramString, paramVarArgs);
        break;
        if (paramVarArgs[i].getClass().equals(VolleyLog.class)) {
          break label151;
        }
        str = paramVarArgs[i].getClassName();
        str = str.substring(str.lastIndexOf('.') + 1);
      }
      label151:
      i += 1;
    }
  }
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    Log.d(TAG, buildMessage(paramString, paramVarArgs));
  }
  
  public static void e(String paramString, Object... paramVarArgs)
  {
    Log.e(TAG, buildMessage(paramString, paramVarArgs));
  }
  
  public static void e(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    Log.e(TAG, buildMessage(paramString, paramVarArgs), paramThrowable);
  }
  
  public static void setTag(String paramString)
  {
    d("Changing log tag to %s", new Object[] { paramString });
    TAG = paramString;
    DEBUG = Log.isLoggable(TAG, 2);
  }
  
  public static void v(String paramString, Object... paramVarArgs)
  {
    if (DEBUG) {
      Log.v(TAG, buildMessage(paramString, paramVarArgs));
    }
  }
  
  public static void wtf(String paramString, Object... paramVarArgs)
  {
    Log.wtf(TAG, buildMessage(paramString, paramVarArgs));
  }
  
  public static void wtf(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    Log.wtf(TAG, buildMessage(paramString, paramVarArgs), paramThrowable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\VolleyLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */