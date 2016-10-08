package com.sina.weibo.sdk.b;

import android.util.Log;

public class a
{
  private static boolean a = true;
  
  public static void a(String paramString1, String paramString2)
  {
    if (a)
    {
      StackTraceElement localStackTraceElement = Thread.currentThread().getStackTrace()[3];
      Log.d(paramString1, new StringBuilder(String.valueOf(localStackTraceElement.getFileName())).append("(").append(localStackTraceElement.getLineNumber()).append(") ").append(localStackTraceElement.getMethodName()).toString() + ": " + paramString2);
    }
  }
  
  public static void b(String paramString1, String paramString2)
  {
    if (a)
    {
      StackTraceElement localStackTraceElement = Thread.currentThread().getStackTrace()[3];
      Log.e(paramString1, new StringBuilder(String.valueOf(localStackTraceElement.getFileName())).append("(").append(localStackTraceElement.getLineNumber()).append(") ").append(localStackTraceElement.getMethodName()).toString() + ": " + paramString2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */