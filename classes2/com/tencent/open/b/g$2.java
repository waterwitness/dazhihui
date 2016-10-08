package com.tencent.open.b;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.a.f;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.OpenConfig;
import com.tencent.open.utils.Util;
import java.util.List;
import java.util.TimeZone;

class g$2
  implements Runnable
{
  g$2(g paramg, Bundle paramBundle, boolean paramBoolean) {}
  
  public void run()
  {
    try
    {
      Object localObject = new Bundle();
      ((Bundle)localObject).putString("uin", "1000");
      ((Bundle)localObject).putString("imei", c.b(Global.getContext()));
      ((Bundle)localObject).putString("imsi", c.c(Global.getContext()));
      ((Bundle)localObject).putString("android_id", c.d(Global.getContext()));
      ((Bundle)localObject).putString("mac", c.a());
      ((Bundle)localObject).putString("platform", "1");
      ((Bundle)localObject).putString("os_ver", Build.VERSION.RELEASE);
      ((Bundle)localObject).putString("position", Util.getLocation(Global.getContext()));
      ((Bundle)localObject).putString("network", a.a(Global.getContext()));
      ((Bundle)localObject).putString("language", c.b());
      ((Bundle)localObject).putString("resolution", c.a(Global.getContext()));
      ((Bundle)localObject).putString("apn", a.b(Global.getContext()));
      ((Bundle)localObject).putString("model_name", Build.MODEL);
      ((Bundle)localObject).putString("timezone", TimeZone.getDefault().getID());
      ((Bundle)localObject).putString("sdk_ver", "2.9.4.lite");
      ((Bundle)localObject).putString("qz_ver", Util.getAppVersionName(Global.getContext(), "com.qzone"));
      ((Bundle)localObject).putString("qq_ver", Util.getVersionName(Global.getContext(), "com.tencent.mobileqq"));
      ((Bundle)localObject).putString("qua", Util.getQUA3(Global.getContext(), Global.getPackageName()));
      ((Bundle)localObject).putString("packagename", Global.getPackageName());
      ((Bundle)localObject).putString("app_ver", Util.getAppVersionName(Global.getContext(), Global.getPackageName()));
      if (this.a != null) {
        ((Bundle)localObject).putAll(this.a);
      }
      localObject = new b((Bundle)localObject);
      this.c.d.add(localObject);
      int k = this.c.d.size();
      int j = OpenConfig.getInstance(Global.getContext(), null).getInt("Agent_ReportTimeInterval");
      int i = j;
      if (j == 0) {
        i = 10000;
      }
      if ((this.c.a("report_via", k)) || (this.b))
      {
        this.c.e();
        this.c.f.removeMessages(1001);
        return;
      }
      if (!this.c.f.hasMessages(1001))
      {
        localObject = Message.obtain();
        ((Message)localObject).what = 1001;
        this.c.f.sendMessageDelayed((Message)localObject, i);
        return;
      }
    }
    catch (Exception localException)
    {
      f.b("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\b\g$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */