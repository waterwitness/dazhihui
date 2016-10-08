package com.tencent.feedback.anr;

import android.app.ActivityManager;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.util.SparseArray;
import com.tencent.feedback.common.PlugInInfo;
import com.tencent.feedback.common.service.RQDService;
import com.tencent.feedback.common.service.RQDServiceTask;
import com.tencent.feedback.eup.CrashReport;
import com.tencent.feedback.eup.CrashStrategyBean;
import com.tencent.feedback.eup.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ANRHandleServiceTask
  implements Parcelable, RQDServiceTask
{
  public static final Parcelable.Creator<ANRHandleServiceTask> CREATOR = new ANRHandleServiceTask.1();
  protected static final long PROCESS_ERROR_STATE_WAITING_PERIOD = 500L;
  protected static final long PROCESS_ERROR_STATE_WAITING_TIMEOUT = 10000L;
  protected static final long PROCESS_KILL_WAITING_TIMEOUT = 10000L;
  protected static final String TRACE_FILE_DIR = "/data/anr/";
  protected static final String TRACE_FILE_PATH = "/data/anr/traces.txt";
  public static AtomicBoolean isHandling = new AtomicBoolean(false);
  public static com.tencent.feedback.eup.jni.c lastHandledANRFirstDump$2e178719 = null;
  private final String deviceID;
  private final boolean isUseMerge;
  private final Map<String, PlugInInfo> pluginList;
  private final long serverTimeGap;
  private final String userId;
  
  public ANRHandleServiceTask(Parcel paramParcel)
  {
    if (paramParcel.readInt() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.isUseMerge = bool;
      this.userId = paramParcel.readString();
      this.deviceID = paramParcel.readString();
      this.serverTimeGap = paramParcel.readLong();
      int j = paramParcel.readInt();
      if (j <= 0) {
        break;
      }
      this.pluginList = new HashMap();
      while (i < j)
      {
        PlugInInfo localPlugInInfo = new PlugInInfo(paramParcel);
        this.pluginList.put(localPlugInInfo.plugInId, localPlugInInfo);
        i += 1;
      }
    }
    this.pluginList = null;
  }
  
  public ANRHandleServiceTask(boolean paramBoolean, String paramString1, String paramString2, long paramLong, Map<String, PlugInInfo> paramMap)
  {
    this.isUseMerge = paramBoolean;
    this.userId = paramString1;
    this.deviceID = paramString2;
    this.serverTimeGap = paramLong;
    this.pluginList = paramMap;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDeviceID()
  {
    return this.deviceID;
  }
  
  public Map<String, PlugInInfo> getPluginList()
  {
    return this.pluginList;
  }
  
  public SparseArray<String> getRunningProcessSameUid()
  {
    return com.tencent.feedback.common.a.a(Process.myUid());
  }
  
  public long getServerTimeGap()
  {
    return this.serverTimeGap;
  }
  
  public int getTaskId()
  {
    return 1000;
  }
  
  public String getTaskName()
  {
    return "2000";
  }
  
  public String getUploadThreadsDump(Map<String, String[]> paramMap)
  {
    if ((paramMap != null) && (paramMap.size() > 0))
    {
      HashMap localHashMap1 = new HashMap();
      HashMap localHashMap2 = new HashMap();
      Object localObject1 = Pattern.compile("held by tid=\\d+");
      Iterator localIterator = paramMap.entrySet().iterator();
      Object localObject2;
      Object localObject3;
      while (localIterator.hasNext())
      {
        localObject2 = (Map.Entry)localIterator.next();
        localHashMap1.put(((String[])localObject2.getValue())[2], ((Map.Entry)localObject2).getKey());
        localObject3 = ((Pattern)localObject1).matcher(((String[])localObject2.getValue())[1]);
        if (((Matcher)localObject3).find())
        {
          localHashMap2.put(((String[])localObject2.getValue())[2], null);
          localObject2 = ((Matcher)localObject3).group();
          localHashMap2.put(((String)localObject2).substring(((String)localObject2).indexOf("=") + 1), null);
        }
        else if ("main".equals(((Map.Entry)localObject2).getKey()))
        {
          localHashMap2.put(((String[])localObject2.getValue())[2], null);
        }
      }
      if (localHashMap2.size() <= 0) {
        return null;
      }
      localObject1 = new StringBuffer();
      localIterator = localHashMap2.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        localHashMap2.put(localObject2, localHashMap1.get(localObject2));
        localObject3 = (String)localHashMap1.get(localObject2);
        String str1 = ((String[])paramMap.get(localObject3))[0];
        String str2 = ((String[])paramMap.get(localObject3))[1];
        ((StringBuffer)localObject1).append("\"" + (String)localObject3 + "\" tid=" + (String)localObject2 + " :\n" + str1 + "\n" + str2 + "\n");
      }
      return ((StringBuffer)localObject1).toString();
    }
    return null;
  }
  
  public String getUserId()
  {
    return this.userId;
  }
  
  public void handleANRInfo(Context paramContext, int paramInt, String paramString1, String paramString2, long paramLong)
  {
    if ((paramContext == null) || (paramInt <= 0) || (paramString1 == null)) {
      return;
    }
    a locala = new a();
    locala.a(paramString1);
    locala.a(paramLong);
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "unvisiable ANR";
    }
    locala.b(paramString1);
    handleANRInfo(paramContext, locala);
  }
  
  public void handleANRInfo(Context paramContext, a parama)
  {
    if ((paramContext == null) || (parama == null)) {
      return;
    }
    Object localObject1;
    if ((parama.a() == null) || ("/data/anr/traces.txt" == null)) {
      localObject1 = null;
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        localObject2 = getUploadThreadsDump(((com.tencent.feedback.eup.jni.c)localObject1).d);
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = "dump traces fail!";
        }
        parama.c((String)localObject1);
      }
      recordANR(paramContext, parama);
      return;
      Object localObject2 = new com.tencent.feedback.eup.jni.c();
      a.a("/data/anr/traces.txt", new c((com.tencent.feedback.eup.jni.c)localObject2, true));
      if ((((com.tencent.feedback.eup.jni.c)localObject2).a > 0L) && (((com.tencent.feedback.eup.jni.c)localObject2).c > 0L))
      {
        localObject1 = localObject2;
        if (((com.tencent.feedback.eup.jni.c)localObject2).b != null) {}
      }
      else
      {
        localObject1 = null;
      }
    }
  }
  
  public boolean isUseMerge()
  {
    return this.isUseMerge;
  }
  
  public com.tencent.feedback.eup.jni.c readTraceDumpInfo$37d8951a()
  {
    if ("/data/anr/traces.txt" == null)
    {
      com.tencent.feedback.common.e.d("path:%s", new Object[] { "/data/anr/traces.txt" });
      return null;
    }
    com.tencent.feedback.eup.jni.c localc = new com.tencent.feedback.eup.jni.c();
    a.a("/data/anr/traces.txt", new d(localc, false));
    if ((localc.a > 0L) && (localc.c > 0L) && (localc.b != null)) {
      return localc;
    }
    com.tencent.feedback.common.e.d("first dump error %s", new Object[] { localc.a + " " + localc.c + " " + localc.b });
    return null;
  }
  
  public void recordANR(Context paramContext, a parama)
  {
    CrashStrategyBean localCrashStrategyBean = new CrashStrategyBean();
    localCrashStrategyBean.setMerged(this.isUseMerge);
    parama = b.a(paramContext, this.userId, this.deviceID, this.serverTimeGap, this.pluginList, parama.a(), "main", "", "ANR_RQD_EXCEPTION", "", parama.e(), parama.b(), parama.d(), null);
    parama.e(true);
    boolean bool = com.tencent.feedback.eup.c.a(paramContext).a(parama, localCrashStrategyBean);
    com.tencent.feedback.common.e.b("sha1:%s %d", new Object[] { parama.q(), Integer.valueOf(parama.o()) });
    com.tencent.feedback.common.e.b("handle anr %b", new Object[] { Boolean.valueOf(bool) });
  }
  
  public void runInService(RQDService paramRQDService, Intent paramIntent)
  {
    if (CrashReport.getCrashRuntimeStrategy() == null)
    {
      com.tencent.feedback.common.e.b("rqdp{ init service eup}", new Object[0]);
      CrashReport.initCrashReport(paramRQDService.getApplicationContext(), false);
    }
    if (isHandling.get())
    {
      com.tencent.feedback.common.e.b("handling task already exist!", new Object[0]);
      return;
    }
    isHandling.set(true);
    SparseArray localSparseArray;
    long l;
    int i;
    try
    {
      localSparseArray = getRunningProcessSameUid();
      if ((localSparseArray == null) || (localSparseArray.size() <= 0))
      {
        com.tencent.feedback.common.e.d("impossible not pid in same app", new Object[0]);
        return;
      }
      Object localObject = readTraceDumpInfo$37d8951a();
      paramIntent = (Intent)localObject;
      if (localObject == null) {
        com.tencent.feedback.common.e.d("read dump info fail,try again ", new Object[0]);
      }
      try
      {
        Thread.sleep(1000L);
        paramIntent = readTraceDumpInfo$37d8951a();
        if (paramIntent == null)
        {
          com.tencent.feedback.common.e.d("read dump info fail again ,let it go", new Object[0]);
          return;
        }
      }
      catch (InterruptedException paramIntent)
      {
        for (;;)
        {
          paramIntent.printStackTrace();
        }
      }
      com.tencent.feedback.common.e.b("not my anr ignorl ,leave", new Object[0]);
    }
    catch (Throwable paramRQDService)
    {
      com.tencent.feedback.common.e.d("task throw upload by catch", new Object[0]);
      CrashReport.handleCatchException(Thread.currentThread(), paramRQDService, null, null);
      paramRQDService.printStackTrace();
      return;
      try
      {
        if ((lastHandledANRFirstDump$2e178719 != null) && (lastHandledANRFirstDump$2e178719.a == paramIntent.a) && (lastHandledANRFirstDump$2e178719.b.equals(paramIntent.b)) && (lastHandledANRFirstDump$2e178719.c == paramIntent.c))
        {
          com.tencent.feedback.common.e.b("same trace file same anr ,has handled! %s %d", new Object[] { lastHandledANRFirstDump$2e178719.b, Long.valueOf(lastHandledANRFirstDump$2e178719.c) });
          return;
        }
        lastHandledANRFirstDump$2e178719 = paramIntent;
        l = paramIntent.c;
        paramIntent = waitForANRProcessErrorSate(paramRQDService);
        if ((paramIntent == null) || (paramIntent.size() <= 0)) {
          break label421;
        }
        i = Process.myUid();
        paramIntent = paramIntent.iterator();
        while (paramIntent.hasNext())
        {
          localObject = (a)paramIntent.next();
          if (i == ((a)localObject).c())
          {
            com.tencent.feedback.common.e.b("has anr in process %s handle it and leave", new Object[] { ((a)localObject).a() });
            ((a)localObject).a(l);
            handleANRInfo(paramRQDService, (a)localObject);
            return;
          }
        }
      }
      finally {}
    }
    finally
    {
      isHandling.set(false);
    }
    isHandling.set(false);
    return;
    try
    {
      label421:
      Thread.sleep(500L);
      paramIntent = getRunningProcessSameUid();
      if ((paramIntent == null) || (paramIntent.size() <= 0))
      {
        com.tencent.feedback.common.e.d("impossible not pid in same app", new Object[0]);
        isHandling.set(false);
        return;
      }
    }
    catch (InterruptedException paramIntent)
    {
      for (;;)
      {
        paramIntent.printStackTrace();
      }
    }
    for (;;)
    {
      if (i < localSparseArray.size())
      {
        int j = localSparseArray.keyAt(i);
        if (paramIntent.get(j) == null)
        {
          paramIntent = (String)localSparseArray.get(j);
          com.tencent.feedback.common.e.b("found process been kill pid:%d pn:%s , it should be anr proc ,handle it and leave", new Object[] { Integer.valueOf(j), paramIntent });
          handleANRInfo(paramRQDService, j, paramIntent, null, l);
          isHandling.set(false);
          return;
        }
        i += 1;
      }
      else
      {
        isHandling.set(false);
        return;
        i = 0;
      }
    }
  }
  
  public List<a> waitForANRProcessErrorSate(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    int i = 0;
    for (;;)
    {
      int j = i + 1;
      if (i >= 20L) {
        break;
      }
      paramContext = localActivityManager.getProcessesInErrorState();
      if (paramContext != null)
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = paramContext.iterator();
        while (localIterator.hasNext())
        {
          ActivityManager.ProcessErrorStateInfo localProcessErrorStateInfo = (ActivityManager.ProcessErrorStateInfo)localIterator.next();
          if (localProcessErrorStateInfo.condition == 2)
          {
            com.tencent.feedback.common.e.b("anr error found in %s \n lMsg:%s\n sMsg:%s", new Object[] { localProcessErrorStateInfo.processName, localProcessErrorStateInfo.longMsg, localProcessErrorStateInfo.shortMsg });
            if ((localProcessErrorStateInfo == null) || (localProcessErrorStateInfo.condition != 2)) {
              paramContext = null;
            }
            for (;;)
            {
              localArrayList.add(paramContext);
              break;
              paramContext = new a();
              paramContext.a(localProcessErrorStateInfo.processName);
              i = localProcessErrorStateInfo.pid;
              paramContext.b(localProcessErrorStateInfo.longMsg);
              paramContext.a(localProcessErrorStateInfo.uid);
            }
          }
        }
        if (localArrayList.size() > 0) {
          return localArrayList;
        }
      }
      try
      {
        Thread.sleep(500L);
        i = j;
      }
      catch (InterruptedException paramContext)
      {
        paramContext.printStackTrace();
        i = j;
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.isUseMerge) {}
    for (paramInt = 1;; paramInt = -1)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.userId);
      paramParcel.writeString(this.deviceID);
      paramParcel.writeLong(this.serverTimeGap);
      if ((this.pluginList == null) || (this.pluginList.size() <= 0)) {
        break;
      }
      paramParcel.writeInt(this.pluginList.size());
      Iterator localIterator = this.pluginList.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramParcel.writeParcelable((Parcelable)this.pluginList.get(str), 0);
      }
    }
    paramParcel.writeInt(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\anr\ANRHandleServiceTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */