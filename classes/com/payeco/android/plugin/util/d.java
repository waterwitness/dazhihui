package com.payeco.android.plugin.util;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

final class d
  implements AdapterView.OnItemSelectedListener
{
  d(String[] paramArrayOfString, Spinner paramSpinner) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.cu[paramInt];
    this.cv.setTag(paramAdapterView);
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView)
  {
    paramAdapterView = this.cu[0];
    this.cv.setTag(paramAdapterView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */