package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.q;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class e
{
  private static volatile boolean S = true;
  static volatile int aI = 0;
  private static com.tencent.wxop.stat.b.f aK;
  private static volatile Map<com.tencent.wxop.stat.a.b, Long> aL = new ConcurrentHashMap();
  private static volatile Map<String, Properties> aM = new ConcurrentHashMap();
  private static volatile Map<Integer, Integer> aN = new ConcurrentHashMap(10);
  private static volatile long aO = 0L;
  private static volatile long aP;
  private static volatile int aQ;
  private static volatile String aR;
  private static volatile String aS;
  private static Map<String, Long> aT;
  private static Map<String, Long> aU;
  private static com.tencent.wxop.stat.b.b aV;
  private static Thread.UncaughtExceptionHandler aW;
  static volatile long aX = 0L;
  private static Context aY = null;
  static volatile long aZ = 0L;
  private static volatile long af = 0L;
  private static String al;
  
  static
  {
    aP = 0L;
    al = "";
    aQ = 0;
    aR = "";
    aS = "";
    aT = new ConcurrentHashMap();
    aU = new ConcurrentHashMap();
    aV = com.tencent.wxop.stat.b.l.av();
    aW = null;
  }
  
  private static JSONObject G()
  {
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      JSONObject localJSONObject2 = new JSONObject();
      if (c.P.L != 0) {
        localJSONObject2.put("v", c.P.L);
      }
      localJSONObject1.put(Integer.toString(c.P.aI), localJSONObject2);
      localJSONObject2 = new JSONObject();
      if (c.O.L != 0) {
        localJSONObject2.put("v", c.O.L);
      }
      localJSONObject1.put(Integer.toString(c.O.aI), localJSONObject2);
      return localJSONObject1;
    }
    catch (JSONException localJSONException)
    {
      aV.b(localJSONException);
    }
    return localJSONObject1;
  }
  
  static void H()
  {
    aI = 0;
    aX = 0L;
  }
  
  static void I()
  {
    aI += 1;
    aX = System.currentTimeMillis();
    p(aY);
  }
  
  static int a(Context paramContext, boolean paramBoolean, f paramf)
  {
    int j = 1;
    long l = System.currentTimeMillis();
    if ((paramBoolean) && (l - af >= c.m())) {}
    for (int i = 1;; i = 0)
    {
      af = l;
      if (aP == 0L) {
        aP = com.tencent.wxop.stat.b.l.ad();
      }
      if (l >= aP)
      {
        aP = com.tencent.wxop.stat.b.l.ad();
        if (t.s(paramContext).t(paramContext).as() != 1) {
          t.s(paramContext).t(paramContext).z();
        }
        c.C();
        aI = 0;
        al = com.tencent.wxop.stat.b.l.aw();
        i = 1;
      }
      String str = al;
      if (com.tencent.wxop.stat.b.l.a(paramf)) {
        str = paramf.S() + al;
      }
      if (!aU.containsKey(str)) {
        i = j;
      }
      for (;;)
      {
        if (i != 0)
        {
          if (com.tencent.wxop.stat.b.l.a(paramf)) {
            break label248;
          }
          if (c.D() < c.A())
          {
            com.tencent.wxop.stat.b.l.O(paramContext);
            a(paramContext, null);
            aU.put(str, Long.valueOf(1L));
          }
        }
        else if (S)
        {
          if (c.l())
          {
            paramContext = i(paramContext);
            if (paramContext != null) {
              break label256;
            }
            aV.error("The Context of StatService.testSpeed() can not be null!");
          }
        }
        for (;;)
        {
          S = false;
          return aQ;
          aV.d("Exceed StatConfig.getMaxDaySessionNumbers().");
          break;
          label248:
          a(paramContext, paramf);
          break;
          label256:
          if (k(paramContext) != null) {
            aK.a(new i(paramContext));
          }
        }
      }
    }
  }
  
  private static void a(Context paramContext, f paramf)
  {
    if (k(paramContext) != null)
    {
      if (c.k()) {
        aV.e("start new session.");
      }
      if ((paramf == null) || (aQ == 0)) {
        aQ = com.tencent.wxop.stat.b.l.r();
      }
      c.z();
      c.B();
      new p(new com.tencent.wxop.stat.a.i(paramContext, aQ, G(), paramf)).ah();
    }
  }
  
  public static void a(Context paramContext, String paramString, f paramf)
  {
    if (!c.l()) {}
    do
    {
      return;
      paramContext = i(paramContext);
      if ((paramContext == null) || (paramString == null) || (paramString.length() == 0))
      {
        aV.error("The Context or pageName of StatService.trackBeginPage() can not be null or empty!");
        return;
      }
      paramString = new String(paramString);
    } while (k(paramContext) == null);
    aK.a(new as(paramString, paramContext, paramf));
  }
  
  static void a(Context paramContext, Throwable paramThrowable)
  {
    if (!c.l()) {}
    do
    {
      return;
      paramContext = i(paramContext);
      if (paramContext == null)
      {
        aV.error("The Context of StatService.reportSdkSelfException() can not be null!");
        return;
      }
    } while (k(paramContext) == null);
    aK.a(new ap(paramContext, paramThrowable));
  }
  
  static boolean a()
  {
    if (aI >= 2)
    {
      aX = System.currentTimeMillis();
      return true;
    }
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        if (!c.l())
        {
          aV.error("MTA StatService is disable.");
          return false;
        }
        if (!c.k()) {
          break label218;
        }
        aV.e("MTA SDK version, current: " + "2.0.3" + " ,required: " + paramString2);
      }
      catch (Throwable paramContext)
      {
        aV.b(paramContext);
        return false;
      }
      aV.error("Context or mtaSdkVersion in StatService.startStatService() is null, please check it!");
      c.a(false);
      return false;
      label218:
      do
      {
        if (com.tencent.wxop.stat.b.l.u("2.0.3") < com.tencent.wxop.stat.b.l.u(paramString2))
        {
          paramContext = "MTA SDK version conflicted, current: " + "2.0.3" + ",required: " + paramString2;
          paramContext = paramContext + ". please delete the current SDK and download the latest one. official website: http://mta.qq.com/ or http://mta.oa.com/";
          aV.error(paramContext);
          c.a(false);
          return false;
        }
        paramString2 = c.e(paramContext);
        if ((paramString2 == null) || (paramString2.length() == 0)) {
          c.n("-");
        }
        if (paramString1 != null) {
          c.b(paramContext, paramString1);
        }
        if (k(paramContext) != null) {
          aK.a(new m(paramContext));
        }
        return true;
        if (paramContext == null) {
          break;
        }
      } while (paramString2 != null);
    }
  }
  
  public static void b(Context paramContext, String paramString, f paramf)
  {
    if (!c.l()) {}
    do
    {
      return;
      paramContext = i(paramContext);
      if ((paramContext == null) || (paramString == null) || (paramString.length() == 0))
      {
        aV.error("The Context or pageName of StatService.trackEndPage() can not be null or empty!");
        return;
      }
      paramString = new String(paramString);
    } while (k(paramContext) == null);
    aK.a(new k(paramContext, paramString, paramf));
  }
  
  public static void d(Context paramContext, String paramString)
  {
    if (!c.l()) {}
    do
    {
      return;
      paramContext = i(paramContext);
      if (paramContext == null)
      {
        aV.error("The Context of StatService.trackCustomEvent() can not be null!");
        return;
      }
      if ((paramString == null) || (paramString.length() == 0)) {}
      for (int i = 1; i != 0; i = 0)
      {
        aV.error("The event_id of StatService.trackCustomEvent() can not be null or empty.");
        return;
      }
      paramString = new com.tencent.wxop.stat.a.b(paramString);
    } while (k(paramContext) == null);
    aK.a(new ar(paramContext, paramString));
  }
  
  private static Context i(Context paramContext)
  {
    if (paramContext != null) {
      return paramContext;
    }
    return aY;
  }
  
  private static void j(Context paramContext)
  {
    boolean bool2 = false;
    if (paramContext == null) {
      return;
    }
    for (;;)
    {
      try
      {
        if (aK != null) {
          break;
        }
        long l1 = q.f(paramContext, c.c);
        long l2 = com.tencent.wxop.stat.b.l.u("2.0.3");
        boolean bool1 = true;
        if (l2 <= l1)
        {
          aV.error("MTA is disable for current version:" + l2 + ",wakeup version:" + l1);
          bool1 = false;
        }
        l1 = q.f(paramContext, c.W);
        if (l1 > System.currentTimeMillis())
        {
          aV.error("MTA is disable for current time:" + System.currentTimeMillis() + ",wakeup time:" + l1);
          bool1 = bool2;
          c.a(bool1);
          if (!bool1) {
            break;
          }
          paramContext = paramContext.getApplicationContext();
          aY = paramContext;
          aK = new com.tencent.wxop.stat.b.f();
          al = com.tencent.wxop.stat.b.l.aw();
          aO = System.currentTimeMillis() + c.af;
          aK.a(new an(paramContext));
          break;
        }
      }
      finally {}
    }
  }
  
  /* Error */
  private static com.tencent.wxop.stat.b.f k(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 257	com/tencent/wxop/stat/e:aK	Lcom/tencent/wxop/stat/b/f;
    //   3: ifnonnull +21 -> 24
    //   6: ldc 2
    //   8: monitorenter
    //   9: getstatic 257	com/tencent/wxop/stat/e:aK	Lcom/tencent/wxop/stat/b/f;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnonnull +7 -> 21
    //   17: aload_0
    //   18: invokestatic 415	com/tencent/wxop/stat/e:j	(Landroid/content/Context;)V
    //   21: ldc 2
    //   23: monitorexit
    //   24: getstatic 257	com/tencent/wxop/stat/e:aK	Lcom/tencent/wxop/stat/b/f;
    //   27: areturn
    //   28: astore_0
    //   29: getstatic 81	com/tencent/wxop/stat/e:aV	Lcom/tencent/wxop/stat/b/b;
    //   32: aload_0
    //   33: invokevirtual 417	com/tencent/wxop/stat/b/b:a	(Ljava/lang/Throwable;)V
    //   36: iconst_0
    //   37: invokestatic 336	com/tencent/wxop/stat/c:a	(Z)V
    //   40: goto -19 -> 21
    //   43: astore_0
    //   44: ldc 2
    //   46: monitorexit
    //   47: aload_0
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	paramContext	Context
    //   12	2	1	localf	com.tencent.wxop.stat.b.f
    // Exception table:
    //   from	to	target	type
    //   17	21	28	java/lang/Throwable
    //   9	13	43	finally
    //   17	21	43	finally
    //   21	24	43	finally
    //   29	40	43	finally
  }
  
  public static void l(Context paramContext)
  {
    if (!c.l()) {}
    while (k(paramContext) == null) {
      return;
    }
    aK.a(new l(paramContext));
  }
  
  public static void m(Context paramContext)
  {
    if (!c.l()) {}
    while (k(paramContext) == null) {
      return;
    }
    aK.a(new ao(paramContext));
  }
  
  static void n(Context paramContext)
  {
    if (!c.l()) {
      return;
    }
    paramContext = i(paramContext);
    if (paramContext == null)
    {
      aV.error("The Context of StatService.sendNetworkDetector() can not be null!");
      return;
    }
    try
    {
      com.tencent.wxop.stat.a.f localf = new com.tencent.wxop.stat.a.f(paramContext);
      ak.Z(paramContext).a(localf, new aq());
      return;
    }
    catch (Throwable paramContext)
    {
      aV.b(paramContext);
    }
  }
  
  public static void o(Context paramContext)
  {
    if (!c.l()) {}
    do
    {
      return;
      if (c.k()) {
        aV.b("commitEvents, maxNumber=-1");
      }
      paramContext = i(paramContext);
      if (paramContext == null)
      {
        aV.error("The Context of StatService.commitEvents() can not be null!");
        return;
      }
    } while ((!g.r(aY).X()) || (k(paramContext) == null));
    aK.a(new h(paramContext));
  }
  
  public static Properties p(String paramString)
  {
    return (Properties)aM.get(paramString);
  }
  
  public static void p(Context paramContext)
  {
    if (!c.l()) {}
    while (c.ay <= 0) {
      return;
    }
    paramContext = i(paramContext);
    if (paramContext == null)
    {
      aV.error("The Context of StatService.testSpeed() can not be null!");
      return;
    }
    t.s(paramContext).H();
  }
  
  static void q(Context paramContext)
  {
    aZ = System.currentTimeMillis() + 60000 * c.u();
    q.a(paramContext, "last_period_ts", aZ);
    o(paramContext);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */