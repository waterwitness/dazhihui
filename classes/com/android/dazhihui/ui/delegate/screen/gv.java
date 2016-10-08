package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

class gv
  implements AdapterView.OnItemSelectedListener
{
  gv(Transfer paramTransfer) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Transfer.b(this.a, paramInt);
    if ((Transfer.a(this.a) != null) && (Transfer.a(this.a).length > Transfer.b(this.a)))
    {
      Transfer.c(this.a, Transfer.b(this.a));
      paramAdapterView = new ArrayAdapter(this.a, 17367048, Transfer.c(this.a));
      paramAdapterView.setDropDownViewResource(17367049);
      Transfer.d(this.a).setVisibility(0);
      Transfer.d(this.a).setAdapter(paramAdapterView);
      Transfer.d(this.a).setSelection(Transfer.a(this.a)[Transfer.b(this.a)]);
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */