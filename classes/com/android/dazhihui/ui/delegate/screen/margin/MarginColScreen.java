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

public class MarginColScreen
  extends DelegateBaseActivity
  implements cp, cs
{
  private static TextView[] b;
  public DzhHeader a;
  private final String[] c = { "担保品转入", "担保品转出", "担保品撤单" };
  private String[] d;
  private int e = 0;
  private ad f;
  private e g;
  private int h;
  private Bundle i;
  
  private e a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new t(t.c);
    case 1: 
      return new t(t.d);
    }
    return new b(12180);
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
    this.e = paramInt;
    a();
    e locale1 = this.g;
    if (this.f == null) {
      return;
    }
    e locale2 = a(this.f, paramInt);
    this.g = locale2;
    at localat = this.f.a();
    if (paramBoolean)
    {
      if (this.h > paramInt) {
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
      this.h = paramInt;
      if (this.g != null) {
        this.g.show();
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
    b = new TextView[3];
    b[0] = ((TextView)findViewById(2131559737));
    b[1] = ((TextView)findViewById(2131559738));
    b[2] = ((TextView)findViewById(2131558700));
  }
  
  private void c()
  {
    if (this.i != null) {
      this.e = this.i.getInt("type", 0);
    }
    this.a.a(this, this);
    this.f = getSupportFragmentManager();
    a(this.e, false);
  }
  
  private void d()
  {
    z localz = new z(this);
    int j = 0;
    while (j < b.length)
    {
      b[j].setOnClickListener(localz);
      j += 1;
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
      switch (this.e)
      {
      default: 
        break;
      case 0: 
      case 1: 
        ((t)this.g).c();
        break;
      case 2: 
        ((b)this.g).b();
      }
    }
  }
  
  public void a()
  {
    this.d = this.c;
    int j = 0;
    while (j < b.length)
    {
      b[j].setText(this.d[j]);
      b[j].setTextColor(-16777216);
      b[j].setTextSize(15.0F);
      if (this.e == j)
      {
        b[j].setTextColor(getResources().getColor(2131492932));
        b[j].setTextSize(18.0F);
      }
      j += 1;
    }
    switch (this.e)
    {
    default: 
      return;
    case 0: 
      this.a.setTitle("担保品转入");
      return;
    case 1: 
      this.a.setTitle("担保品转出");
      return;
    }
    this.a.setTitle("担保品划转撤单");
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
    setContentView(2130903255);
    this.i = getIntent().getExtras();
    b();
    d();
    c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\MarginColScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */