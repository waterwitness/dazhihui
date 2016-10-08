package com.payeco.android.plugin.util;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

final class c
  implements AdapterView.OnItemSelectedListener
{
  c(Spinner paramSpinner1, Context paramContext, Spinner paramSpinner2, int[] paramArrayOfInt, String[] paramArrayOfString) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    NewRiskControlTool.provinceId = this.cq.getSelectedItemPosition();
    paramAdapterView = this.Y;
    paramView = this.cr;
    ArrayAdapter localArrayAdapter = NewRiskControlTool.cityAdapter;
    NewRiskControlTool.a(paramAdapterView, paramView, this.cs[NewRiskControlTool.provinceId]);
    paramAdapterView = this.ct[paramInt];
    this.cq.setTag(paramAdapterView.substring(0, paramAdapterView.length() - 1) + ",");
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView)
  {
    paramAdapterView = this.ct[0];
    this.cq.setTag(paramAdapterView.substring(0, paramAdapterView.length() - 1) + ",");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */