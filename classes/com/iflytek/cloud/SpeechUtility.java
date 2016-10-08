package com.iflytek.cloud;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.iflytek.common.a;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import com.iflytek.speech.SpeechComponent;
import com.iflytek.speech.UtilityConfig;
import com.iflytek.thirdparty.A;
import com.iflytek.thirdparty.B;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.Z;
import com.iflytek.thirdparty.aQ;
import com.iflytek.thirdparty.aa;
import com.iflytek.thirdparty.y;
import com.iflytek.thirdparty.y.a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class SpeechUtility
  extends y
{
  public static final y.a DEF_ENGINE_MODE = y.a.c;
  public static final String TAG_RESOURCE_CONTENT = "tag_rescontent";
  public static final String TAG_RESOURCE_RESULT = "result";
  public static final String TAG_RESOURCE_RET = "ret";
  private static SpeechUtility c = null;
  protected y.a a = DEF_ENGINE_MODE;
  private ArrayList<SpeechComponent> d = new ArrayList();
  private int e = -1;
  private Context f = null;
  private boolean g = false;
  private SpeechUtility.a h = null;
  
  private SpeechUtility(Context paramContext, String paramString)
  {
    this.f = paramContext.getApplicationContext();
    super.setParameter("params", paramString);
    MSC.loadLibrary(this.b.b("lib_name", "msc"));
    X.a();
    setParameter("params", paramString);
    if (!MSC.isIflyVersion()) {
      this.a = y.a.a;
    }
    paramString = getParameter("engine_mode");
    if ("msc".equals(paramString)) {
      this.a = y.a.a;
    }
    for (;;)
    {
      int i = b();
      if (i == 0) {
        break;
      }
      throw new SpeechError(i);
      if ("plus".equals(paramString)) {
        this.a = y.a.b;
      }
    }
    d();
    e();
    paramString = Z.a(paramContext);
    paramString.a();
    paramString.b();
    try
    {
      a.a(paramContext, "appid", this.b.e("appid"));
      a.a(paramContext);
      a.a(false);
      paramString = getParameter("lxy_tp_dc");
      if ((!TextUtils.isEmpty(paramString)) && ("false".equals(paramString)))
      {
        X.a("DC init enable=" + paramString);
        aQ.a(paramContext, getParameter("appid"), bool);
        return;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        X.a(paramString);
        continue;
        bool = true;
      }
    }
  }
  
  private void a(String paramString)
  {
    label7:
    Object localObject1;
    if (TextUtils.isEmpty(paramString))
    {
      return;
    }
    else
    {
      do
      {
        localObject1 = this.f.getPackageManager();
        paramString = new Intent(paramString);
        paramString.setPackage("com.iflytek.vflynote");
        paramString = ((PackageManager)localObject1).queryIntentServices(paramString, 224);
      } while ((paramString == null) || (paramString.size() <= 0));
      paramString = paramString.iterator();
    }
    for (;;)
    {
      if (!paramString.hasNext()) {
        break label7;
      }
      Object localObject2 = (ResolveInfo)paramString.next();
      localObject1 = b(((ResolveInfo)localObject2).serviceInfo.packageName);
      if (localObject1 == null) {
        break;
      }
      try
      {
        localObject2 = ((ResolveInfo)localObject2).serviceInfo.metaData.getString("enginetype").split(",");
        int j = localObject2.length;
        int i = 0;
        while (i < j)
        {
          ((SpeechComponent)localObject1).addEngine(localObject2[i]);
          i += 1;
        }
      }
      catch (Exception localException)
      {
        X.a(localException);
      }
    }
  }
  
  private static boolean a(Context paramContext)
  {
    try
    {
      int i = Process.myPid();
      Object localObject = (ActivityManager)paramContext.getSystemService("activity");
      if (localObject != null)
      {
        localObject = ((ActivityManager)localObject).getRunningAppProcesses().iterator();
        while (((Iterator)localObject).hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
          if (localRunningAppProcessInfo.pid == i)
          {
            X.a("process name:" + localRunningAppProcessInfo.processName);
            if (paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 0).packageName.equals(localRunningAppProcessInfo.processName))
            {
              X.a("process name:" + localRunningAppProcessInfo.processName + "is own process");
              return true;
            }
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      X.a(paramContext);
    }
    return false;
  }
  
  private int b()
  {
    if (!MSC.isLoaded()) {
      return 21002;
    }
    X.a("SpeechUtility start login");
    SpeechError localSpeechError = new B(this.f, this.b).a(this.b.e("usr"), this.b.e("pwd"));
    if (localSpeechError == null) {
      return 0;
    }
    return localSpeechError.getErrorCode();
  }
  
  private SpeechComponent b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    Iterator localIterator = this.d.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (!paramString.equals(((SpeechComponent)localIterator.next()).getPackageName()));
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        paramString = new SpeechComponent(paramString);
        this.d.add(paramString);
      }
      for (;;)
      {
        return paramString;
        paramString = null;
      }
    }
  }
  
  private boolean c()
  {
    boolean bool;
    if (!MSC.isLoaded()) {
      bool = false;
    }
    do
    {
      return bool;
      bool = true;
    } while (!MSC.isLoaded());
    return A.a();
  }
  
  private boolean c(String paramString)
  {
    PackageManager localPackageManager = this.f.getPackageManager();
    paramString = new Intent(paramString);
    paramString.setPackage("com.iflytek.vflynote");
    return localPackageManager.queryIntentActivities(paramString, 1).size() > 0;
  }
  
  /* Error */
  public static SpeechUtility createUtility(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 34	com/iflytek/cloud/SpeechUtility:c	Lcom/iflytek/cloud/SpeechUtility;
    //   6: ifnonnull +47 -> 53
    //   9: new 84	com/iflytek/thirdparty/aa
    //   12: dup
    //   13: invokespecial 338	com/iflytek/thirdparty/aa:<init>	()V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_1
    //   19: invokevirtual 340	com/iflytek/thirdparty/aa:b	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc_w 342
    //   26: iconst_0
    //   27: invokevirtual 345	com/iflytek/thirdparty/aa:a	(Ljava/lang/String;Z)Z
    //   30: ifne +32 -> 62
    //   33: aload_0
    //   34: invokevirtual 68	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   37: invokestatic 347	com/iflytek/cloud/SpeechUtility:a	(Landroid/content/Context;)Z
    //   40: ifne +22 -> 62
    //   43: ldc_w 349
    //   46: invokestatic 350	com/iflytek/thirdparty/X:b	(Ljava/lang/String;)V
    //   49: aconst_null
    //   50: putstatic 34	com/iflytek/cloud/SpeechUtility:c	Lcom/iflytek/cloud/SpeechUtility;
    //   53: getstatic 34	com/iflytek/cloud/SpeechUtility:c	Lcom/iflytek/cloud/SpeechUtility;
    //   56: astore_0
    //   57: ldc 2
    //   59: monitorexit
    //   60: aload_0
    //   61: areturn
    //   62: new 2	com/iflytek/cloud/SpeechUtility
    //   65: dup
    //   66: aload_0
    //   67: aload_1
    //   68: invokespecial 352	com/iflytek/cloud/SpeechUtility:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   71: putstatic 34	com/iflytek/cloud/SpeechUtility:c	Lcom/iflytek/cloud/SpeechUtility;
    //   74: goto -21 -> 53
    //   77: astore_0
    //   78: ldc_w 354
    //   81: invokestatic 350	com/iflytek/thirdparty/X:b	(Ljava/lang/String;)V
    //   84: aload_0
    //   85: invokestatic 188	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
    //   88: goto -35 -> 53
    //   91: astore_0
    //   92: ldc 2
    //   94: monitorexit
    //   95: aload_0
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	paramContext	Context
    //   0	97	1	paramString	String
    //   16	7	2	localaa	aa
    // Exception table:
    //   from	to	target	type
    //   62	74	77	com/iflytek/cloud/SpeechError
    //   3	53	91	finally
    //   53	57	91	finally
    //   62	74	91	finally
    //   78	88	91	finally
  }
  
  private void d()
  {
    if (checkServiceInstalled())
    {
      a("com.iflytek.vflynote.recognize");
      a("com.iflytek.vflynote.synthesize");
      a("com.iflytek.vflynote.speechunderstand");
      a("com.iflytek.vflynote.textunderstand");
      a("com.iflytek.vflynote.wakeup");
    }
  }
  
  private void e()
  {
    this.h = new SpeechUtility.a(this, null);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.PACKAGE_ADDED");
    localIntentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
    localIntentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
    localIntentFilter.addDataScheme("package");
    this.f.registerReceiver(this.h, localIntentFilter);
  }
  
  public static SpeechUtility getUtility()
  {
    try
    {
      SpeechUtility localSpeechUtility = c;
      return localSpeechUtility;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected boolean a()
  {
    boolean bool = false;
    try
    {
      PackageInfo localPackageInfo = this.f.getPackageManager().getPackageInfo("com.iflytek.vflynote", 0);
      if (localPackageInfo != null) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public boolean checkServiceInstalled()
  {
    bool1 = false;
    bool2 = false;
    boolean bool3 = false;
    j = -1;
    try
    {
      PackageInfo localPackageInfo = this.f.getPackageManager().getPackageInfo("com.iflytek.vflynote", 0);
      i = j;
      bool1 = bool3;
      if (localPackageInfo != null)
      {
        bool1 = true;
        bool2 = true;
        bool3 = true;
        i = localPackageInfo.versionCode;
        bool1 = bool3;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        i = j;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        int i = j;
        bool1 = bool2;
      }
    }
    if ((bool1 != this.g) || (this.e != i))
    {
      this.g = bool1;
      this.e = i;
      if (SpeechRecognizer.getRecognizer() != null) {
        SpeechRecognizer.getRecognizer().a(this.f);
      }
      if (SpeechSynthesizer.getSynthesizer() != null) {
        SpeechSynthesizer.getSynthesizer().a(this.f);
      }
      if (SpeechUnderstander.getUnderstander() != null) {
        SpeechUnderstander.getUnderstander().a(this.f);
      }
      if (TextUnderstander.getTextUnderstander() != null) {
        TextUnderstander.getTextUnderstander().a(this.f);
      }
    }
    return bool1;
  }
  
  public boolean destroy()
  {
    boolean bool = true;
    if (c != null) {
      bool = c();
    }
    if (this.h != null)
    {
      this.f.unregisterReceiver(this.h);
      this.h = null;
    }
    if (bool)
    {
      c = null;
      X.a(" SpeechUtility destory success,mInstance=null");
    }
    aQ.a();
    return bool;
  }
  
  public String getComponentUrl()
  {
    StringBuffer localStringBuffer = new StringBuffer("http://iss.openspeech.cn/v?");
    UtilityConfig.appendHttpParam(localStringBuffer, "key", URLEncoder.encode(Base64.encodeToString(UtilityConfig.getComponentUrlParam(this.f).getBytes(), 0)));
    UtilityConfig.appendHttpParam(localStringBuffer, "version", "2.0");
    return localStringBuffer.toString();
  }
  
  public y.a getEngineMode()
  {
    return this.a;
  }
  
  public String getParameter(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return null;
      if (this.b.g(paramString)) {
        return super.getParameter(paramString);
      }
      if ((paramString.equals("tts")) || (paramString.equals("asr")) || (paramString.equals("all")) || (paramString.equals("ivw"))) {
        try
        {
          paramString = getPlusLocalInfo(paramString);
          return paramString;
        }
        catch (Exception paramString)
        {
          return "{ret:20004}";
        }
      }
      if (MSC.isLoaded()) {
        try
        {
          Object localObject;
          if ((paramString.equals("ver_msc")) || (paramString.equals("ver_asr")) || (paramString.equals("ver_tts")) || (paramString.equals("ver_ivw")))
          {
            localObject = paramString.getBytes("utf-8");
            paramString = new MSCSessionInfo();
            localObject = new String(MSC.QMSPGetVersion((byte[])localObject, paramString), "utf-8");
            if (paramString.errorcode == 0) {
              return (String)localObject;
            }
          }
          else
          {
            paramString = paramString.getBytes("utf-8");
            localObject = new MSCSessionInfo();
            if (MSC.QMSPGetParam(paramString, (MSCSessionInfo)localObject) == 0)
            {
              paramString = new String(((MSCSessionInfo)localObject).buffer, "utf-8");
              return paramString;
            }
          }
        }
        catch (Exception paramString)
        {
          X.b(paramString);
          return null;
        }
        catch (UnsatisfiedLinkError paramString)
        {
          X.b(paramString);
        }
      }
    }
    return null;
  }
  
  public String getPlusLocalInfo(String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    if (!checkServiceInstalled())
    {
      localJSONObject.put("ret", 21001);
      return localJSONObject.toString();
    }
    if (getServiceVersion() < 97)
    {
      localJSONObject.put("ret", 20018);
      return localJSONObject.toString();
    }
    if ((10000 <= getServiceVersion()) && (getServiceVersion() <= 11000))
    {
      localJSONObject.put("ret", 20020);
      return localJSONObject.toString();
    }
    Cursor localCursor = this.f.getContentResolver().query(Uri.parse("content://com.iflytek.vflynote.providers.LocalResourceProvider"), null, paramString, null, null);
    int i = localCursor.getColumnIndex("tag_rescontent");
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      paramString = localCursor.getString(i);
      Log.v("SpeechUtility", paramString);
    }
    for (;;)
    {
      if (localCursor != null) {
        localCursor.close();
      }
      if (TextUtils.isEmpty(paramString))
      {
        localJSONObject.put("ret", 20004);
        return localJSONObject.toString();
      }
      localJSONObject.put("ret", 0);
      localJSONObject.put("result", new JSONObject(paramString));
      return localJSONObject.toString();
      paramString = "";
    }
  }
  
  public int getServiceVersion()
  {
    if (this.e < 0) {}
    try
    {
      PackageInfo localPackageInfo = this.f.getPackageManager().getPackageInfo("com.iflytek.vflynote", 0);
      if (localPackageInfo != null) {
        this.e = localPackageInfo.versionCode;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return this.e;
  }
  
  public int openEngineSettings(String paramString)
  {
    try
    {
      Intent localIntent = new Intent();
      localIntent.setPackage("com.iflytek.vflynote");
      String str = "com.iflytek.vflynote";
      if (("tts".equals(paramString)) && (c("com.iflytek.vflynote.activity.speaker.SpeakerSetting"))) {
        paramString = "com.iflytek.vflynote.activity.speaker.SpeakerSetting";
      }
      for (;;)
      {
        localIntent.setAction(paramString);
        localIntent.addFlags(268435456);
        this.f.startActivity(localIntent);
        return 0;
        if (("asr".equals(paramString)) && (c("com.iflytek.vflynote.settings.asr")))
        {
          paramString = "com.iflytek.vflynote.settings.asr";
        }
        else
        {
          paramString = str;
          if (c("com.iflytek.vflynote.settings.main")) {
            paramString = "com.iflytek.vflynote.settings.main";
          }
        }
      }
      return 21002;
    }
    catch (Exception paramString)
    {
      X.a(paramString);
    }
  }
  
  public String[] queryAvailableEngines()
  {
    this.d.clear();
    d();
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.d.iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.addAll(((SpeechComponent)((Iterator)localObject).next()).getEngines());
    }
    localObject = new String[localArrayList.size()];
    int i = 0;
    while (i < localArrayList.size())
    {
      localObject[i] = ((String)localArrayList.get(i));
      i += 1;
    }
    return (String[])localObject;
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      super.setParameter(paramString1, paramString2);
      bool1 = bool2;
      if (!MSC.isLoaded()) {
        continue;
      }
      bool1 = bool2;
      if ("params".equals(paramString1)) {
        continue;
      }
      try
      {
        int i = MSC.QMSPSetParam(paramString1.getBytes("utf-8"), paramString2.getBytes("utf-8"));
        bool1 = bool2;
        if (i == 0) {
          continue;
        }
        return false;
      }
      catch (Exception paramString1)
      {
        X.a(paramString1);
        return false;
      }
      catch (UnsatisfiedLinkError paramString1)
      {
        for (;;)
        {
          X.a(paramString1);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechUtility.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */