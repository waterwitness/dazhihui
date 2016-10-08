package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class HKTradeCommon
  extends DelegateBaseActivity
  implements cp, cs
{
  public DzhHeader a;
  private int b;
  private TextView[] c;
  private final String[] d = { "买入", "卖出", "撤单", "持仓", "查询" };
  private ad e;
  private e f;
  private String g = null;
  private String h = null;
  
  private e a(int paramInt)
  {
    Bundle localBundle;
    HKEntrust localHKEntrust;
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      localBundle = new Bundle();
      localBundle.putInt("type", 0);
      localHKEntrust = new HKEntrust();
      localHKEntrust.setArguments(localBundle);
      return localHKEntrust;
    case 1: 
      localBundle = new Bundle();
      localBundle.putInt("type", 1);
      localHKEntrust = new HKEntrust();
      localHKEntrust.setArguments(localBundle);
      return localHKEntrust;
    case 2: 
      return new q();
    case 3: 
      return new HKCaptialHolding();
    }
    return new bs();
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
  
  private void a()
  {
    if ((getIntent() != null) && (getIntent().getExtras() != null))
    {
      localObject = getIntent().getExtras();
      this.g = ((Bundle)localObject).getString("codes");
      this.h = ((Bundle)localObject).getString("sprice");
    }
    Object localObject = new cc(this);
    int i = 0;
    if (i < this.c.length)
    {
      if (i + 1 <= this.d.length)
      {
        this.c[i].setText(this.d[i]);
        this.c[i].setVisibility(0);
      }
      for (;;)
      {
        this.c[i].setTextColor(-16777216);
        this.c[i].setTextSize(15.0F);
        this.c[i].setOnClickListener((View.OnClickListener)localObject);
        i += 1;
        break;
        this.c[i].setVisibility(8);
      }
    }
    this.e = getSupportFragmentManager();
    this.a.a(this, this);
    if ((getIntent() != null) && (getIntent().getExtras() != null)) {}
    for (i = getIntent().getExtras().getInt("screenId", 0);; i = 0)
    {
      a(i, false);
      return;
    }
  }
  
  private void b()
  {
    this.a = ((DzhHeader)findViewById(2131559735));
    this.c = new TextView[5];
    this.c[0] = ((TextView)findViewById(2131559045));
    this.c[1] = ((TextView)findViewById(2131559047));
    this.c[2] = ((TextView)findViewById(2131558700));
    this.c[3] = ((TextView)findViewById(2131560658));
    this.c[4] = ((TextView)findViewById(2131559050));
    this.c[3].setVisibility(0);
  }
  
  private void d(int paramInt)
  {
    if ((paramInt >= this.d.length) || (paramInt >= this.c.length)) {
      return;
    }
    if ((this.b >= 0) && (this.b < this.c.length))
    {
      this.c[this.b].setTextColor(-16777216);
      this.c[this.b].setTextSize(15.0F);
    }
    this.c[paramInt].setTextColor(getResources().getColor(2131492932));
    this.c[paramInt].setTextSize(18.0F);
    this.b = paramInt;
    this.a.setTitle(this.d[this.b]);
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
      switch (this.b)
      {
      default: 
        break;
      case 0: 
      case 1: 
        ((HKEntrust)this.f).e();
        break;
      case 2: 
        ((q)this.f).b();
        break;
      case 3: 
        ((HKCaptialHolding)this.f).d();
      }
    }
  }
  
  protected void a(int paramInt, boolean paramBoolean)
  {
    d(paramInt);
    e locale1 = this.f;
    if (this.e == null) {
      return;
    }
    e locale2 = a(this.e, paramInt);
    this.f = locale2;
    at localat = this.e.a();
    if (paramBoolean)
    {
      if (this.b > paramInt) {
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
        break label209;
      }
      localat.a(2131559739, locale2, paramInt + "");
    }
    for (;;)
    {
      if (this.f != null)
      {
        this.f.show();
        if (((this.f instanceof HKEntrust)) && (this.g != null))
        {
          ((HKEntrust)this.f).c(this.g);
          ((HKEntrust)this.f).d(this.h);
          this.g = null;
          this.h = null;
        }
      }
      localat.b();
      return;
      localat.a(2130968628, 2130968629);
      break;
      label209:
      localat.c(locale2);
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    paramct.p = this;
    paramct.d = "撤单";
    paramct.f = getResources().getDrawable(2130838123);
  }
  
  public void d(String paramString)
  {
    this.g = paramString;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903471);
    b();
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\HKTradeCommon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */