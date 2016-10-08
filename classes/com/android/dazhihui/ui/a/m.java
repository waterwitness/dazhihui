package com.android.dazhihui.ui.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.e;
import com.android.dazhihui.d.bi;
import com.android.dazhihui.receiver.HeartPkgReceiver;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo;
import com.android.dazhihui.ui.model.stock.MarketMenuVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.StockMinuteMenuVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.WarningItem;
import com.android.dazhihui.ui.screen.stock.uc;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class m
  implements i, com.android.dazhihui.a.d, e
{
  private static m b;
  private boolean A = true;
  private boolean B = true;
  private int C = 0;
  private int D = 0;
  private int E = 1;
  private int F = 0;
  private int G = 0;
  private byte[] H = new byte[3];
  private int I = 1;
  private int J = 0;
  private boolean K = false;
  private Map<String, String> L = new HashMap();
  private int M = 0;
  private boolean N = false;
  private int O = 0;
  private int P = 0;
  private int Q = 10;
  private String R = "";
  private List<WarningItem> S = null;
  private WarningItem T = null;
  private SelfSelectedStockManager U = null;
  private List<o> V = new ArrayList();
  private LeftMenuVo W;
  private LivebarConfigVo X;
  private StockMinuteMenuVo Y;
  private MarketMenuVo Z;
  private String a = "101007105";
  private uc aa = null;
  private boolean ab = false;
  private String ac = "";
  private Handler ad = new n(this, Looper.getMainLooper());
  private Context c = null;
  private Vector<com.android.dazhihui.a.b.w> d;
  private List<bi> e = new ArrayList();
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private long l;
  private long m;
  private int n = 5;
  private int o = 5;
  private int p = 15;
  private boolean q;
  private boolean r;
  private Vector<StockVo> s = new Vector();
  private Vector<String[]> t = new Vector();
  private int u = 0;
  private int v = 0;
  private boolean w = false;
  private boolean x = false;
  private boolean y = false;
  private boolean z = false;
  
  private m()
  {
    com.android.dazhihui.a.g.a().a(this);
    com.android.dazhihui.a.g.a().a(this);
    this.U = SelfSelectedStockManager.getInstance();
    this.d = new Vector();
    this.ad.sendEmptyMessageDelayed(2, 300000L);
  }
  
  private void N()
  {
    if (this.d.size() >= 95)
    {
      this.ad.removeMessages(2);
      this.ad.sendEmptyMessage(2);
    }
  }
  
  public static m a()
  {
    if (b == null) {
      b = new m();
    }
    return b;
  }
  
  public int A()
  {
    return this.v;
  }
  
  public void B()
  {
    Object localObject = new x(3001);
    ((x)localObject).b(0);
    x localx = new x(305);
    localx.a("");
    localx.a("");
    String str = com.android.dazhihui.w.a().k();
    if ((str == null) || (str.length() < 11)) {
      localx.a("");
    }
    for (;;)
    {
      localx.a(com.android.dazhihui.w.a().n());
      localx.a(com.android.dazhihui.g.a().v());
      localx.b(com.android.dazhihui.g.a().ac());
      localx.a(com.android.dazhihui.g.a().r());
      localx.d(this.C);
      ((x)localObject).a(localx, this.O);
      localObject = new com.android.dazhihui.a.b.m((x)localObject, com.android.dazhihui.a.b.n.b);
      ((com.android.dazhihui.a.b.m)localObject).d(false);
      com.android.dazhihui.a.g.a().a((h)localObject);
      return;
      localx.a(str);
    }
  }
  
  public void C()
  {
    Object localObject = new x(3001);
    this.S = new ArrayList();
    ((x)localObject).b(2);
    x localx = new x(307);
    localx.a("");
    localx.a("");
    String str = com.android.dazhihui.w.a().k();
    if ((str == null) || (str.length() < 11)) {
      localx.a("");
    }
    for (;;)
    {
      localx.a(com.android.dazhihui.w.a().n());
      localx.a(com.android.dazhihui.g.a().v());
      localx.b(com.android.dazhihui.g.a().ac());
      localx.a(com.android.dazhihui.g.a().r());
      ((x)localObject).a(localx, this.O);
      localObject = new com.android.dazhihui.a.b.m((x)localObject, com.android.dazhihui.a.b.n.b);
      ((com.android.dazhihui.a.b.m)localObject).d(false);
      com.android.dazhihui.a.g.a().a((h)localObject);
      return;
      localx.a(str);
    }
  }
  
  public void D()
  {
    Object localObject = new x(3001);
    ((x)localObject).b(2);
    x localx = new x(102);
    localx.a("");
    localx.a("");
    String str = com.android.dazhihui.w.a().k();
    if ((str == null) || (str.length() < 11)) {
      localx.a("");
    }
    for (;;)
    {
      localx.a(com.android.dazhihui.w.a().n());
      localx.a(com.android.dazhihui.g.a().v());
      localx.b(com.android.dazhihui.g.a().ac());
      localx.a(com.android.dazhihui.g.a().r());
      localx.d(this.D);
      ((x)localObject).a(localx, this.O);
      localObject = new com.android.dazhihui.a.b.m((x)localObject, com.android.dazhihui.a.b.n.b);
      ((com.android.dazhihui.a.b.m)localObject).a(this);
      com.android.dazhihui.a.g.a().a((h)localObject);
      return;
      localx.a(str);
    }
  }
  
  public void E()
  {
    Object localObject = new x(3001);
    ((x)localObject).b(2);
    x localx = new x(101);
    localx.a("");
    localx.a("");
    String str = com.android.dazhihui.w.a().k();
    if ((str == null) || (str.length() < 11)) {
      localx.a("");
    }
    for (;;)
    {
      localx.a(com.android.dazhihui.w.a().n());
      localx.a(com.android.dazhihui.g.a().v());
      localx.b(com.android.dazhihui.g.a().ac());
      localx.a(com.android.dazhihui.g.a().r());
      localx.c(3);
      ((x)localObject).a(localx, this.O);
      localObject = new com.android.dazhihui.a.b.m((x)localObject, com.android.dazhihui.a.b.n.b);
      ((com.android.dazhihui.a.b.m)localObject).d(false);
      ((com.android.dazhihui.a.b.m)localObject).a(this);
      com.android.dazhihui.a.g.a().a((h)localObject);
      return;
      localx.a(str);
    }
  }
  
  public void F()
  {
    this.ad.removeMessages(2);
    this.ad.sendEmptyMessageDelayed(2, 300000L);
    if (this.d.isEmpty()) {
      return;
    }
    Object localObject = new x(3000);
    ((x)localObject).b(0);
    x localx = new x(105);
    localx.a(com.android.dazhihui.g.a().u());
    localx.a(com.android.dazhihui.g.a().C());
    StringBuffer localStringBuffer = new StringBuffer();
    while (!this.d.isEmpty())
    {
      com.android.dazhihui.a.b.w localw = (com.android.dazhihui.a.b.w)this.d.get(0);
      localStringBuffer.append(localw.b()).append(",").append(localw.c()).append(",").append(localw.d()).append(",").append(localw.e()).append(",").append(localw.f()).append("\n");
      this.d.remove(0);
    }
    localx.b(localStringBuffer.toString());
    ((x)localObject).a(localx);
    localObject = new com.android.dazhihui.a.b.m((x)localObject, com.android.dazhihui.a.b.n.b);
    com.android.dazhihui.a.g.a().a((h)localObject);
  }
  
  public void G()
  {
    if (com.android.dazhihui.a.g.a().o())
    {
      if (this.N)
      {
        B();
        D();
      }
    }
    else {
      return;
    }
    E();
  }
  
  public int H()
  {
    return 30;
  }
  
  public void I()
  {
    Iterator localIterator = this.V.iterator();
    while (localIterator.hasNext()) {
      ((o)localIterator.next()).c_();
    }
  }
  
  public LeftMenuVo J()
  {
    return this.W;
  }
  
  public StockMinuteMenuVo K()
  {
    return this.Y;
  }
  
  public MarketMenuVo L()
  {
    return this.Z;
  }
  
  public uc M()
  {
    return this.aa;
  }
  
  public bi a(String paramString, int paramInt)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      bi localbi = (bi)localIterator.next();
      if (localbi.b == null) {
        return null;
      }
      if ((localbi.b.equals(paramString)) && (localbi.c == paramInt)) {
        return localbi;
      }
    }
    return null;
  }
  
  public void a(int paramInt)
  {
    this.Q = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.l = paramLong;
    this.m = System.currentTimeMillis();
  }
  
  public void a(Context paramContext)
  {
    this.c = paramContext;
    this.U.setContext(paramContext);
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    paramContext = PendingIntent.getBroadcast(paramContext, 0, new Intent(paramContext, HeartPkgReceiver.class), 0);
    localAlarmManager.set(0, System.currentTimeMillis() + 60000L, paramContext);
  }
  
  public void a(h paramh)
  {
    if ((com.android.dazhihui.g.a().aa()) && ((paramh instanceof com.android.dazhihui.a.b.m)))
    {
      paramh = ((com.android.dazhihui.a.b.m)paramh).s();
      int i1 = 0;
      if (i1 < paramh.size())
      {
        x localx = (x)paramh.get(i1);
        com.android.dazhihui.a.b.w localw = new com.android.dazhihui.a.b.w();
        localw.c(String.valueOf(localx.a()));
        Object localObject = localx.d();
        if (localObject == null) {
          localw.d("0");
        }
        for (;;)
        {
          localObject = new Date();
          localw.a(new SimpleDateFormat("yyMMddHHmmss.S").format((Date)localObject));
          localw.b("" + System.currentTimeMillis() + i1);
          localw.e("0");
          localx.a(localw);
          this.d.add(localw);
          i1 += 1;
          break;
          localw.d(String.valueOf(((x)localObject).a()));
        }
      }
      N();
    }
  }
  
  public void a(h paramh, j paramj)
  {
    if ((com.android.dazhihui.g.a().aa()) && ((paramh instanceof com.android.dazhihui.a.b.m)))
    {
      paramh = ((com.android.dazhihui.a.b.m)paramh).s();
      int i1 = 0;
      while (i1 < paramh.size())
      {
        paramj = (x)paramh.get(i1);
        if (!paramj.e())
        {
          paramj.a(true);
          paramj = paramj.f();
          if (paramj != null)
          {
            paramj = paramj.a();
            Date localDate = new Date();
            paramj.a(new SimpleDateFormat("yyMMddHHmmss.S").format(localDate));
            paramj.e("1");
            this.d.add(paramj);
          }
        }
        i1 += 1;
      }
      N();
    }
  }
  
  public void a(j paramj) {}
  
  public void a(bi parambi)
  {
    if (!this.e.contains(parambi)) {
      this.e.add(parambi);
    }
  }
  
  public void a(o paramo)
  {
    if (paramo != null) {
      this.V.add(paramo);
    }
  }
  
  public void a(LeftMenuVo paramLeftMenuVo)
  {
    this.W = paramLeftMenuVo;
  }
  
  public void a(LivebarConfigVo paramLivebarConfigVo)
  {
    this.X = paramLivebarConfigVo;
  }
  
  public void a(StockMinuteMenuVo paramStockMinuteMenuVo)
  {
    this.Y = paramStockMinuteMenuVo;
  }
  
  public void a(WarningItem paramWarningItem)
  {
    this.T = paramWarningItem;
  }
  
  public void a(uc paramuc)
  {
    this.aa = paramuc;
  }
  
  public void a(String paramString)
  {
    this.R = paramString;
  }
  
  public void a(List<WarningItem> paramList)
  {
    this.S = paramList;
  }
  
  public void a(Map<String, String> paramMap)
  {
    this.L = paramMap;
  }
  
  public void a(Vector<String[]> paramVector)
  {
    this.t = paramVector;
  }
  
  public void a(boolean paramBoolean)
  {
    this.N = paramBoolean;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.H = paramArrayOfByte;
  }
  
  public SelfSelectedStockManager b()
  {
    return this.U;
  }
  
  public void b(int paramInt)
  {
    this.P = paramInt;
  }
  
  public void b(o paramo)
  {
    if ((paramo != null) && (this.V.contains(paramo))) {
      this.V.remove(paramo);
    }
  }
  
  public void b(WarningItem paramWarningItem)
  {
    if (this.S == null) {
      this.S = new ArrayList();
    }
    if (paramWarningItem != null) {
      this.S.add(paramWarningItem);
    }
  }
  
  public void b(String paramString)
  {
    this.ac = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.K = paramBoolean;
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      locald.a("FIRST_WARN", i1);
      locald.g();
      return;
    }
  }
  
  public String c()
  {
    return this.a;
  }
  
  public void c(int paramInt)
  {
    this.O = paramInt;
  }
  
  public void c(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  public int d()
  {
    return this.Q;
  }
  
  public void d(int paramInt)
  {
    this.E = paramInt;
  }
  
  public void d(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }
  
  public List<WarningItem> e()
  {
    if (this.S == null) {
      this.S = new ArrayList();
    }
    return this.S;
  }
  
  public void e(int paramInt)
  {
    this.J = paramInt;
  }
  
  public void e(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }
  
  public void f()
  {
    if (this.S == null) {
      this.S = new ArrayList();
    }
    this.S.clear();
  }
  
  public void f(int paramInt)
  {
    this.I = paramInt;
  }
  
  public void f(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  public LivebarConfigVo g()
  {
    return this.X;
  }
  
  public void g(int paramInt)
  {
    this.G = paramInt;
  }
  
  public void g(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  public int h()
  {
    return this.O;
  }
  
  public void h(int paramInt)
  {
    this.F = paramInt;
  }
  
  public void h(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  public void handleResponse(h paramh, j paramj) {}
  
  public void handleTimeout(h paramh) {}
  
  public Map<String, String> i()
  {
    return this.L;
  }
  
  public void i(int paramInt)
  {
    this.C = paramInt;
  }
  
  public void i(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  public int j()
  {
    return this.J;
  }
  
  public void j(int paramInt)
  {
    this.D = paramInt;
  }
  
  public void j(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  public int k()
  {
    return this.G;
  }
  
  public void k(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void k(boolean paramBoolean)
  {
    this.ab = paramBoolean;
  }
  
  public int l()
  {
    return this.F;
  }
  
  public void l(int paramInt)
  {
    this.h = paramInt;
  }
  
  public List<bi> m()
  {
    return this.e;
  }
  
  public void m(int paramInt)
  {
    this.i = paramInt;
  }
  
  public int n()
  {
    return this.g;
  }
  
  public void n(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  public int o()
  {
    return this.h;
  }
  
  public void o(int paramInt)
  {
    this.j = paramInt;
  }
  
  public int p()
  {
    return this.f;
  }
  
  public void p(int paramInt)
  {
    this.k = paramInt;
  }
  
  public long q()
  {
    return this.l;
  }
  
  public void q(int paramInt)
  {
    this.n = paramInt;
    com.android.dazhihui.c.a.d.a().a("TIME_MINUTE", this.n);
    com.android.dazhihui.c.a.d.a().g();
  }
  
  public long r()
  {
    return this.m;
  }
  
  public void r(int paramInt)
  {
    this.o = paramInt;
    com.android.dazhihui.c.a.d.a().a("TIME_KLINE", this.o);
    com.android.dazhihui.c.a.d.a().g();
  }
  
  public int s()
  {
    return this.n;
  }
  
  public void s(int paramInt)
  {
    this.p = paramInt;
    com.android.dazhihui.c.a.d.a().a("TIME_RANK", this.p);
    com.android.dazhihui.c.a.d.a().g();
  }
  
  public int t()
  {
    return this.o;
  }
  
  public StockVo t(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.s.size())) {
      return (StockVo)this.s.elementAt(paramInt);
    }
    return null;
  }
  
  public int u()
  {
    return this.p;
  }
  
  public void u(int paramInt)
  {
    this.u = paramInt;
  }
  
  public Vector<StockVo> v()
  {
    return this.s;
  }
  
  public void v(int paramInt)
  {
    this.M = paramInt;
  }
  
  public void w()
  {
    this.s.clear();
  }
  
  public void w(int paramInt)
  {
    this.v = paramInt;
  }
  
  public int x()
  {
    return this.u;
  }
  
  public int y()
  {
    return this.M;
  }
  
  public Vector<String[]> z()
  {
    return this.t;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */