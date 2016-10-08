package com.android.dazhihui.ui.delegate.screen.ggt;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class j
  implements AdapterView.OnItemSelectedListener
{
  j(GgtEntrust paramGgtEntrust) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (GgtEntrust.l(this.a) == 1) {
      GgtEntrust.m(this.a);
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */