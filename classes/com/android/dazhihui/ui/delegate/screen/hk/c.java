package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

class c
  implements AdapterView.OnItemClickListener
{
  c(DropDownCurrencyView paramDropDownCurrencyView) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    DropDownCurrencyView.a(this.a, paramInt);
    paramAdapterView = DropDownCurrencyView.d(this.a)[paramInt];
    DropDownCurrencyView.e(this.a).setText(paramAdapterView);
    if (DropDownCurrencyView.a()[paramInt] != -1)
    {
      DropDownCurrencyView.f(this.a).setBackgroundResource(DropDownCurrencyView.a()[paramInt]);
      DropDownCurrencyView.f(this.a).setVisibility(0);
    }
    for (;;)
    {
      if (DropDownCurrencyView.b(this.a) != null) {
        DropDownCurrencyView.b(this.a).dismiss();
      }
      if (this.a.a != null) {
        this.a.a.a(paramAdapterView, paramInt);
      }
      return;
      DropDownCurrencyView.f(this.a).setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */