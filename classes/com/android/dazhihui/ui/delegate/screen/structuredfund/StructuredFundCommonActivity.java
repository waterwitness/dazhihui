package com.android.dazhihui.ui.delegate.screen.structuredfund;

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

public class StructuredFundCommonActivity
  extends DelegateBaseActivity
  implements cp, cs
{
  private static TextView[] e;
  public DzhHeader a;
  public String b;
  public String c;
  public String d;
  private final String[] f = { "买入", "卖出", "撤单", "查询" };
  private String[] g;
  private int h = 0;
  private ad i;
  private e j;
  private int m;
  private boolean n = false;
  private Bundle o;
  
  private e a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    default: 
      return null;
    case 0: 
      return new i(0);
    case 1: 
      return new i(1);
    case 2: 
      return new a();
    }
    return new aj();
  }
  
  private e a(ad paramad, int paramInt)
  {
    e locale = (e)paramad.a(paramInt + "");
    paramad = locale;
    if (locale == null) {
      paramad = a(paramInt);
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
    if (this.n)
    {
      e = new TextView[4];
      e[0] = ((TextView)findViewById(2131559045));
      e[1] = ((TextView)findViewById(2131559047));
      e[2] = ((TextView)findViewById(2131558700));
      e[3] = ((TextView)findViewById(2131559050));
      return;
    }
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
    this.h = this.o.getInt("type");
    this.b = this.o.getString("scode");
    this.c = this.o.getString("saccount");
    this.d = this.o.getString("sprice");
    this.a.a(this, this);
    this.i = getSupportFragmentManager();
    a(this.h, false);
  }
  
  private void d()
  {
    h localh = new h(this);
    int k = 0;
    while (k < e.length)
    {
      e[k].setOnClickListener(localh);
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
        ((i)this.j).f();
        break;
      case 2: 
        ((a)this.j).b();
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
    case 3: 
    default: 
      return;
    case 0: 
      this.a.setTitle("买入");
      return;
    case 1: 
      this.a.setTitle("卖出");
      return;
    case 2: 
      this.a.setTitle("撤单");
      return;
    }
    this.a.setTitle("查询");
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
    this.o = getIntent().getExtras();
    this.n = this.o.getBoolean("typefund");
    b();
    d();
    c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\StructuredFundCommonActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */