package com.tencent.beacon.event;

import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class g
  implements Cloneable
{
  private int a = 12;
  private int b = 60;
  private int c = 12;
  private int d = 60;
  private int e = 20;
  private int f = 10485760;
  private boolean g = false;
  private int h = 60;
  private int i = 600;
  private boolean j = true;
  private boolean k = false;
  private boolean l = false;
  private int m = 30;
  private boolean n = true;
  private boolean o = true;
  private Set<String> p = null;
  private Map<String, Float> q = null;
  private boolean r = false;
  private int s = 600;
  private boolean t = false;
  private boolean u = false;
  private boolean v = false;
  private int w = 180;
  private boolean x = true;
  
  private void a(int paramInt)
  {
    if (paramInt > 0) {}
    try
    {
      this.a = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void b(int paramInt)
  {
    if (paramInt > 0) {}
    try
    {
      this.b = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void c(int paramInt)
  {
    if (paramInt > 0) {}
    try
    {
      this.c = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void d(int paramInt)
  {
    if (paramInt > 0) {}
    try
    {
      this.d = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void e(int paramInt)
  {
    if (paramInt > 0) {}
    try
    {
      this.e = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void f(int paramInt)
  {
    if (paramInt > 0) {}
    try
    {
      this.f = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private g w()
  {
    try
    {
      g localg = new g();
      localg.d(this.d);
      localg.c(this.c);
      localg.e(this.e);
      localg.f(this.f);
      localg.b(this.b);
      localg.a(this.a);
      return localg;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int a()
  {
    try
    {
      int i1 = this.a;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(Map<String, String> paramMap)
  {
    if (paramMap != null) {}
    for (;;)
    {
      String str;
      try
      {
        str = (String)paramMap.get("realNumUp");
        int i1;
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 > 0) && (i1 <= 50)) {
            this.a = i1;
          }
        }
        str = (String)paramMap.get("realDelayUp");
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 >= 10) && (i1 <= 600)) {
            this.b = i1;
          }
        }
        str = (String)paramMap.get("comNumDB");
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 > 0) && (i1 <= 50)) {
            this.c = i1;
          }
        }
        str = (String)paramMap.get("comDelayDB");
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 >= 30) && (i1 <= 600)) {
            this.d = i1;
          }
        }
        str = (String)paramMap.get("comNumUp");
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 > 0) && (i1 <= 100)) {
            this.e = i1;
          }
        }
        str = (String)paramMap.get("dailyNetFlowLimit");
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 >= 204800) && (i1 <= 10485760)) {
            this.f = i1;
          }
        }
        str = (String)paramMap.get("runInfoPeriod");
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 >= 30) && (i1 <= 300)) {
            this.h = i1;
          }
        }
        str = (String)paramMap.get("useTimeUpPeriod");
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 >= 300) && (i1 <= 1800)) {
            this.i = i1;
          }
        }
        str = (String)paramMap.get("useTimeOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            continue;
          }
          this.j = true;
        }
        str = (String)paramMap.get("proChangePeriod");
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 >= 10) && (i1 <= 300)) {
            this.m = i1;
          }
        }
        str = (String)paramMap.get("proChangeOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1173;
          }
          this.n = true;
        }
        str = (String)paramMap.get("heartOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1193;
          }
          this.o = true;
        }
        str = (String)paramMap.get("appLogUploadOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1213;
          }
          str = (String)paramMap.get("appLogRealTimeUpload");
          if ((str != null) && (!str.toLowerCase().equals("y"))) {
            str.toLowerCase().equals("n");
          }
          str = (String)paramMap.get("appLogOutDay");
          if (str != null) {
            Long.valueOf(str).longValue();
          }
          if ((String)paramMap.get("logDailyConsumeLimit") != null) {
            Integer.valueOf(str).intValue();
          }
          str = (String)paramMap.get("appLogSizeLimit");
          if (str != null) {
            Integer.valueOf(str).intValue();
          }
          str = (String)paramMap.get("appLogRecordMax");
          if (str != null) {
            Integer.valueOf(str).intValue();
          }
          str = (String)paramMap.get("appLogFileTotalMaxSize");
          if (str != null) {
            Integer.valueOf(str).intValue();
          }
        }
        str = (String)paramMap.get("appNetConOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1226;
          }
          this.r = true;
        }
        str = (String)paramMap.get("netConQuePeriod");
        if (str != null)
        {
          i1 = Integer.valueOf(str).intValue();
          if ((i1 >= 60) && (i1 <= 1200)) {
            this.s = i1;
          }
        }
        str = (String)paramMap.get("memOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1246;
          }
          this.k = true;
        }
        str = (String)paramMap.get("cpuOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1266;
          }
          this.l = true;
        }
        str = (String)paramMap.get("heatmapOnOff");
        if ((str != null) && (!str.toLowerCase().equals("y"))) {
          str.toLowerCase().equals("n");
        }
        str = (String)paramMap.get("heatmapUpMax");
        if (str != null) {
          Integer.valueOf(str).intValue();
        }
        str = (String)paramMap.get("heatmapPeriod");
        if (str != null) {
          Integer.valueOf(str).intValue();
        }
        str = (String)paramMap.get("installOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1286;
          }
          this.t = true;
        }
        str = (String)paramMap.get("useAppOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1306;
          }
          this.u = true;
        }
        str = (String)paramMap.get("isAllApp");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1326;
          }
          this.v = true;
        }
        if (this.u)
        {
          str = (String)paramMap.get("useAppCollPer");
          if (str != null)
          {
            i1 = Integer.valueOf(str).intValue();
            if ((i1 >= 60) && (i1 <= 3600)) {
              this.w = i1;
            }
          }
        }
        str = (String)paramMap.get("upQa");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label1346;
          }
          this.x = true;
        }
        str = (String)paramMap.get("apmUIOnOff");
        if ((str != null) && (!str.toLowerCase().equals("y"))) {
          str.toLowerCase().equals("n");
        }
        paramMap = (String)paramMap.get("comPollUp");
        if (paramMap != null)
        {
          if (!paramMap.toLowerCase().equals("y")) {
            break label1366;
          }
          this.g = true;
        }
      }
      catch (Exception paramMap)
      {
        paramMap.printStackTrace();
        continue;
      }
      finally {}
      return;
      if (str.toLowerCase().equals("n"))
      {
        this.j = false;
        continue;
        label1173:
        if (str.toLowerCase().equals("n"))
        {
          this.n = false;
          continue;
          label1193:
          if (str.toLowerCase().equals("n"))
          {
            this.o = false;
            continue;
            label1213:
            str.toLowerCase().equals("n");
            continue;
            label1226:
            if (str.toLowerCase().equals("n"))
            {
              this.r = false;
              continue;
              label1246:
              if (str.toLowerCase().equals("n"))
              {
                this.k = false;
                continue;
                label1266:
                if (str.toLowerCase().equals("n"))
                {
                  this.l = false;
                  continue;
                  label1286:
                  if (str.toLowerCase().equals("n"))
                  {
                    this.t = false;
                    continue;
                    label1306:
                    if (str.toLowerCase().equals("n"))
                    {
                      this.u = false;
                      continue;
                      label1326:
                      if (str.toLowerCase().equals("n"))
                      {
                        this.v = false;
                        continue;
                        label1346:
                        if (str.toLowerCase().equals("n"))
                        {
                          this.x = false;
                          continue;
                          label1366:
                          if (paramMap.toLowerCase().equals("n")) {
                            this.g = false;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final void a(Set<String> paramSet)
  {
    try
    {
      this.p = paramSet;
      return;
    }
    finally
    {
      paramSet = finally;
      throw paramSet;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.j = false;
  }
  
  public final boolean a(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (this.p != null)
      {
        bool1 = bool2;
        if (this.p.size() > 0) {
          bool1 = this.p.contains(paramString);
        }
      }
      return bool1;
    }
    finally {}
  }
  
  public final int b()
  {
    try
    {
      int i1 = this.b;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b(Set<String> paramSet)
  {
    try
    {
      if (this.q == null) {
        this.q = new HashMap();
      }
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
      {
        String[] arrayOfString = ((String)paramSet.next()).split(",");
        int i1 = arrayOfString.length;
        if (i1 == 3) {
          try
          {
            float f1 = Float.valueOf(arrayOfString[1]).floatValue() / Float.valueOf(arrayOfString[2]).floatValue();
            this.q.put(arrayOfString[0].toLowerCase(), Float.valueOf(f1));
          }
          catch (Exception localException) {}
        }
      }
      return;
    }
    finally {}
  }
  
  public final boolean b(String paramString)
  {
    for (;;)
    {
      try
      {
        boolean bool;
        if (this.q != null)
        {
          Object localObject = this.q.get(paramString);
          if (localObject != null) {}
        }
        else
        {
          bool = true;
          return bool;
        }
        int i1 = (int)(((Float)this.q.get(paramString.toLowerCase())).floatValue() * 1000.0F);
        int i2 = new Random().nextInt(1000);
        if (i2 + 1 > i1) {
          bool = false;
        } else {
          bool = true;
        }
      }
      finally {}
    }
  }
  
  public final int c()
  {
    try
    {
      int i1 = this.c;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int d()
  {
    try
    {
      int i1 = this.d;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int e()
  {
    try
    {
      int i1 = this.e;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int f()
  {
    try
    {
      int i1 = this.f;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int g()
  {
    try
    {
      int i1 = this.i;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int h()
  {
    return this.h;
  }
  
  public final boolean i()
  {
    return this.j;
  }
  
  public final int j()
  {
    return this.m;
  }
  
  public final boolean k()
  {
    return this.n;
  }
  
  public final boolean l()
  {
    return this.o;
  }
  
  public final boolean m()
  {
    if (Integer.parseInt(Build.VERSION.SDK) < 8) {
      return false;
    }
    return this.r;
  }
  
  public final int n()
  {
    return this.s;
  }
  
  public final boolean o()
  {
    return this.l;
  }
  
  public final boolean p()
  {
    return this.k;
  }
  
  public final boolean q()
  {
    return this.t;
  }
  
  public final boolean r()
  {
    return this.u;
  }
  
  public final boolean s()
  {
    return this.v;
  }
  
  public final int t()
  {
    return this.w;
  }
  
  public final boolean u()
  {
    return this.x;
  }
  
  public final boolean v()
  {
    return this.g;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */