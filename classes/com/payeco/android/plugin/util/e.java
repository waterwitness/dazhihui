package com.payeco.android.plugin.util;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

final class e
  implements AdapterView.OnItemSelectedListener
{
  e(Spinner paramSpinner, String[] paramArrayOfString) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.cv.setTag(this.cw[paramInt]);
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView)
  {
    this.cv.setTag(this.cw[0]);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */