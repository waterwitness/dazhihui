package com.android.dazhihui.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.jni.DzhNative;
import com.android.dazhihui.ui.delegate.b.k;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class g
{
  private static String Z = "[一-龥]+";
  public static int a;
  public static final boolean b;
  private static g d;
  private w A = w.a;
  private r B = r.a;
  private ExecutorService C = null;
  private c D = null;
  private c E = null;
  private c F = null;
  private boolean G = true;
  private volatile boolean H = true;
  private boolean I = true;
  private boolean J = false;
  private int K = 0;
  private int L = 0;
  private long M = 0L;
  private volatile boolean N = true;
  private volatile boolean O = true;
  private boolean P = true;
  private boolean Q = true;
  private boolean R = false;
  private long S = 0L;
  private byte[] T = { 0, 123, 125, 58 };
  private byte U = Byte.MIN_VALUE;
  private final Object V = new Object();
  private x W = new h(this);
  private int X = -1;
  private Handler Y = new q(this, Looper.getMainLooper());
  public boolean c = false;
  private com.android.dazhihui.g e = com.android.dazhihui.g.a();
  private com.android.dazhihui.w f = com.android.dazhihui.w.a();
  private Context g;
  private a h;
  private a i;
  private a j;
  private Vector<m> k = new Vector();
  private Vector<m> l = new Vector();
  private m m = null;
  private Vector<m> n = new Vector();
  private Vector<m> o = new Vector();
  private m p = null;
  private Vector<m> q = new Vector();
  private Vector<m> r = new Vector();
  private m s = null;
  private List<e> t = new ArrayList();
  private List<d> u = new ArrayList();
  private List<v> v = new ArrayList();
  private List<u> w = new ArrayList();
  private boolean x = false;
  private int y = -2;
  private String z = "";
  
  static
  {
    boolean bool = false;
    a = 0;
    if (Build.VERSION.SDK_INT >= 14) {
      bool = true;
    }
    b = bool;
  }
  
  private g()
  {
    com.android.dazhihui.a.b.a.a();
  }
  
  private void D()
  {
    Log.d("Protocol", "start 1000 dispatch");
    com.android.dazhihui.a.b.o.d();
    this.W.b();
    this.J = false;
    this.R = false;
    this.K = 0;
    this.L = 0;
    this.e.ai();
    Object localObject = this.e.q();
    if (this.h == null) {
      this.h = new n(this, this.g);
    }
    for (;;)
    {
      this.I = false;
      m localm = this.e.af();
      Message.obtain().what = 0;
      this.h.a(localm);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        break label174;
      }
      localObject = ((com.android.dazhihui.j)localm.j()).a;
      if (!this.H) {
        break;
      }
      localObject = com.android.dazhihui.d.n.d((String)localObject);
      this.h.a(localObject[0], Integer.parseInt(localObject[1]));
      this.h.a();
      return;
      this.h.b();
    }
    this.I = true;
    return;
    label174:
    localObject = com.android.dazhihui.d.n.d((String)localObject);
    this.h.a(localObject[0], Integer.parseInt(localObject[1]));
    this.h.a();
  }
  
  private void E()
  {
    this.P = false;
    com.android.dazhihui.a.b.v.c();
    if (this.i == null) {
      this.i = new o(this, this.g);
    }
    this.i.a(com.android.dazhihui.ui.a.e.a().n());
    if (this.N)
    {
      Object localObject = com.android.dazhihui.d.n.a(this.e.E(), this.e.F());
      Log.d("tradelogin", "tryDelegateDispatchAddress  address=" + (String)localObject);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        com.android.dazhihui.ui.a.e.a().l((String)localObject);
        localObject = ((String)localObject).split(":");
        this.i.a(localObject[0], Integer.parseInt(localObject[1]));
        this.i.a();
      }
    }
    else
    {
      return;
    }
    com.android.dazhihui.ui.a.e.a().q();
  }
  
  private void F()
  {
    this.Q = false;
    com.android.dazhihui.a.b.l.c();
    if (this.j == null) {
      this.j = new p(this, this.g);
    }
    this.j.a(com.android.dazhihui.ui.a.h.a().f());
    int i1;
    if (this.O)
    {
      i1 = com.android.dazhihui.ui.a.h.a().g().length;
      if (this.X != -1) {
        break label173;
      }
      if (i1 != 1) {
        break label155;
      }
      this.X = 0;
    }
    for (;;)
    {
      Object localObject = com.android.dazhihui.ui.a.h.a().g()[this.X];
      Log.d("newtrade", "tryNewTradeDispatchAddress  address=" + (String)localObject);
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        break;
      }
      localObject = ((String)localObject).split(":");
      this.j.a(localObject[0], Integer.parseInt(localObject[1]));
      this.j.a();
      return;
      label155:
      this.X = new Random().nextInt(i1);
      continue;
      label173:
      if (this.X == i1 - 1) {
        this.X = 0;
      } else {
        this.X += 1;
      }
    }
    com.android.dazhihui.ui.a.h.a().h();
  }
  
  private void G()
  {
    a(0L);
    H();
    if (this.C != null)
    {
      this.C.shutdown();
      this.C = null;
    }
    synchronized (this.V)
    {
      this.W.c();
      this.k.clear();
      this.l.clear();
      com.android.dazhihui.a.b.o.d();
      return;
    }
  }
  
  private void H()
  {
    this.I = true;
    this.H = true;
    if (this.D != null) {
      this.D.b();
    }
  }
  
  private void I()
  {
    this.P = true;
    this.N = true;
    if (this.E != null) {
      this.E.b();
    }
  }
  
  private void J()
  {
    this.Q = true;
    this.O = true;
    if (this.F != null) {
      this.F.b();
    }
  }
  
  private boolean K()
  {
    int i1 = com.android.dazhihui.ui.a.e.a().j();
    if (i1 == -1) {}
    while (TextUtils.isEmpty(com.android.dazhihui.c.a.a.B[i1][0])) {
      return false;
    }
    return true;
  }
  
  private m L()
  {
    Object localObject = new com.android.dazhihui.a.b.x(2925);
    ((com.android.dazhihui.a.b.x)localObject).a(c());
    localObject = new m((com.android.dazhihui.a.b.x)localObject);
    ((m)localObject).d(false);
    return (m)localObject;
  }
  
  private void M()
  {
    for (;;)
    {
      int i1;
      try
      {
        this.U = ((byte)(this.U + 1));
        i1 = 0;
        if (i1 < this.T.length)
        {
          if (this.U == this.T[i1]) {
            this.U = ((byte)(this.U + 1));
          }
        }
        else
        {
          if (this.U > Byte.MAX_VALUE) {
            this.U = Byte.MIN_VALUE;
          }
          return;
        }
      }
      finally {}
      i1 += 1;
    }
  }
  
  public static g a()
  {
    if (d == null) {
      d = new g();
    }
    return d;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    paramString1 = Pattern.compile(Z).matcher(paramString1);
    StringBuffer localStringBuffer = new StringBuffer();
    while (paramString1.find()) {
      paramString1.appendReplacement(localStringBuffer, URLEncoder.encode(paramString1.group(0), paramString2));
    }
    paramString1.appendTail(localStringBuffer);
    return localStringBuffer.toString();
  }
  
  private void a(int paramInt)
  {
    p();
    if (this.x)
    {
      if (paramInt == 3)
      {
        x();
        d();
      }
      while (paramInt != 4) {
        return;
      }
      this.n.clear();
      this.o.clear();
      if (this.E != null) {
        this.E.b();
      }
      com.android.dazhihui.a.b.v.c();
      return;
    }
    h();
  }
  
  private void a(com.android.dazhihui.a.b.o paramo)
  {
    synchronized (this.V)
    {
      Iterator localIterator = this.k.iterator();
      while (localIterator.hasNext())
      {
        m localm = (m)localIterator.next();
        if (localm.p() == paramo.f())
        {
          localm.l();
          if (!localm.q())
          {
            this.k.remove(localm);
            this.W.e(localm);
          }
        }
      }
      return;
    }
  }
  
  private void b(int paramInt)
  {
    if (paramInt == 0)
    {
      this.Y.removeMessages(0);
      this.Y.sendEmptyMessageDelayed(0, 60000L);
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        this.Y.removeMessages(1);
        this.Y.sendEmptyMessageDelayed(1, 30000L);
        return;
      }
    } while (paramInt != 2);
    this.Y.removeMessages(2);
    this.Y.sendEmptyMessageDelayed(2, 30000L);
  }
  
  private void f(boolean paramBoolean)
  {
    Iterator localIterator = this.v.iterator();
    while (localIterator.hasNext()) {
      ((v)localIterator.next()).j(paramBoolean);
    }
  }
  
  public void A()
  {
    if (this.E != null) {
      this.E.b();
    }
    synchronized (this.V)
    {
      this.n.clear();
      this.o.clear();
      com.android.dazhihui.ui.delegate.b.o.o = false;
      k.d();
      return;
    }
  }
  
  public void B()
  {
    if (this.F != null) {
      this.F.b();
    }
    synchronized (this.V)
    {
      this.q.clear();
      this.r.clear();
      return;
    }
  }
  
  public void C()
  {
    this.W.e();
    Iterator localIterator = this.w.iterator();
    while (localIterator.hasNext())
    {
      u localu = (u)localIterator.next();
      if (localu != null) {
        localu.finishMarketDispatch();
      }
    }
  }
  
  public void a(long paramLong)
  {
    this.S = paramLong;
  }
  
  public void a(Context paramContext)
  {
    this.g = paramContext;
    p();
    this.D = new i(this, this.g);
    this.E = new j(this, this.g);
    this.F = new l(this, this.g);
  }
  
  public void a(com.android.dazhihui.a.b.h paramh)
  {
    long l1 = 7000L;
    if (this.g == null) {}
    do
    {
      do
      {
        do
        {
          return;
          paramh.c(false);
          if ((paramh instanceof f))
          {
            if (this.C == null) {
              this.C = Executors.newFixedThreadPool(2);
            }
            this.C.execute(new t(this, (f)paramh));
            return;
          }
        } while (!(paramh instanceof m));
        b(paramh);
        paramh = (m)paramh;
        if ((!o()) && (p() == 2))
        {
          ??? = Message.obtain();
          ((Message)???).what = 1;
          ((Message)???).obj = new com.android.dazhihui.a.a.a("The network connection exception");
          paramh.a((Message)???);
          return;
        }
        paramh.a(this.U);
        M();
        if (paramh.e() != com.android.dazhihui.a.b.d.a) {
          break;
        }
      } while (paramh.s().size() == 0);
      if (paramh.r()) {}
      long l2;
      synchronized (this.V)
      {
        this.k.add(paramh);
        l2 = 15000L;
        if (!this.H) {}
      }
      for (;;)
      {
        synchronized (this.V)
        {
          this.l.add(paramh);
          l1 = l2;
          if (this.I)
          {
            d();
            l1 = l2;
          }
          if (!paramh.r()) {
            break;
          }
          ??? = Message.obtain();
          ((Message)???).what = 0;
          paramh.b(true);
          paramh.a((Message)???, l1);
          return;
          paramh = finally;
          throw paramh;
        }
        if (this.D.c() == 0) {
          synchronized (this.V)
          {
            this.l.add(paramh);
            l1 = l2;
          }
        }
        if (this.D.c() == 1) {
          synchronized (this.V)
          {
            this.l.add(paramh);
            l1 = l2;
          }
        }
        l1 = l2;
        if (this.D.c() == 2)
        {
          this.W.c(paramh);
          b(0);
          l1 = paramh.c();
        }
      }
      if (paramh.e() == com.android.dazhihui.a.b.d.b) {
        for (;;)
        {
          synchronized (this.V)
          {
            this.n.add(paramh);
            if (this.N)
            {
              l2 = l1;
              if (this.P)
              {
                e();
                l2 = l1;
              }
              if (!paramh.r()) {
                break;
              }
              ??? = Message.obtain();
              ((Message)???).what = 0;
              paramh.a((Message)???, l2);
              return;
            }
          }
          if (this.E.c() == 0) {
            synchronized (this.V)
            {
              this.o.add(paramh);
              this.E.b();
              this.E.a(this.e.H(), this.e.I());
              this.E.a();
              l2 = l1;
            }
          }
          if (this.E.c() == 1) {
            synchronized (this.V)
            {
              this.o.add(paramh);
              l2 = l1;
            }
          }
          l2 = l1;
          if (this.E.c() == 2) {
            synchronized (this.V)
            {
              this.E.a(paramh.n());
              paramh.a(true);
              b(1);
              l2 = paramh.c();
            }
          }
        }
      }
    } while (paramh.e() != com.android.dazhihui.a.b.d.c);
    synchronized (this.V)
    {
      this.q.add(paramh);
      if ((this.O) && (this.Q)) {
        f();
      }
      if (this.F.c() != 0) {}
    }
    for (;;)
    {
      synchronized (this.V)
      {
        this.r.add(paramh);
        this.F.b();
        this.F.a(this.e.J(), this.e.K());
        this.F.a();
        if (!paramh.r()) {
          break;
        }
        ??? = Message.obtain();
        ((Message)???).what = 0;
        paramh.a((Message)???, l1);
        return;
        paramh = finally;
        throw paramh;
      }
      if (this.F.c() == 1) {
        synchronized (this.V)
        {
          this.r.add(paramh);
        }
      }
      if (this.F.c() != 2) {
        continue;
      }
      synchronized (this.V)
      {
        this.F.a(paramh.n());
        paramh.a(true);
        b(2);
        l1 = paramh.c();
      }
    }
  }
  
  public void a(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    Iterator localIterator = this.u.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (locald != null) {
        locald.a(paramh, paramj);
      }
    }
  }
  
  public void a(com.android.dazhihui.a.b.j paramj)
  {
    Iterator localIterator = this.u.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (locald != null) {
        locald.a(paramj);
      }
    }
  }
  
  public void a(m paramm, String paramString, int paramInt)
  {
    paramString = new a(this.g, paramString, paramInt);
    paramString.a(paramm);
    paramString.a();
  }
  
  public void a(d paramd)
  {
    if (!this.u.contains(paramd)) {
      this.u.add(paramd);
    }
  }
  
  public void a(e parame)
  {
    if (!this.t.contains(parame)) {
      this.t.add(parame);
    }
  }
  
  public void a(u paramu)
  {
    if ((paramu != null) && (!this.w.contains(paramu))) {
      this.w.add(paramu);
    }
  }
  
  public void a(v paramv)
  {
    if ((paramv != null) && (!this.v.contains(paramv))) {
      this.v.add(paramv);
    }
  }
  
  public void a(w paramw)
  {
    this.A = paramw;
  }
  
  public void a(boolean paramBoolean)
  {
    DzhNative.getInstance().closeAllRoutine();
    this.e.ah();
    a(0L);
    if (!paramBoolean) {
      com.android.dazhihui.w.a().u();
    }
    this.x = paramBoolean;
    if (this.x)
    {
      this.Y.removeMessages(6);
      this.Y.sendEmptyMessage(6);
    }
    if (this.x) {
      m();
    }
    Log.d("Protocol", "DISPATCH_ADDRESS_MSG");
    f(this.x);
    if ((this.x) && (this.A == w.b)) {
      this.c = false;
    }
  }
  
  public void b(com.android.dazhihui.a.b.h paramh)
  {
    if (((paramh instanceof m)) && (!paramh.b())) {
      synchronized (this.V)
      {
        if ((paramh instanceof com.android.dazhihui.a.b.u))
        {
          if (this.n.contains(paramh)) {
            this.n.remove(paramh);
          }
          if (this.o.contains(paramh)) {
            this.o.remove(paramh);
          }
        }
        do
        {
          return;
          this.W.d((m)paramh);
          if (this.k.contains(paramh)) {
            this.k.remove(paramh);
          }
        } while (!this.l.contains(paramh));
        this.l.remove(paramh);
      }
    }
  }
  
  public void b(u paramu)
  {
    if ((paramu != null) && (this.w.contains(paramu))) {
      this.w.remove(paramu);
    }
  }
  
  public void b(v paramv)
  {
    if ((paramv != null) && (this.v.contains(paramv))) {
      this.v.remove(paramv);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.G != paramBoolean)
    {
      if (!paramBoolean) {
        break label56;
      }
      this.G = true;
      if ((o()) && (!u()))
      {
        this.L = 0;
        this.Y.sendEmptyMessage(8);
        Log.e("Protocol", "screen on");
      }
    }
    return;
    label56:
    this.G = false;
  }
  
  public boolean b()
  {
    return this.g != null;
  }
  
  public long c()
  {
    return this.S;
  }
  
  public void c(com.android.dazhihui.a.b.h paramh)
  {
    if ((!(paramh instanceof m)) || ((paramh instanceof com.android.dazhihui.a.b.u))) {}
    do
    {
      do
      {
        do
        {
          return;
        } while ((!this.k.contains(paramh)) || (!this.J) || (((m)paramh).d() <= this.M));
        this.L += 1;
        if (!this.G) {
          this.D.a(0);
        }
        if (this.L >= 4)
        {
          this.K += 1;
          this.L = 0;
          if (!this.Y.hasMessages(8))
          {
            this.D.a(0);
            this.Y.sendEmptyMessageDelayed(8, 100L);
            Log.e("Protocol", "RESET_MARKET_MSG");
          }
        }
      } while (this.K < 2);
      this.K = 0;
      this.L = 0;
      this.J = false;
    } while (this.Y.hasMessages(7));
    this.Y.removeMessages(8);
    this.Y.sendEmptyMessage(7);
    Log.e("Protocol", "DISPATCH_MARKET_MSG");
  }
  
  public void c(boolean paramBoolean)
  {
    this.H = paramBoolean;
    this.I = true;
  }
  
  public void d()
  {
    if ((this.x) && (this.H)) {
      D();
    }
  }
  
  public void d(com.android.dazhihui.a.b.h paramh)
  {
    Iterator localIterator = this.t.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale != null) {
        locale.a(paramh);
      }
    }
  }
  
  public void d(boolean paramBoolean)
  {
    this.N = paramBoolean;
    this.P = true;
  }
  
  public void e()
  {
    if ((this.x) && (this.N)) {
      E();
    }
  }
  
  public void e(boolean paramBoolean)
  {
    this.O = paramBoolean;
    this.Q = true;
  }
  
  public void f()
  {
    if ((this.x) && (this.O)) {
      F();
    }
  }
  
  public void g()
  {
    this.X = -1;
  }
  
  public void h()
  {
    H();
    I();
    i();
  }
  
  public void i()
  {
    if (this.C != null)
    {
      this.C.shutdown();
      this.C = null;
    }
    I();
    synchronized (this.V)
    {
      this.W.c();
      this.k.clear();
      this.l.clear();
      this.n.clear();
      this.o.clear();
      com.android.dazhihui.a.b.o.d();
      return;
    }
  }
  
  public void j()
  {
    if ((this.x) && (K()))
    {
      y();
      e();
    }
  }
  
  public void k()
  {
    if (this.x)
    {
      z();
      f();
    }
  }
  
  public void l()
  {
    if (this.H)
    {
      h();
      p();
      if (this.x) {
        d();
      }
      return;
    }
    this.e.ak();
  }
  
  public void m()
  {
    com.android.dazhihui.ui.delegate.a.a().l();
    d(false);
  }
  
  public void n()
  {
    G();
    if (this.x) {
      d();
    }
  }
  
  public boolean o()
  {
    return this.x;
  }
  
  public int p()
  {
    int i3 = 1;
    Object localObject1 = w.a;
    Object localObject2 = r.a;
    NetworkInfo[] arrayOfNetworkInfo = ((ConnectivityManager)this.g.getSystemService("connectivity")).getAllNetworkInfo();
    int i2;
    label80:
    Object localObject3;
    int i1;
    if (arrayOfNetworkInfo != null)
    {
      i2 = 0;
      if (i2 >= arrayOfNetworkInfo.length) {
        break label621;
      }
      if (arrayOfNetworkInfo[i2].isConnected())
      {
        int i4 = arrayOfNetworkInfo[i2].getType();
        if (i4 == 1)
        {
          localObject2 = w.b;
          localObject1 = r.b;
        }
        for (;;)
        {
          localObject3 = arrayOfNetworkInfo[i2].getExtraInfo();
          this.x = true;
          if ((i4 == this.y) && ((i4 != 1) || ((localObject3 != null) && (((String)localObject3).equals(this.z)))) && ((i4 != 0) || ((this.A == localObject2) && (this.B == localObject1)))) {
            break;
          }
          this.y = i4;
          this.z = ((String)localObject3);
          this.A = ((w)localObject2);
          this.B = ((r)localObject1);
          return 1;
          if (i4 != 0) {
            break label612;
          }
          localObject1 = ((TelephonyManager)this.g.getSystemService("phone")).getSubscriberId();
          if ((localObject1 != null) && (!((String)localObject1).startsWith("46000")) && (!((String)localObject1).startsWith("46002")) && (!((String)localObject1).startsWith("46007"))) {
            if ((!((String)localObject1).startsWith("46001")) && (!((String)localObject1).startsWith("46006")))
            {
              if ((!((String)localObject1).startsWith("46003")) && (!((String)localObject1).startsWith("46005"))) {
                break label606;
              }
              i1 = 3;
            }
          }
          for (;;)
          {
            label267:
            switch (arrayOfNetworkInfo[i2].getSubtype())
            {
            default: 
              localObject2 = w.a;
              localObject1 = r.a;
              break label80;
              i1 = 2;
              continue;
              i1 = 1;
            }
          }
          localObject2 = w.c;
          switch (i1)
          {
          default: 
            localObject1 = r.a;
            break;
          case 1: 
            localObject1 = r.c;
            break;
          case 2: 
            localObject1 = r.d;
            break;
          case 3: 
            localObject1 = r.e;
            continue;
            localObject2 = w.d;
            switch (i1)
            {
            default: 
              localObject1 = r.a;
              break;
            case 1: 
              localObject1 = r.f;
              break;
            case 2: 
              localObject1 = r.g;
              break;
            case 3: 
              localObject1 = r.e;
              continue;
              localObject2 = w.e;
              switch (i1)
              {
              default: 
                localObject1 = r.a;
                break;
              case 1: 
                localObject1 = r.h;
                break;
              case 2: 
                localObject1 = r.i;
                break;
              case 3: 
                localObject1 = r.j;
              }
              break;
            }
            break;
          }
        }
        this.y = i4;
        i1 = i3;
      }
    }
    for (;;)
    {
      this.A = ((w)localObject2);
      this.B = ((r)localObject1);
      if (i1 == 0)
      {
        this.x = false;
        this.y = -1;
        this.z = "";
        return 2;
        i2 += 1;
        break;
      }
      return 0;
      label606:
      i1 = 0;
      break label267;
      label612:
      localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
      break label80;
      label621:
      i1 = 0;
      localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }
  
  public int q()
  {
    return this.y;
  }
  
  public w r()
  {
    return this.A;
  }
  
  public r s()
  {
    return this.B;
  }
  
  public void t()
  {
    this.D.a(this.e.C(), this.e.D());
    this.D.a();
  }
  
  public boolean u()
  {
    return (this.D != null) && (this.D.c() == 2);
  }
  
  public boolean v()
  {
    return (this.E != null) && (this.E.c() == 2);
  }
  
  public boolean w()
  {
    return (this.F != null) && (this.F.c() == 2);
  }
  
  public void x()
  {
    H();
    com.android.dazhihui.w.a().u();
    synchronized (this.V)
    {
      this.W.c();
      this.k.clear();
      this.l.clear();
      return;
    }
  }
  
  public void y()
  {
    I();
    synchronized (this.V)
    {
      this.n.clear();
      this.o.clear();
      return;
    }
  }
  
  public void z()
  {
    J();
    synchronized (this.V)
    {
      this.q.clear();
      this.r.clear();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */