package com.android.dazhihui.ui.delegate.screen.fund;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class s
  implements AdapterView.OnItemClickListener
{
  s(ETFFundMenu paramETFFundMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((TextView)paramView.findViewById(2131561234)).getText().toString();
    paramAdapterView = paramAdapterView.substring(paramAdapterView.indexOf(".") + 1);
    this.a.d(paramAdapterView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */