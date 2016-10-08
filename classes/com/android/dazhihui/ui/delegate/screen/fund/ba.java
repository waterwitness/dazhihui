package com.android.dazhihui.ui.delegate.screen.fund;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class ba
  implements AdapterView.OnItemClickListener
{
  ba(FundMutualAIPMenu paramFundMutualAIPMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((TextView)paramView.findViewById(2131561234)).getText().toString();
    FundMutualAIPMenu.a(this.a, paramAdapterView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */