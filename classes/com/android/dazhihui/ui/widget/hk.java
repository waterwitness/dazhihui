package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;

class hk
  implements AdapterView.OnItemClickListener
{
  hk(hi paramhi) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (hi.a(this.a) != null) {
      hi.a(this.a).a(paramInt, (String)paramAdapterView.getAdapter().getItem(paramInt));
    }
    hi.b(this.a).dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */