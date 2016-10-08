package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.c.a.d;

class h
  implements View.OnClickListener
{
  h(OfflineCapitalDetailActivity paramOfflineCapitalDetailActivity) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558581: 
      this.a.f.cancel();
      return;
    }
    this.a.f.cancel();
    OfflineCapitalDetailActivity.b[2] = "取消在“我”显示";
    OfflineCapitalDetailActivity.i(this.a).a("offline_capital_my_show_quanshang", OfflineCapitalDetailActivity.d(this.a));
    OfflineCapitalDetailActivity.i(this.a).g();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */