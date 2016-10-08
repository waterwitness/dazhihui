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

public class MarginCommonScreen
  extends DelegateBaseActivity
  implements cp, cs
{
  private static TextView[] e;
  public DzhHeader a;
  public String b;
  public String c;
  public String d;
  private final String[] f = { "买入", "卖出", "撤单", "持仓", "查询" };
  private String[] g;
  private int h = 0;
  private ad i;
  private e j;
  private int m;
  private Bundle n;
  
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
    this.h = paramInt;
    a();
    e locale1 = this.j;
    if (this.i == null) {
      return;
    }
    e locale2 = a(this.i, paramInt);
    this.j = locale2;
    at localat = this.i.a();
    if (paramBoolean)
    {
      if (this.m > paramInt) {
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
      this.m = paramInt;
      if (this.j != null) {
        this.j.show();
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
    e = new TextView[5];
    e[0] = ((TextView)findViewById(2131559045));
    e[1] = ((TextView)findViewById(2131559047));
    e[2] = ((TextView)findViewById(2131558700));
    e[3] = ((TextView)findViewById(2131560658));
    e[4] = ((TextView)findViewById(2131559050));
    e[3].setVisibility(0);
  }
  
  private void c()
  {
    this.h = this.n.getInt("type");
    this.b = this.n.getString("scode");
    this.c = this.n.getString("saccount");
    this.d = this.n.getString("sprice");
    this.a.a(this, this);
    this.i = getSupportFragmentManager();
    a(this.h, false);
  }
  
  private e d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new aa(0);
    case 1: 
      return new aa(1);
    case 2: 
      return new b();
    case 3: 
      return new h();
    }
    return new as();
  }
  
  private void d()
  {
    au localau = new au(this);
    int k = 0;
    while (k < e.length)
    {
      e[k].setOnClickListener(localau);
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
      switch (this.h)
      {
      default: 
        break;
      case 0: 
      case 1: 
        ((aa)this.j).g();
        break;
      case 2: 
        ((b)this.j).b();
        break;
      case 3: 
        ((h)this.j).c();
      }
    }
  }
  
  public void a()
  {
    this.g = this.f;
    int k = 0;
    while (k < e.length)
    {
      e[k].setText(this.g[k]);
      e[k].setTextColor(-16777216);
      e[k].setTextSize(15.0F);
      if (this.h == k)
      {
        e[k].setTextColor(getResources().getColor(2131492932));
        e[k].setTextSize(18.0F);
      }
      k += 1;
    }
    switch (this.h)
    {
    default: 
      return;
    case 0: 
      this.a.setTitle("担保品买入");
      return;
    case 1: 
      this.a.setTitle("担保品卖出");
      return;
    case 2: 
      this.a.setTitle("撤单");
      return;
    case 3: 
      this.a.setTitle("持仓");
      return;
    }
    this.a.setTitle("查询");
  }
  
  public void a(int paramInt)
  {
    a(paramInt, false);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    paramct.p = this;
    paramct.d = "撤单";
    paramct.f = getResources().getDrawable(2130838123);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903471);
    this.n = getIntent().getExtras();
    b();
    d();
    c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\MarginCommonScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */