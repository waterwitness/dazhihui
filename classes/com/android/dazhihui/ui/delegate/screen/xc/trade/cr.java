package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.dazhihui.ui.delegate.screen.ad;

public class cr
  extends ad
{
  private LinearLayout c;
  private LinearLayout d;
  private LinearLayout e;
  private LinearLayout f;
  private LinearLayout g;
  private LinearLayout h;
  private LinearLayout i;
  private LinearLayout j;
  private View k;
  
  private void b()
  {
    this.c = ((LinearLayout)this.k.findViewById(2131560966));
    this.d = ((LinearLayout)this.k.findViewById(2131560964));
    this.f = ((LinearLayout)this.k.findViewById(2131560969));
    this.e = ((LinearLayout)this.k.findViewById(2131560968));
    this.g = ((LinearLayout)this.k.findViewById(2131560972));
    this.i = ((LinearLayout)this.k.findViewById(2131560971));
    this.h = ((LinearLayout)this.k.findViewById(2131560975));
    this.j = ((LinearLayout)this.k.findViewById(2131560970));
  }
  
  private void c()
  {
    cs localcs = new cs(this);
    this.c.setOnClickListener(localcs);
    this.d.setOnClickListener(localcs);
    this.f.setOnClickListener(localcs);
    this.e.setOnClickListener(localcs);
    this.g.setOnClickListener(localcs);
    this.i.setOnClickListener(localcs);
    this.h.setOnClickListener(localcs);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.k = paramLayoutInflater.inflate(2130903524, paramViewGroup, false);
    b();
    c();
    return this.k;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */