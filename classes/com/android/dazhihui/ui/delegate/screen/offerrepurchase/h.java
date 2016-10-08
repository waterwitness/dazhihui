package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class h
  implements AdapterView.OnItemClickListener
{
  h(OfferRepurchaseMenu paramOfferRepurchaseMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((TextView)paramView.findViewById(2131561234)).getText().toString();
    paramAdapterView = paramAdapterView.substring(paramAdapterView.indexOf(".") + 1);
    OfferRepurchaseMenu.a(this.a, paramAdapterView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */