package com.android.dazhihui.ui.delegate.screen.newstock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.at;
import android.view.View;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class NewStockMainActivity
  extends DelegateBaseActivity
  implements cp, cs
{
  public static String a;
  private static TextView[] c;
  private static int g = -1;
  private DzhHeader b;
  private final String[] d = { "新股申购", "中签查询", "配号查询" };
  private String[] e;
  private int f = 0;
  private android.support.v4.app.ad h;
  private e i;
  private int j;
  
  private e a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new p();
    case 1: 
      if (o.y == o.v) {
        return new ad(12024);
      }
      return new ad(12522);
    case 2: 
      if (o.y == o.v) {
        return new ad(11148);
      }
      return new ad(12510);
    }
    return new y();
  }
  
  private e a(android.support.v4.app.ad paramad, int paramInt)
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
    this.f = paramInt;
    a();
    e locale1 = this.i;
    if (this.h == null) {
      return;
    }
    e locale2 = a(this.h, paramInt);
    this.i = locale2;
    at localat = this.h.a();
    if (paramBoolean)
    {
      if (this.j > paramInt) {
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
      this.j = paramInt;
      if (this.i != null) {
        this.i.show();
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
    this.b = ((DzhHeader)findViewById(2131558643));
    c = new TextView[3];
    c[0] = ((TextView)findViewById(2131560937));
    c[1] = ((TextView)findViewById(2131560938));
    c[2] = ((TextView)findViewById(2131560939));
  }
  
  private void c()
  {
    this.b.a(this, this);
    this.h = getSupportFragmentManager();
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
    {
      this.f = localBundle.getInt("type", 0);
      a = localBundle.getString("scode");
    }
    a(this.f, false);
  }
  
  private void d()
  {
    ac localac = new ac(this);
    int k = 0;
    while (k < c.length)
    {
      c[k].setOnClickListener(localac);
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
      switch (this.f)
      {
      default: 
        break;
      case 0: 
        if ((this.i instanceof p)) {
          ((p)this.i).b();
        }
        break;
      case 1: 
        if ((this.i instanceof ad)) {
          ((ad)this.i).b();
        }
        break;
      case 2: 
        if ((this.i instanceof ad)) {
          ((ad)this.i).b();
        }
        break;
      }
    }
  }
  
  public void a()
  {
    this.e = this.d;
    int k = 0;
    while (k < c.length)
    {
      c[k].setText(this.e[k]);
      c[k].setTextColor(-16777216);
      if (this.f == k) {
        c[k].setTextColor(-13274383);
      }
      k += 1;
    }
    switch (this.f)
    {
    default: 
      return;
    case 0: 
      this.b.setTitle(this.e[0]);
      return;
    case 1: 
      this.b.setTitle(this.e[1]);
      return;
    }
    this.b.setTitle(this.e[2]);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    paramct.p = this;
    paramct.d = "新股";
    paramct.f = getResources().getDrawable(2130838123);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.b = paramDzhHeader;
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903517);
    b();
    d();
    c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\NewStockMainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */