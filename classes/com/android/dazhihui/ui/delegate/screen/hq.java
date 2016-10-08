package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.android.dazhihui.ui.delegate.b.o;

class hq
  implements AdapterView.OnItemSelectedListener
{
  hq(TransferTable paramTransferTable) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    TransferTable.a(this.a, o.k(TransferTable.d(this.a)[paramInt]));
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */