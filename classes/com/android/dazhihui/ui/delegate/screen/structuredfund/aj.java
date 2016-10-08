package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.a.d;
import com.android.dazhihui.ui.delegate.screen.ad;

public class aj
  extends ad
{
  public d c;
  public ListView d;
  public String[] e;
  private View f;
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.f = paramLayoutInflater.inflate(2130903524, paramViewGroup, false);
    this.d = ((ListView)this.f.findViewById(2131558780));
    this.e = new String[] { "当日成交", "当日委托", "历史成交", "历史委托" };
    this.c = new d(getActivity(), this.e);
    this.d.setAdapter(this.c);
    this.d.setOnItemClickListener(new ak(this));
    return this.f;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */