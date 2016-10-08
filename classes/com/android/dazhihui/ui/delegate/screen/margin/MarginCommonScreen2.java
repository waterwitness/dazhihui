package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.View;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class MarginCommonScreen2
  extends DelegateBaseActivity
  implements cp, cs
{
  private static TextView[] e;
  public DzhHeader a;
  public String b;
  public String c;
  public String d;
  private final String[] f = { "融资买入", "撤单", "融资标的", "查询" };
  private final String[] g = { "融券卖出", "撤单", "融券券源", "查询" };
  private final String[] h = { "直接还款", "卖券还款", "撤单", "未还融资" };
  private final String[] i = { "直接还券", "买券还券", "撤单", "未还融券" };
  private String[] j = this.f;
  private int m = 0;
  private int n = 0;
  private ad o;
  private e p;
  private int q;
  private Bundle r;
  
  private e a(ad paramad, int paramInt)
  {
    e locale = (e)paramad.a(paramInt + "");
    paramad = locale;
    if (locale == null) {
      paramad = d(paramInt);
    }
    return paramad;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    this.n = paramInt;
    a();
    e locale1 = this.p;
    if (this.o == null) {
      return;
    }
    e locale2 = a(this.o, paramInt);
    this.p = locale2;
    at localat = this.o.a();
    if (paramBoolean)
    {
      if (this.q > paramInt) {
        localat.a(2130968632, 2130968633);
      }
    }
    else
    {
      if (locale1 != null)
      {
        locale1.beforeHidden();
        localat.b(locale1);
      }
      if (locale2.isAdded()) {
        break label161;
      }
      localat.a(2131559739, locale2, paramInt + "");
    }
    for (;;)
    {
      this.q = paramInt;
      if (this.p != null) {
        this.p.show();
      }
      localat.b();
      return;
      localat.a(2130968628, 2130968629);
      break;
      label161:
      localat.c(locale2);
    }
  }
  
  private void b()
  {
    this.a = ((DzhHeader)findViewById(2131559735));
    e = new TextView[4];
    e[0] = ((TextView)findViewById(2131559745));
    e[1] = ((TextView)findViewById(2131558700));
    e[2] = ((TextView)findViewById(2131559746));
    e[3] = ((TextView)findViewById(2131559050));
  }
  
  private void c()
  {
    this.m = this.r.getInt("mode");
    this.n = this.r.getInt("type");
    this.b = this.r.getString("scode");
    this.c = this.r.getString("saccount");
    this.d = this.r.getString("sprice");
    this.a.a(this, this);
    this.o = getSupportFragmentManager();
    a(this.n, false);
  }
  
  private e d(int paramInt)
  {
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return null;
            if (this.m == 0) {
              return new aa(2);
            }
            if (this.m == 1) {
              return new aa(3);
            }
            if (this.m == 2) {
              return new ax(0);
            }
          } while (this.m != 3);
          return new ax(1);
          if ((this.m == 0) || (this.m == 1)) {
            return new b();
          }
          if (this.m == 2) {
            return new aa(5);
          }
        } while (this.m != 3);
        return new aa(4);
        if (this.m == 0) {
          return new bt(0);
        }
        if (this.m == 1) {
          return new bt(1);
        }
      } while ((this.m != 2) && (this.m != 3));
      return new b();
      if ((this.m == 0) || (this.m == 1)) {
        return new as();
      }
      if (this.m == 2) {
        return new bt(2);
      }
    } while (this.m != 3);
    return new bt(3);
  }
  
  private void d()
  {
    av localav = new av(this);
    int k = 0;
    while (k < e.length)
    {
      e[k].setOnClickListener(localav);
      k += 1;
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
      continue;
      switch (this.n)
      {
      default: 
        break;
      case 0: 
        if ((this.p instanceof aa)) {
          ((aa)this.p).g();
        }
        break;
      case 1: 
        if ((this.p instanceof b)) {
          ((b)this.p).b();
        }
        if ((this.p instanceof aa)) {
          ((aa)this.p).g();
        }
        break;
      case 2: 
        if ((this.p instanceof bt)) {
          ((bt)this.p).b();
        }
        if ((this.p instanceof b)) {
          ((b)this.p).b();
        }
        break;
      case 3: 
        if ((this.p instanceof bt)) {
          ((bt)this.p).b();
        }
        break;
      }
    }
  }
  
  public void a()
  {
    if (this.m == 0) {
      this.j = this.f;
    }
    for (;;)
    {
      int k = 0;
      while (k < e.length)
      {
        e[k].setText(this.j[k]);
        e[k].setTextColor(-16777216);
        e[k].setTextSize(15.0F);
        if (this.n == k)
        {
          e[k].setTextColor(getResources().getColor(2131492932));
          e[k].setTextSize(18.0F);
        }
        k += 1;
      }
      if (this.m == 1) {
        this.j = this.g;
      } else if (this.m == 2) {
        this.j = this.h;
      } else if (this.m == 3) {
        this.j = this.i;
      }
    }
    switch (this.n)
    {
    default: 
      return;
    case 0: 
      this.a.setTitle(this.j[0]);
      return;
    case 1: 
      this.a.setTitle(this.j[1]);
      return;
    case 2: 
      this.a.setTitle(this.j[2]);
      return;
    }
    this.a.setTitle(this.j[3]);
  }
  
  public void a(int paramInt)
  {
    a(paramInt, false);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    paramct.p = this;
    paramct.d = "";
    paramct.f = getResources().getDrawable(2130838123);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903257);
    this.r = getIntent().getExtras();
    b();
    d();
    c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\MarginCommonScreen2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */