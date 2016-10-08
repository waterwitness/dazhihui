package com.tencent.qalsdk.sdk;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.a;
import android.util.Log;
import com.tencent.qalsdk.QALLogListener;
import com.tencent.qalsdk.util.QLog;
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

public class q
{
  private static final String N = "MSF.D.QLogImpl";
  protected static int a = 1;
  protected static final boolean b = false;
  protected static boolean c = true;
  public static final String e = "LOGLEVEL_";
  public static final String f = "LOGLEVELTIME";
  public static final String g = "LOGSAVETIME";
  private String A = "";
  private FileWriter B;
  private AtomicBoolean C = new AtomicBoolean(false);
  private int D;
  private long E = 0L;
  private AtomicBoolean F = new AtomicBoolean(false);
  private QALLogListener G;
  private String H;
  private final int[] I = { 1, 2, 4, 8, 16, 29 };
  private AtomicInteger J = new AtomicInteger(0);
  private Handler K = new Handler(Looper.getMainLooper());
  private volatile Context L = null;
  private String M = "";
  protected Object d = new Object();
  ae<String> h = new ae(15000);
  final ReentrantLock i = new ReentrantLock();
  public Runnable j = new r(this);
  String k = "";
  long l = 0L;
  Thread m = new t(this);
  Thread n = new u(this);
  public final String o = "D";
  public final String p = "W";
  public final String q = "E";
  HashSet<String> r = new HashSet();
  long s = 0L;
  private final String t = "appMemory";
  private int u = a;
  private String v = "";
  private String w;
  private long x;
  private long y;
  private String z = "";
  
  private void a(Calendar paramCalendar)
  {
    paramCalendar.add(11, 1);
    paramCalendar.set(12, 0);
    paramCalendar.set(13, 0);
    this.x = paramCalendar.getTimeInMillis();
  }
  
  private void b(Calendar paramCalendar)
  {
    paramCalendar.set(14, 0);
    this.y = (paramCalendar.getTimeInMillis() + 1000L);
  }
  
  private boolean b(String paramString)
  {
    try
    {
      this.h.add(paramString);
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  /* Error */
  private void c(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: lload_1
    //   3: aload_0
    //   4: getfield 211	com/tencent/qalsdk/sdk/q:y	J
    //   7: lcmp
    //   8: ifle +38 -> 46
    //   11: aload_0
    //   12: getfield 88	com/tencent/qalsdk/sdk/q:d	Ljava/lang/Object;
    //   15: astore_3
    //   16: aload_3
    //   17: monitorenter
    //   18: aload_0
    //   19: getstatic 225	com/tencent/qalsdk/sdk/MsfSdkUtils:timeFormatter	Ljava/text/SimpleDateFormat;
    //   22: lload_1
    //   23: invokestatic 231	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   26: invokevirtual 237	java/text/SimpleDateFormat:format	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: putfield 150	com/tencent/qalsdk/sdk/q:M	Ljava/lang/String;
    //   32: aload_0
    //   33: aload_0
    //   34: getfield 211	com/tencent/qalsdk/sdk/q:y	J
    //   37: ldc2_w 208
    //   40: ladd
    //   41: putfield 211	com/tencent/qalsdk/sdk/q:y	J
    //   44: aload_3
    //   45: monitorexit
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: astore 4
    //   51: aload_3
    //   52: monitorexit
    //   53: aload 4
    //   55: athrow
    //   56: astore_3
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_3
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	q
    //   0	61	1	paramLong	long
    //   56	4	3	localObject2	Object
    //   49	5	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   18	46	49	finally
    //   51	53	49	finally
    //   2	18	56	finally
    //   53	56	56	finally
  }
  
  private boolean c(String paramString)
  {
    try
    {
      this.h.a(paramString);
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  private void d(String paramString)
  {
    try
    {
      if (!c) {
        return;
      }
      if (!"mounted".equals(Environment.getExternalStorageState())) {
        return;
      }
      if (this.B != null) {
        break label141;
      }
      System.out.println("can not write log.");
      l1 = System.currentTimeMillis();
      if (this.l != 0L) {
        break label101;
      }
      this.l = l1;
    }
    catch (Throwable paramString)
    {
      long l1;
      while (((paramString instanceof IOException)) && (paramString.getMessage().contains("ENOSPC")))
      {
        if (!this.F.compareAndSet(false, true)) {
          return;
        }
        paramString.printStackTrace();
        return;
        label101:
        long l2 = this.l;
        if (l1 - l2 > 60000L)
        {
          try
          {
            b(System.currentTimeMillis());
            this.l = l1;
          }
          catch (IOException paramString)
          {
            for (;;)
            {
              paramString.printStackTrace();
            }
          }
          label141:
          l1 = System.currentTimeMillis();
          if (l1 > this.x) {
            b(l1);
          }
          boolean bool = this.i.tryLock();
          if (bool) {}
          try
          {
            this.B.write(paramString);
            this.B.flush();
            this.i.unlock();
          }
          finally
          {
            this.i.unlock();
          }
          Log.d("QLogImpl", "insertLogToCacheHead failed!");
        }
      }
      this.F.compareAndSet(true, false);
      paramString.printStackTrace();
      try
      {
        b(System.currentTimeMillis());
        return;
      }
      catch (Throwable paramString)
      {
        paramString.printStackTrace();
      }
    }
    this.F.compareAndSet(true, false);
    return;
  }
  
  private void j()
  {
    if ((this.B != null) && (!"".equals(QLog.sBuildNumber)))
    {
      this.B.write(this.M + "|" + this.z + "|D|" + "|QQ_Version: " + QLog.sBuildNumber + "\r\n");
      this.B.flush();
    }
  }
  
  private void k()
  {
    try
    {
      ((ActivityManager)this.L.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
      return;
    }
    catch (Exception localException) {}
  }
  
  public String a()
  {
    return this.w;
  }
  
  public String a(int paramInt)
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
  
  public String a(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    Object localObject = new SimpleDateFormat("yy.MM.dd.HH");
    this.M = new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(Long.valueOf(paramLong));
    localObject = ((SimpleDateFormat)localObject).format(localCalendar.getTime());
    b(localCalendar);
    a(localCalendar);
    return (String)localObject;
  }
  
  public String a(String paramString)
  {
    return this.H + "." + paramString + ".log";
  }
  
  public void a(Context paramContext, String paramString)
  {
    this.H = paramString;
    this.L = paramContext.getApplicationContext();
    if ((Build.VERSION.SDK_INT >= 23) && (a.a(this.L, "android.permission.WRITE_EXTERNAL_STORAGE") != 0))
    {
      c = false;
      QLog.i("MSF.D.QLogImpl", "no WRITE_EXTERNAL_STORAGE permission,can't log to file");
    }
    this.j.run();
    b();
  }
  
  public void a(QALLogListener paramQALLogListener)
  {
    this.G = paramQALLogListener;
  }
  
  public void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (!c) {}
    do
    {
      return;
      long l1 = System.currentTimeMillis();
      if (l1 >= this.y) {
        c(l1);
      }
      if ((this.s != 0L) && (l1 - this.s > 1800000L))
      {
        this.s = 0L;
        this.r.clear();
      }
      l1 = Thread.currentThread().getId();
      paramString2 = this.M + "|" + String.valueOf(l1) + "|" + paramString1 + "|" + paramString2 + "\n";
      paramString1 = paramString2;
      if (paramThrowable != null) {
        paramString1 = paramString2 + "\n" + Log.getStackTraceString(paramThrowable) + "\n";
      }
    } while ((!b(paramString1)) || (this.L == null) || (System.currentTimeMillis() - this.E <= 180000L));
    this.E = System.currentTimeMillis();
    k();
  }
  
  String b()
  {
    try
    {
      this.A = this.L.getPackageName();
      this.w = (Environment.getExternalStorageDirectory().getPath() + "/tencent/qalsdklogs/" + this.A.replace(".", "/") + "/");
      return this.w;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.A = "unknow";
      }
    }
  }
  
  public void b(int paramInt)
  {
    this.u = paramInt;
  }
  
  void b(long paramLong)
  {
    for (;;)
    {
      Object localObject3;
      File localFile;
      try
      {
        if (this.w == null) {
          b();
        }
        this.v = (this.w + this.H + "/");
        localObject3 = new File(this.v);
        if (!((File)localObject3).exists()) {
          ((File)localObject3).mkdirs();
        }
        this.k = (this.v + a(a(paramLong)));
      }
      finally {}
      try
      {
        localFile = new File(this.k);
        try
        {
          if (!localFile.exists())
          {
            boolean bool = localFile.createNewFile();
            j();
            localObject3 = localFile;
            if (this.B != null)
            {
              this.B.write(this.M + "|" + this.z + "|D|" + "MSF.D.QLogImpl" + "|" + Build.MODEL + " " + Build.VERSION.RELEASE + " create newLogFile " + localFile.getName() + " " + bool + "\n");
              this.B.flush();
              localObject3 = localFile;
            }
            this.B = new FileWriter((File)localObject3, true);
            j();
            return;
          }
          j();
          localObject3 = localFile;
          if (this.B == null) {
            continue;
          }
          this.B.write(this.M + "|" + this.z + "|E|" + "MSF.D.QLogImpl" + "|" + Build.MODEL + " " + Build.VERSION.RELEASE + "|newLogFile " + localFile.getName() + " is existed.\n");
          this.B.flush();
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
  
  public String c()
  {
    int i1 = this.z.indexOf(":");
    if (i1 > 0) {
      return this.z.substring(0, i1);
    }
    return this.z;
  }
  
  public String d()
  {
    return this.v;
  }
  
  public SimpleDateFormat e()
  {
    return new SimpleDateFormat("yy.MM.dd.HH");
  }
  
  public int f()
  {
    return this.u;
  }
  
  public String g()
  {
    return this.z;
  }
  
  public boolean h()
  {
    return this.u > 1;
  }
  
  public boolean i()
  {
    return this.u >= 4;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */