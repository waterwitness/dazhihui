package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;

class cm
  implements AdapterView.OnItemClickListener
{
  cm(DzhHeader paramDzhHeader, AdapterView.OnItemClickListener paramOnItemClickListener) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.e.dismiss();
    if (this.b.n) {}
    this.a.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */