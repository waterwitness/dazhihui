package com.tencent.open.b;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.open.a.f;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.OpenConfig;
import java.util.List;

class g$3
  implements Runnable
{
  g$3(g paramg, long paramLong1, String paramString1, String paramString2, int paramInt, long paramLong2, long paramLong3, boolean paramBoolean) {}
  
  public void run()
  {
    int j = 1;
    for (;;)
    {
      try
      {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = this.a;
        Object localObject1 = new Bundle();
        Object localObject2 = a.a(Global.getContext());
        ((Bundle)localObject1).putString("apn", (String)localObject2);
        ((Bundle)localObject1).putString("appid", "1000067");
        ((Bundle)localObject1).putString("commandid", this.b);
        ((Bundle)localObject1).putString("detail", this.c);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("network=").append((String)localObject2).append('&');
        localObject2 = localStringBuilder.append("sdcard=");
        if (Environment.getExternalStorageState().equals("mounted"))
        {
          i = 1;
          ((StringBuilder)localObject2).append(i).append('&');
          localStringBuilder.append("wifi=").append(a.e(Global.getContext()));
          ((Bundle)localObject1).putString("deviceInfo", localStringBuilder.toString());
          i = 100 / this.h.a(this.d);
          if (i > 0) {
            break label489;
          }
          i = j;
          label172:
          ((Bundle)localObject1).putString("frequency", i + "");
          ((Bundle)localObject1).putString("reqSize", this.e + "");
          ((Bundle)localObject1).putString("resultCode", this.d + "");
          ((Bundle)localObject1).putString("rspSize", this.f + "");
          ((Bundle)localObject1).putString("timeCost", l1 - l2 + "");
          ((Bundle)localObject1).putString("uin", "1000");
          localObject1 = new b((Bundle)localObject1);
          this.h.c.add(localObject1);
          int k = this.h.c.size();
          j = OpenConfig.getInstance(Global.getContext(), null).getInt("Agent_ReportTimeInterval");
          i = j;
          if (j == 0) {
            i = 10000;
          }
          if ((this.h.a("report_cgi", k)) || (this.g))
          {
            this.h.b();
            this.h.f.removeMessages(1000);
            return;
          }
          if (!this.h.f.hasMessages(1000))
          {
            localObject1 = Message.obtain();
            ((Message)localObject1).what = 1000;
            this.h.f.sendMessageDelayed((Message)localObject1, i);
            return;
          }
        }
      }
      catch (Exception localException)
      {
        f.b("openSDK_LOG.ReportManager", "--> reportCGI, exception in sub thread.", localException);
        return;
      }
      label489:
      do
      {
        break label172;
        return;
        i = 0;
        break;
      } while (i <= 100);
      int i = 100;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\b\g$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */