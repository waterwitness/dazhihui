package com.tencent.qalsdk.service;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.tencent.qalsdk.base.remote.IBaseService.Stub;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.util.QLog;
import java.util.HashSet;
import qalsdk.ah;

public class QalService
  extends Service
{
  public static String appChannel = null;
  public static String appVersion;
  public static Context context;
  public static j core = ;
  public static volatile boolean inited = false;
  static HashSet<Integer> invalidUids;
  static d msfServiceReqHandler = new d();
  static f msfServiceRespHandler;
  static HashSet<Integer> passedUids = new HashSet();
  private static String proccessName = null;
  public static volatile boolean sIsCreatedByAutoBoot = false;
  public static final String tag = "QalService";
  private IBaseService.Stub binder = new i(this);
  private QalService.a mConnection = null;
  
  static
  {
    invalidUids = new HashSet();
    sIsCreatedByAutoBoot = false;
    appVersion = null;
  }
  
  public static j getCore()
  {
    return core;
  }
  
  public static String getProccessName()
  {
    return proccessName;
  }
  
  public static boolean isSamePackage(Context paramContext, int paramInt, String paramString)
  {
    boolean bool2 = true;
    boolean bool1;
    if (invalidUids.contains(Integer.valueOf(paramInt)))
    {
      if (QLog.isColorLevel()) {
        QLog.d("QalService", 2, "found invalid uid call " + paramInt);
      }
      bool1 = false;
    }
    do
    {
      return bool1;
      bool1 = bool2;
    } while (passedUids.contains(Integer.valueOf(paramInt)));
    String[] arrayOfString = paramContext.getPackageManager().getPackagesForUid(paramInt);
    paramContext = paramContext.getPackageName();
    int j = arrayOfString.length;
    int i = 0;
    label91:
    if (i < j) {
      if (arrayOfString[i].equals(paramContext))
      {
        if (QLog.isColorLevel()) {
          QLog.d("QalService", 2, "found accountSyncRequest from the same packeName application,");
        }
        passedUids.add(Integer.valueOf(paramInt));
      }
    }
    for (i = 0;; i = 1)
    {
      bool1 = bool2;
      if (i == 0) {
        break;
      }
      invalidUids.add(Integer.valueOf(paramInt));
      paramContext = "";
      paramString = paramContext;
      if (arrayOfString != null)
      {
        i = arrayOfString.length;
        paramInt = 0;
        for (;;)
        {
          paramString = paramContext;
          if (paramInt >= i) {
            break;
          }
          paramString = arrayOfString[paramInt];
          paramContext = paramContext + " " + paramString + ";";
          paramInt += 1;
        }
        i += 1;
        break label91;
      }
      if (QLog.isColorLevel()) {
        QLog.d("QalService", 2, "found invalid uid call " + paramString);
      }
      return false;
    }
  }
  
  public static void serviceInit(Context paramContext, boolean paramBoolean)
  {
    try
    {
      if (!inited)
      {
        QLog.d("QalService", "service init");
        proccessName = MsfSdkUtils.getProcessName(paramContext);
        QLog.init(paramContext);
        core.a(paramContext, paramBoolean);
        c.a(paramContext, core);
        msfServiceRespHandler = new f(core);
        msfServiceRespHandler.setName("MsfServiceRespHandler");
        msfServiceRespHandler.start();
        inited = true;
      }
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private void startForegroundCompat()
  {
    try
    {
      if (Build.VERSION.SDK_INT < 18)
      {
        startForeground(537046243, new Notification());
        return;
      }
      if (this.mConnection == null) {
        this.mConnection = new QalService.a(this, null);
      }
      bindService(new Intent(this, QalAssistService.class), this.mConnection, 1);
      return;
    }
    catch (Exception localException)
    {
      QLog.e("QalService", localException.getMessage());
    }
  }
  
  private void stopForegroundCompat()
  {
    try
    {
      if (Build.VERSION.SDK_INT < 18) {
        stopForeground(true);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    Object localObject = null;
    try
    {
      paramIntent = paramIntent.getStringExtra("to_SenderProcessName");
      QLog.d("QalService", 1, "service onBind by :" + paramIntent);
      if (ah.t()) {
        ah.a(false);
      }
      return this.binder;
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        paramIntent.printStackTrace();
        paramIntent = (Intent)localObject;
      }
    }
  }
  
  public void onCreate()
  {
    super.onCreate();
    context = this;
    QLog.d("QalService", 1, "serivce onCreate");
    serviceInit(this, sIsCreatedByAutoBoot);
    if (QLog.isColorLevel()) {
      QLog.d("QalService", 2, "serivce onCreate... autoBoot[" + sIsCreatedByAutoBoot + "]");
    }
    sIsCreatedByAutoBoot = false;
    startForegroundCompat();
  }
  
  public void onDestroy()
  {
    try
    {
      QLog.i("QalService", "service onDestroy");
      context.unregisterReceiver(j.a().p);
      stopForegroundCompat();
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        QLog.d("QalService", 1, "unregisterReceiver failed. " + localException, localException);
      }
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    QLog.d("QalService", 1, "serivce onStart");
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("to_SenderProcessName");
    QLog.d("QalService", 2, "serivce onUnbind by :" + str);
    return super.onUnbind(paramIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\service\QalService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */