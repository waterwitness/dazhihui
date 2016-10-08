package com.payeco.android.plugin;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class y
  implements AdapterView.OnItemSelectedListener
{
  y(PayecoRiskControlActivity paramPayecoRiskControlActivity, String[] paramArrayOfString) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.bg[paramInt];
    PayecoRiskControlActivity.a(this.bc, paramAdapterView.substring(0, paramAdapterView.length() - 1));
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView)
  {
    paramAdapterView = this.bg[0];
    PayecoRiskControlActivity.a(this.bc, paramAdapterView.substring(0, paramAdapterView.length() - 1));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */