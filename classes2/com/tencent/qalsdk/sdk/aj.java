package com.tencent.qalsdk.sdk;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.RemoteException;
import android.text.format.Formatter;
import com.tencent.qalsdk.QALSDKManager;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IBaseActionListener;
import com.tencent.qalsdk.base.remote.IBaseService;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.k;
import com.tencent.qalsdk.util.QLog;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class aj
{
  private static final String a = "MSF.D.RemoteServiceProxy";
  private static int b = 0;
  private static long c = -1L;
  protected static ConcurrentLinkedQueue<ToServiceMsg> f = new ConcurrentLinkedQueue();
  protected static ConcurrentHashMap<Integer, ToServiceMsg> g = new ConcurrentHashMap();
  static final String m = "appTimeoutReq";
  private static boolean p = false;
  protected volatile IBaseService d;
  protected Object e = new Object();
  protected volatile Handler h;
  protected volatile long i = -1L;
  protected volatile long j = -1L;
  protected volatile int k = -1;
  AtomicInteger l = new AtomicInteger();
  String n;
  protected ServiceConnection o = new ak(this);
  
  public aj(String paramString)
  {
    this.n = paramString;
  }
  
  private void a(SharedPreferences.Editor paramEditor)
  {
    paramEditor.putString("availMem", e());
    paramEditor.putString("lowMem", f());
    paramEditor.putString("time", new Date().toString());
    paramEditor.putString("process", k());
    paramEditor.putString("state", j());
  }
  
  private String e()
  {
    try
    {
      Object localObject = (ActivityManager)QALSDKManager.getInstance().getContext().getSystemService("activity");
      ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
      ((ActivityManager)localObject).getMemoryInfo(localMemoryInfo);
      QLog.d("MSF.D.RemoteServiceProxy", 1, "Property get avail memory:" + localMemoryInfo.availMem);
      localObject = Formatter.formatFileSize(QALSDKManager.getInstance().getContext(), localMemoryInfo.availMem);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      QLog.d("MSF.D.RemoteServiceProxy", 1, "failed to get avail memory");
    }
    return null;
  }
  
  private String f()
  {
    try
    {
      ActivityManager localActivityManager = (ActivityManager)QALSDKManager.getInstance().getContext().getSystemService("activity");
      ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
      localActivityManager.getMemoryInfo(localMemoryInfo);
      QLog.d("MSF.D.RemoteServiceProxy", 1, "Property get low memory feature:" + localMemoryInfo.lowMemory);
      boolean bool = localMemoryInfo.lowMemory;
      return String.valueOf(bool);
    }
    catch (Exception localException)
    {
      QLog.d("MSF.D.RemoteServiceProxy", 1, "failed to get low memory feature");
    }
    return null;
  }
  
  private String j()
  {
    boolean bool = false;
    for (;;)
    {
      try
      {
        Iterator localIterator = ((ActivityManager)QALSDKManager.getInstance().getContext().getSystemService("activity")).getRunningServices(256).iterator();
        Object localObject1 = null;
        int i1 = 0;
        Object localObject2;
        if (localIterator.hasNext())
        {
          localObject2 = (ActivityManager.RunningServiceInfo)localIterator.next();
          if (((ActivityManager.RunningServiceInfo)localObject2).process.trim().equals("com.tencent.mobileqq:MSF"))
          {
            bool = true;
            localObject1 = localObject2;
          }
        }
        else
        {
          QLog.d("MSF.D.RemoteServiceProxy", 1, "isMsfAlive:" + bool + ", cur service process count:" + i1);
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("countService_").append(i1).append(":");
          if ((bool) && (localObject1 != null))
          {
            ((StringBuilder)localObject2).append("alive_").append(bool).append(":");
            ((StringBuilder)localObject2).append("activeSince_").append(((ActivityManager.RunningServiceInfo)localObject1).activeSince).append(":");
            ((StringBuilder)localObject2).append("clientCount_").append(((ActivityManager.RunningServiceInfo)localObject1).clientCount).append(":");
            ((StringBuilder)localObject2).append("clientLabel_").append(((ActivityManager.RunningServiceInfo)localObject1).clientLabel).append(":");
            ((StringBuilder)localObject2).append("clientPkg_").append(((ActivityManager.RunningServiceInfo)localObject1).clientPackage).append(":");
            ((StringBuilder)localObject2).append("crashCount_").append(((ActivityManager.RunningServiceInfo)localObject1).crashCount).append(":");
            ((StringBuilder)localObject2).append("flags_").append(((ActivityManager.RunningServiceInfo)localObject1).flags).append(":");
            ((StringBuilder)localObject2).append("foreground_").append(((ActivityManager.RunningServiceInfo)localObject1).foreground).append(":");
            ((StringBuilder)localObject2).append("lastActivityTime_").append(((ActivityManager.RunningServiceInfo)localObject1).lastActivityTime).append(":");
            ((StringBuilder)localObject2).append("pid_").append(((ActivityManager.RunningServiceInfo)localObject1).pid).append(":");
            ((StringBuilder)localObject2).append("process_").append(((ActivityManager.RunningServiceInfo)localObject1).process).append(":");
            ((StringBuilder)localObject2).append("restarting_").append(((ActivityManager.RunningServiceInfo)localObject1).restarting).append(":");
            ((StringBuilder)localObject2).append("started_").append(((ActivityManager.RunningServiceInfo)localObject1).started).append(":");
            ((StringBuilder)localObject2).append("uid_").append(((ActivityManager.RunningServiceInfo)localObject1).uid);
            return ((StringBuilder)localObject2).toString();
          }
          ((StringBuilder)localObject2).append("alive_").append(bool);
          continue;
        }
        i1 += 1;
      }
      catch (Exception localException)
      {
        QLog.d("MSF.D.RemoteServiceProxy", 1, "failed to getServiceState");
        return null;
      }
    }
  }
  
  private String k()
  {
    try
    {
      int i1 = Process.myPid();
      Object localObject = ((ActivityManager)QALSDKManager.getInstance().getContext().getSystemService("activity")).getRunningAppProcesses().iterator();
      while (((Iterator)localObject).hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
        if (localRunningAppProcessInfo.pid == i1)
        {
          localObject = localRunningAppProcessInfo.processName;
          return (String)localObject;
        }
      }
    }
    catch (Exception localException)
    {
      QLog.d("MSF.D.RemoteServiceProxy", 1, "failed to get current process name");
    }
    return null;
  }
  
  private void l()
  {
    b = 0;
    this.j = -1L;
    c = -1L;
    p = false;
  }
  
  protected int a(ToServiceMsg paramToServiceMsg)
  {
    return this.d.sendToServiceMsg(paramToServiceMsg);
  }
  
  protected FromServiceMsg a(ToServiceMsg paramToServiceMsg, String paramString)
  {
    paramToServiceMsg = k.a(paramToServiceMsg);
    paramToServiceMsg.setBusinessFail(1013, paramString);
    return paramToServiceMsg;
  }
  
  void a()
  {
    try
    {
      ComponentName localComponentName = new ComponentName(QALSDKManager.getInstance().getContext().getPackageName(), this.n);
      Intent localIntent = new Intent();
      localIntent.setComponent(localComponentName);
      QALSDKManager.getInstance().getContext().startService(localIntent);
      if (QLog.isColorLevel()) {
        QLog.d("MSF.D.RemoteServiceProxy", 2, " start service finish");
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  protected void a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    c(paramToServiceMsg, paramFromServiceMsg);
  }
  
  /* Error */
  boolean b()
  {
    // Byte code:
    //   0: new 344	android/content/ComponentName
    //   3: dup
    //   4: invokestatic 129	com/tencent/qalsdk/QALSDKManager:getInstance	()Lcom/tencent/qalsdk/QALSDKManager;
    //   7: invokevirtual 133	com/tencent/qalsdk/QALSDKManager:getContext	()Landroid/content/Context;
    //   10: invokevirtual 347	android/content/Context:getPackageName	()Ljava/lang/String;
    //   13: aload_0
    //   14: getfield 87	com/tencent/qalsdk/sdk/aj:n	Ljava/lang/String;
    //   17: invokespecial 350	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: astore_1
    //   21: new 352	android/content/Intent
    //   24: dup
    //   25: invokespecial 353	android/content/Intent:<init>	()V
    //   28: astore_2
    //   29: aload_2
    //   30: aload_1
    //   31: invokevirtual 357	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   34: pop
    //   35: invokestatic 129	com/tencent/qalsdk/QALSDKManager:getInstance	()Lcom/tencent/qalsdk/QALSDKManager;
    //   38: invokevirtual 133	com/tencent/qalsdk/QALSDKManager:getContext	()Landroid/content/Context;
    //   41: aload_2
    //   42: aload_0
    //   43: getfield 85	com/tencent/qalsdk/sdk/aj:o	Landroid/content/ServiceConnection;
    //   46: iconst_1
    //   47: invokevirtual 376	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   50: istore_3
    //   51: invokestatic 364	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   54: ifeq +42 -> 96
    //   57: ldc 8
    //   59: iconst_2
    //   60: new 152	java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   67: ldc_w 378
    //   70: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: aload_0
    //   74: getfield 87	com/tencent/qalsdk/sdk/aj:n	Ljava/lang/String;
    //   77: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: ldc_w 380
    //   83: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: iload_3
    //   87: invokevirtual 186	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   90: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokestatic 170	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   96: iload_3
    //   97: ireturn
    //   98: astore_1
    //   99: iconst_0
    //   100: istore_3
    //   101: aload_1
    //   102: invokevirtual 369	java/lang/Exception:printStackTrace	()V
    //   105: iload_3
    //   106: ireturn
    //   107: astore_1
    //   108: goto -7 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	aj
    //   20	11	1	localComponentName	ComponentName
    //   98	4	1	localException1	Exception
    //   107	1	1	localException2	Exception
    //   28	14	2	localIntent	Intent
    //   50	56	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	51	98	java/lang/Exception
    //   51	96	107	java/lang/Exception
  }
  
  public int c(ToServiceMsg paramToServiceMsg)
  {
    int i1 = 1;
    if (paramToServiceMsg == null) {}
    for (;;)
    {
      return -1;
      if (paramToServiceMsg.getAppSeq() < 0) {
        paramToServiceMsg.setAppSeq(MsfSdkUtils.getNextAppSeq());
      }
      try
      {
        synchronized (this.e)
        {
          if (this.h == null)
          {
            HandlerThread localHandlerThread = new HandlerThread("Timeout-Checker", 5);
            localHandlerThread.start();
            this.h = new Handler(localHandlerThread.getLooper());
          }
          if (h())
          {
            if (paramToServiceMsg.getTimeout() == -1L) {
              paramToServiceMsg.setTimeout(15000L);
            }
            if (paramToServiceMsg.isNeedCallback())
            {
              paramToServiceMsg.addAttribute("appTimeoutReq", Integer.valueOf(this.l.incrementAndGet()));
              g.put(Integer.valueOf(paramToServiceMsg.getAppSeq()), paramToServiceMsg);
              ??? = new aj.a(this, paramToServiceMsg);
              if (("LongConn.OffPicUp".equalsIgnoreCase(paramToServiceMsg.getServiceCmd())) || ("ImgStore.GroupPicUp".equalsIgnoreCase(paramToServiceMsg.getServiceCmd())))
              {
                this.h.postDelayed((Runnable)???, paramToServiceMsg.getTimeout() + 20000L);
                QLog.d("MSF.D.RemoteServiceProxy", 1, "PicUpMsg timer start, appSeq: " + paramToServiceMsg.getAppSeq() + ", delayMillis: " + String.valueOf(paramToServiceMsg.getTimeout() + 20000L));
              }
            }
            else
            {
              if (i1 == 0) {
                break label419;
              }
              if (b > 0)
              {
                long l1 = System.currentTimeMillis();
                if ((-1L != c) && (l1 < c + 120000L))
                {
                  ??? = k();
                  ??? = QALSDKManager.getInstance().getContext().getSharedPreferences("pull_msf_succ" + (String)???, 0).edit();
                  ((SharedPreferences.Editor)???).putString("uin", paramToServiceMsg.getUin());
                  a((SharedPreferences.Editor)???);
                  ((SharedPreferences.Editor)???).commit();
                  QLog.d("MSF.D.RemoteServiceProxy", 1, "succ to pull msf service.");
                }
                l();
              }
              i1 = a(paramToServiceMsg);
              return i1;
            }
          }
          else
          {
            i1 = 0;
          }
        }
      }
      catch (DeadObjectException localDeadObjectException)
      {
        for (;;)
        {
          d(paramToServiceMsg);
          return -1;
          this.h.postDelayed(localDeadObjectException, paramToServiceMsg.getTimeout() + 2000L);
        }
      }
      catch (Exception localException)
      {
        if (this.d == null)
        {
          d(paramToServiceMsg);
          return -1;
          label419:
          d(paramToServiceMsg);
          synchronized (this.e)
          {
            i();
            if ((b <= 10) || (System.currentTimeMillis() <= c + 60000L) || (p)) {
              continue;
            }
            ??? = k();
            ??? = QALSDKManager.getInstance().getContext().getSharedPreferences("pull_msf" + (String)???, 0).edit();
            ((SharedPreferences.Editor)???).putString("uin", paramToServiceMsg.getUin());
            a((SharedPreferences.Editor)???);
            ((SharedPreferences.Editor)???).commit();
            QLog.d("MSF.D.RemoteServiceProxy", 1, "cannot pull msf service.");
            p = true;
            return -1;
          }
        }
        ((Exception)???).printStackTrace();
      }
    }
    return -1;
  }
  
  protected void c(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    try
    {
      if (paramToServiceMsg.getActionListener() != null) {
        paramToServiceMsg.getActionListener().onRecvFromMsg(paramFromServiceMsg);
      }
      return;
    }
    catch (RemoteException paramToServiceMsg)
    {
      paramToServiceMsg.printStackTrace();
    }
  }
  
  public boolean c()
  {
    try
    {
      ComponentName localComponentName = new ComponentName(QALSDKManager.getInstance().getContext(), this.n);
      Intent localIntent = new Intent();
      localIntent.setComponent(localComponentName);
      boolean bool = QALSDKManager.getInstance().getContext().stopService(localIntent);
      if (QLog.isColorLevel()) {
        QLog.d("MSF.D.RemoteServiceProxy", 2, " stopService " + this.n + " service finished " + bool);
      }
      return bool;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  protected void d()
  {
    al localal = new al(this);
    localal.setName("handleWaitSendProxyMsgThread");
    localal.start();
  }
  
  protected void d(ToServiceMsg paramToServiceMsg)
  {
    f.add(paramToServiceMsg);
  }
  
  public void g()
  {
    try
    {
      QALSDKManager.getInstance().getContext().unbindService(this.o);
      this.d = null;
      QLog.i("MSF.D.RemoteServiceProxy", " unbindService service finished");
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  protected boolean h()
  {
    return this.d != null;
  }
  
  public void i()
  {
    long l1 = System.currentTimeMillis();
    if ((this.i == -1L) || (l1 - this.i > 10000L))
    {
      this.i = l1;
      a();
      b();
    }
    do
    {
      long l2;
      do
      {
        for (;;)
        {
          return;
          QLog.d("MSF.D.RemoteServiceProxy", 1, "wait start " + this.n + " service result, skiped...");
          try
          {
            int i1 = Build.VERSION.SDK_INT;
            if (i1 >= 21)
            {
              QLog.d("MSF.D.RemoteServiceProxy", 1, "sdk version:" + i1);
              l2 = l1 - this.j;
              if ((this.j == -1L) || (l2 > 10000L))
              {
                if (b == 0) {
                  c = l1;
                }
                b += 1;
                this.j = l1;
                if (b % 3 == 2)
                {
                  c();
                  g();
                }
                QALSDKManager.getInstance().getContext().sendBroadcast(new Intent("com.tencent.mobileqq.msf.startmsf"));
                this.k = 1;
                QLog.d("MSF.D.RemoteServiceProxy", 1, "start MsfService through Broadcast");
              }
              if ((this.j == -1L) || (l2 <= this.k * 2000)) {
                continue;
              }
              b();
              this.k += 1;
              QLog.d("MSF.D.RemoteServiceProxy", 1, "delay binding MSF Service");
            }
          }
          catch (Exception localException)
          {
            QLog.d("MSF.D.RemoteServiceProxy", 1, "start MsfService exception " + localException.toString());
            return;
          }
        }
        l2 = this.j;
      } while ((this.j != -1L) && (l1 - l2 <= 10000L));
      if (b == 0) {
        c = l1;
      }
      b += 1;
      this.j = l1;
    } while (b % 3 != 2);
    c();
    g();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */