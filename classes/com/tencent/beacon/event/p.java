package com.tencent.beacon.event;

import android.content.Context;
import android.os.Process;
import com.tencent.beacon.a.b.e.a;
import com.tencent.beacon.a.k;
import com.tencent.beacon.upload.InitHandleListener;
import com.tencent.beacon.upload.UploadHandleListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class p
  implements com.tencent.beacon.a.b.b, com.tencent.beacon.a.b.f, com.tencent.beacon.a.b.g
{
  private static p d = null;
  public final Context a;
  public a b = null;
  public com.tencent.beacon.d.a c = null;
  private g e = null;
  private j f = null;
  private j g = null;
  private boolean h = true;
  private boolean i = false;
  private com.tencent.beacon.upload.h j;
  private boolean k;
  private int l = 0;
  private InitHandleListener m = null;
  private List<f> n = null;
  
  private p(Context paramContext, boolean paramBoolean, com.tencent.beacon.upload.h paramh, UploadHandleListener paramUploadHandleListener, InitHandleListener paramInitHandleListener)
  {
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.c(" the context is null! init UserActionRecord failed!", new Object[0]);
      this.a = null;
      return;
    }
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {}
    for (this.a = localContext;; this.a = paramContext)
    {
      if (com.tencent.beacon.a.f.m() == null) {
        com.tencent.beacon.a.f.a(this.a);
      }
      if (this.n == null) {
        this.n = Collections.synchronizedList(new ArrayList(5));
      }
      this.j = paramh;
      if (paramh != null)
      {
        paramh.a(0, new q(paramContext));
        paramh.a(paramUploadHandleListener);
      }
      paramUploadHandleListener = com.tencent.beacon.a.b.c.a(this.a);
      paramUploadHandleListener.a(this);
      paramUploadHandleListener.a(this);
      paramUploadHandleListener.a(1, this);
      paramUploadHandleListener.a(0, paramh);
      paramUploadHandleListener.a(1, paramh);
      this.e = new g();
      this.f = new b(paramContext);
      this.g = new l(paramContext);
      this.h = paramBoolean;
      this.m = paramInitHandleListener;
      this.c = new com.tencent.beacon.d.a(this.a);
      new com.tencent.beacon.a.g().a(this.a);
      return;
    }
  }
  
  public static p a(Context paramContext, boolean paramBoolean, com.tencent.beacon.upload.h paramh, UploadHandleListener paramUploadHandleListener, InitHandleListener paramInitHandleListener)
  {
    try
    {
      if (d == null)
      {
        com.tencent.beacon.e.b.e(" create ua instance ", new Object[0]);
        paramContext = new p(paramContext, true, paramh, paramUploadHandleListener, paramInitHandleListener);
        d = paramContext;
        paramContext.a(true);
      }
      com.tencent.beacon.e.b.e(" return ua instance ", new Object[0]);
      paramContext = d;
      return paramContext;
    }
    finally {}
  }
  
  public static com.tencent.beacon.upload.h a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      paramContext = com.tencent.beacon.upload.i.a(paramContext, paramBoolean);
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
      this.l = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    return a(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2, false);
  }
  
  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    com.tencent.beacon.e.b.e(" onUA: %s,%b,%d,%d,%b,%b", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3) });
    p localp = d();
    if ((localp != null) && (!localp.o()))
    {
      localp.n.add(new f(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2));
      return true;
    }
    if (!k()) {
      return false;
    }
    if (localp.e.a(paramString))
    {
      com.tencent.beacon.e.b.c("onUserAction return false, because eventName:[%s] is not allowed in server strategy!", new Object[] { paramString });
      return false;
    }
    j localj;
    if ((!paramBoolean1) || ((paramBoolean1) && (localp.e.b(paramString)))) {
      if (paramBoolean2) {
        localj = localp.m();
      }
    }
    while (localj != null)
    {
      return localj.a(b.a(localp.a, paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean3));
      localj = localp.l();
      continue;
      com.tencent.beacon.e.b.c("onUserAction return false, because eventName:[%s] is sampled by svr rate!", new Object[] { paramString });
      return false;
    }
    return false;
  }
  
  protected static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, boolean paramBoolean2, d... paramVarArgs)
  {
    com.tencent.beacon.e.b.a(" onMergeUserActionCommon start", new Object[0]);
    if (paramVarArgs == null) {}
    for (int i1 = 0;; i1 = paramVarArgs.length)
    {
      com.tencent.beacon.e.b.e(" onMergeUserActionCommon:%s %b   elapase:%d  size:%d  isRealTime:%b  , items:%d", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(paramBoolean2), Integer.valueOf(i1) });
      if (k()) {
        break;
      }
      return false;
    }
    Object localObject = d();
    if (((p)localObject).e.a(paramString))
    {
      com.tencent.beacon.e.b.c("onMergeUserAction return false, because eventName:[%s] is not allowed in server strategy!", new Object[] { paramString });
      return false;
    }
    if (paramBoolean2) {}
    for (localObject = ((p)localObject).m(); localObject != null; localObject = ((p)localObject).l()) {
      return ((j)localObject).a(paramString, paramBoolean1, paramLong1, paramLong2, paramVarArgs);
    }
    return false;
  }
  
  public static boolean c(boolean paramBoolean)
  {
    p localp = d();
    if (localp == null) {
      com.tencent.beacon.e.b.c(" ua module not ready!", new Object[0]);
    }
    while (!k()) {
      return false;
    }
    return localp.d(paramBoolean);
  }
  
  public static p d()
  {
    try
    {
      p localp = d;
      return localp;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void e()
  {
    p localp = d();
    if ((localp != null) && (localp.a != null))
    {
      com.tencent.beacon.upload.i.a(localp.a, false);
      a("rqd_appexited", true, 0L, 0L, null, false, false);
    }
    for (;;)
    {
      if (localp != null) {
        localp.f(false);
      }
      return;
      com.tencent.beacon.e.b.d("onAppExited:ua is null", new Object[0]);
    }
  }
  
  private void e(boolean paramBoolean)
  {
    try
    {
      this.i = true;
      if ((com.tencent.beacon.a.b.c.a(this.a).a()) && (this.m != null)) {
        this.m.onStrategyQuerySuccess();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void f(boolean paramBoolean)
  {
    try
    {
      if (paramBoolean != g())
      {
        j localj = l();
        if (localj != null) {
          localj.a(paramBoolean);
        }
        localj = m();
        if (localj != null) {
          localj.a(paramBoolean);
        }
        this.k = paramBoolean;
      }
      return;
    }
    finally {}
  }
  
  private static boolean k()
  {
    p localp = d();
    if (localp == null)
    {
      com.tencent.beacon.e.b.d("isModuleAble:not init ua", new Object[0]);
      return false;
    }
    boolean bool2 = localp.g();
    boolean bool1 = bool2;
    if (bool2)
    {
      bool1 = bool2;
      if (localp.n()) {
        bool1 = localp.o();
      }
    }
    if (bool1)
    {
      g localg = localp.e;
      if ((localg != null) && (com.tencent.beacon.a.j.f(localp.a).e >= localg.f()))
      {
        com.tencent.beacon.e.b.c(" reach daily consume limited! %d ", new Object[] { Integer.valueOf(localg.f()) });
        return false;
      }
    }
    return bool1;
  }
  
  private j l()
  {
    try
    {
      j localj = this.f;
      return localj;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private j m()
  {
    try
    {
      j localj = this.g;
      return localj;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean n()
  {
    try
    {
      boolean bool = this.h;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean o()
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
  
  private void p()
  {
    try
    {
      if ((this.n == null) || (this.n.size() <= 0)) {
        break label101;
      }
      Iterator localIterator = this.n.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        a(localf.a, localf.b, localf.c, localf.d, localf.e, localf.f, false);
      }
      this.n.clear();
    }
    finally {}
    this.n = null;
    label101:
  }
  
  private static boolean q()
  {
    try
    {
      int i1 = Process.myUid();
      Class localClass = Class.forName("android.net.TrafficStats");
      if (localClass != null)
      {
        long l1 = ((Long)localClass.getMethod("getUidRxBytes", new Class[] { Integer.TYPE }).invoke(null, new Object[] { Integer.valueOf(i1) })).longValue();
        long l2 = ((Long)localClass.getMethod("getUidTxBytes", new Class[] { Integer.TYPE }).invoke(null, new Object[] { Integer.valueOf(i1) })).longValue();
        if ((l1 != -1L) && (l2 != -1L)) {
          return true;
        }
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  private void r()
  {
    try
    {
      if ((!g()) && (!this.e.l())) {
        return;
      }
      Object localObject = com.tencent.beacon.a.b.c.a(this.a);
      if (localObject != null)
      {
        localObject = ((com.tencent.beacon.a.b.c)localObject).d().b(1);
        if (localObject != null)
        {
          localObject = ((e.a)localObject).b();
          if ((localObject != null) && (!"".equals(((String)localObject).trim())))
          {
            new i(this.a).a(false);
            return;
          }
        }
      }
    }
    catch (Exception localException)
    {
      com.tencent.beacon.e.b.c(" startHeart failed! " + localException.getMessage(), new Object[0]);
    }
  }
  
  private void s()
  {
    if (com.tencent.beacon.a.h.a(this.a) == null)
    {
      com.tencent.beacon.e.b.c(" DeviceInfo == null?,return", new Object[0]);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("A33", com.tencent.beacon.a.h.l(this.a));
    localHashMap.put("A63", "Y");
    if (com.tencent.beacon.a.b.c(this.a))
    {
      localHashMap.put("A21", "Y");
      label82:
      if (!com.tencent.beacon.a.b.c.a(this.a).f()) {
        break label301;
      }
      localHashMap.put("A45", "Y");
      label108:
      if (!com.tencent.beacon.a.b.g(this.a)) {
        break label317;
      }
      localHashMap.put("A66", "F");
      label131:
      localHashMap.put("A68", com.tencent.beacon.a.b.h(this.a));
      if (!com.tencent.beacon.a.b.b) {
        break label333;
      }
    }
    label301:
    label317:
    label333:
    String str2;
    for (String str1 = "Y";; str2 = "N")
    {
      localHashMap.put("A85", str1);
      a("rqd_applaunched", true, 0L, 0L, localHashMap, true, false);
      try
      {
        if (!this.e.k()) {
          break;
        }
        int i1 = this.e.j();
        com.tencent.beacon.a.e.a().a(106, new h(this.a, i1), i1 * 1000, i1 * 1000);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.beacon.e.b.c(" startAutoLaunchEvent failed! ", new Object[0]);
        com.tencent.beacon.e.b.b(" startAutoLaunchEvent failed! " + localException.getMessage(), new Object[0]);
        return;
      }
      localHashMap.put("A21", "N");
      break label82;
      localHashMap.put("A45", "N");
      break label108;
      localHashMap.put("A66", "B");
      break label131;
    }
  }
  
  public final void a()
  {
    a(j() + 1);
  }
  
  public final void a(com.tencent.beacon.a.b.e parame)
  {
    if (parame != null)
    {
      parame = parame.b(1);
      if (parame != null)
      {
        boolean bool = parame.a();
        if (g() != bool)
        {
          com.tencent.beacon.e.b.f("UAR onCommonStrategyChange setUsable:%b ", new Object[] { Boolean.valueOf(bool) });
          f(bool);
        }
      }
    }
  }
  
  public final void a(Map<String, String> paramMap)
  {
    if ((paramMap != null) && (paramMap.size() > 0) && (this.e != null)) {
      this.e.a(paramMap);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    Object localObject = com.tencent.beacon.a.b.c.a(this.a);
    if (localObject != null)
    {
      localObject = ((com.tencent.beacon.a.b.c)localObject).d().b(1);
      if ((localObject != null) && (((e.a)localObject).a() != paramBoolean))
      {
        ((e.a)localObject).a(paramBoolean);
        if (paramBoolean != g()) {
          f(paramBoolean);
        }
      }
    }
  }
  
  public final boolean a(List<String> paramList)
  {
    com.tencent.beacon.e.b.a(" testSpeedIp start", new Object[0]);
    if (!k()) {
      return false;
    }
    if ((paramList == null) || (paramList.size() <= 0))
    {
      com.tencent.beacon.e.b.c(" ipList == null || ipList.size() <= 0", new Object[0]);
      return true;
    }
    paramList = new p.1(this, (String[])paramList.toArray(new String[0]));
    com.tencent.beacon.a.e.a().a(paramList);
    return true;
  }
  
  public final void b()
  {
    e(true);
    for (;;)
    {
      try
      {
        localObject = com.tencent.beacon.a.b.c.a(this.a).d();
        if (localObject != null) {
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        Object localObject;
        int i2;
        long l1;
        long l2;
        long l3;
        localThrowable.printStackTrace();
        com.tencent.beacon.e.b.d(" common query end error %s", new Object[] { localThrowable.toString() });
        continue;
        i1 = -1;
        break label794;
        i1 = 0;
        continue;
        com.tencent.beacon.e.b.b("event module is disable", new Object[0]);
        continue;
      }
      p();
      if (j() < 2)
      {
        if (this.m != null) {
          this.m.onInitEnd();
        }
        if ((com.tencent.beacon.upload.i.a(this.a).a()) && (k.a(this.a).a("sig_1")))
        {
          com.tencent.beacon.e.b.e(" get lock %s do singleton!", new Object[] { "sig_1" });
          if ((this.e.i()) || (this.e.p()))
          {
            i1 = this.e.h();
            i2 = this.e.g();
            if ((i1 > 0) && (i2 > 0))
            {
              localObject = new com.tencent.beacon.a.d(this.a, i1, i2, new o(this.a), this.e.i(), this.e.p(), this.e.o());
              com.tencent.beacon.a.e.a().a(104, (Runnable)localObject, i1 * 1000, i1 * 1000);
            }
          }
          if (com.tencent.beacon.upload.i.a(this.a).b())
          {
            r();
            s();
            localObject = com.tencent.beacon.a.j.b(this.a);
            if (localObject != null)
            {
              l1 = ((com.tencent.beacon.a.a.e)localObject).d;
              l2 = ((com.tencent.beacon.a.a.e)localObject).e;
              l3 = ((com.tencent.beacon.a.a.e)localObject).e;
              localObject = new HashMap();
              ((HashMap)localObject).put("A64", l1 + l2);
              ((HashMap)localObject).put("A65", l3);
              if (a("rqd_sdk_net_consumed", true, 0L, 0L, (Map)localObject, true, false)) {
                UserAction.clearSDKTotalConsume(this.a);
              }
            }
          }
        }
      }
      try
      {
        localObject = com.tencent.beacon.a.b.b(this.a, "rqd_model", "");
        boolean bool = com.tencent.beacon.a.h.n().equals(localObject);
        if (!bool) {
          break label740;
        }
      }
      catch (Exception localException1)
      {
        Set localSet;
        com.tencent.beacon.e.b.c(" save modelEvent upload flag failed! ", new Object[0]);
        continue;
        p.4 local4 = new p.4(this);
        com.tencent.beacon.a.e.a().a(local4, 50000L);
        try
        {
          com.tencent.beacon.a.b.a(this.a, "rqd_model", com.tencent.beacon.a.h.n());
        }
        catch (Exception localException2)
        {
          com.tencent.beacon.e.b.c(" save modelEvent upload flag failed! ", new Object[0]);
          localException2.printStackTrace();
        }
        continue;
        if (i1 <= 0) {
          continue;
        }
        i1 = 1;
        continue;
      }
      if ((this.e.q()) || (this.e.r()))
      {
        this.b = new a(this.a, this.e.q(), this.e.r(), this.e.s(), this.e.t());
        if (this.e.r()) {
          new com.tencent.beacon.a.l(this.a).a();
        }
      }
      if ((this.e.m()) && (q()))
      {
        localObject = new p.5(this);
        com.tencent.beacon.a.e.a().a((Runnable)localObject, 50000L);
        i1 = this.e.n();
        if (i1 > 0)
        {
          localObject = new com.tencent.beacon.a.c(this.a);
          com.tencent.beacon.a.e.a().a(107, (Runnable)localObject, 0L, i1 * 1000);
        }
      }
      this.c.a = this.e.u();
      return;
      localObject = ((com.tencent.beacon.a.b.e)localObject).b(1);
      if ((localObject != null) && (this.e != null))
      {
        localSet = ((e.a)localObject).d();
        if ((localSet != null) && (localSet.size() > 0)) {
          this.e.a(localSet);
        }
        localSet = ((e.a)localObject).g();
        if ((localSet != null) && (localSet.size() > 0)) {
          this.e.b(localSet);
        }
      }
      if ((!g()) || (localObject == null)) {
        continue;
      }
      if (!g()) {
        continue;
      }
      i1 = com.tencent.beacon.a.h.s(this.a);
      break label794;
      if (i1 != 0)
      {
        com.tencent.beacon.e.b.e(" asyn up module %d", new Object[] { Integer.valueOf(1) });
        com.tencent.beacon.a.e.a().a(new p.3(this));
      }
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if ((com.tencent.beacon.upload.i.a(this.a) != null) && (paramBoolean != com.tencent.beacon.upload.i.a(this.a).b()))
    {
      if (paramBoolean)
      {
        com.tencent.beacon.upload.i.a(this.a).a(true);
        r();
        s();
      }
    }
    else {
      return;
    }
    com.tencent.beacon.upload.i.a(this.a).a(false);
    Context localContext = this.a;
    com.tencent.beacon.a.e.a().a(108, true);
    com.tencent.beacon.a.b.a(localContext, "HEART_DENGTA", com.tencent.beacon.b.a.t());
    com.tencent.beacon.e.b.a("heartbeat uploaded sucess!", new Object[0]);
  }
  
  public final boolean b(List<String> paramList)
  {
    if (!k()) {
      return false;
    }
    if ((paramList == null) || (paramList.size() <= 0))
    {
      com.tencent.beacon.e.b.c(" dnsList == null || dnsList.size() <= 0", new Object[0]);
      return true;
    }
    paramList = new p.2(this, (String[])paramList.toArray(new String[0]));
    com.tencent.beacon.e.b.a(" post the test task", new Object[0]);
    com.tencent.beacon.a.e.a().a(paramList);
    return true;
  }
  
  public final void c()
  {
    Context localContext = this.a;
    com.tencent.beacon.e.b.a(" RecordDAO.deleteRecords() start", new Object[0]);
    com.tencent.beacon.e.b.e(" ua first clean :%d", new Object[] { Integer.valueOf(com.tencent.beacon.a.a.a.a(localContext, new int[] { 1, 2, 3, 4 }, -1L, Long.MAX_VALUE)) });
    com.tencent.beacon.e.b.e(" ua remove strategy :%d", new Object[] { Integer.valueOf(com.tencent.beacon.a.h.b(this.a, 101)) });
  }
  
  public final boolean d(boolean paramBoolean)
  {
    if (g()) {}
    for (int i1 = com.tencent.beacon.a.h.s(this.a);; i1 = -1)
    {
      if (i1 <= 0) {
        break label82;
      }
      try
      {
        if (this.j != null)
        {
          c localc = new c(this.a);
          localc.a(paramBoolean);
          this.j.a(localc);
        }
        return true;
      }
      catch (Throwable localThrowable)
      {
        com.tencent.beacon.e.b.c(" up common error: %s", new Object[] { localThrowable.toString() });
        localThrowable.printStackTrace();
      }
    }
    label82:
    return false;
  }
  
  public final void f()
  {
    com.tencent.beacon.e.b.a(" closeUseInfoEvent start", new Object[0]);
    try
    {
      this.e.a(false);
      com.tencent.beacon.a.e.a().a(104, true);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.beacon.e.b.d(" closeUseInfoEvent function error:" + localException.getMessage(), new Object[0]);
    }
  }
  
  public final boolean g()
  {
    try
    {
      boolean bool = this.k;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final com.tencent.beacon.upload.h h()
  {
    return this.j;
  }
  
  public final g i()
  {
    return this.e;
  }
  
  public final int j()
  {
    try
    {
      int i1 = this.l;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */