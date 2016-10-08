package com.tencent.qalsdk.util;

import android.content.Context;
import android.util.Log;
import com.tencent.qalsdk.QALLogListener;
import com.tencent.qalsdk.sdk.q;

public class QLog
{
  public static final int CLR = 2;
  public static final int DEV = 4;
  public static final int LOG_DEBUG = 5;
  public static final int LOG_ERROR = 2;
  public static final int LOG_INFO = 4;
  public static final int LOG_ITEM_MAX_CACHE_SIZE = 50;
  public static final int LOG_OFF = 1;
  public static final int LOG_WARN = 3;
  public static final int USR = 1;
  public static final int defaultLogLevel = 5;
  static q helper = new q();
  private static int outputLogLevel = 5;
  public static String sBuildNumber = "";
  private static QALLogListener sdkLogLister;
  
  public static void d(String paramString1, int paramInt, String paramString2)
  {
    d(paramString1, paramInt, paramString2, null);
  }
  
  public static void d(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    if (outputLogLevel >= 5)
    {
      if (paramThrowable != null) {
        break label56;
      }
      Log.d(paramString1, paramString2);
    }
    for (;;)
    {
      if ((outputLogLevel >= 2) && (paramInt == 1))
      {
        helper.a(paramString1, paramString2, paramThrowable);
        if (sdkLogLister != null) {
          sdkLogLister.log(5, paramString1, paramString2);
        }
      }
      return;
      label56:
      Log.d(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void d(String paramString1, String paramString2)
  {
    d(paramString1, 0, paramString2, null);
  }
  
  public static void e(String paramString1, int paramInt, String paramString2)
  {
    e(paramString1, paramInt, paramString2, null);
  }
  
  public static void e(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    if (outputLogLevel >= 2)
    {
      if (paramThrowable != null) {
        break label62;
      }
      Log.e(paramString1, paramString2);
    }
    for (;;)
    {
      helper.a(paramString1, "[E] " + paramString2, paramThrowable);
      if (sdkLogLister != null) {
        sdkLogLister.log(2, paramString1, paramString2);
      }
      return;
      label62:
      Log.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void e(String paramString1, String paramString2)
  {
    e(paramString1, 0, paramString2, null);
  }
  
  public static String getFilePath()
  {
    return helper.d();
  }
  
  public static String getLogBasePath()
  {
    return helper.a();
  }
  
  public static String getLogFileName(long paramLong)
  {
    return helper.a(helper.a(paramLong));
  }
  
  public static int getOutputLogLevel()
  {
    return outputLogLevel;
  }
  
  public static String getStackTraceString(Throwable paramThrowable)
  {
    return Log.getStackTraceString(paramThrowable);
  }
  
  public static void i(String paramString1, int paramInt, String paramString2)
  {
    i(paramString1, paramInt, paramString2, null);
  }
  
  public static void i(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    if (outputLogLevel >= 4)
    {
      if (paramThrowable != null) {
        break label62;
      }
      Log.i(paramString1, paramString2);
    }
    for (;;)
    {
      helper.a(paramString1, "[I] " + paramString2, paramThrowable);
      if (sdkLogLister != null) {
        sdkLogLister.log(4, paramString1, paramString2);
      }
      return;
      label62:
      Log.i(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void i(String paramString1, String paramString2)
  {
    i(paramString1, 0, paramString2, null);
  }
  
  public static void init(Context paramContext)
  {
    helper.a(paramContext, "sdk");
  }
  
  public static boolean isColorLevel()
  {
    return false;
  }
  
  public static boolean isDevelopLevel()
  {
    return false;
  }
  
  public static void setOutputLogLevel(int paramInt)
  {
    i("QLog", "set service log level:" + paramInt);
    outputLogLevel = paramInt;
  }
  
  public static void setSdkLogListener(QALLogListener paramQALLogListener)
  {
    sdkLogLister = paramQALLogListener;
  }
  
  public static void w(String paramString1, int paramInt, String paramString2)
  {
    w(paramString1, paramInt, paramString2, null);
  }
  
  public static void w(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    if (outputLogLevel >= 3)
    {
      if (paramThrowable != null) {
        break label62;
      }
      Log.w(paramString1, paramString2);
    }
    for (;;)
    {
      helper.a(paramString1, "[W] " + paramString2, paramThrowable);
      if (sdkLogLister != null) {
        sdkLogLister.log(3, paramString1, paramString2);
      }
      return;
      label62:
      Log.w(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void w(String paramString1, String paramString2)
  {
    w(paramString1, 0, paramString2, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\util\QLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */