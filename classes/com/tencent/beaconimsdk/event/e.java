package com.tencent.beaconimsdk.event;

import com.tencent.beaconimsdk.c.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class e
  implements Cloneable
{
  private int a = 12;
  private int b = 60;
  private int c = 12;
  private int d = 60;
  private int e = 20;
  private boolean f = false;
  private boolean g = true;
  private Set<String> h = null;
  private Map<String, Float> i = null;
  private boolean j = false;
  
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
  
  private e i()
  {
    try
    {
      e locale = new e();
      locale.d(this.d);
      locale.c(this.c);
      locale.e(this.e);
      locale.b(this.b);
      locale.a(this.a);
      return locale;
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
      int k = this.a;
      return k;
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
        int k;
        if (str != null)
        {
          k = Integer.valueOf(str).intValue();
          if ((k > 0) && (k <= 50)) {
            this.a = k;
          }
        }
        str = (String)paramMap.get("realDelayUp");
        if (str != null)
        {
          k = Integer.valueOf(str).intValue();
          if ((k >= 10) && (k <= 600)) {
            this.b = k;
          }
        }
        str = (String)paramMap.get("comNumDB");
        if (str != null)
        {
          k = Integer.valueOf(str).intValue();
          if ((k > 0) && (k <= 50)) {
            this.c = k;
          }
        }
        str = (String)paramMap.get("comDelayDB");
        if (str != null)
        {
          k = Integer.valueOf(str).intValue();
          if ((k >= 30) && (k <= 600)) {
            this.d = k;
          }
        }
        str = (String)paramMap.get("comNumUp");
        if (str != null)
        {
          k = Integer.valueOf(str).intValue();
          if ((k > 0) && (k <= 100)) {
            this.e = k;
          }
        }
        str = (String)paramMap.get("heartOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            continue;
          }
          this.g = true;
        }
        str = (String)paramMap.get("comPollUp");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label383;
          }
          this.f = true;
        }
        str = (String)paramMap.get("accessTestOnOff");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label403;
          }
          a.b = true;
        }
        str = (String)paramMap.get("upAc");
        if (str != null)
        {
          if (!str.toLowerCase().equals("y")) {
            break label422;
          }
          this.j = true;
        }
        paramMap.get("appendXMeths");
      }
      catch (Exception paramMap)
      {
        a.a(paramMap);
        continue;
      }
      finally {}
      return;
      if (str.toLowerCase().equals("n"))
      {
        this.g = false;
        continue;
        label383:
        if (str.toLowerCase().equals("n"))
        {
          this.f = false;
          continue;
          label403:
          if (str.toLowerCase().equals("n"))
          {
            a.b = false;
            continue;
            label422:
            if (str.toLowerCase().equals("n")) {
              this.j = false;
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
      this.h = paramSet;
      return;
    }
    finally
    {
      paramSet = finally;
      throw paramSet;
    }
  }
  
  public final boolean a(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (this.h != null)
      {
        bool1 = bool2;
        if (this.h.size() > 0) {
          bool1 = this.h.contains(paramString);
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
      int k = this.b;
      return k;
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
      if (this.i == null) {
        this.i = new HashMap();
      }
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
      {
        String[] arrayOfString = ((String)paramSet.next()).split(",");
        int k = arrayOfString.length;
        if (k == 3) {
          try
          {
            float f1 = Float.valueOf(arrayOfString[1]).floatValue() / Float.valueOf(arrayOfString[2]).floatValue();
            this.i.put(arrayOfString[0].toLowerCase(), Float.valueOf(f1));
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
        if (this.i != null)
        {
          Object localObject = this.i.get(paramString);
          if (localObject != null) {}
        }
        else
        {
          bool = true;
          return bool;
        }
        int k = (int)(((Float)this.i.get(paramString.toLowerCase())).floatValue() * 1000.0F);
        int m = new Random().nextInt(1000);
        if (m + 1 > k) {
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
      int k = this.c;
      return k;
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
      int k = this.d;
      return k;
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
      int k = this.e;
      return k;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean f()
  {
    return this.g;
  }
  
  public final boolean g()
  {
    return this.f;
  }
  
  public final boolean h()
  {
    return this.j;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */