package com.android.dazhihui.ui.delegate.screen.margin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.a.d;
import com.android.dazhihui.ui.delegate.screen.ad;

public class as
  extends ad
{
  public d c;
  public ListView d;
  public String[] e;
  private View f;
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.f = paramLayoutInflater.inflate(2130903262, paramViewGroup, false);
    this.d = ((ListView)this.f.findViewById(2131558780));
    this.e = new String[] { "当日成交", "当日委托", "历史成交", "历史委托", "配号", "中签", "合约查询", "融券标的查询", "资金流水", "担保品证券查询" };
    this.c = new d(getActivity(), this.e);
    this.d.setAdapter(this.c);
    this.d.setOnItemClickListener(new at(this));
    return this.f;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */