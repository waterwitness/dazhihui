package com.android.dazhihui.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.c.b.c;
import com.android.dazhihui.d.ap;
import com.android.dazhihui.ui.screen.stock.DialogActivity;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadService
  extends Service
  implements Handler.Callback
{
  public static String a;
  public static String b;
  public static String c;
  public static boolean d = false;
  private boolean e = false;
  private Handler f;
  private HandlerThread g;
  private Handler h;
  private Context i = this;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  private boolean m = true;
  private int n;
  private int o;
  private HttpURLConnection p;
  private NotificationManager q;
  private Notification r;
  private String s = "DownloadService";
  private int t = 2130903096;
  private BroadcastReceiver u = new a(this);
  
  public static String a()
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (!TextUtils.isEmpty(a))
    {
      localObject1 = localObject2;
      if (!TextUtils.isEmpty(c))
      {
        localObject1 = a.substring(a.lastIndexOf("/") + 1, a.length());
        localObject1 = c + File.separator + (String)localObject1;
      }
    }
    return (String)localObject1;
  }
  
  public static String a(String paramString)
  {
    String str;
    if (TextUtils.isEmpty(paramString)) {
      str = null;
    }
    int i1;
    do
    {
      return str;
      i1 = paramString.indexOf("?MD5=");
      str = paramString;
    } while (i1 == -1);
    return paramString.substring(0, i1);
  }
  
  private void a(int paramInt1, int paramInt2, String paramString)
  {
    if (this.l) {
      return;
    }
    if (paramInt2 > 0) {
      if (paramInt2 == paramInt1) {
        paramInt1 = 100;
      }
    }
    for (;;)
    {
      if (this.r == null)
      {
        this.r = new Notification();
        this.r.icon = 2130838627;
        this.r.tickerText = "大智慧更新包下载";
        Object localObject = new Intent(this, DownloadService.class);
        ((Intent)localObject).putExtra("cmd", "cmd_install");
        localObject = PendingIntent.getService(this, 0, (Intent)localObject, 0);
        this.r.contentIntent = ((PendingIntent)localObject);
      }
      this.r.contentView = new RemoteViews(getPackageName(), 2130903096);
      this.r.contentView.setImageViewResource(2131558822, 2130838090);
      this.r.contentView.setProgressBar(2131558824, 100, paramInt1, false);
      this.r.contentView.setTextViewText(2131558823, paramString);
      this.r.contentView.setTextViewText(2131558825, paramInt1 + "%");
      this.q.notify(this.s, this.t, this.r);
      return;
      paramInt1 = (int)(100.0F * paramInt1 / paramInt2);
      continue;
      paramInt1 = 0;
    }
  }
  
  private void a(Context paramContext, int paramInt)
  {
    if (paramContext == null) {}
    while ((this.l) && (paramInt != 11)) {
      return;
    }
    String str = "\n大智慧更新包下载完成.\n";
    if (paramInt == 12) {
      str = "当前没有连接WIFI网络, 大智慧更新包下载需求较大流量， 是否继续更新?";
    }
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putInt("screenId", paramInt);
    localBundle.putString("title", "大智慧更新");
    localBundle.putString("message", str);
    localBundle.putString("save_path", a());
    localIntent.setClass(paramContext, DialogActivity.class);
    localIntent.setFlags(268435456);
    localIntent.putExtras(localBundle);
    paramContext.startActivity(localIntent);
    if (paramInt == 11)
    {
      this.h.removeMessages(4097);
      this.f.sendEmptyMessage(110);
    }
    Log.i("GUH", "showDialog type=" + paramInt);
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if (paramContext != null)
    {
      paramString = new Intent(paramContext, DownloadService.class);
      paramString.putExtra("cmd", "cmd_install");
      paramContext.startService(paramString);
    }
  }
  
  public static boolean a(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramContext != null)
    {
      bool1 = bool2;
      if (!TextUtils.isEmpty(paramString))
      {
        Intent localIntent = new Intent(paramContext, DownloadService.class);
        localIntent.putExtra("cmd", "cmd_start_download");
        String str1 = a(paramString);
        String str2 = b(paramString);
        bool1 = bool2;
        if (!TextUtils.isEmpty(str1))
        {
          bool1 = bool2;
          if (!TextUtils.isEmpty(str2))
          {
            Log.i("GUH", "startDownloadService");
            localIntent.putExtra("download_silent", paramBoolean1);
            localIntent.putExtra("download_url", str1);
            localIntent.putExtra("download_MD5", str2);
            localIntent.putExtra("download_only_wifi", paramBoolean2);
            a = str1;
            b = str2;
            d.a().a("apkDownloadUrl", a);
            d.a().a("apkDownloadMd5", b);
            d.a().g();
            d = false;
            paramContext.startService(localIntent);
            bool1 = true;
          }
        }
      }
    }
    Log.i("GUH", "startDownloadService return=" + bool1 + " updateUrl=" + paramString + " silent=" + paramBoolean1 + " wifiLimit=" + paramBoolean2);
    return bool1;
  }
  
  public static String b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    int i1;
    do
    {
      return null;
      i1 = paramString.indexOf("?MD5=");
    } while (i1 == -1);
    return paramString.substring(i1 + 5);
  }
  
  private boolean b()
  {
    return ((this.m) && (this.k)) || ((!this.m) && (this.j));
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    bool2 = false;
    if (paramContext == null) {
      return false;
    }
    c = c.b(paramContext, "download");
    a = a(paramString);
    b = b(paramString);
    paramString = "null error mSaveDirectory=" + c + " mUrl=" + a + " mMd5=" + b;
    paramContext = paramString;
    bool1 = bool2;
    if (!TextUtils.isEmpty(a))
    {
      paramContext = paramString;
      bool1 = bool2;
      if (!TextUtils.isEmpty(b))
      {
        paramContext = paramString;
        bool1 = bool2;
        if (!TextUtils.isEmpty(a())) {
          paramContext = new File(a());
        }
      }
    }
    for (;;)
    {
      try
      {
        if (!paramContext.exists()) {
          continue;
        }
        String str = ap.a(paramContext);
        Log.i("GUH", "md5=" + str + ",mMd5=" + b);
        if (!b.equalsIgnoreCase(str)) {
          continue;
        }
        bool1 = true;
        paramContext = "md5 OK";
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        paramContext = "Exception=" + paramContext.toString();
        bool1 = bool2;
        continue;
        bool1 = false;
        paramContext = paramString;
        continue;
      }
      Log.i("GUH", "isDownloadComplete=" + bool1 + " why=" + paramContext);
      return bool1;
      if (paramContext == null) {
        continue;
      }
      paramContext = "md5 not equal";
      bool1 = false;
      continue;
      paramContext = "file not exists";
      bool1 = false;
    }
  }
  
  private void c()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo == null)
    {
      this.j = false;
      this.k = false;
      return;
    }
    this.j = localNetworkInfo.isConnected();
    if (!this.j)
    {
      this.k = false;
      return;
    }
    if (localNetworkInfo.getType() == 1)
    {
      this.k = true;
      Log.i("GUH", "checkNetStatus mIsWifi=" + this.k);
      this.h.sendEmptyMessageDelayed(4097, 15000L);
      return;
    }
    this.k = false;
  }
  
  private boolean d()
  {
    boolean bool2 = false;
    String str3 = "";
    String str1;
    boolean bool1;
    File localFile;
    if ((this.n == this.o) && (this.o > 0))
    {
      str1 = str3;
      bool1 = bool2;
      if (!TextUtils.isEmpty(a))
      {
        str1 = str3;
        bool1 = bool2;
        if (!TextUtils.isEmpty(b))
        {
          str1 = str3;
          bool1 = bool2;
          if (!TextUtils.isEmpty(a())) {
            localFile = new File(a());
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        if (!localFile.exists()) {
          continue;
        }
        str1 = ap.a(localFile);
        Log.i("GUH", "md5=" + str1 + ",mMd5=" + b);
        if (!b.equalsIgnoreCase(str1)) {
          continue;
        }
        bool1 = true;
        str1 = "md5 OK";
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        str2 = "Exception=" + localException.toString();
        bool1 = false;
        continue;
      }
      if (!bool1)
      {
        this.o = 0;
        this.n = 0;
        d.a().a("apkUpdateTotal", 0);
        d.a().a("apkUpdatePrpgress", 0);
        d.a().g();
        this.h.sendEmptyMessage(4097);
      }
      if ((bool1) && (this.h != null)) {
        this.h.removeMessages(4096);
      }
      Log.i("GUH", "isDownloadComplete=" + bool1 + " why=" + str1);
      return bool1;
      str1 = str3;
      if (localFile != null)
      {
        str1 = "md5 not equal";
        localFile.delete();
        break label371;
        str1 = "file not exists";
        bool1 = false;
        continue;
        String str2 = "byte error write=" + this.n + " total=" + this.o;
        bool1 = bool2;
        continue;
      }
      label371:
      bool1 = false;
    }
  }
  
  private void e()
  {
    this.h.removeMessages(4097);
    this.f.sendEmptyMessage(110);
  }
  
  private void f()
  {
    if (d())
    {
      File localFile = new File(a());
      Intent localIntent = new Intent();
      localIntent.addFlags(268435456);
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.fromFile(localFile), "application/vnd.android.package-archive");
      startActivity(localIntent);
      this.h.removeMessages(4097);
      this.f.sendEmptyMessage(110);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    Log.i("GUH", "downloadFile check url=" + a + ",md5=" + b);
    Log.i("GUH", "downloadFile check isNetOk=" + b() + "  httpConn=" + this.p + " write=" + this.n + " total=" + this.o);
    Log.i("GUH", "downloadFile check mIsWifi=" + this.k + " mWifiLimit=" + this.m + " mIsNetConnected=" + this.j);
    paramString2 = a();
    Log.i("GUH", "downloadFile check fileName = " + paramString2);
    if ((TextUtils.isEmpty(a)) || (TextUtils.isEmpty(b)) || (this.p != null) || (!b()) || (TextUtils.isEmpty(paramString2)) || (d())) {
      return;
    }
    this.p = ((HttpURLConnection)new URL(paramString1).openConnection());
    if (this.n > 0) {
      this.p.addRequestProperty("Range", "bytes=" + this.n + "-");
    }
    int i1 = this.p.getResponseCode();
    if (((i1 == 200) && (this.n == 0)) || ((i1 == 206) && (this.n > 0)))
    {
      paramString1 = this.p.getContentType();
      i1 = this.p.getContentLength();
      Log.i("GUH", "downloadFile Content-Type = " + paramString1);
      Log.i("GUH", "downloadFile Content-Length = " + i1);
      if (this.n == 0)
      {
        if ((this.o > 0) && (this.o != i1)) {
          Log.i("GUH", "mTotalByte != contentLength");
        }
        this.o = i1;
        d.a().a("apkUpdateTotal", this.o);
        d.a().g();
      }
      paramString1 = this.p.getInputStream();
      paramString2 = new RandomAccessFile(paramString2, "rw");
      Log.i("GUH", "osavedfile.length = " + paramString2.length());
      if (paramString2.length() != this.n) {
        Log.i("GUH", "osavedfile.length() != mAlreadyWrite");
      }
      paramString2.seek(this.n);
      byte[] arrayOfByte = new byte['က'];
      long l1 = SystemClock.elapsedRealtime();
      while (b())
      {
        int i2 = paramString1.read(arrayOfByte);
        if (i2 == -1) {
          break;
        }
        paramString2.write(arrayOfByte, 0, i2);
        this.n = (i2 + this.n);
        if (SystemClock.elapsedRealtime() > 1500L + l1)
        {
          l1 = SystemClock.elapsedRealtime();
          Log.i("GUH", "download write= " + this.n + " Total=" + this.o + " Content-Length = " + i1);
          a(this.n, this.o, "大智慧更新包下载中");
        }
      }
      Log.i("GUH", "write file bytes= " + this.n + " sTotalByte=" + this.o + " Content-Length = " + i1);
      paramString2.close();
      paramString1.close();
      Log.i("GUH", "downloadFile write file bytes= " + this.n + " mTotalByte=" + this.o + " Content-Length = " + i1);
    }
    for (;;)
    {
      this.p.disconnect();
      this.p = null;
      return;
      Log.i("GUH", "downloadFile No file to download. Server replied HTTP code: " + i1);
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      Log.w("GUH", "un-handled message.");
      return false;
    }
    Log.i("GUH", "finish DownloadService.");
    stopSelf();
    return true;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    Log.i("GUH", "DownloadService onCreate");
    super.onCreate();
    c = c.b(this, "download");
    Log.i("GUH", "DownloadService onCreate mSaveDirectory=" + c);
    this.o = d.a().c("apkUpdateTotal");
    this.n = d.a().c("apkUpdatePrpgress");
    Log.i("GUH", "DownloadService onCreate mTotalByte=" + this.o + " mAlreadyWrite=" + this.n);
    a = d.a().b("apkDownloadUrl");
    b = d.a().b("apkDownloadMd5");
    Log.i("GUH", "DownloadService onCreate mUrl=" + a + " mMd5=" + b);
    d.a().g();
    this.f = new Handler(this);
    this.g = new HandlerThread("DownloadService_thread");
    this.g.start();
    this.h = new b(this, this.g.getLooper());
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    registerReceiver(this.u, localIntentFilter);
    this.q = ((NotificationManager)getSystemService("notification"));
  }
  
  public void onDestroy()
  {
    Log.i("GUH", "DownloadService onDestroy");
    if (this.p != null)
    {
      this.p.disconnect();
      this.p = null;
    }
    this.g.quit();
    unregisterReceiver(this.u);
    stopForeground(true);
    this.q.cancel(this.s, this.t);
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    String str = paramIntent.getStringExtra("cmd");
    Log.i("GUH", "DownloadService onStartCommand CMD=" + str + " flags=" + paramInt1 + " , startId=" + paramInt2);
    if (d)
    {
      e();
      return 2;
    }
    if ("cmd_start_download".equals(str)) {
      if (d()) {
        a(this.i, 11);
      }
    }
    for (;;)
    {
      return 3;
      this.l = paramIntent.getBooleanExtra("download_silent", false);
      this.m = paramIntent.getBooleanExtra("download_only_wifi", true);
      if (this.l) {
        this.q.cancel(this.s, this.t);
      }
      if (!this.e)
      {
        this.e = true;
        paramIntent = this.h.obtainMessage(4096, paramIntent);
        this.h.sendMessageDelayed(paramIntent, 30000L);
        Log.i("GUH", "DownloadService onStartCommand send MSG_START_DOWNLOAD");
      }
      else if (b())
      {
        this.h.sendEmptyMessageDelayed(4097, 30000L);
        Log.i("GUH", "DownloadService onStartCommand send MSG_TRY_CONTINUE_DOWNLOAD");
        continue;
        if ("cmd_install".equals(str)) {
          f();
        } else if (d()) {
          a(this.i, 11);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\DownloadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */