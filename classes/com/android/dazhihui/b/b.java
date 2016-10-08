package com.android.dazhihui.b;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.bh;
import com.android.dazhihui.ui.model.stock.PublicWidomMessageVo;
import com.android.dazhihui.ui.model.stock.WarningItem;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.stock.AddWarningActivity;
import com.android.dazhihui.ui.screen.stock.SystemSetingScreen;
import com.android.dazhihui.ui.screen.stock.TipActivity;
import com.android.dazhihui.w;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{
  private static b a = null;
  private Context b;
  private com.android.dazhihui.ui.a.m c = com.android.dazhihui.ui.a.m.a();
  private List<BaseActivity> d = new ArrayList();
  private BaseActivity e = null;
  private com.android.dazhihui.a.b.m f = null;
  private List<g> g = new ArrayList();
  private List<h> h = new ArrayList();
  private List<l> i = new ArrayList();
  private List<k> j = new ArrayList();
  private List<k> k = new ArrayList();
  private List<i> l = new ArrayList();
  private List<PublicWidomMessageVo> m = new ArrayList();
  private List<j> n = new ArrayList();
  private PublicWidomMessageVo o;
  private boolean p = false;
  private Handler q = new f(this, Looper.getMainLooper());
  
  public static b a()
  {
    if (a == null) {
      a = new b();
    }
    return a;
  }
  
  private void a(q paramq)
  {
    a locala = a.a();
    int i1 = paramq.b();
    if (i1 == 0)
    {
      int i2 = paramq.e();
      i1 = 0;
      if (i1 < i2)
      {
        switch (paramq.b())
        {
        }
        for (;;)
        {
          com.android.dazhihui.d.n.a("", 1080);
          i1 += 1;
          break;
          h localh = new h();
          localh.d = ((byte)paramq.b());
          localh.a = paramq.h();
          localh.c = paramq.l();
          localh.b = paramq.l();
          localh.e = paramq.l();
          localh.f = paramq.l();
          localh.g = System.currentTimeMillis();
          a(localh, true);
          locala.a(localh);
        }
      }
    }
    else if (i1 == 1)
    {
      paramq.h();
      paramq.l();
    }
  }
  
  private void b(q paramq)
  {
    a locala = a.a();
    int i1 = paramq.b();
    if (i1 == 0)
    {
      paramq = paramq.l();
      JSONObject localJSONObject;
      int i2;
      Object localObject;
      try
      {
        localJSONObject = new JSONObject(paramq);
        paramq = localJSONObject.optString("msg");
        i1 = localJSONObject.optInt("MsgType");
        localJSONObject.optString("MsgSubType");
        i2 = localJSONObject.optInt("md");
        localJSONObject = localJSONObject.optJSONObject("Param");
        if ((i1 == 1) || (i1 == 3))
        {
          localObject = new k();
          ((k)localObject).a = i2;
          ((k)localObject).b = localJSONObject.optString("rt");
          ((k)localObject).c = localJSONObject.optInt("ty");
          ((k)localObject).d = localJSONObject.optString("url");
          ((k)localObject).e = localJSONObject.optString("code");
          ((k)localObject).g = System.currentTimeMillis();
          ((k)localObject).f = paramq;
          if ((((k)localObject).c >= 1) && (((k)localObject).c <= 8)) {
            return;
          }
          if (((k)localObject).c != 9) {
            return;
          }
          ((k)localObject).h = 0;
          a((k)localObject, true);
          locala.a((k)localObject);
          return;
        }
      }
      catch (JSONException paramq)
      {
        paramq.printStackTrace();
        return;
      }
      if (i1 == 5)
      {
        localObject = new h();
        ((h)localObject).a = i2;
        ((h)localObject).d = 1;
        ((h)localObject).e = localJSONObject.optString("url");
        ((h)localObject).f = paramq;
        ((h)localObject).g = System.currentTimeMillis();
        a((h)localObject, true);
        locala.a((h)localObject);
      }
    }
    else if (i1 == 1)
    {
      i1 = paramq.h();
      paramq = paramq.l();
      b("error code:" + i1 + "  error message:" + paramq);
    }
  }
  
  private void c(o paramo)
  {
    Object localObject2 = paramo.h();
    if ((localObject2 == null) || (((p)localObject2).b == null) || (((p)localObject2).b.length == 0)) {}
    label179:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              localObject1 = new q(((p)localObject2).b);
              if (((p)localObject2).a != 2907) {
                break label179;
              }
              paramo.c(true);
              i1 = ((q)localObject1).b();
              if (i1 != 1) {
                break;
              }
              paramo = new Intent();
              paramo.addFlags(268435456);
              paramo.setClass(this.b, TipActivity.class);
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("type", 10);
              paramo.putExtras((Bundle)localObject1);
              this.b.startActivity(paramo);
            } while (DzhApplication.a() == null);
            w.a().r();
            SystemSetingScreen.b();
            w.a().b(com.android.dazhihui.c.b);
            com.android.dazhihui.a.g.a().x();
            DzhApplication.a().i();
            return;
          } while (i1 != 2);
          com.android.dazhihui.a.g.a().x();
          com.android.dazhihui.a.g.a().n();
          return;
          if (((p)localObject2).a != 2946) {
            break;
          }
          paramo.c(true);
        } while (((p)localObject2).b.length == 0);
        this.c.h(((q)localObject1).h());
        paramo = com.android.dazhihui.c.a.d.a();
        paramo.a("WARNING_ID", this.c.l());
        paramo.g();
        localObject1 = ((q)localObject1).l();
        paramo = (o)localObject1;
        if (localObject1 == null) {
          paramo = "";
        }
        localObject1 = new Intent();
        ((Intent)localObject1).setClass(this.b, TipActivity.class);
        localObject2 = new Bundle();
        ((Bundle)localObject2).putInt("type", 100);
        ((Bundle)localObject2).putString("information", paramo);
        ((Intent)localObject1).putExtras((Bundle)localObject2);
        this.b.startActivity((Intent)localObject1);
        return;
        if (((p)localObject2).a == 2948)
        {
          paramo.c(true);
          return;
        }
        if (((w.a().c() >>> 11 & 1L) != 0L) && (((p)localObject2).a == 2952))
        {
          paramo.c(true);
          return;
        }
        if (((p)localObject2).a != 2978) {
          break;
        }
        paramo.c(true);
      } while (this.f == null);
      com.android.dazhihui.a.g.a().a(this.f, paramo);
      localObject1 = this.f.u();
      if (((Handler)localObject1).hasMessages(2)) {
        ((Handler)localObject1).removeMessages(2);
      }
      localObject2 = Message.obtain();
      ((Message)localObject2).what = 2;
      ((Message)localObject2).obj = paramo;
      ((Handler)localObject1).sendMessageDelayed((Message)localObject2, 10L);
      return;
      if (((p)localObject2).a == 2988)
      {
        paramo.c(true);
        com.android.dazhihui.ui.a.a.c().a(paramo);
        return;
      }
    } while ((((p)localObject2).a != 2996) || (((p)localObject2).b.length == 0));
    int i1 = ((q)localObject1).h();
    paramo = this.b.getSharedPreferences("wisdomCrc", 0);
    Object localObject1 = ((q)localObject1).l();
    paramo.edit().putInt("wisdomCrc", i1).commit();
    com.android.dazhihui.d.n.d("pushMessage", "2996---------->" + (String)localObject1);
    a((String)localObject1);
  }
  
  private void c(String paramString)
  {
    bh.a(this.b, this.b.getString(2131166268), paramString, this.b.getString(2131165940), this.b.getString(2131165331), new c(this), new d(this), new e(this)).show();
  }
  
  private void d(o paramo)
  {
    p localp = paramo.h();
    if ((localp == null) || (localp.b == null) || (localp.b.length == 0)) {}
    Object localObject2;
    Object localObject1;
    int i1;
    int i2;
    int i3;
    label228:
    do
    {
      do
      {
        return;
        localObject2 = a.a();
        localObject1 = new q(localp.b);
        if (localp.a == 2963)
        {
          i1 = ((q)localObject1).e();
          i2 = ((q)localObject1).b();
          i3 = ((q)localObject1).b();
          int i4 = ((q)localObject1).b();
          int i5 = ((q)localObject1).b();
          int i6 = ((q)localObject1).b();
          this.c.n(i1);
          this.c.k(i2);
          this.c.l(i3);
          this.c.m(i4);
          this.c.o(i5);
          this.c.p(i6);
          localObject1 = Calendar.getInstance();
          ((Calendar)localObject1).set(i1, i2 - 1, i3, i4, i5, i6);
          this.c.a(((Calendar)localObject1).getTimeInMillis());
          paramo.c(true);
          return;
        }
        if (localp.a != 3001) {
          break;
        }
        paramo.c(true);
        i1 = ((q)localObject1).b();
      } while ((i1 == 0) || (i1 == 1));
      if (i1 != 2) {
        break;
      }
      i1 = 0;
      i2 = ((q)localObject1).e();
    } while (((q)localObject1).e() == 2);
    ((q)localObject1).e();
    this.c.c(((q)localObject1).h());
    switch (i2)
    {
    default: 
      i1 = 1;
    }
    while (i1 == 0)
    {
      break label228;
      if (((q)localObject1).b() == 0)
      {
        ((q)localObject1).b();
        this.c.b(((q)localObject1).b());
        this.c.I();
        continue;
        i2 = ((q)localObject1).b();
        if (i2 == 0)
        {
          ((q)localObject1).h();
          a(2131165254);
          if ((this.e != null) && ((this.e instanceof AddWarningActivity)))
          {
            this.e.finish();
            this.c.C();
          }
        }
        else if (i2 == 1)
        {
          paramo = ((q)localObject1).l();
          if (this.e != null) {
            this.e.showShortToast(this.b.getResources().getString(2131165253) + paramo);
          }
          continue;
          i2 = ((q)localObject1).b();
          if (i2 == 0)
          {
            this.c.C();
            continue;
          }
          if (i2 == 1)
          {
            b(((q)localObject1).l());
            continue;
            continue;
            i2 = ((q)localObject1).b();
            if (i2 == 0)
            {
              i3 = ((q)localObject1).e();
              if (i3 < 0) {
                break;
              }
              this.c.f();
              paramo = new ArrayList();
              i2 = 0;
              if (i2 < i3)
              {
                localObject2 = new WarningItem();
                ((WarningItem)localObject2).setmWarningId(((q)localObject1).h());
                ((WarningItem)localObject2).setmWarningCode(((q)localObject1).l());
                ((WarningItem)localObject2).setmWarningName(((q)localObject1).l());
                ((WarningItem)localObject2).setmOverPrice(((q)localObject1).i());
                ((WarningItem)localObject2).setmBelowPrice(((q)localObject1).i());
                ((WarningItem)localObject2).setmDayIncrease(((q)localObject1).i());
                ((WarningItem)localObject2).setmDayIncreaseNum(((q)localObject1).b());
                ((WarningItem)localObject2).setmDayFall(((q)localObject1).i());
                ((WarningItem)localObject2).setmDayFallNum(((q)localObject1).b());
                ((WarningItem)localObject2).setmDayHandOver(((q)localObject1).i());
                ((WarningItem)localObject2).setmDayHandOverNum(((q)localObject1).b());
                ((WarningItem)localObject2).setmDayLandMine(((q)localObject1).b());
                ((WarningItem)localObject2).setmDecimalNum(((q)localObject1).b());
                if (((WarningItem)localObject2).isWarningValid()) {
                  this.c.b((WarningItem)localObject2);
                }
                for (;;)
                {
                  i2 += 1;
                  break;
                  paramo.add(Integer.valueOf(((WarningItem)localObject2).getmWarningId()));
                }
              }
              if (paramo.size() > 0)
              {
                localObject2 = new int[paramo.size()];
                i2 = 0;
                while (i2 < paramo.size())
                {
                  localObject2[i2] = ((Integer)paramo.get(i2)).intValue();
                  i2 += 1;
                }
                a((int[])localObject2);
              }
              if (this.e != null) {}
              continue;
            }
            if (i2 == 1)
            {
              b(((q)localObject1).l());
              continue;
              i2 = ((q)localObject1).b();
              if (i2 == 0)
              {
                a(2131165440);
                if ((this.e instanceof AddWarningActivity))
                {
                  this.e.finish();
                  this.c.C();
                  this.c.E();
                }
              }
              else if (i2 == 1)
              {
                b(((q)localObject1).l());
                continue;
                this.c.c(0);
                ((q)localObject1).b();
                continue;
                continue;
                i2 = ((q)localObject1).b();
                if (com.android.dazhihui.g.a().L())
                {
                  if (i2 == 0)
                  {
                    a(2131166390);
                    continue;
                  }
                  if (i2 == 1)
                  {
                    ((q)localObject1).h();
                    b(((q)localObject1).l());
                    continue;
                    a((q)localObject1);
                    continue;
                    b((q)localObject1);
                    continue;
                    i2 = ((q)localObject1).b();
                    if (i2 == 0)
                    {
                      paramo = ((q)localObject1).l();
                      System.out.println(paramo);
                      continue;
                    }
                    if (i2 == 1)
                    {
                      i2 = ((q)localObject1).h();
                      paramo = ((q)localObject1).l();
                      System.out.println("error code:   " + i2 + "     message:    " + paramo);
                      continue;
                      try
                      {
                        i2 = ((q)localObject1).b();
                        if (i2 == 0) {
                          this.c.a(true);
                        }
                      }
                      catch (Exception paramo)
                      {
                        for (;;)
                        {
                          paramo.printStackTrace();
                          i2 = -1;
                        }
                        this.c.a(false);
                      }
                      continue;
                      try
                      {
                        if (((q)localObject1).b() == 0) {
                          this.c.j(((q)localObject1).h());
                        } else {
                          this.c.j(0);
                        }
                      }
                      catch (Exception paramo) {}
                      continue;
                      if (i1 != 3) {
                        break;
                      }
                      for (;;)
                      {
                        i1 = ((q)localObject1).e();
                        if (((q)localObject1).e() == 2) {
                          break;
                        }
                        ((q)localObject1).e();
                        this.c.c(((q)localObject1).h());
                        if (i1 == 304)
                        {
                          paramo = new l();
                          paramo.a = ((q)localObject1).h();
                          this.c.i(paramo.a);
                          paramo.b = ((q)localObject1).l();
                          paramo.c = ((q)localObject1).l();
                          paramo.d = ((q)localObject1).l();
                          paramo.e = System.currentTimeMillis();
                          a(paramo, true);
                          ((a)localObject2).a(paramo);
                          com.android.dazhihui.d.n.a("", 1080);
                          this.c.C();
                        }
                        else if (i1 == 310)
                        {
                          paramo = new h();
                          paramo.a = ((q)localObject1).h();
                          paramo.d = ((byte)((q)localObject1).b());
                          paramo.e = ((q)localObject1).l();
                          paramo.f = ((q)localObject1).l();
                          paramo.g = System.currentTimeMillis();
                          a(paramo, true);
                          ((a)localObject2).a(paramo);
                          com.android.dazhihui.d.n.a("", 1080);
                        }
                        else
                        {
                          if (i1 != 512) {
                            break;
                          }
                          b((q)localObject1);
                        }
                      }
                      if ((this.c.k() != 0) || (localp.a != 2602)) {
                        break;
                      }
                      i1 = ((q)localObject1).e();
                      i2 = ((q)localObject1).e();
                      if (i1 == 0) {
                        break;
                      }
                      if (com.android.dazhihui.g.a().W() == -1)
                      {
                        if (com.android.dazhihui.g.a().X() == i2) {
                          break;
                        }
                        com.android.dazhihui.g.a().l(i2);
                      }
                      paramo = ((q)localObject1).m();
                      i1 = paramo.length - 1;
                      while (i1 >= 0)
                      {
                        paramo[i1] = com.android.dazhihui.d.n.a(paramo[i1]);
                        i1 -= 1;
                      }
                      c(paramo[0]);
                      return;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void a(byte paramByte)
  {
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).a(paramByte);
    }
  }
  
  public void a(int paramInt)
  {
    Toast.makeText(this.b, paramInt, 0).show();
  }
  
  public void a(Context paramContext)
  {
    this.b = paramContext;
    a.a().a(this.b);
  }
  
  public void a(com.android.dazhihui.a.b.m paramm)
  {
    this.f = paramm;
  }
  
  public void a(o paramo)
  {
    Message localMessage = Message.obtain();
    localMessage.what = 0;
    localMessage.obj = paramo;
    this.q.sendMessage(localMessage);
  }
  
  public void a(g paramg, boolean paramBoolean)
  {
    com.android.dazhihui.d.n.a("", 20027);
    this.g.add(paramg);
    com.android.dazhihui.c.a.d.a().a(paramg);
    com.android.dazhihui.c.a.d.a().g();
    if (paramBoolean) {
      a((byte)5);
    }
  }
  
  public void a(h paramh, boolean paramBoolean)
  {
    com.android.dazhihui.d.n.a("", 20027);
    this.h.add(paramh);
    com.android.dazhihui.c.a.d.a().a(paramh);
    com.android.dazhihui.c.a.d.a().g();
    if (paramBoolean) {
      a((byte)2);
    }
  }
  
  public void a(i parami)
  {
    if ((parami != null) && (!this.l.contains(parami))) {
      this.l.add(parami);
    }
  }
  
  public void a(j paramj)
  {
    if ((paramj != null) && (!this.n.contains(paramj))) {
      this.n.add(paramj);
    }
  }
  
  public void a(k paramk, boolean paramBoolean)
  {
    com.android.dazhihui.d.n.a("", 20026);
    this.j.add(paramk);
    com.android.dazhihui.c.a.d.a().a(paramk);
    com.android.dazhihui.c.a.d.a().g();
    if (paramBoolean) {
      a((byte)0);
    }
  }
  
  public void a(l paraml, boolean paramBoolean)
  {
    com.android.dazhihui.d.n.a("", 20031);
    this.i.add(paraml);
    com.android.dazhihui.c.a.d.a().a(paraml);
    com.android.dazhihui.c.a.d.a().g();
    if (paramBoolean) {
      a((byte)1);
    }
  }
  
  public void a(BaseActivity paramBaseActivity)
  {
    this.d.add(paramBaseActivity);
    c(paramBaseActivity);
  }
  
  public void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      try
      {
        paramString = new JSONObject(paramString);
        if (paramString.getJSONObject("header").getString("type").equals("1"))
        {
          paramString = paramString.getJSONObject("data");
          PublicWidomMessageVo localPublicWidomMessageVo = new PublicWidomMessageVo();
          localPublicWidomMessageVo.setNewsTime(paramString.getString("newsTime"));
          localPublicWidomMessageVo.setTitle(paramString.getString("title"));
          localPublicWidomMessageVo.setUrl_page(paramString.getString("urlPage"));
          localPublicWidomMessageVo.setUrl_list(paramString.getString("urlList"));
          localPublicWidomMessageVo.setType(0);
          this.o = localPublicWidomMessageVo;
          this.m.add(this.o);
          DzhApplication.a().b().a("wisdomMessage", this.o);
          s();
          return;
        }
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    x localx1 = new x(3001);
    localx1.b(2);
    x localx2 = new x(301);
    localx2.a("");
    localx2.a("");
    String str = w.a().k();
    if ((TextUtils.isEmpty(str)) || (str.length() < 11)) {
      localx2.a("");
    }
    for (;;)
    {
      localx2.a(w.a().n());
      localx2.a(com.android.dazhihui.g.a().v());
      localx2.b(3);
      localx2.a(com.android.dazhihui.g.a().r());
      localx2.b(paramArrayOfInt);
      localx1.a(localx2, this.c.h());
      paramArrayOfInt = new com.android.dazhihui.a.b.m(localx1, com.android.dazhihui.a.b.n.d);
      com.android.dazhihui.a.g.a().a(paramArrayOfInt);
      return;
      localx2.a(str);
    }
  }
  
  public void b()
  {
    this.f = null;
  }
  
  public void b(byte paramByte)
  {
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).b(paramByte);
    }
  }
  
  public void b(int paramInt)
  {
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      if (locall.a == paramInt) {
        this.i.remove(locall);
      }
    }
  }
  
  public void b(o paramo)
  {
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.obj = paramo;
    this.q.sendMessage(localMessage);
  }
  
  public void b(i parami)
  {
    if ((parami != null) && (this.l.contains(parami))) {
      this.l.remove(parami);
    }
  }
  
  public void b(j paramj)
  {
    if ((paramj != null) && (this.n.contains(paramj))) {
      this.n.remove(paramj);
    }
  }
  
  public void b(k paramk, boolean paramBoolean)
  {
    com.android.dazhihui.d.n.a("", 20028);
    this.k.add(paramk);
    com.android.dazhihui.c.a.d.a().a(paramk);
    com.android.dazhihui.c.a.d.a().g();
    if (paramBoolean) {
      a((byte)3);
    }
  }
  
  public void b(BaseActivity paramBaseActivity)
  {
    this.d.remove(paramBaseActivity);
  }
  
  public void b(String paramString)
  {
    Toast.makeText(this.b, paramString, 0).show();
  }
  
  public PublicWidomMessageVo c()
  {
    return this.o;
  }
  
  public void c(int paramInt)
  {
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.a == paramInt) {
        this.h.remove(localh);
      }
    }
  }
  
  public void c(BaseActivity paramBaseActivity)
  {
    this.e = paramBaseActivity;
  }
  
  public List<PublicWidomMessageVo> d()
  {
    return this.m;
  }
  
  public List<h> d(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.d == paramInt) {
        localArrayList.add(localh);
      }
    }
    return localArrayList;
  }
  
  public void e()
  {
    Object localObject = new ArrayList();
    ((List)localObject).addAll(this.d);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      BaseActivity localBaseActivity = (BaseActivity)((Iterator)localObject).next();
      if ((localBaseActivity != null) && (!localBaseActivity.isFinishing())) {
        localBaseActivity.finish();
      }
    }
    if (this.d != null) {
      this.d.clear();
    }
    this.e = null;
  }
  
  public void e(int paramInt)
  {
    int i2;
    for (int i1 = 0; i1 < this.h.size(); i1 = i2 + 1)
    {
      i2 = i1;
      if (((h)this.h.get(i1)).d == paramInt)
      {
        this.h.remove(i1);
        i2 = i1 - 1;
      }
    }
  }
  
  public BaseActivity f()
  {
    return this.e;
  }
  
  public List<l> g()
  {
    return this.i;
  }
  
  public int h()
  {
    return this.i.size();
  }
  
  public void i()
  {
    this.i.clear();
  }
  
  public void j()
  {
    this.g.clear();
  }
  
  public void k()
  {
    this.h.clear();
  }
  
  public List<h> l()
  {
    return this.h;
  }
  
  public void m()
  {
    this.j.clear();
  }
  
  public int n()
  {
    return this.j.size();
  }
  
  public List<k> o()
  {
    return this.j;
  }
  
  public void p()
  {
    this.k.clear();
  }
  
  public List<k> q()
  {
    return this.k;
  }
  
  public boolean r()
  {
    return (this.h.size() > 0) || (this.i.size() > 0) || (this.j.size() > 0) || (this.k.size() > 0);
  }
  
  public void s()
  {
    if (this.p) {}
    while ((this.o == null) || (this.o.getType() == 1)) {
      return;
    }
    Iterator localIterator = this.n.iterator();
    while (localIterator.hasNext()) {
      ((j)localIterator.next()).a(this.o);
    }
    a((byte)100);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */