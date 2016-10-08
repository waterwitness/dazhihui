package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BaseActivity;

class y
  implements AdapterView.OnItemClickListener
{
  y(x paramx) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Intent();
    paramView = new Bundle();
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      ((BaseActivity)this.a.getActivity()).startActivity(CapitalandHoldingTable.class);
      n.a("", 20036);
      return;
    case 1: 
      paramView.putInt("screenId", 0);
      ((BaseActivity)this.a.getActivity()).startActivity(EntrustNew.class, paramView);
      n.a("", 20037);
      return;
    case 2: 
      paramView.putInt("screenId", 1);
      ((BaseActivity)this.a.getActivity()).startActivity(EntrustNew.class, paramView);
      n.a("", 20038);
      return;
    case 3: 
      ((BaseActivity)this.a.getActivity()).startActivity(CancelTable.class);
      n.a("", 20039);
      return;
    case 4: 
      paramView.putString("tag", "todayDeal");
      paramAdapterView.putExtras(paramView);
      paramAdapterView.setClass(this.a.getActivity(), BargainAndEntrust_today.class);
      this.a.startActivity(paramAdapterView);
      n.a("", 20041);
      return;
    case 5: 
      paramView.putString("tag", "todayEntrust");
      paramAdapterView.putExtras(paramView);
      paramAdapterView.setClass(this.a.getActivity(), BargainAndEntrust_today.class);
      this.a.startActivity(paramAdapterView);
      n.a("", 20042);
      return;
    case 6: 
      paramView.putString("type", "lscx");
      paramAdapterView.putExtras(paramView);
      paramAdapterView.setClass(this.a.getActivity(), TradeChecklistMenu.class);
      this.a.startActivity(paramAdapterView);
      n.a("", 20043);
      return;
    case 7: 
      ((BaseActivity)this.a.getActivity()).startActivity(TransferMenu.class);
      n.a("", 20040);
      return;
    }
    paramView.putString("type", "set");
    paramAdapterView.putExtras(paramView);
    paramAdapterView.setClass(this.a.getActivity(), TradeChecklistMenu.class);
    this.a.startActivity(paramAdapterView);
    n.a("", 20045);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */