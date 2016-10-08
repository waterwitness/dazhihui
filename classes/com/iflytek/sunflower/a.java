package com.iflytek.sunflower;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import com.iflytek.sunflower.c.e;
import com.iflytek.sunflower.task.SendTask;
import com.iflytek.sunflower.task.h;
import com.iflytek.sunflower.task.i;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

public class a
{
  private static a b = null;
  private static Context c = null;
  public ExecutorService a = Executors.newSingleThreadExecutor();
  private final Handler d;
  
  private a(Context paramContext)
  {
    if (paramContext != null) {
      c = paramContext;
    }
    paramContext = new HandlerThread("StatisLogAgent");
    paramContext.start();
    this.d = new Handler(paramContext.getLooper());
  }
  
  public static a a(Context paramContext)
  {
    if (b == null) {
      b = new a(paramContext);
    }
    for (;;)
    {
      return b;
      c = paramContext;
    }
  }
  
  private boolean d()
  {
    if (com.iflytek.sunflower.config.a.l == 0) {}
    long l;
    do
    {
      return false;
      l = d.a(c).getLong(com.iflytek.sunflower.config.b.g, 0L);
    } while (Long.valueOf(System.currentTimeMillis()).longValue() - Long.valueOf(l).longValue() <= com.iflytek.sunflower.config.a.m);
    return true;
  }
  
  public void a()
  {
    com.iflytek.sunflower.config.a.h = c.getClass().getName();
    this.a.execute(new h(c));
  }
  
  public void a(OnlineConfigListener paramOnlineConfigListener)
  {
    this.d.post(new i(c, paramOnlineConfigListener));
  }
  
  public void a(String paramString)
  {
    try
    {
      com.iflytek.sunflower.a.c localc = new com.iflytek.sunflower.a.c();
      localc.a = com.iflytek.sunflower.config.a.f;
      localc.c = System.currentTimeMillis();
      localc.b = e.a(paramString);
      this.d.post(new com.iflytek.sunflower.task.b(localc));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if (paramString1.equals("destUrl")) {
      com.iflytek.sunflower.config.a.t = paramString2;
    }
    do
    {
      return;
      if (paramString1.equals("updateConfigUrl"))
      {
        com.iflytek.sunflower.config.a.u = paramString2;
        return;
      }
      if (paramString1.equals("deviceid"))
      {
        com.iflytek.sunflower.config.a.v = paramString2;
        return;
      }
      if (paramString1.equals("caller.appid"))
      {
        com.iflytek.sunflower.config.a.w = paramString2;
        return;
      }
      if (paramString1.equals("net.mac"))
      {
        com.iflytek.sunflower.config.a.x = paramString2;
        return;
      }
    } while (!paramString1.equals(com.iflytek.sunflower.config.b.l));
    com.iflytek.sunflower.c.g.b(Boolean.parseBoolean(paramString2));
  }
  
  public void a(String paramString1, String paramString2, HashMap<String, String> paramHashMap, long paramLong)
  {
    try
    {
      this.d.post(new com.iflytek.sunflower.task.c(0, paramString1, paramString2, paramHashMap, paramLong));
      if (d()) {
        c();
      }
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public void a(JSONObject paramJSONObject, String paramString, HashMap<String, String> paramHashMap)
  {
    this.a.execute(new com.iflytek.sunflower.task.d(c, paramJSONObject, paramString, paramHashMap));
  }
  
  public void b()
  {
    if (!c.getClass().getName().equals(com.iflytek.sunflower.config.a.h))
    {
      com.iflytek.sunflower.c.g.a("Collector", "onPause called without context from corresponding onResume");
      return;
    }
    this.a.execute(new com.iflytek.sunflower.task.g(c));
  }
  
  public void b(String paramString)
  {
    paramString = new b(this, paramString);
    this.a.execute(paramString);
  }
  
  public void b(String paramString1, String paramString2, HashMap<String, String> paramHashMap, long paramLong)
  {
    this.d.post(new com.iflytek.sunflower.task.c(1, paramString1, paramString2, paramHashMap, paramLong));
  }
  
  public void c()
  {
    this.a.execute(new SendTask(c));
  }
  
  public void c(String paramString)
  {
    paramString = new c(this, paramString);
    this.a.execute(paramString);
  }
  
  public void c(String paramString1, String paramString2, HashMap<String, String> paramHashMap, long paramLong)
  {
    this.d.post(new com.iflytek.sunflower.task.c(2, paramString1, paramString2, paramHashMap, paramLong));
    if (d()) {
      c();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */