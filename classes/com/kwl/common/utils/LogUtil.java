package com.kwl.common.utils;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressLint({"SimpleDateFormat"})
public class LogUtil
{
  public static boolean allowD = true;
  public static boolean allowE = true;
  public static boolean allowI = true;
  public static boolean allowV = true;
  public static boolean allowW = true;
  public static boolean allowWtf = true;
  private static boolean bDebug;
  public static LogUtil.CustomLogger customLogger;
  public static String customTagPrefix = "";
  
  static
  {
    bDebug = true;
  }
  
  public static void d(String paramString)
  {
    if (!bDebug) {}
    while (!allowD) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.d(str, paramString);
      return;
    }
    Log.d(str, paramString);
  }
  
  public static void d(String paramString, Throwable paramThrowable)
  {
    if (!bDebug) {}
    while (!allowD) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.d(str, paramString, paramThrowable);
      return;
    }
    Log.d(str, paramString, paramThrowable);
  }
  
  public static void e(String paramString)
  {
    if (!bDebug) {}
    while (!allowE) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.e(str, paramString);
      return;
    }
    Log.e(str, paramString);
  }
  
  public static void e(String paramString, Throwable paramThrowable)
  {
    if (!bDebug) {}
    while (!allowE) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.e(str, paramString, paramThrowable);
      return;
    }
    Log.e(str, paramString, paramThrowable);
  }
  
  private static String generateTag(StackTraceElement paramStackTraceElement)
  {
    String str = paramStackTraceElement.getClassName();
    paramStackTraceElement = String.format("%s.%s(L:%d)", new Object[] { str.substring(str.lastIndexOf(".") + 1), paramStackTraceElement.getMethodName(), Integer.valueOf(paramStackTraceElement.getLineNumber()) });
    if (TextUtils.isEmpty(customTagPrefix)) {
      return paramStackTraceElement;
    }
    return customTagPrefix + ":" + paramStackTraceElement;
  }
  
  public static StackTraceElement getCallerStackTraceElement()
  {
    return Thread.currentThread().getStackTrace()[4];
  }
  
  public static String getStackInfo(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
    paramThrowable.printStackTrace(localPrintWriter);
    localPrintWriter.close();
    return localStringWriter.toString();
  }
  
  public static void i(String paramString)
  {
    if (!bDebug) {}
    while (!allowI) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.i(str, paramString);
      return;
    }
    Log.i(str, paramString);
  }
  
  public static void i(String paramString, Throwable paramThrowable)
  {
    if (!bDebug) {}
    while (!allowI) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.i(str, paramString, paramThrowable);
      return;
    }
    Log.i(str, paramString, paramThrowable);
  }
  
  public static void setDebug(boolean paramBoolean)
  {
    bDebug = paramBoolean;
  }
  
  public static void v(String paramString)
  {
    if (!bDebug) {}
    while (!allowV) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.v(str, paramString);
      return;
    }
    Log.v(str, paramString);
  }
  
  public static void v(String paramString, Throwable paramThrowable)
  {
    if (!bDebug) {}
    while (!allowV) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.v(str, paramString, paramThrowable);
      return;
    }
    Log.v(str, paramString, paramThrowable);
  }
  
  public static void w(String paramString)
  {
    if (!bDebug) {}
    while (!allowW) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.w(str, paramString);
      return;
    }
    Log.w(str, paramString);
  }
  
  public static void w(String paramString, Throwable paramThrowable)
  {
    if (!bDebug) {}
    while (!allowW) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.w(str, paramString, paramThrowable);
      return;
    }
    Log.w(str, paramString, paramThrowable);
  }
  
  public static void w(Throwable paramThrowable)
  {
    if (!bDebug) {}
    while (!allowW) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.w(str, paramThrowable);
      return;
    }
    Log.w(str, paramThrowable);
  }
  
  public static void writeLog(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return;
      Log.d("QHTAPP", paramString);
    } while (paramString != null);
    try
    {
      Object localObject = new File(Environment.getExternalStorageDirectory() + "/QHTLog/");
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdir();
      }
      localObject = new File(Environment.getExternalStorageDirectory() + "/QHTLog/YHT.log");
      if (!((File)localObject).exists()) {
        ((File)localObject).createNewFile();
      }
      localObject = new FileOutputStream((File)localObject, true);
      Date localDate = new Date(System.currentTimeMillis());
      ((FileOutputStream)localObject).write(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss] ").format(localDate).getBytes());
      ((FileOutputStream)localObject).write(paramString.getBytes());
      ((FileOutputStream)localObject).write("\r\n".getBytes());
      ((FileOutputStream)localObject).flush();
      ((FileOutputStream)localObject).close();
      return;
    }
    catch (FileNotFoundException paramString) {}catch (Exception paramString) {}
  }
  
  public static void writeLog(Throwable paramThrowable)
  {
    writeLog(getStackInfo(paramThrowable));
  }
  
  public static void wtf(String paramString)
  {
    if (!bDebug) {}
    while (!allowWtf) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.wtf(str, paramString);
      return;
    }
    Log.wtf(str, paramString);
  }
  
  public static void wtf(String paramString, Throwable paramThrowable)
  {
    if (!bDebug) {}
    while (!allowWtf) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.wtf(str, paramString, paramThrowable);
      return;
    }
    Log.wtf(str, paramString, paramThrowable);
  }
  
  public static void wtf(Throwable paramThrowable)
  {
    if (!bDebug) {}
    while (!allowWtf) {
      return;
    }
    String str = generateTag(getCallerStackTraceElement());
    if (customLogger != null)
    {
      customLogger.wtf(str, paramThrowable);
      return;
    }
    Log.wtf(str, paramThrowable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\LogUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */