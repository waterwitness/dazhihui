package com.android.dazhihui.ui.delegate.screen.electronsign;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.otc.TradeBrowser;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CashBaoElectronSign
  extends DelegateBaseActivity
  implements cp, cs
{
  private HashSet<String> A;
  private int B = 1;
  private com.android.dazhihui.a.b.u C;
  private com.android.dazhihui.a.b.u D;
  private com.android.dazhihui.a.b.u E;
  private com.android.dazhihui.a.b.u F;
  private int a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String m;
  private TextView n;
  private ArrayList<i> o;
  private LinearLayout p;
  private CheckBox q;
  private DzhHeader r;
  private LinearLayout s;
  private Spinner t;
  private Spinner u;
  private String[] v;
  private String[] w;
  private String[] x;
  private String[] y;
  private HashMap<String, String> z;
  
  private void a()
  {
    if (this.o != null)
    {
      int i1 = this.o.size();
      int k = 0;
      while (k < i1)
      {
        TextView localTextView = new TextView(this);
        localTextView.setTextSize(22.0F);
        localTextView.setTextColor(getResources().getColor(2131493023));
        localTextView.getPaint().setFlags(8);
        localTextView.setClickable(true);
        localTextView.setText(((i)this.o.get(k)).a);
        localTextView.setOnClickListener(new c(this, k));
        this.p.addView(localTextView);
        k += 1;
      }
    }
  }
  
  private void a(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    Object localObject = paramh.a(0, "1208");
    paramh = paramh.a(0, "1947");
    if (!TextUtils.isEmpty(paramh))
    {
      localObject = new k();
      ((k)localObject).b(paramh);
      ((k)localObject).b(getString(2131165363), new f(this));
      ((k)localObject).a(getString(2131165331), new g(this));
      ((k)localObject).a(new h(this));
      ((k)localObject).a(this);
      return;
    }
    a((String)localObject, true);
  }
  
  private void a(i parami)
  {
    String str1 = n.t(this.f);
    parami = n.t(parami.b);
    String str2 = n.t(this.e);
    this.C = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(String.valueOf(12378)).a("1864", str1).a("1868", parami).a("1800", str2).h()) });
    registRequestListener(this.C);
    a(this.C, true);
  }
  
  private void a(Object paramObject)
  {
    i locali = (i)paramObject;
    if (locali.c.equals("0")) {
      c((i)paramObject);
    }
    while (!locali.c.equals("1")) {
      return;
    }
    TradeBrowser.a(this, locali.d);
  }
  
  private void a(String[] paramArrayOfString, boolean[] paramArrayOfBoolean)
  {
    int i1 = paramArrayOfString.length;
    String[] arrayOfString = new String[i1];
    int k = 0;
    while (k < i1)
    {
      localObject = (String)this.z.get(paramArrayOfString[k]);
      arrayOfString[k] = paramArrayOfString[k];
      k += 1;
    }
    Object localObject = new AlertDialog.Builder(this);
    ((AlertDialog.Builder)localObject).setTitle("请选择股东帐号");
    ((AlertDialog.Builder)localObject).setMultiChoiceItems(arrayOfString, paramArrayOfBoolean, new d(this, paramArrayOfString));
    ((AlertDialog.Builder)localObject).setPositiveButton("确定", new e(this));
    ((AlertDialog.Builder)localObject).setNegativeButton("取消", null);
    ((AlertDialog.Builder)localObject).show();
  }
  
  private void b()
  {
    Object localObject = n.t(this.f);
    n.t(this.g);
    String str1 = n.t(this.e);
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    if (f())
    {
      Iterator localIterator = this.A.iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        localStringBuilder2.append((String)this.z.get(str2)).append(",");
        localStringBuilder1.append(str2).append(",");
      }
    }
    localObject = o.g(String.valueOf(12380)).a("1864", (String)localObject).a("1026", "0").a("1021", localStringBuilder2.toString()).a("1019", localStringBuilder1.toString()).a("1800", str1);
    if (this.s.getVisibility() == 0) {
      ((com.android.dazhihui.ui.delegate.b.h)localObject).a("6007", this.x[this.t.getSelectedItemPosition()]).a("6008", this.y[this.u.getSelectedItemPosition()]);
    }
    this.D = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
    registRequestListener(this.D);
    a(this.D, true);
  }
  
  private void b(i parami)
  {
    String str1 = n.t(this.b);
    String str2 = n.t(this.c);
    parami = n.t(parami.b);
    String str3 = n.t(this.e);
    this.E = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(String.valueOf(12384)).a("1090", str1).a("1115", str2).a("1868", parami).a("1800", str3).h()) });
    registRequestListener(this.E);
    a(this.E, true);
  }
  
  private void c()
  {
    String str1 = n.t(this.b);
    String str2 = n.t(this.c);
    String str3 = n.t(this.e);
    this.F = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(String.valueOf(12386)).a("1090", str1).a("1115", str2).a("1026", "0").a("1800", str3).a("1396", this.B).h()) });
    registRequestListener(this.F);
    a(this.F, true);
  }
  
  private void c(i parami)
  {
    switch (this.a)
    {
    default: 
      return;
    case 12376: 
      a(parami);
      return;
    }
    b(parami);
  }
  
  public static ArrayList<i> d(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.split("\\" + String.valueOf('\002'), -1);
    int i1 = paramString.length / 4;
    int k = 0;
    while (k < i1)
    {
      i locali = new i();
      locali.a = paramString[(k * 4 + 0)];
      locali.b = paramString[(k * 4 + 1)];
      locali.c = paramString[(k * 4 + 2)];
      locali.d = paramString[(k * 4 + 3)];
      localArrayList.add(locali);
      k += 1;
    }
    return localArrayList;
  }
  
  private void d()
  {
    switch (this.a)
    {
    default: 
      return;
    case 12376: 
      if (f())
      {
        e(this.h);
        return;
      }
      b();
      return;
    }
    c();
  }
  
  private void e(String paramString)
  {
    int i2 = 0;
    paramString = f(paramString);
    if ((paramString == null) || (paramString.length == 0)) {
      c("无下发股东类型");
    }
    int i3;
    int i4;
    if (this.A == null)
    {
      this.A = new HashSet();
      this.z = new HashMap();
      i3 = paramString.length;
      i4 = o.z.length;
      k = 0;
    }
    for (;;)
    {
      if (k >= i3) {
        break label148;
      }
      int i1 = 0;
      for (;;)
      {
        if (i1 < i4)
        {
          if (paramString[k].equals(o.z[i1][0])) {
            this.z.put(o.z[i1][1], o.z[i1][0]);
          }
          i1 += 1;
          continue;
          this.A.clear();
          break;
        }
      }
      k += 1;
    }
    label148:
    if (this.z.isEmpty())
    {
      c("没有匹配的股东账号");
      return;
    }
    Object localObject = this.z.keySet();
    paramString = (String[])((Set)localObject).toArray(new String[0]);
    this.A.addAll((Collection)localObject);
    localObject = new boolean[paramString.length];
    int k = i2;
    while (k < localObject.length)
    {
      localObject[k] = 1;
      k += 1;
    }
    a(paramString, (boolean[])localObject);
  }
  
  private boolean f()
  {
    return this.g.equals("1");
  }
  
  private static String[] f(String paramString)
  {
    return paramString.split("\\" + String.valueOf('\002'), -1);
  }
  
  private boolean g()
  {
    return this.q.isChecked();
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
    this.r.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "合约签署";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.r = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (com.android.dazhihui.ui.delegate.b.u.a(paramj, this))
    {
      if ((paramh != this.C) && (paramh != this.E)) {
        break label74;
      }
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (paramh.b()) {
        break label62;
      }
      c(paramh.d());
    }
    label62:
    label74:
    do
    {
      return;
      c(paramh.a(0, "1208"));
      return;
      if (paramh == this.D)
      {
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if (!paramh.b())
        {
          c(paramh.d());
          return;
        }
        a(paramh.a(0, "1208"), true);
        return;
      }
    } while (paramh != this.F);
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (!paramh.b())
    {
      c(paramh.d());
      return;
    }
    a(paramh);
  }
  
  public void init(Bundle paramBundle)
  {
    int i2 = 0;
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.a = paramBundle.getInt("id_Mark");
      this.b = paramBundle.getString("id_fundcode");
      this.c = paramBundle.getString("id_fundcompany");
      this.d = paramBundle.getString("id_document");
      this.e = paramBundle.getString("id_callARG");
      this.f = paramBundle.getString("id_protocol");
      this.g = paramBundle.getString("id_signtype");
      this.h = paramBundle.getString("id_accounttype");
      this.i = paramBundle.getString("id_prompttext");
      this.j = paramBundle.getString("id_limits");
      this.m = paramBundle.getString("id_captial");
      if (this.d != null) {
        this.o = d(this.d);
      }
    }
    setContentView(2130903469);
    this.r = ((DzhHeader)findViewById(2131558513));
    this.r.a(this, this);
    this.n = ((TextView)findViewById(2131560648));
    this.p = ((LinearLayout)findViewById(2131560649));
    this.q = ((CheckBox)findViewById(2131560653));
    this.s = ((LinearLayout)findViewById(2131560650));
    this.t = ((Spinner)findViewById(2131560651));
    this.u = ((Spinner)findViewById(2131560652));
    if ((this.j != null) && (this.m != null) && (!this.j.equals("")) && (!this.m.equals(""))) {}
    for (;;)
    {
      try
      {
        paramBundle = this.j.split("\\;")[1].split("\\,");
        int k = paramBundle.length;
        this.v = new String[k];
        this.x = new String[k];
        k -= 1;
        int i1 = 0;
        String[] arrayOfString;
        if (k >= 0)
        {
          arrayOfString = paramBundle[k].split("\\:");
          this.v[i1] = arrayOfString[1];
          this.x[i1] = arrayOfString[0];
          i1 += 1;
          k -= 1;
          continue;
        }
        paramBundle = new ArrayAdapter(this, 17367048, this.v);
        paramBundle.setDropDownViewResource(17367049);
        this.t.setAdapter(paramBundle);
        paramBundle = this.m.split("\\;")[1].split("\\,");
        k = paramBundle.length;
        this.w = new String[k];
        this.y = new String[k];
        k -= 1;
        i1 = i2;
        if (k >= 0)
        {
          arrayOfString = paramBundle[k].split("\\:");
          this.w[i1] = arrayOfString[1];
          this.y[i1] = arrayOfString[0];
          i1 += 1;
          k -= 1;
          continue;
        }
        paramBundle = new ArrayAdapter(this, 17367048, this.w);
        paramBundle.setDropDownViewResource(17367049);
        this.u.setAdapter(paramBundle);
      }
      catch (Exception paramBundle)
      {
        paramBundle.printStackTrace();
        this.s.setVisibility(8);
        continue;
      }
      this.n.setText(this.i);
      ((Button)findViewById(2131560654)).setOnClickListener(new a(this));
      ((Button)findViewById(2131560655)).setOnClickListener(new b(this));
      a();
      return;
      this.s.setVisibility(8);
    }
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\electronsign\CashBaoElectronSign.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */