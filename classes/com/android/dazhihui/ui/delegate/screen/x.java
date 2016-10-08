package com.android.dazhihui.ui.delegate.screen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.view.TradeAccountSwitchView;
import com.android.dazhihui.ui.delegate.view.d;
import com.android.dazhihui.ui.model.stock.adapter.GridViewAdapter;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.widget.adv.AdvertView;

public class x
  extends a
  implements d
{
  private TradeAccountSwitchView a;
  private String[] b = { "资金股份", "委托买入", "委托卖出", "委托撤单", "当日成交", "当日委托", "历史查询", "银证转账", "委托设置" };
  private Integer[] c = { Integer.valueOf(2130838920), Integer.valueOf(2130838915), Integer.valueOf(2130838916), Integer.valueOf(2130838911), Integer.valueOf(2130838912), Integer.valueOf(2130838913), Integer.valueOf(2130838914), Integer.valueOf(2130838919), Integer.valueOf(2130838917) };
  private GridView d;
  private View e;
  private boolean f = false;
  private boolean g = false;
  
  private void b()
  {
    AdvertView localAdvertView = (AdvertView)this.e.findViewById(2131560656);
    localAdvertView.setAdvCode(148);
    addAdvert(localAdvertView);
    this.d = ((GridView)this.e.findViewById(2131560657));
    a();
    this.a = ((TradeAccountSwitchView)this.e.findViewById(2131559768));
    this.a.a(1, this.e);
    this.a.a();
    this.a.setAccountSwitchItemClick(this);
    n.a("", 1027);
  }
  
  public void a()
  {
    this.d.setAdapter(new GridViewAdapter(getActivity(), 1, this.c, this.b));
    this.d.setSelector(2130838098);
    this.d.setNumColumns(4);
    this.d.setOnItemClickListener(new y(this));
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    ((gc)getParentFragment()).a(paramString1, paramString2, paramString3);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.e = paramLayoutInflater.inflate(2130903470, paramViewGroup, false);
    b();
    this.f = true;
    return this.e;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.g = paramBoolean;
  }
  
  public void onResume()
  {
    super.onResume();
    if ((!this.f) && (!this.g) && (!isHidden()) && (o.r()))
    {
      this.a.a(1, this.e);
      this.a.a();
    }
    this.f = false;
  }
  
  public void show()
  {
    super.show();
    if (this.e != null)
    {
      this.a.a(1, this.e);
      this.a.a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */