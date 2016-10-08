package com.tencent.qalhttp;

import android.content.Context;
import com.tencent.mobileqq.pb.PBInt64Field;
import com.tencent.qalsdk.im_open.http.ResponsePrivate;
import com.tencent.qalsdk.util.QLog;
import qalsdk.ag;
import qalsdk.b;

class a
{
  private static final String e = "HttpCacheHelper";
  private static ag f;
  public boolean a = false;
  public String b = null;
  public String c = null;
  public long d = 0L;
  private boolean g = false;
  private b h = null;
  
  private QALHttpResponse a(b paramb)
  {
    QALHttpResponse localQALHttpResponse = new QALHttpResponse();
    localQALHttpResponse.setStatus(paramb.a);
    localQALHttpResponse.setContentType(paramb.b);
    localQALHttpResponse.setLocation(paramb.c);
    localQALHttpResponse.setDate(paramb.e);
    localQALHttpResponse.setServer(paramb.f);
    localQALHttpResponse.setVia(paramb.g);
    localQALHttpResponse.setXCache(paramb.h);
    localQALHttpResponse.setXCacheLookup(paramb.i);
    localQALHttpResponse.setAge(paramb.o);
    localQALHttpResponse.setLastModified(paramb.j);
    localQALHttpResponse.setEtag(paramb.k);
    localQALHttpResponse.setCacheControl(paramb.l);
    localQALHttpResponse.setExpires(paramb.m);
    localQALHttpResponse.setPragma(paramb.n);
    localQALHttpResponse.setSetCookie(paramb.d);
    localQALHttpResponse.setOtherHeaders(paramb.r);
    localQALHttpResponse.setBody(paramb.s);
    return localQALHttpResponse;
  }
  
  private b a(QALHttpResponse paramQALHttpResponse)
  {
    b localb = new b();
    localb.a = paramQALHttpResponse.getStatus();
    localb.b = paramQALHttpResponse.getContentType();
    localb.c = paramQALHttpResponse.getLocation();
    localb.e = paramQALHttpResponse.getDate();
    localb.f = paramQALHttpResponse.getServer();
    localb.g = paramQALHttpResponse.getVia();
    localb.h = paramQALHttpResponse.getXCache();
    localb.i = paramQALHttpResponse.getXCacheLookup();
    localb.o = paramQALHttpResponse.getAge();
    localb.j = paramQALHttpResponse.getLastModified();
    localb.k = paramQALHttpResponse.getEtag();
    localb.l = paramQALHttpResponse.getCacheControl();
    localb.m = paramQALHttpResponse.getExpires();
    localb.n = paramQALHttpResponse.getPragma();
    localb.d = paramQALHttpResponse.getSetCookie();
    localb.p = paramQALHttpResponse.responsePrivate.cache_max_age.get();
    localb.q = paramQALHttpResponse.responsePrivate.cache_max_stale_age.get();
    localb.r = paramQALHttpResponse.getOtherHeaders();
    localb.s = paramQALHttpResponse.getBody();
    return localb;
  }
  
  public static void a(long paramLong)
  {
    f.a(paramLong);
  }
  
  public static void a(Context paramContext)
  {
    f = ag.a();
    f.a(paramContext);
    QLog.d("HttpCacheHelper", 4, "cache init ok");
  }
  
  public QALHttpResponse a(int paramInt, String paramString)
  {
    if (paramInt != 1) {}
    b localb;
    do
    {
      return null;
      paramString = "GET" + paramString;
      long l = System.currentTimeMillis();
      localb = f.a(paramString);
      this.d = (System.currentTimeMillis() - l);
      QLog.d("HttpCacheHelper", 4, "cache get costTime:" + this.d);
    } while (localb == null);
    this.g = true;
    this.h = localb;
    if (!localb.a())
    {
      QLog.d("HttpCacheHelper", 4, paramString + " hit cache,not expired");
      f.b(paramString);
      return a(localb);
    }
    if (localb.b())
    {
      this.a = true;
      this.b = localb.k;
      this.c = localb.j;
      QLog.d("HttpCacheHelper", 4, paramString + " hit stale cache,need update");
      f.b(paramString);
      return a(localb);
    }
    QLog.d("HttpCacheHelper", 4, paramString + " hit cache,expired");
    this.b = localb.k;
    this.c = localb.j;
    return null;
  }
  
  public QALHttpResponse a(String paramString)
  {
    if (this.h == null)
    {
      QLog.e("HttpCacheHelper", 1, "304,but no cache");
      return null;
    }
    f.b("GET" + paramString);
    return a(this.h);
  }
  
  public void a(int paramInt, String paramString, QALHttpResponse paramQALHttpResponse)
  {
    if (paramInt != 1) {}
    do
    {
      do
      {
        return;
        paramString = "GET" + paramString;
        if (paramQALHttpResponse.getStatus() != 200) {
          break;
        }
        if ((paramQALHttpResponse.responsePrivate.cache_max_age.get() > 0L) || (paramQALHttpResponse.responsePrivate.cache_max_stale_age.get() > 0L) || ((paramQALHttpResponse.getLastModified() != null) && (paramQALHttpResponse.getLastModified().length() != 0)) || ((paramQALHttpResponse.getEtag() != null) && (paramQALHttpResponse.getLastModified().length() != 0)))
        {
          QLog.d("HttpCacheHelper", 4, paramString + " 200|write to cache");
          long l1 = System.currentTimeMillis();
          f.a(paramString, a(paramQALHttpResponse));
          long l2 = System.currentTimeMillis();
          QLog.d("HttpCacheHelper", 4, "cache put costTime:" + (l2 - l1));
          return;
        }
      } while (!this.g);
      QLog.d("HttpCacheHelper", 4, paramString + " 200|remove cache");
      f.c(paramString);
      return;
      if (paramQALHttpResponse.getStatus() == 304)
      {
        QLog.d("HttpCacheHelper", 4, paramString + "304 |wirte to cache");
        f.a(paramString, a(paramQALHttpResponse));
        return;
      }
    } while ((paramQALHttpResponse.getStatus() != 404) || (!this.g));
    QLog.d("HttpCacheHelper", 4, paramString + " 404 |remove cache");
    f.c(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalhttp\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */