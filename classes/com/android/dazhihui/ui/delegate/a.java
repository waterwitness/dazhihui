package com.android.dazhihui.ui.delegate;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.TransferMenuNew;
import com.android.dazhihui.ui.delegate.screen.ggt.GgtTradeMenu;
import com.android.dazhihui.ui.delegate.screen.hk.bk;
import com.android.dazhihui.ui.delegate.screen.hs.AccessToken;
import com.android.dazhihui.ui.delegate.screen.hs.SecretToolkit;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.delegate.screen.margin.bg;
import com.android.dazhihui.ui.delegate.screen.setplan.x;
import com.android.dazhihui.ui.delegate.screen.xc.trade.au;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.kingdom.mt.jni.kdencode.KDEnCode;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;
import org.json.JSONTokener;

public class a
  implements com.android.dazhihui.a.b.i
{
  public static com.android.dazhihui.a.b.u a;
  public static byte[] b;
  public static BaseActivity c;
  public static com.android.dazhihui.ui.screen.e d;
  private static a l;
  r e;
  private com.android.dazhihui.a.b.e f;
  private String g = "";
  private String h = "";
  private String i = "";
  private boolean j = false;
  private int k = 0;
  private Handler m = new c(this, Looper.getMainLooper());
  private com.android.dazhihui.a.b.e n;
  private t o;
  private byte[] p;
  private com.android.dazhihui.ui.delegate.c.c q;
  private ArrayList<com.android.dazhihui.ui.delegate.c.c> r;
  private com.android.dazhihui.a.b.u s = null;
  private com.android.dazhihui.a.b.u t = null;
  private com.android.dazhihui.a.b.u u = null;
  private com.android.dazhihui.a.b.u v = null;
  private com.android.dazhihui.a.b.u w = null;
  
  private void A()
  {
    com.android.dazhihui.ui.delegate.b.o.y = com.android.dazhihui.ui.delegate.b.o.v;
    Object localObject2 = this.q.d();
    Object localObject3 = this.q.e();
    String str1;
    String str2;
    if ((!this.q.g().equals("n")) && (!this.q.g().equals("b")))
    {
      str1 = this.q.g();
      str2 = this.q.h();
    }
    for (;;)
    {
      Object localObject1 = DzhApplication.a().b();
      Object localObject4 = new h(this);
      localObject1 = (com.android.dazhihui.ui.delegate.b.i)((com.android.dazhihui.c.b.a)localObject1).a(this.q.c(), (com.c.a.c.a)localObject4);
      if (localObject1 != null) {}
      for (localObject1 = ((com.android.dazhihui.ui.delegate.b.i)localObject1).a();; localObject1 = "")
      {
        if ((com.android.dazhihui.ui.delegate.b.o.j == null) || (com.android.dazhihui.ui.delegate.b.o.j.equals(""))) {
          com.android.dazhihui.ui.delegate.b.o.j = com.android.dazhihui.ui.delegate.b.o.B();
        }
        if ((com.android.dazhihui.ui.delegate.b.o.k == null) || (com.android.dazhihui.ui.delegate.b.o.k.equals(""))) {
          com.android.dazhihui.ui.delegate.b.o.k = com.android.dazhihui.ui.delegate.b.o.C();
        }
        localObject4 = new com.android.dazhihui.ui.delegate.b.h("11100").a("1205", "13").a("1203", this.q.a()).a("1016", (String)localObject2).a("1019", (String)localObject2);
        if (this.q.k() == null)
        {
          localObject2 = "";
          localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a("1005", (String)localObject2).a("1030", (String)localObject3).a("1325", "18,11105,11133,11135,11141,11143,11137,11147,11151,11125,11149,12025,11917,11909,11913,11907,11165,11927,11153").a("1329", (String)localObject1).a("1330", "1").a("1021", this.q.f()).a("6129", "10000").a("9006", com.android.dazhihui.ui.delegate.b.o.j).a("6130", com.android.dazhihui.ui.delegate.b.o.k).a("6131", com.android.dazhihui.ui.delegate.b.o.j).a("1202", "android " + com.android.dazhihui.g.a().r()).a("6183", h());
          if (com.android.dazhihui.ui.delegate.b.o.e()) {
            com.android.dazhihui.ui.delegate.screen.otc.w.a((com.android.dazhihui.ui.delegate.b.h)localObject1);
          }
          if (com.android.dazhihui.ui.delegate.b.o.f()) {
            x.a((com.android.dazhihui.ui.delegate.b.h)localObject1);
          }
          if (com.android.dazhihui.ui.delegate.b.o.h()) {
            GgtTradeMenu.a((com.android.dazhihui.ui.delegate.b.h)localObject1);
          }
          if (com.android.dazhihui.ui.delegate.b.o.a()) {
            com.android.dazhihui.ui.delegate.screen.newstock.a.a((com.android.dazhihui.ui.delegate.b.h)localObject1);
          }
          if (com.android.dazhihui.ui.delegate.b.o.b()) {
            com.android.dazhihui.ui.delegate.screen.offerrepurchase.g.a((com.android.dazhihui.ui.delegate.b.h)localObject1);
          }
          if ((this.r == null) || (this.r.size() <= 0)) {
            break label573;
          }
          localObject2 = this.r.iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
            localObject3 = (com.android.dazhihui.ui.delegate.c.c)((Iterator)localObject2).next();
          } while ((!((com.android.dazhihui.ui.delegate.c.c)localObject3).d().equals(this.q.d())) || (!((com.android.dazhihui.ui.delegate.c.c)localObject3).c().equals(this.q.c())));
        }
        label573:
        for (int i1 = 1;; i1 = 0)
        {
          if (i1 != 0) {
            ((com.android.dazhihui.ui.delegate.b.h)localObject1).a("2316", "1");
          }
          for (;;)
          {
            this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject1).h()) });
            this.v.a(this);
            com.android.dazhihui.a.g.a().a(this.v);
            return;
            localObject2 = this.q.k();
            break;
            ((com.android.dazhihui.ui.delegate.b.h)localObject1).a("1324", str2);
            ((com.android.dazhihui.ui.delegate.b.h)localObject1).a("1332", str1);
          }
        }
      }
      str2 = "";
      str1 = "";
    }
  }
  
  private void B()
  {
    com.android.dazhihui.ui.delegate.b.o.y = com.android.dazhihui.ui.delegate.b.o.w;
    Object localObject2 = this.q.d();
    Object localObject3 = this.q.e();
    String str1;
    String str2;
    if ((!this.q.g().equals("n")) && (!this.q.g().equals("b")))
    {
      str1 = this.q.g();
      str2 = this.q.h();
    }
    for (;;)
    {
      Object localObject1 = DzhApplication.a().b();
      Object localObject4 = new i(this);
      localObject1 = (com.android.dazhihui.ui.delegate.b.i)((com.android.dazhihui.c.b.a)localObject1).a(this.q.c(), (com.c.a.c.a)localObject4);
      if (localObject1 != null) {}
      for (localObject1 = ((com.android.dazhihui.ui.delegate.b.i)localObject1).a();; localObject1 = "")
      {
        if ((com.android.dazhihui.ui.delegate.b.o.j == null) || (com.android.dazhihui.ui.delegate.b.o.j.equals(""))) {
          com.android.dazhihui.ui.delegate.b.o.j = com.android.dazhihui.ui.delegate.b.o.B();
        }
        if ((com.android.dazhihui.ui.delegate.b.o.k == null) || (com.android.dazhihui.ui.delegate.b.o.k.equals(""))) {
          com.android.dazhihui.ui.delegate.b.o.k = com.android.dazhihui.ui.delegate.b.o.C();
        }
        localObject4 = new com.android.dazhihui.ui.delegate.b.h("11100").a("1205", "13").a("1203", this.q.a()).a("1016", (String)localObject2).a("1019", (String)localObject2);
        if (this.q.k() == null)
        {
          localObject2 = "";
          localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a("1005", (String)localObject2).a("1030", (String)localObject3).a("1325", "30,12133,12131,12139,12143,12123,12127,12029,12141,11125,12155,12153,12145,12051,12147,12149,12093,12097,12099,12181,12253,12327,12323,12325,12321,12353,12243,12255,12369,12413,12351").a("1329", (String)localObject1).a("1330", "1").a("1021", this.q.f()).a("1552", "1").a("6129", "10000").a("9006", com.android.dazhihui.ui.delegate.b.o.j).a("6130", com.android.dazhihui.ui.delegate.b.o.k).a("6131", com.android.dazhihui.ui.delegate.b.o.j).a("1202", "android " + com.android.dazhihui.g.a().r()).a("6183", h());
          com.android.dazhihui.ui.delegate.screen.newstock.a.b((com.android.dazhihui.ui.delegate.b.h)localObject1);
          if ((this.r == null) || (this.r.size() <= 0)) {
            break label532;
          }
          localObject2 = this.r.iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
            localObject3 = (com.android.dazhihui.ui.delegate.c.c)((Iterator)localObject2).next();
          } while ((!((com.android.dazhihui.ui.delegate.c.c)localObject3).d().equals(this.q.d())) || (!((com.android.dazhihui.ui.delegate.c.c)localObject3).c().equals(this.q.c())));
        }
        label532:
        for (int i1 = 1;; i1 = 0)
        {
          if (i1 != 0) {
            ((com.android.dazhihui.ui.delegate.b.h)localObject1).a("2316", "1");
          }
          for (;;)
          {
            this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject1).h()) });
            this.v.a(this);
            com.android.dazhihui.a.g.a().a(this.v);
            return;
            localObject2 = this.q.k();
            break;
            ((com.android.dazhihui.ui.delegate.b.h)localObject1).a("1324", str2);
            ((com.android.dazhihui.ui.delegate.b.h)localObject1).a("1332", str1);
          }
        }
      }
      str2 = "";
      str1 = "";
    }
  }
  
  public static a a()
  {
    if (l == null) {
      l = new a();
    }
    return l;
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.q == null) {}
    while (this.k == 2) {
      return;
    }
    this.k = 2;
    if (paramBoolean2)
    {
      com.android.dazhihui.ui.delegate.b.o.u();
      com.android.dazhihui.a.g.a().A();
    }
    for (;;)
    {
      this.p = com.android.dazhihui.ui.delegate.b.u.b(16);
      com.android.dazhihui.ui.delegate.b.g localg = new com.android.dazhihui.ui.delegate.b.g();
      localg.a(com.android.dazhihui.ui.delegate.b.u.a(com.android.dazhihui.ui.delegate.b.o.f(this.q.c()), 20));
      localg.g(0);
      localg.a(com.android.dazhihui.ui.delegate.b.u.a(this.q.a(), 20));
      localg.a(this.p);
      int i1 = com.android.dazhihui.ui.delegate.b.u.h();
      try
      {
        byte[] arrayOfByte = com.android.dazhihui.ui.delegate.c.d.a(i1);
        i1 = 0;
        for (;;)
        {
          if (i1 < arrayOfByte.length)
          {
            if (arrayOfByte[i1] == 0) {
              arrayOfByte[i1] = 1;
            }
            i1 += 1;
            continue;
            com.android.dazhihui.ui.delegate.b.o.o = false;
            com.android.dazhihui.ui.delegate.b.k.d();
            com.android.dazhihui.ui.delegate.b.u.a();
            com.android.dazhihui.a.g.a().A();
            break;
          }
        }
        i1 = com.android.dazhihui.ui.delegate.c.d.a(arrayOfByte);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          i1 = 2139062143;
        }
      }
    }
    localg.g(i1);
    this.s = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(13, localg.a()) });
    this.s.a(this);
    this.s.a(new boolean[] { paramBoolean1, paramBoolean2 });
    com.android.dazhihui.a.g.a().a(this.s);
    Log.d("tradelogin", "send_D()");
  }
  
  private void c(boolean paramBoolean)
  {
    Log.d("tradelogin", "sendVerifyRequest()");
    int i1 = com.android.dazhihui.ui.a.e.a().j();
    if ("1".equals(com.android.dazhihui.c.a.a.C[i1][4]))
    {
      if (this.q.i())
      {
        y();
        return;
      }
      d(paramBoolean);
      return;
    }
    if (com.android.dazhihui.ui.delegate.b.o.n())
    {
      z();
      return;
    }
    if (this.q.i())
    {
      B();
      return;
    }
    A();
  }
  
  private void d(boolean paramBoolean)
  {
    com.android.dazhihui.ui.delegate.b.o.y = com.android.dazhihui.ui.delegate.b.o.v;
    String str1 = this.q.d();
    String str2 = this.q.e();
    Object localObject1 = DzhApplication.a().b();
    Object localObject2 = new e(this);
    localObject1 = (com.android.dazhihui.ui.delegate.b.i)((com.android.dazhihui.c.b.a)localObject1).a(this.q.c(), (com.c.a.c.a)localObject2);
    if (localObject1 != null) {}
    for (localObject1 = ((com.android.dazhihui.ui.delegate.b.i)localObject1).a();; localObject1 = "")
    {
      if ((com.android.dazhihui.ui.delegate.b.o.j == null) || (com.android.dazhihui.ui.delegate.b.o.j.equals(""))) {
        com.android.dazhihui.ui.delegate.b.o.j = com.android.dazhihui.ui.delegate.b.o.B();
      }
      if ((com.android.dazhihui.ui.delegate.b.o.k == null) || (com.android.dazhihui.ui.delegate.b.o.k.equals(""))) {
        com.android.dazhihui.ui.delegate.b.o.k = com.android.dazhihui.ui.delegate.b.o.C();
      }
      localObject2 = new com.android.dazhihui.ui.delegate.b.h("11100");
      com.android.dazhihui.ui.a.e.a().j();
      com.android.dazhihui.ui.delegate.b.h localh = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a("1205", "13").a("1203", this.q.a()).a("1016", str1).a("1019", str1);
      if (this.q.k() == null) {}
      for (str1 = "";; str1 = this.q.k())
      {
        localh.a("1005", str1).a("1030", str2).a("1325", "18,11105,11133,11135,11141,11143,11137,11147,11151,11125,11149,12025,11917,11909,11913,11907,11165,11927,11153").a("1329", (String)localObject1).a("1330", "1").a("1021", this.q.f()).a("6129", "10000").a("9006", com.android.dazhihui.ui.delegate.b.o.j).a("6130", com.android.dazhihui.ui.delegate.b.o.k).a("6131", com.android.dazhihui.ui.delegate.b.o.j).a("1202", "android " + com.android.dazhihui.g.a().r()).a("6183", h());
        if (com.android.dazhihui.ui.delegate.b.o.e()) {
          com.android.dazhihui.ui.delegate.screen.otc.w.a((com.android.dazhihui.ui.delegate.b.h)localObject2);
        }
        if (com.android.dazhihui.ui.delegate.b.o.f()) {
          x.a((com.android.dazhihui.ui.delegate.b.h)localObject2);
        }
        if (com.android.dazhihui.ui.delegate.b.o.h()) {
          GgtTradeMenu.a((com.android.dazhihui.ui.delegate.b.h)localObject2);
        }
        if (com.android.dazhihui.ui.delegate.b.o.a()) {
          com.android.dazhihui.ui.delegate.screen.newstock.a.a((com.android.dazhihui.ui.delegate.b.h)localObject2);
        }
        if (com.android.dazhihui.ui.delegate.b.o.b()) {
          com.android.dazhihui.ui.delegate.screen.offerrepurchase.g.a((com.android.dazhihui.ui.delegate.b.h)localObject2);
        }
        if (paramBoolean) {
          ((com.android.dazhihui.ui.delegate.b.h)localObject2).a("6093", "1");
        }
        this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject2).h()) });
        this.v.a(this);
        this.v.a(Boolean.valueOf(paramBoolean));
        com.android.dazhihui.a.g.a().a(this.v);
        return;
      }
    }
  }
  
  private void s()
  {
    if (this.r == null) {
      this.r = new ArrayList();
    }
    if (!this.r.contains(this.q)) {
      this.r.add(0, this.q);
    }
  }
  
  private void t()
  {
    if ((com.android.dazhihui.b.b.a().f() != null) && (((com.android.dazhihui.b.b.a().f() instanceof DelegateBaseActivity)) || (com.android.dazhihui.b.b.a().f().getTouchOrClickListener() != null)))
    {
      com.android.dazhihui.ui.delegate.b.o.u();
      new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setTitle("网络异常，请重新登陆").setPositiveButton(2131165363, new q(this)).setOnCancelListener(new p(this)).show();
    }
  }
  
  private void u()
  {
    com.android.dazhihui.ui.delegate.b.o.o = true;
    x();
    this.k = 3;
    if (this.e != null)
    {
      this.e.c();
      this.e = null;
    }
    v();
    s();
    com.android.dazhihui.ui.delegate.b.k.a(com.android.dazhihui.b.b.a().f()).c();
    com.android.dazhihui.ui.delegate.b.o.r = false;
  }
  
  private void v()
  {
    com.android.dazhihui.d.n.a("", 1312);
    if ((com.android.dazhihui.ui.a.e.a().j() != -1) && (com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()].length > 6)) {
      com.android.dazhihui.d.n.a(com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6], 20029);
    }
    if ((!com.android.dazhihui.ui.delegate.b.o.l()) && (!com.android.dazhihui.ui.delegate.b.o.m())) {
      com.android.dazhihui.d.n.a(com.android.dazhihui.g.a().H() + ":" + com.android.dazhihui.g.a().I(), 20034);
    }
    if (this.q != null) {
      com.android.dazhihui.d.n.a(this.q.d(), 20033);
    }
  }
  
  private void w()
  {
    if ((com.android.dazhihui.ui.a.e.a().j() != -1) && (com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()].length > 6)) {
      com.android.dazhihui.d.n.a(com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6], 20030);
    }
    if ((!com.android.dazhihui.ui.delegate.b.o.l()) && (!com.android.dazhihui.ui.delegate.b.o.m())) {
      com.android.dazhihui.d.n.a(com.android.dazhihui.g.a().H() + ":" + com.android.dazhihui.g.a().I(), 20034);
    }
    if (this.q != null) {
      com.android.dazhihui.d.n.a(this.q.d(), 20033);
    }
  }
  
  private void x()
  {
    com.android.dazhihui.c.a.a locala = new com.android.dazhihui.c.a.a(com.android.dazhihui.b.b.a().f().getApplication());
    locala.close();
    com.android.dazhihui.c.a.a.z = this.q.c();
    locala.a(34);
    locala.close();
    com.android.dazhihui.ui.delegate.b.o.a(com.android.dazhihui.c.a.a.z, com.android.dazhihui.b.b.a().f());
    if ((com.android.dazhihui.c.a.a.E == null) || (com.android.dazhihui.c.a.a.E.length < 1))
    {
      com.android.dazhihui.c.a.a.E = (String[][])Array.newInstance(String.class, new int[] { 1, 7 });
      com.android.dazhihui.c.a.a.E[0][0] = this.q.c();
      com.android.dazhihui.c.a.a.E[0][1] = this.q.k();
      com.android.dazhihui.c.a.a.E[0][2] = this.q.d();
      com.android.dazhihui.c.a.a.E[0][3] = this.q.f();
      com.android.dazhihui.c.a.a.E[0][4] = this.q.l();
      com.android.dazhihui.c.a.a.E[0][5] = this.q.m();
      if (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.w)
      {
        com.android.dazhihui.c.a.a.E[0][6] = "1";
        locala.a(39);
        locala.close();
      }
    }
    label260:
    label276:
    label394:
    label407:
    label638:
    for (;;)
    {
      return;
      com.android.dazhihui.c.a.a.E[0][6] = "0";
      break;
      int i1 = 0;
      Object localObject;
      String str1;
      if (i1 < com.android.dazhihui.c.a.a.E.length)
      {
        String str2 = this.q.c();
        String str3 = this.q.d();
        if (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.w)
        {
          localObject = "1";
          if (com.android.dazhihui.c.a.a.E[i1].length >= 7) {
            break label394;
          }
          str1 = "0";
          if ((!str3.equals(com.android.dazhihui.c.a.a.E[i1][2])) || (!str2.equals(com.android.dazhihui.c.a.a.E[i1][0])) || (!((String)localObject).equals(str1))) {
            break label407;
          }
          a(com.android.dazhihui.c.a.a.E[i1][0], com.android.dazhihui.c.a.a.E[i1][2], (String)localObject);
        }
      }
      for (i1 = 0;; i1 = 1)
      {
        if (i1 == 0) {
          break label638;
        }
        localObject = new ArrayList();
        i1 = 0;
        for (;;)
        {
          if (i1 < com.android.dazhihui.c.a.a.E.length)
          {
            ((List)localObject).add(com.android.dazhihui.c.a.a.E[i1]);
            i1 += 1;
            continue;
            localObject = "0";
            break label260;
            str1 = com.android.dazhihui.c.a.a.E[i1][6];
            break label276;
            i1 += 1;
            break;
          }
        }
        com.android.dazhihui.c.a.a.E = (String[][])Array.newInstance(String.class, new int[] { ((List)localObject).size() + 1, 7 });
        i1 = 0;
        if (i1 < ((List)localObject).size() + 1)
        {
          if (i1 == 0)
          {
            com.android.dazhihui.c.a.a.E[i1][0] = this.q.c();
            com.android.dazhihui.c.a.a.E[i1][1] = this.q.k();
            com.android.dazhihui.c.a.a.E[i1][2] = this.q.d();
            com.android.dazhihui.c.a.a.E[i1][3] = this.q.f();
            com.android.dazhihui.c.a.a.E[i1][4] = this.q.l();
            com.android.dazhihui.c.a.a.E[i1][5] = this.q.m();
            if (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.w) {
              com.android.dazhihui.c.a.a.E[i1][6] = "1";
            }
          }
          for (;;)
          {
            i1 += 1;
            break;
            com.android.dazhihui.c.a.a.E[i1][6] = "0";
            continue;
            com.android.dazhihui.c.a.a.E[i1] = ((String[])((List)localObject).get(i1 - 1));
          }
        }
        locala.a(39);
        locala.close();
        return;
      }
    }
  }
  
  private void y()
  {
    com.android.dazhihui.ui.delegate.b.o.y = com.android.dazhihui.ui.delegate.b.o.w;
    String str1 = this.q.d();
    String str2 = this.q.e();
    Object localObject1 = DzhApplication.a().b();
    Object localObject2 = new f(this);
    localObject1 = (com.android.dazhihui.ui.delegate.b.i)((com.android.dazhihui.c.b.a)localObject1).a(this.q.c(), (com.c.a.c.a)localObject2);
    if (localObject1 != null) {}
    for (localObject1 = ((com.android.dazhihui.ui.delegate.b.i)localObject1).a();; localObject1 = "")
    {
      if ((com.android.dazhihui.ui.delegate.b.o.j == null) || (com.android.dazhihui.ui.delegate.b.o.j.equals(""))) {
        com.android.dazhihui.ui.delegate.b.o.j = com.android.dazhihui.ui.delegate.b.o.B();
      }
      if ((com.android.dazhihui.ui.delegate.b.o.k == null) || (com.android.dazhihui.ui.delegate.b.o.k.equals(""))) {
        com.android.dazhihui.ui.delegate.b.o.k = com.android.dazhihui.ui.delegate.b.o.C();
      }
      localObject2 = new com.android.dazhihui.ui.delegate.b.h("11100").a("1205", "13").a("1203", this.q.a()).a("1016", str1).a("1019", str1);
      if (this.q.k() == null) {}
      for (str1 = "";; str1 = this.q.k())
      {
        localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a("1005", str1).a("1030", str2).a("1325", "30,12133,12131,12139,12143,12123,12127,12029,12141,11125,12155,12153,12145,12051,12147,12149,12093,12097,12099,12181,12253,12327,12323,12325,12321,12353,12243,12255,12369,12413,12351").a("1329", (String)localObject1).a("1330", "1").a("1021", this.q.f()).a("1552", "1").a("6129", "10000").a("9006", com.android.dazhihui.ui.delegate.b.o.j).a("6130", com.android.dazhihui.ui.delegate.b.o.k).a("6131", com.android.dazhihui.ui.delegate.b.o.j).a("1202", "android " + com.android.dazhihui.g.a().r()).a("6183", h());
        com.android.dazhihui.ui.delegate.screen.newstock.a.b((com.android.dazhihui.ui.delegate.b.h)localObject1);
        this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject1).h()) });
        this.v.a(this);
        com.android.dazhihui.a.g.a().a(this.v);
        return;
      }
    }
  }
  
  private void z()
  {
    com.android.dazhihui.ui.delegate.b.o.y = com.android.dazhihui.ui.delegate.b.o.x;
    String str1 = this.q.d();
    String str2 = this.q.e();
    Object localObject = DzhApplication.a().b();
    g localg = new g(this);
    localObject = (com.android.dazhihui.ui.delegate.b.i)((com.android.dazhihui.c.b.a)localObject).a(this.q.c(), localg);
    if (localObject != null) {}
    for (localObject = ((com.android.dazhihui.ui.delegate.b.i)localObject).a();; localObject = "")
    {
      if ((com.android.dazhihui.ui.delegate.b.o.j == null) || (com.android.dazhihui.ui.delegate.b.o.j.equals(""))) {
        com.android.dazhihui.ui.delegate.b.o.j = com.android.dazhihui.ui.delegate.b.o.B();
      }
      if ((com.android.dazhihui.ui.delegate.b.o.k == null) || (com.android.dazhihui.ui.delegate.b.o.k.equals(""))) {
        com.android.dazhihui.ui.delegate.b.o.k = com.android.dazhihui.ui.delegate.b.o.C();
      }
      localObject = new com.android.dazhihui.ui.delegate.b.h("15000").a("1205", "13").a("1203", this.q.a()).a("1016", str1).a("1019", str1).a("1030", str2).a("1329", (String)localObject).a("6129", "10000").a("6130", com.android.dazhihui.ui.delegate.b.o.k).a("6131", com.android.dazhihui.ui.delegate.b.o.j).a("1202", "android " + com.android.dazhihui.g.a().r()).a("6183", h());
      bk.b((com.android.dazhihui.ui.delegate.b.h)localObject);
      this.w = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      this.w.a(this);
      com.android.dazhihui.a.g.a().a(this.w);
      return;
    }
  }
  
  public void a(com.android.dazhihui.ui.delegate.c.c paramc)
  {
    if (this.r == null) {
      this.r = new ArrayList();
    }
    if (this.r != null)
    {
      Iterator localIterator = this.r.iterator();
      while (localIterator.hasNext())
      {
        com.android.dazhihui.ui.delegate.c.c localc = (com.android.dazhihui.ui.delegate.c.c)localIterator.next();
        if ((localc.c().equals(paramc.c())) && (localc.d().equals(paramc.d()))) {
          this.r.remove(localc);
        }
      }
    }
  }
  
  public void a(r paramr, com.android.dazhihui.ui.delegate.c.c paramc, boolean paramBoolean)
  {
    this.k = 0;
    this.q = paramc;
    this.e = paramr;
    a(this.q);
    b(paramBoolean);
  }
  
  public void a(String paramString)
  {
    this.g = paramString;
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    com.android.dazhihui.c.a.a locala = new com.android.dazhihui.c.a.a(com.android.dazhihui.b.b.a().f().getApplication());
    String[][] arrayOfString = (String[][])Array.newInstance(String.class, new int[] { com.android.dazhihui.c.a.a.E.length, 7 });
    int i1 = 0;
    String str;
    if (i1 < arrayOfString.length)
    {
      if (com.android.dazhihui.c.a.a.E[i1].length < 7) {}
      for (str = "0";; str = com.android.dazhihui.c.a.a.E[i1][6])
      {
        if ((paramString1.equals(com.android.dazhihui.c.a.a.E[i1][0])) && (paramString2.equals(com.android.dazhihui.c.a.a.E[i1][2])) && (str.equals(paramString3))) {
          arrayOfString[0] = com.android.dazhihui.c.a.a.E[i1];
        }
        i1 += 1;
        break;
      }
    }
    int i2 = 1;
    i1 = 0;
    if (i1 < arrayOfString.length)
    {
      if (com.android.dazhihui.c.a.a.E[i1].length < 7)
      {
        str = "0";
        label174:
        if ((!paramString1.equals(com.android.dazhihui.c.a.a.E[i1][0])) || (!paramString2.equals(com.android.dazhihui.c.a.a.E[i1][2])) || (!str.equals(paramString3))) {
          break label236;
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
        str = com.android.dazhihui.c.a.a.E[i1][6];
        break label174;
        label236:
        arrayOfString[i2] = com.android.dazhihui.c.a.a.E[i1];
        i2 += 1;
      }
    }
    com.android.dazhihui.c.a.a.E = arrayOfString;
    locala.a(39);
    locala.close();
  }
  
  public void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public ArrayList<com.android.dazhihui.ui.delegate.c.c> b()
  {
    return this.r;
  }
  
  public void b(String paramString)
  {
    this.h = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    Object localObject1;
    if ((this.q != null) && (this.k != 1) && (this.k != 2))
    {
      int i1 = com.android.dazhihui.ui.a.e.a().j();
      if ((com.android.dazhihui.g.a().H() == null) && (com.android.dazhihui.c.a.a.K == null))
      {
        localObject1 = com.android.dazhihui.d.n.a(com.android.dazhihui.c.a.a.D[i1], null);
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          localObject1 = com.android.dazhihui.d.n.d((String)localObject1);
          com.android.dazhihui.a.g.a().d(false);
          com.android.dazhihui.g.a().f(localObject1[0]);
          com.android.dazhihui.g.a().h(Integer.parseInt(localObject1[1]));
        }
      }
      this.k = 1;
      if (!com.android.dazhihui.ui.delegate.b.o.l()) {}
    }
    else
    {
      try
      {
        com.android.dazhihui.ui.delegate.b.o.l = com.android.dazhihui.ui.delegate.b.o.A();
        localObject1 = com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6];
        TelephonyManager localTelephonyManager = (TelephonyManager)com.android.dazhihui.b.b.a().f().getSystemService("phone");
        SecretToolkit.setActivity(com.android.dazhihui.b.b.a().f());
        Object localObject2 = SecretToolkit.getInstance();
        String str = ((SecretToolkit)localObject2).secretIn_password(this.q.e());
        localObject2 = ((SecretToolkit)localObject2).secretIn_secretkeyinfo();
        this.f = new com.android.dazhihui.a.b.e();
        this.f.c("https://uatopen.hs.net/oauth2/oauth2/oauthacct_trade_bind");
        this.f.b("UTF-8");
        this.f.a("Basic " + com.android.dazhihui.ui.delegate.b.o.l);
        this.f.a("targetcomp_id", (String)localObject1);
        this.f.a("sendercomp_id", "90013");
        this.f.a("targetbusinsys_no", "1000");
        this.f.a("imei_code", localTelephonyManager.getDeviceId());
        this.f.a("mobile_uuid", "");
        this.f.a("terminal_device", Build.MODEL);
        this.f.a("terminal_os", "Android" + Build.VERSION.RELEASE);
        this.f.a("terminal_platform", com.android.dazhihui.ui.delegate.b.o.c(com.android.dazhihui.b.b.a().f()));
        this.f.a("op_station", this.q.a());
        this.f.a("input_content", this.q.f());
        this.f.a("account_content", this.q.d());
        this.f.a("password", str);
        this.f.a("secret_key_info", (String)localObject2);
        this.f.a("hs_signature", "");
        this.f.a(this);
        this.f.a(Boolean.valueOf(paramBoolean));
        com.android.dazhihui.a.g.a().a(this.f);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
    if (com.android.dazhihui.ui.delegate.b.o.m())
    {
      o();
      return;
    }
    a(paramBoolean, true);
  }
  
  public com.android.dazhihui.ui.delegate.c.c c()
  {
    return this.q;
  }
  
  public void c(String paramString)
  {
    this.i = paramString;
  }
  
  public void d()
  {
    this.r = null;
    this.q = null;
    this.g = "";
    this.h = "";
    this.i = "";
  }
  
  public String e()
  {
    return this.g;
  }
  
  public String f()
  {
    return this.h;
  }
  
  public String g()
  {
    return this.i;
  }
  
  public String h()
  {
    String str2 = Build.VERSION.RELEASE;
    String str1 = str2;
    if (str2 == null) {
      str1 = "";
    }
    return str1;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    int i1 = com.android.dazhihui.ui.a.e.a().j();
    Object localObject1;
    Object localObject3;
    Object localObject2;
    Object localObject4;
    Object localObject5;
    int i2;
    int i10;
    label289:
    label450:
    label529:
    int i9;
    if (paramh == this.s)
    {
      Log.d("tradelogin", "handleResponse  request_D");
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, com.android.dazhihui.b.b.a().f()))
      {
        localObject3 = new com.android.dazhihui.ui.delegate.b.g(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        boolean bool = ((com.android.dazhihui.ui.delegate.b.g)localObject3).g();
        localObject1 = ((com.android.dazhihui.ui.delegate.b.g)localObject3).h(16);
        localObject2 = ((com.android.dazhihui.ui.delegate.b.g)localObject3).h(16);
        i1 = ((com.android.dazhihui.ui.delegate.b.g)localObject3).f();
        if (!bool) {
          break label783;
        }
        if ((this.q == null) || (this.q.b() == null)) {
          return;
        }
        localObject3 = this.q.b().getBytes();
        localObject4 = new byte[localObject1.length + localObject3.length + this.p.length];
        System.arraycopy(localObject1, 0, localObject4, 0, localObject1.length);
        System.arraycopy(localObject3, 0, localObject4, localObject1.length, localObject3.length);
        localObject5 = this.p;
        i2 = localObject1.length;
        System.arraycopy(localObject5, 0, localObject4, localObject3.length + i2, this.p.length);
        localObject3 = com.android.dazhihui.ui.delegate.b.j.a((byte[])localObject4);
        if (com.android.dazhihui.ui.delegate.b.u.a((byte[])localObject1, com.android.dazhihui.ui.delegate.b.a.b((byte[])localObject2, (byte[])localObject3))) {
          break label529;
        }
        if (!com.android.dazhihui.ui.delegate.b.o.n()) {
          break label450;
        }
        i10 = 0;
        bool = i10;
        if (com.android.dazhihui.ui.a.e.a().b() != null)
        {
          localObject1 = com.android.dazhihui.ui.a.e.a().b();
          bool = i10;
          if (localObject1 != null) {
            bool = ((Bundle)localObject1).getBoolean("haveNoLoginSorHaveOne");
          }
        }
        com.android.dazhihui.ui.delegate.b.o.e(com.android.dazhihui.b.b.a().f(), bool);
      }
      for (;;)
      {
        this.k = 0;
        w();
        a(this.q);
        if (!(paramj instanceof com.android.dazhihui.a.b.g)) {
          break label5190;
        }
        paramj = (com.android.dazhihui.a.b.g)paramj;
        if (paramh != this.o) {
          break;
        }
        paramh = new String(paramj.a());
        System.out.println("登陆返回数据" + paramh);
        paramh = (JinzhengResponse)new com.c.a.k().a(paramh, JinzhengResponse.class);
        paramj = ((JinzhengResponse.Answer)paramh.ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
        localObject1 = ((JinzhengResponse.Answer)paramh.ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
        com.android.dazhihui.ui.delegate.b.o.g = ((JinzhengResponse.Answer)paramh.ANSWERS.get(0)).ANS_MSG_HDR.SESSION;
        if (!paramj.equals("0")) {
          break label5192;
        }
        com.android.dazhihui.ui.delegate.b.o.p = this.q.d();
        com.android.dazhihui.ui.delegate.b.o.i = true;
        u();
        return;
        if (this.e != null)
        {
          this.e.d();
          this.e = null;
          new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setTitle("　　通信密码错误。").setPositiveButton(2131165363, new j(this)).setOnCancelListener(new b(this)).show();
        }
        else
        {
          t();
        }
      }
      com.android.dazhihui.ui.delegate.b.u.a((byte[])localObject3, i1);
      localObject1 = (boolean[])this.s.j();
      if (localObject1 == null) {
        break label5264;
      }
      i10 = localObject1[0];
      i9 = localObject1[1];
    }
    for (;;)
    {
      if (i9 != 0)
      {
        this.k = 1;
        c(i10);
        break label289;
      }
      if (com.android.dazhihui.ui.delegate.b.o.r())
      {
        this.k = 3;
        com.android.dazhihui.ui.delegate.b.o.o = true;
        com.android.dazhihui.ui.delegate.b.k.a(com.android.dazhihui.b.b.a().f()).c();
        Log.e("trade", "request_D succeed");
        if ((a == null) || (b == null)) {
          break label289;
        }
        if ((d == null) && (c != null) && (!c.isFinishing()))
        {
          localObject1 = new com.android.dazhihui.ui.delegate.b.u(b);
          a.a(new com.android.dazhihui.ui.delegate.b.u[] { localObject1 });
          c.registRequestListener(a);
          c.sendRequest(a);
          break label289;
        }
        if ((d == null) || (!d.isVisible()) || (c == null) || (c.isFinishing())) {
          break label289;
        }
        localObject1 = new com.android.dazhihui.ui.delegate.b.u(b);
        a.a(new com.android.dazhihui.ui.delegate.b.u[] { localObject1 });
        d.registRequestListener(a);
        d.sendRequest(a);
        break label289;
      }
      this.k = 0;
      break label289;
      label783:
      if (com.android.dazhihui.ui.delegate.b.o.n())
      {
        com.android.dazhihui.ui.delegate.b.o.e(com.android.dazhihui.b.b.a().f(), false);
        return;
      }
      if (this.e != null)
      {
        this.e.d();
        this.e = null;
        new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setTitle("验证失败").setPositiveButton(2131165363, new l(this)).setOnCancelListener(new k(this)).show();
      }
      for (;;)
      {
        this.k = 0;
        w();
        a(this.q);
        break;
        t();
      }
      Object localObject6;
      if (paramh == this.v)
      {
        Log.d("tradelogin", "handleResponse  request_11100");
        localObject2 = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, com.android.dazhihui.b.b.a().f())) {
          break label289;
        }
        localObject1 = com.android.dazhihui.ui.delegate.b.g.c(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
        localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
        if ((((com.android.dazhihui.ui.delegate.b.h)localObject2).f() == null) || (((com.android.dazhihui.ui.delegate.b.h)localObject2).f().length < 1) || (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b()) || (i1 == -1))
        {
          paramh = Toast.makeText(com.android.dazhihui.b.b.a().f(), ((com.android.dazhihui.ui.delegate.b.h)localObject2).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          if (this.e != null)
          {
            this.e.d();
            this.e = null;
          }
          for (;;)
          {
            this.k = 0;
            w();
            a(this.q);
            com.android.dazhihui.ui.delegate.b.o.a(null);
            return;
            t();
          }
        }
        localObject3 = this.v.j();
        if ((localObject3 != null) && (Boolean.valueOf(localObject3.toString()).booleanValue()))
        {
          localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "6096");
          localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "6097");
          localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "6094");
          localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "6095");
          if ((localObject3 != null) && (((String)localObject3).equals("1"))) {
            com.android.dazhihui.w.a().a((String)localObject5, (String)localObject6);
          }
        }
        else
        {
          label1163:
          com.android.dazhihui.ui.delegate.c.d.e = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "21010");
          com.android.dazhihui.ui.delegate.b.o.a(new com.android.dazhihui.ui.delegate.b.h(null).a("21010", com.android.dazhihui.ui.delegate.c.d.e).a("1205", "13").a("1207", ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1207")).a("1203", com.android.dazhihui.c.a.a.i[i1][0]).a("1005", ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1005")).a("1016", ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1016")).a("1030", this.q.e()).a("6129", "10000").a("6130", com.android.dazhihui.ui.delegate.b.o.k).a("6131", com.android.dazhihui.ui.delegate.b.o.j).a("1202", "android " + com.android.dazhihui.g.a().r()).a("6183", h()));
          this.k = 3;
          com.android.dazhihui.ui.delegate.b.o.a(((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1215"), ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1216"));
          com.android.dazhihui.ui.delegate.c.d.a = this.q.d();
          com.android.dazhihui.ui.delegate.c.d.b = this.q.e();
          localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1005");
          com.android.dazhihui.ui.a.e.a().k((String)localObject3);
          localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1322");
          if ((localObject3 != null) && (!((String)localObject3).equals(""))) {
            com.android.dazhihui.ui.delegate.c.d.c = Integer.parseInt((String)localObject3);
          }
          au.a = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1402");
          if (au.a == null) {
            au.a = "1";
          }
          TransferMenuNew.a = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1403");
          if (TransferMenuNew.a == null) {
            TransferMenuNew.a = "1";
          }
          bg.e = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1755");
          bg.f = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1756");
          bg.d = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1831");
          if (bg.a()) {
            break label1631;
          }
        }
        label1631:
        for (i9 = 1;; i9 = 0)
        {
          com.android.dazhihui.ui.delegate.screen.margin.MarColVerify.a = i9;
          localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1329");
          if ((localObject3 != null) && (!com.android.dazhihui.c.a.a.u.equals(localObject3)))
          {
            localObject4 = new com.android.dazhihui.c.a.a(com.android.dazhihui.b.b.a().f().getApplication());
            ((com.android.dazhihui.c.a.a)localObject4).close();
            com.android.dazhihui.c.a.a.u = (String)localObject3;
            ((com.android.dazhihui.c.a.a)localObject4).a(29);
            ((com.android.dazhihui.c.a.a)localObject4).close();
          }
          localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1331");
          if ((localObject3 != null) && (((String)localObject3).length() != 0)) {
            break label1637;
          }
          q();
          break;
          com.android.dazhihui.b.b.a().b((String)localObject4);
          break label1163;
        }
        label1637:
        if (!((String)localObject3).substring(1, 2).equals("1"))
        {
          localObject3 = DzhApplication.a().b();
          localObject4 = new m(this);
          localObject3 = (com.android.dazhihui.ui.delegate.b.i)((com.android.dazhihui.c.b.a)localObject3).a(this.q.c(), (com.c.a.c.a)localObject4);
          if (localObject3 != null)
          {
            localObject4 = new com.android.dazhihui.c.a.a(com.android.dazhihui.b.b.a().f());
            ((com.android.dazhihui.c.a.a)localObject4).close();
            com.android.dazhihui.c.a.a.x = ((com.android.dazhihui.ui.delegate.b.i)localObject3).b();
            com.android.dazhihui.c.a.a.v = ((com.android.dazhihui.ui.delegate.b.i)localObject3).c();
            com.android.dazhihui.c.a.a.w = ((com.android.dazhihui.ui.delegate.b.i)localObject3).d();
            ((com.android.dazhihui.c.a.a)localObject4).a(30);
            ((com.android.dazhihui.c.a.a)localObject4).close();
            ((com.android.dazhihui.c.a.a)localObject4).a(31);
            ((com.android.dazhihui.c.a.a)localObject4).close();
            ((com.android.dazhihui.c.a.a)localObject4).a(32);
            ((com.android.dazhihui.c.a.a)localObject4).close();
          }
          i1 = 0;
          while (i1 < com.android.dazhihui.c.a.a.x.length)
          {
            localObject3 = com.android.dazhihui.c.a.a.x[i1];
            localObject4 = com.android.dazhihui.c.a.a.v[i1];
            localObject5 = com.android.dazhihui.c.a.a.w[i1];
            com.android.dazhihui.ui.delegate.c.a.a((String)localObject3, (String[])localObject4, (String[])localObject5);
            com.android.dazhihui.ui.delegate.screen.otc.w.a((String)localObject3, (String[])localObject4, (String[])localObject5);
            com.android.dazhihui.ui.delegate.screen.newstock.a.a((String)localObject3, (String[])localObject4, (String[])localObject5);
            x.a((String)localObject3, (String[])localObject4, (String[])localObject5);
            GgtTradeMenu.a((String)localObject3, (String[])localObject4, (String[])localObject5);
            i1 += 1;
          }
          i1 = ((String)localObject1).indexOf("\00121000=");
          if (i1 == -1) {
            break label5258;
          }
          i1 = ((String)localObject1).indexOf("\00121000=", i1 + 7) + 7;
          i2 = ((String)localObject1).indexOf("\001", i1);
          if ((i2 == -1) || (i2 <= i1)) {
            break label5258;
          }
        }
      }
      label3946:
      label3976:
      label4002:
      label4055:
      label4068:
      label4080:
      label4093:
      label4967:
      label5190:
      label5192:
      label5258:
      for (i1 = com.android.dazhihui.d.a.c(((String)localObject1).substring(i1, i2).trim());; i1 = 0)
      {
        localObject1 = (String[][])Array.newInstance(String.class, new int[] { i1, 3 });
        i2 = 0;
        while (i2 < i1)
        {
          localObject1[i2][0] = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2 + 1, "1021");
          localObject1[i2][1] = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2 + 1, "1019");
          localObject1[i2][2] = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2 + 1, "1394");
          i2 += 1;
        }
        com.android.dazhihui.ui.delegate.b.o.z = (String[][])localObject1;
        u();
        break label289;
        i1 = ((String)localObject1).indexOf("\00121000=");
        if (i1 != -1)
        {
          i1 = ((String)localObject1).indexOf("\00121000=", i1 + 7) + 7;
          i2 = ((String)localObject1).indexOf("\001", i1);
          if ((i2 == -1) || (i2 <= i1)) {}
        }
        for (i1 = com.android.dazhihui.d.a.c(((String)localObject1).substring(i1, i2).trim());; i1 = 0)
        {
          localObject3 = new com.android.dazhihui.c.a.a(com.android.dazhihui.b.b.a().f());
          ((com.android.dazhihui.c.a.a)localObject3).close();
          int i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g() - i1 - 1;
          com.android.dazhihui.c.a.a.x = new String[i4];
          com.android.dazhihui.c.a.a.v = new String[i4][];
          com.android.dazhihui.c.a.a.w = new String[i4][];
          i2 = 0;
          int i3;
          int i5;
          int i6;
          int i7;
          int i8;
          String str2;
          while (i2 < i4)
          {
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2 + i1 + 1, "1326");
            i3 = ((String)localObject1).indexOf(",");
            localObject4 = ((String)localObject1).substring(0, i3);
            localObject1 = ((String)localObject1).substring(i3 + 1);
            i3 = ((String)localObject1).indexOf(",");
            i5 = Integer.parseInt(((String)localObject1).substring(0, i3));
            localObject1 = ((String)localObject1).substring(i3 + 1);
            localObject5 = new String[i5];
            localObject6 = new String[i5];
            i3 = 0;
            while (i3 < i5)
            {
              i6 = ((String)localObject1).indexOf("=");
              i7 = ((String)localObject1).indexOf(":");
              i8 = ((String)localObject1).indexOf(",");
              localObject5[i3] = "";
              localObject6[i3] = "";
              str2 = ((String)localObject1).substring(0, i6);
              localObject5[i3] = ((String)localObject1).substring(i6 + 1, i7);
              localObject6[i3] = str2;
              localObject1 = ((String)localObject1).substring(i8 + 1);
              i3 += 1;
            }
            com.android.dazhihui.c.a.a.x[i2] = localObject4;
            com.android.dazhihui.c.a.a.v[i2] = localObject5;
            com.android.dazhihui.c.a.a.w[i2] = localObject6;
            com.android.dazhihui.ui.delegate.c.a.a((String)localObject4, (String[])localObject5, (String[])localObject6);
            com.android.dazhihui.ui.delegate.screen.otc.w.a((String)localObject4, (String[])localObject5, (String[])localObject6);
            com.android.dazhihui.ui.delegate.screen.newstock.a.a((String)localObject4, (String[])localObject5, (String[])localObject6);
            x.a((String)localObject4, (String[])localObject5, (String[])localObject6);
            GgtTradeMenu.a((String)localObject4, (String[])localObject5, (String[])localObject6);
            i2 += 1;
          }
          ((com.android.dazhihui.c.a.a)localObject3).a(30);
          ((com.android.dazhihui.c.a.a)localObject3).close();
          ((com.android.dazhihui.c.a.a)localObject3).a(31);
          ((com.android.dazhihui.c.a.a)localObject3).close();
          ((com.android.dazhihui.c.a.a)localObject3).a(32);
          ((com.android.dazhihui.c.a.a)localObject3).close();
          localObject1 = new com.android.dazhihui.ui.delegate.b.i();
          ((com.android.dazhihui.ui.delegate.b.i)localObject1).a(com.android.dazhihui.c.a.a.u);
          ((com.android.dazhihui.ui.delegate.b.i)localObject1).a(com.android.dazhihui.c.a.a.x);
          ((com.android.dazhihui.ui.delegate.b.i)localObject1).a(com.android.dazhihui.c.a.a.v);
          ((com.android.dazhihui.ui.delegate.b.i)localObject1).b(com.android.dazhihui.c.a.a.w);
          DzhApplication.a().b().a(this.q.c(), localObject1);
          localObject1 = (String[][])Array.newInstance(String.class, new int[] { i1, 3 });
          i2 = 0;
          while (i2 < i1)
          {
            localObject1[i2][0] = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2 + 1, "1021");
            localObject1[i2][1] = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2 + 1, "1019");
            localObject1[i2][2] = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2 + 1, "1394");
            i2 += 1;
          }
          com.android.dazhihui.ui.delegate.b.o.z = (String[][])localObject1;
          u();
          break label289;
          if (paramh == this.t)
          {
            localObject1 = ((v)paramj).b();
            if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, com.android.dazhihui.b.b.a().f()))
            {
              localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
              if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b())
              {
                r();
                return;
              }
              i3 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
              i1 = 0;
              if (i1 < i3)
              {
                localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1326");
                i2 = ((String)localObject1).indexOf(",");
                localObject3 = ((String)localObject1).substring(0, i2);
                localObject1 = ((String)localObject1).substring(i2 + 1);
                i2 = ((String)localObject1).indexOf(",");
                i4 = Integer.parseInt(((String)localObject1).substring(0, i2));
                localObject1 = ((String)localObject1).substring(i2 + 1);
                localObject4 = new String[i4];
                localObject5 = new String[i4];
                i2 = 0;
                while (i2 < i4)
                {
                  i5 = ((String)localObject1).indexOf("=");
                  i6 = ((String)localObject1).indexOf(":");
                  i7 = ((String)localObject1).indexOf(",");
                  localObject4[i2] = "";
                  localObject5[i2] = "";
                  localObject6 = ((String)localObject1).substring(0, i5);
                  localObject4[i2] = ((String)localObject1).substring(i5 + 1, i6);
                  localObject5[i2] = localObject6;
                  localObject1 = ((String)localObject1).substring(i7 + 1);
                  i2 += 1;
                }
                if (((String)localObject3).equals("11133"))
                {
                  com.android.dazhihui.ui.delegate.c.a.a = (String[])localObject4;
                  com.android.dazhihui.ui.delegate.c.a.b = (String[])localObject5;
                }
                for (;;)
                {
                  i1 += 1;
                  break;
                  if (((String)localObject3).equals("11105"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.c = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.d = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11147"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.e = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.f = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11135"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.g = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.h = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11141"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.i = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.j = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11143"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.k = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.l = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11149"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.m = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.n = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11151"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.o = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.p = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11165"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.E = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.F = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11125"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.q = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.r = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11927"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.s = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.t = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11917"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.u = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.v = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11909"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.w = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.x = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11913"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.y = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.z = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11907"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.A = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.B = (String[])localObject5;
                  }
                  else if (((String)localObject3).equals("11137"))
                  {
                    com.android.dazhihui.ui.delegate.c.a.C = (String[])localObject4;
                    com.android.dazhihui.ui.delegate.c.a.D = (String[])localObject5;
                  }
                }
              }
              r();
              break label289;
            }
            if (this.e != null)
            {
              this.e.d();
              this.e = null;
            }
            for (;;)
            {
              this.k = 0;
              w();
              a(this.q);
              break;
              t();
            }
          }
          if (paramh == this.u)
          {
            localObject1 = ((v)paramj).b();
            if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, com.android.dazhihui.b.b.a().f())) {
              break label289;
            }
            localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
            {
              paramh = Toast.makeText(com.android.dazhihui.b.b.a().f(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              if (this.e != null)
              {
                this.e.d();
                this.e = null;
              }
              for (;;)
              {
                this.k = 0;
                w();
                a(this.q);
                return;
                t();
              }
            }
            i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
            localObject2 = (String[][])Array.newInstance(String.class, new int[] { i2, 3 });
            i1 = 0;
            while (i1 < i2)
            {
              localObject2[i1][0] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1021");
              localObject2[i1][1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1019");
              localObject2[i1][2] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1394");
              i1 += 1;
            }
            com.android.dazhihui.ui.delegate.b.o.z = (String[][])localObject2;
            u();
            break label289;
          }
          if (paramh == this.w)
          {
            localObject1 = ((v)paramj).b();
            if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, com.android.dazhihui.b.b.a().f())) {
              break label289;
            }
            localObject3 = com.android.dazhihui.ui.delegate.b.g.c(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b())
            {
              paramh = Toast.makeText(com.android.dazhihui.b.b.a().f(), ((com.android.dazhihui.ui.delegate.b.h)localObject2).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              if (this.e != null)
              {
                this.e.d();
                this.e = null;
              }
              t();
              com.android.dazhihui.ui.delegate.b.o.a(null);
              w();
              return;
            }
            com.android.dazhihui.ui.delegate.c.d.e = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "21010");
            localObject4 = new com.android.dazhihui.ui.delegate.b.h(null).a("21010", com.android.dazhihui.ui.delegate.c.d.e).a("1205", "13").a("1207", ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1207")).a("1203", com.android.dazhihui.c.a.a.i[i1][0]);
            if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1005") == null)
            {
              localObject1 = "";
              com.android.dazhihui.ui.delegate.b.o.a(((com.android.dazhihui.ui.delegate.b.h)localObject4).a("1005", (String)localObject1).a("1016", ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1016")).a("1030", this.q.e()).a("6129", "10000").a("6130", com.android.dazhihui.ui.delegate.b.o.k).a("6131", com.android.dazhihui.ui.delegate.b.o.j).a("1202", "android " + com.android.dazhihui.g.a().r()).a("6183", h()));
              com.android.dazhihui.ui.delegate.b.o.a(((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1215"), ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1216"));
              bk.b("Y".equals(((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1308")));
              bk.a("Y".equals(((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "5007")));
              com.android.dazhihui.ui.delegate.c.d.a = this.q.d();
              com.android.dazhihui.ui.delegate.c.d.b = this.q.e();
              localObject4 = (String[][])Array.newInstance(String.class, new int[] { 1, 3 });
              i1 = 0;
              if (i1 >= localObject4.length) {
                break label4093;
              }
              localObject5 = localObject4[i1];
              if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1018") != null) {
                break label4055;
              }
              localObject1 = "";
              localObject5[0] = localObject1;
              localObject5 = localObject4[i1];
              if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1016") != null) {
                break label4068;
              }
              localObject1 = "";
              localObject5[1] = localObject1;
              localObject5 = localObject4[i1];
              if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1394") != null) {
                break label4080;
              }
            }
            for (localObject1 = "";; localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1394"))
            {
              localObject5[2] = localObject1;
              i1 += 1;
              break label3946;
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1005");
              break;
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1018");
              break label3976;
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1016");
              break label4002;
            }
            com.android.dazhihui.ui.delegate.b.o.z = (String[][])localObject4;
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1329");
            if ((localObject1 != null) && (!com.android.dazhihui.c.a.a.u.equals(localObject1)))
            {
              localObject4 = new com.android.dazhihui.c.a.a(com.android.dazhihui.b.b.a().f().getApplication());
              ((com.android.dazhihui.c.a.a)localObject4).close();
              com.android.dazhihui.c.a.a.u = (String)localObject1;
              ((com.android.dazhihui.c.a.a)localObject4).a(29);
              ((com.android.dazhihui.c.a.a)localObject4).close();
            }
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1331");
            if ((localObject1 == null) || (((String)localObject1).length() == 0))
            {
              q();
              break label289;
            }
            if (!((String)localObject1).substring(1, 2).equals("1"))
            {
              localObject1 = DzhApplication.a().b();
              localObject2 = new n(this);
              localObject1 = (com.android.dazhihui.ui.delegate.b.i)((com.android.dazhihui.c.b.a)localObject1).a(this.q.c(), (com.c.a.c.a)localObject2);
              if (localObject1 != null)
              {
                localObject2 = new com.android.dazhihui.c.a.a(com.android.dazhihui.b.b.a().f());
                ((com.android.dazhihui.c.a.a)localObject2).close();
                com.android.dazhihui.c.a.a.x = ((com.android.dazhihui.ui.delegate.b.i)localObject1).b();
                com.android.dazhihui.c.a.a.v = ((com.android.dazhihui.ui.delegate.b.i)localObject1).c();
                com.android.dazhihui.c.a.a.w = ((com.android.dazhihui.ui.delegate.b.i)localObject1).d();
                ((com.android.dazhihui.c.a.a)localObject2).a(30);
                ((com.android.dazhihui.c.a.a)localObject2).close();
                ((com.android.dazhihui.c.a.a)localObject2).a(31);
                ((com.android.dazhihui.c.a.a)localObject2).close();
                ((com.android.dazhihui.c.a.a)localObject2).a(32);
                ((com.android.dazhihui.c.a.a)localObject2).close();
              }
              i1 = 0;
              while (i1 < com.android.dazhihui.c.a.a.x.length)
              {
                localObject1 = com.android.dazhihui.c.a.a.x[i1];
                localObject1 = com.android.dazhihui.c.a.a.v[i1];
                localObject1 = com.android.dazhihui.c.a.a.w[i1];
                i1 += 1;
              }
              u();
              break label289;
            }
            i2 = 0;
            i3 = ((String)localObject3).indexOf("\00121000=");
            i1 = i2;
            if (i3 != -1)
            {
              i3 = ((String)localObject3).indexOf("\00121000=", i3 + 7) + 7;
              i4 = ((String)localObject3).indexOf("\001", i3);
              i1 = i2;
              if (i4 != -1)
              {
                i1 = i2;
                if (i4 > i3) {
                  i1 = com.android.dazhihui.d.a.c(((String)localObject3).substring(i3, i4).trim());
                }
              }
            }
            localObject3 = new com.android.dazhihui.c.a.a(com.android.dazhihui.b.b.a().f());
            ((com.android.dazhihui.c.a.a)localObject3).close();
            i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g() - i1 - 1;
            com.android.dazhihui.c.a.a.x = new String[i4];
            com.android.dazhihui.c.a.a.v = new String[i4][];
            com.android.dazhihui.c.a.a.w = new String[i4][];
            i2 = 0;
            while (i2 < i4)
            {
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2 + i1 + 1, "1326");
              i3 = ((String)localObject1).indexOf(",");
              localObject4 = ((String)localObject1).substring(0, i3);
              localObject1 = ((String)localObject1).substring(i3 + 1);
              i3 = ((String)localObject1).indexOf(",");
              i5 = Integer.parseInt(((String)localObject1).substring(0, i3));
              localObject1 = ((String)localObject1).substring(i3 + 1);
              localObject5 = new String[i5];
              localObject6 = new String[i5];
              i3 = 0;
              while (i3 < i5)
              {
                i6 = ((String)localObject1).indexOf("=");
                i7 = ((String)localObject1).indexOf(":");
                i8 = ((String)localObject1).indexOf(",");
                localObject5[i3] = "";
                localObject6[i3] = "";
                str2 = ((String)localObject1).substring(0, i6);
                localObject5[i3] = ((String)localObject1).substring(i6 + 1, i7);
                localObject6[i3] = str2;
                localObject1 = ((String)localObject1).substring(i8 + 1);
                i3 += 1;
              }
              com.android.dazhihui.c.a.a.x[i2] = localObject4;
              com.android.dazhihui.c.a.a.v[i2] = localObject5;
              com.android.dazhihui.c.a.a.w[i2] = localObject6;
              i2 += 1;
            }
            ((com.android.dazhihui.c.a.a)localObject3).a(30);
            ((com.android.dazhihui.c.a.a)localObject3).close();
            ((com.android.dazhihui.c.a.a)localObject3).a(31);
            ((com.android.dazhihui.c.a.a)localObject3).close();
            ((com.android.dazhihui.c.a.a)localObject3).a(32);
            ((com.android.dazhihui.c.a.a)localObject3).close();
            localObject1 = new com.android.dazhihui.ui.delegate.b.i();
            ((com.android.dazhihui.ui.delegate.b.i)localObject1).a(com.android.dazhihui.c.a.a.u);
            ((com.android.dazhihui.ui.delegate.b.i)localObject1).a(com.android.dazhihui.c.a.a.x);
            ((com.android.dazhihui.ui.delegate.b.i)localObject1).a(com.android.dazhihui.c.a.a.v);
            ((com.android.dazhihui.ui.delegate.b.i)localObject1).b(com.android.dazhihui.c.a.a.w);
            DzhApplication.a().b().a(this.q.c(), localObject1);
            u();
            break label289;
          }
          if (paramh == this.f)
          {
            localObject1 = new String(((com.android.dazhihui.a.b.g)paramj).a());
            localObject2 = new com.c.a.k();
            try
            {
              localObject2 = (AccessToken)((com.c.a.k)localObject2).a((String)localObject1, AccessToken.class);
              if (localObject2 != null)
              {
                com.android.dazhihui.ui.delegate.b.o.d = ((AccessToken)localObject2).getAccess_token();
                com.android.dazhihui.ui.delegate.b.o.f = ((AccessToken)localObject2).getRefresh_token();
              }
              if (com.android.dazhihui.ui.delegate.b.o.d == null) {
                break label4967;
              }
              com.android.dazhihui.ui.delegate.b.o.b = true;
              com.android.dazhihui.ui.delegate.c.d.a = this.q.d();
              com.android.dazhihui.ui.delegate.c.d.b = this.q.e();
              u();
              n();
            }
            catch (Exception localException1)
            {
              localException1.printStackTrace();
              com.android.dazhihui.b.b.a().f().getLoadingDialog().dismiss();
            }
            break label289;
            str1 = ((JSONObject)new JSONTokener(localException1).nextValue()).getString("error_info");
            if (this.e != null)
            {
              this.e.d();
              this.e = null;
              new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setTitle(str1).setPositiveButton(2131165363, new o(this)).show();
            }
            for (;;)
            {
              this.k = 0;
              w();
              a(this.q);
              return;
              t();
            }
          }
          if (paramh != this.n) {
            break label289;
          }
          String str1 = new String(((com.android.dazhihui.a.b.g)paramj).a());
          localObject2 = new com.c.a.k();
          try
          {
            localObject2 = (AccessToken)((com.c.a.k)localObject2).a(str1, AccessToken.class);
            if (localObject2 != null) {
              com.android.dazhihui.ui.delegate.b.o.e = ((AccessToken)localObject2).getAccess_token();
            }
            if (com.android.dazhihui.ui.delegate.b.o.e != null) {
              break label289;
            }
            str1 = ((JSONObject)new JSONTokener(str1).nextValue()).getString("error_info");
            Toast.makeText(com.android.dazhihui.b.b.a().f(), str1, 1).show();
          }
          catch (Exception localException2)
          {
            localException2.printStackTrace();
            com.android.dazhihui.b.b.a().f().getLoadingDialog().dismiss();
          }
          break label289;
          break;
          Toast.makeText(com.android.dazhihui.b.b.a().f(), localException2, 1).show();
          if (this.e != null)
          {
            this.e.d();
            this.e = null;
          }
          for (;;)
          {
            this.k = 0;
            w();
            a(this.q);
            return;
            t();
          }
        }
      }
      label5264:
      i9 = 1;
      int i11 = 0;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    if ((paramh == this.s) && (((boolean[])(boolean[])this.s.j())[1] == 0))
    {
      Log.e("trade", "request_D timeout");
      this.k = 0;
    }
    while ((paramh != this.s) && (paramh != this.v) && (paramh != this.t) && (paramh != this.u) && (paramh != this.f)) {
      return;
    }
    if (paramh == this.s) {
      a().i();
    }
    if (this.e != null)
    {
      this.e.d();
      this.e = null;
    }
    for (;;)
    {
      this.k = 0;
      w();
      a(this.q);
      return;
      t();
    }
  }
  
  public void i()
  {
    com.android.dazhihui.a.g.a().j();
  }
  
  public void j()
  {
    com.android.dazhihui.ui.delegate.b.o.u();
    d();
    this.j = false;
  }
  
  public int k()
  {
    return this.k;
  }
  
  public void l()
  {
    this.k = 0;
  }
  
  public void m()
  {
    Log.e("trade", "netStatusChangeSendTradeLogin");
    a(false, false);
  }
  
  public void n()
  {
    this.n = new com.android.dazhihui.a.b.e();
    this.n.c("http://sandbox.hs.net/oauth2/oauth2/token");
    this.n.b("UTF-8");
    this.n.a("Basic " + com.android.dazhihui.ui.delegate.b.o.l);
    this.n.a("grant_type", "client_credentials");
    this.n.a("code", "");
    this.n.a("username", "");
    this.n.a("password", "");
    this.n.a("open_id", "");
    this.n.a(this);
    com.android.dazhihui.a.g.a().a(this.n);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    if ((paramh == this.s) && (((boolean[])(boolean[])this.s.j())[1] == 0))
    {
      Log.e("trade", "request_D Exception:" + paramException.getMessage());
      this.k = 0;
    }
    while ((paramh != this.s) && (paramh != this.v) && (paramh != this.t) && (paramh != this.u) && (paramh != this.f)) {
      return;
    }
    if (paramh == this.s) {
      a().i();
    }
    if (this.e != null)
    {
      this.e.d();
      this.e = null;
    }
    for (;;)
    {
      this.k = 0;
      w();
      a(this.q);
      return;
      t();
    }
  }
  
  public void o()
  {
    Object localObject = new JinZhengRequestData();
    ((JinZhengRequestData)localObject).setService_id("600010");
    ((JinZhengRequestData)localObject).setType("Jinzheng_600010");
    ((JinZhengRequestData)localObject).setUser_id_cls("2");
    ((JinZhengRequestData)localObject).setUser_id(this.q.d());
    if (this.q.d().equals("10000910")) {
      com.android.dazhihui.ui.delegate.b.o.q = "16300";
    }
    for (;;)
    {
      ((JinZhengRequestData)localObject).setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
      String str = this.q.e();
      ((JinZhengRequestData)localObject).setUser_pwd(new KDEnCode().KDEncode(6, str, "410301"));
      ((JinZhengRequestData)localObject).setLogin_type(this.q.f());
      localObject = ((JinZhengRequestData)localObject).jinzhengJson();
      System.out.println("登陆请求数据" + (String)localObject);
      this.o = new t();
      this.o.c(com.android.dazhihui.a.f.Q);
      this.o.c("Content-Type", "application/json");
      try
      {
        localObject = new StringEntity((String)localObject, "UTF-8");
        this.o.a((HttpEntity)localObject);
        this.o.a(this);
        com.android.dazhihui.a.g.a().a(this.o);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
      if (this.q.d().equals("7600000088")) {
        com.android.dazhihui.ui.delegate.b.o.q = "11900";
      }
    }
  }
  
  public void p()
  {
    Object localObject;
    int i1;
    if (this.q != null)
    {
      localObject = this.q.c();
      Log.d("trade", "reLoginAndResetDelegateDispatch:qsnamestr=" + (String)localObject);
      System.out.println("trade  reLoginAndResetDelegateDispatch:qsnamestr=" + (String)localObject);
      i1 = com.android.dazhihui.ui.a.e.a().j();
      System.out.println("trade  reLoginAndResetDelegateDispatch:entrustIndex=" + i1);
      if (com.android.dazhihui.c.a.a.i != null) {
        i1 = 0;
      }
    }
    for (;;)
    {
      if (i1 < com.android.dazhihui.c.a.a.i.length)
      {
        if (!com.android.dazhihui.c.a.a.i[i1][2].equals(localObject)) {
          break label239;
        }
        com.android.dazhihui.ui.a.e.a().a(i1);
        if (TextUtils.isEmpty(com.android.dazhihui.c.a.a.B[i1][0])) {
          break label183;
        }
        com.android.dazhihui.g.a().a(com.android.dazhihui.c.a.a.B[i1], com.android.dazhihui.c.a.a.K[i1], null);
        com.android.dazhihui.ui.a.e.a().a(new d(this));
      }
      label183:
      do
      {
        return;
        localObject = com.android.dazhihui.d.n.a(com.android.dazhihui.c.a.a.D[i1], null);
      } while (TextUtils.isEmpty((CharSequence)localObject));
      localObject = com.android.dazhihui.d.n.d((String)localObject);
      com.android.dazhihui.a.g.a().d(false);
      com.android.dazhihui.g.a().f(localObject[0]);
      com.android.dazhihui.g.a().h(Integer.parseInt(localObject[1]));
      b(false);
      return;
      label239:
      i1 += 1;
    }
  }
  
  public void q()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.c.a.a();
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("12064");
    int i1 = com.android.dazhihui.ui.a.e.a().j();
    if (com.android.dazhihui.c.a.a.i[i1][2].contains("湘财证券")) {
      localh.a("1325", "6,11917,11909,11913,11907,11165,11927");
    }
    for (;;)
    {
      this.t = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      this.t.a(this);
      com.android.dazhihui.a.g.a().a(this.t);
      return;
      localh.a("1325", "16,11105,11133,11135,11141,11143,11137,11147,11151,11125,11149,11917,11909,11913,11907,11165,11927");
    }
  }
  
  public void r()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.u = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11154").a("1206", "0").a("1277", "40").h()) });
    this.u.a(this);
    com.android.dazhihui.a.g.a().a(this.u);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */