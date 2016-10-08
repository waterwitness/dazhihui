package qalsdk;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.config.NativeConfigStore;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.l;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.core.o;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.util.QLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

public class e
  extends i
{
  public static AtomicBoolean a = new AtomicBoolean(false);
  private j c;
  private AtomicBoolean d = new AtomicBoolean(false);
  private volatile int e = 0;
  private int f = -1;
  private String g;
  private String h;
  private HashMap<String, h> i = new HashMap();
  private Handler j = new f(this);
  private bf k = new g(this);
  
  public e(j paramj)
  {
    this.c = paramj;
    g();
    e();
  }
  
  private int a(int paramInt)
  {
    switch (paramInt)
    {
    case -2: 
    case -1: 
    default: 
      return -1;
    case 0: 
      return 0;
    }
    return -2;
  }
  
  private void a(int paramInt, String paramString)
  {
    if ((this.f != -2) || (paramInt == 0)) {
      this.f = paramInt;
    }
    if (this.f == -2) {
      this.g = paramString;
    }
  }
  
  private void a(String paramString, long paramLong, boolean paramBoolean)
  {
    Object localObject1 = new h(paramString, paramLong, paramBoolean);
    this.i.put(paramString, localObject1);
    localObject1 = this.i.entrySet().iterator();
    JSONArray localJSONArray;
    for (;;)
    {
      Object localObject2;
      try
      {
        localJSONArray = new JSONArray();
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        Object localObject3 = (Map.Entry)((Iterator)localObject1).next();
        localObject2 = (String)((Map.Entry)localObject3).getKey();
        localObject3 = (h)((Map.Entry)localObject3).getValue();
        if ((!((h)localObject3).a.equals(paramString)) && (System.currentTimeMillis() - ((h)localObject3).b > 86400000L))
        {
          this.i.remove(localObject2);
          continue;
        }
        localObject2 = ((h)localObject3).a();
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        return;
      }
      if (localObject2 != null) {
        localJSONArray.put(localObject2);
      }
    }
    QLog.d("WifiDetector", 4, "updatewifi:" + localJSONArray.toString());
    l.a().setConfig("_wifi_detect_history", localJSONArray.toString());
  }
  
  private void b(String paramString, long paramLong)
  {
    this.j.removeMessages(1000);
    Message localMessage = this.j.obtainMessage();
    localMessage.obj = paramString;
    this.j.sendMessageDelayed(localMessage, paramLong);
  }
  
  private void c(String paramString)
  {
    int m = 0;
    for (;;)
    {
      try
      {
        if (!m.e())
        {
          QLog.d("WifiDetector", 1, "WIFI detect start failed, wifi is not connected!");
          return;
        }
        if (!d(paramString))
        {
          QLog.d("WifiDetector", 1, "WIFI detect start failed, ssid is invalid!");
          continue;
        }
        if (this.d.compareAndSet(false, true)) {
          break label76;
        }
      }
      finally {}
      QLog.d("WifiDetector", 1, "WIFI detect start failed, there is detect running!");
      b(paramString, 60000L);
      continue;
      label76:
      QLog.d("WifiDetector", 1, "WIFI detect started!");
      this.h = paramString;
      a(this.h, System.currentTimeMillis());
      b(paramString, 7200000L);
      while (m < this.b.length)
      {
        this.e |= 1 << m;
        paramString = a(this.b[m], m, this.k);
        if (paramString != null)
        {
          paramString = new Thread(paramString);
          paramString.setName("WifiDetectEchoThread");
          paramString.start();
        }
        m += 1;
      }
    }
  }
  
  private boolean d(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.equals(m.h()));
  }
  
  private void e()
  {
    if ((m.e()) && (d(m.h()))) {
      a(m.h());
    }
  }
  
  private void f()
  {
    this.d.set(false);
    this.e = 0;
    this.f = -1;
    this.g = null;
    this.h = "";
  }
  
  private void g()
  {
    Object localObject = l.a().getConfig("_wifi_detect_history");
    if (localObject == null) {}
    for (;;)
    {
      return;
      try
      {
        localObject = new JSONArray((String)localObject);
        int m = 0;
        while (m < ((JSONArray)localObject).length())
        {
          h localh = h.a(((JSONArray)localObject).getJSONObject(m));
          if (localh != null) {
            this.i.put(localh.a, localh);
          }
          m += 1;
        }
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void a()
  {
    QLog.d("WifiDetector", 1, "WIFI detect onWifiDisconnected!");
    this.j.removeMessages(1000);
  }
  
  public void a(String paramString)
  {
    QLog.d("WifiDetector", 1, "WIFI detect onWifiConnected!");
    h localh = (h)this.i.get(paramString);
    long l = System.currentTimeMillis();
    if (localh == null)
    {
      a(paramString, false);
      c(paramString);
      return;
    }
    if (!localh.c)
    {
      c(paramString);
      return;
    }
    if (l - localh.b >= 7200000L)
    {
      c(paramString);
      return;
    }
    b(paramString, 7200000L - (l - localh.b));
  }
  
  public void a(String paramString, long paramLong)
  {
    h localh = (h)this.i.get(paramString);
    if (localh != null)
    {
      a(paramString, paramLong, localh.c);
      return;
    }
    a(paramString, paramLong, false);
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    h localh = (h)this.i.get(paramString);
    if (localh != null) {
      a(paramString, localh.b, paramBoolean);
    }
  }
  
  public void b()
  {
    QLog.d("WifiDetector", 1, "WIFI detect onWifiAllConnFailed!");
    c(m.h());
  }
  
  public void b(String paramString)
  {
    a.set(false);
    QLog.d("WifiDetector", 1, "WIFI detect onWifiConnSucc!");
    a(paramString, true);
  }
  
  public void c()
  {
    QLog.d("WifiDetector", 1, "WIFI detect onWifiConnFake!");
    c(m.h());
  }
  
  public void d()
  {
    int m = this.f;
    Object localObject = this.g;
    if (m.e()) {
      if (m == 0) {
        QLog.d("WifiDetector", 1, "WIFI detect result, WIFI_OK");
      }
    }
    for (;;)
    {
      f();
      return;
      if (m == -1)
      {
        QLog.d("WifiDetector", 1, "WIFI detect result, WIFI_EXCEPTION");
      }
      else if ((m == -2) && (!this.c.c.a.a()) && (d(this.h)))
      {
        QLog.d("WifiDetector", 1, "WIFI detect result, WIFI_NEED_AUTH");
        localObject = new FromServiceMsg(m.b.i(), j.f(), "0", "cmd_netNeedSignon");
        ((FromServiceMsg)localObject).setMsgSuccess();
        ((FromServiceMsg)localObject).setMsfCommand(MsfCommand.onNetNeedSignon);
        ((FromServiceMsg)localObject).addAttribute("signonurl", this.h);
        MsfSdkUtils.addFromMsgProcessName("*", (FromServiceMsg)localObject);
        a.set(true);
        m.b.a(null, (FromServiceMsg)localObject);
      }
      else
      {
        QLog.d("WifiDetector", 1, "WIFI detect result, WIFI_OTHER");
        continue;
        QLog.d("WifiDetector", 1, "WIFI detect result, WIFI_NONE");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */