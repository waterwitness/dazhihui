package com.tencent.feedback.eup;

import android.content.Context;
import com.tencent.feedback.common.c;
import com.tencent.feedback.common.e;
import com.tencent.feedback.eup.jni.NativeExceptionHandler;
import com.tencent.feedback.eup.jni.NativeExceptionUpload;
import com.tencent.feedback.proguard.o;
import com.tencent.feedback.proguard.p;
import com.tencent.feedback.proguard.u;
import com.tencent.feedback.proguard.y;
import com.tencent.feedback.upload.AbstractUploadDatas;
import com.tencent.feedback.upload.UploadHandleListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class CrashReport
{
  public static boolean addPlugin(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) || (paramString2 == null)) {
      return false;
    }
    c localc = c.a(paramContext);
    paramContext = paramString3;
    if (paramString3 == null) {
      paramContext = "";
    }
    return localc.a(paramString1, paramString2, paramContext);
  }
  
  public static void clearSDKTotalConsume(Context paramContext)
  {
    com.tencent.feedback.common.f.c(paramContext);
  }
  
  public static int countExceptionDatas(Context paramContext)
  {
    if (!f.n()) {
      return -1;
    }
    paramContext = f.k();
    if (paramContext == null)
    {
      e.c("rqdp{  instance == null}", new Object[0]);
      return -1;
    }
    return paramContext.g();
  }
  
  public static int countStoredRecord(Context paramContext)
  {
    return b.b(paramContext);
  }
  
  public static boolean doUploadExceptionDatas()
  {
    return f.m();
  }
  
  public static CrashStrategyBean getCrashRuntimeStrategy()
  {
    try
    {
      CrashStrategyBean localCrashStrategyBean = f.k().r();
      return localCrashStrategyBean;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  public static byte[] getExceptionDatas(Context paramContext)
  {
    paramContext = f.l();
    if (paramContext != null)
    {
      byte[] arrayOfByte = paramContext.a(true);
      if (arrayOfByte != null) {
        paramContext.done(true);
      }
      return arrayOfByte;
    }
    return null;
  }
  
  public static long getSDKTotalConsume(Context paramContext, boolean paramBoolean)
  {
    paramContext = com.tencent.feedback.common.f.b(paramContext);
    if (paramContext != null)
    {
      if (paramBoolean) {
        return paramContext.e;
      }
      long l = paramContext.d;
      return paramContext.e + l;
    }
    return -1L;
  }
  
  public static boolean handleCatchException(Thread paramThread, Throwable paramThrowable, String paramString, byte[] paramArrayOfByte)
  {
    return f.a(paramThread, paramThrowable, paramString, paramArrayOfByte);
  }
  
  public static void initCrashReport(Context paramContext)
  {
    initCrashReport(paramContext, null, null, true, null);
  }
  
  public static void initCrashReport(Context paramContext, CrashHandleListener paramCrashHandleListener, UploadHandleListener paramUploadHandleListener, boolean paramBoolean, CrashStrategyBean paramCrashStrategyBean)
  {
    f.a(paramContext, "10000", false, f.a(paramContext, paramBoolean), paramUploadHandleListener, paramCrashHandleListener, paramCrashStrategyBean);
  }
  
  public static void initCrashReport(Context paramContext, CrashHandleListener paramCrashHandleListener, UploadHandleListener paramUploadHandleListener, boolean paramBoolean, CrashStrategyBean paramCrashStrategyBean, long paramLong)
  {
    if (paramLong > 0L)
    {
      long l = paramLong;
      if (paramLong > 10000L) {
        l = 10000L;
      }
      u.a(l);
    }
    f.a(paramContext, null, false, f.a(paramContext, paramBoolean), paramUploadHandleListener, paramCrashHandleListener, paramCrashStrategyBean);
  }
  
  public static void initCrashReport(Context paramContext, boolean paramBoolean)
  {
    f.a(paramContext, "10000", false, f.a(paramContext, paramBoolean), null, null, null);
  }
  
  public static void initNativeCrashReport(Context paramContext, String paramString, boolean paramBoolean)
  {
    initNativeCrashReport(paramContext, paramString, paramBoolean, null, null);
  }
  
  public static void initNativeCrashReport(Context paramContext, String paramString, boolean paramBoolean, List<File> paramList)
  {
    initNativeCrashReport(paramContext, paramString, paramBoolean, paramList, null);
  }
  
  public static void initNativeCrashReport(Context paramContext, String paramString, boolean paramBoolean, List<File> paramList, File paramFile)
  {
    Object localObject;
    if (paramFile != null)
    {
      if (!NativeExceptionUpload.loadRQDNativeLib(paramFile))
      {
        e.d("load lib fail %s close native return!", new Object[] { paramFile.getAbsoluteFile() });
        return;
      }
      e.a("load lib sucess from specify!", new Object[0]);
      localObject = com.tencent.feedback.eup.jni.b.a(paramContext);
      ((com.tencent.feedback.eup.jni.b)localObject).a(paramString);
      NativeExceptionUpload.setmHandler((NativeExceptionHandler)localObject);
      localObject = paramList;
      if (paramFile != null)
      {
        localObject = paramList;
        if (paramList == null) {
          localObject = new ArrayList();
        }
        ((List)localObject).add(paramFile);
      }
      if ((paramContext != null) && (paramString != null)) {
        break label175;
      }
      e.c("rqdp{  nreg param!}", new Object[0]);
    }
    for (;;)
    {
      com.tencent.feedback.common.d.a(paramContext);
      paramList = com.tencent.feedback.common.d.d();
      com.tencent.feedback.common.d.a(paramContext);
      NativeExceptionUpload.registEUP(paramString, paramList, Integer.parseInt(com.tencent.feedback.common.d.c()));
      NativeExceptionUpload.enableNativeEUP(true);
      if (!paramBoolean) {
        break label300;
      }
      NativeExceptionUpload.setNativeLogMode(3);
      return;
      if (!NativeExceptionUpload.loadRQDNativeLib())
      {
        e.d("load lib fail default close native return!", new Object[0]);
        return;
      }
      e.a("load lib sucess default!", new Object[0]);
      break;
      label175:
      paramList = f.k().r();
      long l1 = com.tencent.feedback.proguard.a.b();
      long l2 = paramList.getRecordOverDays() * 24 * 3600 * 1000;
      int i = paramList.getMaxStoredNum();
      com.tencent.feedback.common.b.b().a(new com.tencent.feedback.eup.jni.d(paramContext, paramString, l1 - l2, i));
      paramList = "/data/data/" + paramContext.getPackageName() + "/lib/";
      if (c.a(paramContext).A() == null)
      {
        e.b("no setted SO , query so!", new Object[0]);
        com.tencent.feedback.common.b.b().a(new com.tencent.feedback.eup.jni.a(paramContext, paramList, (List)localObject));
      }
    }
    label300:
    NativeExceptionUpload.setNativeLogMode(5);
  }
  
  public static void removePlugin(Context paramContext, String paramString)
  {
    if (paramString != null) {
      c.a(paramContext).f(paramString);
    }
  }
  
  public static void setAPKSHa1(Context paramContext, String paramString)
  {
    c.a(paramContext).d(paramString);
    e.b("set sha1 %s", new Object[] { paramString });
  }
  
  public static void setCountryName(Context paramContext, String paramString)
  {
    c.a(paramContext).g(paramString);
  }
  
  public static void setCrashReportAble(boolean paramBoolean)
  {
    f localf = f.k();
    if (localf != null) {
      localf.a(paramBoolean);
    }
  }
  
  public static void setDengta_AppKey(Context paramContext, String paramString)
  {
    c.a(paramContext).e(paramString);
    e.b("setted beacon appkey %s", new Object[] { paramString });
  }
  
  public static void setDeviceId(Context paramContext, String paramString)
  {
    c.a(paramContext).b(paramString);
  }
  
  public static void setDeviceRooted(Context paramContext, boolean paramBoolean)
  {
    c.a(paramContext).a(paramBoolean);
    e.b("setted isRT %s", new Object[] { paramBoolean });
  }
  
  public static void setLogAble(boolean paramBoolean1, boolean paramBoolean2)
  {
    e.a = paramBoolean1;
    e.b = paramBoolean2;
  }
  
  public static void setNativeCrashReportAble(boolean paramBoolean)
  {
    NativeExceptionUpload.enableNativeEUP(paramBoolean);
  }
  
  public static void setProductVersion(Context paramContext, String paramString)
  {
    c.a(paramContext).h(paramString);
    e.b("setted version %s", new Object[] { paramString });
  }
  
  public static void setSOFile(Context paramContext, List<SOFile> paramList)
  {
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList();
      paramContext = c.a(paramContext);
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        SOFile localSOFile = (SOFile)paramList.next();
        o localo = new o();
        localo.a(localSOFile.fileName);
        localo.c(localSOFile.arch);
        localo.b(localSOFile.sha1);
        e.b("setsofile %s %s %s", new Object[] { localo.a(), localo.f(), localo.d() });
        localArrayList.add(localo);
      }
      if (localArrayList.size() > 0)
      {
        paramContext.a(localArrayList);
        e.b("setted so count %d", new Object[] { Integer.valueOf(localArrayList.size()) });
      }
    }
  }
  
  public static void setThreadPoolService(ScheduledExecutorService paramScheduledExecutorService)
  {
    com.tencent.feedback.common.b.a(com.tencent.feedback.common.b.a(paramScheduledExecutorService));
  }
  
  public static void setUserId(Context paramContext, String paramString)
  {
    c.a(paramContext).a(paramString);
    paramContext = y.a();
    if (paramContext != null)
    {
      e.b("record uidstate async", new Object[0]);
      paramContext.c();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\CrashReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */