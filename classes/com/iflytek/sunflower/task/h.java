package com.iflytek.sunflower.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.iflytek.sunflower.c.c;
import com.iflytek.sunflower.c.e;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

public class h
  extends Thread
{
  private Context a;
  
  public h(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  private String a(long paramLong)
  {
    String str = c.a(e.b(this.a));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramLong).append(com.iflytek.sunflower.config.a.b).append(str);
    return paramLong + c.b(localStringBuilder.toString());
  }
  
  private void a()
  {
    SharedPreferences localSharedPreferences = com.iflytek.sunflower.d.a(this.a);
    if (localSharedPreferences == null)
    {
      g.c("Collector", "sharedpreferences is null");
      return;
    }
    com.iflytek.sunflower.config.a.b = e.f(this.a);
    try
    {
      com.iflytek.sunflower.config.a.l = Integer.parseInt(localSharedPreferences.getString(com.iflytek.sunflower.config.b.n, "0"));
      com.iflytek.sunflower.config.a.m = Integer.parseInt(localSharedPreferences.getString(com.iflytek.sunflower.config.b.o, "0")) * 1000;
      com.iflytek.sunflower.c.d.a(this.a);
      if (d(localSharedPreferences))
      {
        a(localSharedPreferences);
        return;
      }
      c(localSharedPreferences);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void a(SharedPreferences paramSharedPreferences)
  {
    com.iflytek.sunflower.config.a.g = Long.valueOf(System.currentTimeMillis());
    com.iflytek.sunflower.config.a.f = a(com.iflytek.sunflower.config.a.g.longValue());
    g.a("Collector", "Open a new session " + com.iflytek.sunflower.config.a.f);
    Object localObject = new com.iflytek.sunflower.a.b();
    ((com.iflytek.sunflower.a.b)localObject).a = paramSharedPreferences.getString(com.iflytek.sunflower.config.b.a, null);
    if (((com.iflytek.sunflower.a.b)localObject).a != null)
    {
      ((com.iflytek.sunflower.a.b)localObject).b = paramSharedPreferences.getLong(com.iflytek.sunflower.config.b.c, -1L);
      ((com.iflytek.sunflower.a.b)localObject).c = paramSharedPreferences.getLong(com.iflytek.sunflower.config.b.d, -1L);
      ((com.iflytek.sunflower.a.b)localObject).d = e(paramSharedPreferences);
      f.a((com.iflytek.sunflower.a.b)localObject);
    }
    f.a(new com.iflytek.sunflower.a.a(com.iflytek.sunflower.config.a.f, com.iflytek.sunflower.config.a.g.longValue()));
    localObject = paramSharedPreferences.edit();
    ((SharedPreferences.Editor)localObject).putString(com.iflytek.sunflower.config.b.a, com.iflytek.sunflower.config.a.f);
    ((SharedPreferences.Editor)localObject).putLong(com.iflytek.sunflower.config.b.b, com.iflytek.sunflower.config.a.g.longValue());
    ((SharedPreferences.Editor)localObject).putLong(com.iflytek.sunflower.config.b.c, com.iflytek.sunflower.config.a.g.longValue());
    ((SharedPreferences.Editor)localObject).putLong(com.iflytek.sunflower.config.b.d, 0L);
    ((SharedPreferences.Editor)localObject).putString(com.iflytek.sunflower.config.b.e, "");
    ((SharedPreferences.Editor)localObject).commit();
    new SendTask(this.a).send();
    try
    {
      b(paramSharedPreferences);
      return;
    }
    catch (Exception paramSharedPreferences)
    {
      paramSharedPreferences.printStackTrace();
    }
  }
  
  private void b(SharedPreferences paramSharedPreferences)
  {
    SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
    long l2 = paramSharedPreferences.getLong(com.iflytek.sunflower.config.b.u, -1L);
    long l3 = paramSharedPreferences.getLong(com.iflytek.sunflower.config.b.v, -1L);
    long l1 = System.currentTimeMillis() / 1000L;
    if (l1 - l3 > l2)
    {
      new a(this.a, null).run();
      localEditor.putLong(com.iflytek.sunflower.config.b.v, l1);
      localEditor.commit();
    }
    while (paramSharedPreferences.getBoolean(com.iflytek.sunflower.config.b.w, false))
    {
      HashMap localHashMap = new HashMap();
      l2 = paramSharedPreferences.getLong(com.iflytek.sunflower.config.b.s, -1L);
      if (l1 - paramSharedPreferences.getLong(com.iflytek.sunflower.config.b.t, -1L) > l2)
      {
        localHashMap.put(com.iflytek.sunflower.config.b.j, "true");
        localEditor.putLong(com.iflytek.sunflower.config.b.t, l1);
        localEditor.commit();
      }
      l2 = paramSharedPreferences.getLong(com.iflytek.sunflower.config.b.q, -1L);
      if (l1 - paramSharedPreferences.getLong(com.iflytek.sunflower.config.b.r, -1L) > l2)
      {
        localHashMap.put(com.iflytek.sunflower.config.b.k, "true");
        localEditor.putLong(com.iflytek.sunflower.config.b.r, l1);
        localEditor.commit();
      }
      if (localHashMap.size() > 0)
      {
        localHashMap.put(com.iflytek.sunflower.config.b.i, "true");
        paramSharedPreferences = new d(this.a, null, null, localHashMap);
        com.iflytek.sunflower.a.a(this.a).a.execute(paramSharedPreferences);
        return;
        g.e("Collector", "no need to check policy");
      }
      else
      {
        g.e("Collector", "no need to call upload app ");
        return;
      }
    }
    g.e("Collector", "no need to upload app list");
  }
  
  private void c(SharedPreferences paramSharedPreferences)
  {
    long l = System.currentTimeMillis();
    SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
    localEditor.putLong(com.iflytek.sunflower.config.b.b, l);
    localEditor.putLong(com.iflytek.sunflower.config.b.c, l);
    localEditor.commit();
    com.iflytek.sunflower.config.a.f = paramSharedPreferences.getString(com.iflytek.sunflower.config.b.a, null);
    g.a("Collector", "Extend current session: " + com.iflytek.sunflower.config.a.f);
  }
  
  private boolean d(SharedPreferences paramSharedPreferences)
  {
    long l = paramSharedPreferences.getLong(com.iflytek.sunflower.config.b.c, -1L);
    return System.currentTimeMillis() - l > com.iflytek.sunflower.config.a.a;
  }
  
  private static ArrayList<String> e(SharedPreferences paramSharedPreferences)
  {
    Object localObject = paramSharedPreferences.getString(com.iflytek.sunflower.config.b.e, "");
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      paramSharedPreferences = new ArrayList();
      try
      {
        localObject = ((String)localObject).split(";");
        int i = 0;
        while (i < localObject.length)
        {
          paramSharedPreferences.add(localObject[i]);
          i += 1;
        }
        return null;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        if (paramSharedPreferences.size() > 0) {
          return paramSharedPreferences;
        }
      }
    }
  }
  
  public void run()
  {
    try
    {
      a();
      return;
    }
    catch (Exception localException)
    {
      g.d("Collector", "call onResume error:" + localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */