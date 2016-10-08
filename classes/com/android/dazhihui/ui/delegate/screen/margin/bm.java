package com.android.dazhihui.ui.delegate.screen.margin;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.android.dazhihui.ui.a.h;
import com.android.dazhihui.ui.delegate.c.b;
import com.android.dazhihui.ui.delegate.screen.newstock.NewStockBatchEntrust;
import com.android.dazhihui.ui.delegate.screen.newstock.NewStockMainActivity;
import com.android.dazhihui.ui.delegate.screen.trade.AccountPass;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;

class bm
  implements AdapterView.OnItemClickListener
{
  bm(bi parambi) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = (TextView)paramView.findViewById(2131559105);
    String str = ((b)paramView.getTag()).b;
    paramAdapterView = new Bundle();
    if (str.contains("36100")) {
      ((BaseActivity)this.a.getActivity()).startActivity(NewStockMainActivity.class, paramAdapterView);
    }
    do
    {
      return;
      if (str.contains("36101"))
      {
        ((BaseActivity)this.a.getActivity()).startActivity(NewStockBatchEntrust.class, paramAdapterView);
        return;
      }
      if (str.contains("36201"))
      {
        paramAdapterView.putInt("type", 3);
        ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen.class, paramAdapterView);
        return;
      }
      if (str.contains("36200"))
      {
        paramAdapterView.putInt("type", 4);
        ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen.class, paramAdapterView);
        return;
      }
      if (str.contains("36202"))
      {
        ((BaseActivity)this.a.getActivity()).startActivity(MarginCaptialDebtQuiry.class);
        return;
      }
      if (str.contains("36301"))
      {
        paramAdapterView.putInt("mode", 2);
        paramAdapterView.putInt("type", 0);
        ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen2.class, paramAdapterView);
        return;
      }
      if (str.contains("36302"))
      {
        paramAdapterView.putInt("mode", 2);
        paramAdapterView.putInt("type", 1);
        ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen2.class, paramAdapterView);
        return;
      }
      if (str.contains("36303"))
      {
        paramAdapterView.putInt("mode", 3);
        paramAdapterView.putInt("type", 0);
        ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen2.class, paramAdapterView);
        return;
      }
      if (str.contains("36304"))
      {
        paramAdapterView.putInt("mode", 3);
        paramAdapterView.putInt("type", 1);
        ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen2.class, paramAdapterView);
        return;
      }
      if (str.contains("36400"))
      {
        if (MarColVerify.a)
        {
          this.a.a(MarginColScreen.class);
          return;
        }
        this.a.a(MarColVerify.class);
        return;
      }
      if (str.contains("30100"))
      {
        str = ((b)paramView.getTag()).c;
        paramView = ((b)paramView.getTag()).a;
        paramAdapterView.putString("nexturl", str);
        paramAdapterView.putString("names", paramView);
        this.a.a(BrowserActivity.class, paramAdapterView);
        return;
      }
      if (str.contains("36500"))
      {
        paramAdapterView.putInt("type", 0);
        this.a.a(AccountPass.class, paramAdapterView);
        return;
      }
    } while (!str.contains("30110"));
    h.a().d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */