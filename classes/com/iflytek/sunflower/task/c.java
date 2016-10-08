package com.iflytek.sunflower.task;

import android.text.TextUtils;
import com.iflytek.sunflower.a.d;
import com.iflytek.sunflower.c.b;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.config.a;
import com.iflytek.sunflower.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class c
  extends Thread
{
  private d a;
  private int b;
  
  public c(int paramInt, String paramString1, String paramString2, HashMap<String, String> paramHashMap, long paramLong)
  {
    this.b = paramInt;
    d locald = new d();
    locald.a = a.f;
    locald.b = paramString1;
    locald.c = paramString2;
    locald.d = paramHashMap;
    locald.e = paramLong;
    locald.f = System.currentTimeMillis();
    this.a = locald;
  }
  
  private Boolean a(String paramString1, String paramString2, HashMap<String, String> paramHashMap, long paramLong)
  {
    try
    {
      if (TextUtils.isEmpty(paramString1))
      {
        g.a("Collector", "invalid event id");
        return Boolean.valueOf(false);
      }
      if ((!b.a(paramString1, a.p)) || (paramString1.getBytes().length == 0))
      {
        g.a("Collector", "invalid event id");
        return Boolean.valueOf(false);
      }
      if ((paramString2 != null) && (!b.a(paramString2, a.p)))
      {
        g.a("Collector", "invalid event label");
        return Boolean.valueOf(false);
      }
      if (paramHashMap != null)
      {
        if (paramHashMap.size() > a.q)
        {
          g.a("Collector", "invalid event map, size large than " + a.q);
          return Boolean.valueOf(false);
        }
        paramString1 = paramHashMap.entrySet().iterator();
        while (paramString1.hasNext())
        {
          paramString2 = (Map.Entry)paramString1.next();
          if ((!b.a((String)paramString2.getKey(), a.p)) || (!b.a((String)paramString2.getValue(), a.p)))
          {
            g.a("Collector", "invalid event map " + String.format("invalid key:<%s> or value:<%s> ", new Object[] { paramString2.getKey(), paramString2.getValue() }));
            return Boolean.valueOf(false);
          }
        }
      }
    }
    catch (Exception paramString1)
    {
      g.a("Collector", "invalid event param");
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
  
  private void a()
  {
    f.c(this.a);
  }
  
  private void b()
  {
    f.a(this.a);
  }
  
  private void c()
  {
    f.b(this.a);
  }
  
  public void run()
  {
    try
    {
      if (!a(this.a.b, this.a.c, this.a.d, this.a.e).booleanValue()) {
        return;
      }
      if (TextUtils.isEmpty(a.f))
      {
        g.c("Collector", "Can't call onEvent before onResume");
        return;
      }
    }
    catch (Exception localException)
    {
      g.d("Collector", "call onEvent error:" + localException);
      return;
    }
    switch (this.b)
    {
    case 0: 
      a();
      return;
    case 1: 
      b();
      return;
    case 2: 
      c();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */