package com.android.dazhihui.ui.delegate.screen.fund;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.d.n;
import java.util.Hashtable;

class af
  implements AdapterView.OnItemClickListener
{
  af(FundCompanyTable paramFundCompanyTable) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.a.c(paramInt);
    paramView = new Bundle();
    paramView.putString("cid", n.t((String)paramAdapterView.get("1115")));
    paramView.putString("cname", n.t((String)paramAdapterView.get("1089")));
    this.a.startActivity(FundOpenForm.class, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */