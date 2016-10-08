package com.android.dazhihui.ui.delegate.screen.fund;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class t
  implements AdapterView.OnItemSelectedListener
{
  t(FundAtone paramFundAtone) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    FundAtone.a(this.a, paramInt);
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */