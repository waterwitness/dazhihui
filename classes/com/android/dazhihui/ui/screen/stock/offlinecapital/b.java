package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.delegate.a;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import java.io.PrintStream;

class b
  implements AdapterView.OnItemClickListener
{
  b(OfflineCapitalDetailActivity paramOfflineCapitalDetailActivity) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    OfflineCapitalDetailActivity.a(this.a).dismiss();
    if (OfflineCapitalDetailActivity.b(this.a) == 1)
    {
      switch (paramInt)
      {
      default: 
        return;
      case 0: 
        paramAdapterView = new Intent(this.a, OfflineCapitalSettingActivity.class);
        this.a.startActivity(paramAdapterView);
        return;
      case 1: 
        OfflineCapitalDetailActivity.a(this.a, this.a);
        return;
      }
      OfflineCapitalDetailActivity.c(this.a);
      return;
    }
    if (OfflineCapitalDetailActivity.b(this.a) == 2)
    {
      switch (paramInt)
      {
      default: 
        return;
      case 0: 
        com.android.dazhihui.d.n.a("", 20118);
        OfflineCapitalDetailActivity.a(this.a, a.a().c());
        if (OfflineCapitalDetailActivity.d(this.a).contains("_"))
        {
          OfflineCapitalDetailActivity.a(this.a, OfflineCapitalDetailActivity.d(this.a).split("_"));
          OfflineCapitalDetailActivity.a(this.a, OfflineCapitalDetailActivity.e(this.a)[0]);
          OfflineCapitalDetailActivity.b(this.a, OfflineCapitalDetailActivity.e(this.a)[1]);
        }
        if ((o.r()) && (OfflineCapitalDetailActivity.f(this.a) != null) && (OfflineCapitalDetailActivity.g(this.a).equals(OfflineCapitalDetailActivity.f(this.a).c())) && (OfflineCapitalDetailActivity.h(this.a).equals(OfflineCapitalDetailActivity.f(this.a).d())))
        {
          if (o.l())
          {
            OfflineCapitalDetailActivity.a(this.a, true);
            this.a.d();
            return;
          }
          if (o.m())
          {
            OfflineCapitalDetailActivity.a(this.a, true);
            OfflineCapitalDetailActivity.c(this.a, o.p);
            this.a.a(o.g);
            return;
          }
          OfflineCapitalDetailActivity.a(this.a, true);
          this.a.b();
          return;
        }
        o.r = true;
        o.s = OfflineCapitalDetailActivity.g(this.a);
        System.out.println("TradeHelper.isFromSynchronous = true;    TradeHelper.fromSynchronousName = " + OfflineCapitalDetailActivity.g(this.a));
        o.u();
        paramAdapterView = new Intent();
        paramView = new Bundle();
        paramView.putInt("TAB_ID", 805306368);
        paramView.putInt("fragment_index", 0);
        paramAdapterView.setClass(this.a.getApplicationContext(), MainScreen.class);
        paramAdapterView.putExtras(paramView);
        paramAdapterView.addFlags(67108864);
        this.a.startActivity(paramAdapterView);
        return;
      case 1: 
        OfflineCapitalDetailActivity.a(this.a, this.a);
        return;
      case 2: 
        OfflineCapitalDetailActivity.a(this.a, d.a());
        OfflineCapitalDetailActivity.d(this.a, OfflineCapitalDetailActivity.i(this.a).b("offline_capital_my_show_quanshang"));
        OfflineCapitalDetailActivity.i(this.a).g();
        if ((OfflineCapitalDetailActivity.j(this.a) != null) && (OfflineCapitalDetailActivity.j(this.a).equals(OfflineCapitalDetailActivity.d(this.a))))
        {
          OfflineCapitalDetailActivity.b[2] = "在“我”显示";
          OfflineCapitalDetailActivity.i(this.a).a("offline_capital_my_show_quanshang", "");
          OfflineCapitalDetailActivity.i(this.a).g();
        }
        for (;;)
        {
          this.a.c.notifyDataSetChanged();
          return;
          paramAdapterView = OfflineCapitalDetailActivity.i(this.a).b("offline_capital_my_show_quanshang");
          OfflineCapitalDetailActivity.i(this.a).g();
          if (TextUtils.isEmpty(paramAdapterView))
          {
            OfflineCapitalDetailActivity.b[2] = "取消在“我”显示";
            OfflineCapitalDetailActivity.i(this.a).a("offline_capital_my_show_quanshang", OfflineCapitalDetailActivity.d(this.a));
            OfflineCapitalDetailActivity.i(this.a).g();
          }
          else
          {
            paramView = OfflineCapitalDetailActivity.i(this.a).i(paramAdapterView);
            OfflineCapitalDetailActivity.i(this.a).g();
            if ((paramView == null) || (!paramView.e().equals("1")))
            {
              OfflineCapitalDetailActivity.b[2] = "取消在“我”显示";
              OfflineCapitalDetailActivity.i(this.a).a("offline_capital_my_show_quanshang", OfflineCapitalDetailActivity.d(this.a));
              OfflineCapitalDetailActivity.i(this.a).g();
            }
            else
            {
              OfflineCapitalDetailActivity.a(this.a, this.a, paramAdapterView);
            }
          }
        }
      }
      OfflineCapitalDetailActivity.c(this.a);
      return;
    }
    OfflineCapitalDetailActivity.a(this.a, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */