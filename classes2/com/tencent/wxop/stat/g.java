package com.tencent.wxop.stat;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.wxop.stat.b.b;
import com.tencent.wxop.stat.b.f;
import com.tencent.wxop.stat.b.l;
import com.tencent.wxop.stat.b.r;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpHost;
import org.json.JSONObject;

public class g
{
  private static g bg = null;
  private List<String> bc = null;
  private volatile HttpHost bd = null;
  private f be = null;
  private int bf = 0;
  private Context bh = null;
  private b bi = null;
  private volatile String c = "";
  private volatile int g = 2;
  
  private g(Context paramContext)
  {
    this.bh = paramContext.getApplicationContext();
    this.be = new f();
    ak.j(paramContext);
    this.bi = l.av();
    Y();
    this.bc = new ArrayList(10);
    this.bc.add("117.135.169.101");
    this.bc.add("140.207.54.125");
    this.bc.add("180.153.8.53");
    this.bc.add("120.198.203.175");
    this.bc.add("14.17.43.18");
    this.bc.add("163.177.71.186");
    this.bc.add("111.30.131.31");
    this.bc.add("123.126.121.167");
    this.bc.add("123.151.152.111");
    this.bc.add("113.142.45.79");
    this.bc.add("123.138.162.90");
    this.bc.add("103.7.30.94");
    Z();
  }
  
  private String O()
  {
    try
    {
      if (!d("pingma.qq.com"))
      {
        String str = InetAddress.getByName("pingma.qq.com").getHostAddress();
        return str;
      }
    }
    catch (Exception localException)
    {
      this.bi.b(localException);
    }
    return "";
  }
  
  private void Y()
  {
    this.g = 0;
    this.bd = null;
    this.c = null;
  }
  
  private static boolean d(String paramString)
  {
    return Pattern.compile("(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})").matcher(paramString).matches();
  }
  
  public static g r(Context paramContext)
  {
    if (bg == null) {}
    try
    {
      if (bg == null) {
        bg = new g(paramContext);
      }
      return bg;
    }
    finally {}
  }
  
  public final int D()
  {
    return this.g;
  }
  
  public final void I()
  {
    this.bf = ((this.bf + 1) % this.bc.size());
  }
  
  public final HttpHost V()
  {
    return this.bd;
  }
  
  public final boolean W()
  {
    return this.g == 1;
  }
  
  public final boolean X()
  {
    return this.g != 0;
  }
  
  final void Z()
  {
    if (r.W(this.bh))
    {
      String str1;
      Object localObject;
      if (c.ad)
      {
        str1 = O();
        if (c.k()) {
          this.bi.b("remoteIp ip is " + str1);
        }
        if (l.e(str1))
        {
          if (!this.bc.contains(str1)) {
            break label191;
          }
          localObject = str1;
          c.o("http://" + (String)localObject + ":80/mstat/report");
        }
      }
      this.c = l.E(this.bh);
      if (c.k()) {
        this.bi.b("NETWORK name:" + this.c);
      }
      if (l.e(this.c)) {
        if (!"WIFI".equalsIgnoreCase(this.c)) {
          break label251;
        }
      }
      label191:
      label251:
      for (this.g = 1;; this.g = 2)
      {
        this.bd = l.v(this.bh);
        if (e.a()) {
          e.n(this.bh);
        }
        return;
        String str2 = (String)this.bc.get(this.bf);
        localObject = str2;
        if (!c.k()) {
          break;
        }
        this.bi.c(str1 + " not in ip list, change to:" + str2);
        localObject = str2;
        break;
      }
    }
    if (c.k()) {
      this.bi.b("NETWORK TYPE: network is close.");
    }
    Y();
  }
  
  public final void aa()
  {
    this.bh.getApplicationContext().registerReceiver(new z(this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final void b(String paramString)
  {
    if (c.k()) {
      this.bi.b("updateIpList " + paramString);
    }
    try
    {
      if (l.e(paramString))
      {
        paramString = new JSONObject(paramString);
        if (paramString.length() > 0)
        {
          Iterator localIterator = paramString.keys();
          while (localIterator.hasNext())
          {
            Object localObject1 = paramString.getString((String)localIterator.next());
            if (l.e((String)localObject1))
            {
              localObject1 = ((String)localObject1).split(";");
              int j = localObject1.length;
              int i = 0;
              while (i < j)
              {
                Object localObject2 = localObject1[i];
                if (l.e((String)localObject2))
                {
                  localObject2 = ((String)localObject2).split(":");
                  if (localObject2.length > 1)
                  {
                    localObject2 = localObject2[0];
                    if ((d((String)localObject2)) && (!this.bc.contains(localObject2)))
                    {
                      if (c.k()) {
                        this.bi.b("add new ip:" + (String)localObject2);
                      }
                      this.bc.add(localObject2);
                    }
                  }
                }
                i += 1;
              }
            }
          }
        }
      }
      return;
    }
    catch (Exception paramString)
    {
      this.bi.b(paramString);
      this.bf = new Random().nextInt(this.bc.size());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */