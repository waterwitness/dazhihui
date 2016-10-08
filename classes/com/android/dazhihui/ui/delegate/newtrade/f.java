package com.android.dazhihui.ui.delegate.newtrade;

import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.ui.screen.e;

public class f
  extends com.android.dazhihui.ui.delegate.newtrade.screen.b
{
  public int a;
  private View d = null;
  private ad e;
  private e f;
  
  private e a(ad paramad, int paramInt)
  {
    e locale = (e)paramad.a(paramInt + "");
    paramad = locale;
    if (locale == null) {
      paramad = b(paramInt);
    }
    return paramad;
  }
  
  private e b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return new com.android.dazhihui.ui.delegate.newtrade.screen.b();
    case 0: 
      return new d();
    }
    return new h();
  }
  
  private void c()
  {
    this.e = getChildFragmentManager();
  }
  
  private void c(int paramInt)
  {
    this.a = paramInt;
    b();
    e locale1 = this.f;
    if (this.e == null) {
      return;
    }
    e locale2 = a(this.e, paramInt);
    this.f = locale2;
    at localat = this.e.a();
    if (locale1 != null)
    {
      locale1.beforeHidden();
      localat.b(locale1);
    }
    if (!locale2.isAdded()) {
      localat.a(2131558681, locale2, paramInt + "");
    }
    for (;;)
    {
      if (this.f != null) {
        this.f.show();
      }
      localat.b();
      return;
      localat.c(locale2);
    }
  }
  
  public void a(int paramInt)
  {
    c(paramInt);
  }
  
  public void a(com.android.dazhihui.ui.delegate.newtrade.b.b paramb, int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("date_type", paramInt2);
    localBundle.putInt("yk_type", paramInt1);
    localBundle.putString("yk", paramb.c);
    localBundle.putString("market_code", paramb.f);
    localBundle.putString("stock_code", paramb.a);
    localBundle.putString("stock_name", paramb.b);
    localBundle.putString("hold_days", paramb.e);
    a(TradeDetialScreen.class, localBundle);
  }
  
  public void b()
  {
    if (this.a == 0) {
      ((CaptialAnalMainScreen)getActivity()).a("资产分析", null);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.d = paramLayoutInflater.inflate(2130903073, paramViewGroup, false);
    c();
    c(0);
    return this.d;
  }
  
  public void show()
  {
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */