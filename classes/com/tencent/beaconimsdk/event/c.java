package com.tencent.beaconimsdk.event;

import android.content.Context;
import com.tencent.beaconimsdk.a.e;

public final class c
{
  private static c a = null;
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = "";
  private String f = "";
  private String g = "";
  private String h = "";
  
  private c(Context paramContext)
  {
    if (paramContext == null) {
      com.tencent.beaconimsdk.c.a.d(" DetailUserInfo context == null? pls check!", new Object[0]);
    }
    com.tencent.beaconimsdk.c.a.b(" start to create DetailUserInfo", new Object[0]);
    long l = System.currentTimeMillis();
    e.a(paramContext);
    this.b = e.b(paramContext);
    com.tencent.beaconimsdk.c.a.b(" imei:" + this.b, new Object[0]);
    if (!"".equals(this.b)) {}
    try
    {
      if ("".equals(com.tencent.beaconimsdk.a.a.b(paramContext, "IMEI_DENGTA", ""))) {
        com.tencent.beaconimsdk.a.a.a(paramContext, "IMEI_DENGTA", this.b);
      }
      this.e = e.d(paramContext);
      this.g = com.tencent.beaconimsdk.a.a.b(paramContext, "QIMEI_DENGTA", "");
      StringBuilder localStringBuilder;
      if ("".equals(this.g))
      {
        if (this.b.equals(""))
        {
          str = this.e;
          this.g = str;
        }
      }
      else
      {
        this.c = e.e(paramContext);
        if ("".equals(this.c))
        {
          localStringBuilder = new StringBuilder();
          str = e.f("/sys/class/net/eth0/address");
          if ((!str.trim().equals("")) && (str.length() >= 17)) {
            break label390;
          }
        }
      }
      label390:
      for (String str = "";; str = str.toLowerCase().substring(0, 17))
      {
        this.c = str;
        this.d = e.c(paramContext);
        this.f = e.c(com.tencent.beaconimsdk.a.a.a(paramContext));
        this.h = e.d();
        com.tencent.beaconimsdk.c.a.b(" detail create cost: %d  values:\n %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), toString() });
        return;
        str = this.b;
        break;
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static c a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new c(paramContext);
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
  
  public final String f()
  {
    try
    {
      String str = this.g;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String g()
  {
    return this.h;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */