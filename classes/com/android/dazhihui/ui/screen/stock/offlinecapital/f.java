package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.c.a.d;
import java.util.ArrayList;

class f
  implements View.OnClickListener
{
  f(OfflineCapitalDetailActivity paramOfflineCapitalDetailActivity) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      return;
      this.a.d.cancel();
      return;
      this.a.d.cancel();
      if (OfflineCapitalDetailActivity.b(this.a) == 1)
      {
        OfflineCapitalDetailActivity.a(this.a, d.a());
        OfflineCapitalDetailActivity.i(this.a).a("offline_capital_state", 0);
        OfflineCapitalDetailActivity.i(this.a).a("offline_capital_shengyuzijin", "");
        OfflineCapitalDetailActivity.i(this.a).j();
        OfflineCapitalDetailActivity.i(this.a).g();
        paramView = new Intent(this.a, OfflineCapitalInitActivity.class);
        this.a.startActivity(paramView);
        this.a.finish();
        return;
      }
    } while (OfflineCapitalDetailActivity.b(this.a) != 2);
    paramView = ah.a().n();
    paramView = new n(OfflineCapitalDetailActivity.d(this.a), "0", paramView, OfflineCapitalDetailActivity.d(this.a).split("_")[1], "0", "0", "0");
    OfflineCapitalDetailActivity.i(this.a).a(paramView);
    OfflineCapitalDetailActivity.i(this.a).g();
    OfflineCapitalDetailActivity.a(this.a, 0);
    OfflineCapitalDetailActivity.a(this.a, OfflineCapitalDetailActivity.i(this.a).l());
    OfflineCapitalDetailActivity.i(this.a).g();
    int i = 0;
    while (i < OfflineCapitalDetailActivity.n(this.a).size())
    {
      if (((n)OfflineCapitalDetailActivity.n(this.a).get(i)).e().equals("1")) {
        OfflineCapitalDetailActivity.o(this.a);
      }
      i += 1;
    }
    if (OfflineCapitalDetailActivity.p(this.a) == 0)
    {
      OfflineCapitalDetailActivity.i(this.a).a("offline_capital_state", 0);
      OfflineCapitalDetailActivity.i(this.a).g();
      paramView = new Intent(this.a, OfflineCapitalInitActivity.class);
      this.a.startActivity(paramView);
      this.a.finish();
      return;
    }
    paramView = new Intent(this.a, OfflineCapitalMine.class);
    this.a.startActivity(paramView);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */