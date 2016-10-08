package com.tencent.beacon.event;

import android.content.Context;
import com.tencent.beacon.a.f;
import com.tencent.beacon.a.h;

public final class e
{
  private static e a = null;
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = "";
  private String f = "";
  
  private e(Context paramContext)
  {
    if (paramContext == null) {
      com.tencent.beacon.e.b.d(" DetailUserInfo context == null? pls check!", new Object[0]);
    }
    com.tencent.beacon.e.b.b(" start to create DetailUserInfo", new Object[0]);
    long l = System.currentTimeMillis();
    h.a(paramContext);
    f localf = f.m();
    this.b = h.b(paramContext);
    com.tencent.beacon.e.b.b(" imei:" + this.b, new Object[0]);
    if (!"".equals(this.b)) {}
    try
    {
      if ("".equals(com.tencent.beacon.a.b.b(paramContext, "IMEI_DENGTA", ""))) {
        com.tencent.beacon.a.b.a(paramContext, "IMEI_DENGTA", this.b);
      }
      if ("".equals(localf.i())) {
        localf.c(this.b);
      }
      this.c = h.e(paramContext);
      this.d = h.c(paramContext);
      this.e = h.d(paramContext);
      String str = localf.k();
      com.tencent.beacon.e.b.b("tmpChannel: %s", new Object[] { str });
      if ((str != null) && (!"".equals(str))) {
        this.f = h.d(str);
      }
      for (;;)
      {
        com.tencent.beacon.e.b.b(" detail create cost: %d  values:\n %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), toString() });
        return;
        this.f = h.d(com.tencent.beacon.a.b.b(paramContext));
        localf.d(this.f);
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static e a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new e(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public final String a()
  {
    try
    {
      String str = this.b;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String b()
  {
    try
    {
      String str = this.c;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String c()
  {
    try
    {
      String str = this.d;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String d()
  {
    try
    {
      String str = this.e;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String e()
  {
    try
    {
      String str = this.f;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */