package com.baidu.location.g;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.b.l;
import com.baidu.location.b.m;
import com.baidu.location.b.q;
import com.baidu.location.e.f;
import com.baidu.location.e.t;
import com.baidu.location.e.u;
import com.baidu.location.h.g;
import com.baidu.location.h.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.http.util.EntityUtils;

class c
  extends com.baidu.location.b.n
{
  public c(b paramb) {}
  
  public void a() {}
  
  void a(String paramString)
  {
    this.i = paramString;
    g();
  }
  
  public void a(boolean paramBoolean)
  {
    b.a(this.a).c(SystemClock.uptimeMillis());
    if ((paramBoolean) && (this.e != null)) {
      try
      {
        Object localObject1 = EntityUtils.toString(this.e, "utf-8");
        this.a.c = new a((String)localObject1);
        if ((this.a.d) && (this.a.c.b()))
        {
          localObject1 = new BDLocation();
          ((BDLocation)localObject1).b(this.a.c.d());
          ((BDLocation)localObject1).a(this.a.c.c());
          ((BDLocation)localObject1).b(this.a.c.e());
          ((BDLocation)localObject1).a(161);
          ((BDLocation)localObject1).c(0);
          ((BDLocation)localObject1).b("wgs84");
          ((BDLocation)localObject1).e("sky");
          Object localObject2 = this.a.c.b;
          Object localObject3 = this.a.c.d;
          String str1 = this.a.c.a;
          String str2 = this.a.c.e;
          String str3 = this.a.c.f;
          String str4 = this.a.c.g;
          localObject2 = new com.baidu.location.c().a((String)localObject2).c((String)localObject3).d(str1).f(str2).g(str3).h(str4).a();
          localObject3 = new Date();
          ((BDLocation)localObject1).a(b.b().format((Date)localObject3));
          ((BDLocation)localObject1).d(g.a().g());
          if (t.a().d()) {
            ((BDLocation)localObject1).c(t.a().f());
          }
          if (l.f.equals("all")) {
            ((BDLocation)localObject1).a((com.baidu.location.a)localObject2);
          }
          if (this.a.c.a())
          {
            localObject2 = Jni.a(this.a.c.d(), this.a.c.c(), "gps2gcj");
            ((BDLocation)localObject1).b("gcj02");
            ((BDLocation)localObject1).b(localObject2[0]);
            ((BDLocation)localObject1).a(localObject2[1]);
          }
          localObject2 = u.b().h.obtainMessage(21);
          ((Message)localObject2).obj = localObject1;
          ((Message)localObject2).sendToTarget();
          b.a(this.a).d(SystemClock.uptimeMillis());
          b.a(this.a).a("skys");
          if (this.a.a != null) {
            b.a(this.a).b(this.a.a.j());
          }
          q.a().a(b.a(this.a));
          return;
        }
        if ((!this.a.d) || (this.a.c.b())) {
          return;
        }
        localObject1 = new BDLocation();
        ((BDLocation)localObject1).a(167);
        f.a().a((BDLocation)localObject1);
        b.a(this.a).d(SystemClock.uptimeMillis());
        b.a(this.a).a("skyf");
        if (this.a.a != null) {
          b.a(this.a).b(this.a.a.j());
        }
        q.a().a(b.a(this.a));
        return;
      }
      catch (Exception localException)
      {
        return;
      }
    }
    BDLocation localBDLocation = new BDLocation();
    localBDLocation.a(63);
    f.a().a(localBDLocation);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */