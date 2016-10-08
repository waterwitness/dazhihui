package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.h;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.b;
import com.android.dazhihui.ui.delegate.screen.FundActivity;
import com.android.dazhihui.ui.delegate.screen.fund.ETFFundMenu;
import com.android.dazhihui.ui.delegate.screen.fund.IFundMenu;
import com.android.dazhihui.ui.delegate.screen.ggt.GgtTradeMenu;
import com.android.dazhihui.ui.delegate.screen.newstock.NewStockBatchEntrust;
import com.android.dazhihui.ui.delegate.screen.newstock.NewStockMainActivity;
import com.android.dazhihui.ui.delegate.screen.offerrepurchase.OfferRepurchaseMenu;
import com.android.dazhihui.ui.delegate.screen.otc.OtcMenu;
import com.android.dazhihui.ui.delegate.screen.setplan.SetPlanMenu;
import com.android.dazhihui.ui.delegate.screen.trade.AccountPass;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;

class cc
  implements AdapterView.OnItemClickListener
{
  cc(bw parambw) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (TextView)paramView.findViewById(2131559105);
    String str = ((b)paramAdapterView.getTag()).b;
    paramView = new Bundle();
    if (str.contains("31100")) {
      ((BaseActivity)this.a.getActivity()).startActivity(NewStockMainActivity.class, paramView);
    }
    do
    {
      do
      {
        return;
        if (str.contains("31101"))
        {
          ((BaseActivity)this.a.getActivity()).startActivity(NewStockBatchEntrust.class, paramView);
          return;
        }
        if (str.contains("31200"))
        {
          paramView.putString("name_Mark", "基金");
          ((BaseActivity)this.a.getActivity()).startActivity(FundActivity.class, paramView);
          return;
        }
        if (str.contains("31300"))
        {
          this.a.a(IFundMenu.class);
          return;
        }
        if (str.contains("31800"))
        {
          this.a.a(ETFFundMenu.class);
          return;
        }
        if (str.contains("31810"))
        {
          this.a.a(OfferRepurchaseMenu.class);
          return;
        }
        if (str.contains("31400"))
        {
          ((BaseActivity)this.a.getActivity()).startActivity(SetPlanMenu.class);
          n.a("", 20065);
          return;
        }
        if (str.contains("31500"))
        {
          ((BaseActivity)this.a.getActivity()).startActivity(OtcMenu.class);
          n.a("", 20063);
          return;
        }
        if (str.contains("31600"))
        {
          paramView.putInt("type", 2);
          this.a.a(GgtTradeMenu.class, paramView);
          n.a("", 1392);
          return;
        }
        if (str.contains("30100"))
        {
          str = ((b)paramAdapterView.getTag()).c;
          paramAdapterView = ((b)paramAdapterView.getTag()).a;
          paramView.putString("nexturl", str);
          paramView.putString("names", paramAdapterView);
          this.a.a(BrowserActivity.class, paramView);
          return;
        }
        if (str.contains("32021"))
        {
          bw.a(this.a, true);
          return;
        }
        if (str.contains("32022"))
        {
          o.a(this.a.getActivity(), true);
          return;
        }
        if (str.contains("31700"))
        {
          paramView.putInt("type", 0);
          this.a.a(AccountPass.class, paramView);
          return;
        }
        if (str.contains("30110"))
        {
          h.a().d();
          return;
        }
      } while (!str.contains("32041"));
      paramView = ((b)paramAdapterView.getTag()).c;
      bw.a(this.a, ((b)paramAdapterView.getTag()).a);
      paramAdapterView = paramView.split(",");
      if (paramAdapterView.length < 5)
      {
        this.a.a("数据有误，请检查...");
        return;
      }
      bw.b(this.a, paramAdapterView[0].replace("id=", ""));
      bw.c(this.a, new String(Base64.decode(paramAdapterView[1].replace("key=", "").getBytes(), 0)));
      bw.d(this.a, paramAdapterView[2].replace("getUrl=", ""));
      bw.e(this.a, paramAdapterView[3].replace("sendUrl=", ""));
      bw.f(this.a, paramAdapterView[4].replace("pageCode=", ""));
    } while (TextUtils.isEmpty(bw.a(this.a)));
    this.a.e();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */