package com.android.dazhihui.ui.delegate.screen.hk;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.c.b;
import com.android.dazhihui.ui.delegate.screen.trade.AccountPass;
import com.android.dazhihui.ui.screen.BaseActivity;

class bi
  implements AdapterView.OnItemClickListener
{
  bi(bb parambb) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((b)((TextView)paramView.findViewById(2131559105)).getTag()).b;
    paramView = new Bundle();
    if ("36500".equals(paramAdapterView))
    {
      paramView.putInt("type", 4369);
      this.a.a(AccountPass.class, paramView);
    }
    while (!"36501".equals(paramAdapterView)) {
      return;
    }
    ((BaseActivity)this.a.getActivity()).startActivity(HKSetting.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */