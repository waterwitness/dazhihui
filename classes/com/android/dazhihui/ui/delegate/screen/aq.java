package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class aq
  implements AdapterView.OnItemSelectedListener
{
  aq(EntrustNew paramEntrustNew) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    EntrustNew.a(this.a, paramInt);
    EntrustNew.a(this.a, EntrustNew.a(this.a));
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */