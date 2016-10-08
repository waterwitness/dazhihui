package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.b.a;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.d;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.io.PrintStream;
import java.lang.reflect.Array;

public class RegionTable
  extends DelegateBaseActivity
  implements View.OnClickListener, cp, cs
{
  private ListView A;
  private dl B;
  private dj C;
  private Button D;
  private int E = -1;
  private int F = -1;
  private Bundle G;
  private TextView H;
  private String I;
  private boolean J;
  private String K = "";
  private String L = "";
  private byte[] M;
  private com.android.dazhihui.a.b.u N;
  protected int a = 0;
  protected int b = 0;
  protected int c = 0;
  protected int d = 0;
  String[] e = { "名称" };
  String[] f = { "1296" };
  String[] g = { "名称" };
  String[] h = { "1006" };
  protected com.android.dazhihui.ui.delegate.b.h i;
  protected com.android.dazhihui.ui.delegate.b.h j;
  public boolean m = true;
  private ListView n;
  private String[] o;
  private String[] p;
  private String[][] q;
  private boolean r;
  private String s;
  private int t;
  private boolean u;
  private boolean v = false;
  private com.android.dazhihui.a.b.u w = null;
  private com.android.dazhihui.a.b.u x = null;
  private com.android.dazhihui.a.b.u y = null;
  private DzhHeader z;
  
  private void a()
  {
    this.t = e.a().j();
    com.android.dazhihui.ui.delegate.b.h localh = new com.android.dazhihui.ui.delegate.b.h("12058").a("1203", com.android.dazhihui.c.a.a.i[this.t][0]).a("1205", "13");
    if (localh == null) {
      return;
    }
    this.x = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
    registRequestListener(this.x);
    a(this.x, true);
    b(2);
  }
  
  private void a(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    Object localObject;
    int k;
    if (paramh == this.N)
    {
      paramh = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a(paramh, this))
      {
        localObject = new com.android.dazhihui.ui.delegate.b.g(paramh.e());
        boolean bool = ((com.android.dazhihui.ui.delegate.b.g)localObject).g();
        paramh = ((com.android.dazhihui.ui.delegate.b.g)localObject).h(16);
        paramj = ((com.android.dazhihui.ui.delegate.b.g)localObject).h(16);
        k = ((com.android.dazhihui.ui.delegate.b.g)localObject).f();
        if (!bool) {
          break label210;
        }
        localObject = this.L.getBytes();
        byte[] arrayOfByte1 = new byte[paramh.length + localObject.length + this.M.length];
        System.arraycopy(paramh, 0, arrayOfByte1, 0, paramh.length);
        System.arraycopy(localObject, 0, arrayOfByte1, paramh.length, localObject.length);
        byte[] arrayOfByte2 = this.M;
        int i1 = paramh.length;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, localObject.length + i1, this.M.length);
        localObject = com.android.dazhihui.ui.delegate.b.j.a(arrayOfByte1);
        if (com.android.dazhihui.ui.delegate.b.u.a(paramh, a.b(paramj, (byte[])localObject))) {
          break label199;
        }
        new AlertDialog.Builder(this).setTitle("　　通信密码错误。").setPositiveButton(2131165363, new dg(this)).setOnCancelListener(new df(this)).show();
      }
    }
    return;
    label199:
    com.android.dazhihui.ui.delegate.b.u.a((byte[])localObject, k);
    c();
    return;
    label210:
    if (o.n())
    {
      o.e(b.a().f(), this.J);
      return;
    }
    new AlertDialog.Builder(this).setTitle("验证失败").setPositiveButton(2131165363, new di(this)).setOnCancelListener(new dh(this)).show();
  }
  
  private void b()
  {
    o.u();
    com.android.dazhihui.a.g.a().A();
    this.t = e.a().j();
    this.K = com.android.dazhihui.c.a.a.i[this.t][0];
    this.L = com.android.dazhihui.c.a.a.i[this.t][1];
    this.M = com.android.dazhihui.ui.delegate.b.u.b(16);
    com.android.dazhihui.ui.delegate.b.g localg = new com.android.dazhihui.ui.delegate.b.g();
    localg.a(com.android.dazhihui.ui.delegate.b.u.a(o.p(), 20));
    localg.g(0);
    localg.a(com.android.dazhihui.ui.delegate.b.u.a(this.K, 20));
    localg.a(this.M);
    k = com.android.dazhihui.ui.delegate.b.u.h();
    try
    {
      arrayOfByte = d.a(k);
      k = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        byte[] arrayOfByte;
        k = 2139062143;
        continue;
        k += 1;
      }
    }
    if (k < arrayOfByte.length)
    {
      if (arrayOfByte[k] == 0) {
        arrayOfByte[k] = 1;
      }
    }
    else
    {
      k = d.a(arrayOfByte);
      localg.g(k);
      this.N = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(13, localg.a()) });
      this.N.a(this);
      com.android.dazhihui.a.g.a().a(this.N);
      Log.d("trade", "RegionTable:send_D()");
      return;
    }
  }
  
  private void c()
  {
    this.t = e.a().j();
    if ((com.android.dazhihui.c.a.a.C[this.t].length >= 6) && (com.android.dazhihui.c.a.a.C[this.t][5].equals("1")))
    {
      this.v = false;
      Bundle localBundle1 = new Bundle();
      localBundle1.putString("depart", "");
      localBundle1.putString("depart_hz", "证券交易中心");
      if (this.s != null) {
        localBundle1.putString("gotoFlag", this.s);
      }
      localBundle1.putBoolean("xcLoginProcedure", this.u);
      localBundle1.putBoolean("fromBrokerList", true);
      if (e.a().b() != null)
      {
        Bundle localBundle2 = e.a().b();
        if (localBundle2 != null) {
          this.J = localBundle2.getBoolean("haveNoLoginSorHaveOne");
        }
      }
      System.out.println("haveNoLoginSorHaveOne  RegionTable sendRegionOrGoLogin  " + this.J);
      localBundle1.putBoolean("haveNoLoginSorHaveOne", this.J);
      localBundle1.putBoolean("xcLoginProcedure", this.u);
      e.a().a(localBundle1);
      e.a().a(true);
      o.a(this, -1);
      finish();
      return;
    }
    this.v = true;
    a();
  }
  
  private void d(String paramString)
  {
    this.t = e.a().j();
    paramString = new com.android.dazhihui.ui.delegate.b.h("12056").a("1203", com.android.dazhihui.c.a.a.i[this.t][0]).a("1295", paramString).a("1205", "13");
    if (paramString == null) {
      return;
    }
    this.y = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(paramString.h()) });
    registRequestListener(this.y);
    a(this.y, true);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return true;
  }
  
  public void a(int paramInt)
  {
    this.C.a(paramInt);
    this.t = e.a().j();
    if ("1".equals(com.android.dazhihui.c.a.a.C[this.t][4]))
    {
      this.G = new Bundle();
      str2 = "";
      str1 = "";
      if (this.q != null)
      {
        str2 = this.q[paramInt][0];
        str1 = this.q[paramInt][1];
      }
      this.G.putString("depart", str2);
      this.G.putString("depart_hz", str1);
      return;
    }
    this.G = new Bundle();
    String str2 = "";
    String str1 = "";
    if (this.q != null)
    {
      str2 = this.q[paramInt][0];
      str1 = this.q[paramInt][1];
    }
    this.G.putString("depart", str2);
    this.G.putString("depart_hz", str1);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = paramContext.getResources().getString(2131166442);
    paramct.a = 4392;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.z = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    a(paramh, paramj);
    int i1;
    if (paramh == this.w)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        localObject1 = com.android.dazhihui.ui.delegate.b.g.c(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!com.android.dazhihui.ui.delegate.b.h.c((String)localObject1).b())
        {
          paramh = Toast.makeText(this, "　　验证失败。", 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
        e.a().j(null);
        e.a().k(null);
        k = ((String)localObject1).indexOf("\00132003=");
        if (k != -1)
        {
          k += 7;
          i1 = ((String)localObject1).indexOf("\001", k);
          if ((i1 != -1) && (i1 > k)) {
            e.a().j(((String)localObject1).substring(k, i1).trim());
          }
        }
        k = ((String)localObject1).indexOf("\00132002=");
        if (k != -1)
        {
          k += 7;
          i1 = ((String)localObject1).indexOf("\001", k);
          if ((i1 != -1) && (i1 > k)) {
            e.a().k(((String)localObject1).substring(k, i1).trim());
          }
        }
        if ((e.a().i() != null) && (e.a().i().equals("1")))
        {
          paramh = new Bundle();
          paramh.putString("depart", "");
          paramh.putString("depart_hz", "证券交易中心");
          if (this.s != null) {
            paramh.putString("gotoFlag", this.s);
          }
          paramh.putBoolean("xcLoginProcedure", this.u);
          paramh.putBoolean("fromBrokerList", true);
          paramh.putBoolean("haveNoLoginSorHaveOne", this.J);
          e.a().a(paramh);
          e.a().a(true);
          o.a(this, 0);
          finish();
          return;
        }
        a();
      }
    }
    boolean bool;
    Object localObject2;
    if (paramh == this.x)
    {
      localObject1 = ((v)paramj).b();
      bool = com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this);
      localObject2 = (String[][])null;
      localObject2 = (int[][])null;
      localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
      if (bool)
      {
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d() + "　　读取失败", 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
        i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
        localObject2 = (String[][])Array.newInstance(String.class, new int[] { i2, this.e.length });
        k = this.e.length;
        localObject2 = (int[][])Array.newInstance(Integer.TYPE, new int[] { i2, k });
        String[] arrayOfString = new String[i2];
        if (i2 > 0)
        {
          this.b = ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
          String[][] arrayOfString1 = (String[][])Array.newInstance(String.class, new int[] { i2, this.e.length });
          k = 0;
          while (k < i2)
          {
            i1 = 0;
            while (i1 < this.e.length)
            {
              arrayOfString1[k][i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, this.f[i1]);
              arrayOfString1[k][i1] = o.c(this.f[i1], arrayOfString1[k][i1]);
              i1 += 1;
            }
            k += 1;
          }
          this.i = ((com.android.dazhihui.ui.delegate.b.h)localObject1);
          k = 0;
          while (k < i2)
          {
            localObject2[k][0] = o.a(k, 0);
            i1 = 1;
            while (i1 < this.e.length)
            {
              localObject2[k][i1] = o.a(k, i1);
              i1 += 1;
            }
            arrayOfString[k] = arrayOfString1[k][0];
            k += 1;
          }
        }
        this.o = arrayOfString;
        if (this.o.length == 0) {
          break label885;
        }
        this.B.a(this.o);
      }
    }
    for (;;)
    {
      if ((this.o.length != 0) && (this.E == -1))
      {
        this.B.a(0);
        d(this.i.a(0, "1295"));
      }
      if (paramh != this.y) {
        break;
      }
      paramh = ((v)paramj).b();
      bool = com.android.dazhihui.ui.delegate.b.u.a(paramh, this);
      paramj = (String[][])null;
      paramj = (int[][])null;
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!bool) {
        break;
      }
      if (paramh.b()) {
        break label916;
      }
      paramh = Toast.makeText(this, paramh.d() + "　　读取失败", 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
      return;
      label885:
      this.o = new String[1];
      this.o[0] = "- 无记录 -";
      this.B.a(this.o);
    }
    label916:
    int i2 = paramh.g();
    paramj = (String[][])Array.newInstance(String.class, new int[] { i2, this.g.length });
    int k = this.g.length;
    paramj = (int[][])Array.newInstance(Integer.TYPE, new int[] { i2, k });
    Object localObject1 = new String[i2];
    if (i2 > 0)
    {
      this.d = paramh.b("1289");
      localObject2 = (String[][])Array.newInstance(String.class, new int[] { i2, this.g.length });
      k = 0;
      while (k < i2)
      {
        i1 = 0;
        while (i1 < this.g.length)
        {
          localObject2[k][i1] = paramh.a(k, this.h[i1]);
          i1 += 1;
        }
        k += 1;
      }
      this.q = ((String[][])Array.newInstance(String.class, new int[] { i2, 2 }));
      k = 0;
      while (k < i2)
      {
        this.q[k][0] = paramh.a(k, "1005");
        this.q[k][1] = paramh.a(k, "1006");
        k += 1;
      }
      this.j = paramh;
      k = 0;
      while (k < i2)
      {
        paramj[k][0] = o.a(k, 0);
        i1 = 1;
        while (i1 < this.g.length)
        {
          paramj[k][i1] = o.a(k, i1);
          i1 += 1;
        }
        localObject1[k] = localObject2[k][0];
        k += 1;
      }
    }
    this.p = ((String[])localObject1);
    if (this.p.length != 0) {
      this.C.a(this.p);
    }
    for (;;)
    {
      if ((this.p.length != 0) && (this.F == -1)) {
        this.C.a(0);
      }
      if ((this.o.length == 0) || (this.p.length == 0)) {
        break;
      }
      this.D.setBackgroundResource(2130837582);
      this.D.setTextColor(-1);
      this.D.setEnabled(true);
      a(0);
      return;
      this.p = new String[1];
      this.p[0] = "- 无记录 -";
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.N) {
      e.a().p();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    System.out.println("regionTable");
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.s = paramBundle.getString("gotoFlag");
      this.u = paramBundle.getBoolean("xcLoginProcedure");
      this.J = paramBundle.getBoolean("haveNoLoginSorHaveOne");
    }
    boolean bool;
    if (this.s != null)
    {
      bool = true;
      this.r = bool;
      this.t = e.a().j();
      this.K = com.android.dazhihui.c.a.a.i[this.t][0];
      this.L = com.android.dazhihui.c.a.a.i[this.t][1];
      if (!o.z()) {
        break label317;
      }
      b();
    }
    for (;;)
    {
      setContentView(2130903390);
      this.n = ((ListView)findViewById(2131560250));
      this.A = ((ListView)findViewById(2131560251));
      this.D = ((Button)findViewById(2131560248));
      this.z = ((DzhHeader)findViewById(2131558643));
      this.z.a(this, this);
      this.o = new String[1];
      this.o[0] = "";
      this.B = new dl(this, this, this.o);
      this.n.setAdapter(this.B);
      this.C = new dj(this, this, this.o);
      this.A.setAdapter(this.C);
      this.D.setOnClickListener(this);
      this.D.setEnabled(false);
      this.n.setOnItemClickListener(new dd(this));
      this.A.setOnItemClickListener(new de(this));
      return;
      bool = false;
      break;
      label317:
      c();
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.N) {
      e.a().p();
    }
    if (this == b.a().f()) {
      b(9);
    }
  }
  
  public void onClick(View paramView)
  {
    if ((this.o != null) && (this.p != null))
    {
      if (this.s != null) {
        this.G.putString("gotoFlag", this.s);
      }
      this.G.putBoolean("isNeed", this.v);
      this.G.putBoolean("xcLoginProcedure", this.u);
      this.G.putBoolean("fromBrokerList", true);
      this.G.putBoolean("haveNoLoginSorHaveOne", this.J);
      e.a().a(this.G);
      e.a().a(true);
      o.a(this, 0);
      return;
    }
    Toast.makeText(this, "还没有数据，请稍等~~", 1).show();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\RegionTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */