package com.android.dazhihui.service;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.android.dazhihui.c.a.d;
import java.net.HttpURLConnection;

class b
  extends Handler
{
  b(DownloadService paramDownloadService, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (DownloadService.d) {
      DownloadService.b(this.a);
    }
    do
    {
      return;
      switch (paramMessage.what)
      {
      default: 
        return;
      case 4096: 
        localObject = (Intent)paramMessage.obj;
      }
    } while (localObject == null);
    paramMessage = ((Intent)localObject).getStringExtra("download_url");
    Object localObject = ((Intent)localObject).getStringExtra("download_MD5");
    if ((!TextUtils.isEmpty(paramMessage)) && (!TextUtils.isEmpty((CharSequence)localObject)))
    {
      DownloadService.a(this.a, 0);
      DownloadService.b(this.a, 0);
      DownloadService.a = paramMessage;
      DownloadService.b = (String)localObject;
      d.a().a("apkUpdateTotal", 0);
      d.a().a("apkUpdatePrpgress", 0);
      d.a().a("apkDownloadUrl", DownloadService.a);
      d.a().a("apkDownloadMd5", DownloadService.b);
      d.a().g();
      Log.i("GUH", "Handler MSG_START_DOWNLOAD mUrl=" + DownloadService.a + " mMd5=" + DownloadService.b);
    }
    DownloadService.c(this.a).sendEmptyMessageDelayed(4097, 1000L);
    return;
    try
    {
      DownloadService.c(this.a).removeMessages(4097);
      this.a.a(DownloadService.a, DownloadService.c);
      d.a().a("apkUpdatePrpgress", DownloadService.f(this.a));
      d.a().g();
      if (DownloadService.g(this.a))
      {
        DownloadService.c(this.a).removeMessages(4097);
        DownloadService.a(this.a, DownloadService.h(this.a), 11);
        DownloadService.a(this.a, DownloadService.f(this.a), DownloadService.i(this.a), "大智慧更新包下载完成");
        return;
      }
    }
    catch (Exception paramMessage)
    {
      for (;;)
      {
        if (DownloadService.d(this.a) != null)
        {
          DownloadService.d(this.a).disconnect();
          DownloadService.a(this.a, null);
        }
        paramMessage.printStackTrace();
        if (DownloadService.e(this.a)) {
          DownloadService.c(this.a).sendEmptyMessageDelayed(4097, 1000L);
        }
      }
      DownloadService.a(this.a);
      if ((DownloadService.j(this.a)) && (!DownloadService.k(this.a)) && (DownloadService.l(this.a))) {
        DownloadService.a(this.a, DownloadService.h(this.a), 12);
      }
      DownloadService.a(this.a, DownloadService.f(this.a), DownloadService.i(this.a), "大智慧更新包下载暂停");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */