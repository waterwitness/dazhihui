package com.android.dazhihui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.f;
import com.android.dazhihui.a.v;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.ToastMaker;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;

public class g
  implements i, v
{
  public static g a;
  public static final SimpleDateFormat b;
  private static String s = "Gphone";
  private static int t = 3;
  private static String u = "SystemId";
  private Context A = null;
  private String B;
  private String C;
  private boolean D = false;
  private boolean E = false;
  private boolean F = false;
  private String G;
  private int H;
  private String I;
  private int J = 1;
  private int K;
  private int L = 3;
  private boolean M;
  private boolean N;
  private int O = -1;
  private int P = 0;
  private int Q = -1;
  private String R = "";
  private boolean S;
  private boolean T;
  private boolean U = false;
  private String V = "";
  private int W = 0;
  private int X = 0;
  private int Y = 0;
  private int Z = 0;
  private long aA = 0L;
  private int aB = 0;
  private long aC = 0L;
  private int aD = 0;
  private long aE = 0L;
  private int aF = 0;
  private long aG = 0L;
  private int aH = 0;
  private long aI = 0L;
  private int aJ = 0;
  private List<n> aK = new ArrayList();
  private HashMap<String, l> aL = new HashMap();
  private final Object aM = new Object();
  private Handler aN = new h(this, Looper.getMainLooper());
  private int aa = 0;
  private float ab;
  private int ac = 0;
  private int ad = 0;
  private int ae = 1;
  private String af = "";
  private String ag = "";
  private boolean ah = true;
  private boolean ai = true;
  private boolean aj = true;
  private boolean ak = true;
  private boolean al = true;
  private boolean am = false;
  private boolean an = false;
  private com.android.dazhihui.a.b.m ao;
  private com.baidu.location.h ap;
  private double aq;
  private double ar;
  private String as;
  private String at;
  private String au;
  private List<j> av;
  private Map<String, String> aw = new HashMap();
  private y ax = y.a;
  private long ay = 0L;
  private int az = 0;
  private com.android.dazhihui.d.a.b c;
  private String d = null;
  private int e = -1;
  private String[] f = null;
  private int[] g = null;
  private int[] h = null;
  private String i = null;
  private int j = -1;
  private String[] k = null;
  private String l = null;
  private int m = -1;
  private int n = 0;
  private String o = null;
  private int p = 0;
  private String q = null;
  private String r = null;
  private String v = "";
  private String w = "";
  private String x = "";
  private boolean y = false;
  private String z;
  
  static
  {
    if ("app_dzh".equals("app_sb"))
    {
      s = "gvbac";
      t = 25;
    }
    for (u = "SystemIdShiBa";; u = "SystemId")
    {
      b = new SimpleDateFormat("HHmmss");
      return;
      s = "Gphone";
      t = 3;
    }
  }
  
  public static g a()
  {
    if (a == null) {
      a = new g();
    }
    return a;
  }
  
  private void au()
  {
    int i2 = 0;
    this.ap = new com.baidu.location.h(this.A);
    this.ap.b(new k(this));
    com.android.dazhihui.a.g.a().a(this);
    an();
    com.android.dazhihui.ui.a.m.a().a(this.A);
    a.c().a(this.A);
    this.c = new com.android.dazhihui.d.a.b(this.A);
    if (this.n == 0) {
      this.n = com.android.dazhihui.d.n.a(this.A);
    }
    Object localObject1 = this.A.getPackageManager();
    for (;;)
    {
      try
      {
        localObject2 = ((PackageManager)localObject1).getPackageInfo(this.A.getPackageName(), 0);
        this.o = ((PackageInfo)localObject2).versionName;
        this.p = ((PackageInfo)localObject2).versionCode;
        if ((((PackageManager)localObject1).getApplicationInfo(this.A.getPackageName(), 0).flags & 0x2) == 0) {
          continue;
        }
        bool = true;
        this.y = bool;
        if (TextUtils.isEmpty(this.o)) {
          this.o = this.A.getString(2131166400);
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject2;
        boolean bool;
        String str;
        int i1;
        int i3;
        localNameNotFoundException.printStackTrace();
        continue;
        this.q = localNameNotFoundException.b("SYSTEM_ID");
        if (TextUtils.isEmpty(this.q)) {
          continue;
        }
        com.android.dazhihui.c.b.c.a(this.A, u, this.q);
        continue;
        if (str.charAt(i1) != '|') {
          continue;
        }
        ((Vector)localObject2).addElement(localNameNotFoundException.toString());
        StringBuffer localStringBuffer = new StringBuffer();
        i1 += 1;
        continue;
        localStringBuffer.append(str.charAt(i1));
        continue;
      }
      localObject1 = d.a();
      localObject2 = com.android.dazhihui.c.b.c.c(this.A, u);
      if (localObject2 == null) {
        continue;
      }
      this.q = new String((byte[])localObject2);
      if (TextUtils.isEmpty(this.q))
      {
        this.q = aw();
        com.android.dazhihui.c.b.c.a(this.A, u, this.q);
        ((d)localObject1).a("SYSTEM_ID", this.q);
      }
      if (TextUtils.isEmpty(this.r)) {
        this.r = ax();
      }
      b(f.a);
      a(((d)localObject1).b("dzh_look_face", 0));
      ((d)localObject1).g();
      localObject2 = new Vector();
      str = this.A.getSharedPreferences("save_dispatch_address", 0).getString("save_dispatch_address", null);
      if (!TextUtils.isEmpty(str))
      {
        localObject1 = new StringBuffer();
        i1 = 0;
        if (str.charAt(i1) != '$') {
          continue;
        }
        ((Vector)localObject2).addElement(((StringBuffer)localObject1).toString());
      }
      localObject1 = new String[((Vector)localObject2).size()];
      ((Vector)localObject2).toArray((Object[])localObject1);
      b((String[])localObject1);
      if (localObject1 == null) {
        return;
      }
      i3 = localObject1.length;
      i1 = i2;
      if (i1 >= i3) {
        return;
      }
      Log.d("DzhService", localObject1[i1]);
      i1 += 1;
      continue;
      bool = false;
    }
  }
  
  private void av()
  {
    this.av = null;
  }
  
  private String aw()
  {
    localObject = "";
    try
    {
      String str = com.android.dazhihui.d.n.i(String.valueOf(this.n));
      localObject = str;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (!TextUtils.isEmpty("")) {}
      localObject = new Random();
      StringBuilder localStringBuilder = new StringBuilder(19);
      int i1 = 0;
      while (i1 < 19)
      {
        localStringBuilder.append(((Random)localObject).nextInt(10));
        i1 += 1;
      }
      return localStringBuilder.toString();
    }
    return (String)localObject;
  }
  
  private String ax()
  {
    Object localObject1 = (TelephonyManager)this.A.getSystemService("phone");
    if (localObject1 != null) {}
    for (Object localObject2 = ((TelephonyManager)localObject1).getDeviceId();; localObject2 = null)
    {
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = ((WifiManager)this.A.getSystemService("wifi")).getConnectionInfo().getMacAddress();
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = u();
      }
      return (String)localObject2;
    }
  }
  
  private void ay()
  {
    if (this.av != null)
    {
      int i1 = this.ac + 1;
      this.ac = i1;
      if (i1 > this.av.size())
      {
        this.ac = 0;
        if ((h()) && (com.android.dazhihui.d.n.b(this.A)))
        {
          this.aN.sendEmptyMessageDelayed(0, 3000L);
          if (com.android.dazhihui.b.b.a().f() == null) {}
        }
      }
    }
    do
    {
      do
      {
        return;
        this.aN.sendEmptyMessageDelayed(0, 300000L);
        break;
      } while (this.aN.hasMessages(0));
      this.aN.sendEmptyMessage(0);
    } while ((com.android.dazhihui.b.b.a().f() == null) || (!com.android.dazhihui.d.n.b(this.A)) || (!com.android.dazhihui.a.g.a().o()));
    try
    {
      ToastMaker.a(this.A, this.A.getString(2131165968));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public String A()
  {
    return this.at;
  }
  
  public String B()
  {
    return this.au;
  }
  
  public String C()
  {
    return this.d;
  }
  
  public int D()
  {
    return this.e;
  }
  
  public String[] E()
  {
    return this.f;
  }
  
  public int[] F()
  {
    return this.g;
  }
  
  public int[] G()
  {
    return this.h;
  }
  
  public String H()
  {
    return this.i;
  }
  
  public int I()
  {
    return this.j;
  }
  
  public String J()
  {
    return this.l;
  }
  
  public int K()
  {
    return this.m;
  }
  
  public boolean L()
  {
    return this.y;
  }
  
  public String M()
  {
    return this.B;
  }
  
  public int N()
  {
    return this.K;
  }
  
  public int O()
  {
    return this.L;
  }
  
  public String P()
  {
    return this.C;
  }
  
  public boolean Q()
  {
    return this.D;
  }
  
  public String R()
  {
    return this.G;
  }
  
  public String S()
  {
    return this.I;
  }
  
  public int T()
  {
    return this.J;
  }
  
  public boolean U()
  {
    return this.M;
  }
  
  public boolean V()
  {
    return this.N;
  }
  
  public int W()
  {
    return this.O;
  }
  
  public int X()
  {
    return this.P;
  }
  
  public int Y()
  {
    return this.Q;
  }
  
  public String Z()
  {
    return this.R;
  }
  
  public void a(float paramFloat)
  {
    this.ab = paramFloat;
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      this.ax = y.a;
      return;
    case 0: 
      this.ax = y.a;
      return;
    }
    this.ax = y.b;
  }
  
  public void a(Activity paramActivity)
  {
    if (paramActivity == null) {
      return;
    }
    d locald = d.a();
    this.ad = locald.c("SCREEN_ON_OR_OFF");
    locald.g();
    try
    {
      if (this.ad == 1)
      {
        paramActivity.getWindow().getDecorView().setKeepScreenOn(false);
        return;
      }
    }
    catch (Exception paramActivity)
    {
      paramActivity.printStackTrace();
      return;
    }
    paramActivity.getWindow().getDecorView().setKeepScreenOn(true);
  }
  
  public void a(Context paramContext)
  {
    this.A = paramContext;
    au();
  }
  
  public void a(m paramm, long paramLong)
  {
    if (paramLong < 0L) {}
    for (;;)
    {
      return;
      switch (i.a[paramm.ordinal()])
      {
      }
      while (L())
      {
        Log.i("time", "addUserTime mUserSelfstockTime=" + this.ay);
        Log.i("time", "addUserTime mUserMarketTime=" + this.aA);
        Log.i("time", "addUserTime mUserNewsTime=" + this.aC);
        Log.i("time", "addUserTime mUserTradeTime=" + this.aE);
        Log.i("time", "addUserTime mUserMySettingTime=" + this.aG);
        Log.i("time", "addUserTime mUserStockChartTime=" + this.aI);
        return;
        if (this.ay == 0L) {
          this.az = at();
        }
        this.ay += paramLong;
        continue;
        if (this.aA == 0L) {
          this.aB = at();
        }
        this.aA += paramLong;
        continue;
        if (this.aC == 0L) {
          this.aD = at();
        }
        this.aC += paramLong;
        continue;
        if (this.aE == 0L) {
          this.aF = at();
        }
        this.aE += paramLong;
        continue;
        if (this.aG == 0L) {
          this.aH = at();
        }
        this.aG += paramLong;
        continue;
        if (this.aI == 0L) {
          this.aJ = at();
        }
        this.aI += paramLong;
      }
    }
  }
  
  public void a(m paramm, String paramString, long paramLong)
  {
    if ((paramLong < 0L) || (TextUtils.isEmpty(paramString))) {
      return;
    }
    synchronized (this.aM)
    {
      l locall = (l)this.aL.get(paramString);
      paramm = locall;
      if (locall == null)
      {
        paramm = new l(null);
        paramm.a = paramString;
        this.aL.put(paramString, paramm);
      }
      if (paramm.b == 0L) {
        paramm.c = at();
      }
      paramm.b += paramLong;
      return;
    }
  }
  
  public void a(y paramy)
  {
    this.ax = paramy;
  }
  
  public void a(String paramString)
  {
    this.z = paramString;
    av();
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.aw.put(paramString1, paramString2);
  }
  
  public void a(boolean paramBoolean)
  {
    this.ah = paramBoolean;
    d locald = d.a();
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      locald.a("PUSH_ZIXUAN_STOCK_WARN_SETTING", i1);
      locald.g();
      return;
    }
  }
  
  public void a(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      this.k = paramArrayOfString;
      this.l = null;
      this.m = -1;
      com.android.dazhihui.a.g.a().e(true);
      com.android.dazhihui.a.g.a().z();
      com.android.dazhihui.a.g.a().f();
    }
  }
  
  public void a(String[] paramArrayOfString, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if ((paramArrayOfString != null) && (paramArrayOfInt1 != null))
    {
      this.f = paramArrayOfString;
      this.g = paramArrayOfInt1;
      this.h = paramArrayOfInt2;
      this.i = null;
      this.j = -1;
      e.a().w();
      e.a().v();
      com.android.dazhihui.a.g.a().d(true);
      com.android.dazhihui.a.g.a().y();
      com.android.dazhihui.a.g.a().e();
    }
  }
  
  public boolean aa()
  {
    return this.S;
  }
  
  public boolean ab()
  {
    return this.T;
  }
  
  public int ac()
  {
    return t;
  }
  
  public String ad()
  {
    if (this.A == null) {
      return "";
    }
    Object localObject;
    if (TextUtils.isEmpty(this.x))
    {
      localObject = (WifiManager)this.A.getSystemService("wifi");
      if (localObject == null) {}
    }
    try
    {
      localObject = ((WifiManager)localObject).getConnectionInfo();
      if (localObject != null) {
        this.x = ((WifiInfo)localObject).getMacAddress();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    if (this.x == null) {
      this.x = "";
    }
    return this.x;
  }
  
  public j ae()
  {
    if ((this.av == null) || (this.av.size() <= 0)) {
      b(f.a);
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.av.iterator();
    j localj;
    while (localIterator.hasNext())
    {
      localj = (j)localIterator.next();
      if ((!localj.b) && (System.currentTimeMillis() - localj.c > 7200000L))
      {
        localj.b = true;
        localj.c = 0L;
      }
      if (localj.b) {
        localArrayList.add(localj);
      }
    }
    if (localArrayList.size() <= 0)
    {
      localIterator = this.av.iterator();
      while (localIterator.hasNext())
      {
        localj = (j)localIterator.next();
        localj.b = true;
        localArrayList.add(localj);
      }
    }
    if (localArrayList.size() == 0)
    {
      Log.e("dzh", "getDispatchAddress size==0 divide by zero ERROR!");
      return null;
    }
    return (j)localArrayList.get(Math.abs(new Random().nextInt()) % localArrayList.size());
  }
  
  public com.android.dazhihui.a.b.m af()
  {
    Object localObject = new x(1000);
    ((x)localObject).a(r());
    ((x)localObject).a(u());
    ((x)localObject).a(t());
    ((x)localObject).b(w.a().d());
    ((x)localObject).b(0);
    ((x)localObject).b(new int[] { 1 });
    this.ao = new com.android.dazhihui.a.b.m((x)localObject, com.android.dazhihui.a.b.n.a);
    this.ao.a(6000L);
    this.ao.a(this);
    localObject = ae();
    this.ao.a(localObject);
    return this.ao;
  }
  
  public void ag()
  {
    Object localObject = new x(3001);
    ((x)localObject).b(2);
    x localx = new x(520);
    localx.a(w.a().f());
    localx.a(a().v());
    localx.b(a().ac());
    localx.a(a().r());
    localx.a("");
    localx.c(4);
    if (this.ai)
    {
      localx.b(1);
      localx.c(0);
      if (!this.aj) {
        break label236;
      }
      localx.b(1);
      localx.c(1);
      label112:
      if (!this.ak) {
        break label249;
      }
      localx.b(1);
      localx.c(2);
      label129:
      if (!this.al) {
        break label262;
      }
      localx.b(1);
      localx.c(3);
    }
    for (;;)
    {
      ((x)localObject).a(localx, 1, com.android.dazhihui.ui.a.m.a().h());
      localObject = new com.android.dazhihui.a.b.m((x)localObject, com.android.dazhihui.a.b.n.a);
      localx = new x(2996);
      localx.d(this.A.getSharedPreferences("wisdomCrc", 0).getInt("wisdomCrc", 0));
      ((com.android.dazhihui.a.b.m)localObject).a(localx);
      ((com.android.dazhihui.a.b.m)localObject).a(this);
      com.android.dazhihui.a.g.a().a((com.android.dazhihui.a.b.h)localObject);
      return;
      localx.b(0);
      localx.c(0);
      break;
      label236:
      localx.b(0);
      localx.c(1);
      break label112;
      label249:
      localx.b(0);
      localx.c(2);
      break label129;
      label262:
      localx.b(0);
      localx.c(3);
    }
  }
  
  public void ah()
  {
    this.ac = 0;
    this.aN.removeMessages(0);
  }
  
  public void ai()
  {
    com.android.dazhihui.a.g.a().a(0L);
    com.android.dazhihui.ui.a.m.a().a(false);
  }
  
  public int aj()
  {
    return this.ad;
  }
  
  public void ak()
  {
    ag();
    if (this.an)
    {
      w.a().b(true);
      a.c().f();
      SelfSelectedStockManager.getInstance().resetServerSelfStock();
    }
    com.android.dazhihui.a.g.a().C();
  }
  
  public int al()
  {
    return this.ae;
  }
  
  public int am()
  {
    return this.H;
  }
  
  public void an()
  {
    ao();
    com.baidu.location.k localk = new com.baidu.location.k();
    localk.a(com.baidu.location.m.a);
    localk.a("bd09ll");
    localk.a(5000);
    localk.a(false);
    this.ap.a(localk);
    this.ap.c();
  }
  
  public void ao()
  {
    this.ap.d();
  }
  
  public double ap()
  {
    return this.ar;
  }
  
  public double aq()
  {
    return this.aq;
  }
  
  public void ar()
  {
    Object localObject1;
    Object localObject3;
    String str;
    Object localObject2;
    if (com.android.dazhihui.a.g.a().o())
    {
      localObject1 = w.a();
      localObject3 = ((w)localObject1).f();
      str = ((w)localObject1).k();
      localObject1 = new x(3000);
      ((x)localObject1).b(3);
      localObject2 = new x(106);
      if (TextUtils.isEmpty((CharSequence)localObject3))
      {
        ((x)localObject2).a("");
        if ((!TextUtils.isEmpty(str)) && (str.length() >= 11)) {
          break label874;
        }
        ((x)localObject2).a("");
        label87:
        ((x)localObject2).a(u());
        localObject3 = new Date();
        i1 = ((Date)localObject3).getHours();
        int i2 = ((Date)localObject3).getMinutes();
        int i3 = ((Date)localObject3).getSeconds();
        localObject3 = com.android.dazhihui.d.b.a(com.android.dazhihui.ui.a.m.a().p(), com.android.dazhihui.ui.a.m.a().n(), com.android.dazhihui.ui.a.m.a().o(), i1, i2, i3);
        ((x)localObject2).a((String)localObject3);
        ((x)localObject2).d(0);
        if (L())
        {
          Log.i("time", "首页" + this.ay / 1000L + "秒");
          Log.i("time", "市场" + this.aA / 1000L + "秒");
          Log.i("time", "新闻" + this.aC / 1000L + "秒");
          Log.i("time", "交易" + this.aE / 1000L + "秒");
          Log.i("time", "我的" + this.aG / 1000L + "秒");
          Log.i("time", "分时" + this.aI / 1000L + "秒");
        }
        if (this.ay <= 1000L) {
          break label1048;
        }
        ((x)localObject2).d(this.az);
        ((x)localObject2).a("");
        ((x)localObject2).c(20125);
        ((x)localObject2).c((int)(this.ay / 1000L));
        this.ay = 0L;
        this.az = 0;
      }
    }
    label874:
    label1048:
    for (int i1 = 1;; i1 = 0)
    {
      if (this.aA > 1000L)
      {
        ((x)localObject2).d(this.aB);
        ((x)localObject2).a("");
        ((x)localObject2).c(20126);
        ((x)localObject2).c((int)(this.aA / 1000L));
        this.aA = 0L;
        this.aB = 0;
        i1 = 1;
      }
      if (this.aC > 1000L)
      {
        ((x)localObject2).d(this.aD);
        ((x)localObject2).a("");
        ((x)localObject2).c(20127);
        ((x)localObject2).c((int)(this.aC / 1000L));
        this.aC = 0L;
        this.aD = 0;
        i1 = 1;
      }
      if (this.aE > 1000L)
      {
        ((x)localObject2).d(this.aF);
        ((x)localObject2).a("");
        ((x)localObject2).c(20128);
        ((x)localObject2).c((int)(this.aE / 1000L));
        this.aE = 0L;
        this.aF = 0;
        i1 = 1;
      }
      if (this.aG > 1000L)
      {
        ((x)localObject2).d(this.aH);
        ((x)localObject2).a("");
        ((x)localObject2).c(20129);
        ((x)localObject2).c((int)(this.aG / 1000L));
        this.aG = 0L;
        this.aH = 0;
        i1 = 1;
      }
      if (this.aI > 1000L)
      {
        ((x)localObject2).d(this.aJ);
        ((x)localObject2).a("");
        ((x)localObject2).c(20131);
        ((x)localObject2).c((int)(this.aI / 1000L));
        this.aI = 0L;
        this.aJ = 0;
        i1 = 1;
      }
      if (i1 != 0)
      {
        if (this.aK.size() > 0)
        {
          i1 = 0;
          for (;;)
          {
            if (i1 < this.aK.size())
            {
              Log.i("time", "重发统计 : " + ((n)this.aK.get(i1)).b.v());
              com.android.dazhihui.a.g.a().a(((n)this.aK.get(i1)).b);
              i1 += 1;
              continue;
              ((x)localObject2).a((String)localObject3);
              break;
              ((x)localObject2).a(str);
              break label87;
            }
          }
        }
        ((x)localObject1).c("8.30统计用户使用客户端时长需求 now=" + at());
        ((x)localObject1).a((x)localObject2);
        localObject1 = new com.android.dazhihui.a.b.m((x)localObject1, com.android.dazhihui.a.b.n.a);
        ((com.android.dazhihui.a.b.m)localObject1).a("8.30统计用户使用客户端时长需求 now=" + at());
        ((com.android.dazhihui.a.b.m)localObject1).e(true);
        localObject2 = new n(this, null);
        ((n)localObject2).a = ((String)localObject3);
        ((n)localObject2).b = ((com.android.dazhihui.a.b.m)localObject1);
        if (this.aK.size() >= 5) {
          this.aK.remove(0);
        }
        this.aK.add(localObject2);
        ((com.android.dazhihui.a.b.m)localObject1).a(this);
        com.android.dazhihui.a.g.a().a((com.android.dazhihui.a.b.h)localObject1);
        Log.i("time", "send ok");
        return;
      }
      Log.i("time", "send cancel");
      return;
    }
  }
  
  public void as()
  {
    label403:
    label569:
    label585:
    for (;;)
    {
      Object localObject4;
      Object localObject5;
      Object localObject3;
      int i1;
      synchronized (this.aM)
      {
        if ((!com.android.dazhihui.a.g.a().o()) || (this.aL.size() <= 0)) {
          break label569;
        }
        Object localObject2 = w.a();
        localObject4 = ((w)localObject2).f();
        localObject5 = ((w)localObject2).k();
        localObject2 = new x(3000);
        ((x)localObject2).b(3);
        localObject3 = new x(106);
        if (TextUtils.isEmpty((CharSequence)localObject4))
        {
          ((x)localObject3).a("");
          if ((TextUtils.isEmpty((CharSequence)localObject5)) || (((String)localObject5).length() < 11))
          {
            ((x)localObject3).a("");
            ((x)localObject3).a(u());
            localObject4 = new Date();
            i1 = ((Date)localObject4).getHours();
            int i2 = ((Date)localObject4).getMinutes();
            int i3 = ((Date)localObject4).getSeconds();
            localObject4 = com.android.dazhihui.d.b.a(com.android.dazhihui.ui.a.m.a().p(), com.android.dazhihui.ui.a.m.a().n(), com.android.dazhihui.ui.a.m.a().o(), i1, i2, i3);
            ((x)localObject3).a((String)localObject4);
            ((x)localObject3).d(0);
            i1 = 0;
            localObject5 = this.aL.values().iterator();
            if (!((Iterator)localObject5).hasNext()) {
              break label403;
            }
            l locall = (l)((Iterator)localObject5).next();
            if ((locall == null) || (TextUtils.isEmpty(locall.a)) || (locall.b <= 0L)) {
              break label585;
            }
            if (L()) {
              Log.i("time", "资讯正文阅读时间=" + locall.b / 1000L + "秒" + " 资讯Id=" + locall.a);
            }
            if (locall.b <= 1000L) {
              break label585;
            }
            ((x)localObject3).d(locall.c);
            ((x)localObject3).a(locall.a);
            ((x)localObject3).c(20130);
            ((x)localObject3).c((int)(locall.b / 1000L));
            locall.b = 0L;
            locall.c = 0;
            i1 = 1;
            break label585;
          }
        }
        else
        {
          ((x)localObject3).a((String)localObject4);
        }
      }
      ((x)localObject3).a((String)localObject5);
      continue;
      if (i1 != 0)
      {
        localx.c("资讯正文 需求单条进行统计阅读时间 now=" + at());
        localx.a((x)localObject3);
        com.android.dazhihui.a.b.m localm = new com.android.dazhihui.a.b.m(localx, com.android.dazhihui.a.b.n.a);
        localm.a("资讯正文 需求单条进行统计阅读时间 now=" + at());
        localm.e(true);
        localm.a(this);
        if (this.aK.size() >= 5) {
          this.aK.remove(0);
        }
        localObject3 = new n(this, null);
        ((n)localObject3).a = ((String)localObject4);
        ((n)localObject3).b = localm;
        this.aK.add(localObject3);
        com.android.dazhihui.a.g.a().a(localm);
        Log.i("time", "send news ok");
      }
      for (;;)
      {
        this.aL.clear();
        return;
        Log.i("time", "send news cancel");
      }
    }
  }
  
  /* Error */
  public int at()
  {
    // Byte code:
    //   0: invokestatic 777	java/lang/System:currentTimeMillis	()J
    //   3: lstore_3
    //   4: getstatic 155	com/android/dazhihui/g:b	Ljava/text/SimpleDateFormat;
    //   7: new 931	java/util/Date
    //   10: dup
    //   11: lload_3
    //   12: invokespecial 1016	java/util/Date:<init>	(J)V
    //   15: invokevirtual 1020	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   18: astore_1
    //   19: aload_1
    //   20: invokestatic 1025	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   23: istore_2
    //   24: aload_0
    //   25: invokevirtual 669	com/android/dazhihui/g:L	()Z
    //   28: ifeq +40 -> 68
    //   31: ldc_w 671
    //   34: new 523	java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial 672	java/lang/StringBuilder:<init>	()V
    //   41: ldc_w 1027
    //   44: invokevirtual 677	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload_1
    //   48: invokevirtual 677	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: ldc_w 1029
    //   54: invokevirtual 677	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: iload_2
    //   58: invokevirtual 532	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   61: invokevirtual 533	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: invokestatic 682	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   67: pop
    //   68: iload_2
    //   69: ireturn
    //   70: astore_1
    //   71: iconst_0
    //   72: istore_2
    //   73: aload_1
    //   74: invokevirtual 604	java/lang/Exception:printStackTrace	()V
    //   77: iload_2
    //   78: ireturn
    //   79: astore_1
    //   80: goto -7 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	g
    //   18	30	1	str	String
    //   70	4	1	localException1	Exception
    //   79	1	1	localException2	Exception
    //   23	55	2	i1	int
    //   3	9	3	l1	long
    // Exception table:
    //   from	to	target	type
    //   0	24	70	java/lang/Exception
    //   24	68	79	java/lang/Exception
  }
  
  public y b()
  {
    return this.ax;
  }
  
  public void b(int paramInt)
  {
    this.X = paramInt;
  }
  
  public void b(String paramString)
  {
    this.as = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.ai = paramBoolean;
    d locald = d.a();
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      locald.a("PUSH_STOCK_WARN_SETTING", i1);
      locald.g();
      return;
    }
  }
  
  public void b(String[] paramArrayOfString)
  {
    int i1 = 0;
    ArrayList localArrayList = new ArrayList();
    String str;
    if ((this.av != null) && (this.av.size() > 0))
    {
      int i3 = paramArrayOfString.length;
      i1 = 0;
      if (i1 >= i3) {
        break label218;
      }
      str = paramArrayOfString[i1];
      i2 = 0;
      label52:
      if (i2 >= this.av.size()) {
        break label224;
      }
      if (((j)this.av.get(i2)).a.equals(str.trim())) {
        localArrayList.add(this.av.get(i2));
      }
    }
    label218:
    label224:
    for (int i2 = 1;; i2 = 0)
    {
      j localj;
      if (i2 == 0)
      {
        localj = new j(this);
        localj.a = str.trim();
        localArrayList.add(localj);
      }
      i1 += 1;
      break;
      i2 += 1;
      break label52;
      i2 = paramArrayOfString.length;
      while (i1 < i2)
      {
        str = paramArrayOfString[i1];
        localj = new j(this);
        localj.a = str.trim();
        localArrayList.add(localj);
        i1 += 1;
      }
      this.av = localArrayList;
      return;
    }
  }
  
  public boolean b(String paramString1, String paramString2)
  {
    return (this.aw.containsKey(paramString1)) && (((String)this.aw.get(paramString1)).equals(paramString2));
  }
  
  public void c(int paramInt)
  {
    this.Y = paramInt;
  }
  
  public void c(String paramString)
  {
    this.at = paramString;
  }
  
  public void c(boolean paramBoolean)
  {
    this.aj = paramBoolean;
    d locald = d.a();
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      locald.a("PUSH_SELF_STOCK_SETTING", i1);
      locald.g();
      return;
    }
  }
  
  public boolean c()
  {
    return this.ah;
  }
  
  public void d(int paramInt)
  {
    this.Z = paramInt;
  }
  
  public void d(String paramString)
  {
    this.au = paramString;
  }
  
  public void d(boolean paramBoolean)
  {
    this.ak = paramBoolean;
    d locald = d.a();
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      locald.a("PUSH_BULLET_SETTING", i1);
      locald.g();
      return;
    }
  }
  
  public boolean d()
  {
    return this.ai;
  }
  
  public void e(int paramInt)
  {
    this.aa = paramInt;
  }
  
  public void e(String paramString)
  {
    this.d = paramString;
  }
  
  public void e(boolean paramBoolean)
  {
    this.al = paramBoolean;
    d locald = d.a();
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      locald.a("PUSH_LOTTERY_SETTING", i1);
      locald.g();
      return;
    }
  }
  
  public boolean e()
  {
    return this.aj;
  }
  
  public void f(int paramInt)
  {
    this.W = paramInt;
  }
  
  public void f(String paramString)
  {
    com.android.dazhihui.a.g.a().A();
    this.i = paramString;
  }
  
  public void f(boolean paramBoolean)
  {
    this.am = paramBoolean;
    if (!this.am)
    {
      this.an = false;
      this.as = null;
      this.at = null;
      this.au = null;
      a.c().e();
      com.android.dazhihui.a.g.a().i();
      e.a().x();
      w.a().q();
    }
    w localw;
    do
    {
      return;
      if (SelfSelectedStockManager.getInstance().getSelfStockVectorSize() <= 0) {
        SelfSelectedStockManager.getInstance().loadDataFromLocal();
      }
      localw = w.a();
    } while ((localw.h() != c.b) || (localw.l()));
    localw.b(true);
  }
  
  public boolean f()
  {
    return this.ak;
  }
  
  public void g(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void g(String paramString)
  {
    com.android.dazhihui.a.g.a().B();
    this.l = paramString;
  }
  
  public void g(boolean paramBoolean)
  {
    this.an = paramBoolean;
    if (paramBoolean)
    {
      w();
      SelfSelectedStockManager.getInstance().loadDataFromLocal();
      if (this.aN.hasMessages(0))
      {
        this.ac = 0;
        this.aN.removeMessages(0);
        this.aN.sendEmptyMessage(0);
      }
    }
  }
  
  public boolean g()
  {
    return this.al;
  }
  
  public void h(int paramInt)
  {
    com.android.dazhihui.a.g.a().A();
    this.j = paramInt;
  }
  
  public void h(String paramString)
  {
    this.I = paramString;
  }
  
  public void h(boolean paramBoolean)
  {
    this.S = paramBoolean;
  }
  
  public boolean h()
  {
    return this.am;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    int i1 = 0;
    if ((paramj instanceof o))
    {
      paramj = ((o)paramj).h();
      if ((paramj != null) && (paramj.b != null))
      {
        if ((paramh != this.ao) || (paramj.a != 1000)) {
          break label899;
        }
        Object localObject1 = new q(paramj.b);
        paramj = ((q)localObject1).m();
        ((q)localObject1).m();
        this.B = com.android.dazhihui.d.n.a(((q)localObject1).l());
        Object localObject2 = ((q)localObject1).l().trim();
        this.C = ((q)localObject1).l().trim();
        boolean bool;
        if (((q)localObject1).b() == 1)
        {
          bool = true;
          this.D = bool;
          if (Build.VERSION.SDK_INT < 14) {
            this.D = false;
          }
          paramh = d.a();
        }
        for (;;)
        {
          try
          {
            if (((q)localObject1).b() != 1) {
              continue;
            }
            bool = true;
            this.E = bool;
            if (((q)localObject1).b() != 1) {
              continue;
            }
            bool = true;
            this.F = bool;
            this.H = ((q)localObject1).b();
            ((q)localObject1).e();
            localObject3 = ((q)localObject1).l();
            Log.i("GUH", "newVsn=" + (String)localObject2 + ",mVersion=" + this.o + ",mUpdateUrl=" + this.C + ",mRemindUpgrade=" + this.D + ",updataStr=" + (String)localObject3 + ",mBulletinWords=" + this.B);
            if (!this.D) {
              continue;
            }
            if (!com.android.dazhihui.d.n.b(this.o, (String)localObject2)) {
              continue;
            }
            this.G = com.android.dazhihui.d.n.a((String)localObject3);
            if (this.I != null) {
              continue;
            }
            this.I = ((String)localObject2);
            this.J = 0;
            paramh.a("NEEDTIPUPDATE", this.J);
            paramh.a("NEWVERSION", (String)localObject2);
            if (this.A != null) {
              this.A.sendBroadcast(new Intent("com.android.dazhihui.handleupgrade"));
            }
          }
          catch (Exception localException)
          {
            Object localObject3;
            int i2;
            continue;
          }
          this.K = ((q)localObject1).e();
          this.L = ((q)localObject1).b();
          Log.i("GUH", "mBulletCRC=" + this.K + ",mBulletType=" + this.L);
          if ((this.A != null) && ((this.L == 0) || (this.L == 1) || (this.L == 2))) {
            this.A.sendBroadcast(new Intent("com.android.dazhihui.bullet"));
          }
          localObject1 = ((q)localObject1).m();
          if ((localObject1 == null) || (localObject1.length <= 0)) {
            continue;
          }
          localObject2 = new ArrayList();
          i2 = localObject1.length;
          i1 = 0;
          if (i1 >= i2) {
            continue;
          }
          localObject3 = localObject1[i1].split("\\:");
          if (localObject3.length == 3) {
            ((List)localObject2).add(localObject3[0].trim() + ":" + localObject3[1].trim());
          }
          i1 += 1;
          continue;
          bool = false;
          break;
          bool = false;
          continue;
          bool = false;
          continue;
          if (!this.I.equals(localObject2))
          {
            this.I = ((String)localObject2);
            this.J = 0;
            paramh.a("NEEDTIPUPDATE", this.J);
            paramh.a("NEWVERSION", (String)localObject2);
            continue;
            this.D = false;
            continue;
            this.I = ((String)localObject2);
            paramh.a("NEWVERSION", (String)localObject2);
          }
        }
        if (((List)localObject2).size() > 0)
        {
          localObject1 = (String[])((List)localObject2).toArray(new String[((List)localObject2).size()]);
          b((String[])localObject1);
          localObject2 = this.A.getSharedPreferences("save_dispatch_address", 0).edit();
          localObject3 = new StringBuffer();
          i1 = 0;
          if (i1 < localObject1.length)
          {
            ((StringBuffer)localObject3).append(localObject1[i1]);
            if (i1 == localObject1.length - 1) {
              ((StringBuffer)localObject3).append("$");
            }
            for (;;)
            {
              i1 += 1;
              break;
              ((StringBuffer)localObject3).append("|");
            }
          }
          ((SharedPreferences.Editor)localObject2).putString("save_dispatch_address", ((StringBuffer)localObject3).toString());
          ((SharedPreferences.Editor)localObject2).commit();
        }
        if (!TextUtils.isEmpty(this.z)) {
          paramj[0] = this.z;
        }
        paramj = com.android.dazhihui.d.n.d(paramj[0]);
        localObject1 = paramj[0];
        i1 = Integer.parseInt(paramj[1]);
        this.d = ((String)localObject1);
        this.e = i1;
        paramh.g();
        com.android.dazhihui.a.g.a().a(0L);
        com.android.dazhihui.a.g.a().c(false);
        o.d();
        this.ac = 0;
        com.android.dazhihui.a.g.a().t();
      }
    }
    for (;;)
    {
      return;
      label899:
      if (paramj.a == 3001)
      {
        paramh = new q(paramj.b);
        try
        {
          i1 = paramh.b();
          if (i1 != 2) {
            continue;
          }
          i1 = paramh.e();
          paramh.e();
          paramh.e();
          com.android.dazhihui.ui.a.m.a().c(paramh.h());
          if (i1 == 520)
          {
            if (paramh.b() == 0) {
              continue;
            }
            i1 = paramh.h();
            paramh = paramh.l();
            System.out.println("error code:   " + i1 + "     message:    " + paramh);
            return;
          }
        }
        catch (Exception paramh)
        {
          paramh.printStackTrace();
          return;
        }
        if (i1 == 330)
        {
          if (paramh.b() != 0)
          {
            i1 = paramh.h();
            paramh = paramh.l();
            System.out.println("error code:   " + i1 + "     message:    " + paramh);
            return;
          }
          i1 = paramh.h();
          System.out.println("code:   " + i1);
        }
      }
      else if (paramj.a == 2996)
      {
        paramj = new q(paramj.b);
        i1 = paramj.h();
        com.android.dazhihui.d.n.d("pushMessage", "2996---------->");
        if ((i1 != 1) && (i1 == 2))
        {
          i1 = paramj.h();
          paramh = this.A.getSharedPreferences("wisdomCrc", 0);
          paramj = paramj.l();
          paramh.edit().putInt("wisdomCrc", i1).commit();
          Log.d("pushMessage", paramj);
          com.android.dazhihui.b.b.a().a(paramj);
        }
      }
      else if (paramj.a == 3000)
      {
        paramh = new q(paramj.b);
        i2 = paramh.b();
        int i3 = paramh.e();
        paramh.e();
        paramh.e();
        if ((i3 == 106) && (i2 == 2))
        {
          paramh = paramh.l().trim();
          while (i1 < this.aK.size())
          {
            if (paramh.equals(((n)this.aK.get(i1)).a))
            {
              if (((n)this.aK.get(i1)).b != null) {
                Log.i("time", "统计应答 : " + ((n)this.aK.get(i1)).b.v());
              }
              this.aK.remove(i1);
              return;
            }
            i1 += 1;
          }
        }
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    Object localObject = paramh.j();
    if ((paramh == this.ao) && (localObject != null) && ((localObject instanceof j)))
    {
      ((j)localObject).b = false;
      ((j)localObject).c = System.currentTimeMillis();
      ay();
    }
  }
  
  public String i()
  {
    return this.af;
  }
  
  public void i(int paramInt)
  {
    com.android.dazhihui.a.g.a().B();
    this.m = paramInt;
  }
  
  public void i(String paramString)
  {
    this.R = paramString;
  }
  
  public void i(boolean paramBoolean)
  {
    this.T = paramBoolean;
  }
  
  public String j()
  {
    return this.ag;
  }
  
  public void j(int paramInt)
  {
    this.J = paramInt;
    d locald = d.a();
    locald.a("NEEDTIPUPDATE", this.J);
    locald.g();
    Log.i("GUH", "mRemindUpdateAgain=" + this.J);
  }
  
  public void j(boolean paramBoolean)
  {
    if (paramBoolean) {
      an();
    }
  }
  
  public com.android.dazhihui.d.a.b k()
  {
    if (this.c == null) {
      this.c = new com.android.dazhihui.d.a.b(DzhApplication.a());
    }
    return this.c;
  }
  
  public void k(int paramInt)
  {
    this.O = paramInt;
  }
  
  public int l()
  {
    return this.Y;
  }
  
  public void l(int paramInt)
  {
    this.P = paramInt;
  }
  
  public int m()
  {
    return this.Z;
  }
  
  public void m(int paramInt)
  {
    Object localObject = new x(3001);
    ((x)localObject).b(2);
    x localx = new x(330);
    localx.a(w.a().f());
    localx.a(a().v());
    localx.b(a().ac());
    localx.a(a().r());
    localx.d(paramInt);
    ((x)localObject).a(localx, 1, com.android.dazhihui.ui.a.m.a().h());
    localObject = new com.android.dazhihui.a.b.m((x)localObject, com.android.dazhihui.a.b.n.a);
    ((com.android.dazhihui.a.b.m)localObject).a(this);
    com.android.dazhihui.a.g.a().a((com.android.dazhihui.a.b.h)localObject);
  }
  
  public int n()
  {
    return this.aa;
  }
  
  public void n(int paramInt)
  {
    this.ad = paramInt;
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    paramException = paramh.j();
    if ((paramh == this.ao) && (paramException != null) && ((paramException instanceof j)))
    {
      ((j)paramException).b = false;
      ((j)paramException).c = System.currentTimeMillis();
      ay();
    }
  }
  
  public float o()
  {
    return this.ab;
  }
  
  public void o(int paramInt)
  {
    this.ae = paramInt;
  }
  
  public int p()
  {
    return this.W;
  }
  
  public String q()
  {
    return this.z;
  }
  
  public String r()
  {
    return this.o;
  }
  
  public int s()
  {
    return this.p;
  }
  
  public String t()
  {
    return s;
  }
  
  public String u()
  {
    return this.q;
  }
  
  public String v()
  {
    return this.r;
  }
  
  public void w()
  {
    this.v = Build.VERSION.RELEASE;
  }
  
  public String x()
  {
    return this.v;
  }
  
  public int y()
  {
    return this.n;
  }
  
  public String z()
  {
    return this.as;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */