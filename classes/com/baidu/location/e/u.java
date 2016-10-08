package com.baidu.location.e;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.baidu.location.BDLocation;
import com.baidu.location.a;
import com.baidu.location.c.e;
import com.baidu.location.c.i;
import com.baidu.location.c.k;
import com.baidu.location.h.g;
import com.baidu.location.h.h;
import com.baidu.location.h.n;
import com.baidu.location.h.p;
import com.baidu.location.h.r;
import java.util.List;

public class u
  extends b
{
  private static u i = null;
  private double A;
  private boolean B = false;
  private long C = 0L;
  private long D = 0L;
  private w E = null;
  private boolean F = false;
  private boolean G = false;
  private boolean H = true;
  final int e = 2000;
  final int f = 1000;
  public c g = null;
  public final Handler h = new d(this);
  private boolean j = true;
  private String k = null;
  private BDLocation l = null;
  private BDLocation m = null;
  private com.baidu.location.h.l n = null;
  private n o = null;
  private com.baidu.location.h.l p = null;
  private n q = null;
  private boolean r = true;
  private volatile boolean s = false;
  private boolean t = false;
  private long u = 0L;
  private long v = 0L;
  private a w = null;
  private String x = null;
  private List y = null;
  private double z;
  
  private boolean a(com.baidu.location.h.l paraml)
  {
    boolean bool2 = true;
    this.a = r.a().k();
    boolean bool1;
    if (paraml == this.a) {
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
        } while (this.a == null);
        bool1 = bool2;
      } while (paraml == null);
      bool1 = bool2;
    } while (!paraml.c(this.a));
    return false;
  }
  
  private boolean a(n paramn)
  {
    boolean bool2 = true;
    this.b = g.a().f();
    boolean bool1;
    if (this.b == paramn) {
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
        } while (this.b == null);
        bool1 = bool2;
      } while (paramn == null);
      bool1 = bool2;
    } while (!paramn.a(this.b));
    return false;
  }
  
  public static u b()
  {
    if (i == null) {
      i = new u();
    }
    return i;
  }
  
  private boolean b(n paramn)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramn == null) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (this.q == null);
      bool1 = bool2;
    } while (!paramn.a(this.q));
    return false;
  }
  
  private void c(Message paramMessage)
  {
    if (paramMessage.getData().getBoolean("isWaitingLocTag", false)) {
      al.a().b();
    }
    int i1 = f.a().d(paramMessage);
    switch (i1)
    {
    default: 
      throw new IllegalArgumentException(String.format("this type %d is illegal", new Object[] { Integer.valueOf(i1) }));
    case 3: 
      if (h.a().j()) {
        e(paramMessage);
      }
      return;
    case 1: 
      d(paramMessage);
      return;
    }
    f(paramMessage);
  }
  
  private void d(Message paramMessage)
  {
    if (h.a().j())
    {
      e(paramMessage);
      return;
    }
    f(paramMessage);
  }
  
  private void e(Message paramMessage)
  {
    BDLocation localBDLocation = new BDLocation(h.a().g());
    if ((com.baidu.location.b.l.f.equals("all")) || (com.baidu.location.b.l.g) || (com.baidu.location.b.l.h))
    {
      float[] arrayOfFloat = new float[2];
      Location.distanceBetween(this.A, this.z, localBDLocation.c(), localBDLocation.d(), arrayOfFloat);
      if (arrayOfFloat[0] >= 100.0F) {
        break label135;
      }
      if (this.w != null) {
        localBDLocation.a(this.w);
      }
      if (this.x != null) {
        localBDLocation.d(this.x);
      }
      if (this.y != null) {
        localBDLocation.a(this.y);
      }
    }
    for (;;)
    {
      this.l = localBDLocation;
      this.m = null;
      f.a().a(localBDLocation, paramMessage);
      return;
      label135:
      this.B = true;
      f(null);
    }
  }
  
  private void f(Message paramMessage)
  {
    if (this.r)
    {
      this.D = SystemClock.uptimeMillis();
      g(paramMessage);
    }
    while (this.s) {
      return;
    }
    this.D = SystemClock.uptimeMillis();
    if (r.a().e())
    {
      this.t = true;
      this.h.postDelayed(new v(this, null), 2000L);
      return;
    }
    g(paramMessage);
  }
  
  private void g(Message paramMessage)
  {
    if (this.s) {}
    String str2;
    long l1;
    do
    {
      return;
      if ((System.currentTimeMillis() - this.u < 1000L) && (this.l != null))
      {
        f.a().a(this.l);
        l();
        return;
      }
      if (this.D > 0L) {
        com.baidu.location.b.q.a().b().a(this.D);
      }
      for (;;)
      {
        this.s = true;
        this.j = a(this.o);
        if ((a(this.n)) || (this.j) || (this.l == null) || (this.B)) {
          break;
        }
        if ((this.m != null) && (System.currentTimeMillis() - this.v > 30000L))
        {
          this.l = this.m;
          this.m = null;
        }
        if (t.a().d()) {
          this.l.c(t.a().f());
        }
        f.a().a(this.l);
        l();
        return;
        com.baidu.location.b.q.a().b().a(SystemClock.uptimeMillis());
      }
      str2 = a(null);
      if (str2 != null) {
        break;
      }
      if (this.l != null)
      {
        f.a().a(this.l);
        l();
        return;
      }
      paramMessage = new BDLocation();
      paramMessage.a(62);
      f.a().a(paramMessage);
      l();
      l1 = System.currentTimeMillis();
    } while (l1 - this.C <= 60000L);
    this.C = l1;
    com.baidu.location.b.q.a().a("TypeCriteriaException");
    return;
    String str1 = str2;
    if (this.k != null)
    {
      str1 = str2 + this.k;
      this.k = null;
    }
    com.baidu.location.b.q.a().b().b(SystemClock.uptimeMillis());
    this.g.a(str1);
    this.o = this.b;
    this.n = this.a;
    if ((this.o != null) && (this.o.a() == 0))
    {
      new com.baidu.location.g.b(this.o, this.n, true).a();
      l();
    }
    for (;;)
    {
      if (this.r == true)
      {
        this.r = false;
        if ((r.a().g()) && (paramMessage != null) && (f.a().e(paramMessage) < 1000) && (i.a().d())) {
          new an(this).start();
        }
      }
      this.u = System.currentTimeMillis();
      return;
      if (k())
      {
        this.o = this.b;
        this.n = this.a;
      }
      if (i.a().h())
      {
        if (this.E == null) {
          this.E = new w(this, null);
        }
        l1 = i.a().a(g.a(g.a().e()));
        this.h.postDelayed(this.E, l1);
        this.F = true;
      }
    }
  }
  
  private boolean k()
  {
    com.baidu.location.b.m localm = null;
    boolean bool2 = false;
    double d = Math.random();
    long l1 = SystemClock.uptimeMillis();
    Object localObject = g.a().f();
    com.baidu.location.h.l locall = r.a().j();
    if ((localObject != null) && (((n)localObject).f()) && ((locall == null) || (locall.a() == 0))) {}
    for (int i1 = 1;; i1 = 0)
    {
      localObject = localm;
      if (i.a().d())
      {
        localObject = localm;
        if (i.a().f()) {
          if (i1 == 0)
          {
            localObject = localm;
            if (0.0D < d)
            {
              localObject = localm;
              if (d >= i.a().o()) {}
            }
          }
          else
          {
            localObject = i.a().a(g.a().f(), r.a().j(), null, com.baidu.location.c.l.a, k.a);
          }
        }
      }
      boolean bool1 = bool2;
      if (localObject != null)
      {
        bool1 = bool2;
        if (((BDLocation)localObject).h() == 66)
        {
          bool1 = bool2;
          if (this.s)
          {
            localm = new com.baidu.location.b.m();
            localm.a(this.D);
            localm.b(l1);
            localm.c(l1);
            localm.d(SystemClock.uptimeMillis());
            localm.a("ofs");
            if (this.o != null)
            {
              localm.b(this.o.j());
              localm.b("&offtag=1");
            }
            localObject = new BDLocation((BDLocation)localObject);
            ((BDLocation)localObject).a(161);
            bool1 = bool2;
            if (this.s)
            {
              com.baidu.location.b.q.a().a(localm);
              this.G = true;
              f.a().a((BDLocation)localObject);
              this.l = ((BDLocation)localObject);
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
  }
  
  private void l()
  {
    this.s = false;
    this.G = false;
    this.H = false;
    this.B = false;
    m();
  }
  
  private void m()
  {
    if (this.l != null) {
      y.a().c();
    }
  }
  
  public a a(BDLocation paramBDLocation)
  {
    if ((com.baidu.location.b.l.f.equals("all")) || (com.baidu.location.b.l.g) || (com.baidu.location.b.l.h))
    {
      float[] arrayOfFloat = new float[2];
      Location.distanceBetween(this.A, this.z, paramBDLocation.c(), paramBDLocation.d(), arrayOfFloat);
      if (arrayOfFloat[0] < 100.0F)
      {
        if (this.w != null) {
          return this.w;
        }
      }
      else
      {
        this.x = null;
        this.y = null;
        this.B = true;
        f(null);
      }
    }
    return null;
  }
  
  public void a()
  {
    int i2 = 1;
    if ((this.E != null) && (this.F))
    {
      this.F = false;
      this.h.removeCallbacks(this.E);
    }
    for (int i1 = 1;; i1 = 0)
    {
      Object localObject2;
      if (h.a().j())
      {
        localObject1 = new BDLocation(h.a().g());
        if ((com.baidu.location.b.l.f.equals("all")) || (com.baidu.location.b.l.g) || (com.baidu.location.b.l.h))
        {
          localObject2 = new float[2];
          Location.distanceBetween(this.A, this.z, ((BDLocation)localObject1).c(), ((BDLocation)localObject1).d(), (float[])localObject2);
          if (localObject2[0] < 100.0F)
          {
            if (this.w != null) {
              ((BDLocation)localObject1).a(this.w);
            }
            if (this.x != null) {
              ((BDLocation)localObject1).d(this.x);
            }
            if (this.y != null) {
              ((BDLocation)localObject1).a(this.y);
            }
          }
        }
        f.a().a((BDLocation)localObject1, 21);
        l();
        return;
      }
      if (this.G)
      {
        l();
        return;
      }
      com.baidu.location.b.q.a().b().c(SystemClock.uptimeMillis());
      if (i1 != 0)
      {
        if ((!i.a().d()) || (!i.a().e())) {
          break label581;
        }
        localObject2 = i.a().a(g.a().f(), r.a().j(), null, com.baidu.location.c.l.b, k.a);
        localObject1 = localObject2;
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((BDLocation)localObject2).h() == 66) {
            f.a().a((BDLocation)localObject2, 21);
          }
        }
      }
      label484:
      label581:
      for (Object localObject1 = localObject2;; localObject1 = null)
      {
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          if (((BDLocation)localObject1).h() != 67) {}
        }
        else
        {
          if ((!this.j) && (this.l != null)) {
            break label484;
          }
          localObject1 = e.a().a(false);
          f.a().a((BDLocation)localObject1, 21);
          i1 = i2;
          if (com.baidu.location.b.l.f.equals("all"))
          {
            i1 = i2;
            if (((BDLocation)localObject1).m() == null) {
              i1 = 0;
            }
          }
          i2 = i1;
          if (com.baidu.location.b.l.g)
          {
            i2 = i1;
            if (((BDLocation)localObject1).p() == null) {
              i2 = 0;
            }
          }
          i1 = i2;
          if (com.baidu.location.b.l.h)
          {
            i1 = i2;
            if (((BDLocation)localObject1).a() == null) {
              i1 = 0;
            }
          }
          localObject2 = localObject1;
          if (i1 == 0)
          {
            ((BDLocation)localObject1).a(67);
            localObject2 = localObject1;
          }
        }
        com.baidu.location.b.q.a().b().d(SystemClock.uptimeMillis());
        if ((localObject2 != null) && (((BDLocation)localObject2).h() != 67))
        {
          this.l = ((BDLocation)localObject2);
          com.baidu.location.b.q.a().b().a("ofs");
          if (this.o != null) {
            com.baidu.location.b.q.a().b().b(this.o.j());
          }
          com.baidu.location.b.q.a().c();
        }
        for (;;)
        {
          this.m = null;
          l();
          return;
          f.a().a(this.l, 21);
          localObject2 = localObject1;
          break;
          this.l = null;
          com.baidu.location.b.q.a().b().a("off");
          if (this.o != null) {
            com.baidu.location.b.q.a().b().b(this.o.j());
          }
          com.baidu.location.b.q.a().c();
          continue;
          localObject1 = new BDLocation();
          ((BDLocation)localObject1).a(63);
          this.l = null;
          f.a().a((BDLocation)localObject1, 21);
        }
      }
    }
  }
  
  public void a(Message paramMessage)
  {
    if ((this.E != null) && (this.F))
    {
      this.F = false;
      this.h.removeCallbacks(this.E);
    }
    paramMessage = (BDLocation)paramMessage.obj;
    Object localObject = new BDLocation(paramMessage);
    if (paramMessage.k())
    {
      this.w = paramMessage.l();
      this.z = paramMessage.d();
      this.A = paramMessage.c();
    }
    if (paramMessage.p() != null)
    {
      this.x = paramMessage.p();
      this.z = paramMessage.d();
      this.A = paramMessage.c();
    }
    if (paramMessage.a() != null)
    {
      this.y = paramMessage.a();
      this.z = paramMessage.d();
      this.A = paramMessage.c();
    }
    if (h.a().j())
    {
      paramMessage = new BDLocation(h.a().g());
      if ((com.baidu.location.b.l.f.equals("all")) || (com.baidu.location.b.l.g) || (com.baidu.location.b.l.h))
      {
        localObject = new float[2];
        Location.distanceBetween(this.A, this.z, paramMessage.c(), paramMessage.d(), (float[])localObject);
        if (localObject[0] < 100.0F)
        {
          if (this.w != null) {
            paramMessage.a(this.w);
          }
          if (this.x != null) {
            paramMessage.d(this.x);
          }
          if (this.y != null) {
            paramMessage.a(this.y);
          }
        }
      }
      f.a().a(paramMessage, 21);
      l();
      return;
    }
    if ((paramMessage.r() != null) && (paramMessage.r().equals("sky")))
    {
      paramMessage.e("wf");
      f.a().a(paramMessage, 21);
      this.v = System.currentTimeMillis();
      this.l = paramMessage;
      return;
    }
    if (this.G)
    {
      localObject = new float[2];
      if (this.l != null) {
        Location.distanceBetween(this.l.c(), this.l.d(), paramMessage.c(), paramMessage.d(), (float[])localObject);
      }
      if (localObject[0] > 10.0F)
      {
        this.l = paramMessage;
        if (!this.H)
        {
          this.H = false;
          f.a().a(paramMessage, 21);
        }
      }
      l();
      return;
    }
    com.baidu.location.b.q.a().b().c(SystemClock.uptimeMillis());
    this.m = null;
    if ((this.o != null) && (this.o.a() != 0) && ((paramMessage.q() == 2) || (paramMessage.q() == 0)) && (paramMessage.h() == 167)) {
      new com.baidu.location.g.b(this.o, this.n, true).a();
    }
    int i1;
    if ((paramMessage.h() == 161) && ("cl".equals(paramMessage.r())) && (this.l != null) && (this.l.h() == 161) && ("wf".equals(this.l.r())) && (System.currentTimeMillis() - this.v < 30000L))
    {
      i1 = 1;
      this.m = paramMessage;
    }
    for (;;)
    {
      if (i1 != 0)
      {
        f.a().a(this.l, 21);
        if (!com.baidu.location.b.l.a(paramMessage)) {
          break label930;
        }
        if (i1 == 0) {
          this.l = paramMessage;
        }
        label604:
        i1 = com.baidu.location.b.l.a(c, "ssid\":\"", "\"");
        if ((i1 == Integer.MIN_VALUE) || (this.n == null)) {
          break label938;
        }
      }
      label930:
      label938:
      for (this.k = this.n.d(i1);; this.k = null)
      {
        if ((i.a().d()) && (paramMessage.h() == 161) && ("cl".equals(paramMessage.r())) && (b(this.o)))
        {
          i.a().a(this.o, null, (BDLocation)localObject, com.baidu.location.c.l.b, k.b);
          this.q = this.o;
        }
        if ((i.a().d()) && (paramMessage.h() == 161) && ("wf".equals(paramMessage.r())))
        {
          i.a().a(null, this.n, (BDLocation)localObject, com.baidu.location.c.l.b, k.b);
          this.p = this.n;
        }
        e.a().a(c, this.o, this.n, (BDLocation)localObject);
        if (r.a().g()) {
          i.a().i();
        }
        l();
        return;
        f.a().a(paramMessage, 21);
        this.v = System.currentTimeMillis();
        com.baidu.location.b.q.a().b().d(SystemClock.uptimeMillis());
        if (paramMessage.h() == 161)
        {
          com.baidu.location.b.q.a().b().a("ons");
          if (this.o == null) {
            break;
          }
          com.baidu.location.b.q.a().b().b(this.o.j());
          break;
        }
        com.baidu.location.b.q.a().b().a("onf");
        if (this.o != null) {
          com.baidu.location.b.q.a().b().b(this.o.j());
        }
        com.baidu.location.b.q.a().c();
        break;
        this.l = null;
        break label604;
      }
      i1 = 0;
    }
  }
  
  public void b(Message paramMessage)
  {
    c(paramMessage);
  }
  
  public void c()
  {
    this.r = true;
    this.s = false;
  }
  
  public void d()
  {
    this.s = false;
    this.t = false;
    this.G = false;
    this.H = true;
    i();
  }
  
  public String e()
  {
    return this.x;
  }
  
  public List f()
  {
    return this.y;
  }
  
  public boolean g()
  {
    return this.j;
  }
  
  public void h()
  {
    if (this.t)
    {
      g(null);
      this.t = false;
    }
  }
  
  public void i()
  {
    this.l = null;
  }
  
  public void j()
  {
    BDLocation localBDLocation;
    if ((i.a().d()) && (i.a().g()))
    {
      localBDLocation = i.a().a(g.a().f(), r.a().j(), null, com.baidu.location.c.l.b, k.a);
      if ((localBDLocation != null) && (localBDLocation.h() != 67)) {
        break label167;
      }
      localBDLocation = e.a().a(false);
    }
    label167:
    for (;;)
    {
      if ((localBDLocation != null) && (localBDLocation.h() == 66))
      {
        int i2 = 1;
        int i1 = i2;
        if (com.baidu.location.b.l.f.equals("all"))
        {
          i1 = i2;
          if (localBDLocation.m() == null) {
            i1 = 0;
          }
        }
        i2 = i1;
        if (com.baidu.location.b.l.g)
        {
          i2 = i1;
          if (localBDLocation.p() == null) {
            i2 = 0;
          }
        }
        i1 = i2;
        if (com.baidu.location.b.l.h)
        {
          i1 = i2;
          if (localBDLocation.a() == null) {
            i1 = 0;
          }
        }
        if (i1 != 0) {
          f.a().a(localBDLocation, 21);
        }
      }
      return;
      localBDLocation = e.a().a(false);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */