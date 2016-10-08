package com.baidu.location.e;

import android.os.Bundle;
import com.baidu.location.b.b;
import com.baidu.location.h.g;
import com.baidu.location.h.h;
import com.baidu.location.h.l;
import com.baidu.location.h.m;
import com.baidu.location.h.n;
import com.baidu.location.h.p;
import com.baidu.location.h.q;
import com.baidu.location.h.r;

class al
{
  private static al a;
  private l b = null;
  private n c = null;
  private long d = 0L;
  private final long e = 1000L;
  private String f = null;
  
  public static al a()
  {
    try
    {
      if (a == null) {
        a = new al();
      }
      al localal = a;
      return localal;
    }
    finally {}
  }
  
  private void a(String paramString)
  {
    this.f = paramString;
    Bundle localBundle = new Bundle();
    if ((paramString != null) && (!paramString.equals(""))) {
      localBundle.putByteArray("locationtag", paramString.getBytes());
    }
    for (;;)
    {
      f.a().a(localBundle, 601);
      return;
      localBundle.putByteArray("locationtag", null);
    }
  }
  
  private boolean a(l paraml)
  {
    boolean bool2 = true;
    l locall = r.a().k();
    boolean bool1;
    if (paraml == locall) {
      bool1 = false;
    }
    do
    {
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (locall == null);
        bool1 = bool2;
      } while (paraml == null);
      bool1 = bool2;
    } while (!paraml.c(locall));
    return false;
  }
  
  private boolean a(n paramn)
  {
    boolean bool2 = true;
    n localn = g.a().f();
    boolean bool1;
    if (localn == paramn) {
      bool1 = false;
    }
    do
    {
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (localn == null);
        bool1 = bool2;
      } while (paramn == null);
      bool1 = bool2;
    } while (!paramn.a(localn));
    return false;
  }
  
  public void b()
  {
    if ((System.currentTimeMillis() - this.d < 1000L) && (this.f != null))
    {
      a(this.f);
      return;
    }
    this.d = System.currentTimeMillis();
    boolean bool1 = a(this.b);
    boolean bool2 = a(this.c);
    if ((!bool1) && (!bool2) && (this.f != null))
    {
      a(this.f);
      return;
    }
    this.c = g.a().f();
    this.b = r.a().k();
    StringBuffer localStringBuffer = new StringBuffer(1024);
    if ((this.c != null) && (this.c.c())) {
      localStringBuffer.append(this.c.j());
    }
    if ((this.b != null) && (this.b.a() > 1)) {
      localStringBuffer.append(this.b.a(15));
    }
    String str = h.a().f();
    if (str != null) {
      localStringBuffer.append(str);
    }
    localStringBuffer.append("&sema=aptag");
    localStringBuffer.append(b.a().a(false));
    localStringBuffer.append(f.a().c());
    new am(this).a(localStringBuffer.toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */