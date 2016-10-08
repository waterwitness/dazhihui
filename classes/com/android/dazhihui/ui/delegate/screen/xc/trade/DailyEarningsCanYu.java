package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.otc.TradeBrowser;
import com.android.dazhihui.ui.screen.stock.TipActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.ArrayList;

public class DailyEarningsCanYu
  extends DelegateBaseActivity
  implements cp, cs
{
  private com.android.dazhihui.a.b.u A;
  private com.android.dazhihui.a.b.u B;
  private DzhHeader a;
  private Button b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String m;
  private String n = "0";
  private String o;
  private ArrayList<ae> p;
  private String q;
  private String r;
  private y s;
  private float t;
  private boolean u;
  private com.android.dazhihui.a.b.u v;
  private com.android.dazhihui.a.b.u w;
  private com.android.dazhihui.a.b.u x;
  private com.android.dazhihui.a.b.u y;
  private com.android.dazhihui.a.b.u z;
  
  private void a()
  {
    if (!o.r()) {
      return;
    }
    this.w = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11926").a("1206", "").a("1277", "").a("2315", "0").h()) });
    registRequestListener(this.w);
    a(this.w, true);
  }
  
  private void a(ae paramae)
  {
    if (!o.r()) {
      return;
    }
    this.B = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12384").a("1090", n.t(this.o)).a("1115", n.t(this.h)).a("1868", n.t(paramae.b)).a("1800", n.t(this.c)).a("2315", "2").h()) });
    registRequestListener(this.B);
    a(this.B, true);
  }
  
  private void a(Object paramObject)
  {
    ae localae = (ae)paramObject;
    String str = localae.c;
    if (localae.c.equals("0")) {
      a((ae)paramObject);
    }
    while (!localae.c.equals("1")) {
      return;
    }
    paramObject = localae.d;
    if ((!((String)paramObject).contains("http://")) && (!((String)paramObject).contains("https://")))
    {
      TradeBrowser.a(this, "http://" + (String)paramObject);
      return;
    }
    TradeBrowser.a(this, (String)paramObject);
  }
  
  private void b()
  {
    if (!o.r()) {
      return;
    }
    this.A = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12386").a("1090", n.t(this.o)).a("1115", n.t(this.h)).a("1026", "0").a("1800", n.t(this.c)).a("2315", "0").h()) });
    registRequestListener(this.A);
    a(this.A, true);
  }
  
  private void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.x = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12382").a("1026", "").a("6002", "").a("1552", "0").a("1750", "").h()) });
    registRequestListener(this.x);
    a(this.x, paramBoolean);
  }
  
  private void c(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.y = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12304").a("1042", n.t(this.q)).a("1026", "0").a("1023", "").a("1737", "1000").a("1800", n.t(this.d)).a("1090", n.t(this.e)).a("1522", "").a("1115", "").a("2002", "").a("1025", "").h()) });
    registRequestListener(this.y);
    a(this.y, paramBoolean);
  }
  
  private void d(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.z = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12298").a("1552", "").h()) });
    registRequestListener(this.z);
    a(this.z, paramBoolean);
  }
  
  public static ArrayList<ae> e(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.split("\\" + String.valueOf('\002'), -1);
    int i1 = paramString.length / 4;
    int k = 0;
    while (k < i1)
    {
      ae localae = new ae();
      localae.a = paramString[(k * 4 + 0)];
      localae.b = paramString[(k * 4 + 1)];
      localae.c = paramString[(k * 4 + 2)];
      localae.d = paramString[(k * 4 + 3)];
      localArrayList.add(localae);
      k += 1;
    }
    return localArrayList;
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      finish();
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "0").a("1234", "0").h()) });
    registRequestListener(this.v);
    a(this.v, paramBoolean);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "余额增值";
    paramct.p = this;
  }
  
  public void d(String paramString)
  {
    this.p = e(paramString);
    int i1 = this.p.size();
    paramString = new String[i1];
    int k = 0;
    while (k < i1)
    {
      paramString[k] = ((ae)this.p.get(k)).a;
      k += 1;
    }
    this.s = new y(this, paramString, "同意签署", "取消");
    this.s.requestWindowFeature(1);
    this.s.show();
    this.s.a(new ad(this));
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    Object localObject;
    int i1;
    int k;
    label82:
    String str;
    if (paramh == this.v)
    {
      localObject = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, this))
      {
        localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
        {
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
        i1 = ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
        if (i1 > 0)
        {
          k = 0;
          if (k >= i1) {
            break label1141;
          }
          str = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(k, "1415");
          if ((str == null) || (!str.equals("1"))) {
            break label201;
          }
        }
      }
    }
    for (;;)
    {
      this.g = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(k, "1079");
      this.t = Float.parseFloat(this.g);
      if (paramh == this.z)
      {
        localObject = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, this))
        {
          localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
          {
            paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
            label201:
            k += 1;
            break label82;
          }
          this.q = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1042");
          this.i = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1115");
          this.j = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1011");
          this.m = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1946");
          this.e = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1090");
          this.d = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1800");
          a();
        }
      }
      if (paramh == this.w)
      {
        localObject = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, this))
        {
          localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
          {
            paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
          i1 = ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
          if (i1 == 0) {
            this.n = "0";
          }
          if (i1 > 0)
          {
            k = 0;
            label369:
            if (k < i1)
            {
              str = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(k, "1115");
              if (!this.i.equals(str)) {
                break label511;
              }
              this.n = "1";
            }
          }
          if (!this.n.equals("0")) {
            break label520;
          }
          localObject = new Bundle();
          ((Bundle)localObject).putInt("type", 6);
          ((Bundle)localObject).putBoolean("XcPt", true);
          startActivity(TipActivity.class, (Bundle)localObject);
        }
      }
      for (;;)
      {
        if (paramh == this.x)
        {
          localObject = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, this))
          {
            localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
            {
              paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
              label511:
              k += 1;
              break label369;
              label520:
              if (!this.n.equals("1")) {
                continue;
              }
              if (this.m.equals("未签署"))
              {
                b(true);
                continue;
              }
              if (!this.m.equals("已签署")) {
                continue;
              }
              if (this.j.equals("1"))
              {
                localObject = new Intent();
                ((Intent)localObject).setClass(this, DailyEarning.class);
                startActivity((Intent)localObject);
                continue;
              }
              if (!this.j.equals("0")) {
                continue;
              }
              if (this.t < 51000.0F)
              {
                localObject = new Intent();
                ((Intent)localObject).setClass(this, MyDailyEarning.class);
                startActivity((Intent)localObject);
                continue;
              }
              c(true);
              continue;
            }
            if (((com.android.dazhihui.ui.delegate.b.h)localObject).g() == 0) {
              break;
            }
            ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1819");
            ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1021");
            ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1862");
            ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1043");
            this.o = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1090");
            this.h = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1115");
            ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1864");
            ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1865");
            ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1866");
            this.f = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1867");
            this.c = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1800");
            if (this.f != null) {
              d(this.f);
            }
          }
        }
      }
      if (paramh == this.A)
      {
        localObject = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, this))
        {
          localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
          {
            this.s.dismiss();
            d(this.f);
            c(((com.android.dazhihui.ui.delegate.b.h)localObject).d());
            return;
          }
          this.s.dismiss();
          localObject = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1208"), 0);
          ((Toast)localObject).setGravity(17, 0, 0);
          ((Toast)localObject).show();
          if (!this.j.equals("1")) {
            break label981;
          }
          localObject = new Intent();
          ((Intent)localObject).setClass(this, DailyEarning.class);
          startActivity((Intent)localObject);
        }
      }
      while (paramh == this.y)
      {
        localObject = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, this))
        {
          localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
          {
            paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
            label981:
            if (this.j.equals("0")) {
              if (this.t < 51000.0F)
              {
                localObject = new Intent();
                ((Intent)localObject).setClass(this, MyDailyEarning.class);
                startActivity((Intent)localObject);
              }
              else
              {
                c(true);
              }
            }
          }
          else
          {
            finish();
            localObject = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1208"), 0);
            ((Toast)localObject).setGravity(17, 0, 0);
            ((Toast)localObject).show();
            localObject = new Intent();
            ((Intent)localObject).setClass(this, DailyEarning.class);
            startActivity((Intent)localObject);
          }
        }
      }
      if (paramh != this.B) {
        break;
      }
      paramh = ((v)paramj).b();
      if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {
        break;
      }
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!paramh.b()) {
        break;
      }
      c(paramh.a(0, "1208"));
      return;
      label1141:
      k = 0;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903086);
    paramBundle = (AdvertView)findViewById(2131558772);
    paramBundle.setAdvCode(117);
    a(paramBundle);
    a(false);
    paramBundle = getIntent().getExtras();
    this.u = paramBundle.getBoolean("fromGP");
    if (!this.u)
    {
      this.r = paramBundle.getString("kaihu");
      if ((this.r != null) && (!this.r.equals("")) && (this.r.equals("success"))) {
        d(true);
      }
    }
    this.a = ((DzhHeader)findViewById(2131558567));
    this.a.a(this, this);
    this.b = ((Button)findViewById(2131558773));
    this.b.setOnClickListener(new ac(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\DailyEarningsCanYu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */