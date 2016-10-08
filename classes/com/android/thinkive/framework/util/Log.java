package com.android.thinkive.framework.util;

public class Log
{
  private static final String TAG = "thinkive";
  public static boolean isDebug = true;
  
  protected static String buildMessage(String paramString)
  {
    StackTraceElement localStackTraceElement = new Throwable().fillInStackTrace().getStackTrace()[2];
    return localStackTraceElement.getClassName() + "." + localStackTraceElement.getMethodName() + "(): " + paramString;
  }
  
  public static void d(String paramString)
  {
    if (isDebug) {
      android.util.Log.d("thinkive", buildMessage(paramString));
    }
  }
  
  public static void d(String paramString, Throwable paramThrowable)
  {
    if (isDebug) {
      android.util.Log.d("thinkive", buildMessage(paramString), paramThrowable);
    }
  }
  
  public static void e(String paramString)
  {
    if (isDebug) {
      android.util.Log.e("thinkive", buildMessage(paramString));
    }
  }
  
  public static void e(String paramString, Throwable paramThrowable)
  {
    if (isDebug) {
      android.util.Log.e("thinkive", buildMessage(paramString), paramThrowable);
    }
  }
  
  public static void i(String paramString)
  {
    if (isDebug) {
      android.util.Log.i("thinkive", buildMessage(paramString));
    }
  }
  
  public static void i(String paramString, Throwable paramThrowable)
  {
    if (isDebug) {
      android.util.Log.i("thinkive", buildMessage(paramString), paramThrowable);
    }
  }
  
  public static void v(String paramString)
  {
    if (isDebug) {
      android.util.Log.v("thinkive", buildMessage(paramString));
    }
  }
  
  public static void v(String paramString, Throwable paramThrowable)
  {
    if (isDebug) {
      android.util.Log.v("thinkive", buildMessage(paramString), paramThrowable);
    }
  }
  
  public static void w(String paramString)
  {
    if (isDebug) {
      android.util.Log.w("thinkive", buildMessage(paramString));
    }
  }
  
  public static void w(String paramString, Throwable paramThrowable)
  {
    if (isDebug) {
      android.util.Log.w("thinkive", buildMessage(paramString), paramThrowable);
    }
  }
  
  public static void w(Throwable paramThrowable)
  {
    if (isDebug) {
      android.util.Log.w("thinkive", buildMessage(""), paramThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\Log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */