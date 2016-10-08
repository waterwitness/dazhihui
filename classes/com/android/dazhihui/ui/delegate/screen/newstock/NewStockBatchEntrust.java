package com.android.dazhihui.ui.delegate.screen.newstock;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.electronsign.CashBaoElectronSign;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.k;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class NewStockBatchEntrust
  extends DelegateBaseActivity
  implements cp, cs
{
  Hashtable<String, String> a;
  Hashtable<String, String> b;
  private ListView c;
  private Button d;
  private Button e;
  private Button f;
  private com.android.dazhihui.a.b.u g;
  private com.android.dazhihui.a.b.u h;
  private List<n> i;
  private j j;
  private com.android.dazhihui.ui.delegate.b.h m;
  private String n = "";
  private String o = "";
  private boolean p = false;
  private DzhHeader q;
  private com.android.dazhihui.a.b.u r = null;
  private com.android.dazhihui.a.b.u s = null;
  private com.android.dazhihui.a.b.u t = null;
  
  private void a()
  {
    this.q = ((DzhHeader)findViewById(2131558643));
    this.q.a(this, this);
    this.c = ((ListView)findViewById(2131560485));
    this.d = ((Button)findViewById(2131560935));
    this.e = ((Button)findViewById(2131560933));
    this.f = ((Button)findViewById(2131560934));
  }
  
  private void a(int paramInt)
  {
    this.s = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12376").a("1026", paramInt).h()) });
    registRequestListener(this.s);
    this.s.a(paramInt + "");
    a(this.s, true);
  }
  
  private void a(String paramString, List<n> paramList)
  {
    k localk = new k();
    localk.a("批量申购信息确认");
    localk.b(paramString);
    localk.b("申购", new b(this, paramList));
    localk.a(getString(2131165331), new c(this));
    localk.setCancelable(false);
    localk.a(this);
  }
  
  private void a(Hashtable<String, String> paramHashtable)
  {
    if (com.android.dazhihui.d.n.t((String)paramHashtable.get("1863")).equals("1"))
    {
      c("\t\t已签署");
      return;
    }
    if (com.android.dazhihui.d.n.t((String)paramHashtable.get("1871")).equals("0"))
    {
      c("不允许签约");
      return;
    }
    String str1 = com.android.dazhihui.d.n.t((String)paramHashtable.get("1021"));
    com.android.dazhihui.d.n.t((String)paramHashtable.get("1862"));
    com.android.dazhihui.d.n.t((String)paramHashtable.get("1043"));
    String str2 = com.android.dazhihui.d.n.t((String)paramHashtable.get("1819"));
    String str3 = com.android.dazhihui.d.n.t((String)paramHashtable.get("1090"));
    String str4 = com.android.dazhihui.d.n.t((String)paramHashtable.get("1115"));
    String str5 = com.android.dazhihui.d.n.t((String)paramHashtable.get("1864"));
    String str6 = com.android.dazhihui.d.n.t((String)paramHashtable.get("1865"));
    com.android.dazhihui.d.n.t((String)paramHashtable.get("1866"));
    String str7 = com.android.dazhihui.d.n.t((String)paramHashtable.get("1867"));
    String str8 = com.android.dazhihui.d.n.t((String)paramHashtable.get("1800"));
    String str9 = com.android.dazhihui.d.n.t((String)paramHashtable.get("6007"));
    paramHashtable = com.android.dazhihui.d.n.t((String)paramHashtable.get("6008"));
    Bundle localBundle = new Bundle();
    localBundle.putInt("id_Mark", 12376);
    localBundle.putString("id_fundcode", str3);
    localBundle.putString("id_fundcompany", str4);
    localBundle.putString("id_document", str7);
    localBundle.putString("id_callARG", str8);
    localBundle.putString("id_protocol", str5);
    localBundle.putString("id_prompttext", str6);
    localBundle.putString("id_signtype", str2);
    localBundle.putString("id_accounttype", str1);
    localBundle.putString("id_limits", str9);
    localBundle.putString("id_captial", paramHashtable);
    startActivity(CashBaoElectronSign.class, localBundle);
  }
  
  private void a(List<n> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {}
    for (;;)
    {
      return;
      int k = 0;
      while (k < paramList.size())
      {
        ((n)paramList.get(k)).f = true;
        k += 1;
      }
    }
  }
  
  private void b()
  {
    m localm = new m(this);
    this.d.setOnClickListener(localm);
    this.f.setOnClickListener(localm);
    this.e.setOnClickListener(localm);
  }
  
  private void b(String paramString1, String paramString2)
  {
    k localk = new k();
    localk.a(getString(2131166406));
    localk.b(paramString2);
    localk.b("马上签署", new g(this, paramString1));
    localk.a("稍后签署", new h(this, localk));
    localk.a(this);
  }
  
  private void b(List<n> paramList)
  {
    Object localObject = "18400";
    if (o.y == o.w) {
      localObject = "18402";
    }
    localObject = o.g((String)localObject);
    ((com.android.dazhihui.ui.delegate.b.h)localObject).b(paramList.size());
    int k = 0;
    while (k < paramList.size())
    {
      String str = this.m.a(((n)paramList.get(k)).g, "1021");
      ((com.android.dazhihui.ui.delegate.b.h)localObject).d(k);
      ((com.android.dazhihui.ui.delegate.b.h)localObject).b("1021", str).b("1019", o.r(str)).b("1036", ((n)paramList.get(k)).b).b("1041", ((n)paramList.get(k)).c).b("1040", ((n)paramList.get(k)).e).b("2315", "4");
      ((com.android.dazhihui.ui.delegate.b.h)localObject).e(k);
      k += 1;
    }
    ((com.android.dazhihui.ui.delegate.b.h)localObject).c(paramList.size());
    this.h = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).j()) });
    registRequestListener(this.h);
    a(this.h, true);
  }
  
  private void c()
  {
    int i1 = 0;
    ArrayList localArrayList = new ArrayList();
    int k = 0;
    while (k < this.i.size())
    {
      if (((n)this.i.get(k)).f) {
        localArrayList.add(this.i.get(k));
      }
      k += 1;
    }
    if ((localArrayList == null) || (localArrayList.size() == 0)) {
      return;
    }
    Object localObject2 = new ArrayList();
    k = i1;
    while (k < localArrayList.size())
    {
      localObject1 = (n)localArrayList.get(k);
      ((ArrayList)localObject2).add(((n)localObject1).a + "    " + ((n)localObject1).b + "    " + ((n)localObject1).e);
      k += 1;
    }
    Object localObject1 = new StringBuffer();
    localObject2 = ((ArrayList)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      ((StringBuffer)localObject1).append(str + "\n");
    }
    ((StringBuffer)localObject1).append("\n确认是否申购?");
    a(((StringBuffer)localObject1).toString(), localArrayList);
  }
  
  private boolean d()
  {
    if ((this.i == null) || (this.i.size() == 0)) {
      return false;
    }
    int k = 0;
    for (;;)
    {
      if (k >= this.i.size()) {
        break label62;
      }
      if (!((n)this.i.get(k)).f) {
        break;
      }
      k += 1;
    }
    label62:
    return true;
  }
  
  private void e(String paramString)
  {
    k localk = new k();
    localk.a(getString(2131166406));
    localk.b(paramString);
    localk.b("马上签署", new d(this));
    localk.a("稍后签署", new e(this, localk));
    localk.a(this);
  }
  
  private void f()
  {
    if (d())
    {
      this.e.setSelected(true);
      this.e.setTextColor(getResources().getColor(2131493678));
      return;
    }
    this.e.setSelected(false);
    this.e.setTextColor(getResources().getColor(2131493036));
  }
  
  private void g()
  {
    int k = 0;
    while (k < this.i.size())
    {
      ((n)this.i.get(k)).f = false;
      k += 1;
    }
    f();
    this.j.notifyDataSetChanged();
  }
  
  private void h()
  {
    if (!o.r()) {
      return;
    }
    String str = "12924";
    if (o.y == o.w) {
      str = "12938";
    }
    this.g = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(str).a("1036", "").a("1022", "").a("1023", "").a("1206", "").a("1277", "").a("2315", "4").a("1972", "").h()) });
    registRequestListener(this.g);
    a(this.g, true);
  }
  
  private void i()
  {
    this.t = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12796").a("1026", 2).h()) });
    registRequestListener(this.t);
    a(this.t, true);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
      continue;
      h();
    }
  }
  
  public String a(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!paramString1.equals("")) && (paramString2 != null) && (!paramString2.equals(""))) {
      try
      {
        double d1 = Double.parseDouble(paramString1);
        double d2 = Double.parseDouble(paramString2);
        if (d1 > d2) {
          return paramString2;
        }
        return paramString1;
      }
      catch (Exception paramString1)
      {
        return null;
      }
    }
    return null;
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    this.q.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    paramct.p = this;
    paramct.d = "新股批量申购";
    paramct.f = getResources().getDrawable(2130838123);
  }
  
  public void d(String paramString)
  {
    k localk = new k();
    localk.a(getString(2131166406));
    localk.b(paramString);
    localk.b(getString(2131165363), new f(this));
    localk.a(this);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.q = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    com.android.dazhihui.ui.delegate.b.h localh;
    label159:
    label181:
    label203:
    label225:
    String str;
    label333:
    label350:
    label367:
    label384:
    label431:
    label485:
    label504:
    do
    {
      do
      {
        do
        {
          return;
          localh = com.android.dazhihui.ui.delegate.b.h.b(((v)paramj).b().e());
          if (paramh == this.g)
          {
            if (!localh.b()) {
              break label504;
            }
            int i1 = localh.g();
            if (i1 == 0)
            {
              this.c.setBackgroundResource(2130838490);
              return;
            }
            this.c.setBackgroundResource(2130839011);
            this.m = localh;
            this.d.setEnabled(true);
            this.e.setEnabled(true);
            this.f.setEnabled(true);
            this.i = new Vector();
            k = 0;
            if (k < i1)
            {
              n localn = new n(this);
              localn.g = k;
              if (localh.a(k, "1037") == null)
              {
                paramj = "";
                localn.a = paramj;
                if (localh.a(k, "1036") != null) {
                  break label333;
                }
                paramj = "";
                localn.b = paramj;
                if (localh.a(k, "1116") != null) {
                  break label350;
                }
                paramj = "";
                localn.c = paramj;
                if (localh.a(k, "2323") != null) {
                  break label367;
                }
                paramj = "0";
                this.n = paramj;
                if (localh.a(k, "6138") != null) {
                  break label384;
                }
              }
              for (paramj = "0";; paramj = localh.a(k, "6138").trim())
              {
                this.o = paramj;
                str = a(this.n, this.o);
                paramj = str;
                if (str == null) {
                  paramj = "0";
                }
                localn.d = paramj;
                localn.e = localn.d;
                localn.f = true;
                this.i.add(localn);
                k += 1;
                break;
                paramj = localh.a(k, "1037").trim();
                break label159;
                paramj = localh.a(k, "1036").trim();
                break label181;
                paramj = localh.a(k, "1116").trim();
                break label203;
                paramj = localh.a(k, "2323").trim();
                break label225;
              }
            }
            if (this.j != null) {
              break label485;
            }
            this.j = new j(this);
            this.c.setAdapter(this.j);
            a(this.i);
            f();
          }
          for (;;)
          {
            if (paramh == this.h)
            {
              if (localh.b())
              {
                if (localh.g() == 0) {
                  break;
                }
                c(localh.a(0, "1273"));
                g();
                return;
                this.j.notifyDataSetChanged();
                this.c.scrollTo(0, 0);
                break label431;
                paramj = Toast.makeText(this, localh.d(), 0);
                paramj.setGravity(17, 0, 0);
                paramj.show();
                continue;
              }
              c(localh.d());
              return;
            }
          }
          if (paramh != this.t) {
            break;
          }
          if (!localh.b())
          {
            c(localh.d());
            return;
          }
          k = localh.b(0, "1863");
          paramh = localh.a(0, "1208");
          if (k == 0)
          {
            e(paramh);
            return;
          }
        } while (k != 1);
        c();
        return;
        if (paramh != this.s) {
          break label848;
        }
        if (!localh.b())
        {
          c(localh.d());
          return;
        }
        str = (String)paramh.j();
        k = localh.g();
        if (!str.equals("8")) {
          break;
        }
        if (k > 0)
        {
          paramh = localh.f();
          if ((paramh != null) && (paramh.length == 1)) {
            this.a = paramh[0];
          }
        }
        k = localh.b(0, "1863");
        localh.a(0, "1864");
        localh.a(0, "1865");
        if (k == 0)
        {
          a(this.a);
          return;
        }
      } while (k != 1);
      c();
      return;
    } while (!str.equals("0"));
    if (k > 0)
    {
      paramh = localh.f();
      if ((paramh != null) && (paramh.length == 1)) {
        this.b = paramh[0];
      }
    }
    int k = localh.b(0, "1863");
    localh.a(0, "1864");
    paramh = localh.a(0, "1865");
    if (k == 0)
    {
      paramj = "您尚未签署《电子签名约定书》，因此无法签署《客户参与首次公开发行股票网上发行相关事项约定书》，请先行签署《电子签约定书》！";
      if (paramh.equals("您尚未签署《电子签名约定书》，因此无法签署《客户参与首次公开发行股票网上发行相关事项约定书》，请先行签署《电子签约定书》！")) {
        break label888;
      }
      paramh = paramj;
    }
    label848:
    label888:
    for (;;)
    {
      b(str, paramh);
      return;
      if (k != 1) {
        break;
      }
      a(8);
      return;
      if (paramh != this.r) {
        break;
      }
      if (!localh.b())
      {
        c(localh.d());
        return;
      }
      d(localh.a(0, "1208"));
      return;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903515);
    a();
    b();
    h();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\NewStockBatchEntrust.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */