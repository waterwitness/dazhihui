package com.android.dazhihui.ui.delegate.screen.trade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.View;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public abstract class TradeBaseFragmentActivity
  extends DelegateBaseActivity
  implements cp, cs
{
  public int a;
  public ad b;
  protected Bundle c = null;
  private String d;
  private int e;
  private DzhHeader f;
  
  private void a() {}
  
  private void b()
  {
    this.b = getSupportFragmentManager();
    d(this.e);
  }
  
  private void c()
  {
    this.f = ((DzhHeader)findViewById(2131558513));
    this.f.a(this, this);
  }
  
  private void d()
  {
    Intent localIntent = getIntent();
    if (localIntent != null)
    {
      this.c = localIntent.getExtras();
      if (this.c != null)
      {
        this.a = this.c.getInt("id_Mark");
        this.d = this.c.getString("name_Mark");
        this.e = this.c.getInt("mark_type");
      }
    }
  }
  
  private void d(int paramInt)
  {
    if (this.b == null) {
      return;
    }
    e locale = a(paramInt);
    at localat = this.b.a();
    if (!locale.isAdded()) {
      localat.a(2131560647, locale, paramInt + "");
    }
    for (;;)
    {
      localat.b();
      return;
      localat.c(locale);
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public abstract e a(int paramInt);
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = this.d;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.f = paramDzhHeader;
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    d();
    setContentView(2130903464);
    c();
    a();
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\TradeBaseFragmentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */