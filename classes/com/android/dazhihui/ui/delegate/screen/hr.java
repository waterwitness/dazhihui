package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

class hr
  implements AdapterView.OnItemSelectedListener
{
  hr(TransferTable paramTransferTable) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((TransferTable.e(this.a) != null) && (TransferTable.e(this.a).length > paramInt))
    {
      paramAdapterView = new ArrayAdapter(this.a, 17367048, TransferTable.d(this.a));
      paramAdapterView.setDropDownViewResource(17367049);
      TransferTable.f(this.a).setVisibility(0);
      TransferTable.f(this.a).setAdapter(paramAdapterView);
      TransferTable.f(this.a).setSelection(TransferTable.e(this.a)[paramInt]);
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */