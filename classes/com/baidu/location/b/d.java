package com.baidu.location.b;

import com.baidu.location.h.g;
import com.baidu.location.h.p;
import java.lang.reflect.Method;
import java.net.InetAddress;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

class d
  extends n
{
  private boolean k = false;
  
  public d(c paramc) {}
  
  public void a()
  {
    if ((c.a(this.a).equals("dns.map.baidu.com")) || (System.currentTimeMillis() - c.b(this.a) > 720000L)) {
      switch (g.a().g())
      {
      default: 
        c.a(this.a, "dns.map.baidu.com");
      }
    }
    for (;;)
    {
      this.c = ("http://" + c.a(this.a) + ":80/remotedns?pid=lbs-geolocation");
      return;
      c.a(this.a, "111.13.100.247");
      continue;
      c.a(this.a, "180.97.33.196");
      continue;
      c.a(this.a, "111.206.37.190");
    }
  }
  
  public void a(boolean paramBoolean)
  {
    String str = null;
    if ((paramBoolean) && (this.e != null)) {}
    try
    {
      JSONObject localJSONObject = new JSONObject(EntityUtils.toString(this.e, "utf-8"));
      if ((localJSONObject.getInt("errno") == 0) && (localJSONObject.has("data")))
      {
        Object localObject3 = localJSONObject.getJSONArray("data");
        Object localObject1 = ((JSONArray)localObject3).getJSONObject(0);
        localObject3 = ((JSONArray)localObject3).getJSONObject(1);
        if (((JSONObject)localObject1).has("loc.map.baidu.com"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("loc.map.baidu.com").getJSONObject(0).getString("ip");
          if (((JSONObject)localObject3).has("dns.map.baidu.com")) {
            str = ((JSONObject)localObject3).getJSONArray("dns.map.baidu.com").getJSONObject(0).getString("ip");
          }
          if ((localObject1 != null) && (str != null))
          {
            c.a(this.a, str);
            c.b(this.a, (String)localObject1);
          }
          if (localJSONObject.has("switch")) {
            c.a(this.a, localJSONObject.getInt("switch"));
          }
          c.a(this.a, System.currentTimeMillis());
          c();
        }
      }
      else
      {
        this.k = false;
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        continue;
        Object localObject2 = null;
      }
    }
  }
  
  void b()
  {
    if (this.k) {
      return;
    }
    this.k = true;
    d();
  }
  
  void c()
  {
    if (System.currentTimeMillis() - c.c(this.a) < 1200000L) {
      c.d(this.a);
    }
    for (;;)
    {
      return;
      try
      {
        str = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class }).invoke(null, new Object[] { "net.dns1" });
      }
      catch (Exception localException1)
      {
        try
        {
          for (;;)
          {
            String str;
            InetAddress localInetAddress = InetAddress.getByName("loc.map.baidu.com");
            if ((localInetAddress == null) || (localInetAddress.getHostAddress() == null) || (str == null) || ("".equals(str))) {
              break;
            }
            c.c(this.a, str);
            c.d(this.a, localInetAddress.getHostAddress());
            c.b(this.a, System.currentTimeMillis());
            c.d(this.a);
            return;
            localException1 = localException1;
            Object localObject1 = null;
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            Object localObject2 = null;
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */