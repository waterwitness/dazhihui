package com.tencent.beaconimsdk.event;

import android.content.Context;
import com.tencent.beaconimsdk.a.b.d.a;
import com.tencent.beaconimsdk.a.c;
import com.tencent.beaconimsdk.upload.UploadHandleListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Set;

public final class j
  extends Observable
  implements com.tencent.beaconimsdk.a.b.a, com.tencent.beaconimsdk.a.b.e, com.tencent.beaconimsdk.a.b.f
{
  private static j a = null;
  private e b = null;
  private g c = null;
  private g d = null;
  private boolean e = true;
  private boolean f = false;
  private Context g;
  private com.tencent.beaconimsdk.upload.f h;
  private boolean i;
  private int j = 0;
  private List<d> k = null;
  private Object l = new Object();
  private com.tencent.beaconimsdk.a.g m = null;
  
  private j(Context paramContext, com.tencent.beaconimsdk.upload.f paramf, UploadHandleListener paramUploadHandleListener)
  {
    if (paramContext == null)
    {
      com.tencent.beaconimsdk.c.a.c(" the context is null! init UserActionRecord failed!", new Object[0]);
      this.g = null;
      return;
    }
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {}
    for (this.g = localContext;; this.g = paramContext)
    {
      if (c.m() == null) {
        c.a(this.g);
      }
      if (this.k == null) {
        this.k = Collections.synchronizedList(new ArrayList(5));
      }
      this.h = paramf;
      if (paramf != null) {
        paramf.a(paramUploadHandleListener);
      }
      paramUploadHandleListener = com.tencent.beaconimsdk.a.b.b.a(this.g);
      paramUploadHandleListener.a(this);
      paramUploadHandleListener.a(this);
      paramUploadHandleListener.a(this);
      paramUploadHandleListener.a(0, paramf);
      paramUploadHandleListener.a(1, paramf);
      this.b = new e();
      this.c = new a(paramContext);
      this.d = new i(paramContext);
      this.e = true;
      new com.tencent.beaconimsdk.a.d().a(this.g);
      this.m = new com.tencent.beaconimsdk.a.g();
      paramContext = this.m;
      paramContext = this.g;
      return;
    }
  }
  
  public static j a(Context paramContext, com.tencent.beaconimsdk.upload.f paramf, UploadHandleListener paramUploadHandleListener)
  {
    try
    {
      if (a == null)
      {
        com.tencent.beaconimsdk.c.a.e(" create ua instance ", new Object[0]);
        a = new j(paramContext, paramf, paramUploadHandleListener);
      }
      com.tencent.beaconimsdk.c.a.e(" return ua instance ", new Object[0]);
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static com.tencent.beaconimsdk.upload.f a(Context paramContext)
  {
    try
    {
      paramContext = com.tencent.beaconimsdk.upload.g.a(paramContext);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private void a(int paramInt)
  {
    try
    {
      this.j = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    com.tencent.beaconimsdk.c.a.e(" onUA: %s,%b,%d,%d,%b,%b", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3) });
    j localj = d();
    if ((localj != null) && (!localj.m()))
    {
      localj.k.add(new d(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2));
      return true;
    }
    if (!i()) {
      return false;
    }
    if (localj.b.a(paramString))
    {
      com.tencent.beaconimsdk.c.a.c("onUserAction return false, because eventName:[%s] is not allowed in server strategy!", new Object[] { paramString });
      return false;
    }
    g localg;
    if ((!paramBoolean1) || ((paramBoolean1) && (localj.b.b(paramString)))) {
      if (paramBoolean2) {
        localg = localj.k();
      }
    }
    while (localg != null)
    {
      return localg.a(a.a(localj.g, paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean3));
      localg = localj.j();
      continue;
      com.tencent.beaconimsdk.c.a.c("onUserAction return false, because eventName:[%s] is sampled by svr rate!", new Object[] { paramString });
      return false;
    }
    return false;
  }
  
  public static void c(boolean paramBoolean)
  {
    Object localObject = d();
    if (localObject != null)
    {
      g localg = ((j)localObject).j();
      if (localg != null) {
        localg.b(paramBoolean);
      }
      localObject = ((j)localObject).k();
      if (localObject != null) {
        ((g)localObject).b(paramBoolean);
      }
    }
  }
  
  public static j d()
  {
    try
    {
      j localj = a;
      return localj;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean d(boolean paramBoolean)
  {
    j localj = d();
    if (localj == null) {
      com.tencent.beaconimsdk.c.a.c(" ua module not ready!", new Object[0]);
    }
    while (!i()) {
      return false;
    }
    return localj.e(paramBoolean);
  }
  
  private void f(boolean paramBoolean)
  {
    try
    {
      if (paramBoolean != e())
      {
        g localg = j();
        if (localg != null) {
          localg.a(paramBoolean);
        }
        localg = k();
        if (localg != null) {
          localg.a(paramBoolean);
        }
        this.i = paramBoolean;
      }
      return;
    }
    finally {}
  }
  
  private static boolean i()
  {
    boolean bool1 = false;
    j localj = d();
    if (localj == null) {
      com.tencent.beaconimsdk.c.a.d("isModuleAble:not init ua", new Object[0]);
    }
    do
    {
      boolean bool2;
      do
      {
        return bool1;
        bool2 = localj.e();
        bool1 = bool2;
      } while (!bool2);
      bool1 = bool2;
    } while (!localj.l());
    return localj.m();
  }
  
  private g j()
  {
    try
    {
      g localg = this.c;
      return localg;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private g k()
  {
    try
    {
      g localg = this.d;
      return localg;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean l()
  {
    try
    {
      boolean bool = this.e;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean m()
  {
    try
    {
      boolean bool = this.f;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void n()
  {
    try
    {
      this.f = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void o()
  {
    try
    {
      if ((this.k == null) || (this.k.size() <= 0)) {
        break label101;
      }
      Iterator localIterator = this.k.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        a(locald.a, locald.b, locald.c, locald.d, locald.e, locald.f, false);
      }
      this.k.clear();
    }
    finally {}
    this.k = null;
    label101:
  }
  
  private void p()
  {
    try
    {
      if ((!e()) && (!this.b.f())) {
        return;
      }
      Object localObject = com.tencent.beaconimsdk.a.b.b.a(this.g);
      if (localObject != null)
      {
        localObject = ((com.tencent.beaconimsdk.a.b.b)localObject).e().b(1);
        if (localObject != null)
        {
          localObject = ((d.a)localObject).b();
          if ((localObject != null) && (!"".equals(((String)localObject).trim())))
          {
            new f(this.g).b();
            return;
          }
        }
      }
    }
    catch (Exception localException)
    {
      com.tencent.beaconimsdk.c.a.c(" startHeart failed! " + localException.getMessage(), new Object[0]);
    }
  }
  
  private void q()
  {
    if (com.tencent.beaconimsdk.a.e.a(this.g) == null)
    {
      com.tencent.beaconimsdk.c.a.c(" DeviceInfo == null?,return", new Object[0]);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("A33", com.tencent.beaconimsdk.a.e.g(this.g));
    localHashMap.put("A63", "Y");
    if (com.tencent.beaconimsdk.a.a.b(this.g))
    {
      localHashMap.put("A21", "Y");
      if (!com.tencent.beaconimsdk.a.b.b.a(this.g).g()) {
        break label212;
      }
      localHashMap.put("A45", "Y");
      label108:
      if (!com.tencent.beaconimsdk.a.a.g(this.g)) {
        break label228;
      }
      localHashMap.put("A66", "F");
      label131:
      localHashMap.put("A68", com.tencent.beaconimsdk.a.a.h(this.g));
      if (!com.tencent.beaconimsdk.a.a.b) {
        break label244;
      }
    }
    label212:
    label228:
    label244:
    for (String str = "Y";; str = "N")
    {
      localHashMap.put("A85", str);
      a("rqd_applaunched", true, 0L, 0L, localHashMap, true, false);
      return;
      localHashMap.put("A21", "N");
      break;
      localHashMap.put("A45", "N");
      break label108;
      localHashMap.put("A66", "B");
      break label131;
    }
  }
  
  public final void a()
  {
    a(h() + 1);
  }
  
  public final void a(com.tencent.beaconimsdk.a.b.d paramd)
  {
    if (paramd != null)
    {
      paramd = paramd.b(1);
      if (paramd != null)
      {
        boolean bool = paramd.a();
        if (e() != bool)
        {
          com.tencent.beaconimsdk.c.a.f("UAR onCommonStrategyChange setUsable:%b ", new Object[] { Boolean.valueOf(bool) });
          f(bool);
        }
      }
    }
  }
  
  public final void a(Map<String, String> paramMap)
  {
    if ((paramMap != null) && (paramMap.size() > 0) && (this.b != null)) {
      this.b.a(paramMap);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    Object localObject = com.tencent.beaconimsdk.a.b.b.a(this.g);
    if (localObject != null)
    {
      localObject = ((com.tencent.beaconimsdk.a.b.b)localObject).e().b(1);
      if ((localObject != null) && (((d.a)localObject).a() != paramBoolean))
      {
        ((d.a)localObject).a(paramBoolean);
        if (paramBoolean != e()) {
          f(paramBoolean);
        }
      }
    }
  }
  
  public final void b()
  {
    n();
    for (;;)
    {
      try
      {
        localObject = com.tencent.beaconimsdk.a.b.b.a(this.g).e();
        if (localObject != null) {
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        Object localObject;
        Set localSet;
        com.tencent.beaconimsdk.c.a.a(localThrowable);
        com.tencent.beaconimsdk.c.a.d(" common query end error %s", new Object[] { localThrowable.toString() });
        continue;
        int n = -1;
        continue;
        n = 0;
        continue;
        com.tencent.beaconimsdk.c.a.b("event module is disable", new Object[0]);
        continue;
        if (n <= 0) {
          continue;
        }
        n = 1;
        continue;
      }
      o();
      if ((h() < 2) && (com.tencent.beaconimsdk.upload.g.a(this.g).a()))
      {
        p();
        q();
        if (this.b.h())
        {
          this.m.setChanged();
          this.m.notifyObservers(this.g);
        }
      }
      return;
      localObject = ((com.tencent.beaconimsdk.a.b.d)localObject).b(1);
      if ((localObject != null) && (this.b != null))
      {
        localSet = ((d.a)localObject).d();
        if ((localSet != null) && (localSet.size() > 0)) {
          this.b.a(localSet);
        }
        localSet = ((d.a)localObject).f();
        if ((localSet != null) && (localSet.size() > 0)) {
          this.b.b(localSet);
        }
      }
      if ((!e()) || (localObject == null)) {
        continue;
      }
      if (!e()) {
        continue;
      }
      n = com.tencent.beaconimsdk.a.e.j(this.g);
      continue;
      if (n != 0)
      {
        com.tencent.beaconimsdk.c.a.e(" asyn up module %d", new Object[] { Integer.valueOf(1) });
        com.tencent.beaconimsdk.a.b.a().a(new j.1(this));
      }
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if ((com.tencent.beaconimsdk.upload.g.a(this.g) != null) && (paramBoolean != com.tencent.beaconimsdk.upload.g.a(this.g).a()))
    {
      if (paramBoolean)
      {
        com.tencent.beaconimsdk.upload.g.a(this.g).a(true);
        p();
        q();
      }
    }
    else {
      return;
    }
    com.tencent.beaconimsdk.upload.g.a(this.g).a(false);
    Context localContext = this.g;
    com.tencent.beaconimsdk.a.b.a().a(108);
    com.tencent.beaconimsdk.a.a.a(localContext, "HEART_DENGTA", com.tencent.beaconimsdk.a.e.e());
    com.tencent.beaconimsdk.c.a.a("heartbeat uploaded sucess!", new Object[0]);
  }
  
  public final void c()
  {
    Context localContext = this.g;
    com.tencent.beaconimsdk.c.a.a(" RecordDAO.deleteRecords() start", new Object[0]);
    com.tencent.beaconimsdk.c.a.e(" ua first clean :%d", new Object[] { Integer.valueOf(com.tencent.beaconimsdk.a.a.a.a(localContext, new int[] { 1 })) });
    com.tencent.beaconimsdk.c.a.e(" ua remove strategy :%d", new Object[] { Integer.valueOf(com.tencent.beaconimsdk.a.e.i(this.g)) });
  }
  
  public final boolean e()
  {
    try
    {
      boolean bool = this.i;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean e(boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (this.l)
      {
        if (e())
        {
          n = com.tencent.beaconimsdk.a.e.j(this.g);
          if (n > 0) {
            try
            {
              if (this.h != null)
              {
                b localb = new b(this.g);
                localb.a(paramBoolean);
                this.h.a(localb);
              }
              return true;
            }
            catch (Throwable localThrowable)
            {
              com.tencent.beaconimsdk.c.a.c(" up common error: %s", new Object[] { localThrowable.toString() });
              com.tencent.beaconimsdk.c.a.a(localThrowable);
            }
          }
          return false;
        }
      }
      int n = -1;
    }
  }
  
  public final com.tencent.beaconimsdk.upload.f f()
  {
    return this.h;
  }
  
  public final e g()
  {
    return this.b;
  }
  
  public final int h()
  {
    try
    {
      int n = this.j;
      return n;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */