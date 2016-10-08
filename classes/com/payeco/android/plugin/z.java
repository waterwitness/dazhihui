package com.payeco.android.plugin;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class z
  implements AdapterView.OnItemSelectedListener
{
  z(PayecoRiskControlActivity paramPayecoRiskControlActivity, String[] paramArrayOfString) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.bh[paramInt];
    PayecoRiskControlActivity.b(this.bc, paramAdapterView.substring(2, paramAdapterView.length() - 1));
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView)
  {
    paramAdapterView = this.bh[0];
    PayecoRiskControlActivity.b(this.bc, paramAdapterView.substring(2, paramAdapterView.length() - 1));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */