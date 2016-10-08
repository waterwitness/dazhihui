package com.tencent.beacon.a;

import android.content.Context;
import android.os.Process;
import com.tencent.beacon.a.a.e;
import com.tencent.beacon.b.a;
import com.tencent.beacon.e.b;
import com.tencent.beacon.e.c;
import com.tencent.beacon.upload.UploadHandleListener;
import com.tencent.beacon.upload.i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class j
  implements UploadHandleListener
{
  private static j e = null;
  private static long f = 1073741824L;
  private static long g = 209715200L;
  private e a;
  private e b;
  private e c;
  private Context d = null;
  
  private j(Context paramContext)
  {
    this.d = paramContext;
    i.a(this.d).a(this);
    d();
    if (e() > 0) {
      f();
    }
  }
  
  private e a()
  {
    long l2;
    long l1;
    try
    {
      int i = Process.myUid();
      Object localObject = Class.forName("android.net.TrafficStats");
      if (localObject == null) {
        break label505;
      }
      l2 = ((Long)((Class)localObject).getMethod("getUidRxBytes", new Class[] { Integer.TYPE }).invoke(null, new Object[] { Integer.valueOf(i) })).longValue();
      l1 = ((Long)((Class)localObject).getMethod("getUidTxBytes", new Class[] { Integer.TYPE }).invoke(null, new Object[] { Integer.valueOf(i) })).longValue();
      localObject = h.q(this.d);
      if (localObject != null)
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          this.c = ((e)((Iterator)localObject).next());
        }
      }
      if (this.c == null) {
        break label453;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return null;
    }
    boolean bool;
    long l3;
    long l4;
    long l6;
    long l5;
    if ((l2 != this.c.i) || (l1 != this.c.h))
    {
      bool = c.a(this.d);
      this.c.b = System.currentTimeMillis();
      l3 = 0L;
      l4 = 0L;
      l6 = 0L;
      l5 = 0L;
      if (l2 - this.c.i > 0L) {
        l3 = l2 - this.c.i;
      }
      if (l1 - this.c.h <= 0L) {
        break label513;
      }
      l4 = l1 - this.c.h;
    }
    for (;;)
    {
      e locale = this.c;
      locale.g = (l3 + locale.g);
      locale = this.c;
      locale.f = (l4 + locale.f);
      locale = this.c;
      locale.d = (l6 + locale.d);
      locale = this.c;
      locale.e = (l5 + locale.e);
      this.c.i = l2;
      this.c.h = l1;
      if ((this.c.g < f) && (this.c.f < g) && (this.c.d < f) && (this.c.e < f)) {
        c(this.c);
      }
      for (;;)
      {
        return this.c;
        this.c.g = 0L;
        this.c.f = 0L;
        this.c.d = 0L;
        this.c.e = 0L;
        c(this.c);
      }
      label453:
      this.c = new e(2, System.currentTimeMillis(), 0L, 0L, 0L, 0L, 0L);
      this.c.i = l2;
      this.c.h = l1;
      c(this.c);
      locale = this.c;
      return locale;
      label505:
      l1 = 0L;
      l2 = 0L;
      break;
      label513:
      if (bool) {
        l6 = l3 + l4;
      } else {
        l5 = l3 + l4;
      }
    }
  }
  
  public static j a(Context paramContext)
  {
    try
    {
      if (e == null) {
        e = new j(paramContext);
      }
      paramContext = e;
      return paramContext;
    }
    finally {}
  }
  
  private void a(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    for (;;)
    {
      long l3;
      long l2;
      long l1;
      try
      {
        l3 = new Date().getTime();
        l2 = paramLong1 + paramLong2;
        if (paramBoolean)
        {
          l1 = l2;
          break label277;
          if (this.b == null)
          {
            this.b = new e(1, l3, 1L, l1, l2, paramLong1, paramLong2);
            if (this.a != null) {
              break label190;
            }
            this.a = new e(0, l3, 1L, l1, l2, paramLong1, paramLong2);
          }
        }
        else
        {
          l1 = 0L;
          break label277;
        }
        long l4 = this.b.a();
        this.b = new e(1, this.b.b, 1L + this.b.c, this.b.d + l1, this.b.e + l2, this.b.f + paramLong1, this.b.g + paramLong2);
        this.b.a(l4);
        continue;
        l3 = this.a.a();
      }
      finally {}
      label190:
      this.a = new e(0, this.a.b, this.a.c + 1L, l1 + this.a.d, l2 + this.a.e, this.a.f + paramLong1, this.a.g + paramLong2);
      this.a.a(l3);
      continue;
      label277:
      if (paramBoolean) {
        l2 = 0L;
      }
    }
  }
  
  public static void a(Context paramContext, e parame)
  {
    parame.g = 0L;
    parame.f = 0L;
    parame.d = 0L;
    parame.e = 0L;
    a(paramContext).c(parame);
  }
  
  private void a(e parame)
  {
    try
    {
      this.a = parame;
      return;
    }
    finally
    {
      parame = finally;
      throw parame;
    }
  }
  
  private e b()
  {
    try
    {
      e locale = this.a;
      return locale;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static e b(Context paramContext)
  {
    return a(paramContext).b();
  }
  
  private void b(e parame)
  {
    try
    {
      this.b = parame;
      return;
    }
    finally
    {
      parame = finally;
      throw parame;
    }
  }
  
  private e c()
  {
    try
    {
      e();
      e locale = this.b;
      return locale;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static e c(Context paramContext)
  {
    return a(paramContext).a();
  }
  
  private void c(e parame)
  {
    ArrayList localArrayList = new ArrayList();
    if (parame != null) {
      localArrayList.add(parame);
    }
    if (localArrayList.size() > 0) {
      h.c(this.d, (e[])localArrayList.toArray(new e[localArrayList.size()]));
    }
  }
  
  private void d()
  {
    Object localObject = h.p(this.d);
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        e locale = (e)((Iterator)localObject).next();
        if (locale.a == 0) {
          a(locale);
        } else if (locale.a == 1) {
          b(locale);
        }
      }
    }
  }
  
  public static void d(Context paramContext)
  {
    paramContext = a(paramContext);
    long l = new Date().getTime();
    e locale = paramContext.b();
    if ((locale != null) && (locale.a() >= 0L)) {
      h.b(paramContext.d, new e[] { locale });
    }
    paramContext.a(new e(0, l, 0L, 0L, 0L, 0L, 0L));
  }
  
  private int e()
  {
    for (;;)
    {
      try
      {
        long l1 = a.s();
        long l2 = new Date().getTime();
        int i = 0;
        if ((this.b == null) || (this.b.b < l1))
        {
          this.b = new e(1, l2, 0L, 0L, 0L, 0L, 0L);
          i = 1;
        }
        if (this.a == null)
        {
          this.a = new e(0, l2, 0L, 0L, 0L, 0L, 0L);
          i += 1;
          return i;
        }
      }
      finally {}
    }
  }
  
  public static void e(Context paramContext)
  {
    paramContext = a(paramContext);
    long l = new Date().getTime();
    e locale = paramContext.c;
    if ((locale != null) && (locale.a() >= 0L)) {
      h.b(paramContext.d, new e[] { locale });
    }
    paramContext.a(new e(2, l, 0L, 0L, 0L, 0L, 0L));
  }
  
  public static e f(Context paramContext)
  {
    return a(paramContext).c();
  }
  
  private void f()
  {
    ArrayList localArrayList = new ArrayList();
    e locale = b();
    if (locale != null) {
      localArrayList.add(locale);
    }
    locale = c();
    if (locale != null) {
      localArrayList.add(locale);
    }
    if (localArrayList.size() > 0) {
      h.a(this.d, (e[])localArrayList.toArray(new e[localArrayList.size()]));
    }
  }
  
  public final void onUploadEnd(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, String paramString)
  {
    b.h(" req:%d  res:%d  send:%d  recv:%d  result: %b  msg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(paramBoolean), paramString });
    if (paramInt1 != 5)
    {
      d();
      e();
      a(paramLong1, paramLong2, c.a(this.d));
      f();
      b.f(" [total:%s] \n[today:%s]", new Object[] { b(), c() });
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */