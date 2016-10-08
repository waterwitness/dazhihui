package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.screen.stock.offlinecapital.n;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.adv.ac;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class EntrustSettingScreen
  extends AdvertBaseActivity
  implements cp, cs
{
  private DzhHeader a;
  private View b;
  private View c;
  private View d;
  private ListView e;
  private com.android.dazhihui.c.a.a f;
  private String g;
  private String h;
  private ArrayList<String> i;
  
  private void a()
  {
    if ((com.android.dazhihui.c.a.a.M != null) && (com.android.dazhihui.c.a.a.M.length > 0))
    {
      ArrayList localArrayList = new ArrayList();
      int j = 0;
      while (j < com.android.dazhihui.c.a.a.M.length)
      {
        localArrayList.add(com.android.dazhihui.c.a.a.M[j]);
        j += 1;
      }
      this.d.setVisibility(0);
      this.e.setAdapter(new bp(this, localArrayList));
      return;
    }
    this.d.setVisibility(8);
  }
  
  private void a(String paramString)
  {
    int i1 = 0;
    o.b(paramString, this);
    if (com.android.dazhihui.c.a.a.E == null)
    {
      a();
      return;
    }
    this.i = new ArrayList();
    int k = 0;
    for (int j = 0; k < com.android.dazhihui.c.a.a.E.length; j = m)
    {
      m = j;
      if (paramString.equals(com.android.dazhihui.c.a.a.E[k][0]))
      {
        if (!this.i.contains(com.android.dazhihui.c.a.a.E[k][2])) {
          this.i.add(com.android.dazhihui.c.a.a.E[k][2]);
        }
        m = j + 1;
      }
      k += 1;
    }
    Object localObject2 = com.android.dazhihui.ui.delegate.a.a().b();
    if ((localObject2 != null) && (((ArrayList)localObject2).size() > 0))
    {
      localObject1 = new ArrayList();
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((ArrayList)localObject1).add((c)((Iterator)localObject2).next());
      }
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (c)((Iterator)localObject1).next();
        if (((c)localObject2).c().equals(paramString)) {
          com.android.dazhihui.ui.delegate.a.a().a((c)localObject2);
        }
      }
    }
    k = 0;
    while (k < this.i.size())
    {
      this.h = (paramString + "_" + (String)this.i.get(k));
      d.a().h(this.h);
      d.a().k(this.h);
      k += 1;
    }
    Object localObject1 = d.a().l();
    d.a().g();
    k = 0;
    int n;
    for (int m = 0; k < ((ArrayList)localObject1).size(); m = n)
    {
      n = m;
      if (((n)((ArrayList)localObject1).get(k)).e().equals("1")) {
        n = m + 1;
      }
      k += 1;
    }
    if (m == 0)
    {
      k = d.a().c("offline_capital_state");
      d.a().g();
      if (k == 2)
      {
        d.a().a("offline_capital_state", 0);
        d.a().g();
      }
    }
    localObject1 = (String[][])Array.newInstance(String.class, new int[] { com.android.dazhihui.c.a.a.E.length - j, 3 });
    j = 0;
    for (k = 0; j < com.android.dazhihui.c.a.a.E.length; k = m)
    {
      m = k;
      if (!paramString.equals(com.android.dazhihui.c.a.a.E[j][0]))
      {
        localObject1[k] = com.android.dazhihui.c.a.a.E[j];
        m = k + 1;
      }
      j += 1;
    }
    if (localObject1 != null)
    {
      com.android.dazhihui.c.a.a.E = (String[][])localObject1;
      this.f.a(39);
      a();
    }
    if (com.android.dazhihui.c.a.a.i != null)
    {
      j = 0;
      label533:
      if (j < com.android.dazhihui.c.a.a.i.length)
      {
        if (com.android.dazhihui.c.a.a.i[j][2].equals(paramString))
        {
          com.android.dazhihui.c.a.a.i[j][0] = "";
          com.android.dazhihui.c.a.a.i[j][1] = "";
        }
      }
      else {
        this.f.a(19);
      }
    }
    else
    {
      localObject1 = null;
      if (com.android.dazhihui.c.a.a.A.length > 1) {
        localObject1 = new String[com.android.dazhihui.c.a.a.A.length - 1];
      }
      if ((localObject1 == null) || (localObject1.length <= 0)) {
        break label736;
      }
      k = 0;
      j = i1;
      label622:
      if (j < com.android.dazhihui.c.a.a.A.length)
      {
        m = k;
        if (com.android.dazhihui.c.a.a.A[j].equals(paramString)) {
          break label723;
        }
        if (k < localObject1.length) {
          break label707;
        }
      }
    }
    for (;;)
    {
      com.android.dazhihui.c.a.a.A = (String[])localObject1;
      this.f.a(35);
      if (!com.android.dazhihui.ui.delegate.a.a().e().equals(paramString)) {
        break;
      }
      com.android.dazhihui.ui.delegate.a.a().a("");
      com.android.dazhihui.ui.delegate.a.a().b("");
      return;
      j += 1;
      break label533;
      label707:
      localObject1[k] = com.android.dazhihui.c.a.a.A[j];
      m = k + 1;
      label723:
      j += 1;
      k = m;
      break label622;
      label736:
      localObject1 = new String[1];
      localObject1[0] = "无";
    }
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
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (bo.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.a(paramy);
      return;
    } while (this.a == null);
    this.a.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "券商设置";
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    this.f = new com.android.dazhihui.c.a.a(this);
    this.f.close();
    setContentView(2130903106);
    Object localObject = (TextView)findViewById(2131558872);
    paramBundle = (AdvertView)findViewById(2131558873);
    paramBundle.setAdvCode(144);
    paramBundle.setOnAdvertStateChangeListener(new bl(this, paramBundle, (TextView)localObject));
    localObject = (AdvertView)findViewById(2131558876);
    ((AdvertView)localObject).a(2131492903, 2131492903, 0);
    ((AdvertView)localObject).setAdvCode(145);
    a(paramBundle);
    a((ac)localObject);
    this.a = ((DzhHeader)findViewById(2131558869));
    this.a.setOnHeaderButtonClickListener(this);
    this.a.a(this, this);
    this.b = findViewById(2131558870);
    this.b.setOnClickListener(new bm(this));
    this.c = findViewById(2131558874);
    int j;
    if (m.a().J() != null)
    {
      j = m.a().J().getIsExistence();
      if (j != 0) {
        break label251;
      }
      this.c.setVisibility(8);
    }
    for (;;)
    {
      this.c.setOnClickListener(new bn(this));
      this.d = findViewById(2131558877);
      this.e = ((ListView)findViewById(2131558878));
      a();
      return;
      label251:
      if (j == 1)
      {
        this.c.setVisibility(0);
      }
      else if (j == 2)
      {
        this.c.setVisibility(0);
        this.g = m.a().J().getUrl_Link();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\EntrustSettingScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */