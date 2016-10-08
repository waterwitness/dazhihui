package com.android.dazhihui.ui.delegate.screen.hk;

import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.gc;
import com.android.dazhihui.ui.delegate.view.TradeAccountSwitchView;
import com.android.dazhihui.ui.delegate.view.TradeHeader;
import com.android.dazhihui.ui.delegate.view.d;
import com.android.dazhihui.ui.model.stock.adapter.GridViewAdapter;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.widget.adv.AdvertView;

@SuppressLint({"ValidFragment"})
public class HKTradeMenu
  extends a
  implements d
{
  private TradeAccountSwitchView a;
  private String[] b = { bk.e, bk.b, bk.c, bk.d, bk.f, bk.g, bk.h, bk.i, "委托设置" };
  private Integer[] c = { Integer.valueOf(2130838920), Integer.valueOf(2130838915), Integer.valueOf(2130838916), Integer.valueOf(2130838911), Integer.valueOf(2130838912), Integer.valueOf(2130838913), Integer.valueOf(2130838914), Integer.valueOf(2130838918), Integer.valueOf(2130838917) };
  private GridView d;
  private View e;
  private TradeHeader f;
  private boolean g = false;
  private boolean h = false;
  
  public HKTradeMenu() {}
  
  public HKTradeMenu(TradeHeader paramTradeHeader)
  {
    this.f = paramTradeHeader;
  }
  
  private void b()
  {
    AdvertView localAdvertView = (AdvertView)this.e.findViewById(2131560656);
    localAdvertView.setAdvCode(148);
    addAdvert(localAdvertView);
    this.d = ((GridView)this.e.findViewById(2131560657));
    c();
    this.f.getRightText().setOnClickListener(new cd(this));
    this.a = ((TradeAccountSwitchView)this.e.findViewById(2131559768));
    this.a.a(2, this.e);
    this.a.a();
    this.a.setAccountSwitchItemClick(this);
    bk.e();
    n.a("", 1027);
  }
  
  private void c()
  {
    this.d.setAdapter(new GridViewAdapter(getActivity(), 1, this.c, this.b));
    this.d.setSelector(2130838098);
    this.d.setNumColumns(4);
    this.d.setOnItemClickListener(new cg(this));
  }
  
  public void a()
  {
    new AlertDialog.Builder(getActivity()).setIcon(2130837525).setTitle("你确定退出？").setPositiveButton(2131165363, new cf(this)).setNegativeButton(2131165331, new ce(this)).show();
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    ((gc)getParentFragment()).a(paramString1, paramString2, paramString3);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.e = paramLayoutInflater.inflate(2130903470, paramViewGroup, false);
    b();
    this.g = true;
    return this.e;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.h = paramBoolean;
  }
  
  public void onResume()
  {
    super.onResume();
    if ((!this.g) && (!this.h) && (!isHidden()) && (o.r()))
    {
      this.a.a(2, this.e);
      this.a.a();
    }
    this.g = false;
  }
  
  public void show()
  {
    super.show();
    if (this.e != null)
    {
      this.a.a(2, this.e);
      this.a.a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\HKTradeMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */