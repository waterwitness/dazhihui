package com.tencent.imsdk;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.tencent.TIMLogListener;
import com.tencent.TIMManager;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class QLogImpl
{
  private static final int[] INTERVAL_RETRY_INIT;
  private static final String MEMTag = "appMemory";
  public static final String TAG_REPORTLEVEL_COLORUSER = "W";
  public static final String TAG_REPORTLEVEL_DEVELOPER = "D";
  public static final String TAG_REPORTLEVEL_USER = "E";
  private static int UIN_REPORTLOG_LEVEL = 0;
  protected static int _DEFAULT_REPORTLOG_LEVEL = 4;
  public static Runnable acutualInitRunnable;
  static long colorLogTime = 0L;
  static HashSet<String> colorTags;
  protected static Object formatterLock;
  private static AtomicBoolean isInitLogFileDone;
  protected static boolean isLogToFile = false;
  private static AtomicBoolean isPreExceptionEnospc;
  private static long lastPrintMemeoryTime = 0L;
  static long lastWriterErrorTime = 0L;
  static final ReentrantLock lock;
  static MyLinkedBlockingDeque<String> logDeque;
  private static String logPath;
  private static String logTime;
  private static int myProcessId = 0;
  private static long nextHourTime = 0L;
  private static long nextSecondMinuteTime = 0L;
  static String nowUsedFile;
  private static String packageName;
  private static String processName;
  private static Handler retryInitHandler;
  private static AtomicInteger retryInitTimes;
  private static volatile Context sContext;
  private static TIMLogListener sdkLogLister;
  static Thread t;
  private static final String tag = "MSF.D.QLogImpl";
  private static FileWriter writer;
  
  static
  {
    UIN_REPORTLOG_LEVEL = 4;
    isLogToFile = true;
    formatterLock = new Object();
    logPath = "";
    processName = "";
    packageName = "";
    logDeque = new MyLinkedBlockingDeque(15000);
    lock = new ReentrantLock();
    isInitLogFileDone = new AtomicBoolean(false);
    lastPrintMemeoryTime = 0L;
    isPreExceptionEnospc = new AtomicBoolean(false);
    INTERVAL_RETRY_INIT = new int[] { 1, 2, 4, 8, 16, 29 };
    retryInitTimes = new AtomicInteger(0);
    retryInitHandler = new Handler(Looper.getMainLooper());
    sContext = null;
    acutualInitRunnable = new ᵔ();
    logTime = "";
    nowUsedFile = "";
    lastWriterErrorTime = 0L;
    t = new ⁱ();
    colorTags = new HashSet();
  }
  
  private static void addLogItem(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    if (IMMsfCoreProxy.get().getMode() == 1) {}
    do
    {
      do
      {
        return;
      } while (!isLogToFile);
      long l = System.currentTimeMillis();
      if (l >= nextSecondMinuteTime) {
        checkNextMinuteTime(l);
      }
      if ((colorLogTime != 0L) && (l - colorLogTime > 1800000L))
      {
        colorLogTime = 0L;
        colorTags.clear();
      }
      String str = getReportLevel(paramInt);
      l = Thread.currentThread().getId();
      paramString2 = logTime + "|" + processName + "[" + myProcessId + "]|" + String.valueOf(l) + "|" + str + "|" + paramString1 + "|" + paramString2 + "\n";
      paramString1 = paramString2;
      if (paramThrowable != null) {
        paramString1 = paramString2 + "\n" + Log.getStackTraceString(paramThrowable) + "\n";
      }
    } while ((!addLogToCache(paramString1)) || (IMMsfCoreProxy.get().getContext() == null) || (System.currentTimeMillis() - lastPrintMemeoryTime <= 180000L));
    lastPrintMemeoryTime = System.currentTimeMillis();
    printMemStatus();
  }
  
  private static boolean addLogToCache(String paramString)
  {
    try
    {
      logDeque.add(paramString);
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  /* Error */
  private static void checkNextMinuteTime(long paramLong)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: lload_0
    //   4: getstatic 201	com/tencent/imsdk/QLogImpl:nextSecondMinuteTime	J
    //   7: lcmp
    //   8: ifle +34 -> 42
    //   11: getstatic 82	com/tencent/imsdk/QLogImpl:formatterLock	Ljava/lang/Object;
    //   14: astore_2
    //   15: aload_2
    //   16: monitorenter
    //   17: getstatic 281	com/tencent/qalsdk/sdk/MsfSdkUtils:timeFormatter	Ljava/text/SimpleDateFormat;
    //   20: lload_0
    //   21: invokestatic 286	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   24: invokevirtual 292	java/text/SimpleDateFormat:format	(Ljava/lang/Object;)Ljava/lang/String;
    //   27: putstatic 142	com/tencent/imsdk/QLogImpl:logTime	Ljava/lang/String;
    //   30: getstatic 201	com/tencent/imsdk/QLogImpl:nextSecondMinuteTime	J
    //   33: ldc2_w 293
    //   36: ladd
    //   37: putstatic 201	com/tencent/imsdk/QLogImpl:nextSecondMinuteTime	J
    //   40: aload_2
    //   41: monitorexit
    //   42: ldc 2
    //   44: monitorexit
    //   45: return
    //   46: astore_3
    //   47: aload_2
    //   48: monitorexit
    //   49: aload_3
    //   50: athrow
    //   51: astore_2
    //   52: ldc 2
    //   54: monitorexit
    //   55: aload_2
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	paramLong	long
    //   51	5	2	localObject2	Object
    //   46	4	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   17	42	46	finally
    //   3	17	51	finally
    //   47	51	51	finally
  }
  
  public static void d(String paramString1, int paramInt, String paramString2)
  {
    d(paramString1, paramInt, paramString2, null);
  }
  
  public static void d(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    if ((UIN_REPORTLOG_LEVEL >= paramInt) || (colorTags.contains(paramString1))) {
      if (TIMManager.getInstance().getIsLogPrintEnabled())
      {
        if (paramThrowable != null) {
          break label89;
        }
        Log.d(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
      }
    }
    for (;;)
    {
      addLogItem(paramString1, paramInt, paramString2, paramThrowable);
      if (sdkLogLister != null) {
        sdkLogLister.log(4, paramString1, paramString2);
      }
      return;
      label89:
      Log.d(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2, paramThrowable);
    }
  }
  
  public static void dfile(String paramString1, int paramInt, String paramString2)
  {
    if ((UIN_REPORTLOG_LEVEL >= paramInt) || (colorTags.contains(paramString1)))
    {
      addLogItem(paramString1, paramInt, paramString2, null);
      if (sdkLogLister != null) {
        sdkLogLister.log(4, paramString1, paramString2);
      }
    }
  }
  
  public static void e(String paramString1, int paramInt, String paramString2)
  {
    e(paramString1, paramInt, paramString2, null);
  }
  
  public static void e(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    if ((UIN_REPORTLOG_LEVEL >= paramInt) || (colorTags.contains(paramString1))) {
      if (TIMManager.getInstance().getIsLogPrintEnabled())
      {
        if (paramThrowable != null) {
          break label89;
        }
        Log.e(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
      }
    }
    for (;;)
    {
      addLogItem(paramString1, paramInt, paramString2, paramThrowable);
      if (sdkLogLister != null) {
        sdkLogLister.log(1, paramString1, paramString2);
      }
      return;
      label89:
      Log.e(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2, paramThrowable);
    }
  }
  
  public static void efile(String paramString1, int paramInt, String paramString2)
  {
    if ((UIN_REPORTLOG_LEVEL >= paramInt) || (colorTags.contains(paramString1)))
    {
      addLogItem(paramString1, paramInt, paramString2, null);
      if (sdkLogLister != null) {
        sdkLogLister.log(1, paramString1, paramString2);
      }
    }
  }
  
  public static String getLogFileName(String paramString)
  {
    return processName.replace(":", "_") + "." + paramString + ".log";
  }
  
  public static String getLogPath()
  {
    return logPath;
  }
  
  public static String getReportLevel(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    default: 
      return "E";
    case 2: 
      return "W";
    case 4: 
      return "D";
    }
    return "E";
  }
  
  private static String getThisHour(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    Object localObject = new SimpleDateFormat("yy.MM.dd.HH");
    logTime = new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(Long.valueOf(paramLong));
    localObject = ((SimpleDateFormat)localObject).format(localCalendar.getTime());
    setNextSecond(localCalendar);
    setNextHour(localCalendar);
    return (String)localObject;
  }
  
  public static void i(String paramString1, int paramInt, String paramString2)
  {
    i(paramString1, paramInt, paramString2, null);
  }
  
  public static void i(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    if ((UIN_REPORTLOG_LEVEL >= paramInt) || (colorTags.contains(paramString1))) {
      if (TIMManager.getInstance().getIsLogPrintEnabled())
      {
        if (paramThrowable != null) {
          break label89;
        }
        Log.i(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
      }
    }
    for (;;)
    {
      addLogItem(paramString1, paramInt, paramString2, paramThrowable);
      if (sdkLogLister != null) {
        sdkLogLister.log(3, paramString1, paramString2);
      }
      return;
      label89:
      Log.i(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2, paramThrowable);
    }
  }
  
  public static void ifile(String paramString1, int paramInt, String paramString2)
  {
    if ((UIN_REPORTLOG_LEVEL >= paramInt) || (colorTags.contains(paramString1)))
    {
      addLogItem(paramString1, paramInt, paramString2, null);
      if (sdkLogLister != null) {
        sdkLogLister.log(3, paramString1, paramString2);
      }
    }
  }
  
  public static void init(Context paramContext)
  {
    sContext = paramContext.getApplicationContext();
    acutualInitRunnable.run();
  }
  
  static void initLogFile(long paramLong)
  {
    for (;;)
    {
      Object localObject3;
      File localFile;
      try
      {
        logPath = Environment.getExternalStorageDirectory().getPath() + "/tencent/imsdklogs/" + packageName.replace(".", "/") + "/";
        localObject3 = new File(logPath);
        if ((!((File)localObject3).exists()) && (!((File)localObject3).mkdirs())) {
          QLog.d("MSF.D.QLogImpl", 1, "create imsdklogs folder failed");
        }
        nowUsedFile = logPath + getLogFileName(getThisHour(paramLong));
      }
      finally {}
      try
      {
        localFile = new File(nowUsedFile);
        try
        {
          if (!localFile.exists())
          {
            boolean bool = localFile.createNewFile();
            writeAppVersion();
            localObject3 = localFile;
            if (writer != null)
            {
              writer.write(logTime + "|" + processName + "|D|MSF.D.QLogImpl" + "|" + Build.MODEL + " " + Build.VERSION.RELEASE + " create newLogFile " + localFile.getName() + " " + bool + "\n");
              writer.flush();
              localObject3 = localFile;
            }
            writer = new FileWriter((File)localObject3, true);
            writeAppVersion();
            return;
          }
          writeAppVersion();
          localObject3 = localFile;
          if (writer == null) {
            continue;
          }
          writer.write(logTime + "|" + processName + "|E|MSF.D.QLogImpl" + "|" + Build.MODEL + " " + Build.VERSION.RELEASE + "|newLogFile " + localFile.getName() + " is existed.\n");
          writer.flush();
          localObject3 = localFile;
          continue;
          localThrowable1.printStackTrace();
        }
        catch (Throwable localThrowable1) {}
      }
      catch (Throwable localThrowable2)
      {
        Object localObject2 = localObject4;
        localObject4 = localThrowable2;
        continue;
      }
      localObject4 = localFile;
    }
  }
  
  private static boolean insertLogToCacheHead(String paramString)
  {
    try
    {
      logDeque.addFirst(paramString);
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static boolean isColorUser()
  {
    return UIN_REPORTLOG_LEVEL > 1;
  }
  
  public static boolean isDEVELOPER()
  {
    return UIN_REPORTLOG_LEVEL >= 4;
  }
  
  public static void p(String paramString1, String paramString2)
  {
    if (TIMManager.getInstance().getIsLogPrintEnabled()) {
      Log.d("MSF.D.QLogImpl", "[s]" + paramString2);
    }
  }
  
  private static void printMemStatus()
  {
    try
    {
      ActivityManager localActivityManager = (ActivityManager)IMMsfCoreProxy.get().getContext().getSystemService("activity");
      ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
      localActivityManager.getMemoryInfo(localMemoryInfo);
      if (QLog.isColorLevel()) {
        d("appMemory", 2, "availMem:" + localMemoryInfo.availMem / 1024L / 1024L + "M lowThreshold:" + localMemoryInfo.threshold / 1024L / 1024L + "M");
      }
      return;
    }
    catch (Exception localException)
    {
      while (!QLog.isColorLevel()) {}
      d("appMemory", 2, "printMemError " + localException, localException);
    }
  }
  
  private static void setNextHour(Calendar paramCalendar)
  {
    paramCalendar.add(11, 1);
    paramCalendar.set(12, 0);
    paramCalendar.set(13, 0);
    nextHourTime = paramCalendar.getTimeInMillis();
  }
  
  private static void setNextSecond(Calendar paramCalendar)
  {
    paramCalendar.set(14, 0);
    nextSecondMinuteTime = paramCalendar.getTimeInMillis() + 1000L;
  }
  
  public static void setSdkLogListener(TIMLogListener paramTIMLogListener)
  {
    sdkLogLister = paramTIMLogListener;
  }
  
  public static void w(String paramString1, int paramInt, String paramString2)
  {
    w(paramString1, paramInt, paramString2, null);
  }
  
  public static void w(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    if ((UIN_REPORTLOG_LEVEL >= paramInt) || (colorTags.contains(paramString1))) {
      if (TIMManager.getInstance().getIsLogPrintEnabled())
      {
        if (paramThrowable != null) {
          break label89;
        }
        Log.w(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2);
      }
    }
    for (;;)
    {
      addLogItem(paramString1, paramInt, paramString2, paramThrowable);
      if (sdkLogLister != null) {
        sdkLogLister.log(2, paramString1, paramString2);
      }
      return;
      label89:
      Log.w(paramString1, "[" + getReportLevel(paramInt) + "]" + paramString2, paramThrowable);
    }
  }
  
  public static void wfile(String paramString1, int paramInt, String paramString2)
  {
    if ((UIN_REPORTLOG_LEVEL >= paramInt) || (colorTags.contains(paramString1)))
    {
      addLogItem(paramString1, paramInt, paramString2, null);
      if (sdkLogLister != null) {
        sdkLogLister.log(2, paramString1, paramString2);
      }
    }
  }
  
  private static void writeAppVersion()
  {
    if ((writer != null) && (!"".equals(QLog.sBuildNumber)))
    {
      writer.write(logTime + "|" + processName + "|D||QQ_Version: " + QLog.sBuildNumber + "\r\n");
      writer.flush();
    }
  }
  
  private static void writeLogToFile(String paramString)
  {
    try
    {
      if (!isLogToFile) {
        return;
      }
      if (!"mounted".equals(Environment.getExternalStorageState())) {
        return;
      }
      if (writer != null) {
        break label132;
      }
      System.out.println("can not write log.");
      l1 = System.currentTimeMillis();
      if (lastWriterErrorTime != 0L) {
        break label97;
      }
      lastWriterErrorTime = l1;
    }
    catch (Throwable paramString)
    {
      long l1;
      while (((paramString instanceof IOException)) && (paramString.getMessage().contains("ENOSPC")))
      {
        if (!isPreExceptionEnospc.compareAndSet(false, true)) {
          return;
        }
        paramString.printStackTrace();
        return;
        label97:
        long l2 = lastWriterErrorTime;
        if (l1 - l2 > 60000L)
        {
          try
          {
            initLogFile(System.currentTimeMillis());
            lastWriterErrorTime = l1;
          }
          catch (IOException paramString)
          {
            for (;;)
            {
              paramString.printStackTrace();
            }
          }
          label132:
          l1 = System.currentTimeMillis();
          if (l1 > nextHourTime) {
            initLogFile(l1);
          }
          boolean bool = lock.tryLock();
          if (bool) {}
          try
          {
            writer.write(paramString);
            writer.flush();
            lock.unlock();
          }
          finally
          {
            lock.unlock();
          }
          Log.d("QLogImpl", "insertLogToCacheHead failed!");
        }
      }
      isPreExceptionEnospc.compareAndSet(true, false);
      paramString.printStackTrace();
      try
      {
        initLogFile(System.currentTimeMillis());
        return;
      }
      catch (Throwable paramString)
      {
        paramString.printStackTrace();
      }
    }
    isPreExceptionEnospc.compareAndSet(true, false);
    return;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\QLogImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */